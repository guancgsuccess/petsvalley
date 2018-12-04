package com.petsvalley.WebSocket;
import com.google.gson.Gson;
import com.petsvalley.entity.Customer;
import com.petsvalley.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ServerEndPoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端，
 * 注解的值将被用于监听用户连接的终端访问URL地址，客户端可以通过这个URL连接到websocket服务器端
 */
@Component
@ServerEndpoint("/websocket")

public class WebSockTest {

    private static int onlineCount=0;
    private  static Map<String, Session> map=new HashMap<String, Session>();
    private static CopyOnWriteArrayList<WebSockTest> webSocketSet=new CopyOnWriteArrayList<WebSockTest>();
    private Session session;
    private  static List<String> names=new ArrayList<String>();
    private String custId;
    private Gson gson=new Gson();


    @OnOpen
    public void onOpen(Session session){

        this.session=session;
        webSocketSet.add(this);//加入set中
        String queryString = session.getQueryString();
        //截取=后面的参数信息(用户名)，将参数信息赋值给全局的用户名
        String custId = queryString.substring(queryString.indexOf("=")+1);

        this.custId=custId;
        System.out.println("用户"+custId+"加入连接");
        if (!map.containsKey(custId)){
            this.map.put(custId,session);
            addOnlineCount();
        }
        else {
            this.map.remove(custId);
            this.map.put(custId,session);
        }
        System.out.println("有新连接加入！当前在线人数为"+getOnlineCount());
    }

    @OnClose
    public void onClose(){
        //webSocketSet.remove(this);
        map.remove(custId);
        subOnlineCount();
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    @OnMessage
    public void onMessage(String message,Session session) throws IOException {
        CustomerServiceImpl customerService= (CustomerServiceImpl)SpringContextHolder.getBean("customerServiceImpl");
        System.out.println("来自客户端的消息："+message);
        ContentVo vo = gson.fromJson(message, ContentVo.class);
        if (vo.getType()==1){
            int custId = Integer.parseInt(this.custId);
            System.out.println(custId);
            Customer customer = customerService.queryById(custId);
            Message msg = new Message();
            msg.setSendMsg(vo.getMsg());
            msg.setAlert(vo.getTo());
            msg.setFrom(customer.getCustName());
            msg.setDate(new Date().toLocaleString());
            /*for (WebSockTest item:webSocketSet){
                System.out.println("发送消息中");
                try {
                    item.sendMessage(gson.toJson(msg));
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }
            }*/
            for (Session session1:map.values()){
                session1.getBasicRemote().sendText(gson.toJson(msg));
            }
        }
        else {
            Integer toCustId=Integer.parseInt(vo.getTo());
            Customer toCustomer=customerService.queryById(toCustId);
            if (map.containsKey(vo.getTo())) {

                Session to_session = this.map.get(vo.getTo());
                //如果是单聊，就将消息发送给对方
                int custId = Integer.parseInt(this.custId);
                Customer customer = customerService.queryById(custId);
                Message msg = new Message();
                msg.setSendMsg(vo.getMsg());
                msg.setAlert(vo.getTo());
                msg.setFrom(customer.getCustName());
                msg.setDate(new Date().toLocaleString());
                if (to_session.isOpen()) {

                    to_session.getBasicRemote().sendText(gson.toJson(msg));
                } else {
                    String error = toCustomer.getCustName() + "暂不在线,请稍后再联系";
                    Message msg1 = new Message();
                    msg1.setSendMsg(error);
                    msg1.setFrom("系统消息");
                    msg1.setDate(new Date().toLocaleString());
                    this.session.getBasicRemote().sendText(gson.toJson(msg1));
                }
            } else {
                String error = toCustomer.getCustName() + "暂不在线,请稍后再联系";
                Message msg = new Message();
                msg.setSendMsg(error);
                msg.setFrom("系统消息");
                msg.setDate(new Date().toLocaleString());
                this.session.getBasicRemote().sendText(gson.toJson(msg));

            }
        }
//        群发消息
        /*for (WebSockTest item:webSocketSet){
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }*/
    }

    @OnError
    public void onError(Session session,Throwable throwable){
        System.out.println("发生错误！");
        throwable.printStackTrace();
    }
    //   下面是自定义的一些方法
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized int getOnlineCount(){
        return onlineCount;
    }
    public static synchronized void addOnlineCount(){
        WebSockTest.onlineCount++;
    }
    public static synchronized void subOnlineCount(){
        WebSockTest.onlineCount--;
    }
}


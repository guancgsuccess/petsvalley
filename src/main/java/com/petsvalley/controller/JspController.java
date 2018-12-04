package com.petsvalley.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping
public class JspController {

    @RequestMapping("login")
    public String login(){
        return "index";
    }

    @RequestMapping("index")
    public String login1(){
        return "index";
    }

    @RequestMapping("register")
    public String register(){
        return "userjsp/register";
    }

    @RequestMapping("image")
    public String image(){
        return "layoutjsp/image";
    }

    @RequestMapping("logout")
    public String vi(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute( "customer" );
        request.getSession().removeAttribute( "errormsg" );
        response.sendRedirect("/index");
        return "index";
    }

    @RequestMapping("about")
    public String about(){
        return "model/about";
    }

    @RequestMapping("blog")
    public String blog(){
        return "model/blog";
    }

    @RequestMapping("blog2")
    public String blog2(){
        return "model/blog2";
    }

    @RequestMapping("contactus")
    public String contactUs(){
        return "model/contactus";
    }

    @RequestMapping("photo1")
    public String photo1(){
        return "model/photo1";
    }

    @RequestMapping("service")
    public String service(){
        return "model/service";
    }

    @RequestMapping("model")
    public String model(){
        return "model";
    }

    //by 荀传跃
    @RequestMapping("post")
    public String post(){
        return "forum/post";
    }
    @RequestMapping("post_details")
    public String details() {
        return "forum/post_details";
    }
    @RequestMapping("system_post")
    public String systemPost() {
        return "forum/system_post";
    }

    //by 华荣晟
    @RequestMapping("cs_find_pets")
    public String csFindPets(){
        return "communityservice/find_pet/find_pets";
    }

    @RequestMapping("cs_release_find_pet")
    public String csReleaseFindPets(){
        return "communityservice/find_pet/release_find_pet";
    }

    @RequestMapping("cs_find_pet_info")
    public String csFindPetInfo(){
        return "communityservice/find_pet/find_pet_info";
    }

    @RequestMapping("cs_volunteer_service")
    public String csVolunteerService(){
        return "communityservice/volunteerservice/volunteer_service";
    }

    @RequestMapping("cs_foster")
    public String csFoster(){
        return "communityservice/foster/foster";
    }

    @RequestMapping("cs_foster_info")
    public String csFosterInfo(){
        return "communityservice/foster/foster_info";
    }

    @RequestMapping("cs_release_foster")
    public String csReleaseFoster(){
        return "communityservice/foster/release_foster";
    }

    @RequestMapping("demo")
    public String demo(){
        return "demo";
    }

    @RequestMapping("not_logged")
    public String notLogged(){
        return "not_logged";
    }

    @RequestMapping("cs_my_find_pet")
    public String csMyFindPet(){
        return "communityservice/find_pet/my_find_pet";
    }

    @RequestMapping("cs_update_find_pet")
    public String csUpdateFindPet(){
        return "communityservice/find_pet/update_find_pet";
    }

    @RequestMapping("cs_claim")
    public String csClaim(){
        return "communityservice/claim/claim";
    }

    @RequestMapping("cs_claim_info")
    public String csClaimInfo(){
        return "communityservice/claim/claim_info";
    }

    @RequestMapping("cs_update_claim")
    public String csUpdateClaim(){
        return "communityservice/claim/update_claim";
    }

    @RequestMapping("cs_release_claim")
    public String csReleaseClaim(){
        return "communityservice/claim/release_claim";
    }

    @RequestMapping("cs_my_claim")
    public String csMyClaim(){
        return "communityservice/claim/my_claim";
    }

    @RequestMapping("map")
    public String map(){
        return "map/map";
    }

    @RequestMapping("nearby_hospital")
    public String nearbyHospital(){
        return "nearby/nearby_hospital";
    }

    @RequestMapping("nearby_pet_shop")
    public String nearbyPetShop(){
        return "nearby/nearby_pet_shop";
    }

    @RequestMapping("permission")
    public String permission(){
        return "permission";
    }

    @RequestMapping("errorPage/404")
    public String errorPage404(){
        return "errr";
    }

    //by 孟继升
    @RequestMapping("userInfo")
    public String userInfo(HttpServletRequest request){
            return "userjsp/userInfo";
    }
    @RequestMapping("message")
    public String message(HttpServletRequest request){
        return "userjsp/message";
    }
    @RequestMapping("appeal")
    public String appeal(HttpServletRequest request){
        return "userjsp/appeal";
    }
    @RequestMapping("apply")
    public String apply(HttpServletRequest request){
        return "userjsp/apply";
    }
    @RequestMapping("match")
    public String match(HttpServletRequest request){
        return "userjsp/match";
    }
    @RequestMapping("mypets")
    public String myPets(HttpServletRequest request){
        return "userjsp/mypets";
    }
    @RequestMapping("physical")
    public String physical(HttpServletRequest request){
        return "userjsp/physical";
    }
    @RequestMapping("punishment")
    public String punishment(HttpServletRequest request){
        return "userjsp/punishment";
    }
    @RequestMapping("seedoctor")
    public String seeDoctor(HttpServletRequest request){
        return "userjsp/seedoctor";
    }
    @RequestMapping("service2")
    public String service(HttpServletRequest request){
        return "userjsp/service";
    }
    @RequestMapping("vaccine")
    public String vaccine(HttpServletRequest request){
        return "userjsp/vaccine";
    }
    @RequestMapping("myposts")
    public String myPosts(HttpServletRequest request){
        return "userjsp/myposts";
    }
    @RequestMapping("foster")
    public String foster(HttpServletRequest request){
        return "userjsp/foster";
    }
    @RequestMapping("claim")
    public String claim(HttpServletRequest request){
        return "userjsp/cliam";
    }
    @RequestMapping("findPet")
    public String findPet(HttpServletRequest request){
        return "userjsp/findpet";
    }
    @RequestMapping("strategy")
    public String strategy(HttpServletRequest request){
        return "userjsp/strategy";
    }
    @RequestMapping("system")
    public String system(HttpServletRequest request){
        return "systemjsp/apply";
    }
    @RequestMapping("appealmanage")
    public String appealManage(HttpServletRequest request){
        return "systemjsp/appeal";
    }
    @RequestMapping("customer")
    public String customer(HttpServletRequest request){
        return "systemjsp/customer";
    }
    @RequestMapping("postmanage")
    public String postManage(HttpServletRequest request){
        return "systemjsp/myposts";
    }
    @RequestMapping("petmanage")
    public String petManage(HttpServletRequest request){
        return "systemjsp/mypets";
    }
    @RequestMapping("physicalmanage")
    public String physicalManage(HttpServletRequest request){
        return "systemjsp/physical";
    }
    @RequestMapping("servicemanage")
    public String serviceManage(HttpServletRequest request){
        return "systemjsp/service";
    }
    @RequestMapping("punishmentmanage")
    public String punishmentManage(HttpServletRequest request){
        return "systemjsp/punishment";
    }
    @RequestMapping("vaccinemanage")
    public String vaccineManage(HttpServletRequest request){
        return "systemjsp/vaccine";
    }
    @RequestMapping("messagemanage")
    public String messageManage(HttpServletRequest request){
        return "systemjsp/message";
    }
}
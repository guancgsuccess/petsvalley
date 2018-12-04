package com.petsvalley.util;

import java.util.Date;
import java.util.Random;

public class RandomNameUtil {

    public static String getRandomFileName() {

        Date date = new Date();

        String str = Long.toString(date.getTime());

        Random random = new Random();

        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数

        return rannum + str;// 当前时间
    }
}

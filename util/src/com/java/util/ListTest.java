package com.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口的对象,元素为String类型
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("java");
        list.add("HTML");
        list.add("高数");


        list.add("高数");
        //用util的Random类随机产生一个[0，list.size()-1]的随机整数
        int length = list.size();
        System.out.println(length);
        Random random = new Random();
        int index = random.nextInt(length);
        System.out.println(index);
        //取出List中索引为index的元素
        System.out.println(list.get(index));
        System.out.println("*******************");
        //用for循环输出所有的list元素i
        for (int i = 0;i<length;i++){
            System.out.println(list.get(i));
        }
    }
}

package com.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 实现Comparable接口的School，放入List进行按班级排序
 * @author 张攀华
 * 2019.3.20
 */
public class SchoolList {
    public static void main(String[] args) {
        //创建List对象，存入School对象
        List<School> list = new ArrayList<>();
        list.add(new School("机电",1861));
        list.add(new School("建设",1832));
        list.add(new School("软件",1841));
        //调用Collections的sort方法，会自动调用之前compareTo的方法进行排序
        Collections.sort(list);
        //用foreach循环遍历list
        for (School school:list) {
            System.out.println("专业：" + school.getMajor() + ",年级：" + school.getGrade());
        }
    }
}

package com.java.util;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1,"张攀华"));
        list1.add(new Student(2,"侯粤嘉"));
        list1.add(new Student(3,"许源"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(4,"姚思佳"));
        list2.add(new Student(5,"亢悦昕"));
        Map<String,List<Student>> map = new HashMap<>();
        map.put("男生",list1);
        map.put("女生",list2);
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        System.out.println("*****按性别输出的结果*****");
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            Iterator<Student> iterator1 = entry.getValue().iterator();
            while (iterator1.hasNext()){
                System.out.println(iterator1.next());
            }
        }
    }
}


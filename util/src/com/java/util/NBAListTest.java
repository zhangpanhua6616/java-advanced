package com.java.util;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NBAListTest {
    public static void main(String[] args) {
        List<NBA> nbaList = new ArrayList<>();
        nbaList.add(new NBA("乔丹 ","飞人/神  ",30.1,6.3,5.3));
        nbaList.add(new NBA("拉塞尔","指环王  ",28.1,2.3,4.5));
        nbaList.add(new NBA("贾巴尔","天钩    ",32.1,3.7,2.9));
        nbaList.add(new NBA("张伯伦","篮球皇帝",25.1,6.3,5.3));
        System.out.println("------------NBA巨星------------");
        System.out.println("球员      绰号          得分      篮板      助攻");
        int length = nbaList.size();
        for (int i =0;i<length;i++){
            System.out.print(nbaList.get(i).getQiuyuan() + "    "+nbaList.get(i).getChuohao() +"      "+nbaList.get(i).getDefen()+"      "
                    +nbaList.get(i).getLanban()+ "       "+nbaList.get(i).getZhugong());
            System.out.println();
        }


        System.out.println("用Iterator迭代器输出结果");
        Iterator<NBA> iterator = nbaList.iterator();
        while (iterator.hasNext()){
            NBA nba = iterator.next();
            System.out.println(nba.getQiuyuan()+" " +nba.getChuohao());
        }
        System.out.println("Lambda表达式输出结果");
        nbaList.forEach(nba -> System.out.println(nba.getQiuyuan()+" " + nba.getChuohao()));
    }
}

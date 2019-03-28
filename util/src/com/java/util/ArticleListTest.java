package com.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException {
        List<Article> articleList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        articleList.add(new Article(1, "茶馆茶馆茶馆茶馆茶馆茶馆", "   老舍  ", simpleDateFormat.parse("2019-03-17 12:08:34")));
        articleList.add(new Article(2, "茶馆茶馆茶馆茶馆茶馆茶馆", "   老舍  ", simpleDateFormat.parse("2019-03-18 12:08:34")));
        articleList.add(new Article(3, "茶馆茶馆茶馆茶馆茶馆茶馆", "   老舍  ", simpleDateFormat.parse("2019-03-18 22:22:34")));
        System.out.println("id   标题                   作者    时间 ");
        Iterator<Article> iterator = articleList.iterator();
        while (iterator.hasNext()) {
            Article article = iterator.next();
            String result = DateDifferent(simpleDateFormat.format(article.getWriteTime()));
            System.out.println(article.getId() + " " + article.getTitle().substring(0, 10) + "..." + article.getAuthor() + " " + result);
        }
    }

    private static String DateDifferent(String time){
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1;
            long diff = 0;
            try {
                d1 = format.parse(time);
                Date now = new Date();
                diff = now.getTime() - d1.getTime();
            }catch (ParseException e){
                e.printStackTrace();
            }
            long seconds = diff/1000;
            long minutes = seconds/60;
            long hours = minutes/60;
            long days = hours/24;
            if (seconds < 60){
                return "刚刚";
            }else if(minutes < 60){
                return minutes + "分钟前";
            }else if (hours < 24){
                return hours + "小时前";
            }else{
                return days + "天前";
        }
    }
}


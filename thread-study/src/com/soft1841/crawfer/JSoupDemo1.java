package com.soft1841.crawfer;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * JSoup爬虫练习1
 * 2019.4.18
 */
public class JSoupDemo1 {
    public static void main(String[] args) throws Exception{
        //1.指定目标页面链接
        String url = "https://ai.taobao.com/?pid=mm_121122127_40670994_211772046\n";
        //2.建立与目标页面的链接
        Connection connection = Jsoup.connect(url);
        //3.解析目标页面
        Document document = connection.get();
        //4.获取页面中所有的class为collection-article-intro的元素，本例在页面中可以检查元素，是div
        Elements elements = document.getElementsByClass("chanel-container");
        System.out.println(elements.size());
        for (Element element : elements){
            //取出div的子元素
            Element link = element.child(0).child(0);
            //得到标记的文字内容
            String titleString = link.text();
            System.out.println(titleString);
        }
    }
}

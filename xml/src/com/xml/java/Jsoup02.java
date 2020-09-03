package com.xml.java;
/*
 * Document对象：
 *   获取Element对象：
 *       getElementById(String id)
 *       getElementsByTag(String tagName)
 *       getElementsByAttribute(String key)
 *       getElementsByAttributeValue(String key,String value)
 * Element对象：
 *   获取子元素对象：
 *       getElementById(String id)
 *       getElementsByTag(String tagName)
 *       getElementsByAttribute(String key)
 *       getElementsByAttributeValue(String key,String value)
 *   获取属性值：
 *        attr(String key)
 *   获取文本：
 *        text()
 *        html()
 * */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup02 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup02.class.getClassLoader().getResource("user.xml").getPath();
        Document doc = Jsoup.parse(new File(path),"utf-8");
        Element ele = doc.getElementsByTag("student").get(0);
        String number = ele.attr("number");
        System.out.println(number);
        Elements name = ele.getElementsByTag("name");
        String text = name.text();
        System.out.println(text);
        String html = name.html();
        System.out.println(html);
        String html1 = ele.html();
        System.out.println(html1);
    }
}

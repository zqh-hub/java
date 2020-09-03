package com.xml.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/*
 * 步骤：
 *   1、导入jar包
 *   2、获取Document对象
 *   3、获取对应的标签Element对象
 *   4、获取数据
 *
 *  获取属性值:
 *      String attr(String key)
 *
 *
 * */
public class Jsoup01 {
    @Test
    public void test01() throws IOException {
        // 获取xml路径
        String path = Jsoup01.class.getClassLoader().getResource("user.xml").getPath();
        // 获取Document对象
        Document doc = Jsoup.parse(new File(path), "utf-8");
        Elements names = doc.getElementsByTag("name");
        System.out.println(names.size());
        /*Element ele = names.get(1);
        String text = ele.text();
        System.out.println(text);*/
    }
}

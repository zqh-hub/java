package com.xml.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
* 选择器
* */
public class Jsoup03 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup03.class.getClassLoader().getResource("user.xml").getPath();
        Document doc = Jsoup.parse(new File(path), "utf-8");
        Elements name = doc.select("name");

    }
}

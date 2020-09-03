package com.xml.java;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class Jsoup04 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = Jsoup04.class.getClassLoader().getResource("").getPath();
        Document doc = Jsoup.parse(new File(path), "utf-8");
        // 创建JXDocument对象
        JXDocument jx = new JXDocument(doc);
        jx.selN("");
    }
}

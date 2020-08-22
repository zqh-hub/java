package com.map.java;

import org.junit.Test;

import java.util.HashMap;

/*
 * |---Map:双列数据，存储key-value的数据
 *     |---HashMap:作为Map的主要实现类；线程不安全，效率高；可存储为null的key或者value
 *         |---LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
 *     |---TreeMap:保证按照添加的key-value对进行排序，实现排序（根据key）
 *     |---HashTable:作为古老实现类；线程安全，效率低；不可存储为null的key或者value
 *        |---Properties:常用来处理配置文件，key和value都是String
 *
 * 2、Map结构的理解：
 *      > key:无序的、不可重复的，使用Set存储（元素要重写hashCode(),equals()）
 *      > value:无序、可重复，使用Collection存储(元素要重写equals())
 *      > Entry：一个键值对，构成一个Entry对象；无序的、不可重复的，使用Set存储
 * 3、HashMap源码分析：
 *  |---1.7jdk
 *      HashMap map = new HashMap();
 *      在实例化以后，底层创建了一个长度是16的一维数组Entry[] table.
 *      map.put(key,value)
 *          首先，调用key所在类的hashCode()方法，计算key的hash值，哈希值经过某种计算，
 *      得到在Entry数组的存放位置。
 *          > 如果此位置上的数据为空，此时key-value添加成功
 *          > 如果此位置上不为空（存在一个或多个数据），将key的hash值与已经存在的key的hash值进行比较
 *              > 如果hash值不同，添加成功
 *              > 如果与已经存在某个key的hash值相同，调用key的equals()，与已经存在的key进行比较
 *                  > 如果返回false,添加成功
 *                  > 如果返回true,使用value替换与key相同的已经存在的数据
 *      不断的添加中，会设计到扩容，默认扩容原来的2倍，并将原来的数据复制过来
 *  |---1.8jdk
 *      HashMap map = new HashMap();
 *      1、new HashMap()底层并没创建任何东西
 *      2、首次调用put()方法时，底层创建长度为16的数组Node[]
 *      3、jdk1.7底层结构只有：数组+链表，jdk1.8中底层结构：数据+链表+红黑树；当某一位置上以链表存在的
 *          数据个数>8,长度>64,就将该位置上的数据改为红黑树存储
 *
 *
 * */
public class MapTest01 {
    @Test
    public void test() {
        HashMap<Object, Object> obj = new HashMap<>();
        obj.put("name", "co");
    }
}

package cn.qgs.java;

import java.util.HashMap;

/**
 * @author sun
 * @date 2019/3/27 - 21:54
 */
public class DebugTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name","sunjiawei");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);


    }
}

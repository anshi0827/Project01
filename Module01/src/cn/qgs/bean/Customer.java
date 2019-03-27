package cn.qgs.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Customer {
//测试测试测试
    public static void main(String[] args){
        //region Description
        System.out.println("HelloWorld!!");
        //endregion

        ArrayList list = new ArrayList();

    }



    public static void method01(){
        try {
            FileInputStream fis = new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

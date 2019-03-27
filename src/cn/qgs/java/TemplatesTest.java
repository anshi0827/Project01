package cn.qgs.java;

/**
 * @author sun
 * @date 2019/3/25 - 21:33
 */
public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println("args = [" + args + "]");

        System.out.println("TemplatesTest.main");

        System.out.println("args = " + args);

        int num = 10;
        System.out.println("num = " + num);

        System.out.println(num);

        System.out.println("args = [" + args + "]");

        String[] arr = new String[]{"zhangsan","lisi","wangwu"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }



    }


}


package TestBase1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanqi on 2018/6/7.
 */
public class Lambda{

    public static void Lambda1() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(13);
        list.add(10);
        list.forEach(n -> System.out.println(n));
    }

    public static void Lambda2() {
       Thread thread = new Thread(() -> {
            System.out.println("Lambda test");
       });
        thread.start();
    }




    public static void main(String args[]) {
        Lambda2();
    }
}

package TestBase1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanqi on 2018/6/7.
 */
public class test2 {

    public static void main(String args[]) {
        String payload = "aaa";
        Map<String,String> map = new HashMap<>();
        map.put("type","1");
        map.put("contact",payload);
        String aaa = JsonMapper.getInstance().toJson(map);
        System.out.print(aaa);
    }

}

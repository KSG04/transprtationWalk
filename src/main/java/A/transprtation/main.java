package A.transprtation;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.*;

public class main {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:A.transportation/app.xml");

        transprtationWalk transprtationWalk = ctx.getBean("walk", transprtationWalk.class);
        transprtationWalk.move();
        ctx.close();

        Map<String, Object> map = new HashMap<String, Object>();
        String[] strArr = new String[]{"가", "나", "다", "라"};
        map.put("a", strArr);
        map.put("b", "aaa");
        map.put("c", 1234);
        map.put("d", new ArrayList<String>());
        System.out.println("a: " + map.get("a").getClass());
        System.out.println("b: " + map.get("b").getClass());
        System.out.println("c: " + map.get("c").getClass());
        System.out.println("d: " + map.get("d").getClass());
        if(map.get("a") instanceof String[]) {
            System.out.println("배열");
            String[] strAtt = (String[])map.get("a");
            System.out.println(Arrays.toString(strAtt));
        }
        if(map.get("b") instanceof String) {
            System.out.println("문자열");
        }
        if(map.get("c") instanceof Integer) {
            System.out.println("숫자");
        }
        if(map.get("d") instanceof ArrayList) {
            System.out.println("리스트");
        }



    }
}

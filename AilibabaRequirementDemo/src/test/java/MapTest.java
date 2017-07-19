import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public class MapTest {
    static Map<String, Integer> maps = new HashMap<>();
    static {
        maps.put("one",1);
        maps.put("two", 2);
        maps.put("three", 3);
    }

    /**
     * 遍历
     */
    @Test
    public void test() {
        for (Map.Entry<String, Integer> stringIntegerEntry : maps.entrySet()) {
            System.out.println(stringIntegerEntry.getKey());
        }

//        竟然有这种用法,神奇
        maps.forEach((s, integer) ->{
                    System.out.println(s + integer);
                }
        );
     //需注意,如果循环中修改add或remove 此map了,仍然要用迭代器
    }
    /**
     * 不存在返回一个值
     */
    public void test2(){
//        jdk1.8之前  不存在 返回 一个值
        Integer ch = maps.get("en");
        if(ch == null) {
            ch = -1;
        }
        System.out.println(ch);
//        jdk1.8之后
        int ch2=maps.getOrDefault("123",-1);
        System.out.println(ch2);
    }

    /**
     * 不存在,添加值
     */
    @Test
    public void test3(){
        Integer v = maps.get("123");
        if(v == null) {
            v = maps.put("123", 123);
        }
//       maps.putIfAbsent("123", 123);
        maps.forEach((s, integer) ->{
                    System.out.println(s + "    "+integer);
                }
        );

    }
}

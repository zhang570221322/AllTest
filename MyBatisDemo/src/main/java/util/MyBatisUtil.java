package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;


import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2017/7/16.
 */
public class MyBatisUtil {
    private static   SqlSessionFactory sqlSessionFactory;
     static{
         String resource = "mybatis-config.xml";

         Reader reader = null;
         try {
             reader = Resources.getResourceAsReader(resource);
         } catch (IOException e) {
             e.printStackTrace();
         }
//         System.out.print(reader);
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
     }
   public static SqlSession getsqlSession(){
    return  sqlSessionFactory.openSession(ExecutorType.REUSE);
   }
   public  static void colsesqlSession(SqlSession s){
       s.close();
   }
}

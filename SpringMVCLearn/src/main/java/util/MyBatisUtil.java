package util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2017/7/16.
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
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
       SqlSession session = sqlSessionFactory.openSession(ExecutorType.REUSE);
       Configuration configuration = session.getConfiguration(); //反射得到configuration ,然后
       configuration.setSafeResultHandlerEnabled(false); // 设置为false
       return  session;
   }
   public  static void colsesqlSession(SqlSession s){
       s.close();
   }
}

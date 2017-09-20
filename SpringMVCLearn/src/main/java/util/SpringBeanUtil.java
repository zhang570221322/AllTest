package util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zwl on 2017/7/18.
 * May god bless me
 */
public class SpringBeanUtil {
    static ApplicationContext  context=null;
   static {
     context = new ClassPathXmlApplicationContext(
               new String[] { "applicationContext.xml" });
   }
   public  static Object getBean(String beanName){
      return context.getBean(beanName);
   }

}

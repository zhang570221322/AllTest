import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import dao.StudentMapper;
import model.New;
import model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by zwl on 2017/9/15.
 * May god bless me
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MainTest {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void getNews(){
        String s = Main.sendGet("http://it.newcapec.cn:8081/sys/system/query/newQueryCheck.do?bh=2bXGXT&whereSqlJson=&treeWhereJson=%5B%7B%22node_id%22%3A%22XYMC%7C%22%2C%22node_text%22%3A%22%E5%AD%A6%E9%99%A2%22%7D%5D&userName=201577G0650&cdbh=04LXGXT&userDept=77&xtbz=XGXT&jsbh=&_search=false&nd=1505453372733&limit=1&start=1&sidx=&sord=asc");
        Map<String, String> map = JSONObject.parseObject(s, new TypeReference<Map<String, String>>(){});
        String s2=map.get("data");
        List<Student>  list2=JSONObject.parseArray(s2,Student.class);
        try{
            list2.forEach(student -> {
                System.out.println(student.getXm());

            });
        }catch(Exception e){

        }





    }


}

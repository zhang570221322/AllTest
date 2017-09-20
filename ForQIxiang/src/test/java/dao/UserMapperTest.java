package dao;

import model.Info;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MyBatisUtil;

import java.util.List;

/**
 * Created by zwl on 2017/9/6.
 * May god bless me
 */
public class UserMapperTest {
        private SqlSession session;
     UserMapper userMapper;

    @Before
    public void before() {
        session = MyBatisUtil.getsqlSession();
//        System.out.println(session+"         -------------------");
        userMapper =session.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        session.commit();
        MyBatisUtil.colsesqlSession(session);
    }
    @Test
    public void insetTest(){
        User u=new User();
        u.setUsername("zhang123");
        u.setPassword("test");
        u.setPhone("15638520435");
        userMapper.insert(u);
    }

    @Test
    public void updateTest(){
        User u=new User();
        u.setId(3);
        u.setUsername("test");
        u.setPassword("test");
        u.setPhone("15638520435");
        userMapper.update(u);
    }
    @Test
    public void  update2Test(){
        Info<User> info=new Info();
        info.setWhereCondition("id in (1,2,3)");
        User u=new User();
        u.setUsername("test");
        u.setPassword("test");
        u.setPhone("15638520435");
        u.setAdmin((byte) 1);
        u.setFrozen((byte) 1);
        info.setT(u);
        userMapper.update2(info);
    }
    @Test
    public void getTest(){
        User u=new User();
        u.setUsername("test");
        u.setPassword("test");
        u.setPhone("15638520435");
        User user = userMapper.get(u);
        System.out.println(user.getId());
    }

    @Test
    public void listTest(){
        Info<User> info=new Info();
        info.setWhereCondition("id in (1,2,3)");
        List<User> list = userMapper.list(info);
        list.stream().forEach(user ->{
            System.out.println(user.getId());
        } );

    }
}

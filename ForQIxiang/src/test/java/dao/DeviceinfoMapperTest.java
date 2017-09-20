package dao;

import com.github.pagehelper.PageHelper;
//import model.Deviceinfo;
//import model.DeviceinfoExample;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MyBatisUtil;

import java.util.Date;
import java.util.List;

/**
 *
 * dao层单元测试，也是Demo用法。
 * 类名是每个实体类的daoTest
 * 方法名是每个实体的dao的一个方法的测试
 *
 *  Deviceinof是一个数据传输对象
 *  Deviceinof是查询条件对象
 *   PageHelper  分页对象
 *  Page
 * Created by zwl on 2017/8/11.
 * May god bless me
 */
public class DeviceinfoMapperTest {

//    private SqlSession session;
//    DeviceinfoMapper deviceinfoMapper;
//
//    @Before
//    public void before() {
//        session = MyBatisUtil.getsqlSession();
////        System.out.println(session+"         -------------------");
//        deviceinfoMapper =session.getMapper(DeviceinfoMapper.class);
//    }
//    @After
//    public void after(){
//        session.commit();
//        MyBatisUtil.colsesqlSession(session);
//    }
//
//    /**
//     *  出现了一个问题
//     *  com.microsoft.sqlserver.jdbc.SQLServerException: 将截断字符串或二进制数据。
//     *  断点查询后是  字段stationnum的 问题，数据量不能太大，（那为什么不设置成整数型呢？）
//     *   更改插入stationNum为1后插入成功
//     *   直接使用构造函数，也可以new 一个空对象，慢慢set值
//     *    来测试插入，插入没有问题
//     */
//    @Test
//    public void testInsert(){
//        Deviceinfo deviceinfo=new Deviceinfo("1",new Date(),1,"1","1","1");
//        deviceinfoMapper.insert(deviceinfo);
//    }
//
//    /**
//     * deviceinfoExample 是一个查询辅助类，用来筛选查询，底层是where，封装了Criteria，筛选条件
//     */
//    @Test
//    public void testSelectByExample(){
//        DeviceinfoExample deviceinfoExample=new DeviceinfoExample();
//        deviceinfoExample.setDistinct(false); // 设置是否重复  仅仅有主键才行，数据库貌似没主键
//        //条件查询举例
//        DeviceinfoExample.Criteria criteria = deviceinfoExample.or();
//        criteria.andStationnameLike("%testte%"); //查询 stationName like %testte%  的数据信息
//        criteria.andDurationtimeBetween(0,3);  //查询Durationtime在0 和3 之间的 （不用的数据库边界不一样，（因为Mybatis隔离的数据库），使用时需注意)
//        //生成语句为select stationname, errstarttime, durationtime, stationnum, city, county from deviceinfo WHERE ( stationname like ? and durationtime between ? and ? )
//          //方法很多 or == <>  in 等等， 不一一举例了。
//
//        deviceinfoExample.clear();// 清空查询条件
//        //order by语句
//        deviceinfoExample.setOrderByClause("stationname");//根据stationname  orderby
//        //生成语句为 select stationname, errstarttime, durationtime, stationnum, city, county from deviceinfo order by stationname
//
//        //分页查询  使用github上共享的pageHelper 来实现分页  物理分页，反射来改sql语句，并隔离不同数据库
//        PageHelper.startPage(1, 0); // 核心分页代码 如果 pageSize=0 ，则查询全部
//
//          //需要注意的是， 此分页只会分紧跟的第一个查询方法，后面的不会再分页， 除非再次调用
//        List<Deviceinfo> deviceinfoList = deviceinfoMapper.selectByExample(deviceinfoExample);
//        for (Deviceinfo deviceinfo : deviceinfoList) {
//            System.out.println(deviceinfo.getCity());
//        }
//
//
//    }
//    @Test
//    public void testUpdateByExampleSelective(){
////        先查询
//        testSelectAll();
//        Deviceinfo deviceinfo=new Deviceinfo("testUpdate22",new Date(),1,"1","1","1");
//        DeviceinfoExample deviceinfoExample=new DeviceinfoExample();
//        DeviceinfoExample.Criteria or = deviceinfoExample.or();
//        or.andStationnameEqualTo("testUpdate"); //查询条件
//        deviceinfoMapper.updateByExampleSelective(deviceinfo,deviceinfoExample);
//        testSelectAll();
//    }
//
//    /**
//     * 重写查询代码方便测试
//     */
//    private void testSelectAll(){
//        List<Deviceinfo> deviceinfoList = deviceinfoMapper.selectByExample(new DeviceinfoExample());//传空对象查询全部
//        for (Deviceinfo deviceinfo : deviceinfoList) {
//            System.out.println(deviceinfo.getStationname()+"    "+deviceinfo.getCity());
//        }
//    }
//    @Test
//    public  void testDeleteByExample(){
//        testSelectAll();
//        DeviceinfoExample deviceinfoExample=new DeviceinfoExample();
//        DeviceinfoExample.Criteria or = deviceinfoExample.or();
//        or.andStationnameLike("%testUpdate%"); //删除条件
//        deviceinfoMapper.deleteByExample(deviceinfoExample);
//        testSelectAll();
//    }

}


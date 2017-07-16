package dao;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/16.
 */
public interface BaseMapper<T> {
     int insert(T t );
     int deleteById(int id);
     int update(T t );
     T select(T t);
     T selectById(int id);
     LinkedList<T> selectAll();
}

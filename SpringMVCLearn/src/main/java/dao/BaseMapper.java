package dao;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/16.
 */
public interface BaseMapper<T> {
     int insert(T t);
     int deleteById(int id);
     int update(T t);
     T get(T t);
     T getById(int id);
     LinkedList<T> listAll();
}

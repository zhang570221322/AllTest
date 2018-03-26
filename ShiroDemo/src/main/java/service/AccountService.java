package service;

import dao.BaseDao;
import model.Permission;
import model.Role;
import model.User;
import model.UserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zwl on 2017/9/19.
 * May god bless me
 */
@Service
public class AccountService {
    // 公共的数据库访问接口
    // 这里省略BaseDao dao的编写
    @Resource(name = "baseDaoImpl")
    private BaseDao baseDao;
    /****
     * 通过用户名获取用户对象
     * @param username
     * @return
     */
    public User getUserByUserName(String username) {
        User user = (User) baseDao.findObjectByHQL("FROM User WHERE username = ?", new Object[] { username });
        return user;
    }

    /***
     * 通过用户名获取权限资源
     *
     * @param username
     * @return
     */
    public List<String> getPermissionsByUserName(String username) {

        User user = getUserByUserName(username);
        if (user == null) {
            return null;
        }
        List<String> list = new ArrayList<String>();

        for (UserRole userRole : user.getUserRoles()) {
            Role role = userRole.getRole();
            List<Permission> permissions = baseDao.findAllByHQL("FROM Permission WHERE roleId = ?", new Object[] { role.getId() });
            for (Permission p : permissions) {
                list.add(p.getUrl());
            }
        }
        return list;
    }


}

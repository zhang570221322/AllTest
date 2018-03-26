package shrio;

import model.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import service.AccountService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by zwl on 2017/9/21.
 * May god bless me
 */
public class SecondRealm extends AuthorizingRealm {
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /***
     * 获取授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
        //根据自己系统规则的需要编写获取授权信息，这里为了快速入门只获取了用户对应角色的资源url信息
        String username = (String) pc.fromRealm(getName()).iterator().next();
        if (username != null) {
            List<String> pers;
            pers = accountService.getPermissionsByUserName(username);
            if (pers != null && !pers.isEmpty()) {
                Set<String> roles=new HashSet<>();
                roles.add("user");
                for (String each : pers) {
                    roles.add(each);
                }
                return  new SimpleAuthorizationInfo(roles);
            }
        }
        return null;

    }
    /***
     * 获取认证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) at;
        // 通过表单接收的用户名
        String username = token.getUsername();
        if (username != null && !"".equals(username)) {
            User user = accountService.getUserByUserName(username);
            if (user != null) {
//            盐值加密
                ByteSource credentialsSalt =ByteSource.Util.bytes(username);
//            MD5盐值加密
                Object  password=new SimpleHash("SHA1",user.getPassword(),credentialsSalt,1024);

                return new SimpleAuthenticationInfo(user.getUsername(),password,credentialsSalt, getName());
            }
        }
        return null;
    }
}

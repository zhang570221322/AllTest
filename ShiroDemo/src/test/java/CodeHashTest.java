import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * Created by zwl on 2017/9/21.
 * May god bless me
 */
public class CodeHashTest {
    @Test
    public void testHashjiami() throws Exception {
        String hashAlgorithmName="MD5";
        Object credentials="123456";
        Object salt=null;
        int hashIterations=1024;
        Object  result=new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        System.out.println(result);
    }
}

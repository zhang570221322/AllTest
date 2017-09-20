
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

/**
 * Created by zwl on 2017/9/15.
 * May god bless me
 */

@RunWith(Parameterized.class)
public class ParameterizedTest {
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,"Zero"},{1,"One"},{2,"Two"},{3,"Three"},{4,"Four"}
        });
    }

    private int fInput;
    private String fExpected;

    public ParameterizedTest(int input,String expected){
        super();
        fInput=input;
        fExpected=expected;
    }

    @Test
    public void test(){
        System.out.println(fInput+":"+fExpected);
    }
}
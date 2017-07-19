import java.io.*;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public class NewTryTest {
    private static void customBufferStreamCopy(File source, File target) {
        try (InputStream fis = new FileInputStream(source);
             OutputStream fos = new FileOutputStream(target)){
            byte[] buf = new byte[8192];
            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void customBufferStreamCopy2(File source, File target) {
        InputStream fis = null;OutputStream fos = null;
        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(target);
            byte[] buf = new byte[8192];
            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();} finally {
            close(fis);close(fos);
        }
    }
    private static void close(Closeable closable) {
        if (closable != null) {
            try {
                closable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }}}
}

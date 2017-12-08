import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @uthor: tangjianhua
 * @ate: 2017/12/7.
 */
public class ProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/provider.xml"});
        context.start();
        System.in.read();
    }
}

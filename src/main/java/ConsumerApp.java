import dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @uthor: tangjianhua
 * @ate: 2017/12/7.
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}

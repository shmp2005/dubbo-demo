package dubbo.demo.service;

/**
 * @uthor: tangjianhua
 * @ate: 2017/12/7.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

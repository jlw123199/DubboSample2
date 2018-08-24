
package xl.com.dubboapp.consumer1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xl.com.dubboapp.api.IUserService;


public class UserServiceConsumer {

    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            //IUserService userService = (IUserService) ctx.getBean("userService");

            IUserService userService2 = (IUserService) ctx.getBean("userService2");

            while (true) {
//                logger.info("执行结果：" + userService.login("hello", "hello"));
//                logger.info("1-" + userService.Greeting("test"));

                logger.info("2-" + userService2.Greeting(" ThreadID:" + Thread.currentThread().getId() + " ThreadName:" + Thread.currentThread().getName()));

            }
        } catch (Exception ex) {
            logger.warn("--------" + ex.getMessage());
        }
    }
}

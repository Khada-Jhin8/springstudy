import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getConnect();
    }

    @Test
    public void demo01() {
        /* a%b = a-a/b*b */
        System.out.println(-10 % 3);
    }

    @Test
    public void demo02() {
        int i = 1;
        i = i++;
        System.out.println(i);
    }
}

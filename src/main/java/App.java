import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        boolean result = bean1 == bean2;
        System.out.println(result);

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getName());
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getName());

        boolean resultCat = catBean1 == catBean2;
        System.out.println(resultCat);
    }
}
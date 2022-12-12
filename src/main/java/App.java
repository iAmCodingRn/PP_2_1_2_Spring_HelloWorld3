import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


//вызываем еще раз бин HelloWorld
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
//дальше идет сравнение 2 пар бинов по ссылке
        System.out.println(bean == bean2);
        System.out.println(bean);
        System.out.println(bean2);
// 2жды вызываем бин cat
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        Cat bean2Cat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat == bean2Cat);


    }
}
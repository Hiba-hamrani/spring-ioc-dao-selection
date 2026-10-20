import config.AppConfig;
import metier.MetierMultiple;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMultiple {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MetierMultiple metier = context.getBean(MetierMultiple.class);

        System.out.println("DAO injectés : " + metier.getDaoMap().keySet());
        System.out.println("Somme : " + metier.calcul());

        context.close();
    }
}
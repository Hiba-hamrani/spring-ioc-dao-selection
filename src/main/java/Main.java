import config.AppConfig;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean("metierImpl", IMetier.class);        System.out.println("Résultat final : " + metier.calcul());

        context.close();
    }
}
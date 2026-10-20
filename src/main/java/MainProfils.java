import config.AppConfig;
import dao.IDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProfils {
    public static void main(String[] args) {
        // Le profil doit être activé AVANT le démarrage du conteneur
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(AppConfig.class);
        context.refresh();

        System.out.println("Profils actifs : "
                + String.join(", ", context.getEnvironment().getActiveProfiles()));
        System.out.println("Beans IDao : "
                + context.getBeansOfType(IDao.class).keySet());

        context.close();
    }
}
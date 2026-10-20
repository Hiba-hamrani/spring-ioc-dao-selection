package test;

import config.AppConfig;
import metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class OcpSelectionTest {

    @Test
    public void testDaoImplParDefaut() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean("metierImpl", IMetier.class);
        // dao.target=dao → 100.0 * 2 = 200.0
        assertEquals(200.0, metier.calcul(), 0.001);

        context.close();
    }
}
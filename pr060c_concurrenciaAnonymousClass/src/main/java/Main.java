
import com.javiermoreno.introduccion.concurrencia.CalculoComplejisimo;
import com.javiermoreno.introduccion.concurrencia.CalculoHiperComplejo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {

        final CalculoComplejisimo cc = new CalculoComplejisimo();
        Runnable runnerCC = new Runnable() {
            @Override
            public void run() {
                cc.ejecutar();
            }
        };
        Thread tCC = new Thread(runnerCC);
        tCC.start();

        final CalculoHiperComplejo ch = new CalculoHiperComplejo();
        new Thread(new Runnable() {
                        @Override
                        public void run() {
                            ch.calcular();
                        }
                    }).start();



    }
}

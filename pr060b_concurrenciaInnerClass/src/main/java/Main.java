
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

        class RunnerCalculoComplejisimo implements Runnable {

            @Override
            public void run() {
                cc.ejecutar();
            }
        }

        RunnerCalculoComplejisimo runnerCC = new RunnerCalculoComplejisimo();
        Thread tCC = new Thread(runnerCC);
        tCC.start();

        final CalculoHiperComplejo ch = new CalculoHiperComplejo();
        class RunnerCalculoHiperComplejo implements Runnable {
            @Override
            public void run() {
                ch.calcular();
            }
        }
        RunnerCalculoHiperComplejo runnerCH = new RunnerCalculoHiperComplejo();
        Thread tHC = new Thread(runnerCH);
        tHC.start();



    }
}

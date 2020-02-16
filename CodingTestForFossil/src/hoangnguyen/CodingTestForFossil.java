package hoangnguyen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang
 */
public class CodingTestForFossil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car toyota = new Car(100);
        Car bmw = new Car(200);

        Thread toyotaThread = new Thread(toyota);
        Thread bmwThread = new Thread(bmw);
        
        try {
            toyotaThread.start();
            toyotaThread.join();
            bmwThread.start();
            bmwThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CodingTestForFossil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

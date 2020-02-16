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
        Car toyota = new Toyota(100);
        Car bmw = new BMW(200);

        Thread toyotaThread = new Thread(toyota);
        Thread bmwThread = new Thread(bmw);
        
        toyotaThread.start();
        bmwThread.start();
    }
}

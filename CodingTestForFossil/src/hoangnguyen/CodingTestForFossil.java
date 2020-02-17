
package hoangnguyen;

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

        toyotaThread.start();
        bmwThread.start();
    }

}

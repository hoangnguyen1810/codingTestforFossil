package hoangnguyen;

/**
 *
 * @author Hoang
 */
public class BMW extends Car {

    public BMW(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            while (DefaultValues.LOCK != DefaultValues.BMW_RUNNING) {
                continue;
            }

            System.out.println(this.maxSpeed);
            DefaultValues.LOCK = DefaultValues.TOYOTA_RUNNING;
        }
    }
}

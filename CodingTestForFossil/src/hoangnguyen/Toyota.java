package hoangnguyen;

/**
 *
 * @author Hoang
 */
public class Toyota extends Car {

    public Toyota(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            while (DefaultValues.LOCK != DefaultValues.TOYOTA_RUNNING) {
                continue;
            }

            System.out.println(this.maxSpeed);
            DefaultValues.LOCK = DefaultValues.BMW_RUNNING;
        }
    }
}

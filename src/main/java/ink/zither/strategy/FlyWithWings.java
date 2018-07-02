package ink.zither.strategy;

import java.io.Flushable;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm Flying with wings");
    }
}

package ink.zither.strategy;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}

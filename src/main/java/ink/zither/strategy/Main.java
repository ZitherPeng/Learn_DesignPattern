package ink.zither.strategy;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class Main {
    public static void main(String[] args) {
        MiniDuckSimulator miniDuckSimulator = new MiniDuckSimulator();
        miniDuckSimulator.performFly();
        miniDuckSimulator.performQuack();
        miniDuckSimulator.setFlyBehavior(new FlyNoWay());
        miniDuckSimulator.performFly();
    }
}

package ink.zither.strategy;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class Duck {
    private FlyBehavior flyBehavior = new FlyWithWings();
    private QuackBehavior quackBehavior = new NomalQuack();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

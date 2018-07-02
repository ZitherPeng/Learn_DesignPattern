package ink.zither.strategy;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class NomalQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm quack now!");
    }
}

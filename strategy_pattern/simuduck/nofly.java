package strategy_pattern.simuduck;

public class nofly implements Flybehavior
{
    public void fly()
    {
        System.out.println("this cannot fly");
    }
}
package strategy_pattern.simuduck;

public class noquack implements Quackbehavior {
    public void quack()
    {
        System.out.println("this cannot quack");
    }
    
}

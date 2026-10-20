package strategy_pattern.simuduck;
public class mallardduck extends duck
{
    public mallardduck()
    {
        quackbeh = new canquack();
        flybeh = new canfly();
    }
    public void display()
    {
        System.out.println("this is a mallard duck");
    }
    
}

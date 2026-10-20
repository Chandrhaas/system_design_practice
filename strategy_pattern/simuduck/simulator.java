package strategy_pattern.simuduck;

public class simulator {
    public static void main()
    {
        duck mallard = new mallardduck();

        mallard.performFly();
        mallard.performquack();
        mallard.swim();
        mallard.setflybeh(new nofly());
        mallard.setquackbeh(new noquack());
        mallard.performFly();
        mallard.performquack();
    }
    
}

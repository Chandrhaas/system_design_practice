package strategy_pattern.simuduck;
public abstract class duck
{
    Flybehavior flybeh; // we are making reference objects of interfaces in the duck class
    Quackbehavior quackbeh; // duck has a fly and quack behavior, this is called composition

    public duck(){}
    
    public abstract void display(); // each type of duck displays it's type

    public void performFly()
    {
        flybeh.fly(); // fly function is inside the interface, there are a few classes which 
                        //extend the interface and they implement the different types of 
                        // fly behaviors let us say a duck class uses a specific algorithm of that interface 
                        // initializes the object with that specific implementation eg - flybeh = new canfly() so
                        // it will implement fly function of the canfly class. same for quacks and other behaviors 
    }

    public void performquack()
    {
        quackbeh.quack();
    }

    public void setflybeh(Flybehavior f)
    {
        flybeh =f;

    }

    public void setquackbeh(Quackbehavior q)
    {
        quackbeh = q;
    }

    public void swim()
    {
        System.out.println("all ducks swim");
    }

}
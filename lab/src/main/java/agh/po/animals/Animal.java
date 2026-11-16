package agh.po.animals;
public abstract class Animal
{
    protected String name;
    protected int legs;

    public Animal(String name, int legs)
    {
        this.name = name;
        this.legs = legs;
    }

    public String getName()
    {
        return name;
    }

    public int getLegs()
    {
        return legs;
    }
    public void makeSound()
    {
        System.out.println(name + " wydaje dźwięk.");
    }

    public abstract String getDescription();
}

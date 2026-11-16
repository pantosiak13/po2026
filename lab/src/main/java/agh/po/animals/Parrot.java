package agh.po.animals;

public class Parrot extends Animal
{

    public Parrot(String name)
    {
        super(name, 2);
    }

    public String getDescription()
    {
        return "papuga o imieniu " + name + " liczba nóg: " + legs;
    }

    public void makeSound()
    {
        System.out.println(name + ":kra kra!");
    }
}

package agh.po.animals;

public class Snake extends Animal
{

    public Snake(String name)
    {
        super(name, 0);
    }
    public String getDescription()
    {
        return "Wąż o imieniu " + name + ", liczba nóg: " + legs;
    }
    public void makeSound()
    {
        System.out.println(name + ": Ssssss");
    }
}
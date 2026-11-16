package agh.po.animals;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name, 4);
    }
    public String getDescription()
    {
        return "pies o imieniu " + name + " liczba nóg: " + legs;
    }
    public void makeSound()
    {
        System.out.println(name + ": Hau Hau!");
    }
}
package agh.po.zadania;
import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo
{
    private Animal[] animals = new Animal[100];

    public void fillZoo()
    {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++)
        {
            int choice = random.nextInt(3);
            if (choice == 0)
            {
                animals[i] = new Parrot("DzwoniPapuga");
            }
            else if (choice == 1)
            {
                animals[i] = new Dog("Miśka");
            }
            else
            {
                animals[i] = new Snake("WonszŻeczny");
            }
        }
    }

    public int getTotalLegs()
    {
        int totalLegs = 0;
        for (Animal animal : animals)
        {
                totalLegs = totalLegs + animal.getLegs();
        }
        return totalLegs;
    }
    public void inspectAnimals()
    {
        for (Animal animal : animals)
        {
                System.out.println(animal.getDescription());
                int legs = animal.getLegs();
                animal.makeSound();
        }
    }
    public static void main(String[] args)
    {
        Zoo zoo = new Zoo();
        zoo.fillZoo();

        System.out.println("Suma nóg: " + zoo.getTotalLegs());
        System.out.println("Szczegóły zwierząt");
        zoo.inspectAnimals();
    }
}
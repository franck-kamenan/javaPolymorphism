package be.intecbrussel.javaPolymorphism;

import be.intecbrussel.javaInheritance.MyCar;

public class MyMain
{
    public static void main(String[] args)
    {
        MyAnimal monAnimal = new MyAnimal();
        MyAnimal monCochon = new MyPig();
        MyAnimal monChien = new MyDog();
        monAnimal.animalSound();
        monCochon.animalSound();
        monChien.animalSound();
    }


}

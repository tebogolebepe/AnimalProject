import javafx.animation.ScaleTransition;

public class main {
public  static void  main(String[] arg){

Animal animal1 = new Animal();
animal1.Sound();

Dog dog1 = new Dog();
dog1.eat();
dog1.Sound();


Cat cat1 = new Cat();
cat1.eat();
cat1.Sound();


System.out.println(cat1.getName() + " eats");
System.out.println(cat1.sound());

System.out.println(dog1.getName()+ " eats");
System.out.println(dog1.sound());

Home home =new Home();
Dog dog2 = new Dog();
Dog dog3 = new Dog();
Cat cat = new Cat();

home.makeAllSound();
home.adoptPet(dog1);
home.makeAllSound();

home.adoptPet(cat);
home.makeAllSound();

home.adoptPet(dog2);
home.makeAllSound();

}
}

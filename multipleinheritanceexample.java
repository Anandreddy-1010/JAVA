public class multipleinheritanceexample {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.play();
        d.bark();
        d.eat();
    
    }
    
}
interface Animal{
    void eat();
}
interface Pet{
    void play();
}
class Dog implements Animal,Pet{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void play(){
        System.out.println("Dog is playing");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
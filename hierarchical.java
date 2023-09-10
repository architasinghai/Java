class Animal
{
    void eat(){
        System.out.println("grass");
    }

}
class dog extends Animal
{
    void bark(){
        System.out.println("on the street");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("home");
    }
}
class hierarchical
{
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        c.meow();
        d.bark();
        d.eat();
    }
}


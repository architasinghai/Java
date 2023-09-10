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
class cat extends dog{
    void meow(){
        System.out.println("home");
    }
}
class multilevel
{
    public static void main(String[] args) {
        //dog d=new dog();
        cat c=new cat();
        c.meow();
        c.bark();
        c.eat();
    }
}

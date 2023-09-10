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
class single
{
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
    }
}

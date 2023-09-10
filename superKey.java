class hobby
{
   String hobby="Sleeping";
}
class eat extends hobby
{
    String eat="pizza";
    {
        System.out.println(super.hobby);
    }
}
class sit extends eat
{
    String sit="couch";
    void display() {
        System.out.println(sit);
        System.out.println(super.eat);
    }
}

class superKey{
    public static void main(String[] args) {
        sit s = new sit();
        s.display();
    }
}
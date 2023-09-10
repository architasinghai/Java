class car 
{
    void race(){
        System.out.println("racing");
    }
}
class maruti extends car{
    void cost(){
        System.out.println("efficient");
    }
}
class runtime 
{
    public static void main(String[] args) {
        car c = new maruti();
        c.race();
    }
}
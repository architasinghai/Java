interface stud {
    void study();
}
interface maths {
    void add();
}

class english implements stud,maths
{
    public void study(){
        System.out.println("studing");
    }
    public void add(){
        System.out.println("adding");
    }
}

class multiple{
    public static void main(String[] args) {
        english e=new english();
        e.add();
        e.study();
    }
}
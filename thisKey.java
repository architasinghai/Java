class employee{
    int id;
    String name;
    float salary;

employee(int a,String b,float c){
    this.id=a;
    this.name=b;
    this.salary=c;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

class thisKey{
    public static void main(String[] args) {
        employee e= new employee(111,"Archita",40000);
        e.display();
    }
}

class EmpConsOver {
    String name;
    int number;    
    EmpConsOver(String name, int number) {
        this.name = name;
        this.number = number;
    }   
    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee no: " + number);
    }
}
class EmpTest {
    public static void main(String[] args) {
        EmpConsOver e1 = new EmpConsOver("Akil", 101);
        EmpConsOver e2 = new EmpConsOver("Arun", 102);
        EmpConsOver e3 = new EmpConsOver("Rajesh", 103);
        EmpConsOver e4 = new EmpConsOver("Vishal", 104);
        
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}

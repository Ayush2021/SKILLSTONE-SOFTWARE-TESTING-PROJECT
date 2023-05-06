class MethodReturn {
    public void displaySalary(double salary, double hra) {
        double vishalSalary = salary + hra;
        System.out.println("Vishal salary is " + vishalSalary);
    }
}
class Main {
    public static void main(String[] args) {
        MethodReturn obj = new MethodReturn();
        obj.displaySalary(20000, 2000);
    }
}
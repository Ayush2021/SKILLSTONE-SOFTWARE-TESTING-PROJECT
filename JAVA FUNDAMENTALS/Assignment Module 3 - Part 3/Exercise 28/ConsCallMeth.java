class ConsCallMeth {
    int a, b, sum;
    public ConsCallMeth(int a, int b) {
        this.a = a;
        this.b = b;
        add();
    }
    public void add() {
        sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
class Main {
    public static void main(String[] args) {
        ConsCallMeth obj = new ConsCallMeth(5, 6);
    }
}

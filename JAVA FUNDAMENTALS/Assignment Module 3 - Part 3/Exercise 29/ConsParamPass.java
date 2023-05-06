class ConsParamPass {
  int a, b;
  ConsParamPass(int a, int b) {
    this.a = a;
    this.b = b;
  }
  void add() {
    System.out.println(a + b);
  }
  void sub() {
    System.out.println(a - b);
  }
  public static void main(String[] args) {
    ConsParamPass obj = new ConsParamPass(4, 5);
    obj.add();
    obj.sub();
  }
}
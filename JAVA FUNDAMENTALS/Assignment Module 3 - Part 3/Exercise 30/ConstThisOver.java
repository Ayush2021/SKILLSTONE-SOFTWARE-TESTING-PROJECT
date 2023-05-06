class ConstThisOver {
  int eno;
  ConstThisOver() {
    this(0);
  }
  ConstThisOver(int eno) {
    this.eno = eno;
  }
  void display() {
    System.out.println(eno);
  }
  public static void main(String[] args) {
    ConstThisOver obj = new ConstThisOver(10011);
    obj.display();
  }
}
package net.q3zeljko.Observer.Example2;

public class Test {
  @org.junit.Test
  public void SimpleTest() {
    Person zeljko = new Person("zeljko");
    Person marko = new Person("marko");
    Person goran = new Person("goran");
    Product pen = new Product("Pen", 5, true);
    pen.addObserver(zeljko);
    pen.addObserver(goran);
    pen.addObserver(marko);
    pen.setAvailable(false);
    System.out.println();
    pen.setAvailable(false);
    System.out.println();
    pen.setPrice(22);
    System.out.println();
    pen.deleteObserver(zeljko);
    System.out.println();
    pen.setPrice(11);
  }
}

package net.q3zeljko.Observer.Example1;

public class Test {
  @org.junit.Test
  public void SimpleTest() {
    Person zeljko = new Person("zeljko");
    Person marko = new Person("marko");
    Person goran = new Person("goran");
    Product pen = new Product("Pen", 5, true);
    pen.registerObserver(zeljko);
    pen.registerObserver(goran);
    pen.registerObserver(marko);
    pen.setAvailable(false);
    System.out.println();
    pen.setAvailable(false);
    System.out.println();
    pen.setPrice(22);
    System.out.println();
    pen.removeObserver(zeljko);
    System.out.println();
    pen.setPrice(11);
  }
}

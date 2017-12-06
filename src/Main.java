public class Main {
  public static void main (String[] args) {
    IntCollection in = new IntCollection(50);

    in.insert(99);
    in.insert(1);
    in.insert(2);
    in.insert(9);
    in.insert(44);
    in.insert(44);

    if (in.isIn(99)) System.out.println("It's there.");
    if (!in.isIn(33)) System.out.println("It's not there.");
  }
}

public class IntCollection implements Operations {
  private int noOfItems;
  private int[] intArray;

  public IntCollection(int sz) {
    // Code for singular argument constructor
    intArray = new int[sz];
    noOfItems = 0;
  }

  public IntCollection() {
    // Code for no argument constructor, assume 100 items
    intArray = new int[100];
    noOfItems = 0;
  }

  public int getNoOfItems() {
    return noOfItems;
  }

  public boolean isIn(int val){
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] == val) {
        return true;
      }
    }
    return false;
  }

  public void insert(int val) {
    intArray[noOfItems] = val;
    noOfItems ++;
  }
}

package tsc.draft.collection;


public class ArraysTest {
  
  public void arraysTest() {
    Dog[] aDog1 = {new Dog("medor"), new Dog("rex")};
    Dog[] aDog2 = null;
    aDog2 = new Dog[]{new Dog("medor"), new Dog("rex")};
    Dog[] aDog3 = null;
    aDog3 = new Dog[3];
    
  }
  
  public void arraysTest2() {
	  Dog[] aDog1 = new Dog[]{new Dog("medor"), new Dog("rex")};
	  Dog[] aDog2 = null;
	  aDog2 = new Dog[]{new Dog("medor"), new Dog("rex")};
	  
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}

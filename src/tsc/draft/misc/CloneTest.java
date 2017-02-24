package tsc.draft.misc;

import java.util.ArrayList;
import java.util.List;


public class CloneTest implements Cloneable {
  
  private String name = "toto";
  private String number = "titi";
  private List list = new ArrayList();
  
  public List getList() {
    return list;
  }

  
  public void setList(List list) {
    this.list = list;
  }

  
  public MonObjetNonCloneable getObjNonCloneable() {
    return objNonCloneable;
  }

  
  public void setObjNonCloneable(MonObjetNonCloneable objNonCloneable) {
    this.objNonCloneable = objNonCloneable;
  }

  private MonObjetNonCloneable objNonCloneable;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getNumber() {
    return number;
  }
  
  public void setNumber(String number) {
    this.number = number;
  }
  
  public CloneTest(String name, String number) {
    
    this.name = name;
    this.number = number;
    list = new ArrayList();
    list.add("elt1");
    list.add("elt2");
    objNonCloneable = new MonObjetNonCloneable();
  }
  
  protected Object clone() throws CloneNotSupportedException {
    CloneTest clone = (CloneTest) super.clone();
    
    return clone;
  }
  
  public String toString() {
    return "CloneTest : name = " + name + ", number = " + number + " list = " + list + " , objNonCloneable = " + objNonCloneable + " ,objEntier = " + objNonCloneable.getMonEntier();
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    CloneTest initial = new CloneTest("toto", "titi");
    CloneTest clone = null;
    try {
      clone = (CloneTest) initial.clone();
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      
    }
    
    System.out.println(clone.toString());
    
    initial.setName("tata");
    initial.setNumber("tutu");
    
    try {
      clone = (CloneTest) initial.clone();
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      
    }
    System.out.println(clone.toString());
    
    initial.getObjNonCloneable().setMonEntier(10);
    System.out.println(initial.toString());
    System.out.println(clone.toString());
    
  }

}

class MonObjetNonCloneable {
  int monEntier = 5;

  
  public int getMonEntier() {
    return monEntier;
  }

  public void setMonEntier(int monEntier) {
    this.monEntier = monEntier;
  }
}

package tsc.draft.collection;

import java.util.HashMap;
import java.util.Map;

class Dog {

  public Dog(String n) {
    name = n;
  }

  public String name;

  public boolean equals(Object o) {
    if ((o instanceof Dog) && (((Dog) o).name == name)) {
      return true;
    } else {
      return false;
    }
  }

  public int hashCode() {
    return name.length();
  }

  @Override
  public String toString() {
    return name;
  }
}

class Cat {
}

enum Pets {
  DOG, CAT, HORSE
}

class MapTest {

  public static void main(String[] args) {
    Map<Object, Object> m = new HashMap<Object, Object>();
    m.put("k1", new Dog("aiko")); // add some key/value pairs
    m.put("k2", Pets.DOG);
    m.put(Pets.CAT, "CAT key");
    Dog d1 = new Dog("clover"); // let's keep this reference

    m.put(d1, "Dog key");
    m.put(new Cat(), "Cat key");
    System.out.println(m.get("k1")); // #1
    String k2 = "k2";
    System.out.println(m.get(k2)); // #2
    Pets p = Pets.CAT;
    System.out.println(m.get(p)); // #3
    System.out.println(m.get(d1)); // #4
    System.out.println(m.get(new Cat())); // #5
    System.out.println(m.size()); // #6

    System.out.println("Dog d1 = " + d1);
    for (Object elt : m.keySet()) {
      System.out.println("key = " + elt);

    }
    
    d1.name = "magnolia";
    System.out.println("(after modify) Dog d1 = " + d1);
    for (Object elt : m.keySet()) {
      System.out.println("key = " + elt);
    }
    System.out.println(m.get(d1));
    d1.name = "clover";
    System.out.println(m.get(d1));
    
  }
}

package ArrayList;
import java.util.ArrayList;
public class operations {
 public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    //Add operation
    list.add(5);
    list.add(10);
    list.add(25);
    System.out.println(list);
    //Get Operation
    int element=list.get(1);
    System.out.println(element);
    //Remove operation
    int remove=list.remove(2);
    System.out.println(remove);
    //Set operation
    list.set(0,10);
    System.out.println(list);
    //contains operatiom
    System.out.println(list.contains(1));
    //size operation
    System.out.println(list.size());
    for (int i =0;i<list.size();i++) {
      System.out.print(list.get(i )+", ");
    }

 }
}

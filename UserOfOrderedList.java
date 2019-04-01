public class UserOfOrderedList{
/*
List of required methods/constructors:
no-arg constructor
size
toString
add
get
remove
*/

  public static void main(String[] args){

      OrderedList_inArraySlots list = new OrderedList_inArraySlots();
      System.out.println(list);
      for(int i = 0; i < 5; i++){
        System.out.println("Adding " + i);
        list.add(i);
        System.out.println(list);
      }
      for(int i = 0; i < 5; i++){
        System.out.println("Adding " + 2*i);
        list.add(2*i);
        System.out.println(list);
      }
      System.out.println("Getting value at index 4: " + list.get(4));
      System.out.println("Removing value at index 6: " + list.remove(6));
      System.out.println(list);
  }

}

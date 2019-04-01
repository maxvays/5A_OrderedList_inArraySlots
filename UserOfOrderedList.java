public class UserOfOrderedList{
/*
List of required methods/constructors:
no-arg constructor
size
toString
add
get
set
remove
*/

  public static void main(String[] args){

      OrderedList_inArraySlots list = new OrderedList_inArraySlots();
      System.out.println(list);
      for(int i = 0; i < 5; i++){
        list.add(i);
        System.out.println(list);
      }
      for(int i = 0; i < 5; i++){
        list.add(2*i);
        System.out.println(list);
      }
  }

}

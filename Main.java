import java.util.ArrayList;
public class Main {

   public static void main(String []args) {



      
      // 4.7 wrapper classes wrap pirmimitives into objects
      // some objects need objects need methods.
      Integer fancyInt = new Integer(14);
      Double fancyDoub = new Double(14.14);
      // calling the constructior is no longer necessary
      // can just declare them like u wld primitaces
      Integer fancierInt = 14;
      System.out.println(fancierInt);
      // AUTOBOXING: Java converts int to integer
      // (we passed 14, a primitive  value, then Java promoted to Inatisager)
      int regularInt = fancierInt; // unboxing

      //
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String stringyNums = "14.0";
      double parsedD = Double.parseDouble(stringyNums);
      System.out.println(parsedD);
      String stringyNums2 = "14";
      int parsedI = Integer.parseInt(stringyNums);
      System.out.println(parsedI);


// 4.8 arraylist
// array list is rezisiable, very flex and dynamic, can change it during run too






   }

// ArrayList <type> name = new ArrayList<type>();

   ArrayList<String> toDo = new ArrayList<String>();
// for numbers, must use wrapper classes not primitives
   ArrayList<Integer> intList = new ArrayList<Integer>();
   ArrayList<Double> doubList = new ArrayList<Double>();


   // array list methods assume list is an array list

   // list.size returns int, number of items ount
   int numTasks = toDo.size();
   System.out.println("# of items on to do lis:" + numTasks);
   // list.add appends the obj to end of list
   // returns a boolean
   toDo.add( "play game ");
   toDo.add( "rank up" );
   toDo.add( "lose mind" );
   System.out.println(toDo.size() );
   System.out.println( toDo );

   // list.add(index, obj ) inserts the obj
   // art a specific index
   toDo.add(1, "die");
   System.out.println(toDo);

}

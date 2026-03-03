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
      String stringyNums = "13";
      double parsedD = Double.parseDouble(stringyNums);
      System.out.println(parsedD);
      String stringyNums2 = "14";
      int parsedI = Integer.parseInt(stringyNums);
      System.out.println(parsedI);


// 4.8 arraylist
// array list is rezisiable, very flex and dynamic, can change it during run too






   

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


   // list.get( int index) returns the igtem
   // at that specified index
   String firstItem = toDo.get(0);
   // return type matches what the arraylist holds
   System.out.print("do el firsto: " + firstItem);

   // list.set( int index obj new item
   // replaces item at index w new)

   String replacedItem = toDo.set(0, "dead");
   System.out.println(toDo);
   System.out.println("We replaced: " + replacedItem);
   // list.removal delete the item
   // shifts all back one
   String removedItem = toDo.remove(2);
   System.out.println(toDo);
   System.out.println("We remoaved: " + removedItem);




   // 4.9 array list TRAversal
   ArrayList<Integer> scores = new ArrayList<Integer>();
   scores.add(14);
   scores.add(33);
   scores.add(14);
   System.out.println(scores);

   //encancehe for each loop to visit in order doesnt keep track of current index
   for( Integer currentScore : scores ) {
      System.out.println("Test Score: " + currentScore);
   }

   // typical example: count up alll items
   double sum = 0;
   for (Integer score : scores ) {
      sum = sum + score; // sun += score same thjing

   }
   double avg = sum / scores.size();
   System.out.println("Test avg: " + avg);

   //Standard for loop when u need to keep track of the current INDEX
   // like if u want to use a method set get etc
   for (int i = 0; i < scores.size(); i++ ) {
      // get item at current index
      int currentItem = scores.get(i);
      int curvedScore = currentItem + 14;
      scores.set(i, curvedScore);

   }
   System.out.println(scores);




   // while loop (iterate) until condition is false
   ArrayList<String> fourteen = new ArrayList<String>();   
   fourteen.add("fourteenwhat");
   fourteen.add("fourteenyes");
   fourteen.add("fourteenok");
   fourteen.add("fourteenexactly");
   boolean found = false;
   int index = 0;
   while (index < fourteen.size() && found == false ) {
      if ("fourteenwhat".equals(fourteen.get(index))) {
         fourteen.remove(index);
         found = true;
      }
      else {
         index++; // continue through list
      }
   }

System.out.println(fourteen);


   }
}

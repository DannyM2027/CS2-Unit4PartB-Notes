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
   }
}

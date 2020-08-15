import java.util.Random; 
  
public class generateRandom{ 
  
    public static void main(String[] args) {
      int counter,temp;
      int arr[] = new int[11];
      Random rnum = new Random();
      /* Below code would generate 5 random numbers
       * between 0 and 200.
       */
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 10; counter++) {
         arr[counter]=rnum.nextInt(500);
      }
      System.out.println("The numbers are:");
      for (counter = 1; counter <= 10; counter++) {
         System.out.println(arr[counter]);
      }
      for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
      System.out.println("The sorted numbers are:");    
      for (counter = 1; counter <= 10; counter++) {
         System.out.println(arr[counter]);
      }
   }
} 
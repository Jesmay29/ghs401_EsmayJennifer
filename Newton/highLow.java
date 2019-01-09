import javax.swing.JOptionPane;

public class highLow
{
    
    public static void main(){

        int low = Integer.parseInt(JOptionPane.showInputDialog("Please enter a low value"));
        int high = Integer.parseInt(JOptionPane.showInputDialog("Please enter a high value"));
        //variable for even or odd
        String answer = " ";
        //keeping track of evens and odds
        int even = 0;
        //int odd = 0;
        
        if (low >= high) {
            System.out.println("This value does not work");
        }
            else {
                //determins the range of given values
                int range = high - low + 1;
                //sets us an array with ten spots
                int [] myArray = new int [10] ;

                for (int i=0; i< myArray.length; i++) {
                     //puts a random number into each array spot
                     myArray[i] = (int) (Math.random()*range) +low;

                }
                for (int i=0; i< myArray.length; i++) {
                    //determines even or odd of the random numbers and keeps track of amounts of evens/odds
                    if (myArray[i]%2 == 0 ){
                         even++;
                         answer = "even";
                     } else {
                         //odd++;
                         answer = "odd";
                     }
                    
                    System.out.println("The values in the high low index are " + myArray[i] + " the number is " + answer);
                    
                }
                System.out.println("There are " + even + " evens and " + (myArray.length-even) + " odds");
            }
       
    }
   
}

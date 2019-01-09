import javax.swing.JOptionPane;

public class Fibonacci
{
   public static void main(){
       //have the user set the parameter range of fib numbers
       int numFib = Integer.parseInt(JOptionPane.showInputDialog("How many Fibonacci number do you want to see?"));
       //make array dependent on above int
       int [] numbers = new int [numFib]; 
      
       int product = 0;
       int sum2 = 1;
       int sum1 = 0;
       
       int previous;
       
       System.out.println("Index\tFib Num.\tRunning Total");
       System.out.println("1\t0\t0");
       System.out.println("1\t1\t1");
       
       for(int i=2; i < numFib; i++) {
           previous = product;

           //new fib number
           product = sum1 + sum2;
           numbers [i] = sum1 + sum2;
           
           System.out.println("" + (i+1) + "\t" + numbers[i] + "\t" + (previous + product));
           
           sum1 = sum2;
           sum2 = product;
        }
    }
}

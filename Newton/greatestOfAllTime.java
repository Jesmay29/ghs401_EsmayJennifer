import javax.swing.JOptionPane;

public class greatestOfAllTime
{
    public static void main(){
        int deathStar = -1;
        
        while(deathStar > 100 || deathStar < 0){
            deathStar = Integer.parseInt(JOptionPane.showInputDialog("How many integers do you want?"));
        }
        
        int[] vader = new int[deathStar];
        //System.out.println(deathStar);
        //System.out.println(vader.length);
        for(int i = 0; i <vader.length; i++){
            int randy = (int) ((Math.random()*91) + 10);
            vader[i] = randy;
        }
        for(int i = 0; i <vader.length; i++){
            System.out.print(vader[i] + " ");
        }
        int jupiter=0;
        int merc=vader[0];
        
        for(int i = 0; i <vader.length; i++){
            if(vader[i] >= jupiter){
                jupiter = vader[i];
            } else if(vader[i] <= merc){
                merc = vader[i];
            }
        }
        System.out.println("");
        System.out.println("The greatest value is " + jupiter);
        System.out.println("The least value is " + merc);
    }
}

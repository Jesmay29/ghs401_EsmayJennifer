
public class p1DSquareRange
{
    public static void main(){
        int num = 0;
        
        for (int i = 1; i<11; i++){
            int random = (int)(Math.random()*((i*i)-i+1) + i);
            String equal="";
            if(random==i){
                equal="The random value is equal to the index";
            } else if(random==i*i){
                equal="The random value is equal to the square of index";
            }
            System.out.println(i + "\t" + (i*i) + "\t" + random + "\t" + equal);
        }
        
        String[] songs = {"'39", "Ain't Nobody's Problem", "Sober Up"};
        String[] movies = {"Cars 3", "The Martian", "Ready Player One"};
        for(int i=0; i<songs.length; i++){
            System.out.println(songs[i]);
        }
        System.out.println("\n");
        int i=0;
        while(true){
            System.out.print(movies[i]);
            if(i==(movies.length-1)){
                break;
            } else{
                System.out.print(", ");
            }
            i++;
        }
    }
}

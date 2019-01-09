
public class songs
{
   private String title;
   private String artist;
   private boolean spotify;
   private String genre;
   
   //zero argument
   public songs(){
       this.title = null;
       this.artist = null;
       this.spotify = false;
       this.genre = null;
       System.out.println("1");
    }
    
    //nulti-arg constructor
    public songs(String title, String artist, boolean spotify, String genre)
    {
        this.title = title;
        this.artist = artist;
        this.spotify = spotify;
        this.genre = genre;
        System.out.println("2");
    }
    
    
    //toString Methods
    public String toString()
    {
        String output = "Title is " + title + "\nArtist is " + artist + "\nOn spotify " + spotify
        + "\nGenre is " + genre;
        
        return output;
    }
}

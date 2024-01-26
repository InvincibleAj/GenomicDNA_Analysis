
/**
 * Write a description of Part2 here.
 * 
 * @author (Ajay Rajput) 
 * @version (V2 21/11/23)
 */
public class Part2 {
    public int howMany(String stringa,String stringb)
    {int count =0;
         int S= stringb.indexOf(stringa);// indexOf stringb
    while(S!=-1){
           count++;
         S= stringb.indexOf(stringa,S+stringa.length());// indexOf updated stringb
         
     } return count;
    }
    
    
    public void testHowMany()
    {
        String stringb ="ATGAACGAATTGAATC";
        String stringa="GAA";
        System.out.println("stringb string is - "+stringb);
        System.out.println("stringa string is - "+stringa);
        int repeatation = howMany(stringa ,stringb);
        System.out.println("no.of repeatation in stringb is "+repeatation);
    
    

      
       stringb = "ATGAATTGTTATTAGATGAATTGTTATTAG";
       stringa = "ATG";
        System.out.println("stringb string is - "+stringb);
        System.out.println("stringa string is - "+stringa);
        repeatation = howMany(stringa,stringb);
        System.out.println("repeatation is "+repeatation);
        
       stringb = "ATGTGATAGTAAATGATGTGATAGTAAATG";
        stringa = "TGA";
        System.out.println("stringb string is - "+stringb);
        System.out.println("stringa string is - "+stringa);
       repeatation = howMany(stringa,stringb);
       System.out.println("repeatation is "+repeatation);
       
        stringb = "ATGAATTTAAGATGTATGAATTTAAGATGT";
        stringa ="TGA";
         System.out.println("stringb string is - "+stringb);
         System.out.println("stringa string is - "+stringa);
        repeatation = howMany(stringa,stringb);
        System.out.println("repeatation is "+repeatation);
    }
    
}



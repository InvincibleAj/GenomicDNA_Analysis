
/**
 * Write a description of Part1 here. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public int findStopCodon(String dna, int startIndex,String stopCodon){
    //string dna is parameter of string 
        //startindex represent where the first time occurence of ATG happened
        //in this method we  represent the first occurece of stopcodon    
        int currIndex = dna.indexOf(stopCodon,startIndex+3);
        while (currIndex!=-1)
        {
            if((currIndex-startIndex)%3==0)
            {
              return currIndex;
            }
            else{currIndex= dna.indexOf(stopCodon,currIndex+1);}
        }
        return dna.length();
        
        
    }
     
    /* public void testFindStopCodon(){
        String dna = "ATGAACGAATTGAATC";
        String gene = findGene(dna);
        System.out.println(gene);
    //several examples 
    }
    */  public void testFindGene()
      {
       String dna =" TAGTGATAAAGTTAG ";
      System.out.println("DNA string is - "+dna);
      String gene = findGene(dna);
      System.out.println("gene is "+gene);
      
       dna = "ATGAATTGTTATTAG";
        System.out.println("DNA string is - "+dna);
        gene = findGene(dna);
        System.out.println("gene is "+gene);
        
       dna = "ATGTGATAGTAAATG";
        System.out.println("DNA string is - "+dna);
       gene = findGene(dna);
       System.out.println("gene is "+gene);
       
        dna = "ATGAATTTAAGATGT";
         System.out.println("DNA string is - "+dna);
        gene = findGene(dna);
        System.out.println("gene is "+gene);
       
        }
      
    public String findGene(String dna){
      int startIndex= dna.indexOf("ATG");
        if(startIndex == -1){return ""; }
        int taaIndex= findStopCodon(dna,startIndex,"TAA");
        int tagIndex= findStopCodon(dna,startIndex,"TAG");
        int tgaIndex= findStopCodon(dna,startIndex,"TGA");
        while (true)
        {
        int minIndex= Math.min(taaIndex,Math.min(tagIndex,tgaIndex));
       int l =dna.length();
         if(minIndex==l){return "";}
         else {
         String s=dna.substring(startIndex,minIndex+3);
         return s;}
         
        }
     }
}

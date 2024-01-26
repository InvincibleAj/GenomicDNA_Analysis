
/**
 * Write a description of p1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindGeneWhile {
    public String findGene(String dna )
{
        
   int startIndex= dna.indexOf("ATG"); //start index of string dna 
   int currIndex = dna.indexOf("TAA",startIndex+3);//index of TAA 
   // check for currIndex (TAA) is present or not 
     while((currIndex!=-1)&& (startIndex!=-1))
  {
    if((currIndex-startIndex)%3==0)//difference  b/w currIndex and lastIndex is multiple of 3 or not;
   {
     return dna.substring(startIndex,currIndex+3);// returninf substring with result part
   }
     else
   {
       currIndex=dna.indexOf("TAA",currIndex+1);// checking next occurence of TAA after first occurence 
    }
  }
    return "";
}
   public void testFindGeneSimple()
    {//testcases are as follows
     String dna= "ATAGGTAGGTATAA ";
        System.out.println("DNA strand 1 is  "+dna);
        String gene = findGene(dna);
        System.out.println("GEne is " +gene);

        
        dna = "ATGATGGGTAGGTACTTGTAA ";
            System.out.println("DNA strand 2 is  " + dna);
            gene = findGene(dna);
            System.out.println("GEne is " + gene);
        

       
        
        dna = "ATCGGTAGGTATTGTACG ";
            System.out.println("DNA strand  3  is" + dna);
            gene = findGene(dna);
            System.out.println("GEne is  " + gene);
       
        
        dna = "ATGAAGGAAATTTAA ";
            System.out.println("DNA strand 4 is  "+dna);
            gene = findGene(dna);
            System.out.println("GEne is "+gene);

        dna = "ATGAGTGTTAA ";
            System.out.println("DNA strand 5 is   "+dna);
            gene = findGene(dna);
            System.out.println("GEne is " + gene);
    } 
}
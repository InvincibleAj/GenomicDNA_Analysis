
/**
 * Write a description of CopyOfAllCodons here.
 * 
 * @author (your name) 
 * @version (11/10/2023)
 */
public class CopyOfAllCodons {
    public int findStopCodon(String dnaStr,int startIndex,String stopCodon)
     { 
         int currIndex= dnaStr.indexOf(stopCodon,startIndex+3);//index of TAA 
        // check for currIndex (TAA) is present or not 
     while(currIndex!=-1)
       {
           if((currIndex-startIndex)%3==0)//difference  b/w currIndex and lastIndex is multiple of 3 or not;
              {
               return currIndex;
              }
           else
              {
               currIndex= dnaStr.indexOf(stopCodon,currIndex+1);
              }
        }
        return dnaStr.length();
    }

    public String findGene(String dna,int where)
{
       
    int startIndex= dna.indexOf("ATG",where); //start index of string dna
    if(startIndex==-1)//no ATG
     { 
         return "";
     }
    int taaIndex=findStopCodon(dna,startIndex,"TAA");
    int tagIndex=findStopCodon(dna,startIndex,"TAG");
    int tgaIndex=findStopCodon(dna,startIndex,"TGA");
    int minIndex=Math.min(taaIndex,(Math.min(tagIndex,tgaIndex)));
    return dna.substring(startIndex,minIndex+3);
     /*if(((taaIndex==-1) || (tagIndex!=-1))&& (tgaIndex<tagIndex))
     {
    minIndex=tgaIndex; }
    else
        if(tagIndex==-1 || tgaIndex!=-1&&taaIndex<tgaIndex){
    minIndex=taaIndex;}
    else if(tgaIndex==-1||taaIndex!=-1 &&tgaIndex<taaIndex)
    {minIndex=tagIndex;}
     else{minIndex=dna.length();}
    return dna.substring(startIndex,minIndex+3);*/
    
}

   public void printAllGenes(String dna)
{
    int startIndex=0;//seting startindex at 0 for 1t time
    // repeat the process until found all gene
   while(true)
   {
    String currentGene=findGene(dna,startIndex);
     if(currentGene.isEmpty())
     {
        break;//if no gene te leave the loop
     }
   System.out.println(currentGene);
   //set startindex to just past the end of the gene
   startIndex=dna.indexOf(currentGene,startIndex)+currentGene.length();
   }
}

   public void testOn(String dna)
{
   System.out.println("Testing printAllGenes on "+dna);
   printAllGenes(dna);
}

  public void test()
  {
  testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
  testOn("");
  testOn("ATGATCATAAGAAGATAATAGAGGGCCCATGTAA");
}
}

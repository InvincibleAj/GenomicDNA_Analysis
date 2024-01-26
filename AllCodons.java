
/**
 * Write a description of AllCodons here.
 * 
 * @author (your name) 
 * @version (11/10/2023)
 */
public class AllCodons {
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

    public String findGene(String dna )
{
    /*    
    int startIndex= dna.indexOf("ATG"); //start index of string dna
    if(startIndex==-1)//no ATG
     { 
         return "";
     }
    int taaIndex=findStopCodon(dna,startIndex,"TAA");
    int tagIndex=findStopCodon(dna,startIndex,"TAG");
    int tgaIndex=findStopCodon(dna,startIndex,"TGA");
    int minIndex=Math.min(taaIndex,(Math.min(tagIndex,tgaIndex)));
    return dna.substring(startIndex,minIndex+3);
     if(taaIndex==-1|| tagIndex!= -1&& ////tgaIndex<tagIndex){
    minIndex=tgaIndex; }
    else
        if(tagIndex==-1 || tgaIndex!=-1&&taaIndex<tgaIndex){
    minIndex=taaIndex;}
    else if(tgaIndex==-1||taaIndex!=-1 &&tgaIndex<taaIndex)
    {minIndex=tagIndex;}
     else{minIndex=dna.length();}
    return dna.substring(startIndex,minIndex+3);*/
    return "";
}
public void testFindStop(){
String dna="xxxyyyzzzTAAxxxyyyzzzTAAxx";
     int dex= findStopCodon(dna,0,"TAA");
     if(dex!=9){System.out.println("error in 9");}
      dex= findStopCodon(dna,9,"TAA");
     if(dex!=21){System.out.println("error in 21");}
     dex= findStopCodon(dna,1,"TAA");
     if(dex!=26){System.out.println("error in 26");}
     dex= findStopCodon(dna,0,"TAG");
     if(dex!=26){System.out.println("error in 26");}
    {System.out.println("tests finished");}
//String s= findGene(dna);
//System.out.println("result is" +s);
}
}

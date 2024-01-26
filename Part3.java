public class Part3 {
    // Method to find the index of a stop codon in the DNA string, starting from a given index.
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
          
            //  if the distance between start and stop codon is a multiple of 3 then it is a valid gene.
            if ((currIndex - startIndex) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return dna.length();
    }

    public int countGenes(String dna) {
        //count the number of genes in a given DNA string
        int count = 0;
        int startIndex = dna.indexOf("ATG");
        while (startIndex != -1) {
            int taaIndex = findStopCodon(dna, startIndex, "TAA");
            int tagIndex = findStopCodon(dna, startIndex, "TAG");
            int tgaIndex = findStopCodon(dna, startIndex, "TGA");
            int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
            if (minIndex != dna.length()) {
                count++;
                startIndex = dna.indexOf("ATG", minIndex + 3);
            } else {
                startIndex = -1; // No more ATG codons found
            }
        }
        return count;
    }

    public void testCountGenes() 
     // Method to test the countGenes method with example of DNA string
     {
        String dna = "TAGTGATAAAGTTAG";
        System.out.println("DNA string is - " + dna);
        int count = countGenes(dna);
        System.out.println("Gene count is " + count);

        dna = "ATGAATTGTTAATATATGTAG";
        System.out.println("DNA string is - " + dna);
        count = countGenes(dna);
        System.out.println("Gene count is " + count);

        dna = "ATGGTGATAGTAAATG";
        System.out.println("DNA string is - " + dna);
        count = countGenes(dna);
        System.out.println("Gene count is " + count);

        dna = "ATGAATTTAAGATGT";
        System.out.println("DNA string is - " + dna);
        count = countGenes(dna);
        System.out.println("Gene count is " + count);
    }
}

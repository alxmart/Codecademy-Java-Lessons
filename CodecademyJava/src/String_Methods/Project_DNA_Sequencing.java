package String_Methods;

//Write a DNA.java program that determines whether there is
//        a protein in a strand of DNA.
//
//        A protein has the following qualities:
//
//        It begins with a “start codon”: ATG.
//        It ends with a “stop codon”: TGA.
//        In between, each additional codon is a sequence of
//        three nucleotides.
//        So for example:
//
//        ATGCGATACTGA is a protein because it has the start
//        codon ATG, the stop codon TGA, and the length is
//        divisible by 3.
//        ATGCGATAGA is not a protein because the sequence
//        length is not divisible by 3, so the third condition
//        is not satisfied.

public class Project_DNA_Sequencing {

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna2;
        System.out.println(dna.length());
        System.out.println(dna.indexOf("ATG"));
        System.out.println(dna.indexOf("TGA"));

        if (((dna.indexOf("ATG")) != -1) &&
           ((dna.indexOf("TGA")) != -1) &&
           ((dna.length() % 3)) == 0) {
            System.out.println("protein");
        } else{
            System.out.println("No protein");
        }

    }

}

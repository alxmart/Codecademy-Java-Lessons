public class Project_MadLibs {
    /*
    This program generates a mad libbed story.
  Author: Alex
  Date: 08/28/2022
    */
    public static void main(String[] args){

        String name1 = "Homer";
        String adjective1 = "beautiful";
        String adjective2 = "brave";
        String noun1 = "Disneyland";
        String noun2 = "London";
        String verb1 = "to run";
        String noun3 = "Boston";
        String noun4 = "Miami";
        String adjective3 = "fast";
        String name2 = "Marge";
        String place1 = "England";
        String noun5 = "Bedroom";
        String noun6 = "Car";

        int number = 3;



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}

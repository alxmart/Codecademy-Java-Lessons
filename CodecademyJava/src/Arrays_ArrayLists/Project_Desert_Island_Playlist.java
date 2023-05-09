package Arrays_ArrayLists;

import java.util.ArrayList;

public class Project_Desert_Island_Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Europe - The Variables.Final Countdown");
        desertIslandPlaylist.add("Black Sabbath - Dying for love");
        desertIslandPlaylist.add("Yngwie Malmsteen - Black Star");
        desertIslandPlaylist.add("Black Sabbath - Computer God");
        desertIslandPlaylist.add("Laura Poldvere - Moonwalk");
        desertIslandPlaylist.add("Laura Poldvere - Supersonic");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Black Sabbath - Dying for love");

        System.out.println(desertIslandPlaylist);

        //Swap:
        int indexA = desertIslandPlaylist.indexOf("Laura Poldvere - Moonwalk");

        int indexB = desertIslandPlaylist.indexOf("Laura Poldvere - Supersonic");

        String tempA = "Laura Poldvere - Moonwalk";

        desertIslandPlaylist.set(indexA, "Laura Poldvere - Supersonic");

        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(indexB, tempA);

        System.out.println(desertIslandPlaylist);

    }
}

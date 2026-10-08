package Assignment1_1;

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");


        Track t1 = new Track();
        System.out.println("Default Track: ");
        System.out.println(t1 + "\n");


        Track t2 = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(t2 + "\n");


        Track t3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(t3 + "\n");

        Track t4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(t4 + "\n");


        System.out.println("Invalid Duration Test:");
        Track t5 = new Track("Broken Clock", "Static Noise", -45, false);
        System.out.println(t5 + "\n");


        Track t6 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.println("Title:     " + t6.getTitle());
        System.out.println("Artist:    " + t6.getArtist());
        System.out.println("Duration:  " + t6.getDurationFormatted());
        System.out.println("Explicit:  " + t6.isExplicit());
    }

}



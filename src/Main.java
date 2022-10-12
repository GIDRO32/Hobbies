
public class Main {
    public static class musicAlbum
    {
        private static int songNumber;
        private static String songName;
        private static boolean completion;

        public musicAlbum(int songNum, String songTag, boolean done) {
        }

        private static void musicAlbum(int songNum, String songTag, boolean done)
        {
        completion = done;
        songNumber = songNum;
        songName = songTag;
        }
        public static void setCompletion(boolean done)
        {
            completion = done;
        }
        public static boolean getCompletion()
        {
            return completion;
        }
        public static void setSongNumber(int songNum)
        {
            songNumber = songNum;
        }

        public static int getSongNumber()
        {
            return songNumber;
        }
        public static void setSongName(String songTag)
        {
            songName = songTag;
        }
        public static String getSongName()
        {
           return songName;
        }
        public static void printFullInfo()
        {
            System.out.println(getSongNumber() + ". " + getSongName() + " -- Completed: " + getCompletion());
        }
    }
    public static void main(String[] args)
    {
        musicAlbum bV = new musicAlbum(1, "Blocked View", true);
        musicAlbum gR = new musicAlbum(2, "Green Room", true);
        musicAlbum fCL = new musicAlbum(3, "Four Ceiling Ledges", true);
        musicAlbum bB = new musicAlbum(4, "Black Box", true);
        musicAlbum mOfTSW = new musicAlbum(5, "Mountain of the Streets(Winter)", false);

        System.out.println("== Lavriks Village Thematic Music Demo Album songs list ==\n");
        bV.setSongNumber(1);
        bV.setSongName("Blocked View");
        bV.setCompletion(true);
        bV.printFullInfo();
        gR.setSongNumber(2);
        gR.setSongName("Green Room");
        gR.setCompletion(true);
        gR.printFullInfo();
        fCL.setSongNumber(3);
        fCL.setSongName("Four Ceiling Ledges");
        fCL.setCompletion(true);
        fCL.printFullInfo();
        bB.setSongNumber(4);
        bB.setSongName("Black Box");
        bB.setCompletion(true);
        bB.printFullInfo();
        mOfTSW.setSongNumber(5);
        mOfTSW.setSongName("Mountain of the Streets");
        mOfTSW.setCompletion(false);
        mOfTSW.printFullInfo();
    }
}
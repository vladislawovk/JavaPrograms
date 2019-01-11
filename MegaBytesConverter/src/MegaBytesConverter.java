public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = kiloBytes / 1024;
        int remainKiloBytes = kiloBytes % 1024;

        if(kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaBytes
                    + " MB and " + remainKiloBytes + " KB");
        } else if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
    }
}


import com.formdev.flatlaf.FlatDarkLaf;


/**
 *
 * @author NaveenB2004
 */
public class Updater {

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        String y = args[0];
        switch (y) {
            case "install":
                new process.process().installer();
            case "noInstall":
                new process.process().checkUpdates();
        }
    }
}

package jaytter;

import javax.swing.UIManager;
import ui.core.InitWindow;

/**
 *
 * @author samir
 */
public class Main {

    /**
     * Test-drive
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        InitWindow.main(args);
    }
}
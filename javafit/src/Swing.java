import java.util.ArrayList;
import javax.swing.*;


public class Swing {
    private final JFrame thisFrame;
    private final ArrayList<JButton> buttons = new ArrayList<JButton>();

    // constructor needs a JFrame to add the buttons to
        // I have no idea if we were supposed to be adding items directly to the frame?
        // Anyway this works.
    public Swing(JFrame parentFrame) {
        thisFrame = parentFrame;
    }

    public void addButton(int i , String S) {
        buttons.add(new JButton(S));
        thisFrame.add(buttons.get(i));
        buttons.get(i).setBounds(25 ,10 + (i*120),550,110);     // hard coded for three buttons
    }

    public ArrayList<JButton> getButtons() {
        return buttons;
    }
}

import java.util.ArrayList;
import javax.swing.*;


public class Swing {
    private final JFrame thisFrame;
    private final ArrayList<JButton> buttons = new ArrayList<JButton>();

    public Swing(JFrame parentFrame) {
        thisFrame = parentFrame;
    }


    public void addButton(int i , String S) {
        buttons.add(new JButton(S));
        thisFrame.add(buttons.get(i));
        buttons.get(i).setBounds(25 ,10 + (i*120),550,110);
    }

    public void setButtonText(int i , String S) {
        buttons.get(i).setText(S);
    }

    public ArrayList<JButton> getButtons() {
        return buttons;
    }


}

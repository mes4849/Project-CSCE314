import java.util.ArrayList;
import java.util.EnumMap;

import javax.swing.*;

public class Swing {
    private final JFrame thisFrame;
    private final ArrayList<JButton> buttons = new ArrayList<JButton>();

    public Swing(JFrame parentFrame) {
        thisFrame = parentFrame;
        for (int i = 0 ; i < 3 ; i++) {
            buttons.add(new JButton());
            thisFrame.add(buttons.get(i));
            buttons.get(i).setBounds(25 ,10 + (i*120),550,110);
        }
    }

    public void setButtonText(int i , String S) {
        buttons.get(i).setText(S);
    }


}

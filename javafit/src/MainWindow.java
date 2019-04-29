import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EnumMap;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

// Bonus points: Create an icon (or find a public domain icon. Keep in mind federal Copyright law and TAMU's plagiarism policy and add it to the home screen window.
public class MainWindow implements ActionListener {
  
  private final JFrame mainFrame = new JFrame(Config.APPLICATIONNAME);
  private final JDialog selectWorkout = new JDialog(mainFrame, "Select Workout");
  private JComboBox<String> cboType, cboGoal;
  private JSpinner spnDuration;
  private final Workouts workouts;
  private final EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups;
  private Canvas canvas = new Canvas();
  private final ArrayList<JButton> buttons = new ArrayList<JButton>();


  MainWindow(Workouts workouts, EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups) {
    this.workouts = workouts;
    this.muscleGroups = muscleGroups;
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    canvas.setSize(600 , 400);
    this.launchHomeScreen();
  }
  
  private void launchHomeScreen() {
      
    mainFrame.add(canvas);
    this.createButtons();
    this.registerHandlers();
    
    //Display the window.
    mainFrame.pack();
    mainFrame.setVisible(true);
  }
  
  private void addButton(int i , String S) {
        buttons.add(new JButton(S));
        thisFrame.add(buttons.get(i));
        buttons.get(i).setBounds(25 ,10 + (i*120),550,110);     // hard coded for three buttons
  }

  private void createButtons() {
    int i = 0;

    for (Config.MuscleGroup mg : muscleGroups.keySet()) {
      addButton(i , mg.toString());
      i++;
    }
  }

  private void registerHandlers() {
    for (JButton jb : buttons){
      jb.addActionListener(this);
    }
  }

  // the main window will dictate what happens at button press...
  public void actionPerformed(ActionEvent e) {
    JButton temp = (JButton)e.getSource();
    callHandler(temp.getText());
  }

  private void callHandler(String S) {
    showWorkouts(muscleGroups.get(Config.MuscleGroup.valueOf(S)));
  }
  
  // This is the method your actionlistener should call. It should create and display a WorkoutsPanel.
  private void showWorkouts(ArrayList<Config.Muscle> muscles) {
    mainFrame.getContentPane().removeAll();
    mainFrame.add(new WorkoutsPanel(muscles , workouts));
    mainFrame.validate();

  }
}

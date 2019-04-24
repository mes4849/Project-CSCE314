import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EnumMap;

import javax.swing.*;
import java.awt.event.*;


// Bonus points: Create an icon (or find a public domain icon. Keep in mind federal Copyright law and TAMU's plagiarism policy and add it to the home screen window.
public class MainWindow implements ActionListener {
  
  private final JFrame mainFrame = new JFrame(Config.APPLICATIONNAME);
  private final JDialog selectWorkout = new JDialog(mainFrame, "Select Workout");
  private JComboBox<String> cboType, cboGoal;
  private JSpinner spnDuration;
  private final Workouts workouts;
  private final EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups;

  private Swing buttonSwing;
  private Canvas canvas = new Canvas();


  MainWindow(Workouts workouts, EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups) {
    this.workouts = workouts;
    this.muscleGroups = muscleGroups;
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    canvas.setSize(600 , 400);
  }

  public JFrame getFrame() {
    return mainFrame;
  }

  public void startProgram(Swing swing) {
    int i = 0;
    buttonSwing = swing;

    for (Config.MuscleGroup mg : muscleGroups.keySet()) {
      buttonSwing.addButton(i , mg.toString());
      i++;
    }

    registerHandlers();
    launchHomeScreen();
  }

  private void registerHandlers() {
    for (JButton jb : buttonSwing.getButtons()) {
      jb.addActionListener(this);
    }
  }

  private void launchHomeScreen() {
    mainFrame.add(canvas);
    //Display the window.
    mainFrame.pack();
    mainFrame.setVisible(true);
  }

  // the main window will dictate what happens at button press...
  public void actionPerformed(ActionEvent e) {
    JButton temp = (JButton)e.getSource();
    callHandler(temp.getText());
  }

  public void callHandler(String S) {
    showWorkouts(muscleGroups.get(Config.MuscleGroup.valueOf(S)));
  }
  
  // This is the method your actionlistener should call. It should create and display a WorkoutsPanel.
  private void showWorkouts(ArrayList<Config.Muscle> muscles) {
    mainFrame.getContentPane().removeAll();
    mainFrame.add(new WorkoutsPanel(muscles , workouts));
    mainFrame.validate();

  }
}

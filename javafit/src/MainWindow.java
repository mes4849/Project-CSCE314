import java.awt.*;
import java.util.ArrayList;
import java.util.EnumMap;

import javax.swing.*;

// Bonus points: Create an icon (or find a public domain icon. Keep in mind federal Copyright law and TAMU's plagiarism policy and add it to the home screen window.
public class MainWindow {
  
  private final JFrame mainFrame = new JFrame(Config.APPLICATIONNAME);
  private final JDialog selectWorkout = new JDialog(mainFrame, "Select Workout");
  private JComboBox<String> cboType, cboGoal;
  private JSpinner spnDuration;
  private final Workouts workouts;
  private final EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups;

  private Swing buttonSwing;


  MainWindow(Workouts workouts, EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups) {
    this.workouts = workouts;
    this.muscleGroups = muscleGroups;
    canvas = new Canvas();

    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void start() {
    launchHomeScreen();
  }

  private void startProgram(JFrame) {
    buttonSwing = new Swing(frame);
    buttonSwing.setButtonText(0 , "UPPERBODY");
    
  }
  
  private void launchHomeScreen() {
    startProgram(mainFrame);
    //Display the window.
    mainFrame.pack();
    mainFrame.setVisible(true);
  }
  
  // This is the method your actionlistener should call. It should create and display a WorkoutsPanel.
  private void showWorkouts(ArrayList<Config.Muscle> muscles) {
    
  // Code goes here.
  }
}

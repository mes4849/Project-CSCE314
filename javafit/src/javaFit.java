import java.util.ArrayList;
import java.util.EnumMap;



public class javaFit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	System.out.println("Just a test");
		
	// Load data into app
    Workouts workouts = FileAccess.loadWorkouts();
    EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups = FileAccess.loadFormats();
	  
  	// Create Screen Handler
  	MainWindow mainScreen = new MainWindow(workouts, muscleGroups);
  	// Create Swing object??
	Swing buttonSwing = new Swing(mainScreen.getFrame());

	// start the program
	mainScreen.startProgram(buttonSwing);		// we pass in the swing object to register all the buttons it contains doing it this way allows us to have different buttons registered to different frame
	  
	  


	}

}

// This class is for all our configuration data. By putting it all in one place, we can easily make changes to the program without having to hunt down where in the code a constant is defined.

import java.nio.file.Paths;


public class Config {
  
  public final static String APPLICATIONNAME = Paths.get("").toAbsolutePath().getParent().toString()+ "/data/" + "JavaFit: Muscles for Computer Scientists!";
  public final static String WORKOUTFILE = Paths.get("").toAbsolutePath().getParent().toString()+ "/data/" + "workouts.csv";
  public final static String WORKOUTFORMATFILE = Paths.get("").toAbsolutePath().getParent().toString()+ "/data/" + "workoutformats.csv";
  public final static String ICONFOLDER = Paths.get("").toAbsolutePath().toString();

  public enum MuscleGroup {UPPERBODY, LOWERBODY, WHOLEBODY}
  public enum Muscle {ABS, BACK, BICEPS, CHEST, FOREARM, GLUTES, LOWERLEG, SHOULDER, TRICEPS, UPPERLEG, NONE} // Why didn't I have to declare this static?
  public enum Equipment {BARBELL, BODYWEIGHT, DUMBBELL, CABLE, HAMMERSTRENGTH}
}

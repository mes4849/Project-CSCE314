// This class is for all our configuration data. By putting it all in one place, we can easily make changes to the program without having to hunt down where in the code a constant is defined.
// Use the defined constant to load the workouts file.

import java.nio.file.Paths;

public class Config {
  
    public final static String WORKOUTFILE = "workouts.csv";
    public final static String path = Paths.get("").toAbsolutePath().getParent().toString();
  
}




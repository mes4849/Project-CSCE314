import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAccess {
    
    private static String absFileName = Config.path+"/data/"+Config.WORKOUTFILE;
    private static File file = new File(absFileName);

    
    public static Workouts loadWorkouts() {
        Workouts allWorkouts = new Workouts();
        
        String name;
        String equipment;
        String primaryMuscle;
        String secondaryMuscle;
        String desc;
        String reminders;
        
        try{
            // we want to put this inside the catch loop to avoid breaking if the file is not found
            Scanner inputStream = new Scanner(file);
            inputStream.useDelimiter(",|\\n|\\r");
            
            // hasNext() loops field by field... and by lne
            while(inputStream.hasNext()){
                //read the fields and put them in
                name = inputStream.next();
                System.out.println("Name: " + name + "\n"); // fix me
                equipment = inputStream.next();
                System.out.println("eq: " + equipment + "\n"); // fix me
                primaryMuscle = inputStream.next();
                System.out.println("pM: " + primaryMuscle + "\n"); // fix me
                secondaryMuscle = inputStream.next();
                System.out.println("sM: " + secondaryMuscle + "\n"); // fix me
                desc = inputStream.next();
                System.out.println("desc: " + desc + "\n"); // fix me
                reminders = inputStream.next();
                System.out.println("rem: " + reminders + "\n"); // fix me
                allWorkouts.addWorkout(name, Workouts.Equipment.valueOf(equipment), Workouts.muscle.valueOf(primaryMuscle), Workouts.muscle.valueOf(secondaryMuscle), desc, reminders);
                System.out.println("Object added..."); // fix me
                //inputStream.useDelimiter("\n");
                if(inputStream.hasNext()) {
                    inputStream.next();
                }
                System.out.println("\n\n");

            }
            // after loop, close scanner
            inputStream.close();

        }
        catch (Exception e){

            e.printStackTrace();
        }
        
        
        return allWorkouts;
          
    }

}

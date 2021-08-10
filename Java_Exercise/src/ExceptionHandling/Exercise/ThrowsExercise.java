package ExceptionHandling.Exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExercise {

    public static void main(String[] args) {
//            File file1 = new File("invalid.txt");
//            FileInputStream stream1 = new FileInputStream(file1);

        try{
            File file = new File("invalid.txt");
            FileInputStream stream = new FileInputStream(file);
        }catch (Exception e){
            System.out.println("Message: "+e.getMessage());
        }
        System.out.println("Program is ended .....");
    }
}

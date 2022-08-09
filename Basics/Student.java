import java.util.ArrayList;
import java.util.List;

/**
 * Student
 */
public class Student extends Person{

    private String id;
    private String carrer;

    public List<String> study(List<String> materias){
        String message = "I am studiying materias: ";
        List<String> scores = new ArrayList<>();
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(message + materias.get(i));
            scores.add("10");
        }

        return scores;
    }

    public List<String> learn(List<String> skills){
        String message = "My skill is: ";
        List<String> masters = new ArrayList<>();
        for (int i = 0; i < skills.size(); i++) {
            System.out.println(message + skills.get(i));
            masters.add("I am master in" + skills.get(i));
        }
        return masters;
   }

}
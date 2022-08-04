
import java.util.List;

public class Person{

    private String name;
    private String lastName;
    private double height;
    private int age;
    private String genre;
    private String color;

    private static final String HAPPY = "I am happy";
    private static final String TIRED = "I am tired";
    private static final String LOST = "I am lost";

    public String walk(double distance){
        if(distance < 10){
            System.out.println(HAPPY);
        }else if(distance > 10 && distance < 100){
            System.out.println(TIRED);            
        }else{
            System.out.println(LOST);
        }

        return "";
    }

    public String eat(List<String> food){
        for(int i = 0; i < food.size(); i++){
            if(food.get(i).equals("Pizza")){
                System.out.println(HAPPY);
            }else if(food.get(i).equals("huevo")){
                System.out.println(TIRED);
            }else{
                System.out.println(LOST);
            }
        }

        return "";
    }

    public List<String> think(List<String> thoughts){
        List<String> ideas = null;
        for(int i = 0; i < thoughts.size(); i++){
            if(thoughts.get(i).equals("Musica")){
                System.out.println(HAPPY);
            }else if(thoughts.get(i).equals("Pelicula")){
                System.out.println(TIRED);
            }else{
                System.out.println(LOST);
            }
        }

        return ideas;
    }


}
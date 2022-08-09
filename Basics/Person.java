
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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Person(){

    }

    public Person(String name, String lastName, double height, int age, String genre, String color){
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.genre = genre;
        this.color = color;
    }

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
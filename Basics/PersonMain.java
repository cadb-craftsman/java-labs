import java.util.Scanner;

import javax.swing.JOptionPane;

public class PersonMain {

    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        //int c = Integer.parseInt(args[0]);
        //int x = Integer.parseInt(args[1]);

        //Scanner in = new Scanner(System.in);
        //System.out.println("Introduce el valor de c");
        //int c = in.nextInt();
        //System.out.println("Introduce el valor de x");
        //int x = in.nextInt();

        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de c"));
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de x"));

        p.setName("Pedro");
        p.setLastName("Juarez");
        p.setAge(50);
        p.setColor("Yellow");
        p.setHeight(49);
        s.setLastName("Rodriguez");
        s.setColor("Red");


        System.out.println(p.getName()  + " " + " lastName " + p.getLastName() + p.walk(c));
        System.out.println("lastName " + s.getLastName()+ s.walk(x));

        //in.close();
    }
    
}

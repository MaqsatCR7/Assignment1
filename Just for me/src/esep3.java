import java.util.Scanner;

public class esep3 {
    public static void main(String[] args) {
        Scanner maqsat= new Scanner(System.in);
        String name,surname,country;
        int age;
        System.out.println("Otynysh atyndy engiz");
        name= maqsat.next();
        System.out.println("Otynysh familandu engiz");
        surname= maqsat.next();
        System.out.println("Qai el");
        country= maqsat.next();
        System.out.println("Zhasynyz");
        age= maqsat.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Surname: "+ surname);
        System.out.println("Country: "+country);
        System.out.println("Age: "+ age);
    }
}

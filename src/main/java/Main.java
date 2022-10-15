import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[7];
        employee[0] = new Employee("litvin", "aleksey", "sergeevich", "1", 65300);
        employee[1] = new Employee("Jukov", "Andrey", "Vitalevich", "1", 67500);
        employee[2] = new Employee("Petrosov", "Elena", "Potapovna", "1", 66750);
        employee[3] = new Employee("Lorina", "Rimma", "Vasilevna", "2", 75200);
        employee[4] = new Employee("Martinov", "Petr", "Gavrilovich", "2", 74600);
        employee[5] = new Employee("Yurev", "Elizaveta", "Radionovna", "3", 76450);
        employee[6] = new Employee("Garin", "Elizar", "Sokratovich", "3", 78200);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(StringUtils.capitalize(employee[i].getSurName()));
            System.out.println(StringUtils.capitalize(employee[i].getName()));
            System.out.println(StringUtils.capitalize(employee[i].getLastName()));
            System.out.println("IsAlpha- " + StringUtils.isAlpha(employee[i].getSurName()));
            System.out.println("IsAlpha- " + StringUtils.isAlpha(employee[i].getName()));
            System.out.println("IsAlpha- " + StringUtils.isAlpha(employee[i].getLastName()));
        }
    }
}


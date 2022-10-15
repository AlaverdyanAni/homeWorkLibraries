public class Employee {
    private String surName;
    private String name;
    private String lastName;

    private String departament;
    private int salary;

    public Employee(String surName,String name, String lastName,String departament, int salary) {
        this.name = name;
        this.lastName=lastName;
        this.surName=surName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public String getDepartament() { return departament; }
    public int getSalary() {
        return this.salary;
    }



    public void setDepartament(String departament) {

        this.departament = departament;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О. " + surName+" "+name+" "+" "+lastName + ", отдел - " + departament + ", зарплата - " + salary;
    }
}

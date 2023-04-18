package ClassesAndObjects.oopInheritance;



public class Developer extends Employee{
    private String department;
    private String[] programmingLanguage;

    public Developer(String name, String surname, int age, String sex, double salary,
                     String department, String[] programmingLanguage) {
        super(name, surname, age, sex, salary);
        this.department = department;
        this.programmingLanguage = programmingLanguage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String[] programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

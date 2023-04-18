package ClassesAndObjects.oopInheritance;

public class Manager extends Employee {
    private String department;
    private String[] skill;

    public Manager(String name, String surname, int age, String sex,
                   double salary, String department, String[] skill) {
        super(name, surname, age, sex, salary);
        this.department = department;
        this.skill = skill;
    }

    public void calculateBonus() {
        double bonus = 0;
        if (skill.length>=2){
            System.out.println("ваш бонус 10%: "+(this.getSalary()*0.1));
        } else {
            System.out.println("Вам необходимо иметь  2 и более навыков");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }


}

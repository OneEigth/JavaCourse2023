package ClassesAndObjects.oopInheritance;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jeff", "Bezos", 40, "male",500000,"Head",new String[]{"first"});
        Manager manager2 = new Manager("Elon", "Musk", 50, "male",500000,"Sale",new String[]{"first","second", "third"});
        Developer developer1 = new Developer("Bernard", "Arnault", 25, "male", 800000, "Head", new   String[]{"java","JS"});
        Developer developer2 = new Developer("Mark", "Zuckerberg", 35, "male",800000, "Head",new String[]{"java","js","html","php"});
        Employee employee1 = new Employee("Warren", "Buffett", 23, "male",90000);
        Employee employee2 = new Employee("Bill", "Gates", 24, "male",90000);
        Employee employee3 = new Employee("Larry", "Ellison", 50, "male",80000);
        Employee employee4 = new Employee("Ivan", "Ivan", 47, "male",70000);
        Person person1 = new Person("Kolya", "Kolya", 18, "male");
        Person person2 = new Person("Sasha", "Sasha", 28, "female");


        Employee[] employees = new  Employee[]{manager1,manager2,developer1,developer2,employee1,employee2,employee3,employee4};



        Manager manager = (Manager) employees[1];
        manager.calculateBonus();

        }
    }


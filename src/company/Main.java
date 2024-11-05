package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director mesh3al = new Director("Mesh3al", "Fishing", 200000, 500000);
        Engineer abdullah = new Engineer("Abdullah", "Cars", 400000);
        SalesPerson mike = new SalesPerson("Mike", "Bikes", 2000, 50000);


        abdullah.setSkills("Painting");
        abdullah.setSkills("Walking");
        abdullah.setSkills("Driving");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(mesh3al);
        System.out.println(abdullah);
        System.out.println(mike);
    }

}

public class Main {
    public static void main(String[] args) {
        Component company = new Department("Company");

        Component department1 = new Department("department 1");
        Component department2 = new Department("department 2");
        Component department3 = new Department("department 3");
        Component department4 = new Department("department 4");

        Component employee1 = new Employee("Mikko",1500);
        Component employee2 = new Employee("Teppo",1600);
        Component employee3 = new Employee("Jukka",1700);
        Component employee4 = new Employee("Kalle",1800);
        Component employee5 = new Employee("Pekka",1900);
        Component employee6 = new Employee("Jussi",2000);

        company.add(department1);
        company.add(department2);
        company.add(employee1);
        department1.add(employee2);
        department2.add(employee3);
        department2.add(employee4);
        department2.add(department3);
        department3.add(employee5);
        department3.add(department4);
        department4.add(employee6);

        company.printData("");
        System.out.println("Total salary: " + company.getSalary());
        System.out.println("emp1 salary: " + employee1.getSalary());
        System.out.println("Dep3 salary: " + department3.getSalary());

    }
}

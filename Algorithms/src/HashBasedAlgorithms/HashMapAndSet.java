package HashBasedAlgorithms;

import java.util.HashMap;
import java.util.HashSet;

class Employee{
    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}

public class HashMapAndSet {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robby", 2345, "Technology");
        Employee emp2 = new Employee("Bobby", 2314, "Marketing");
        Employee emp3 = new Employee("Sally", 8970, "Sales");

        HashMap<Integer, Employee> employeesById = new HashMap<>();
        employeesById.put(emp1.id, emp1);
        employeesById.put(emp2.id, emp2);
        employeesById.put(emp3.id, emp3);

        Employee retrieved = employeesById.get(2345);

        if (retrieved != null) {
            System.out.println(retrieved.name + " : "+ retrieved.department);
        }

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("2TRE");
        productCodes.add("H5JE");
        productCodes.add("K3NF");
        productCodes.add("4JDJ");

        System.out.println(productCodes.contains("2TRE"));
        System.out.println(productCodes.contains("4JDJD"));
    }
}

package Propuestos.Employees;

import java.util.*;

public abstract class EmployeeUtil {

    /**
     * Este metodo devuelve una lista de empleados en donde 
     * su ultimo nombre empieza con una carta especifica
     * @param employees
     * @param letter
     * @return
     */
    public static List<Employee> getEmployeesByFirstLetterLastname(List<Employee> employees, String letter) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (letter.equalsIgnoreCase(String.valueOf(employee.getLastname().charAt(0))))
                employeeList.add(employee);
        }

        return employeeList;
    }

    /**
     * Este metodo devuelve un mapa con
     * el empleado mas viejo y 
     * el empleado mas joven
     * @param employees
     * @return
     */
    public static Map<String, Employee> getEmployeesOldYoung(List<Employee> employees) {
        Map<String, Employee> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Employee::getAge));

        employeesMap.put("Young", employees.get(0));
        employeesMap.put("Old", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Este metodo devuelve a los dos empleados con
     * el salario mas alto y el salario mas bajo
     * @param employees
     * @return
     */
    public static Map<String, Employee> getEmployeesBestPoorSalary(List<Employee> employees) {
        Map<String, Employee> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Employee::getSalary));

        employeesMap.put("Poor", employees.get(0));
        employeesMap.put("Best", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Este metodo devuelve la misma lista de empleados
     * pero ordenada por nombre y apellido
     * @param employees
     * @return
     */
    public static List<Employee> sortByNameLastname(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getLastname));
        return employees;
    }
}
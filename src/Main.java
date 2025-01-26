public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Скрипалёв", "Александр", "Вячеславович", 1, 1, 50000);
        employees[1] = new Employee("Скрипалёва", "Екатерина", "Сергеевна", 2, 2, 57500);
        employees[2] = new Employee("Веденеева", "Полина", "Николаевна", 3, 3, 62300);
        employees[3] = new Employee("Скрипалёва", "Наталья", "Юрьевна", 4, 4, 65800);
        employees[4] = new Employee("Веденеев", "Николай", "Васильевич", 5, 5, 72900);
        employees[5] = new Employee("Любченко", "Наталья", "Владимировна", 6, 6, 75300);
        employees[6] = new Employee("Любченко", "Сергей", "Михайлович", 1, 7, 81400);
        employees[7] = new Employee("Проскурин", "Дмитрий", "Георгиевич", 2, 8, 80000);
        employees[8] = new Employee("Проскурина", "Алёна", "Сергеевна", 1, 9, 85500);
        employees[9] = new Employee("Каюмов", "Семён", "Юрьевич", 1, 10, 90000);


        printAllEmployees(employees);

        System.out.println("Общая сумма для выплаты зарплаты: " + getSalarySum(employees) + " рублей.");
        Employee minSalaryEmployee = getMinSalarySum(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        Employee maxSalaryEmployee = getMaxSalarySum(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        System.out.println("Средняя зарплата в компании: " + getMidlSalary(employees) + " рублей.");
        printAllEmployeeNames(employees);
    }


    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }


    public static double getSalarySum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    public static Employee getMinSalarySum(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }


    public static Employee getMaxSalarySum(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }


    public static double getMidlSalary(Employee[] employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }


    public static void printAllEmployeeNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }
}

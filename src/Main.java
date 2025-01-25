import java.lang.reflect.Array;

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


        Employee.printAllEmployees(employees);


        System.out.println("Общая сумма для выплаты зарплаты: " + Employee.getSalarySum(employees) + " рублей.");



        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.getMinSalarySum(employees) + " рублей.");


        System.out.println("Сотрудник с максимальной зарплатой: "+ Employee.getMaxSalarySum(employees) + " рублей.");


        System.out.println("Средняя зарплата в компании " + Employee.getMidlSalary(employees)+" рублей.");


        Employee.printAllEmployeeNames();

    }
}
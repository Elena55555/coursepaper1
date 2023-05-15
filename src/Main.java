import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        /1. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//            Отделы с 1-5;
//            * Создадим  массив из сотрудников*/
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Иванов Иван Иванович", 1, 75000);
        staff[1] = new Employee("Горбунков Семен Семенович", 2, 50000);
        staff[2] = new Employee("Петров Петр Петрович", 3, 40000);
        staff[3] = new Employee("Николаев Николай Николаевич", 4, 60000);
        staff[4] = new Employee("Федоров Федор Федорович", 5, 58000);
        staff[5] = new Employee("Сергеев Сергей Сергеевич", 1, 75000);
        staff[6] = new Employee("Каштанов Иван Геннадьевич", 2, 52000);
        staff[7] = new Employee("Муреев Александр Евгеньевич", 3, 44000);
        staff[8] = new Employee("Николаев Николай Николаевич", 4, 66000);
        staff[9] = new Employee("Федоров Федор Федорович", 5, 58000);
        /* a ) Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).*/


        for (Employee e : staff) {
            System.out.println(e);
        }

//       /* b ) Посчитать сумму затрат на зарплаты в месяц.
        double sum = 0;
        for (Employee e : staff) {
            sum += e.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составила " + sum + " рублей");
//      /*e  Подсчитать среднее значение зарплат.
        int length = staff.length;
        System.out.println("Сумма затрат на зарплаты в месяц в среднем составила " + sum / staff.length + " рублей");
//
//      /*c  Найти сотрудника с минимальной зарплатой.
        double minWeight = 200000;
        double maxWeight = -1;
        for (Employee e : staff) {
            if (e.getSalary() < minWeight) {
                // Если значение элемента массива меньше, чем minWeight
                minWeight = e.getSalary();
                // Записать значение в переменную
            }
//           /*d Найти сотрудника с максимальной зарплатой.

            if (e.getSalary() > maxWeight) {
                // Если значение элемента массива больше, чем maxWeight
                maxWeight = e.getSalary();
                // Записать  значение в переменную
                System.out.println("Сотрудник с миним. зарплатой " + staff[2]);
                System.out.println("Сотрудник с максим. зарплатой " + staff[0]);
            }
        }


//        / * f Получить Ф. И. О. всех сотрудников (вывести в консоль).
        for (Employee e : staff) {
            e.getName();
            System.out.println("Сотрудник  " + e.getName());
        }

    }
}
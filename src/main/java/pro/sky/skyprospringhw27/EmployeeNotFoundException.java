package pro.sky.skyprospringhw27;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Сотрудник с данным ФИО не найден");
    }
}
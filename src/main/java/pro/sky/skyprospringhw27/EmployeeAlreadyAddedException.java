package pro.sky.skyprospringhw27;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException() {
        super("Этот сотрудник уже есть в базе данных");
    }
}
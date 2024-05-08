package pro.sky.skyprospringhw27;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
        super("База данных переполненна");
    }
}
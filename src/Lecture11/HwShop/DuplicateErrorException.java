package Lecture11.HwShop;

public class DuplicateErrorException extends Exception{
    private int id;

    public DuplicateErrorException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Продукт с id " +id + " уже существует";
    }
}

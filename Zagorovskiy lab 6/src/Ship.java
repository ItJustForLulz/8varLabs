/**
 * Created by graver_mc on 13.05.2018.
 */
public interface Ship {
    void ride(); //плыть
    void sink(); //тонуть
    void stayInPort(); //стоять в порту
    void breakEngine(); //сломать двигатель
    void repareEngine(); //починить двигатель
    void checkStatus(); //проверить состояние корабля
}
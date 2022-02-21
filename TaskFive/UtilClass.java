package TaskFive;

import java.util.ArrayList;
import java.util.List;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass<T>{
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <T> boolean isBlank(List<T> list) {
        if ( list == null ){
            return true;
        }else if (list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     * num.doubleValue()
     */
    public static <T> Object getLastElem(List<T> list) {

        if (list == null){
            throw new IllegalArgumentException("Список равен null");
        }else {
            return list.get(list.size() -1);
        }
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <T> Object findElem(List<T> list, Object elem) {
        if (elem == null){
            throw new IllegalArgumentException("Список равен null");
        }else{
            int i = list.size();
            int j = 0;
            while (j < i-1 && !elem.equals(list.get(j))){
                j +=1;
            }
            if (elem.equals(list.get(j))){
                return (T) elem;
            }else{
                return null;
            }
        }
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <T>List union(List<T> list1, List<T> list2) {
        if (list1 == null | list2 == null){
            throw new IllegalArgumentException("Список равен null");
        }else{
            ArrayList<T> yList = new ArrayList<>();
            yList.addAll(list1);
            yList.addAll(list2);

            return yList;
        }
    }

    /**
     * Удаляет все элементы из списка list1, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <T>List removeAll(List<T> list1, List<T> list2) {
        ArrayList<T> yList = new ArrayList<>();
        yList.addAll(list1);
        for (Object a : list2){
            if (a == null){
                throw new IllegalArgumentException("Элемент списка равен null");
            }else{
                yList.remove(a);
            }
        }
        return yList;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static <T, E> double sum(List<T> list1, List<E> list2) {
        if ((list1 == null) | (list2 == null)) {
            throw new IllegalArgumentException("Список равен null");
        }

        Number summa;
        double sum = 0;

        for (int i = 0; i < list1.size(); i++) {
            summa = (Number) list1.get(i);
            sum += summa.doubleValue();
        }
        for (int i = 0; i < list1.size(); i++) {
            summa = (Number) list2.get(i);
            sum += summa.doubleValue();
        }
        return sum;
    }
}

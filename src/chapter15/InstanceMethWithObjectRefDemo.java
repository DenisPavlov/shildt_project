package chapter15;

// Использовать ссылку на метод экземпляра вместе с разными объектами

// функциональны интерфейс с методом принимающим два ссылочных
// и возвращающий boolean результат
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

// класс для хранения максимальной температуры за день
class HighTemp {
    private int hTemp;

    HighTemp(int ht) { hTemp = ht; }

    // Возвратить true, если вызывающий объект HighTemp имеет такуюже
    //температуру как объект ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Возвратить true, если вызывающий объект HighTemp имеет
    // температуру меньше чем ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {

    // Метод возвращает количество экземпляров объекта
    // найденных по критериям, заданным параметром
    // функционального интерфейса MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for(int i=0; i < vals.length; i++)
            if(f.func(vals[i], v)) count++;

        return count;
    }

    public static void main(String args[])
    {
        int count;

        // создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83) };

        // Использовать метод counter() вместе с массивом объектов
        // типа HighTemp. Обратите внимание на то, что ссылка на метод
        // экземпляра sameTemp передается в качестве второго параметра
        HighTemp highTemp = new HighTemp(10);

//        count = counter(weekDayHighs, HighTemp::sameTemp,
        count = counter(weekDayHighs, HighTemp::sameTemp,
                new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        // Now, create and use another array of HighTemp objects.

        // А теперь создать и использовать вместе с данным
        // еще один массив с элементами типа HighTemp
        HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13) };

        count = counter(weekDayHighs2, HighTemp::sameTemp,
                new HighTemp(12));
        System.out.println(count + " days had a high of 12");


        // Now, use lessThanTemp() to find days when temperature was less
        // that a specified value.

        // А тепери воспользуемся методом lessThanTemp() чтобы
        // выяснить, сколько дней температура была меньше заданной
        count = counter(weekDayHighs, HighTemp::lessThanTemp,
                new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp,
                new HighTemp(19));
        System.out.println(count + " days had a high of less than 19");
    }
}


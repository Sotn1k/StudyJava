package com.setCollectionDemo;

public class Data {
    public static final String TEXT1 = """
            Привет как дела?""";
    public static final String TEXT = """
            Дженерики (или обобщения) - это параметризованные типы.
                        
            Параметризованные типы позволяют объявлять классы, интерфейсы и методы, где тип данных, которыми они оперируют, указан в виде параметра. Используя дженерики, можно создать единственный класс, например, который будет автоматически работать с разными типами данных.
                        
            Классы, интерфейсы или методы, имеющие дело с параметризованными типами, называются параметризованными или обобщениями, параметризованными (обобщенными) классами или параметризованными (обобщёнными) методами.
                        
            Обобщения добавили в язык безопасность типов.
                        
            Параметризованные классы
            Ограниченные типы
            Применение метасимвольных аргументов
            Параметризованные методы и конструкторы
            Параметризованные интерфейсы
            Иерархии параметризованных классов
            Использование оператора instanceof c параметризованными классами
            Ограничения присущие обобщениям
                        
            1. Параметризованные классы
            Следующий пример демонстрирует использование параметризованного класса, который описывает матрицу:
                        
            public class Matrix<T> {
                private T[] array;
                        
                public Matrix(T[] array) {
                    this.array = array.clone();
                }
                        
                public static void main(String[] args) {
                    Matrix<Double> doubleMatrix = new Matrix<>(new Double[2]);
                    Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
                    Matrix<Byte> byteMatrix = new Matrix<>(new Byte[7]);
                }
            }
            В объявлении Matrix<Integer> integerMatrix Integer является аргументом типа.
                        
            Java не создает разные версии класса Matrix или любого другого параметризованного класса. Имеется только одна версия класса Matrix, которая существует в прикладной программе.
                        
            Дженерики работают только с объектами! Следующий код является неправильным:
                        
            Gen<int> strOb = new  Gen<int> (53);
            // Ошибка, нельзя использовать примитивные типы
            Т обозначает имя параметра типа. Это имя используется в качестве заполнителя вместо которого в дальнейшем подставляется имя конкретного типа, передаваемого классу Matrix при создании объекта. Это означает, что обозначение Т применяется в классе Matrix всякий раз, когда требуется параметр типа. Всякий раз, когда объявляется параметр типа, он указывается в угловых скобках.
                        
            Обобщенные типы отличаются в зависимости от типов-аргументов. Следующий код не допустим:
                        
            doubleMatrix = integerMatrix; // Не верно!
            Несмотря на то, что doubleMatrix и integerMatrix имеют тип Matrix<T>, они являются ссылками на разные типы, потому что типы их параметров отличаются.
                        
            Обобщенный класс может быть объявлен с любым количеством параметров типа. Например:
                        
            public class TwoGen<T, V> {
                private T obT;
                private V obV;
                        
                public TwoGen(T obT, V obV) {
                    this.obT = obT;
                    this.obV = obV;
                }
                        
                public void showTypes() {
                    System.out.println("Тип T: " + obT.getClass().getName());
                    System.out.println("Тип V: " + obV.getClass().getName());
                }
                        
                public T getObT() {
                    return obT;
                }
                        
                public V getObV() {
                    return obV;
                }
            }
                        
            public class SimpleGen {
                public static void main(String[] args) {
                    TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Generics");
                        
                    twoGen.showTypes();
                    System.out.println("Значение T: " + twoGen.getObT());
                    System.out.println("Значение V: " + twoGen.getObV());
                }
            }
            2. Ограниченные типы
            Указывая параметр типа, можно наложить ограничение сверху в виде верхней границы, где объявляется супер класс, от которого должны быть унаследованы все аргументы типов. С этой целью вместе с параметром указывается ключевое слово extends:
                        
            class Gen <Т extends Superclass>
            Параметр типа Т может быть заменен только указанным супер классом или его подклассами.
                        
            Рассмотрим пример использования ограниченного типа:
                        
            public class Average<T extends Number> {
                private T[] array;
                        
                public Average(T[] array) {
                    this.array = array;
                }
                        
                public double average() {
                    double sum = 0.0;
                        
                    for (T value : array) {
                        sum += value.doubleValue();
                    }
                        
                    return sum / array.length;
                }
            }
                        
            public class AverageDemo {
                public static void main(String[] args) {
                    Integer[] intArray = {1, 2, 3, 4, 5};
                    Average<Integer> integerAverage = new Average<>(intArray);
                    System.out.println("Среднее значения для Integer " + integerAverage.average());
                        
                    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
                    Average<Double> doubleAverage = new Average<>(doubleArray);
                    System.out.println("Среднее значения для Double " + doubleAverage.average());
                        
                    // Не откомпилируется,
                    // потому что String не является наследником Number
                   /* String[] strArray = {"1", "2", "3", "4", "5"};
                    Average<String> strAverage = new Average<>(strArray);
                        
                    System.out.println("Среднее значения для String " + strAverage.average());*/
                }
            }
            В виде ограничения можно накладывать не только тип класса, но и тип интерфейса:
                        
            public class MyClass<T extends Serializable>
            Ограничение может включать в себя как тип класса, так и типы одного или нескольких интерфейсов:
                        
            class Gen <T extends MyClass & MyInterface1 & MyInterface2>
            Тип класса должен быть задан первым. Накладывая на обобщенный тип ограничение, состоящее из класса и одного или нескольких интерфейсов, для их объединения следует воспользоваться логической операцией &: Таким образом, любой тип, передаваемый параметру Т, должен быть подклассом, производным от класса MyClass и реализующим интерфейсы MyInterface1 и MyInterface2.
                        
            3. Применение метасимвольных аргументов
            Представьте, что мы хотим добавить метод для сравнения средних значений массивов в класс Average из примера 3. Причем типы массивов могут быть разные:
                        
            Integer intArray[] = {1, 2, 3, 4, 5};
            Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
                        
            Average<Integer> iob = new Average<>(intArray);
            Average<Double> dob = new Average<>(doubleArray);
                        
            if (iob.sameAvg(dob)) {
                System.out.println("are the same.");}
            else {
                System.out.println("differ.");
            }
            Так как Average параметризованный тип, какой тип параметра вы укажете для Average, когда создадите параметр метода типа Average? Напрашивается следующий вариант:
                        
            boolean sameAvg(Average<T> ob) {
                return average() == ob.average();
            }
            Но это не сработает, так как в этом случае метод sameAvg будет принимать аргументы только того же типа, что и существующий объект:
                        
            if (iob.sameAvg(iob)) {
                System.out.println("are the same.");}
            else {
                System.out.println("differ.");
            }
            Чтобы создать обобщенную версию метода sameAvg(), следует воспользоваться другим средством обобщений Jаvа – метасимвольным аргументом. Метасимвольный аргумент обозначается знаком ? и представляет неизвестный тип.
                        
            boolean sameAvg(Average<?> ob) {
                return average() == ob.average();
            }
            Мета символ не оказывает никакого влияния на тип создаваемых объектов класса Average. Это определяется оператором extends в объявлении класса Average. Мета символ просто совпадает с любым достоверным объектом класса Average.
                        
            Метасимвольные аргументы могут быть ограничены почти таким же образом, как и параметры типов. Ограничивать метасимвольный аргумент особенно важно при создании обобщенного типа, оперирующего иерархией классов. Например:
                        
            public class Average2<T extends Number> {
                private T[] array;
                        
                public Average2(T[] array) {
                    this.array = array.clone();
                }
                        
                public double average() {
                    double sum = 0.0;
                        
                    for (T value : array) {
                        sum += value.doubleValue();
                    }
                        
                    return sum / array.length;
                }
                        
                boolean sameAvg(Average2<?> ob) {
                    return average() == ob.average();
                }
            }
                        
            public class AverageDemo2 {
                public static void main(String[] args) {
                    Integer[] intArray = {1, 2, 3, 4, 5};
                    Average2<Integer> iob = new Average2<>(intArray);
                    System.out.println("Среднее значения для Integer " + iob.average());
                        
                    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
                    Average2<Double> dob = new Average2<>(doubleArray);
                    System.out.println("Среднее значения для Double " + dob.average());
                        
                    Float[] floatArray = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
                    Average2<Float> fob = new Average2<>(floatArray);
                    System.out.println("Среднее значения для Float " + fob.average());
                        
                    System.out.print("Средние значения для iob и dob ");
                    if (iob.sameAvg(dob)) {
                        System.out.println("одинаковые.");
                    } else {
                        System.out.println("разные.");
                    }
                        
                    System.out.print("Средние значения для iob и fob ");
                    if (iob.sameAvg(fob)) {
                        System.out.println("одинаковые.");
                    } else {
                        System.out.println("разные.");
                    }
                }
            }
            4. Параметризованные методы и конструкторы
            В методах параметризованного класса можно использовать параметр типа, а следовательно, они становятся параметризованными относительно параметра типа.
                        
            Но можно объявить параметризованный метод, в котором непосредственно используется один или несколько параметров типа. Более того, можно объявить параметризованный метод, входящий в не параметризованный класс. Например:
                        
            public class GenMethodDemo {
                /**
                 * Является ли объект x элементом массива array
                 *
                 * @param x
                 * @param array
                 * @param <T>
                 * @param <V>
                 * @return
                 */
                public static <T, V> boolean isIn(T x, V[] array) {
                    for (V element : array) {
                        if (x.equals(element)) {
                            return true;
                        }
                    }
                    return false;
                }
                        
                public static void main(String[] args) {
                    Integer[] intArray = {1, 2, 3, 4, 5};
                        
                    if (isIn(2, intArray)) {
                        System.out.println("2 входит в массив intArray");
                    }
                        
                    if (!isIn(7, intArray)) {
                        System.out.println("7 не входит в intArray");
                    }
                    System.out.println();
                        
                    String[] strArray = {"one", "two", "three", "four", "five"};
                        
                    if (isIn("two", strArray)) {
                        System.out.println("two входит в массив strArray");
                    }
                        
                    if (!isIn("seven", strArray)) {
                        System.out.println("seven не входит в массив strArray");
                    }
                }
            }
            Конструкторы также могут быть обобщенными, даже если их классы таковыми не являются. Например:
                        
            public class GenConstructor {
                private double value;
                        
                public <T extends Number> GenConstructor(T arg) {
                    value = arg.doubleValue();
                }
                        
                public void showValue() {
                    System.out.println("value: " + value);
                }
            }
                        
            public class GenConstructorDemo {
                public static void main(String[] args) {
                    GenConstructor genConstructor1 = new GenConstructor(100);
                    GenConstructor genConstructor2 = new GenConstructor(123.5F);
                        
                    genConstructor1.showValue();
                    genConstructor2.showValue();
                }
            }
            5. Параметризованные интерфейсы
            В дополнение к обобщенным классам и методам вы можете объявлять параметризованные интерфейсы. Параметризованные интерфейсы специфицируются так же, как и обобщенные классы:
                        
            public interface MyInterface<T> {
                T someMethod(T t);
            }
                        
            public class MyClass<T> implements MyInterface<T> {
                @Override
                public T someMethod(T t) {
                    return t;
                }
                        
                public static void main(String[] args) {
                    MyInterface<String> object = new MyClass<>();
                    String str = object.someMethod("some string");
                }
            }
            6. Иерархии параметризованных классов
            Параметризованные классы могут быть частью иерархии классов так же, как и любые другие не параметризованные классы. То есть параметризованный класс может выступать в качестве супер класса или подкласса.
                        
            Ключевое отличие между параметризованными и не параметризованными иерархиями состоит в том, что в параметризованной иерархии любые аргументы типов, необходимые параметризованному супер классу, всеми подклассами должны передаваться по иерархии вверх.
                        
            Например:
                        
            public class GenericSuper<T> {
                private T ob;
                        
                public GenericSuper(T ob) {
                    this.ob = ob;
                }
                        
                private T getOb() {
                    return ob;
                }
            }
                        
            public class GenericSub<T> extends GenericSuper<T> {
                public GenericSub(T ob) {
                    super(ob);
                }
            }
            Подкласс параметризованного супер класса необязательно должен быть параметризованным, но в нем все же должны быть, указаны параметры типа, требующиеся его параметризованному супер классу. Подкласс может, если требуется, быть, дополнен и своими параметрами типа. Супер классом для параметризованного класса может быть класс не параметризованный.
                        
            7. Использование оператора instanceof c параметризованными классами
            public class HierarchyDemo {
                public static void main(String[] args) {
                    GenericSuper<Integer> object = new GenericSub<>(88);
                    if (object instanceof GenericSuper<?>) {
                        System.out.println("object is instance of GenericSuper");
                    }
                    if (object instanceof GenericSub<?>) {
                        System.out.println("object is instance of GenericSub");
                    }
                        
                    // Ошибка компиляции - информация об обобщенном типе недоступна во время выполнения
                    /* if (object instanceof GenericSub<Integer>) {
                        System.out.println("object is instance of GenericSub<Integer>");
                    }*/
                }
            }
            8. Ограничения присущие обобщениям
            Обобщениям присущи некоторые ограничения. Рассмотрим их:
                        
            1. Нельзя создавать экземпляр по параметру типа. Ни обычный объект, ни массив:
                        
            public class GenRestriction<T> {
                private T ob;
                private T[] array;
                        
                public GenRestriction(T ob, T[] array) {
                    // Недопустимо!!!
                    //оb = new Т();
                    //array = new Т[10];
                    this.ob = ob;
                    this.array = array;
                }
            }
            2. Нельзя создать массив специфических для типа обобщенных ссылок:
                        
            public class GenArrays {
                public static void main(String[] args) {
                    // Нельзя создать массив специфичных для типа обобщенных ссылок.
                    // GenericSub<Integer>[] gens = new GenericSub<Integer>[10];
                        
                    GenericSub<?>[] gens = new GenericSub<?>[10];
                    gens[0] = new GenericSub<>(34);
                }
            }
            3. Нельзя создавать обобщенные статические переменные и методы. Но объявить статические обобщенные методы со своими параметрами типа все же можно:
                        
            public class GenericWrongStatic<T> {
                // Неверно, нельзя создать статические переменные типа Т.
                //public static Т оb;
                        
                // Неверно, ни один статический метод не может использовать Т.
            /*    public static T getOb() {
                    return оb;
                }*/
                //Но объявить статические обобщенные методы со своими параметрами типа можно
                public static <V> void getOb(V v) {
                    System.out.println(v);
                }
            }
            """;


}

package com.MapaSet;

import java.util.*;

import static java.util.Collections.*;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<>();
        {
            treemap.put("Иван Иванченко", 1235874);// помещаем обьект в Мапу
            treemap.put("Ринат Риантович", 258741);
            treemap.put("Юлий Цезарь", 2544756);
            treemap.put("Юрий Юрьевич", 8789532);
            // treemap.put("Собль Соблевич", 465321789);
            treemap.put("Собль Соблевич", 582147);
        }
        System.out.println(treemap);
        System.out.println("-------------");
        /*Map<Integer,String> treemap1 = new TreeMap<Integer,String>(); // пробовал сделать реверс
            treemap1.put(234566662, "Иван Иванченко");// помещаем обьект в Мапу
            treemap1.put(109543455, "Ринат Риантович");
            treemap1.put(908866662, "Юлий Цезарь");
            treemap1.put(123444444, "Юрий Юрьевич");
            treemap1.put(354534343, "Собль Соблевич");
            treemap1.put(342432422, "Собль Соблевич");
        Set set = treemap1.entrySet();
        Iterator interator = set.iterator();
        while (interator.hasNext()){
            Map.Entry me = (Map.Entry)interator.next();
            System.out.print(me.getKey()+ ": ");
            System.out.println(me.getValue());
        }
        System.out.println("-------------");
        System.out.println(treemap1);*/

       /* Comparator<Person>comparator = new Comparator<Person>() { // Compare TO Person //implements Comparable<Person>
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };*/
        //MyComporator myComporator = new MyComporator();
        Comparator<Person> comporator = new Comparator<Person>() { // Компоратор сравнения по имени длины
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.length() - o2.name.length();
            }
        };
        Map<Person, Integer> treemapTest = new TreeMap<>(comporator);// Занесли информацию с другого класса
        treemapTest.put(new Person("Vtaly dS", 123),50);
        treemapTest.put(new Person("Vasiliy SSS", 589),20);
        treemapTest.put(new Person("Petrov CsWWWWW", 345),35);
        treemapTest.put(new Person("MArfa", 467),45);
        treemapTest.put(new Person("Diomid", 234),50);
        System.out.println("-------------");
        System.out.println(treemapTest);







































    }



}

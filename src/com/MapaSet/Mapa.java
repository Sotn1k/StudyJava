package com.MapaSet;
import java.util.Collections;
import com.setCollectionDemo.Data;

import java.util.*;

import static java.util.Collections.*;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("Иван Иванченко", 1235874);// помещаем обьект в Мапу
        map.put("Ринат Риантович", 258741);
        map.put("Юлий Цезарь", 2544756);
        map.put("Юрий Юрьевич", 8789532);
       // map.put("Собль Соблевич", 465321789);
        map.put("Собль Соблевич", 582147);

        map.remove("Ринат Риантович"); // удаление по ключу
        System.out.println(map.get("Иван Иванченко"));// поиск по ключу возращает значение
        System.out.println(map.containsKey("Юрий Юрьевич"));// содержит ли ключ возвращает true есть есть
        System.out.println(map.containsValue(8789532));// поиск по значению true если есть
        System.out.println(map.size());// размер Mapa
        //map.clear(); // очистить мапу

        Set<String> keys = map.keySet(); // вывести все ключи обьекта пама
        System.out.println(keys);
        Collection<Integer> values = map.values();// вывести все значения обьекта пама
        System.out.println(values);
        /*Set<Map.Entry<String,Integer>> entries = map.entrySet();// возращает множество из пар entryset
        for (Map.Entry<String, Integer> pair : entries) { //получаем ключ значение в удобной раскладке
            System.out.println(pair.getKey() + "------------>" + pair.getValue());

        }*/

        //Set<Map.Entry<String,Integer>> entries = map.entrySet();// возращает множество из пар entryset
        for (var pair : map.entrySet()) { //получаем ключ значение в удобной раскладке
            System.out.println(pair.getKey() + "------------>" + pair.getValue());

        }
        System.out.println(map);

        System.out.println("----------->");
        StringTokenizer tokenizer = new StringTokenizer(Data.TEXT1);

        List<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            list.add(word);
        }
        //list.addAll(singleton(Data.TEXT1));

        //list.add("ПРИВЕТ");
       // list.add("ХАЙВАН");
       // list.add("РЕВЕРС");
        System.out.println(list);
        System.out.println(list.indexOf("РЕВЕРС"));
        Collections.reverse(list);
        System.out.println(list.indexOf("РЕВЕРС"));
        System.out.println(list);
        Queue<String > s = new LinkedList<>();














    }
}



























package com.TreeMapDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        //DevComporator devcomp = new DevComporator();
        CompAge compage = new CompAge();
        CompName compname = new CompName();
        Comparator<Dev> devComparator = compage.thenComparing(compname);
        Map<Dev, Integer> map = new TreeMap<>(devComparator);
        map.put(new Dev("Ivanov", 37),3000);
        map.put(new Dev("Sidorov", 50),3500);
        map.put(new Dev("Petrov", 33),4000);

        map.put(new Dev("Ivanova", 33),4000);
        map.put(new Dev("Sidorova", 20),3500);
        map.put(new Dev("Petrova", 39),2500);
        for (Map.Entry<Dev, Integer> entry : map.entrySet()) {
            System.out.printf("%30s $%d%n", entry.getKey(),entry.getValue());
            
        }
    }

}


class Dev implements Comparable<Dev> {
    private String name;
    private int age;

    public Dev(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dev otherDev) {
        return this.age != otherDev.age
                ?this.age- otherDev.age
                :this.name.compareTo(otherDev.name);

    }
}

class DevComporator implements Comparator<Dev>{

    @Override
    public int compare(Dev dev1, Dev dev2) {
        return  (dev1.getAge()!=dev2.getAge())
                ?dev2.getAge() - dev1.getAge()
                :dev1.getName().compareTo(dev2.getName());



    }
}
class CompAge implements Comparator<Dev>{

    @Override
    public int compare(Dev o1, Dev o2) {
        return -(o1.getAge()-o2.getAge());
    }
}

class CompName implements Comparator<Dev>{

    @Override
    public int compare(Dev o1, Dev o2) {
        return o1.getName().compareTo(o2.getName());
    }
}







































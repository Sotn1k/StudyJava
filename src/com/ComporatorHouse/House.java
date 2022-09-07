package com.ComporatorHouse;

public class House implements Comparable <House>{
    private int area;
    private int price;
    private String city;
    private boolean hasFurniture;

    public House(int area, int price, String  city,
                 boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public void setHasFurniture(boolean hasFurniture) {
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    public int compareTo(House anotherHouse){// использовали компаратор для фильтрации очреди списка в данном примере использовался area для фильтрации
        return Integer.compare(this.area, anotherHouse.area);
    }

}

package Seminar_6;

import java.util.LinkedList;


public class Example1 {
    public Example1() {
        laptopDB.add(new Laptop("Ноутбук ASUS серый RAM 4 ГБ, SSD 128 ГБ, Windows"));
        laptopDB.add(new Laptop("Ноутбук Acer черный RAM 8 ГБ, HDD 512 ГБ, Windows"));
        laptopDB.add(new Laptop("Ноутбук HP белый RAM 16 ГБ, SSD 256 ГБ, macOS"));
        laptopDB.add(new Laptop("Ноутбук HP красный RAM 16 ГБ, SSD 128 ГБ, macOS"));
    }

    private LinkedList<Laptop> laptopDB = new LinkedList<>();

    public void isMatchRAM(Integer min, Integer max) {
        for (Laptop laptop : laptopDB) {
            if (laptop.isMatchRAM(min, max)) System.out.println(laptop);
        }
    }
    public void searchByOS(String os) {
        for (Laptop laptop : laptopDB) {
            if (laptop.isMatchOSType(os)) System.out.println(laptop);
        }
    }
}

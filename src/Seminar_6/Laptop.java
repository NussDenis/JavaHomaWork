package Seminar_6;

import java.util.regex.*;

public class Laptop {
    public Laptop(String strToParse) {
        brand = findRegex(strToParse, "(?<=Ноутбук\\s)[a-zA-Z]*(?=\\s)");
        color = findRegex(strToParse, "(?<=\\s)[а-яА-Я]*(?=\\s\\[)");
        String[] paramsRAW = findRegex(strToParse, "(?<=\\[).*(?=\\])").split(", ");
        System.out.println(paramsRAW[0]);
        volumeCPU = Integer.parseInt(findRegex(paramsRAW[1], "(?<=RAM\\s)[0-9]{1,3}(?=\\sГБ)"));
        memoryCapacity = Integer.parseInt(findRegex(paramsRAW[2], "[0-9]{1,}"));
        operationalSystem = paramsRAW[3];
    }

    public String findRegex(String inStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inStr);
        return matcher.find() ? matcher.group() : "";
    }

    public Boolean findStr(String par, String inStr) {
        Pattern pattern = Pattern.compile(inStr.replace(" ", "").toLowerCase());
        Matcher matcher = pattern.matcher(par.replace(" ", "").toLowerCase());
        return matcher.find();
    }

    public Boolean isMatchOSType(String inOS) {
        return findStr(operationalSystem, inOS);
    }

    public Boolean isMatchRAM(Integer minRAM, Integer maxRAM) {
        return volumeCPU >= minRAM && volumeCPU <= maxRAM;
    }

    public final String brand;
    public final String color;
    public final Integer memoryCapacity;
    public final Integer volumeCPU;
    public final String operationalSystem;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", volumeCPU=" + volumeCPU +
                ", operationalSystem='" + operationalSystem + '\'' +
                '}';
    }
}


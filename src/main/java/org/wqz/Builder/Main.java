package org.wqz.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
               .setCpu("Intel Core i9")
               .setRam("32GB")
               .setStorage("1TB SSD")
               .setGraphicsCard("NVIDIA GeForce RTX 4080")
               .build();

        System.out.println(computer);
    }
}    
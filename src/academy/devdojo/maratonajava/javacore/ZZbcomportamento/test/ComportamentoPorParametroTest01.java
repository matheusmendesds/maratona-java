package academy.devdojo.maratonajava.javacore.ZZbcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZbcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));
    public static void main(String[] args) {
        System.out.println("Carros verdes");
        System.out.println(filterGreenCar(cars));
        System.out.println("----");
        System.out.println("Carros com a cor passada no parametro:");
        System.out.println(filteredCarByColor(cars,"red"));
        System.out.println("-----");
        System.out.println("Carros especificos de um ano para baixo");
        System.out.println(filteredCarByYear(cars,2015));


    }
    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
    private static List<Car> filteredCarByColor(List<Car> cars, String cor) {
        List<Car> filterCarByColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                filterCarByColor.add(car);
            }
        }
        return filterCarByColor;
    }
    private static List<Car> filteredCarByYear(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
           if (car.getYear() < year){
               oldCars.add(car);
           }
        }
        return oldCars;

    }

}

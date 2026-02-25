package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Willian")
                .lastName("Suane")
                .username("ViradonoJiraya")
                .email("wiilian@gmail.com")
                .build();
        System.out.println(build);
    }
}

package org.example.task7;

import lombok.*;

@Data
@Builder
@AllArgsConstructor

public class User {
    private String name;
    private String surname;
    private int age;
    private int foot;
    private int height;
    private String nationality;
    private String eyesColor;
    private String hairColor;

    public static void main(String[] args) {
        //User user = new User() za duzy konstruktor
        User user = User.builder()
                .name("Tomasz")
                .surname("Placek")
                .age(30)
                .build();
        System.out.println(user);
    }



}

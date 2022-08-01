package dzien2.wzorceProjektowe.after.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buildProcessor("Intel")
                .buildMemory("16GB")
                .buildGraphic("Radeon")
                .build();
        System.out.println(computer);

        User user = new User.UserBuilder()
                .buildName("Przemyslaw")
                .buildSurame("Degorski")
                .buildMailAddress("fshjsdfhdsk@gmail.com")
                .build();

        User user2 = new User.UserBuilder()
                .buildName("Klara")
                .buildSurame("Brodnicka")
                .build();

        System.out.println(user);
        System.out.println(user2);


        /*User user3 = new User()
                .buildOne("Jacek")
                .buildTwo("Kowalski")
                .buildThree("fsdfds@gmail.com");
        System.out.println(user3);*/

    }
}

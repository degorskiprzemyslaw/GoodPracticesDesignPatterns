package dzien2.wzorceProjektowe.after.builder;

public class User {
    private String name;
    private String surname;
    private String mailAddress;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.mailAddress = userBuilder.mailAddress;

    }
   /* public User(){

    }

    public User buildOne(String name){
        this.name = name;
        return this;

    }
    public User buildTwo(String surname){
        this.surname = surname;
        return this;
    }
    public User buildThree(String mailAddress){
        this.mailAddress = mailAddress;
        return this;
    }*/


    public static class UserBuilder {
        private String name;
        private String surname;
        private String mailAddress;

        public UserBuilder buildName(String name){
           this.name = name;
           return this;
        }

        public UserBuilder buildSurame(String surname){
            this.surname = surname;
            return this;
        }

        public UserBuilder buildMailAddress(String mailAddress){
            this.mailAddress = mailAddress;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}



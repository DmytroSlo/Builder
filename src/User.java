public class User {

    private String login;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private Gender gender;

    private User(String login, String name, String lastName, String email, String password, int age, Gender gender) {
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public static class Builder{

        private String login;
        private String name;
        private String lastName;
        private String email;
        private String password;
        private int age;
        private Gender gender;


        public Builder(String login, String name, String lastName, String email, String password, int age, Gender gender) {
            this.login = login;
            this.name = name;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.age = age;
            this.gender = gender;
        }

        public Builder(){
        }

       public Builder setLogin(String login){
            this.login = login;
            return this;
       }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public User bild(){
            return new User(login, name, lastName, email, password, age, gender);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "login='" + login + '\'' +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}

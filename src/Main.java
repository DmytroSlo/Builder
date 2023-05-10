public class Main {
    public static void main(String[] args) {

        User user = new User.Builder().setLogin("Admin")
                .setName("Janusz")
                .setLastName("Kowalski")
                .setName("januszek@gmail.com")
                .setAge(44)
                .setPassword("Jan228")
                .setGender(Gender.MALE).bild();

        System.out.println(user);

    }
}
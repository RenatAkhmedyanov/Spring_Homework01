import com.google.gson.Gson;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", 20);
        Gson gson = new Gson();
        String toJson = gson.toJson(person);
        Person fromJson = gson.fromJson(toJson, Person.class);
        System.out.printf("Имя: %s \nФамилия: %s \nВозраст: %d", fromJson.firstName, fromJson.lastName, fromJson.age);
    }
}

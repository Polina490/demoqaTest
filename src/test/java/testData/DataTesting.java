package testData;

import com.github.javafaker.Faker;

public class DataTesting {
    static Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String lastName=faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String phoneNumber = faker.number().digits(10);
    public String address = faker.address().fullAddress();
    public String yearOfBirth = faker.number().numberBetween(1900,2021)+"";
    public String month = "May";
}

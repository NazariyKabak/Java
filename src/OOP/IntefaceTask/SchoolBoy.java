package OOP.IntefaceTask;

import java.time.LocalDate;

public class SchoolBoy {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String phoneNumber;
    private Adress address;
    private String schoolName;
    private String schoolClass;
    private String nationality;
    private double weight;
    private double height;
    private LocalDate birthDate;
    private int grade;

    public SchoolBoy(String firstName, String lastName, int age, char gender,
                     String phoneNumber, Adress address, String schoolName,
                     String schoolClass, String nationality,
                     double weight, double height,
                     LocalDate birthDate, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
        this.nationality = nationality;
        this.weight = weight;
        this.height = height;
        this.birthDate = birthDate;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public class Adress {

        private String postalCode;
        private String country;
        private String region;
        private String district;
        private String city;
        private String street;
        private String houseNumber;
        private String apartmentNumber;

        public Adress(String postalCode, String country, String region, String district,
                      String city, String street, String houseNumber, String apartmentNumber) {
            this.postalCode = postalCode;
            this.country = country;
            this.region = region;
            this.district = district;
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
            this.apartmentNumber = apartmentNumber;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
        }

        public String getApartmentNumber() {
            return apartmentNumber;
        }

        public void setApartmentNumber(String apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }



    }

    public void studentInfo(){
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);

        System.out.println("Пол: " + gender);
        System.out.println("Национальность: " + nationality);
        System.out.println("Рост: " + height + " см");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Домашний адрес: " + address.street + ", " +
                address.houseNumber + ", кв. " + address.apartmentNumber + ", " +
                address.city + ", " + address.region + ", " + address.country + ", " +
                address.postalCode);
        System.out.println("Школа: " + schoolName);
        System.out.println("Класс: " + schoolClass);
    }
}

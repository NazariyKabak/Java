package OOP.IntefaceTask;

import java.time.LocalDate;

public class Sudent {
    private String firstName;
    private String lastName;
    private char gender;
    private String nationality;
    private LocalDate birthDate;
    private String numberPhone;
    private Adress address;
    private String university;
    private int course;
    private String group;
    private double avg;
    private String speciality;

    public Sudent(String firstName, String lastName, char gender, String nationality, LocalDate birthDate,
                  String numberPhone, Adress address, String university, int course, String group,
                  double avg, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.numberPhone = numberPhone;
        this.address = address;
        this.university = university;
        this.course = course;
        this.group = group;
        this.avg = avg;
        this.speciality = speciality;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

        public Adress(String postalCode, String country, String region, String district, String city,
                      String street, String houseNumber, String apartmentNumber) {
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
    public void print(){
        System.out.println(firstName);
        System.out.println(firstName);
        System.out.println(university);
        System.out.println(speciality);
        System.out.println(gender);
        System.out.println(group);
        System.out.println(address.country+address.city);
    }
}
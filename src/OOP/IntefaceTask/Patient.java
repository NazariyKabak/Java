package OOP.IntefaceTask;

import java.time.LocalDate;

public class Patient {
    private String firstName;
    private String lastName;
    private char gender;
    private double height;
    private double weight;
    private LocalDate birthDate;
    private Adress address;
    private int numHospital;
    private String department;
    private int numMedicalCard;
    private String diagnosis;
    private String bloodType;

    public Patient(String firstName, String lastName, char gender, double height, double weight, LocalDate birthDate,
                   Adress address, int numHospital, String department,
                   int numMedicalCard, String diagnosis, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.address = address;
        this.numHospital = numHospital;
        this.department = department;
        this.numMedicalCard = numMedicalCard;
        this.diagnosis = diagnosis;
        this.bloodType = bloodType;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public int getNumHospital() {
        return numHospital;
    }

    public void setNumHospital(int numHospital) {
        this.numHospital = numHospital;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumMedicalCard() {
        return numMedicalCard;
    }

    public void setNumMedicalCard(int numMedicalCard) {
        this.numMedicalCard = numMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
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
}

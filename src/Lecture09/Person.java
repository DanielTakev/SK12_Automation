package Lecture09;

/*
Create class Person which has the following attributes: name, gender, religion, language spoken, job, nationality, EGN, date of birth, age, country of residence.
        The date of birth attribute and age are composed during the creation of an object based on the EGN.
        EGN consists of 10 digits. If provided value for EGN is not correct throw exception.
        If wrong gender is provided program must continue its normal execution with printing relevant message.
        Only job and country of residence could change their values. All other attributes can`t be changes once they are set.

        The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant parameters if any.
        sayHello() should print Hello based on concrete person spoken language, default is in English.
        celebrateEaster should print if the concrete person celebrates Easter based on their religion.
        isAdult should take in consideration the country of residence.
        canTakeLoan is based on the job.
        Languages – Bulgarian / Italian / English; Countries – Bulgaria (18) / Italy (18) / USA (21); gender – Male / Female
        Religions – Orthodox / Catholic / Islam
*/

import java.time.LocalDate;

abstract public class Person {
    protected final String name;
    protected final String gender;
    protected final String language;
    protected String job;
    protected final String nationality;
    protected final String EGN;
    protected final String birthDate;

    protected final Religion religion;
//    protected final Religion religion;
    protected String country;
    protected final int age;

    public Person(String name, String gender, String language, String job, String nationality, String EGN, String country, Religion religion) {
        checkEGN(EGN);
        this.gender = getGender(gender);
        this.EGN = EGN;
        this.name = name;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        this.religion = religion;
        this.age = calculateAge(this.EGN);
        this.birthDate = calculateBirthDay(EGN);
    }

    public Person(String name, String gender, String language, String nationality, String EGN, Religion religion, String country) {
        this(name, gender, language, null, nationality, EGN, country, religion);
    }

    public void checkEGN(String EGN) {
        int egnLength = EGN.length();
        // RegEx `\\d+` match one or more consecutive digits (0-9) in a string
        if (!(egnLength == 10 && EGN.matches("\\d+"))) {
            throw new RuntimeException("The EGN must be exactly 10 digits.");
        }
    }

    public String getGender(String gender) {
        if (gender == "Female" || gender == "Male") {
            return gender;
        } else {
            System.out.println("Invalid gender provided!");
            return "Female";
        }
    }

    private int calculateAge(String EGN) {
        String birthYearString;

        int currentYear = LocalDate.now().getYear();

        String yearDigits = EGN.substring(0, 2);
        String monthDigits = EGN.substring(2, 4);

        int monthDigitsInt = Integer.parseInt(monthDigits);

        if (monthDigitsInt > 40) {
            birthYearString = "20" + yearDigits;
        } else {
            birthYearString = "19" + yearDigits;
        }
        int birthYear = Integer.parseInt(birthYearString);

        return currentYear - birthYear;
    }

    private String calculateBirthDay(String EGN) {
        String monthDigits = EGN.substring(2, 4);
        String dayDigits = EGN.substring(4, 6);

        int monthDigitsInt = Integer.parseInt(monthDigits);
        int monthNumber = monthDigitsInt;

        if (monthDigitsInt > 40) {
            monthNumber -= 40;
        }
        // dd-mm
        return dayDigits + "-" + monthNumber;
    }

//    abstract public void sayHello();
    public void sayHello() {
        System.out.println("Hello");
    };

    public void celebrateEaster() {
        if (this.religion == Religion.ORTHODOX || this.religion == Religion.CATHOLIC) {
            System.out.println("I celebrate Easter.");
        } else {
            System.out.println("I don't celebrate Easter.");
        }
    }

    abstract public Boolean isAdult();

    public Boolean canTakeLoan() {
        return (this.job != null && isAdult());
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getLanguage() {
        return language;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEGN() {
        return EGN;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String toString =
                "Name: " + this.name + "\n"
                        + "Age: " + this.age + "\n"
                        + "EGN: " + this.EGN + "\n"
                        + "gender: " + this.gender + "\n"
                        + "Birth day: " + this.birthDate + "\n"
                        + "Religion: " + this.religion + "\n"
                        + "Nationality: " + this.nationality + "\n"
                        + "Country: " + this.country + "\n"
                        + "Language: " + this.language + "\n"
                        + "Job: " + this.job + "\n"
                        + "Adult: " + isAdult() + "\n";
        return toString;
    }
}

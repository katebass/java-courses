package com.company;

import java.time.LocalDate;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Cube

    Module 2 Task 4. Programming patterns. Factory, Builder.

    Task description:
    3. Create a class Student.
    4. Create a builder for the class Student

*/

/*
    Class Student: represents a person who is trudying at university
*/
public class Student {

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private Speciality speciality;
    private Gender gender;
    private String faculty;
    private String groupNumber;
    private String curator;
    private String pasportSeries;
    private int pasportNumber;
    private int identificationNumber;
    private int course;
    private String academicDegree;
    private String sportSection;
    private Float averageMark;
    private String citizenship;
    private boolean isContractor;
    private boolean isUnionist;
    private boolean hasScholarship;
    private boolean hasSocialBenefit;
    private String previousEducation;
    private String registrationCity;
    private String registrationAddress;
    private int postIndex;
    private String characteristics;
    private boolean isFullTimeEducation;
    private boolean isDutyBound;
    private String motherName;
    private String motherPhone;
    private String fatherName;
    private String fatherPhone;
    private String bankDetails;

    public Student() {
    }

    public Student(String firstName, String lastName, String patronymic, LocalDate birthday, Speciality speciality,
                   Gender gender, String faculty, String groupNumber, String curator, String pasportSeries,
                   int pasportNumber, int identificationNumber, int course, String academicDegree, String sportSection,
                   Float averageMark, String citizenship, boolean isContractor, boolean isUnionist,
                   boolean hasScholarship, boolean hasSocialBenefit, String previousEducation, String registrationCity,
                   String registrationAddress, int postIndex, String characteristics, boolean isFullTimeEducation,
                   boolean isDutyBound, String motherName, String motherPhone, String fatherName, String fatherPhone,
                   String bankDetails) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.speciality = speciality;
        this.gender = gender;
        this.faculty = faculty;
        this.groupNumber = groupNumber;
        this.curator = curator;
        this.pasportSeries = pasportSeries;
        this.pasportNumber = pasportNumber;
        this.identificationNumber = identificationNumber;
        this.course = course;
        this.academicDegree = academicDegree;
        this.sportSection = sportSection;
        this.averageMark = averageMark;
        this.citizenship = citizenship;
        this.isContractor = isContractor;
        this.isUnionist = isUnionist;
        this.hasScholarship = hasScholarship;
        this.hasSocialBenefit = hasSocialBenefit;
        this.previousEducation = previousEducation;
        this.registrationCity = registrationCity;
        this.registrationAddress = registrationAddress;
        this.postIndex = postIndex;
        this.characteristics = characteristics;
        this.isFullTimeEducation = isFullTimeEducation;
        this.isDutyBound = isDutyBound;
        this.motherName = motherName;
        this.motherPhone = motherPhone;
        this.fatherName = fatherName;
        this.fatherPhone = fatherPhone;
        this.bankDetails = bankDetails;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public String getPasportSeries() {
        return pasportSeries;
    }

    public void setPasportSeries(String pasportSeries) {
        this.pasportSeries = pasportSeries;
    }

    public int getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(int pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getSportSection() {
        return sportSection;
    }

    public void setSportSection(String sportSection) {
        this.sportSection = sportSection;
    }

    public Float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Float averageMark) {
        this.averageMark = averageMark;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public boolean isContractor() {
        return isContractor;
    }

    public void setContractor(boolean contractor) {
        this.isContractor = contractor;
    }

    public boolean isUnionist() {
        return isUnionist;
    }

    public void setUnionist(boolean unionist) {
        this.isUnionist = unionist;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public boolean isHasSocialBenefit() {
        return hasSocialBenefit;
    }

    public void setHasSocialBenefit(boolean hasSocialBenefit) {
        this.hasSocialBenefit = hasSocialBenefit;
    }

    public String getPreviousEducation() {
        return previousEducation;
    }

    public void setPreviousEducation(String previousEducation) {
        this.previousEducation = previousEducation;
    }

    public String getRegistrationCity() {
        return registrationCity;
    }

    public void setRegistrationCity(String registrationCity) {
        this.registrationCity = registrationCity;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public boolean isFullTimeEducation() {
        return isFullTimeEducation;
    }

    public void setFullTimeEducation(boolean fullTimeEducation) {
        this.isFullTimeEducation = fullTimeEducation;
    }

    public boolean isDutyBound() {
        return isDutyBound;
    }

    public void setDutyBound(boolean dutyBound) {
        this.isDutyBound = dutyBound;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherPhone() {
        return fatherPhone;
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    // Class Builder, represents the programming pattern 'Builder' for class Student
    public static class Builder {
        private Student studentToBuild;

        // constructor
        public Builder() {
            this.studentToBuild = new Student();
        }

        // method for programming pattern Builder, which creates a class instance Student
        // similar to another provided Student instance
        public Builder setSimilarTo(Student student) {
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.groupNumber = student.groupNumber;
            this.studentToBuild.curator = student.curator;
            this.studentToBuild.pasportSeries = student.pasportSeries;
            this.studentToBuild.pasportNumber = student.pasportNumber;
            this.studentToBuild.identificationNumber = student.identificationNumber;
            this.studentToBuild.course = student.course;
            this.studentToBuild.academicDegree = student.academicDegree;
            this.studentToBuild.sportSection = student.sportSection;
            this.studentToBuild.averageMark = student.averageMark;
            this.studentToBuild.citizenship = student.citizenship;
            this.studentToBuild.isContractor = student.isContractor;
            this.studentToBuild.isUnionist = student.isUnionist;
            this.studentToBuild.hasScholarship = student.hasScholarship;
            this.studentToBuild.hasSocialBenefit = student.hasSocialBenefit;
            this.studentToBuild.previousEducation = student.previousEducation;
            this.studentToBuild.registrationCity = student.registrationCity;
            this.studentToBuild.registrationAddress = student.registrationAddress;
            this.studentToBuild.postIndex = student.postIndex;
            this.studentToBuild.characteristics = student.characteristics;
            this.studentToBuild.isFullTimeEducation = student.isFullTimeEducation;
            this.studentToBuild.isDutyBound = student.isDutyBound;
            this.studentToBuild.motherName = student.motherName;
            this.studentToBuild.motherPhone = student.motherPhone;
            this.studentToBuild.fatherName = student.fatherName;
            this.studentToBuild.fatherPhone = student.fatherPhone;
            this.studentToBuild.bankDetails = student.bankDetails;

            return this;
        }

        // setters for programming pattern Builder
        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic) {
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setBirthday(LocalDate birthday) {
            studentToBuild.setBirthday(birthday);
            return this;
        }

        public Builder setSpeciality(Speciality speciality) {
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setGender(Gender gender) {
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setFaculty(String faculty) {
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setGroupNumber(String groupNumber) {
            studentToBuild.setGroupNumber(groupNumber);
            return this;
        }

        public Builder setCurator(String curator) {
            studentToBuild.setCurator(curator);
            return this;
        }

        public Builder setPasportSeries(String pasportSeries) {
            studentToBuild.setPasportSeries(pasportSeries);
            return this;
        }

        public Builder setPasportNumber(int pasportNumber) {
            studentToBuild.setPasportNumber(pasportNumber);
            return this;
        }

        public Builder setIdentificationNumber(int identificationNumber) {
            studentToBuild.setIdentificationNumber(identificationNumber);
            return this;
        }

        public Builder setCourse(int course) {
            studentToBuild.setCourse(course);
            return this;
        }

        public Builder setAcademicDegree(String academicDegree) {
            studentToBuild.setAcademicDegree(academicDegree);
            return this;
        }

        public Builder setSportSection(String sportSection) {
            studentToBuild.setSportSection(sportSection);
            return this;
        }

        public Builder setAverageMark(Float averageMark) {
            studentToBuild.setAverageMark(averageMark);
            return this;
        }

        public Builder setCitizenship(String citizenship) {
            studentToBuild.setCitizenship(citizenship);
            return this;
        }

        public Builder setContractor(boolean contractor) {
            studentToBuild.setContractor(contractor);
            return this;
        }

        public Builder setUnionist(boolean unionist) {
            studentToBuild.setUnionist(unionist);
            return this;
        }

        public Builder setHasScholarship(boolean hasScholarship) {
            studentToBuild.setHasScholarship(hasScholarship);
            return this;
        }

        public Builder setHasSocialBenefit(boolean hasSocialBenefit) {
            studentToBuild.setHasSocialBenefit(hasSocialBenefit);
            return this;
        }

        public Builder setPreviousEducation(String previousEducation) {
            studentToBuild.setPreviousEducation(previousEducation);
            return this;
        }

        public Builder setRegistrationCity(String registrationCity) {
            studentToBuild.setRegistrationCity(registrationCity);
            return this;
        }

        public Builder setRegistrationAddress(String registrationAddress) {
            studentToBuild.setRegistrationAddress(registrationAddress);
            return this;
        }

        public Builder setPostIndex(int postIndex) {
            studentToBuild.setPostIndex(postIndex);
            return this;
        }

        public Builder setCharacteristics(String characteristics) {
            studentToBuild.setCharacteristics(characteristics);
            return this;
        }

        public Builder setFullTimeEducation(boolean fullTimeEducation) {
            studentToBuild.setFullTimeEducation(fullTimeEducation);
            return this;
        }

        public Builder setDutyBound(boolean dutyBound) {
            studentToBuild.setDutyBound(dutyBound);
            return this;
        }

        public Builder setMotherName(String motherName) {
            studentToBuild.setMotherName(motherName);
            return this;
        }

        public Builder setMotherPhone(String motherPhone) {
            studentToBuild.setMotherPhone(motherPhone);
            return this;
        }

        public Builder setFatherName(String fatherName) {
            studentToBuild.setFatherName(fatherName);
            return this;
        }

        public Builder setFatherPhone(String fatherPhone) {
            studentToBuild.setFatherPhone(fatherPhone);
            return this;
        }

        public Builder setBankDetails(String bankDetails) {
            studentToBuild.setBankDetails(bankDetails);
            return this;
        }

        public Student build(){
            return studentToBuild;
        }

    }
}

package App;

import java.time.LocalDate;

public class personne {


    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth ;


    public personne(String name , String email , String phoneNumber , LocalDate dateOfBirth)  {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber ;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

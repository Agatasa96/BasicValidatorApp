package basic.app.validator;

import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    @PESEL
    private String pesel;
    @Size(min = 3, max = 15, message = "Opis musi byc dluzszy niz 3 znaki i krótszy niz 15")
    private String description;
    @StartWith("A")
    private String textThatStartWithA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTextThatStartWithA() {
        return textThatStartWithA;
    }

    public void setTextThatStartWithA(String textThatStartWithA) {
        this.textThatStartWithA = textThatStartWithA;
    }
}

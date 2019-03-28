package my.app;
import java.util.Date;
import my.app.enums.LifeStatus;

public class Person {

  private String firstName;
  private String lastName;
  private Date birthDate;
  private LifeStatus lifeStatus;
  private String description;

  public String getFirstName() {return firstName;}
  public String getLastName()  {return lastName;}
  public String getBirthDate() {return birthDate.toString();}
  public String getDescription() {return description;}
  public LifeStatus getLifeStatus() { return lifeStatus;}

  public void setFirstName(String name) {firstName = name;}
  public void setLastName(String name) {lastName = name;}
  public void setBirthDate(Date date) {birthDate = date;}
  public void setLifeStatus(LifeStatus status) {lifeStatus = status;}
  public void setDescription(String newDescription) {description = newDescription;}
}

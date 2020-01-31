package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Voter {

    private String voterId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private int age;
    private boolean isActive;
    private Set<Vote> votes;

   public Voter(String firstName, String lastName,int age, String login, String password){
        this.voterId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;
        this.votes = new HashSet<Vote>();
    }

        public Voter(){
            this.votes = new HashSet<Vote>();

      }

    public Voter(String login, String password){
       this.login = login;
       this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVoterId() {
        return voterId;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

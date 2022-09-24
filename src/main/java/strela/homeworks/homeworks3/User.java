package strela.homeworks.homeworks3;

import java.util.Scanner;

public class User {
   String name;
   String surname;
   String email;
   String password;
   String gender;
   String country;

   public User() {

   }

   public User(String name, String surname, String email, String password, String gender, String country) {
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.password = password;
      this.gender = gender;
      this.country = country;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public boolean equals(Object obj) {
      return (this == obj);
   }
   public void read(){
      System.out.println();
   }
   public Scanner write(){
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      System.out.println(str);
      return scanner;
   }

}

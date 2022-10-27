package Uppgift3;

public class Person {

    String firstName;
    String lastName;
    String favouriteMovie;


    public Person(String firstName, String lastName, String favouriteMovie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteMovie = favouriteMovie;
    }

    public Person() {
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

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favouriteMovie='" + favouriteMovie + '\'' +
                '}';
    }
}




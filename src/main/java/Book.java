
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object to a Bird object
        Book comparedBook = (Book) compared;

        // if the values of the object variables are equal, the objects are, too
        return (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear);

        /*
        // the comparison of names above is equal to
        // the following code

        if (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
        */
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}

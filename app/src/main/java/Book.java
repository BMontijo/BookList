// Represents a book object
// holds Title, Author, Publish Year
public class Book {
    private String mBookTitle;
    private String mAuthor;
    private String mPubYear;

    public Book (String bTitle, String bAuthor, String bPubYear) {
        mBookTitle = bTitle;
        mAuthor = bAuthor;
        mPubYear = bPubYear;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmPubYear() {
        return mPubYear;
    }
}

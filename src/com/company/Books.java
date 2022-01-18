package com.company;

public class Books {
    private String bookName;
    private String authorName;
    private int codeISBN;
    private String bookGenre;

    public Books(String bookName, String authorName, int codeISBN, String bookGenre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.codeISBN = codeISBN;
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", codeISBN=" + codeISBN +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(int codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }
}


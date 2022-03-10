package Lesson4_1702.Task1;

public class Book {

    private int yearOfPublic, pages;
    private String title;

    public Book() {
    }

    public Book(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        if (yearOfPublic > 2022) {
            System.out.println("Проверка не прошла");
        }else {
            this.yearOfPublic = yearOfPublic;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearOfPublic=" + yearOfPublic +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                '}';
    }
}

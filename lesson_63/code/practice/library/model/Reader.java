package practice.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    private String fio;
    private String email;
    private boolean subscriber;//является ли читатель подписчиком нашей библиотеки
    private List<Book> books;

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books=new ArrayList<>();//завели формуляр
    }
    public Reader(String fio, String email){
        this.fio = fio;
        this.email = email;
    }

    public boolean isSubscriber(){
        return subscriber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reader{");
        sb.append("fio='").append(fio).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", subscriber=").append(subscriber);
        sb.append(", books=").append(books);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        return Objects.equals(email, reader.email);
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}

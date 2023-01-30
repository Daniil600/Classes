package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author_CaptainDaughter = new Author("Александр", "Пушкин");
        Author author_Radunitsa = new Author("Сергей", "Есенин");
        Book captainDaughter = new Book("Капитанская дочка", author_CaptainDaughter, 1836);
        Book radunitsa = new Book("Радуница", author_CaptainDaughter, 1836);

        System.out.println("captainDaughter.getNameBook() = " + captainDaughter.getNameBook());
        System.out.println("author_CaptainDaughter.getFullName() = " + author_CaptainDaughter.getFullName());
        System.out.println("captainDaughter.getYearPublication() = " + captainDaughter.getYearPublication());
        captainDaughter.setYearPublication(2033);
        System.out.println("captainDaughter.getYearPublication() = " + captainDaughter.getYearPublication());

        System.out.println();

        System.out.println("radunitsa.getNameBook() = " + radunitsa.getNameBook());
        System.out.println("author_Radunitsa.getFullName() = " + author_Radunitsa.getFullName());
        System.out.println("radunitsa.getYearPublication() = " + radunitsa.getYearPublication());

    }
}
public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил Булгаков");
        Author king = new Author("Стивен Кинг");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1967);
        Book greenMile = new Book("Зеленая миля", king, 1996);
        System.out.println("masterAndMargarita.getYear() = " + masterAndMargarita.getYear());
        masterAndMargarita.setYear(1968);
        System.out.println("masterAndMargarita.getYear() = " + masterAndMargarita.getYear());
    }
}
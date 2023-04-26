public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил Булгаков");
        Author king = new Author("Стивен Кинг");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1967);
        Book masterAndMargarita1 = new Book("Мастер и Маргарита", bulgakov, 1967);
        Book greenMile = new Book("Зеленая миля", king, 1996);
        Book greenMile1 = new Book("Зеленая миля", king, 1996);
        System.out.println("masterAndMargarita.getYear() = " + masterAndMargarita.getYear());
        masterAndMargarita.setYear(1968);
        System.out.println("masterAndMargarita.getYear() = " + masterAndMargarita.getYear());
        System.out.println(masterAndMargarita);
        System.out.println(greenMile.equals(greenMile1));
        System.out.println(masterAndMargarita.equals(masterAndMargarita1));
    }
}
public class Main {
    public static void main(String[] args) {


        // 1 вопрос - как сравнить строки?
        String cats = "2 рыжих котенка";
        String moreCats = "2 белых котенка";
        if (cats.equals(moreCats)) {
            // использую метод equals
            System.out.println("Да, котята похожи");
        } else {
            System.out.println("Котята разного цвета");
        }


        // 2 вопрос - когда применяется ключевое слово this?
        class Girl {
            int age;
            int weight;
            int height;

            Girl(int age, int weight) {
                // тут пишем код
            }


            Girl(int age, int weight, int height) {
                this(age, weight);
                // беру конструктор с 2 параметрами с помощью this
                this.height = height;
                // добавляю нужную переменную
                // ключевое слово this тут, чтобы явно показать, к какой конкретно переменной мы обращаемся
            }
        }


        // 3 вопрос - что такое сигнатура метода?
        // показываю сигнатуру


        // Задача
        // Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И.О. Автора.

        String[] books = new String[2];
        books[0] = "«Изучаем java»";
        books[1] = "«Java руководство для начинающих»";

        String[] authors = new String[2];
        authors[0] = "Кэти Сьерра и Берт Бейтс";
        authors[1] = "Герберт Шилдт";

        System.out.println(books[0] + " " + authors[0]);
        System.out.println(books[1] + " " + authors[1]);

    }
}
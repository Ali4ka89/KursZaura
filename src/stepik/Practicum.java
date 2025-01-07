package stepik;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        // Курсы валют
        double exchangeRateUSD = 94.8;
        double exchangeRateEUR = 103.8;
        double exchangeRateCNY = 13.1;

        // Процентные ставки
        double interestRateRUB = 7;
        double interestRateUSD = 1;
        double interestRateEUR = 0.8;
        double interestRateCNY = 1.5;

        // Вывод меню
        System.out.println("Введите номер валюты:");
        System.out.println("1 – рубли;");
        System.out.println("2 – доллары;");
        System.out.println("3 – евро;");
        System.out.println("4 – юани.");

        // посчитайте номер валюты и сохраните в переменную currency
        Scanner sc = new Scanner(System.in);

        // объявите переменную exchangeRate для курса и проинициализируйте единицей
        int currency= sc.nextInt();
        // объявите переменную interestRate для процентной ставки
        System.out.println("Введите начальную сумму в выбранной валюте:");
        double interestRate  = sc.nextDouble();
        double amount  = sc.nextDouble();
        // объявите переменную currencySymbol для обозначения аббревиатуры валюты

        System.out.println("Введите количество лет для расчёта:");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {
            amount = amount + amount * (interestRate / 100);
        }

        /* обновите значения переменных rate, interestRate и currencySymbol
           в зависимости от номера валюты */

        if (currency == 1) { // если валюта – рубль,
            interestRate = interestRateRUB; // устанавливаем соответствующую ставку,
           int currencySymbol =currency ; // устанавливаем код валюты
        } else if (currency == 2) { // если валюта – доллар,
            interestRate = interestRateUSD ; // устанавливаем курс обмена, ставку и код валюты
            double currencySymbol =interestRateCNY; // добавьте условия для евро и юаней
        } else {
            System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
            /* обновите переменные
               interestRate и currencySymbol
               для валюты по умолчанию – рублей */
        }




        System.out.println("К окончанию срока сумма составит: " + amount + " " + currencySymbol);
    }
}
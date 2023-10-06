public class Main {
    public static void main(String[] args) {
        int amountNow = 100; // Сумма на счету
        int bonus = 1000; // Количество рублей для получения бонуса
        int dep = 1121; // Сумма пополнения
        if (dep > bonus) {
            System.out.println("Начисленно бонусов - " + (dep / 100) + ", итоговая сумма на счете - " + (amountNow + (dep / 100 + dep) + " рублей"));
        } else {
            System.out.println("Итоговая сумма на счете - " + (amountNow + dep) + " рублей");
        }
    }
}

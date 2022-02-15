public class main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива!");

        int fuelType = 95;
        int amount = 500;
        int maxAmount = 400;

        double fuel92Price = 48.80;
        double fuel95Price = 50.2;
        double fuelPrice = 0;

        if(fuelType == 92){
            fuelPrice = fuel92Price;
        } else if (fuelType == 95){
            fuelPrice = fuel95Price;
        }else {
            System.out.println("Указан неверный тип топлива!!");
        }

        if(amount < 1){
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = 400;
            System.out.println("Топливо уменьшено до приемлемого! И равно " + amount + " л.");

        }

        System.out.println("Цена выбрнного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }

}

import jdk.internal.access.JavaSecurityAccess;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

      //1.
        VipClient vipClient = new VipClient("Max","Muller", LocalDate.of(1980,9,17));

       //2.
        StandartClient standartClient1 = new StandartClient("Ira","Ivanova", LocalDate.of(1990,5,3));
        StandartClient standartClient2 = new StandartClient("Petra","Zimmerman", LocalDate.of(1960,2,19));

       //3.
        System.out.println(standartClient1.calculateClientPresent());

        //4.
        System.out.println(vipClient.calculateClientPresent());

        //5.
        PaidCard paidCardVip = new PaidCard();
        vipClient.setPaidCard(paidCardVip);
        HashMap<LocalDate, Integer> paymentMapVip = new HashMap<>();
        paymentMapVip.put(LocalDate.of(2024, 1, 1), 1000);
        paidCardVip.setPaidMoney(paymentMapVip);

        //6.
        paymentMapVip.put(LocalDate.of(2024,3,15), 1000);
        paidCardVip.setPaidMoney(paymentMapVip);

        //7.
        PaidCard paidCardStandart = new PaidCard();
        standartClient1.setPaidCard(paidCardStandart);
        HashMap<LocalDate, Integer> paymentMapStandart = new HashMap<>();
        paymentMapStandart.put(LocalDate.of(2022,12,15), 500);
        paidCardStandart.setPaidMoney(paymentMapStandart);

        //8.
       paymentMapStandart.put(LocalDate.of(2022,12,19), 500);
       paidCardStandart.setPaidMoney(paymentMapStandart);

       //9.
         DebtService debtService = new DebtService();
         System.out.println(debtService.isDebtorByCard(paidCardVip));

         //10.
        System.out.println(debtService.isDebtorByCard(paidCardStandart));

        //11.
        System.out.println(debtService.cancelDebts(vipClient));

        //12.
        System.out.println(debtService.cancelDebts(standartClient1));

        //13.
        Employee employee = new Employee("Oleg","Bondarenko", LocalDate.of(1991,8,21));

        //14.
        System.out.println(employee.needMedicalInsurance());

        //15.
        System.out.println(vipClient.needMedicalInsurance());

        //16.
        System.out.println(standartClient1.NeedMedicalInsurance());

    }
}



/*      1. Создать вип клиент

        2.Создать 2 стандартных

        3. Посчитать сумму подарка для стандартног клиента

        4.Посчитать сумму подарка для  вип клиента

        5.Вип клиент оплатил 01 января  2024 1000

        6. Вип клиент оплатил 15 марта 2024 1000

        7. Стандартный  клиент оплатил 15 декабря  2022 500

        8.Стандартный  клиент оплатил 19 декабря  2022 500

        9. Должник ли вип клиент?

        10. Должник ли стандартный клиент?

        11. Может ли списать долги аип клиенту?

        12. Может ли списать долги стандартному клиенту?

        13.Создать сотрудника

        14.Нужна ли страховка сотруднику?
        15.Нужна ли страховка вип клиенту?
        16.Нужна ли страховка стандартному клиенту?	*/
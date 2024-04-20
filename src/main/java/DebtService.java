import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.TreeMap;

public class DebtService {
    public boolean isDebtorByCard(PaidCard paidCard) {
        LocalDate paidDate = null;
        for (LocalDate key : paidCard.getPaidMoney().keySet()) {
            paidDate = key;
        }
        Period period = Period.between(paidDate,LocalDate.now());
        int days = period.getDays();
        if (paidCard.getClientType() == ClientType.VIP && days >= 90) return true;
        if (paidCard.getClientType() == ClientType.STANDART && days > 30) return true;
        return false;
    }
    public boolean cancelDebts(Client client) {
        TreeMap<LocalDate, Integer> map = new TreeMap<>(client.getPaidCard().getPaidMoney());
        Map.Entry<LocalDate, Integer> lastDate = null;
        Map.Entry<LocalDate, Integer> prelastDate = null;
        for (Map.Entry<LocalDate, Integer> entry : map.entrySet()) {
            lastDate = entry;
            prelastDate = lastDate;
        }
        if (client.isActive() && lastDate.getValue() > prelastDate.getValue()*2)
            return true;
        return false;
    }
}


/* если вип клиент не платил больше 90 дней - должник
   если cтандартный клиент не платил больше 30 дней - должник
  если клиент активный и заплатил в последний платеж  в 2 раза больше чем предыдущий его платеж  - снимаем долг */
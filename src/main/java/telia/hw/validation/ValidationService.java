package telia.hw.validation;

import org.springframework.stereotype.Service;
import telia.hw.infrastructure.exception.BusinessException;
import telia.hw.service.RaceAndBetRequest;


@Service
public class ValidationService {

    public void betWins(RaceAndBetRequest request, Integer winner) {
        if (!request.getBetOnHorseId().equals(winner)) {
            throw new BusinessException("Your bet didn't win", "Try next time");
        }
    }
//
//    public static final String ACCOUNT_NOT_EXISTS = "Sellist kontot ei eksisteeri";
//    public static final String DEPOSIT_OVER_LIMIT = "Deposiidi limiit on ületatud";
//    public static final String WITHDRAW_OVER_LIMIT = "Raha väljavõtmise limiit on ületatud";
//    public static final String INSUFFICIENT_FUNDS = "Kontol pole piisavalt vahendeid tehingu sooritamiseks";
//
//    public void accountExists(Integer accountId, Optional<Account> account) {
//        if (account.isEmpty()) {
//            throw new DataNotFoundException(ACCOUNT_NOT_EXISTS, "Kontot ID'ga " + accountId + " ei leitud");
//        }
//    }
//
//    public void accountExists(String accountNumber, Optional<Account> account) {
//        if (account.isEmpty()) {
//            throw new DataNotFoundException(ACCOUNT_NOT_EXISTS, "Kontot numbriga " + accountNumber + " kontot ei leitud");
//        }
//    }
//
//    public void isValidDepositAmount(Integer amount) {
//        // productionsis tuleks see väärtus andmebaasist
//        Integer limit = 5000;
//        if (amount > limit) {
//            throw new BusinessException(DEPOSIT_OVER_LIMIT, "Summa €" + amount + " ületab limiidi €" + limit);
//        }
//    }
//
//    public void isValidWithdrawAmount(Integer amount) {
//        // productionsis tuleks see väärtus andmebaasist
//        Integer limit = 15000;
//        if (amount > limit) {
//            throw new BusinessException(WITHDRAW_OVER_LIMIT, "Summa €" + amount + " ületab limiidi €" + limit);
//        }
//    }
//
//    public void isWithinBalance(Integer balance, Integer amount) {
//        if (amount > balance) {
//            throw new BusinessException(INSUFFICIENT_FUNDS, "Summa €" + amount + " ületab kontojääki €" + balance);
//        }
//    }
}

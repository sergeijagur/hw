package telia.hw.validation;

import org.springframework.stereotype.Service;
import telia.hw.domain.horse.Horse;
import telia.hw.domain.race.Race;
import telia.hw.domain.race_result.RaceResult;
import telia.hw.domain.user.User;
import telia.hw.infrastructure.exception.BusinessException;
import telia.hw.infrastructure.exception.DataNotFoundException;
import telia.hw.service.RaceAndBetRequest;

import java.util.Optional;
import java.util.zip.DataFormatException;


@Service
public class ValidationService {

    public void betWins(RaceAndBetRequest request, Integer winner) {
        if (!request.getBetOnHorseId().equals(winner)) {
            throw new BusinessException("Your bet didn't win", "Try next time");
        }
    }

    public void usernameExists(Optional<User> existUser) {
        if (existUser.isPresent()) {
            throw new BusinessException("Username already in use", "Try another username");
        }
    }

    public void isLoginOk(Optional<User> user) {
        if (user.isEmpty()) {
            throw new BusinessException("LogIn failed", "Control username or password or SignUp");
        }

    }

    public void horseNameExists(Optional<Horse> optionalHorse) {
        if (optionalHorse.isPresent()) {
            throw new BusinessException("Horse with this name already exists", "Try another name");
        }
    }

    public void isValidRaceResult(Optional<RaceResult> raceResult) {
        if (raceResult.isEmpty()) {
            throw new BusinessException("Race result not found", "Control data");
        }
    }

    public void raceExist(Optional<Race> race) {
        if (race.isPresent()) {
            throw new BusinessException("The race already exists", "Control race info");
        }
    }

    public void userResultsExist(Optional<RaceResult> controlResult) {
        if (controlResult.isEmpty()) {
            throw new BusinessException("Results were not found", "Play new games to get results");
        }
    }


//    public void accountExists(Integer accountId, Optional<Account> account) {
//        if (account.isEmpty()) {
//            throw new DataNotFoundException(ACCOUNT_NOT_EXISTS, "Kontot ID'ga " + accountId + " ei leitud");
//        }
//    }
//
//    public static final String ACCOUNT_NOT_EXISTS = "Sellist kontot ei eksisteeri";
//    public static final String DEPOSIT_OVER_LIMIT = "Deposiidi limiit on ületatud";
//    public static final String WITHDRAW_OVER_LIMIT = "Raha väljavõtmise limiit on ületatud";
//    public static final String INSUFFICIENT_FUNDS = "Kontol pole piisavalt vahendeid tehingu sooritamiseks";
//

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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Bank Account class")
public class BankAccountTest {
    @Test
    @DisplayName("Withdraw 500")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, 1);
        bankAccount.withdraw(300);
        Assertions.assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("deposit 400")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 1);
        bankAccount.deposit(600);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }
}

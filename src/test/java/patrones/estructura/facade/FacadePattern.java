package patrones.estructura.facade;

import org.junit.jupiter.api.Test;

public class FacadePattern {

    @Test
    public void methodTest() {

        // Arrange
        Bank bank = new Bank();
        BankFacade facade = new BankFacade(bank);
        long accountA = 12345;
        long accountB = 67890;
        
        // Act
        facade.transfer(accountA, accountB, 100.0);

        // Assert

    }

}

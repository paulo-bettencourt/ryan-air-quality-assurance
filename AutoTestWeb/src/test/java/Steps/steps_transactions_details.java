package Steps;

import Actions.Transactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_transactions_details {

    SharedDriver sharedDriver;
    Transactions transactions;


    public steps_transactions_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        transactions = new Transactions(sharedDriver);
    }


    @Then("^i can click on the first transaction$")
    public void iCanClickOnTheFirstTransaction() {
  transactions.ClickFirstTransaction();
    }

    @And("^i can see the transaction details$")
    public void iCanSeeTheTransactionDetails() {
  transactions.SeeTransactionDetails();
    }

    @And("^i am redirected to the transactions page$")
    public void iAmRedirectedToTheTransactionsPage() {
        transactions.TransactionsPage();
    }

    @And("^i am redirected to the empty transactions page$")
    public void iAmRedirectedToTheEmptyTransactionsPage() {
        transactions.EmptyTransactionsPage();
    }

}

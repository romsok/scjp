import com.megacorp.system.SimpleDB;
import com.megacorp.records.Account;
import static java.lang.System.out;

public class OutsideTest {
	public static void main(String[] args) {
		Account acct1 = new Account(200.50);
		Account acct2 = new Account(150.83);
		
		SimpleDB sd = new SimpleDB();
		
		out.println("acct1 init: " + acct1.getBallance());
		sd.withdraw(10.40,acct1);
		out.println("acct1 after withdrawing 10.40: " + acct1.getBallance());
		
		out.println("acct2 init: " + acct2.getBallance());
		sd.deposit(50.43,acct2);
		out.println("acct2 after depositing 50.43: " + acct2.getBallance());
		
		out.println("acct1 before transfering 23.75 to acct2: " + acct1.getBallance());
		out.println("acct2 before receiving 23.75 from acct1: " + acct2.getBallance());
	}
}
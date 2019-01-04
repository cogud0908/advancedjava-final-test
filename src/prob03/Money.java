package prob03;

public class Money {

	private int amount;

	public Money(int amount)
	{
		this.amount = amount;
	}
	
	public Money add(Money money)
	{		
		Money buffer = new Money(amount + money.getAmount());
		return buffer;
	}

	public Money minus(Money money)
	{
		
		Money buffer = new Money(amount - money.getAmount());
		return buffer;
	}

	public Money multiply(Money money)
	{
		Money buffer = new Money(amount * money.getAmount());
		return buffer;
	}

	public Money devide(Money money)
	{
		Money buffer = new Money(amount / money.getAmount());
		return buffer;
	}	
	
	public boolean equals(Money money) {
		
		if(money.getAmount() == amount)
			return true;
		else
		return false;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

package account;

public class practice {
 private String un;
 private long accno;
 private double bal;
 public account(String un, long accno,double bal) {
	 super();
	 this.setUn(accno);
	 this.setAccno(accno);
	 this.setBal(bal);
 }
  public String getUn() {
	  return un;
  }
  public void setUn(String un) {
	  this.un= un;
  }
	  public long getAccno() {
		  return accno;
	  }
	  public void setAccno(long accno) {
		  this.accno = accno;
	  }
	  public double getBal() {
		  return bal;
		  
	  }
		

	}

}

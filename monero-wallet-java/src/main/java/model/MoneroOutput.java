package model;

import java.math.BigInteger;

/**
 * Represents a Monero transaction output.
 */
public class MoneroOutput {

  private MoneroTx transaction;
  private BigInteger amount;
  private Boolean isSpent;
  
  public MoneroOutput() {
    super();
  }
  
  public MoneroOutput(MoneroTx transaction, BigInteger amount, Boolean isSpent) {
    super();
    this.transaction = transaction;
    this.amount = amount;
    this.isSpent = isSpent;
  }

  public MoneroTx getTransaction() {
    return transaction;
  }

  public void setTransaction(MoneroTx transaction) {
    this.transaction = transaction;
  }

  public BigInteger getAmount() {
    return amount;
  }

  public void setAmount(BigInteger amount) {
    this.amount = amount;
  }

  public Boolean getIsSpent() {
    return isSpent;
  }

  public void setIsSpent(Boolean isSpent) {
    this.isSpent = isSpent;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((amount == null) ? 0 : amount.hashCode());
    result = prime * result + ((isSpent == null) ? 0 : isSpent.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MoneroOutput other = (MoneroOutput) obj;
    if (amount == null) {
      if (other.amount != null) return false;
    } else if (!amount.equals(other.amount)) return false;
    if (isSpent == null) {
      if (other.isSpent != null) return false;
    } else if (!isSpent.equals(other.isSpent)) return false;
    return true;
  }
}

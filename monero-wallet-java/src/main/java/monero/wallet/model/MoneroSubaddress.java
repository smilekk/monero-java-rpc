package monero.wallet.model;

import java.math.BigInteger;

/**
 * Monero subaddress model.
 */
public class MoneroSubaddress {

  private Integer index;
  private String label;
  private String address;
  private BigInteger balance;
  private BigInteger unlockedBalance;
  private Boolean isMultisigImportNeeded;
  private Integer numUnspentOutputs;
  private Boolean isUsed;
  
  public Integer getIndex() {
    return index;
  }
  
  public void setIndex(Integer index) {
    this.index = index;
  }
  
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public BigInteger getBalance() {
    return balance;
  }
  
  public void setBalance(BigInteger balance) {
    this.balance = balance;
  }
  
  public BigInteger getUnlockedBalance() {
    return unlockedBalance;
  }
  
  public void setUnlockedBalance(BigInteger unlockedBalance) {
    this.unlockedBalance = unlockedBalance;
  }
  
  public Boolean isMultisigImportNeeded() {
    return isMultisigImportNeeded;
  }

  public void setMultisigImportNeeded(Boolean isMultisigImportNeeded) {
    this.isMultisigImportNeeded = isMultisigImportNeeded;
  }

  public Integer getNumUnspentOutputs() {
    return numUnspentOutputs;
  }
  
  public void setNumUnspentOutputs(Integer numUnspentOutputs) {
    this.numUnspentOutputs = numUnspentOutputs;
  }
  
  public Boolean isUsed() {
    return isUsed;
  }
  
  public void setUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("index: " + index + "\n");
    sb.append("label: " + label + "\n");
    sb.append("address: " + address + "\n");
    sb.append("balance: " + balance + "\n");
    sb.append("unlockedBalance: " + unlockedBalance + "\n");
    sb.append("isMultisigImportNeeded: " + isMultisigImportNeeded + "\n");
    sb.append("numUnspentOutputs: " + numUnspentOutputs + "\n");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((address == null) ? 0 : address.hashCode());
    result = prime * result + ((balance == null) ? 0 : balance.hashCode());
    result = prime * result + index;
    result = prime * result + (isMultisigImportNeeded ? 1231 : 1237);
    result = prime * result + (isUsed ? 1231 : 1237);
    result = prime * result + ((label == null) ? 0 : label.hashCode());
    result = prime * result + numUnspentOutputs;
    result = prime * result + ((unlockedBalance == null) ? 0 : unlockedBalance.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MoneroSubaddress other = (MoneroSubaddress) obj;
    if (address == null) {
      if (other.address != null) return false;
    } else if (!address.equals(other.address)) return false;
    if (balance == null) {
      if (other.balance != null) return false;
    } else if (!balance.equals(other.balance)) return false;
    if (index != other.index) return false;
    if (isMultisigImportNeeded != other.isMultisigImportNeeded) return false;
    if (isUsed != other.isUsed) return false;
    if (label == null) {
      if (other.label != null) return false;
    } else if (!label.equals(other.label)) return false;
    if (numUnspentOutputs != other.numUnspentOutputs) return false;
    if (unlockedBalance == null) {
      if (other.unlockedBalance != null) return false;
    } else if (!unlockedBalance.equals(other.unlockedBalance)) return false;
    return true;
  }
}
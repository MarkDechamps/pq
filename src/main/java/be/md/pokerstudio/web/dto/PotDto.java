package be.md.pokerstudio.web.dto;

import java.math.BigDecimal;

public class PotDto {
    BigDecimal pot;
    BigDecimal toCall;
    BigDecimal result;

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getPot() {
        return pot;
    }

    public void setPot(BigDecimal pot) {
        this.pot = pot;
    }

    public BigDecimal getToCall() {
        return toCall;
    }

    public void setToCall(BigDecimal toCall) {
        this.toCall = toCall;
    }
}

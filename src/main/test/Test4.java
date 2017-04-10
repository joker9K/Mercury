package main.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangwt on 2017/4/10.
 */
class EqualPrincipalInterest{
    public enum Status{
        STATUS_REPAID,STATUS_PAYAPPLY;
    }
    private Status status;

    private BigDecimal amount;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public EqualPrincipalInterest(Status status, BigDecimal amount) {
        this.status = status;
        this.amount = amount;
    }
}

public class Test4 {

    public static void main(String[] args) {
        List<EqualPrincipalInterest> list = Arrays.asList(new EqualPrincipalInterest(EqualPrincipalInterest.Status.STATUS_PAYAPPLY,new BigDecimal("100")),new EqualPrincipalInterest(EqualPrincipalInterest.Status.STATUS_REPAID,new BigDecimal("200")));
        System.out.println(list.parallelStream().filter(t->t.getStatus() == EqualPrincipalInterest.Status.STATUS_REPAID).map(EqualPrincipalInterest::getAmount).reduce(BigDecimal.ZERO,(result, element)->result = result.add(element)));
    }
}

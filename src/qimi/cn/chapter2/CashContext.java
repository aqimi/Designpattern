package qimi.cn.chapter2;

public class CashContext
{
    CashSuper	cashSuper;

    public CashContext(CashSuper cashSuper)
    {
        this.cashSuper = cashSuper;
    }

    public CashContext(String type)
    {
        if ("正常收费".equals(type))
        {
            cashSuper = (CashSuper) new CashNormal();
        }
        else if ("满300返100".equals(type))
        {
            cashSuper = (CashSuper) new CashReturn(300, 100);
        }
        else if ("打8折".equals(type))
        {
            cashSuper = (CashSuper) new CashRebate(0.8);
        }
    }

    public double acceptCash(double money)
    {
        return cashSuper.acceptCash(money);
    }
}

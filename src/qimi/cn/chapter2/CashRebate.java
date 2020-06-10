package qimi.cn.chapter2;

//打折收费子类
public class CashRebate {
    private double	moneyRebate	= 1;

    public CashRebate(double moneyRebate)
    {
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}

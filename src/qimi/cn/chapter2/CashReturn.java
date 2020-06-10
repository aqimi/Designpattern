package qimi.cn.chapter2;

//返利收费子类
public class CashReturn {
    private double	moneyCondition	= 0;
    private double	moneyReturn		= 0;

    public CashReturn(double moneyCondition, double moneyReturn)
    {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    public double acceptCash(double money)
    {
        double result = money;
        if (money >= moneyCondition)
        {
            result = money - money / moneyCondition * moneyReturn;
        }
        return result;
    }
}
package qimi.cn.chapter2;

//现金收费工厂类
public class CashFactory
{
    public static CashSuper createCash(String type)
    {
        CashSuper cs = null;
        if ("正常收费".equals(type))
        {
            cs = (CashSuper) new CashNormal();
        }
        else if ("满300返100".equals(type))
        {
            cs = (CashSuper) new CashReturn(300, 100);
        }
        else if ("打8折".equals(type))
        {
            cs = (CashSuper) new CashRebate(0.8);
        }

        return cs;
    }
}

package qimi.cn.chapter7;

//代理类
public class Proxy implements IGiveGift
{
    Pursuit gg;
    public Proxy(SchoolGirl mm)
    {
        gg = new Pursuit(mm);
    }
    public void giveChocolate()
    {
        gg.giveChocolate();
    }
    public void giveDolls()
    {
        gg.giveDolls();
    }
    public void giveFlowers()
    {
        gg.giveFlowers();
    }
}

package qimi.cn.chapter7;

//客户端代码
public class Main
{
    public static void main(String[] args)
    {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}





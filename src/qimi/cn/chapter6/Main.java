package qimi.cn.chapter6;

import java.io.Console;

//客户端代码
public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("小菜");

        System.out.println("\n");
        System.out.println("第一种装扮：");

        ConcreteDecorator.Sneakers pqx = new ConcreteDecorator.Sneakers();
        ConcreteDecorator.BigTrouser kk = new ConcreteDecorator.BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();


        System.out.println("\n");
        System.out.println("第二种装扮：");

        ConcreteDecorator.LeatherShoes px = new ConcreteDecorator.LeatherShoes();
        ConcreteDecorator.Tie ld = new ConcreteDecorator.Tie();
        ConcreteDecorator.Suit xz = new ConcreteDecorator.Suit();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();

        //测试换一种装饰方式
        System.out.println("\n");
        System.out.println("第三种装扮（测试）：");

        ConcreteDecorator.Sneakers pqx2 = new ConcreteDecorator.Sneakers();
        ConcreteDecorator.LeatherShoes px2 = new ConcreteDecorator.LeatherShoes();
        ConcreteDecorator.BigTrouser kk2 = new ConcreteDecorator.BigTrouser();
        ConcreteDecorator.Tie ld2 = new ConcreteDecorator.Tie();

        pqx2.decorate(person);
        px2.decorate(pqx2);
        kk2.decorate(px2);
        ld2.decorate(kk2);

        ld2.show();


    }
}


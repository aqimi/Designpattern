package qimi.cn.chapter6;

public class ConcreteDecorator {

    //具体服饰类（ConcreteDecorator）
    public class TShirts extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("大T恤");
        }
    }
    public static class BigTrouser extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("大裤衩");
        }
    }
    public static class Sneakers extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("破球鞋");
        }
    }
    public static class Suit extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("西装");
        }
    }
    public static class Tie extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("领带");
        }
    }
    public static class LeatherShoes extends Finery
    {
        public void show()
        {
            super.show();
            System.out.println("皮鞋");
        }
    }


}

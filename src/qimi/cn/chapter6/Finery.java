package qimi.cn.chapter6;

//服饰类（Decorator）
public class Finery extends Person
{
    protected Person    component;

    public void decorate(Person component)
    {
        this.component = component;
    }

    public void show()
    {
        if (null != component)
        {
            component.show();
        }
    }
}



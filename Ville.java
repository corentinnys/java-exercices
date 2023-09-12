import javax.xml.namespace.QName;

public class Ville {
    String name;
    int habitants;
    public static void main(String[] args)
    {

    }

    public void town (String nom, int habitants)
    {
        name = nom;
        habitants =habitants;
    }
    public String getName()
    {
        return name;
    }
    public static void setName(String name)
    {
        name = name;
    }
    public int  getHabitants()
    {
        return habitants;
    }
    public static void setHabitant(int habitants)
    {
        habitants = habitants;
    }

    public String tostring()
    {
        return "il y as "+getHabitants()+"dans la ville "+getName();
    }

}

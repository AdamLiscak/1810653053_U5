import javax.swing.*;

public class Aufgabe4 {
    public static void main(String[] args)
    {
    String var1= JOptionPane.showInputDialog("Bitte irgendwas eingem");
    String var2= JOptionPane.showInputDialog("Bitte irgendwas eingem");
    String var3= JOptionPane.showInputDialog("Bitte irgendwas eingem");

    String[] a= {var1,var2,var3};
    if(compare(a))
    {System.out.println("mindestens zwei gleiche variablen");}
    else
    {
        System.out.println("3 ungleiche variablen");
    }


    }
    public static boolean compare(String[] a)
    {
        boolean c=false;

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i].equals(a[j]))
                {
c=true;
                }
            }
        }
        return c;
    }

}

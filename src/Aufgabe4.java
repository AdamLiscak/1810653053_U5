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
        for(int i=0;i<a.length;i++)
        {
            if (((i!=2)&&a[i].equals(a[i+1]))||(i==2&&a[i].equals(a[0])))
            {
                c=true;
            }
        }
        return c;
    }
}

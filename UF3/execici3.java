import java.util.Scanner;

public class TextLength {
    public static void main(String[] args) {
        String text = "Fa  anys,  molts  anys,  hi  havia  un  sobirà  persa  anomenat Yunan que vivia a la ciutat de Fars i regnava  a  les  terres  de  Ruman.  Era  un  gran  rei,  molt  puixant, posseïa riqueses a la baldor, un exèrcit poderós  i  servents  de  totes  les  races  i  tots  els  colors.  Aquell rei, però, patia un mal que li llevava el son, una malaltia de la pell que li omplia el cos de taques i nyafes. L’havien tractat molts metges, tots ells savis eminents; li havien receptat un munt de xarops i  ungüents,  però  cap  d’aquells  doctes  remeiers  no havia sigut capaç de trobar la metgia que el curés.";
        
        int length = text.length();
        
        System.out.println("La longitud del text és: " + length + " caràcters.");
    }
}

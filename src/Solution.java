import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//ENUNCIADO:

/* Per a l'aplicatiu del centre ens cal un petit programa que ens retorni en quin dia de la setmana ens trobem en funció d'un número que introduïm. Així el número 1 correspon al Dilluns, el 2 al Dimarts,... i el 7 al Diumenge. Control d'errors: el nombre introduït ha d'estar al rang [1,7]

Input Format

Introdueix un enter.

Constraints

L'enter està en el rang [1,7]

Output Format

Imprimeix el dia de la setmana que li correspon, si el rang no és correcte imprimeix el següent text: "Dia no valid"

Sample Input 0

1
Sample Output 0

Dilluns
Sample Input 1

5
Sample Output 1

Divendres
Sample Input 2

-34
Sample Output 2

Dia no valid

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input < 1 || input >7)
        {
            System.out.print("Dia no valid");
        }
        else
        {
            if (input == 1){System.out.print("Dilluns");}
            if (input == 2){System.out.print("Dimarts");}
            if (input == 3){System.out.print("Dimecres");}
            if (input == 4){System.out.print("Dijous");}
            if (input == 5){System.out.print("Divendres");}
            if (input == 6){System.out.print("Dissabte");}
            if (input == 7){System.out.print("Diumenge");}
        }

    }
}

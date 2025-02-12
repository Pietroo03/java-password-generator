/* Il programma deve fare quanto segue:
-Salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
-Generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere - */

/* Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011 */

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surname;
        String favouriteColor;
        byte dayOfBirth;
        byte monthOfBirth;
        short yearOfBirth;

        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        surname = in.nextLine();
        favouriteColor = in.nextLine();
        dayOfBirth = in.nextByte();
        monthOfBirth = in.nextByte();
        yearOfBirth = in.nextShort();

        short sumBirth = (short) (dayOfBirth + monthOfBirth + yearOfBirth);

        System.out.println("La tua password è: " + name + '-' + surname + '-' + favouriteColor + '-' + sumBirth);
    }
}

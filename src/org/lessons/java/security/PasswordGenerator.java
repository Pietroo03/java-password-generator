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

        System.out.print("Inserisci il tuo Nome:");
        name = in.nextLine();
        System.out.print("Inserisci il tuo Cognome:");
        surname = in.nextLine();
        System.out.print("Inserisci il tuo Colore preferito:");
        favouriteColor = in.nextLine();
        System.out.print("Inserisci il tuo Giorno di nascita:");
        dayOfBirth = in.nextByte();
        System.out.print("Inserisci il tuo Mese di nascita:");
        monthOfBirth = in.nextByte();
        System.out.print("Inserisci il tuo Anno di nascita:");
        yearOfBirth = in.nextShort();

        short sumBirth = (short) (dayOfBirth + monthOfBirth + yearOfBirth);

        System.out.println("La tua password è: " + name + '-' + surname + '-' + favouriteColor + '-' + sumBirth);
    }
}

/*
 * Representa una carta, formada por un número y su palo correspondiente
 */
package solitario.Core;

/**
 *
 * @author AEDI
 */
public class Carta {
		
    private int numero;     //Nº de la carta
    private Palos palo;    //Palo de la carta

    public Carta(int numero, Palos palo) {     //Constructor de la carta
	this.numero = numero;
	this.palo = palo;
    }

    @Override
    public String toString() {      //String para mostrar la carta

	StringBuilder toret = new StringBuilder();

	toret.append("[").append(numero).append(" , ").append(palo).append("]");

	return toret.toString();
    }
}

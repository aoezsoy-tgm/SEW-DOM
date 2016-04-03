package oezsoy;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/*
 * Gegeben ist customerOrders.xml. Erarbeite �ber DOM folgende Fragestellungen und gib das Ergebnis in der Konsole aus:

 Wie viele Kunden und wie viele Bestellungen sind gespeichert?
 Welche CustomerID besitzt der vierte Kunde?
 Wie lautet die vollst�ndige Adresse von der Firma Lazy K Kountry Store?
 Gibt es Kunden, welche dieselbe dreistellige Vorwahl verwenden?
 Gibt es Kunden, die nicht aus den USA sind?
 Welche(r) Kunde(n ) hatte(n ) die meisten Bestellungen?
 Wann war die letzte Bestellung von LAZYK?
 Von wie vielen verschiedenen Mitarbeitern wurde GREAL bedient?
 Welches Gewicht hat LETSS insgesamt verschicken lassen?

 F�ge au�erdem jedem Kunden �ber DOM das Kindelement "language" hinzu, welches ein Attribut value mit dem Wert "en" besitzt (sofern noch nicht vorhanden) und speichere das Dokument

 Dein Programm muss auch mit anderen Daten in derselben Struktur funktionieren (keine hardcoded Bez�ge etc.)!

 Achte auf ein sauberes Exception Handling und Fehlerbehandlungen (auch null-Werte)!

 Kommentiere dein Programm in der Standardform f�r Java!

 Erweiterungen:

 Gestalte alle Abfragen konfigurierbar (z.B. Kommandozeilenparameter oder �ber Konsole einlesen), sofern es die Abfrage sinnvoll erlaubt
 Erm�gliche das Einlesen von zus�tzlichen Kunden aus einem zweiten XML-File und f�ge diese dem XML-File hinzu (und speichere das Ergebnis)

 */

/**
 * DOM
 * @author Oezsoy Ahmet
 * @version 14.03.2016
 */
public class DOM {
	/**
	 * main-Methode
	 * @param args
	 */
	public static void main(String args[]) {
		Document document = null;
		DocumentBuilderFactory builderfac = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = builderfac.newDocumentBuilder();
			document = builder.parse(new File("src\\customerOrders.xml"));
			
			NodeList c = document.getElementsByTagName("Customer"); // Von Customers die Liste speichern
			NodeList ord = document.getElementsByTagName("Order"); // Die Liste der Orders Speicherm
			
			/* Frage 2: Welche CustomerID besitzt der vierte Kunde? */
			System.out.println("CustomerID des 4ten Kunden ist: " + c.item(3).getAttributes().getNamedItem("CustomerID").getNodeValue()); // Ausgabe des 4. Kunden
			
			/* Frage 1:  Wie viele Kunden und wie viele Bestellungen sind gespeichert? */
			System.out.println("Anzahl der Kunden: " + c.getLength()); // Ausgabe der Anzahl der Kunden
			System.out.println("Anzahl der Bestellungen: " + ord.getLength());// Ausgabe der Anzahl der Bestellungen

			
		} catch (SAXParseException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
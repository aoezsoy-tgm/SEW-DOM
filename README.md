# SEW-DOM

Übung 9: Document Object Model

Gegeben ist customerOrders.xml. Erarbeite über DOM folgende Fragestellungen und gib das Ergebnis in der Konsole aus:

    Wie viele Kunden und wie viele Bestellungen sind gespeichert?
    Welche CustomerID besitzt der vierte Kunde?
    Wie lautet die vollständige Adresse von der Firma Lazy K Kountry Store?
    Gibt es Kunden, welche dieselbe dreistellige Vorwahl verwenden?
    Gibt es Kunden, die nicht aus den USA sind?
    Welche(r) Kunde(n ) hatte(n ) die meisten Bestellungen?
    Wann war die letzte Bestellung von LAZYK?
    Von wie vielen verschiedenen Mitarbeitern wurde GREAL bedient?
    Welches Gewicht hat LETSS insgesamt verschicken lassen?

Füge außerdem jedem Kunden über DOM das Kindelement "language" hinzu, welches ein Attribut value mit dem Wert "en" besitzt (sofern noch nicht vorhanden) und speichere das Dokument

Dein Programm muss auch mit anderen Daten in derselben Struktur funktionieren (keine hardcoded Bezüge etc.)!

Achte auf ein sauberes Exception Handling und Fehlerbehandlungen (auch null-Werte)!

Kommentiere dein Programm in der Standardform für Java!

Erweiterungen:

    Gestalte alle Abfragen konfigurierbar (z.B. Kommandozeilenparameter oder über Konsole einlesen), sofern es die Abfrage sinnvoll erlaubt
    Ermögliche das Einlesen von zusätzlichen Kunden aus einem zweiten XML-File und füge diese dem XML-File hinzu (und speichere das Ergebnis)

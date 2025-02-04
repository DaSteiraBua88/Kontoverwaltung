# SuperBank Java Anwendung

## Author
Sebastian Wendler
## Gegenstand
INF / SEN
## Überblick
Dieses Projekt implementiert eine einfache Bankanwendung in Java. Es besteht aus zwei Hauptklassen: `Main.java` und `Konto.java`. Die Anwendung erlaubt grundlegende Banktransaktionen und bietet eine Menüstruktur zur Interaktion.

## Struktur
- **Main.java**: Diese Klasse enthält das Hauptmenü der Anwendung. Hier können Benutzer auswählen, welche Bankaktion sie ausführen möchten.
- **Konto.java**: Diese Klasse repräsentiert ein Bankkonto mit Attributen wie Kontoinhaber, Kontostand und Kontoart. Sie bietet Methoden zum Einzahlen, Abheben und zur Anzeige eines Kontoauszugs.

## Funktionen
1. **Konto anlegen:** Erstellen Sie ein neues Bankkonto mit den gewünschten Details.
2. **Einzahlen:** Fügen Sie eine Summe zum Kontostand hinzu.
3. **Abheben:** Ziehen Sie eine Summe vom Kontostand ab.
4. **Kontoauszug:** Sehen Sie die grundlegenden Kontodetails ein.
5. **Konto auflösen:** Entfernen Sie ein bestehendes Konto (funktional noch nicht implementiert).
6. **Beenden:** Schließen Sie das Programm.

## Beispiel für Kontoerstellung und Nutzung
```java
Konto konto = new Konto("Max Mustermann", 12345678, 987654321, 1000.0f, 5.0f, 500.0f, "Girokonto");
konto.einzahlen(200.0f);
konto.abheben(50.0f);
konto.kontoAuszug();
```

## Installation und Ausführung
1. Laden Sie das Projekt herunter und öffnen Sie es in einer Java-IDE (z. B. IntelliJ IDEA oder Eclipse).
2. Kompilieren und starten Sie die `Main.java`-Datei.
3. Folgen Sie den Anweisungen im Menü.

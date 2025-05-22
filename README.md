In dieser Woche machen wir ein paar Array-Fingerübungen.

Vorsicht, es gibt einige Unterschiede im Vergleich zu der Übung in der letzten Woche:

* Sie finden die Tests nun in Gradle unter `Tasks->verification->test`, und dieser Task führt nun _alle_ Tests für die gesamte Aufgabe aus
* Das bedeutet, dass _alle_ Tests nicht funktionieren, wenn es in irgendeiner Aufgabe einen Syntax-Fehler gibt oder die geforderte Methode gar nicht existiert. Implementieren Sie also unbedingt als erstes das "Skelett" der Aufgaben (also die leeren Methoden, die nur irgendetwas korrektes zurückgeben - Tipp: Wenn ein Array gefordert ist, können Sie einfach mit `return null` eine "leere" Adresse zurückgeben), bevor Sie sich an die Logik machen.
* In dieser Woche existiert auch die Ausgangs-Java-Datei nicht, Sie müssen die also auch erstellen.

# Pflichtaufgaben
## Aufgabe 1

Implementieren Sie in der Klasse `ArrayUebungen` eine Methode `public static int getSum(int[] elements)`, die die Summe der Elemente des übergebenen Arrays zurückgibt.

## Aufgabe 2

Implementieren Sie in der Klasse `ArrayUebungen` eine Methode `public static int getSum(int[][] elements)`, die die Summe der Elemente des übergebenen Arrays zurückgibt. Verwenden Sie dabei die in Aufgabe 1 implementierte Methode (nicht den Code kopieren, sondern die Methode aufrufen).

## Aufgabe 3

Implementieren Sie in der Klasse `ArrayUebungen` eine Methode `public static int[] concatenate(int[] arr1, int[] arr2)`, die ein neues Array zurückgibt, welches die Elemente von `arr1` gefolgt von den Elementen von `arr2` enthält.

## Aufgabe 4

Implementieren Sie in der Klasse `ArrayUebungen` eine Methode `public static int[] filter(int[] arr, int min, int max)`, die ein neues Array zurückgibt, welches diejenigen Elemente von `arr` enthält, die zwischen `min` und `max` (jeweils inklusive) liegen.

Beachten Sie hier bitte, dass Sie anfangs nicht wissen, wie viele Elemente Ihr Array haben wird - Sie müssen also erst zählen, wie lang Ihr Ergebnis-Array sein wird, bevor Sie es erstellen.

# Zusatzaufgaben

## Aufgabe 5

Implementieren Sie in der Klasse `Schach` eine Methode `public static char[][] createBoard()`, die ein 8x8-char-Array zurückgibt, welches ein Schachbrett repräsentiert. Jedes Element soll dabei ein Feld auf dem Brett darstellen: 0 für ein leeres Feld, und Zeichen für die entsprechenden Figuren. Sie können sich selber aussuchen, welche Zeichen Sie für die Darstellung verwenden, aber ein Hinweis: Sie sind bei `char` nicht auf den Basis-ASCII-Zeichensatz beschränkt, Sie können also beispielsweise die [Schach-Symbole](https://en.wikipedia.org/wiki/Chess_symbols_in_Unicode) in Ihren Code kopieren.

## Aufgabe 6

Implementieren Sie in der Klasse `Schach` eine Methode `public static void showBoard(char[][] board)`, die das Brett auf der Konsole darstellt.

## Aufgabe 7

Implementieren Sie in der Klasse `Schach` eine Methode `public static void move(char[][] board, char fromCol, int fromRow, char toCol, int toRow)`, welche (falls auf dem Ausgangsfeld eine Figur steht) von dem Ausgangsfeld zum Zielfeld eine Figur auf dem Spielfeld verschiebt. Beachten Sie dabei zunächst noch keine Regeln. Verwenden Sie die übliche Adressierung auf dem Brett: Die Spalten sind den Buchstaben A-H zugeordnet, die Zeilen fangen auf der Seite von Weiß mit 1 an und gehen bis 8.

## Aufgabe 8

Implementieren Sie unter Verwendung dieser Methoden ein einfaches Konsolen-Schachspiel. Dieses soll mittels `Scanner` (siehe Cheatsheet) die Züge abwechselnd abfragen, das Brett jeweils aktualisieren und wieder ausgeben.

## Aufgabe 9

Erweitern Sie Ihr Spiel so, dass es die korrekten Zugregeln abfragt.
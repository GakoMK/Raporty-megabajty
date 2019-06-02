# Raporty-megabajty

Program ten został stworzony dla pracodawców małych i średnich firm. Służy on do tworzenia raportów z danych dostarczanych przez pracowników firmy w formie podstawowego arkusza kalkulacyjnego xmls.
Program jest wspierana przez system Windows 64 bit

## Instrukcja obsługi

# Jak pobrać? 
Program dostarczony w formie pliku JAR.
Oprogramowanie mozna pobrac bezposrednio z githuba przy uzyciu linku https://github.com/OliwiaLakatosz/Raporty-megabajty/releases

# Jak używać 

1. Aby otworzyć ten program wyszukaj i uruchom aplikację cmd ( aplikacja windowsowa).
2.	Po otwarciu konsoli wpisz komendę, **java -jar raport_megabajty.jar <path>**, komenda ta uruchomi aplikacje Megabajty.  
	W miejsce <path> należy wskazać ścieżkę, do danych które mają zostać użyte przy tworzeniu raportów, po wskazaniu ścieżki wciśnij Enter. 
	W tym momencie program wczytuje dane oraz sprawdza ich poprawność, jeżeli wszystkie pliki xmls zostały stworzone wg instrukcji **„Format Pliku wymagany przez Twórców oprogramowania„** program przejdzie do kolejnego punktu jeśli nie wyświetli błąd. W przypadku gdy wyświetli się błąd tj komunikat „folder not found” należy uruchomić ponownie aplikacje cmd i zacząć od nowa (pkt1)
3.	Po poprawnym wczytaniu danych na konsoli wyświetlone zostanie zapytanie o wskazanie czynności jaką użytkownik chce wykonać. 
				Do każdej czynności została przyporządkowana liczba.  Po wpisaniu na konsoli liczby oraz kliknięciu Enter czynność ta zostanie wykonana.
4.	Jeżeli wskazaną czynnością był raport, na konsoli wyświetli się zapytanie o wpisanie danych. Po wpisaniu na konsoli wymaganych danych wciśnij Enter
				W zależności od raportu może to być: Imię i Nazwisko Pracownika lub Rok.
				
5.	Jeżeli dane zostały wpisane poprawnie zostanie rozpoczęty proces generowania raportu. Konsola zapyta o sposób wyświetlenia raportu, po dokonaniu wyboru wciśnij Enter.
6.	Wyświetlenie danych


Uwaga w każdym momencie, użytkownik ma możliwość wrócenia do kroku poprzedniego lub wrócenia do panelu głównego (pkt4)
W momencie gdy pomimo zatwierdzenia danej czynności, czynność się nie wykonuje,  należy wrócić do panelu głównego i spróbować od nowa. 

## Format Pliku wymagany przez Twórców oprogramowania. 

1.	Jeden arkusz kalkulacyjny per pracownik per miesiąc

•	Arkusz powinien być nazwany zgodnie z kluczem **imie_nazwisko **


•	Wymagany format pliku **xmls**

2.	Dane w arkuszu powinny być zapisywane zgodnie 
•	Dane powinny być podzielone na zakładki, które powinny być nazwane tak samo jak Projekt, którego one się tyczą
 
•	Dane w zakładkach powinny być zapisywane w trzech kolumnach, 
Poniższe dane definiują i opisują położenie kolumn oraz nazw nagłówków 
A1 „Data” A2 „Zadanie” A3 „Czas[h]”
 
•	W kolumnie A powinny daty w której pracownik wykonał daną czynność Data powinna zostać zapisana według formatu **MM/DD/YYYY**

•	W kolumnie C powinien zostać zapisany czas który pracownik poświęcił na wykonanie danej czynności. Czas powinien mieć format liczby.

3.	Arkusze powinny być przechowywane w osobnych folderach które opisywać będą miesiąc i rok którego one dotyczą.
			Schemat jak stworzyć archiwum 
- **2012** (Rok) 
  - **01** (miesiąc)
  - 02
  - 03
  .
  .
  - 12
     - Janusz_Nowak.xmls
   

**UWAGA! Wszystkie dane wprowadzone do arkusza muszą być wpisywane zgodnie z powyższą instrukcją. W przypadku nawet gdy jeden z wielu plików którego format danych nie będzie odpowiadał powyższym standardom program napotka błąd podczas ich przetwarzania co będzie skutkowało jego wyłączeniem.**





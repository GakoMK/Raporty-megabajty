package pl.edu.agh.mwo;

import java.util.Scanner;

public class MainMenu {

	public static void Run() {
		boolean isRunning = true;
		Scanner in = new Scanner(System.in);

		while (isRunning) {
			System.out.println("=== Raporty ===");
			// System.out.println(pathToData);
			System.out.println("1. Raport roczny (ogólny)");
			System.out.println("2. Raport - Liczba godzin wypracowanych per projekt");
			System.out.println("3. Raport - szczegółowy wykaz pracy pracownika");
			System.out.println("4. Raport - procentowe zaangażowanie w projekty");
			System.out.println("5. Raport - top 10 aktywności");
			System.out.println("0 - wyjscie");

			System.out.print(">>>");
			int inputReportSelection = in.nextInt();

			switch (inputReportSelection) {
			case 1:
				do {
					System.out.println("Raport 1");
					System.out.print("0. Powrot do menu glownego\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						do {
							System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								break;
							}
							if (inputReportSelection == 1) {
								System.out.println("Print on console - to be implemented");
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
							}
						} while (inputReportSelection == 0);
					}
				} while (inputReportSelection == 0);
				break;
			case 2:
				do {
					System.out.println("Raport 2");
					System.out.print("0. Powrot do menu glownego\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						do {
							System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
							}
						} while (inputReportSelection == 0);
					}
				} while (inputReportSelection == 0);
				break;
			case 3:
				do {
					System.out.println("Raport 3");
					System.out.print("0. Powrot do menu glownego\nPodaj rok: ");
					int inputYear = in.nextInt();
					if(inputYear == 0) {
						continue;
					}
					System.out.println("Podaj nazwisko: ");
					String inputEmployeeName = in.next();
					if (inputEmployeeName == null) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						System.out.println("nazwisko: " + inputEmployeeName);
						do {
							System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
							}
						} while (inputReportSelection == 0);
					}
				} while (inputReportSelection == 0);
				break;
			case 4:
				do {
					System.out.println("Raport 4");
					System.out.print("0. Powrot do menu glownego\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						continue;
					}
					System.out.println("Podaj nazwisko: ");
					String inputEmployeeName = in.next();
					if (inputEmployeeName == null) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						System.out.println("nazwisko: " + inputEmployeeName);
						do {
							System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
							}
						} while (inputReportSelection == 0);
					}
				} while (inputReportSelection == 0);
				break;
			case 5:
				do {
					System.out.println("Raport 5");
					do {
						System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego");
						int inputChooseReportForm = in.nextInt();
						if (inputChooseReportForm == 0) {
							continue;
						}
						if (inputChooseReportForm == 1) {
							System.out.println("Print on console - to be implemented");
						} else if (inputChooseReportForm == 2) {
							System.out.println("Export to Excel - to be implemented");
						}
					} while (inputReportSelection == 0);

				} while (inputReportSelection == 0);
				break;
			}

			if (inputReportSelection == 0) {
				isRunning = false;
			}
		}
	}
}

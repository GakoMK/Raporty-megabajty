package pl.edu.agh.mwo;

import java.util.Scanner;

import pl.edu.agh.mwo.model.Model;
import pl.edu.agh.mwo.reports.ReportEmployeeHours;
import pl.edu.agh.mwo.xlsPars.XlsReader;

public class MainMenu {

	
	
	String dataPattern = "\\d{4}";
	String error = "Niepoprawny format daty";
	
	public static String validateInputSyntax(String pattern, String statement_error) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String inputValue = scanner.next();
			if (inputValue.matches(pattern)) {
				return inputValue;
			} else {
				System.out.println(statement_error);
			}
		}
	}

	public static void Run(Model model) {
		
		
		boolean isRunning = true;
		Scanner in = new Scanner(System.in);

		while (isRunning) {
			System.out.println("\n=== Raporty ===");
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
					System.out.print("0. Powrot do menu glownego\n9. Powrot do stanu przed bledem\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						break;
					}
					if (inputYear == 9) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						do {
							System.out.println(
									"1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego"
											+ "\n9. Powrot do stanu przed bledem");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								break;
							}
							if (inputChooseReportForm == 9) {
								continue;
							}
							if (inputReportSelection == 1) {
								System.out.println("Print on console - to be implemented");
								ReportEmployeeHours reh = new ReportEmployeeHours();
								reh.printConsole(model, inputYear);
								break;
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
								break;
							}
						} while (true);
						break;
					}
				} while (true);
				break;
			case 2:
				do {
					System.out.println("Raport 2");
					System.out.print("0. Powrot do menu glownego\n9. Powrot do stanu przed bledem\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						break;
					} 
					if (inputYear == 9) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						do {
							System.out.println(
									"1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego"
									+ "\n9. Powrot do stanu przed bledem");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								break;
							}
							if (inputChooseReportForm == 9) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
								break;
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
								break;
							}
						} while (true);
						break;
					}
				} while (true);
				break;
			case 3:
				do {
					System.out.println("Raport 3");
					System.out.print("0. Powrot do menu glownego\n9. Powrot do stanu przed bledem\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						break;
					}
					if (inputYear == 9) {
						continue;
					}
					System.out.println("Podaj nazwisko: ");
					String inputEmployeeName = in.next();
					if (inputEmployeeName.contains("0")) {
						break;
					} 
					if (inputEmployeeName.contentEquals("9")) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						System.out.println("nazwisko: " + inputEmployeeName);
						do {
							System.out.println(
									"1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego"
									+ "\n9. Powrot do stanu przed bledem");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								break;
							}
							if (inputChooseReportForm == 9) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
								break;
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
								break;
							}
						} while (true);
						break;
					}
				} while (true);
				break;
			case 4:
				do {
					System.out.println("Raport 4");
					System.out.print("0. Powrot do menu glownego\n9. Powrot do stanu przed bledem\nPodaj rok: ");
					int inputYear = in.nextInt();
					if (inputYear == 0) {
						break;
					}
					if (inputYear == 9) {
						continue;
					}
					System.out.println("Podaj nazwisko: ");
					String inputEmployeeName = in.next();
					if (inputEmployeeName.contains("0")) {
						break;
					}
					if (inputEmployeeName.contains("9")) {
						continue;
					} else {
						System.out.println("rok: " + inputYear);
						System.out.println("nazwisko: " + inputEmployeeName);
						do {
							System.out.println(
									"1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego"
									+ "\n9. Powrot do stanu przed bledem");
							int inputChooseReportForm = in.nextInt();
							if (inputChooseReportForm == 0) {
								break;
							}
							if (inputChooseReportForm == 9) {
								continue;
							}
							if (inputChooseReportForm == 1) {
								System.out.println("Print on console - to be implemented");
								break;
							} else if (inputChooseReportForm == 2) {
								System.out.println("Export to Excel - to be implemented");
								break;
							}
						} while (true);
						break;
					}
				} while (true);
				break;
			case 5:
				do {
					System.out.println("Raport 5");
					do {
						System.out.println(
								"1. Wyświetl zawartość\n2. Wyeksportuj do Excela\n0. Powrot do menu glownego"
								+ "\n9. Powrot do stanu przed bledem");
						int inputChooseReportForm = in.nextInt();
						if (inputChooseReportForm == 0) {
							break;
						}
						if (inputChooseReportForm == 9) {
							continue;
						}
						if (inputChooseReportForm == 1) {
							System.out.println("Print on console - to be implemented");
							break;
						} else if (inputChooseReportForm == 2) {
							System.out.println("Export to Excel - to be implemented");
							break;
						}
					} while (true);
					break;

				} while (true);
				break;
			}

			if (inputReportSelection == 0) {
				isRunning = false;
			}
		}
	}
}

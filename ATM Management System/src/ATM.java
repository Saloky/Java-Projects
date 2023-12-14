import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optMenu = new OptionMenu();
		introduction();
		optMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("WELCOME TO THE ATM PROJECT! ");
	}
}

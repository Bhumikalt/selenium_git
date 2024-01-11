package DDT;

import New_package.Fetch_data_ddt;

public class data_from_ddt {

	public static void main(String[] args) {
		String val1=Fetch_data_ddt.get_data("Sheet1", 0, 0);
		System.out.println(val1);
		String val2=Fetch_data_ddt.get_data("Sheet1", 2, 1);
		System.out.println(val2);
		String val3=Fetch_data_ddt.get_data("Sheet1", 4, 0);
		System.out.println(val3);
	}

}

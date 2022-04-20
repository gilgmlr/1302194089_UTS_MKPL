package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		printNumberOfMontWorking(numberOfMonthWorking);
		
		childrenNumbersMax(numberOfChildren);
		
		tax = isMarried(isMarried, monthlySalary, otherMonthlyIncome, numberOfMonthWorking, deductible, numberOfChildren);
		
		return tax<0? 0 : tax;
	}

	public static void childrenNumbersMax(int numberOfChildren){
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
	}

	public static void printNumberOfMontWorking(int numberOfMonthWorking){
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
	}

	public static int isMarried(boolean isMarried, int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, int numberOfChildren){
		int tax;
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
		}
		return tax;
	}
	
}

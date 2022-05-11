import java.text.DecimalFormat;
import java.util.Scanner;

public class konversiSuhu {
    private Double hasil,C,F;
    int Opsi;

    DecimalFormat df = new DecimalFormat("##.##");
    Scanner input = new Scanner(System.in);

    public void setC(Double Nilai){
        this.C = Nilai;
    }
    public void setF(Double Nilai){
        this.F = Nilai;
    }

    public void ShowOpsi(){
        System.out.print("Pilih Opsi: ");
        this.Opsi = input.nextInt();
        if (Opsi == 1){
            System.out.print("Masukan Nilai C: ");
            this.setC(input.nextDouble());
            this.convertC();
            this.hasilConvert();
        }else if (Opsi == 2){
            System.out.print("Masukan Nilai F: ");
            this.setF(input.nextDouble());
            this.convertF();
            this.hasilConvert();
        }else{
            System.out.println("Opsi Tidak Tersedia");
        }
    }

    private void convertC(){
        // konversi Suhu Dari C ke F
        this.hasil = (this.C*9/5)+32;
    }

    private void convertF(){
        // konversi Suhu Dari F ke C
        this.hasil = (this.F-32)*5/9;
    }

    public void hasilConvert(){
        if (Opsi == 1){
            System.out.println("Nilai F: " + this.hasil);
        }else if(Opsi == 2){
            System.out.println("Nilai C: " + df.format(this.hasil));
        }
    }
}

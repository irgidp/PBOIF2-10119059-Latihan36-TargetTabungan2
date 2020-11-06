package pboif2.pkg10119059.latihan36.targettabungan2;
/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan target tabungan OO
 */
public class Tabungan {
    public int saldo;
    public double bungaBulanan;
    
    public void nextBunga() {
        saldo += (saldo*bungaBulanan);
    }
    
    public void printSaldo(int bulanKe) {
        String saldoAkhir = String.format("%,10d%n", saldo);
        saldoAkhir = saldoAkhir.replace(',', '.');
        System.out.print("Saldo di bulan ke-" +(Integer.
                toString(bulanKe))+(" Rp.") +(saldoAkhir));
    }
    
    public void tampilTargetSaldo(int saldoTarget) {
        int i = 1;
        while (saldo < saldoTarget) {
            nextBunga();
            printSaldo(i);
            i++;
        }
    }
}

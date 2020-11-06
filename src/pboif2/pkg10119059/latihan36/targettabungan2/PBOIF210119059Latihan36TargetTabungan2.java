/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan target tabungan OO
 */
package pboif2.pkg10119059.latihan36.targettabungan2;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan36TargetTabungan2 {

    public static void main(String[] args) {
        Tabungan tab = new Tabungan();
        tab.saldo = 3500000;
        tab.bungaBulanan = 0.08;
        tab.tampilTargetSaldo(6000000);    
    }  
}

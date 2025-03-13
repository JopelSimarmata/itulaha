package academic.model;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Student {
    String nim;
    String nama;
    String angkatan;
    String prodi;

    public Student(String nim, String nama, String angkatan, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.prodi = prodi;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getAngkatan(){
        return this.angkatan;
    }

    public String getProdi(){
        return this.prodi;
    }



    public void DisplayStudent(){
        System.out.println(this.nim+"|"+this.nama + "|" + this.angkatan + "|" + this.prodi);
    }
    // class definition

}
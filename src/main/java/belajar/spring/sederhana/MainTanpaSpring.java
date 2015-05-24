package belajar.spring.sederhana;

import java.util.Date;

public class MainTanpaSpring {

    public static void main(String[] args) {
        Person andi = new Person();
        andi.setNama("Madi Andi");
        andi.setTanggalLahir(new Date());

        Address kantor = new Address();
        kantor.setJalan("Jl. Pangkalan Sukses");
        kantor.setKota("Palembang");
        kantor.setKodePos("121712");

        andi.setAddress(kantor);

        //tampilkan
        System.out.println("Nama : " + andi.getNama());
        System.out.println("Tanggal Lahir : " + andi.getTanggalLahir());
        System.out.println("Alamat : " + andi.getAddress().getJalan());
        System.out.println("Kota : " + andi.getAddress().getKota());
        System.out.println("Kode Pos : " + andi.getAddress().getKodePos());
    }

}

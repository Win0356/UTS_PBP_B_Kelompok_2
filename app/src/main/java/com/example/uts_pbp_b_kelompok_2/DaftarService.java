package com.example.uts_pbp_b_kelompok_2;



import com.example.uts_pbp_b_kelompok_2.model.Model;

import java.util.ArrayList;

public class DaftarService {
    public ArrayList<Model> model;
    public DaftarService(){
        model = new ArrayList();
        model.add(model1);
        model.add(model2);
        model.add(model3);
        model.add(model4);
    }

    public static final Model model1 = new Model("0001", "Mobil", "Singkawang", "tambal ban", "https://asset.kompas.com/crops/TQulzomjBn2xRGO6-oGhqtT10aE=/0x0:1000x667/750x500/data/photo/2020/03/26/5e7cd0a40e7e3.jpg");
    public static final Model model2 = new Model("0002", "Mobil", "Papua", "tambal ban", "https://asset.kompas.com/crops/TQulzomjBn2xRGO6-oGhqtT10aE=/0x0:1000x667/750x500/data/photo/2020/03/26/5e7cd0a40e7e3.jpg");
    public static final Model model3 = new Model("0003", "Motor", "Weleri", "tambal ban", "https://asset.kompas.com/crops/TQulzomjBn2xRGO6-oGhqtT10aE=/0x0:1000x667/750x500/data/photo/2020/03/26/5e7cd0a40e7e3.jpg");
    public static final Model model4 = new Model("0004", "Motor", "Bogor", "tambal ban", "https://asset.kompas.com/crops/TQulzomjBn2xRGO6-oGhqtT10aE=/0x0:1000x667/750x500/data/photo/2020/03/26/5e7cd0a40e7e3.jpg");


}

package com.example.uts_pbp_b_kelompok_2.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import java.io.Serializable;


public class Model implements Serializable {
    private String idService;
    private String kendaraan;
    private String platNomor;
    private String kebutuhan;
    private String imgurl;

    public Model(String idService, String kendaraan, String platNomor, String kebutuhan, String imgurl){
        this.idService=idService;
        this.kendaraan=kendaraan;
        this.platNomor=platNomor;
        this.kebutuhan=kebutuhan;
        this.imgurl=imgurl;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String imgURL){
        Glide.with(imageView)
                .load(imgURL)
                .centerCrop()
                .into(imageView);
    }
}
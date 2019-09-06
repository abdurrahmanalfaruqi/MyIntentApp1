package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Mybiodata implements Parcelable {
    private String name;
    private  int umur;



    public Mybiodata(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.umur);
    }

    protected Mybiodata(Parcel in) {
        this.name = in.readString();
        this.umur = in.readInt();
    }

    public static final Parcelable.Creator<Mybiodata> CREATOR = new Parcelable.Creator<Mybiodata>() {
        @Override
        public Mybiodata createFromParcel(Parcel source) {
            return new Mybiodata(source);
        }

        @Override
        public Mybiodata[] newArray(int size) {
            return new Mybiodata[size];
        }
    };
}





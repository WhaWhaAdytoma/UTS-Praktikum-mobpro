package com.example.whawha.utspraktik;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String [][]{
            {"Presiden Soekarno",
                    "Presiden pertama RI",
                    "https://upload.wikimedia.org/wikipedia/commons/0/01/Presiden_Sukarno.jpg"},
            {"Presiden Soeharto",
                    "Presiden kedua RI",
                    "https://upload.wikimedia.org/wikipedia/commons/5/59/President_Suharto%2C_1993.jpg"},
            {"Presiden Bacharuddin Jusuf Habibie",
                    "Presiden ketiga RI",
                    "https://upload.wikimedia.org/wikipedia/commons/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg"},
            {"Presiden Abdurrahman Wahid",
                    "Presiden keempat RI",
                    "https://upload.wikimedia.org/wikipedia/commons/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Presiden Megawati Soekarnoputri",
                    "Presiden kelima RI",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Presiden Susilo Bambang Yudhoyono",
                    "Presiden keenam RI",
                    "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Presiden Joko Widodo",
                    "Presiden ketujuh RI",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i=0; i <data.length; i++){
            president = new President();
            president.setName(data[i][0]);
            president.setRemarks(data[i][1]);
            president.setPhoto(data[i][2]);
            list.add(president);
        }
        return list;
    }
}

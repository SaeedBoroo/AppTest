package com.example.saeed.apptest.fakdeGenerator;

import com.example.saeed.apptest.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductFakeGenrator {

    public static List<product> getList(){
        List<product> temp=new ArrayList<>();

        for (int i=0;i<15;i++)
        {
            temp.add(new product("test"+ i ,"desc" + i*2));
        }
        return temp;
    }
}

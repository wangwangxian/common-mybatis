package com.qds.common.mybatis.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

/**
 * GsonTool
 * @author jony
 * @date 2018/08/09 10:30
 * @e-mail 1320765779@qq.com
 */
public abstract class GsonTool {

    @Override
    public String toString(){
        try{
            return new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(toJson(this)));
        }catch (Exception e) {
            return toJson(this);
        }
    }

    private String toJson(Object obj){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.SSS").create();
        return gson.toJson(obj);
    }
}

package com.example.wayne.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wayne on 2017/3/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}

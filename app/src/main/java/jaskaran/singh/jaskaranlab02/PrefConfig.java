package jaskaran.singh.jaskaranlab02;
//Jaskaran singh
//301109429
//Section 002
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PrefConfig {
    private static String LIST_KEY;

    public static void writeListInPref(Context context, List<singhApartment> apartments){
        Gson gson =new Gson();
        String jsonString=gson.toJson(apartments);

        SharedPreferences pref= PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor=pref.edit();
        editor.putString(LIST_KEY,jsonString);
        editor.apply();
    }
    public static List<singhApartment> readListFromPref(Context context)
    {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString=pref.getString(LIST_KEY,"");

        Gson gson = new Gson();
        Type type=new TypeToken<ArrayList<singhApartment>>(){}.getType();
        List<singhApartment> list=gson.fromJson(jsonString,type);
        return list;
    }


}

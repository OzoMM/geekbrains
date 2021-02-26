package kz.ozom.lesson10;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneList {
    private HashMap<String, ArrayList> phoneList = new HashMap<>();

    public String getPhoneList(String key) {
        return this.phoneList.get(key);
    }

    public void setPhoneList(String key, ArrayList val) {
        this.phoneList.put(key, val);
    }
}

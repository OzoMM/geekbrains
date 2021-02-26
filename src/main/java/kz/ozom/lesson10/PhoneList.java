package kz.ozom.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneList {
    private Map<String, ArrayList> phoneList = new HashMap<>();

    public ArrayList getPhoneList(String key) {
        return this.phoneList.get(key);
    }

    public void setPhoneList(String key, ArrayList val) {
        this.phoneList.put(key, val);
    }
}

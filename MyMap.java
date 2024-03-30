package Map;

import java.util.ArrayList;

public class MyMap <T,P>{
    ArrayList<T> keys;
    ArrayList<P> valueList;
    public MyMap() {
        valueList = new ArrayList<>();
        keys = new ArrayList<>();
    }

    public void put(T key, P value) {
        int index;

        if(keys.contains(key)) {
            index = keys.indexOf(key);
            valueList.set(index,value);
        } else {
            keys.add(key);
            valueList.add(value);
        }
    }

    public P get(T key) {
        int index;

        if(!keys.contains(key)) {
            return null;
        }

        index = keys.indexOf(key);
        return valueList.get(index);
    }

    public P remove(T key) {
        P retValue;
        int index;

        if(!keys.contains(key)) {
            return null;
        }

        index = keys.indexOf(key);
        retValue = valueList.get(index);

        keys.remove(key);
        valueList.remove(index);

        return retValue;
    }

    public void print() {
    }
}
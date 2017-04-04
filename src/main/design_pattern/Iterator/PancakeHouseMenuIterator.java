package main.design_pattern.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author supo
 * @Date 2017/2/7 22:10.
 * Copyright © mizhuanglicai
 */
public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position ++;
        return menuItem;
    }
}

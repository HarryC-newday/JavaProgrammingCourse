package org.main.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.storageUnits.containsKey(unit)) {
            this.storageUnits.put(unit, new ArrayList<>());
        }

        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storageUnits.containsKey(storageUnit)) {
            ArrayList<String> items = this.storageUnits.get(storageUnit);

            items.remove(item);

            if (items.isEmpty()) {
                this.storageUnits.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storageUnits.keySet());
    }
}

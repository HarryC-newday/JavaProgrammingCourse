package org.main.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate); // Returns null if not found
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owner : this.registry.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}

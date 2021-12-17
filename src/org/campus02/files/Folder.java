package org.campus02.files;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();
    // nimmt Elemente des Dateisystems auf

    public Folder(String name) {
        super(name);
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }

    @Override
    public int getSize() {
        int totalSize = 0;

        for (FSEntry entry : entries) {
            totalSize += entry.getSize(); // "indirekte" Rekursion -> ruft die selbe Methode bei Sub-Foldern auf
        }

        return totalSize;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (FSEntry entry : entries) {
            entry.print();
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+" + name);
        for (FSEntry entry : entries) {
            entry.print(indent + "   ");
        }
    }

    @Override
    public ArrayList<FSEntry> findEntries(String name) {
        // TODO: Needed implementation!
        return null;
    }
}

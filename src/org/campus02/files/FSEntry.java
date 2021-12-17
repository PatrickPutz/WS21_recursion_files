package org.campus02.files;

import java.util.ArrayList;

// File System Entry = Dateisystemeintrag
public abstract class FSEntry {
    protected String name;

    public FSEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize() ;
    public abstract void print();
    public abstract void print(String indent);
    public abstract ArrayList<FSEntry> findEntries(String name);
}

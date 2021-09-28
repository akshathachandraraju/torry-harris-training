package com.torryharris.comparator;

import com.torryharris.model.Emplyoe;

import java.util.Comparator;

public class EmployeenameComparator implements Comparator<Emplyoe> {
    @Override
    public int compare(Emplyoe o1, Emplyoe o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

package com.buildxsd.base;

import java.util.ArrayList;

public class StringHandler {
    ArrayList<String> listLine;

    public StringHandler() {
	listLine = new ArrayList<>();
    }

    public void addLine(String line) {
	listLine.add(line);
    }

    public void deleteLine(int index) throws IndexOutOfBoundsException {
	listLine.remove(index);
    }
}

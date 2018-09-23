package com.buildxsd.base.builder;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import com.buildxsd.base.StringHandler;
import com.buildxsd.base.StringNode;

public class ClassEntryBuilder {
    private static ClassEntryBuilder singleClassEntryBuilder = null;
    private HashMap<String, StringNode> listStringNode;

    private ClassEntryBuilder() {
	listStringNode = new HashMap<>();
    }

    public static ClassEntryBuilder getStringBuilder() {
	if (singleClassEntryBuilder == null) {
	    singleClassEntryBuilder = new ClassEntryBuilder();
	}
	return singleClassEntryBuilder;
    }

    public void addStringNode(String name, Node node) {
	if (!listStringNode.containsKey(name)) {
	    listStringNode.put(name, new StringNode(node, new StringHandler()));
	} else {
	    listStringNode.replace(name, new StringNode(node, new StringHandler()));
	}
    }

    public void removeStringNode(String name) throws IndexOutOfBoundsException {
	if (listStringNode.containsKey(name)) {
	    listStringNode.remove(name);
	}
    }

    public StringNode getStringHandler(String name) throws IndexOutOfBoundsException {
	return listStringNode.get(name);
    }

    public Map<String, StringNode> getStringHandlers() {
	return listStringNode;
    }
}

package com.buildxsd.base;

import org.w3c.dom.Node;

public class StringNode {

    private Node node;
    private StringHandler stringHandler;

    public StringNode(Node node, StringHandler stringHandler) {
	this.node = node;
	this.stringHandler = stringHandler;
    }

    public Node getNodes() {
	return node;
    }

    public void setNode(Node node) {
	this.node = node;
    }

    public StringHandler getStringHandler() {
	return stringHandler;
    }

    public void setStringHandler(StringHandler stringHandler) {
	this.stringHandler = stringHandler;
    }
}

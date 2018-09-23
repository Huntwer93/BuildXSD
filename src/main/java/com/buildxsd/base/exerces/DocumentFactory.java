package com.buildxsd.base.exerces;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.apache.xerces.jaxp.DocumentBuilderImpl;

public class DocumentFactory {
    private DocumentBuilderFactoryImpl singleDocumentBuilderFactory = null;
    private DocumentBuilderImpl singleDocumentBuilder = null;

    public DocumentBuilderFactoryImpl getDocumentBuilderFactory() {
	if (singleDocumentBuilderFactory == null) {
	    singleDocumentBuilderFactory = new DocumentBuilderFactoryImpl();
	}
	return singleDocumentBuilderFactory;
    }

    public DocumentBuilderImpl getDocumentBuilder() {
	if (singleDocumentBuilder == null) {
	    try {
		singleDocumentBuilder = (DocumentBuilderImpl) getDocumentBuilderFactory().newDocumentBuilder();
	    } catch (ParserConfigurationException e) {
		e.printStackTrace();
	    }
	}
	return singleDocumentBuilder;
    }
}

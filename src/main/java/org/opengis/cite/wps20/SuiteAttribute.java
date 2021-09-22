package org.opengis.cite.wps20;

import com.sun.jersey.api.client.Client;

import java.io.File;
import java.net.URI;

import org.w3c.dom.Document;

/**
 * An enumerated type defining ISuite attributes that may be set to constitute a
 * shared test fixture.
 */
@SuppressWarnings("rawtypes")
public enum SuiteAttribute {

    /**
     * A client component for interacting with HTTP endpoints.
     */
    CLIENT("httpClient", Client.class),
    /**
     * A DOM Document that represents the test subject or metadata about it.
     */
    TEST_SUBJECT("testSubject", Document.class),
    /**
     * A File containing the test subject or a description of it.
     */
    TEST_SUBJ_FILE("testSubjectFile", File.class), 
    
    SERVICE_URL("SERVICE_URL", URI.class),
    
    ECHO_PROCESS_ID("ECHO_PROCESS_ID", String.class), 
	
	GC_XML_URI("GC_XML_URI", Document.class),
	
	DP_XML_URI("DP_XML_URI", Document.class),
	
	EX_SNC_XML_URI("EX_SNC_XML_URI", Document.class),
	
	EX_ANC_XML_URI("EX_ANC_XML_URI", Document.class),
	
	EX_ATO_XML_URI("EX_ATO_XML_URI", Document.class);
	
    private final Class attrType;
    private final String attrName;

    private SuiteAttribute(String attrName, Class attrType) {
        this.attrName = attrName;
        this.attrType = attrType;
    }

    public Class getType() {
        return attrType;
    }

    public String getName() {
        return attrName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(attrName);
        sb.append('(').append(attrType.getName()).append(')');
        return sb.toString();
    }
}

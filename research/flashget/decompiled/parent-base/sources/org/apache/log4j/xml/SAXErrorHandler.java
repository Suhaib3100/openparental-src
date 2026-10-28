package org.apache.log4j.xml;

import org.apache.log4j.helpers.LogLog;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/* loaded from: classes3.dex */
public class SAXErrorHandler implements ErrorHandler {
    private static void emitMessage(String str, SAXParseException sAXParseException) {
        LogLog.warn(String.valueOf(str) + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber());
        LogLog.warn(sAXParseException.getMessage(), sAXParseException.getException());
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        emitMessage("Continuable parsing error ", sAXParseException);
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        emitMessage("Fatal parsing error ", sAXParseException);
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        emitMessage("Parsing warning ", sAXParseException);
    }
}

package com.tencent.cos.xml.model.tag.eventstreaming;

import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class CSVOutput implements Serializable, Cloneable {
    private String fieldDelimiter;
    private String quoteCharacter;
    private String quoteEscapeCharacter;
    private String quoteFields;
    private String recordDelimiter;

    public CSVOutput(String str, String str2, String str3, String str4, String str5) {
        this.quoteFields = str;
        this.recordDelimiter = str2;
        this.fieldDelimiter = str3;
        this.quoteCharacter = str4;
        this.quoteEscapeCharacter = str5;
    }

    private String charToString(Character ch) {
        if (ch == null) {
            return null;
        }
        return ch.toString();
    }

    private Character stringToChar(String str) {
        if (str == null) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    private void validateNotEmpty(String str, String str2) {
        if ("".equals(str)) {
            throw new IllegalArgumentException(j.a(str2, ProtectedSandApp.s("丳\u0001")));
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("临\u0001"), e4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CSVOutput)) {
            return false;
        }
        CSVOutput cSVOutput = (CSVOutput) obj;
        if ((cSVOutput.getQuoteEscapeCharacterAsString() == null) ^ (getQuoteEscapeCharacterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getQuoteEscapeCharacterAsString() != null && !cSVOutput.getQuoteEscapeCharacterAsString().equals(getQuoteEscapeCharacterAsString())) {
            return false;
        }
        if ((cSVOutput.getQuoteFields() == null) ^ (getQuoteFields() == null)) {
            return false;
        }
        if (cSVOutput.getQuoteFields() != null && !cSVOutput.getQuoteFields().equals(getQuoteFields())) {
            return false;
        }
        if ((cSVOutput.getRecordDelimiterAsString() == null) ^ (getRecordDelimiterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getRecordDelimiterAsString() != null && !cSVOutput.getRecordDelimiterAsString().equals(getRecordDelimiterAsString())) {
            return false;
        }
        if ((cSVOutput.getFieldDelimiterAsString() == null) ^ (getFieldDelimiterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getFieldDelimiterAsString() != null && !cSVOutput.getFieldDelimiterAsString().equals(getFieldDelimiterAsString())) {
            return false;
        }
        if ((cSVOutput.getQuoteCharacterAsString() == null) ^ (getQuoteCharacterAsString() == null)) {
            return false;
        }
        return cSVOutput.getQuoteCharacterAsString() == null || cSVOutput.getQuoteCharacterAsString().equals(getQuoteCharacterAsString());
    }

    public Character getFieldDelimiter() {
        return stringToChar(this.fieldDelimiter);
    }

    public String getFieldDelimiterAsString() {
        return this.fieldDelimiter;
    }

    public Character getQuoteCharacter() {
        return stringToChar(this.quoteCharacter);
    }

    public String getQuoteCharacterAsString() {
        return this.quoteCharacter;
    }

    public Character getQuoteEscapeCharacter() {
        return stringToChar(this.quoteEscapeCharacter);
    }

    public String getQuoteEscapeCharacterAsString() {
        return this.quoteEscapeCharacter;
    }

    public String getQuoteFields() {
        return this.quoteFields;
    }

    public Character getRecordDelimiter() {
        return stringToChar(this.recordDelimiter);
    }

    public String getRecordDelimiterAsString() {
        return this.recordDelimiter;
    }

    public int hashCode() {
        return (((((((((getQuoteFields() == null ? 0 : getQuoteFields().hashCode()) + 31) * 31) + (getQuoteEscapeCharacterAsString() == null ? 0 : getQuoteEscapeCharacterAsString().hashCode())) * 31) + (getRecordDelimiterAsString() == null ? 0 : getRecordDelimiterAsString().hashCode())) * 31) + (getFieldDelimiterAsString() == null ? 0 : getFieldDelimiterAsString().hashCode())) * 31) + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0);
    }

    public void setFieldDelimiter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丵\u0001"));
        this.fieldDelimiter = str;
    }

    public void setQuoteCharacter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丶\u0001"));
        this.quoteCharacter = str;
    }

    public void setQuoteEscapeCharacter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丷\u0001"));
        this.quoteEscapeCharacter = str;
    }

    public void setQuoteFields(String str) {
        this.quoteFields = str;
    }

    public void setRecordDelimiter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丸\u0001"));
        this.recordDelimiter = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("丹\u0001"));
        String quoteFields = getQuoteFields();
        String s4 = ProtectedSandApp.s("为\u0001");
        if (quoteFields != null) {
            sb.append(ProtectedSandApp.s("主\u0001"));
            sb.append(getQuoteFields());
            sb.append(s4);
        }
        if (getQuoteEscapeCharacter() != null) {
            sb.append(ProtectedSandApp.s("丼\u0001"));
            sb.append(getQuoteEscapeCharacterAsString());
            sb.append(s4);
        }
        if (getRecordDelimiter() != null) {
            sb.append(ProtectedSandApp.s("丽\u0001"));
            sb.append(getRecordDelimiterAsString());
            sb.append(s4);
        }
        if (getFieldDelimiter() != null) {
            sb.append(ProtectedSandApp.s("举\u0001"));
            sb.append(getFieldDelimiterAsString());
            sb.append(s4);
        }
        if (getQuoteCharacter() != null) {
            sb.append(ProtectedSandApp.s("丿\u0001"));
            sb.append(getQuoteCharacterAsString());
        }
        sb.append(ProtectedSandApp.s("乀\u0001"));
        return sb.toString();
    }

    public CSVOutput withFieldDelimiter(String str) {
        setFieldDelimiter(str);
        return this;
    }

    public CSVOutput withQuoteCharacter(String str) {
        setQuoteCharacter(str);
        return this;
    }

    public CSVOutput withQuoteEscapeCharacter(String str) {
        setQuoteEscapeCharacter(str);
        return this;
    }

    public CSVOutput withQuoteFields(String str) {
        setQuoteFields(str);
        return this;
    }

    public CSVOutput withRecordDelimiter(String str) {
        setRecordDelimiter(str);
        return this;
    }

    public void setQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields == null ? null : quoteFields.toString());
    }

    public CSVOutput withFieldDelimiter(Character ch) {
        setFieldDelimiter(ch);
        return this;
    }

    public CSVOutput withQuoteCharacter(Character ch) {
        setQuoteCharacter(ch);
        return this;
    }

    public CSVOutput withQuoteEscapeCharacter(Character ch) {
        setQuoteEscapeCharacter(ch);
        return this;
    }

    public CSVOutput withQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields);
        return this;
    }

    public CSVOutput withRecordDelimiter(Character ch) {
        setRecordDelimiter(ch);
        return this;
    }

    public void setFieldDelimiter(Character ch) {
        setFieldDelimiter(charToString(ch));
    }

    public void setQuoteCharacter(Character ch) {
        setQuoteCharacter(charToString(ch));
    }

    public void setQuoteEscapeCharacter(Character ch) {
        setQuoteEscapeCharacter(charToString(ch));
    }

    public void setRecordDelimiter(Character ch) {
        setRecordDelimiter(charToString(ch));
    }
}

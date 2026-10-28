package com.tencent.cos.xml.model.tag.eventstreaming;

import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class CSVInput implements Serializable, Cloneable {
    private Boolean allowQuotedRecordDelimiter;
    private String comments;
    private String fieldDelimiter;
    private String fileHeaderInfo;
    private String quoteCharacter;
    private String quoteEscapeCharacter;
    private String recordDelimiter;

    public CSVInput(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.recordDelimiter = str;
        this.fieldDelimiter = str2;
        this.quoteCharacter = str3;
        this.quoteEscapeCharacter = str4;
        this.allowQuotedRecordDelimiter = bool;
        this.fileHeaderInfo = str5;
        this.comments = str6;
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
            throw new IllegalArgumentException(j.a(str2, ProtectedSandApp.s("丢\u0001")));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CSVInput)) {
            return false;
        }
        CSVInput cSVInput = (CSVInput) obj;
        if ((cSVInput.getFileHeaderInfo() == null) ^ (getFileHeaderInfo() == null)) {
            return false;
        }
        if (cSVInput.getFileHeaderInfo() != null && !cSVInput.getFileHeaderInfo().equals(getFileHeaderInfo())) {
            return false;
        }
        if ((cSVInput.getQuoteEscapeCharacterAsString() == null) ^ (getQuoteEscapeCharacterAsString() == null)) {
            return false;
        }
        if (cSVInput.getQuoteEscapeCharacterAsString() != null && !cSVInput.getQuoteEscapeCharacterAsString().equals(getQuoteEscapeCharacterAsString())) {
            return false;
        }
        if ((cSVInput.getCommentsAsString() == null) ^ (getCommentsAsString() == null)) {
            return false;
        }
        if (cSVInput.getCommentsAsString() != null && !cSVInput.getCommentsAsString().equals(getCommentsAsString())) {
            return false;
        }
        if ((cSVInput.getRecordDelimiterAsString() == null) ^ (getRecordDelimiterAsString() == null)) {
            return false;
        }
        if (cSVInput.getRecordDelimiterAsString() != null && !cSVInput.getRecordDelimiterAsString().equals(getRecordDelimiterAsString())) {
            return false;
        }
        if ((cSVInput.getFieldDelimiterAsString() == null) ^ (getFieldDelimiterAsString() == null)) {
            return false;
        }
        if (cSVInput.getFieldDelimiterAsString() != null && !cSVInput.getFieldDelimiterAsString().equals(getFieldDelimiterAsString())) {
            return false;
        }
        if ((cSVInput.getQuoteCharacterAsString() == null) ^ (getQuoteCharacterAsString() == null)) {
            return false;
        }
        if (cSVInput.getQuoteCharacterAsString() == null || cSVInput.getQuoteCharacterAsString().equals(getQuoteCharacterAsString())) {
            return cSVInput.getAllowQuotedRecordDelimiter() == null || cSVInput.getAllowQuotedRecordDelimiter().equals(getAllowQuotedRecordDelimiter());
        }
        return false;
    }

    public Boolean getAllowQuotedRecordDelimiter() {
        return this.allowQuotedRecordDelimiter;
    }

    public Character getComments() {
        return stringToChar(this.comments);
    }

    public String getCommentsAsString() {
        return this.comments;
    }

    public Character getFieldDelimiter() {
        return stringToChar(this.fieldDelimiter);
    }

    public String getFieldDelimiterAsString() {
        return this.fieldDelimiter;
    }

    public String getFileHeaderInfo() {
        return this.fileHeaderInfo;
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

    public Character getRecordDelimiter() {
        return stringToChar(this.recordDelimiter);
    }

    public String getRecordDelimiterAsString() {
        return this.recordDelimiter;
    }

    public int hashCode() {
        return (((((((((((((getFileHeaderInfo() == null ? 0 : getFileHeaderInfo().hashCode()) + 31) * 31) + (getCommentsAsString() == null ? 0 : getCommentsAsString().hashCode())) * 31) + (getQuoteEscapeCharacterAsString() == null ? 0 : getQuoteEscapeCharacterAsString().hashCode())) * 31) + (getRecordDelimiterAsString() == null ? 0 : getRecordDelimiterAsString().hashCode())) * 31) + (getFieldDelimiterAsString() == null ? 0 : getFieldDelimiterAsString().hashCode())) * 31) + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0)) * 31) + (getAllowQuotedRecordDelimiter() != null ? getAllowQuotedRecordDelimiter().hashCode() : 0);
    }

    public void setAllowQuotedRecordDelimiter(Boolean bool) {
        this.allowQuotedRecordDelimiter = bool;
    }

    public void setComments(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("两\u0001"));
        this.comments = str;
    }

    public void setFieldDelimiter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("严\u0001"));
        this.fieldDelimiter = str;
    }

    public void setFileHeaderInfo(String str) {
        this.fileHeaderInfo = str;
    }

    public void setQuoteCharacter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("並\u0001"));
        this.quoteCharacter = str;
    }

    public void setQuoteEscapeCharacter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丧\u0001"));
        this.quoteEscapeCharacter = str;
    }

    public void setRecordDelimiter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("丨\u0001"));
        this.recordDelimiter = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("丩\u0001"));
        String fileHeaderInfo = getFileHeaderInfo();
        String s4 = ProtectedSandApp.s("个\u0001");
        if (fileHeaderInfo != null) {
            sb.append(ProtectedSandApp.s("丫\u0001"));
            sb.append(getFileHeaderInfo());
            sb.append(s4);
        }
        if (getCommentsAsString() != null) {
            sb.append(ProtectedSandApp.s("丬\u0001"));
            sb.append(getCommentsAsString());
            sb.append(s4);
        }
        if (getQuoteEscapeCharacterAsString() != null) {
            sb.append(ProtectedSandApp.s("中\u0001"));
            sb.append(getQuoteEscapeCharacterAsString());
            sb.append(s4);
        }
        if (getRecordDelimiterAsString() != null) {
            sb.append(ProtectedSandApp.s("丮\u0001"));
            sb.append(getRecordDelimiterAsString());
            sb.append(s4);
        }
        if (getFieldDelimiterAsString() != null) {
            sb.append(ProtectedSandApp.s("丯\u0001"));
            sb.append(getFieldDelimiterAsString());
            sb.append(s4);
        }
        if (getQuoteCharacterAsString() != null) {
            sb.append(ProtectedSandApp.s("丰\u0001"));
            sb.append(getQuoteCharacterAsString());
        }
        if (getAllowQuotedRecordDelimiter() != null) {
            sb.append(ProtectedSandApp.s("丱\u0001"));
            sb.append(getAllowQuotedRecordDelimiter());
        }
        sb.append(ProtectedSandApp.s("串\u0001"));
        return sb.toString();
    }

    public CSVInput withAllowQuotedRecordDelimiter(Boolean bool) {
        setAllowQuotedRecordDelimiter(bool);
        return this;
    }

    public CSVInput withComments(String str) {
        setComments(str);
        return this;
    }

    public CSVInput withFieldDelimiter(String str) {
        setFieldDelimiter(str);
        return this;
    }

    public CSVInput withFileHeaderInfo(String str) {
        setFileHeaderInfo(str);
        return this;
    }

    public CSVInput withQuoteCharacter(String str) {
        setQuoteCharacter(str);
        return this;
    }

    public CSVInput withQuoteEscapeCharacter(String str) {
        setQuoteEscapeCharacter(str);
        return this;
    }

    public CSVInput withRecordDelimiter(String str) {
        setRecordDelimiter(str);
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CSVInput m15clone() {
        try {
            return (CSVInput) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("丣\u0001"), e4);
        }
    }

    public void setFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo == null ? null : fileHeaderInfo.toString());
    }

    public CSVInput withComments(Character ch) {
        setComments(ch);
        return this;
    }

    public CSVInput withFieldDelimiter(Character ch) {
        setFieldDelimiter(ch);
        return this;
    }

    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo);
        return this;
    }

    public CSVInput withQuoteCharacter(Character ch) {
        setQuoteCharacter(ch);
        return this;
    }

    public CSVInput withQuoteEscapeCharacter(Character ch) {
        setQuoteEscapeCharacter(ch);
        return this;
    }

    public CSVInput withRecordDelimiter(Character ch) {
        setRecordDelimiter(ch);
        return this;
    }

    public void setComments(Character ch) {
        setComments(charToString(ch));
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

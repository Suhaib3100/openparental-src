package com.tencent.cos.xml.model.tag.eventstreaming;

import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class JSONOutput implements Serializable {
    private String recordDelimiter;

    public JSONOutput() {
        this(ProtectedSandApp.s("乫\u0001"));
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
            throw new IllegalArgumentException(j.a(str2, ProtectedSandApp.s("乬\u0001")));
        }
    }

    public Character getRecordDelimiter() {
        return stringToChar(this.recordDelimiter);
    }

    public String getRecordDelimiterAsString() {
        return this.recordDelimiter;
    }

    public void setRecordDelimiter(String str) {
        validateNotEmpty(str, ProtectedSandApp.s("乭\u0001"));
        this.recordDelimiter = str;
    }

    public JSONOutput withRecordDelimiter(String str) {
        setRecordDelimiter(str);
        return this;
    }

    public JSONOutput(String str) {
        this.recordDelimiter = str;
    }

    public JSONOutput withRecordDelimiter(Character ch) {
        setRecordDelimiter(ch);
        return this;
    }

    public void setRecordDelimiter(Character ch) {
        setRecordDelimiter(charToString(ch));
    }
}

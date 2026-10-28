package com.tencent.cos.xml.model.tag.eventstreaming;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class OutputSerialization implements Serializable, Cloneable {
    private CSVOutput csv;
    private JSONOutput json;

    public OutputSerialization(CSVOutput cSVOutput) {
        this.csv = cSVOutput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OutputSerialization)) {
            return false;
        }
        OutputSerialization outputSerialization = (OutputSerialization) obj;
        if ((outputSerialization.getCsv() == null) ^ (getCsv() == null)) {
            return false;
        }
        if (outputSerialization.getCsv() != null && !outputSerialization.getCsv().equals(getCsv())) {
            return false;
        }
        if ((outputSerialization.getJson() == null) ^ (getJson() == null)) {
            return false;
        }
        return outputSerialization.getJson() == null || outputSerialization.getJson().equals(getJson());
    }

    public CSVOutput getCsv() {
        return this.csv;
    }

    public JSONOutput getJson() {
        return this.json;
    }

    public int hashCode() {
        return (((getCsv() == null ? 0 : getCsv().hashCode()) + 31) * 31) + (getJson() != null ? getJson().hashCode() : 0);
    }

    public void setCsv(CSVOutput cSVOutput) {
        this.csv = cSVOutput;
    }

    public void setJson(JSONOutput jSONOutput) {
        this.json = jSONOutput;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("乼\u0001"));
        if (getCsv() != null) {
            sb.append(ProtectedSandApp.s("乽\u0001"));
            sb.append(getCsv());
        }
        if (getJson() != null) {
            sb.append(ProtectedSandApp.s("乾\u0001"));
            sb.append(getJson());
        }
        sb.append(ProtectedSandApp.s("乿\u0001"));
        return sb.toString();
    }

    public OutputSerialization withCsv(CSVOutput cSVOutput) {
        setCsv(cSVOutput);
        return this;
    }

    public OutputSerialization withJson(JSONOutput jSONOutput) {
        setJson(jSONOutput);
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OutputSerialization m17clone() {
        try {
            return (OutputSerialization) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("乻\u0001"), e4);
        }
    }

    public OutputSerialization(JSONOutput jSONOutput) {
        this.json = jSONOutput;
    }
}

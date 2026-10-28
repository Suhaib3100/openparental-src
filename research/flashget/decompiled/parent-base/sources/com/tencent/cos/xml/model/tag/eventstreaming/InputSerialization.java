package com.tencent.cos.xml.model.tag.eventstreaming;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class InputSerialization {
    private String compressionType;
    private CSVInput csv;
    private JSONInput json;
    private ParquetInput parquet;

    public InputSerialization(CompressionType compressionType, CSVInput cSVInput) {
        this.csv = cSVInput;
        this.compressionType = compressionType.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InputSerialization)) {
            return false;
        }
        InputSerialization inputSerialization = (InputSerialization) obj;
        if ((inputSerialization.getCsv() == null) ^ (getCsv() == null)) {
            return false;
        }
        if (inputSerialization.getCsv() != null && !inputSerialization.getCsv().equals(getCsv())) {
            return false;
        }
        if ((inputSerialization.getJson() == null) ^ (getJson() == null)) {
            return false;
        }
        if (inputSerialization.getJson() != null && !inputSerialization.getJson().equals(getJson())) {
            return false;
        }
        if ((inputSerialization.getCompressionType() == null) ^ (getCompressionType() == null)) {
            return false;
        }
        return inputSerialization.getCompressionType() == null || inputSerialization.getCompressionType().equals(getCompressionType());
    }

    public String getCompressionType() {
        return this.compressionType;
    }

    public CSVInput getCsv() {
        return this.csv;
    }

    public JSONInput getJson() {
        return this.json;
    }

    public ParquetInput getParquet() {
        return this.parquet;
    }

    public int hashCode() {
        return (((((getCsv() == null ? 0 : getCsv().hashCode()) + 31) * 31) + (getJson() == null ? 0 : getJson().hashCode())) * 31) + (getCompressionType() != null ? getCompressionType().hashCode() : 0);
    }

    public void setCompressionType(String str) {
        this.compressionType = str;
    }

    public void setCsv(CSVInput cSVInput) {
        this.csv = cSVInput;
    }

    public void setJson(JSONInput jSONInput) {
        this.json = jSONInput;
    }

    public void setParquet(ParquetInput parquetInput) {
        this.parquet = parquetInput;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("书\u0001"));
        if (getCsv() != null) {
            sb.append(ProtectedSandApp.s("乧\u0001"));
            sb.append(getCsv());
        }
        if (getJson() != null) {
            sb.append(ProtectedSandApp.s("乨\u0001"));
            sb.append(getJson());
        }
        if (getCompressionType() != null) {
            sb.append(ProtectedSandApp.s("乩\u0001"));
            sb.append(getCompressionType());
        }
        sb.append(ProtectedSandApp.s("乪\u0001"));
        return sb.toString();
    }

    public InputSerialization withCompressionType(String str) {
        setCompressionType(str);
        return this;
    }

    public InputSerialization withCsv(CSVInput cSVInput) {
        setCsv(cSVInput);
        return this;
    }

    public InputSerialization withJson(JSONInput jSONInput) {
        setJson(jSONInput);
        return this;
    }

    public InputSerialization withParquet(ParquetInput parquetInput) {
        setParquet(parquetInput);
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InputSerialization m16clone() {
        try {
            return (InputSerialization) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("乥\u0001"), e4);
        }
    }

    public void setCompressionType(CompressionType compressionType) {
        setCompressionType(compressionType == null ? null : compressionType.toString());
    }

    public InputSerialization withCompressionType(CompressionType compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    public InputSerialization(CompressionType compressionType, JSONInput jSONInput) {
        this.compressionType = compressionType.toString();
        this.json = jSONInput;
    }

    public InputSerialization(String str, CSVInput cSVInput) {
        this.csv = cSVInput;
        this.compressionType = str;
    }

    public InputSerialization(String str, JSONInput jSONInput) {
        this.compressionType = str;
        this.json = jSONInput;
    }
}

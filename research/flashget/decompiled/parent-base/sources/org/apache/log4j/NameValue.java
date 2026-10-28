package org.apache.log4j;

/* compiled from: PropertyConfigurator.java */
/* loaded from: classes3.dex */
class NameValue {
    String key;
    String value;

    public NameValue(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String toString() {
        return String.valueOf(this.key) + "=" + this.value;
    }
}

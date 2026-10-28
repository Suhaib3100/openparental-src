package net.time4j.engine;

import java.util.Locale;

/* compiled from: ValidationElement.java */
/* loaded from: classes7.dex */
public enum p0 implements q<String> {
    ERROR_MESSAGE;

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<String> getType() {
        return String.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // java.util.Comparator
    public int compare(p pVar, p pVar2) {
        boolean w4 = pVar.w(this);
        if (w4 == pVar2.w(this)) {
            return 0;
        }
        return w4 ? 1 : -1;
    }

    @Override // net.time4j.engine.q
    public String getDefaultMaximum() {
        return String.valueOf(kotlin.jvm.internal.r.MAX_VALUE);
    }

    @Override // net.time4j.engine.q
    public String getDefaultMinimum() {
        return "";
    }
}

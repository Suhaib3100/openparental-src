package net.time4j.engine;

import java.util.Locale;

/* compiled from: FlagElement.java */
/* loaded from: classes7.dex */
public enum c0 implements q<Boolean> {
    LEAP_SECOND,
    DAYLIGHT_SAVING;

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<Boolean> getType() {
        return Boolean.class;
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.q
    public Boolean getDefaultMaximum() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.q
    public Boolean getDefaultMinimum() {
        return Boolean.FALSE;
    }
}

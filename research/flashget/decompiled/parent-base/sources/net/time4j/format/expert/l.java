package net.time4j.format.expert;

import java.math.BigDecimal;
import java.util.Locale;

/* compiled from: FractionalElement.java */
/* loaded from: classes7.dex */
enum l implements net.time4j.engine.q<BigDecimal> {
    FRACTION;

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
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
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return ((BigDecimal) pVar.r(this)).compareTo((BigDecimal) pVar2.r(this));
    }

    @Override // net.time4j.engine.q
    public BigDecimal getDefaultMaximum() {
        return BigDecimal.ONE;
    }

    @Override // net.time4j.engine.q
    public BigDecimal getDefaultMinimum() {
        return BigDecimal.ZERO;
    }
}

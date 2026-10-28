package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Locale;

/* compiled from: BasicElement.java */
/* loaded from: classes7.dex */
public abstract class e<V extends Comparable<V>> implements q<V>, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    protected e(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("襵\u0001"));
        }
        this.name = str;
        int hashCode = str.hashCode();
        this.hash = hashCode;
        if (!u()) {
            hashCode = -1;
        } else if (hashCode == -1) {
            hashCode = ~hashCode;
        }
        this.identity = hashCode;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e<?> eVar = (e) obj;
        int i4 = this.identity;
        if (i4 == eVar.identity) {
            if (i4 != -1) {
                return true;
            }
            if (this.name.equals(eVar.name) && k(eVar)) {
                return true;
            }
        }
        return false;
    }

    protected <T extends r<T>> a0<T, V> g(x<T> xVar) {
        return null;
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return this.name;
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    protected boolean k(e<?> eVar) {
        return true;
    }

    protected q<?> n() {
        return null;
    }

    @Override // net.time4j.engine.q
    public final String name() {
        return this.name;
    }

    protected String o(x<?> xVar) {
        if (!t() || !net.time4j.base.f.class.isAssignableFrom(xVar.C())) {
            return null;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("襶\u0001"));
        sb.append(this.name);
        sb.append(ProtectedSandApp.s("襷\u0001"));
        return android.support.v4.media.c.a(sb, this.name, ProtectedSandApp.s("襸\u0001"));
    }

    public boolean t() {
        return true;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 32);
        sb.append(name);
        sb.append('@');
        sb.append(this.name);
        return sb.toString();
    }

    protected boolean u() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Comparator
    public int compare(p pVar, p pVar2) {
        return ((Comparable) pVar.r(this)).compareTo(pVar2.r(this));
    }
}

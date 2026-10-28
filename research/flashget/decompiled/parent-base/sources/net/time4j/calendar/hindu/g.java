package net.time4j.calendar.hindu;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Locale;
import net.time4j.calendar.b0;
import net.time4j.engine.o;
import net.time4j.format.m;
import net.time4j.format.x;

/* compiled from: HinduMonth.java */
/* loaded from: classes7.dex */
public final class g extends h implements Comparable<g>, o<d>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82526d = net.time4j.format.a.e(ProtectedSandApp.s("郅\u0001"), Boolean.class);
    private final boolean leap;
    private final b0 value;

    private g(b0 b0Var, boolean z4) {
        if (b0Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("郆\u0001"));
        }
        this.value = b0Var;
        this.leap = z4;
    }

    private static String c(Locale locale) {
        return android.support.v4.media.c.a(new StringBuilder(), net.time4j.format.b.d(ProtectedSandApp.s("郇\u0001"), locale).o().get(ProtectedSandApp.s("郈\u0001")), ProtectedSandApp.s("郉\u0001"));
    }

    public static g i(b0 b0Var) {
        return new g(b0Var, false);
    }

    public static g j(int i4) {
        return new g(b0.valueOf(i4), false);
    }

    public static g k(int i4) {
        return new g(b0.valueOf(i4 != 12 ? 1 + i4 : 1), false);
    }

    @Override // net.time4j.calendar.hindu.h
    public boolean a() {
        return this.leap;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        int compareTo = this.value.compareTo(gVar.value);
        if (compareTo != 0) {
            return compareTo;
        }
        if (this.leap) {
            return gVar.leap ? 0 : -1;
        }
        return gVar.leap ? 1 : 0;
    }

    public String d(Locale locale) {
        return e(locale, x.WIDE, m.FORMAT);
    }

    public String e(Locale locale, x xVar, m mVar) {
        String g4 = net.time4j.format.b.d(ProtectedSandApp.s("郊\u0001"), locale).n(xVar, mVar).g(this.value);
        return this.leap ? android.support.v4.media.c.a(new StringBuilder(), c(locale), g4) : g4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.value == gVar.value && this.leap == gVar.leap;
    }

    public int f() {
        if (this.value == b0.CHAITRA) {
            return 12;
        }
        return r0.getValue() - 1;
    }

    public String g(Locale locale) {
        String g4 = net.time4j.format.b.d(ProtectedSandApp.s("郇\u0001"), locale).p(ProtectedSandApp.s("郋\u0001"), b0.class, new String[0]).g(b0.valueOf(f()));
        return this.leap ? android.support.v4.media.c.a(new StringBuilder(), c(locale), g4) : g4;
    }

    public b0 h() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.leap ? 12 : 0);
    }

    @Override // net.time4j.engine.o
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean test(d dVar) {
        return equals(dVar.B0());
    }

    public g m() {
        return this.leap ? this : new g(this.value, true);
    }

    public String toString() {
        String obj = this.value.toString();
        return this.leap ? androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("郌\u0001"), obj) : obj;
    }
}

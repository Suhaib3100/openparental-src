package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;

/* compiled from: EastAsianMonth.java */
/* loaded from: classes7.dex */
public final class l implements Comparable<l>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f82591b = net.time4j.format.a.e(ProtectedSandApp.s("鄕\u0001"), Character.class);

    /* renamed from: c, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82592c = net.time4j.format.a.e(ProtectedSandApp.s("鄖\u0001"), Boolean.class);

    /* renamed from: d, reason: collision with root package name */
    private static final l[] f82593d;
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        l[] lVarArr = new l[24];
        for (int i4 = 0; i4 < 12; i4++) {
            lVarArr[i4] = new l(i4, false);
            lVarArr[i4 + 12] = new l(i4, true);
        }
        f82593d = lVarArr;
    }

    private l(int i4, boolean z4) {
        this.index = i4;
        this.leap = z4;
    }

    public static l f(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鄗\u0001"), i4));
        }
        return f82593d[i4 - 1];
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return f82593d[this.index + (this.leap ? 12 : 0)];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        int i4 = this.index;
        int i5 = lVar.index;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return this.leap ? !lVar.leap ? 1 : 0 : lVar.leap ? -1 : 0;
    }

    public String b(Locale locale, net.time4j.format.j jVar) {
        String c5 = c(locale, jVar, net.time4j.format.a.f());
        String language = locale.getLanguage();
        boolean equals = language.equals(ProtectedSandApp.s("鄘\u0001"));
        String s4 = ProtectedSandApp.s("鄙\u0001");
        return equals ? androidx.compose.runtime.changelist.j.a(c5, s4) : language.equals(ProtectedSandApp.s("鄚\u0001")) ? androidx.compose.runtime.changelist.j.a(c5, ProtectedSandApp.s("鄛\u0001")) : language.equals(ProtectedSandApp.s("鄜\u0001")) ? androidx.compose.runtime.changelist.j.a(c5, s4) : c5;
    }

    String c(Locale locale, net.time4j.format.j jVar, net.time4j.engine.d dVar) {
        StringBuilder sb;
        Map<String, String> o4 = net.time4j.format.b.d(ProtectedSandApp.s("鄝\u0001"), locale).o();
        String a5 = pe.b.a(jVar, ((Character) dVar.b(net.time4j.format.a.f82791m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue(), this.index + 1);
        if (!this.leap) {
            return a5;
        }
        boolean booleanValue = ((Boolean) dVar.b(f82592c, Boolean.valueOf(ProtectedSandApp.s("鄟\u0001").equals(o4.get(ProtectedSandApp.s("鄞\u0001")))))).booleanValue();
        char charValue = ((Character) dVar.b(f82591b, Character.valueOf(o4.get(ProtectedSandApp.s("鄠\u0001")).charAt(0)))).charValue();
        if (booleanValue) {
            sb = new StringBuilder();
            sb.append(a5);
            sb.append(charValue);
        } else {
            sb = new StringBuilder();
            sb.append(charValue);
            sb.append(a5);
        }
        return sb.toString();
    }

    public String d(Locale locale) {
        return net.time4j.format.b.d(ProtectedSandApp.s("鄡\u0001"), locale).o().get(ProtectedSandApp.s("鄢\u0001") + (this.index + 1));
    }

    public boolean e() {
        return this.leap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.index == lVar.index && this.leap == lVar.leap;
    }

    public l g() {
        return f82593d[this.index + 12];
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.index + 1);
        return this.leap ? androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鄣\u0001"), valueOf) : valueOf;
    }
}

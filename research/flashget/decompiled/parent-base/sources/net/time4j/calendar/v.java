package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.ChronoException;

/* compiled from: HijriAdjustment.java */
/* loaded from: classes7.dex */
public final class v implements net.time4j.engine.q0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f82659b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82660c;

    private v(String str, int i4) {
        if (i4 < -3 || i4 > 3) {
            throw new ChronoException(android.support.v4.media.a.a(ProtectedSandApp.s("鉽\u0001"), i4));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鉼\u0001"));
        }
        this.f82660c = i4;
        this.f82659b = str;
    }

    static v a(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return new v(str, 0);
        }
        try {
            return new v(str.substring(0, indexOf), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException unused) {
            throw new ChronoException(ProtectedSandApp.s("鉾\u0001").concat(str));
        }
    }

    public static v d(String str, int i4) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? new v(str, i4) : new v(str.substring(0, indexOf), i4);
    }

    public static v e(net.time4j.engine.q0 q0Var, int i4) {
        return d(q0Var.getVariant(), i4);
    }

    public static v f(int i4) {
        return new v(ProtectedSandApp.s("鉿\u0001"), i4);
    }

    String b() {
        return this.f82659b;
    }

    public int c() {
        return this.f82660c;
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        if (this.f82660c == 0) {
            return this.f82659b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82659b);
        sb.append(':');
        if (this.f82660c > 0) {
            sb.append('+');
        }
        sb.append(this.f82660c);
        return sb.toString();
    }
}

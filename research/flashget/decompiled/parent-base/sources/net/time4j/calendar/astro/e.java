package net.time4j.calendar.astro;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.d0;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.tz.p;

/* compiled from: JulianDay.java */
/* loaded from: classes7.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final int f82273b = 1000000000;

    /* renamed from: c, reason: collision with root package name */
    private static final int f82274c = 86400;

    /* renamed from: d, reason: collision with root package name */
    private static final long f82275d = 210866760000L;

    /* renamed from: e, reason: collision with root package name */
    private static final long f82276e = 210929832000L;

    /* renamed from: f, reason: collision with root package name */
    public static final double f82277f = 990575.0d;

    /* renamed from: g, reason: collision with root package name */
    public static final double f82278g = 2817152.0d;
    private static final long serialVersionUID = 486345450973062467L;
    private final net.time4j.scale.f scale;
    private final double value;

    /* compiled from: JulianDay.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82279a;

        static {
            int[] iArr = new int[net.time4j.scale.f.values().length];
            f82279a = iArr;
            try {
                iArr[net.time4j.scale.f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82279a[net.time4j.scale.f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82279a[net.time4j.scale.f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private e(double d5, net.time4j.scale.f fVar) {
        a(d5, fVar);
        this.value = d5;
        this.scale = fVar;
    }

    private static void a(double d5, net.time4j.scale.f fVar) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("诋\u0001"), d5));
        }
        int i4 = a.f82279a[fVar.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalArgumentException(ProtectedSandApp.s("诉\u0001") + fVar);
        }
        if (Double.compare(990575.0d, d5) > 0 || Double.compare(d5, 2817152.0d) > 0) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("诊\u0001"), d5));
        }
    }

    static double f(d0 d0Var, net.time4j.scale.f fVar) {
        return ((d0Var.p(fVar) / 1.0E9d) + (d0Var.c(fVar) + g(fVar))) / 86400.0d;
    }

    private static long g(net.time4j.scale.f fVar) {
        int i4 = a.f82279a[fVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return f82276e;
        }
        if (i4 == 3) {
            return f82275d;
        }
        throw new UnsupportedOperationException(fVar.name());
    }

    public static e j(double d5) {
        return new e(d5, net.time4j.scale.f.TT);
    }

    public static e k(d0 d0Var) {
        net.time4j.scale.f fVar = net.time4j.scale.f.TT;
        return new e(f(d0Var, fVar), fVar);
    }

    public static e l(net.time4j.engine.h hVar, m0 m0Var, p pVar) {
        return new e(((net.time4j.engine.b0.JULIAN_DAY_NUMBER.transform(hVar.b(), net.time4j.engine.b0.UTC) - 0.5d) + (((Long) m0Var.r(m0.J)).longValue() / 8.64E13d)) - (pVar.i() / 86400.0d), net.time4j.scale.f.TT);
    }

    public static e m(double d5) {
        return new e(d5, net.time4j.scale.f.UT);
    }

    public static e n(d0 d0Var) {
        net.time4j.scale.f fVar = net.time4j.scale.f.UT;
        return new e(f(d0Var, fVar), fVar);
    }

    public static e o(double d5) {
        return new e(d5, net.time4j.scale.f.POSIX);
    }

    public static e p(d0 d0Var) {
        net.time4j.scale.f fVar = net.time4j.scale.f.POSIX;
        return new e(f(d0Var, fVar), fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        try {
            objectInputStream.defaultReadObject();
            a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    public double b() {
        return (this.value - 2451545.0d) / 36525.0d;
    }

    public double c() {
        return this.value - 2400000.5d;
    }

    public net.time4j.scale.f d() {
        return this.scale;
    }

    public double e() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.value == eVar.value && this.scale == eVar.scale;
    }

    public e h(double d5) {
        return new e(this.value - d5, this.scale);
    }

    public int hashCode() {
        return net.time4j.calendar.astro.a.c(this.value) ^ this.scale.hashCode();
    }

    public e i(double d5) {
        return new e(this.value - (d5 / 86400.0d), this.scale);
    }

    public e q(double d5) {
        return new e(this.value + d5, this.scale);
    }

    public e r(double d5) {
        return new e((d5 / 86400.0d) + this.value, this.scale);
    }

    public d0 s() {
        net.time4j.scale.f fVar;
        double d5 = this.value * 86400.0d;
        net.time4j.scale.f fVar2 = this.scale;
        if (!net.time4j.scale.d.u0().z0() && fVar2 != (fVar = net.time4j.scale.f.POSIX)) {
            if (fVar2 == net.time4j.scale.f.TT) {
                l0 w12 = l0.w1((long) Math.floor(c()), net.time4j.engine.b0.MODIFIED_JULIAN_DATE);
                d5 -= net.time4j.scale.f.deltaT(w12.o(), w12.q());
            }
            d5 += 6.3072E7d;
            fVar2 = fVar;
        }
        return d0.V0(net.time4j.base.c.m((long) d5, g(fVar2)), (int) ((d5 - Math.floor(d5)) * 1.0E9d), fVar2);
    }

    public String toString() {
        return ProtectedSandApp.s("诌\u0001") + this.scale.name() + ')' + this.value;
    }
}

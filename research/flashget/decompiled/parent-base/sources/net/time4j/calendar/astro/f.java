package net.time4j.calendar.astro;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import net.time4j.d0;
import net.time4j.l0;
import net.time4j.n0;

/* compiled from: LunarTime.java */
/* loaded from: classes7.dex */
public final class f implements d, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final int f82280b = 1000000000;
    private static final long serialVersionUID = -8029871830105935048L;
    private final int altitude;
    private final double latitude;
    private final double longitude;
    private final net.time4j.tz.k observerZoneID;

    /* compiled from: LunarTime.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private double f82281a;

        /* renamed from: b, reason: collision with root package name */
        private double f82282b;

        /* renamed from: c, reason: collision with root package name */
        private int f82283c;

        /* renamed from: d, reason: collision with root package name */
        private final net.time4j.tz.k f82284d;

        private static void c(int i4, int i5, double d5, int i6) {
            if (i4 < 0 || i4 > i6 || (i4 == i6 && i6 != 179 && (i5 > 0 || Double.compare(d5, p.f60679p) > 0))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("诐\u0001") + i4 + ProtectedSandApp.s("译\u0001") + ((d5 / 3600.0d) + (i5 / 60.0d) + i4) + ProtectedSandApp.s("诒\u0001"));
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诏\u0001"), i5));
            }
            if (Double.isNaN(d5) || Double.isInfinite(d5)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("诎\u0001"));
            }
            if (Double.compare(d5, p.f60679p) < 0 || Double.compare(d5, 60.0d) >= 0) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("词\u0001"), d5));
            }
        }

        public b a(int i4) {
            double d5 = i4;
            if (Double.isInfinite(d5) || Double.isNaN(d5)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诔\u0001"), i4));
            }
            if (i4 < 0 || i4 >= 11000) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诓\u0001"), i4));
            }
            this.f82283c = i4;
            return this;
        }

        public f b() {
            if (Double.isNaN(this.f82281a)) {
                throw new IllegalStateException(ProtectedSandApp.s("诖\u0001"));
            }
            if (Double.isNaN(this.f82282b)) {
                throw new IllegalStateException(ProtectedSandApp.s("试\u0001"));
            }
            return new f(this.f82281a, this.f82282b, this.f82283c, this.f82284d);
        }

        public b d(int i4, int i5, double d5) {
            c(i4, i5, d5, 179);
            if (!Double.isNaN(this.f82282b)) {
                throw new IllegalStateException(ProtectedSandApp.s("诗\u0001"));
            }
            this.f82282b = (d5 / 3600.0d) + (i5 / 60.0d) + i4;
            return this;
        }

        public b e(int i4, int i5, double d5) {
            c(i4, i5, d5, 90);
            if (!Double.isNaN(this.f82281a)) {
                throw new IllegalStateException(ProtectedSandApp.s("诘\u0001"));
            }
            this.f82281a = (d5 / 3600.0d) + (i5 / 60.0d) + i4;
            return this;
        }

        public b f(int i4, int i5, double d5) {
            c(i4, i5, d5, 90);
            if (!Double.isNaN(this.f82281a)) {
                throw new IllegalStateException(ProtectedSandApp.s("诘\u0001"));
            }
            this.f82281a = ((d5 / 3600.0d) + (i5 / 60.0d) + i4) * (-1.0d);
            return this;
        }

        public b g(int i4, int i5, double d5) {
            c(i4, i5, d5, 180);
            if (!Double.isNaN(this.f82282b)) {
                throw new IllegalStateException(ProtectedSandApp.s("诗\u0001"));
            }
            this.f82282b = ((d5 / 3600.0d) + (i5 / 60.0d) + i4) * (-1.0d);
            return this;
        }

        private b(net.time4j.tz.k kVar) {
            this.f82281a = Double.NaN;
            this.f82282b = Double.NaN;
            this.f82283c = 0;
            this.f82284d = kVar;
        }
    }

    /* compiled from: LunarTime.java */
    public static class c {

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f82285g = false;

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.tz.k f82286a;

        /* renamed from: b, reason: collision with root package name */
        private final d0 f82287b;

        /* renamed from: c, reason: collision with root package name */
        private final d0 f82288c;

        /* renamed from: d, reason: collision with root package name */
        private final d0 f82289d;

        /* renamed from: e, reason: collision with root package name */
        private final d0 f82290e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f82291f;

        public boolean a() {
            return d() == 0;
        }

        public boolean b(d0 d0Var) {
            if (d0Var.f(this.f82287b) || !d0Var.f(this.f82288c)) {
                return false;
            }
            d0 d0Var2 = this.f82289d;
            if (d0Var2 == null) {
                net.time4j.scale.g gVar = this.f82290e;
                return gVar == null ? this.f82291f : d0Var.f(gVar);
            }
            d0 d0Var3 = this.f82290e;
            return d0Var3 == null ? !d0Var.f(d0Var2) : d0Var2.f(d0Var3) ? !d0Var.f(this.f82289d) && d0Var.f(this.f82290e) : d0Var.f(this.f82290e) || !d0Var.f(this.f82289d);
        }

        public boolean c() {
            return this.f82291f && this.f82289d == null && this.f82290e == null;
        }

        public int d() {
            d0 d0Var = this.f82289d;
            if (d0Var == null) {
                d0 d0Var2 = this.f82290e;
                if (d0Var2 != null) {
                    return (int) this.f82287b.Y(d0Var2, TimeUnit.SECONDS);
                }
                if (this.f82291f) {
                    return (int) this.f82287b.Y(this.f82288c, TimeUnit.SECONDS);
                }
                return 0;
            }
            d0 d0Var3 = this.f82290e;
            if (d0Var3 == null) {
                return (int) d0Var.Y(this.f82288c, TimeUnit.SECONDS);
            }
            if (d0Var.f(d0Var3)) {
                return (int) this.f82289d.Y(this.f82290e, TimeUnit.SECONDS);
            }
            d0 d0Var4 = this.f82287b;
            d0 d0Var5 = this.f82290e;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return (int) (this.f82289d.Y(this.f82288c, timeUnit) + d0Var4.Y(d0Var5, timeUnit));
        }

        public d0 e() {
            return this.f82289d;
        }

        public n0 f(net.time4j.tz.k kVar) {
            d0 d0Var = this.f82289d;
            if (d0Var == null) {
                return null;
            }
            return d0Var.j1(kVar);
        }

        public n0 g() {
            d0 d0Var = this.f82289d;
            if (d0Var == null) {
                return null;
            }
            return d0Var.j1(this.f82286a);
        }

        public d0 h() {
            return this.f82290e;
        }

        public n0 i(net.time4j.tz.k kVar) {
            d0 d0Var = this.f82290e;
            if (d0Var == null) {
                return null;
            }
            return d0Var.j1(kVar);
        }

        public n0 j() {
            d0 d0Var = this.f82290e;
            if (d0Var == null) {
                return null;
            }
            return d0Var.j1(this.f82286a);
        }

        public String toString() {
            StringBuilder a5 = androidx.fragment.app.a.a(128, ProtectedSandApp.s("诙\u0001"));
            a5.append(this.f82286a.canonical());
            a5.append(ProtectedSandApp.s("诚\u0001"));
            d0 d0Var = this.f82289d;
            String s4 = ProtectedSandApp.s("诛\u0001");
            if (d0Var != null) {
                d0 d0Var2 = this.f82290e;
                String s5 = ProtectedSandApp.s("诟\u0001");
                if (d0Var2 == null) {
                    a5.append(s5);
                    a5.append(this.f82289d.j1(this.f82286a));
                } else if (d0Var.f(d0Var2)) {
                    a5.append(s5);
                    a5.append(this.f82289d.j1(this.f82286a));
                    a5.append(ProtectedSandApp.s("诠\u0001"));
                    a5.append(this.f82290e.j1(this.f82286a));
                } else {
                    a5.append(s4);
                    a5.append(this.f82290e.j1(this.f82286a));
                    a5.append(ProtectedSandApp.s("诡\u0001"));
                    a5.append(this.f82289d.j1(this.f82286a));
                }
            } else if (this.f82290e == null) {
                a5.append(ProtectedSandApp.s("诜\u0001"));
                a5.append(this.f82291f ? ProtectedSandApp.s("话\u0001") : ProtectedSandApp.s("诞\u0001"));
            } else {
                a5.append(s4);
                a5.append(this.f82290e.j1(this.f82286a));
            }
            a5.append(ProtectedSandApp.s("询\u0001"));
            a5.append(d());
            a5.append(']');
            return a5.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private c(l0 l0Var, net.time4j.tz.k kVar, d0 d0Var, d0 d0Var2, boolean z4) {
            this.f82286a = kVar;
            net.time4j.tz.l c02 = net.time4j.tz.l.c0(kVar);
            l0 l0Var2 = (l0) l0Var.W(1L, net.time4j.h.DAYS);
            if (c02.F() == null) {
                this.f82287b = l0Var.L0().n0(c02);
                this.f82288c = l0Var2.L0().n0(c02);
            } else {
                this.f82287b = l0Var.J0(kVar);
                this.f82288c = l0Var2.J0(kVar);
            }
            this.f82289d = d0Var;
            this.f82290e = d0Var2;
            this.f82291f = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d0 d(d0 d0Var, double d5) {
        double d6 = d5 * 3600.0d;
        long floor = (long) Math.floor(d6);
        long j4 = (long) ((d6 - floor) * 1.0E9d);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (d0) d0Var.W(floor, timeUnit).W(j4, TimeUnit.NANOSECONDS).M(d0.f82685w, timeUnit);
    }

    private static void e(double d5, double d6, int i4, net.time4j.tz.k kVar) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("诨\u0001"), d5));
        }
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("诧\u0001"), d6));
        }
        if (Double.compare(d5, 90.0d) > 0 || Double.compare(d5, -90.0d) < 0) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("详\u0001"), d5));
        }
        if (Double.compare(d6, 180.0d) >= 0 || Double.compare(d6, -180.0d) < 0) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("该\u0001"), d6));
        }
        double d7 = i4;
        if (Double.isNaN(d7) || Double.isInfinite(d7)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诤\u0001"), i4));
        }
        if (i4 < 0 || i4 >= 11000) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诣\u0001"), i4));
        }
        net.time4j.tz.l.c0(kVar);
    }

    private static double f(double d5) {
        return Math.toDegrees(Math.asin(6378.14d / d5));
    }

    private static int h(double d5, double d6, double d7, double[] dArr) {
        double d10;
        int i4;
        double d11 = ((d7 + d5) * 0.5d) - d6;
        double d12 = (d7 - d5) * 0.5d;
        double d13 = (-d12) / (2.0d * d11);
        double d14 = (((d11 * d13) + d12) * d13) + d6;
        double d15 = (d12 * d12) - ((4.0d * d11) * d6);
        double d16 = Double.NaN;
        if (d15 >= p.f60679p) {
            double sqrt = (Math.sqrt(d15) * 0.5d) / Math.abs(d11);
            double d17 = d13 - sqrt;
            if (Math.abs(d17) <= 1.0d) {
                i4 = 1;
            } else {
                d17 = Double.NaN;
                i4 = 0;
            }
            d10 = sqrt + d13;
            if (Math.abs(d10) <= 1.0d) {
                i4++;
            } else {
                d10 = Double.NaN;
            }
            d16 = d17;
        } else {
            d10 = Double.NaN;
            i4 = 0;
        }
        dArr[0] = d13;
        dArr[1] = d14;
        dArr[2] = d16;
        dArr[3] = d10;
        return i4;
    }

    public static b i(net.time4j.tz.k kVar) {
        if (kVar != null) {
            return new b(kVar);
        }
        throw new NullPointerException(ProtectedSandApp.s("诩\u0001"));
    }

    public static f j(net.time4j.tz.k kVar, double d5, double d6) {
        return new f(d5, d6, 0, kVar);
    }

    public static f k(net.time4j.tz.k kVar, double d5, double d6, int i4) {
        return new f(d5, d6, i4, kVar);
    }

    private static double m(double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14) {
        double d15 = (d6 / 24.0d) + d5;
        double[] e4 = h.e(n((d14 / 86400.0d) + d15));
        double cos = Math.cos(Math.toRadians(e4[1])) * e4[0];
        double radians = ((Math.toRadians(cos) + net.time4j.calendar.astro.a.b(d15)) + d7) - Math.toRadians(e4[2]);
        double radians2 = Math.toRadians(e4[3]);
        return ((Math.cos(radians) * (Math.cos(radians2) * d10)) + (Math.sin(radians2) * d11)) - Math.sin(Math.toRadians(((f(e4[4]) * 0.7275d) - d13) - d12));
    }

    private static double n(double d5) {
        return (d5 - 51544.5d) / 36525.0d;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e(this.latitude, this.longitude, this.altitude, this.observerZoneID);
    }

    @Override // net.time4j.calendar.astro.d
    public int a() {
        return this.altitude;
    }

    @Override // net.time4j.calendar.astro.d
    public double b() {
        return this.latitude;
    }

    @Override // net.time4j.calendar.astro.d
    public double c() {
        return this.longitude;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.altitude == fVar.altitude && Double.compare(this.latitude, fVar.latitude) == 0 && Double.compare(this.longitude, fVar.longitude) == 0 && this.observerZoneID.canonical().equals(fVar.observerZoneID.canonical());
    }

    public net.time4j.tz.k g() {
        return this.observerZoneID;
    }

    public int hashCode() {
        return (this.altitude * 37) + (net.time4j.calendar.astro.a.c(this.longitude) * 31) + (net.time4j.calendar.astro.a.c(this.latitude) * 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r4.j1(r53.observerZoneID).k0().equals(r2) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public net.time4j.calendar.astro.f.c l(net.time4j.engine.h r54) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.astro.f.l(net.time4j.engine.h):net.time4j.calendar.astro.f$c");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("诪\u0001"));
        sb.append(this.observerZoneID.canonical());
        sb.append(ProtectedSandApp.s("诫\u0001"));
        sb.append(this.latitude);
        sb.append(ProtectedSandApp.s("诬\u0001"));
        sb.append(this.longitude);
        if (this.altitude != 0) {
            sb.append(ProtectedSandApp.s("语\u0001"));
            sb.append(this.altitude);
        }
        sb.append(']');
        return sb.toString();
    }

    private f(double d5, double d6, int i4, net.time4j.tz.k kVar) {
        e(d5, d6, i4, kVar);
        this.latitude = d5;
        this.longitude = d6;
        this.altitude = i4;
        this.observerZoneID = kVar;
    }
}

package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.n0;

/* compiled from: MachineTime.java */
/* loaded from: classes7.dex */
public final class b0<U> implements net.time4j.engine.n0<U>, Comparable<b0<U>>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f81870e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    private static final b0<TimeUnit> f81871f;

    /* renamed from: g, reason: collision with root package name */
    private static final b0<u0> f81872g;

    /* renamed from: h, reason: collision with root package name */
    public static final net.time4j.engine.l0<TimeUnit, b0<TimeUnit>> f81873h;

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.l0<TimeUnit, b0<u0>> f81874i;
    private static final long serialVersionUID = -4150291820807606229L;

    /* renamed from: b, reason: collision with root package name */
    private final transient long f81875b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f81876c;

    /* renamed from: d, reason: collision with root package name */
    private final transient net.time4j.scale.f f81877d;

    /* compiled from: MachineTime.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81878a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f81879b;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f81879b = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81879b[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81879b[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81879b[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u0.values().length];
            f81878a = iArr2;
            try {
                iArr2[u0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81878a[u0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: MachineTime.java */
    public static final class b extends net.time4j.format.y<TimeUnit, b0<TimeUnit>> {
        private b(String str) {
            super(TimeUnit.class, str);
        }

        public static b t(String str) {
            return new b(str);
        }

        @Override // net.time4j.format.y
        public void p(net.time4j.engine.n0<? super TimeUnit> n0Var, Appendable appendable) throws IOException {
            String i4 = i();
            int length = i4.length();
            StringBuilder sb = new StringBuilder(length);
            int i5 = 0;
            while (i5 < length) {
                char charAt = i4.charAt(i5);
                if (charAt == '\'') {
                    while (true) {
                        i5++;
                        if (i5 >= length) {
                            break;
                        }
                        if (i4.charAt(i5) == '\'') {
                            int i6 = i5 + 1;
                            if (i6 < length && i4.charAt(i6) == '\'') {
                                i5 = i6;
                            }
                        }
                    }
                } else {
                    sb.append(charAt);
                }
                i5++;
            }
            String sb2 = sb.toString();
            EnumSet noneOf = EnumSet.noneOf(TimeUnit.class);
            if (sb2.contains(ProtectedSandApp.s("觭\u0001"))) {
                noneOf.add(TimeUnit.DAYS);
            }
            if (sb2.contains(ProtectedSandApp.s("觮\u0001"))) {
                noneOf.add(TimeUnit.HOURS);
            }
            if (sb2.contains(ProtectedSandApp.s("觯\u0001"))) {
                noneOf.add(TimeUnit.MINUTES);
            }
            if (sb2.contains(ProtectedSandApp.s("觰\u0001"))) {
                noneOf.add(TimeUnit.SECONDS);
            }
            if (sb2.contains(ProtectedSandApp.s("觱\u0001"))) {
                noneOf.add(TimeUnit.NANOSECONDS);
            }
            super.p(new d(n0Var, noneOf), appendable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.format.y
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b0<TimeUnit> f(Map<TimeUnit, Long> map, boolean z4) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            int g4 = map.containsKey(timeUnit) ? net.time4j.base.c.g(map.get(timeUnit).longValue()) : 0;
            long j4 = 0;
            for (Map.Entry<TimeUnit, Long> entry : map.entrySet()) {
                int i4 = a.f81879b[entry.getKey().ordinal()];
                int i5 = 1;
                if (i4 == 1) {
                    i5 = MMKV.ExpireInDay;
                } else if (i4 == 2) {
                    i5 = MMKV.ExpireInHour;
                } else if (i4 == 3) {
                    i5 = 60;
                } else if (i4 != 4) {
                }
                j4 += net.time4j.base.c.i(entry.getValue().longValue(), i5);
            }
            if (z4) {
                j4 = net.time4j.base.c.k(j4);
                g4 = -g4;
            }
            return b0.A(j4, g4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.format.y
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public TimeUnit k(char c5) {
            if (c5 == 'D') {
                return TimeUnit.DAYS;
            }
            if (c5 == 'f') {
                return TimeUnit.NANOSECONDS;
            }
            if (c5 == 'h') {
                return TimeUnit.HOURS;
            }
            if (c5 == 'm') {
                return TimeUnit.MINUTES;
            }
            if (c5 == 's') {
                return TimeUnit.SECONDS;
            }
            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("觲\u0001"), c5));
        }
    }

    /* compiled from: MachineTime.java */
    private static class c<U> implements net.time4j.engine.l0<TimeUnit, b0<U>> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.scale.f f81880b;

        /* synthetic */ c(net.time4j.scale.f fVar, a aVar) {
            this(fVar);
        }

        @Override // net.time4j.engine.l0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public <T extends net.time4j.engine.m0<? super TimeUnit, T>> b0<U> a(T t4, T t5) {
            long j4;
            int a5;
            int a6;
            net.time4j.scale.f fVar = this.f81880b;
            net.time4j.scale.f fVar2 = net.time4j.scale.f.UTC;
            if (fVar == fVar2 && (t4 instanceof net.time4j.scale.g)) {
                net.time4j.scale.g gVar = (net.time4j.scale.g) t4;
                net.time4j.scale.g gVar2 = (net.time4j.scale.g) t5;
                long c5 = gVar2.c(fVar2);
                long c6 = gVar.c(fVar2);
                if (c5 < 0 || c6 < 0) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("觳\u0001"));
                }
                j4 = c5 - c6;
                a5 = gVar2.p(fVar2);
                a6 = gVar.p(fVar2);
            } else {
                if (!(t4 instanceof net.time4j.base.f)) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("觴\u0001"));
                }
                net.time4j.base.f fVar3 = (net.time4j.base.f) t4;
                net.time4j.base.f fVar4 = (net.time4j.base.f) t5;
                j4 = fVar4.j() - fVar3.j();
                a5 = fVar4.a();
                a6 = fVar3.a();
            }
            return new b0<>(j4, a5 - a6, this.f81880b, null);
        }

        @Override // net.time4j.engine.l0
        public net.time4j.engine.l0<TimeUnit, b0<U>> d() {
            return this;
        }

        private c(net.time4j.scale.f fVar) {
            this.f81880b = fVar;
        }
    }

    /* compiled from: MachineTime.java */
    private static class d implements net.time4j.engine.n0<TimeUnit> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.n0<? super TimeUnit> f81881b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<TimeUnit> f81882c;

        d(net.time4j.engine.n0<? super TimeUnit> n0Var, Set<TimeUnit> set) {
            n0Var.getClass();
            this.f81881b = n0Var;
            this.f81882c = set;
        }

        @Override // net.time4j.engine.n0
        public <T extends net.time4j.engine.m0<? super TimeUnit, T>> T a(T t4) {
            throw new AssertionError(ProtectedSandApp.s("觵\u0001"));
        }

        @Override // net.time4j.engine.n0
        public <T extends net.time4j.engine.m0<? super TimeUnit, T>> T b(T t4) {
            throw new AssertionError(ProtectedSandApp.s("觵\u0001"));
        }

        @Override // net.time4j.engine.n0
        public boolean c() {
            return this.f81881b.c();
        }

        @Override // net.time4j.engine.n0
        public boolean d() {
            return this.f81881b.d();
        }

        @Override // net.time4j.engine.n0
        public List<n0.a<TimeUnit>> f() {
            throw new AssertionError(ProtectedSandApp.s("觵\u0001"));
        }

        @Override // net.time4j.engine.n0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean contains(TimeUnit timeUnit) {
            return true;
        }

        @Override // net.time4j.engine.n0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public long e(TimeUnit timeUnit) {
            long j4;
            long j5;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit == timeUnit2) {
                return this.f81881b.e(timeUnit2);
            }
            long e4 = this.f81881b.e(TimeUnit.SECONDS);
            long j6 = 0;
            if (this.f81882c.contains(TimeUnit.DAYS)) {
                j4 = e4 / 86400;
                e4 -= 86400 * j4;
            } else {
                j4 = 0;
            }
            if (this.f81882c.contains(TimeUnit.HOURS)) {
                j5 = e4 / 3600;
                e4 -= 3600 * j5;
            } else {
                j5 = 0;
            }
            if (this.f81882c.contains(TimeUnit.MINUTES)) {
                long j7 = e4 / 60;
                e4 -= 60 * j7;
                j6 = j7;
            }
            int i4 = a.f81879b[timeUnit.ordinal()];
            if (i4 == 1) {
                return j4;
            }
            if (i4 == 2) {
                return j5;
            }
            if (i4 == 3) {
                return j6;
            }
            if (i4 == 4) {
                return e4;
            }
            throw new AssertionError(ProtectedSandApp.s("觵\u0001"));
        }

        @Override // net.time4j.engine.n0
        public boolean isEmpty() {
            return this.f81881b.isEmpty();
        }
    }

    static {
        net.time4j.scale.f fVar = net.time4j.scale.f.POSIX;
        f81871f = new b0<>(0L, 0, fVar);
        net.time4j.scale.f fVar2 = net.time4j.scale.f.UTC;
        f81872g = new b0<>(0L, 0, fVar2);
        a aVar = null;
        f81873h = new c(fVar, aVar);
        f81874i = new c(fVar2, aVar);
    }

    /* synthetic */ b0(long j4, int i4, net.time4j.scale.f fVar, a aVar) {
        this(j4, i4, fVar);
    }

    public static b0<TimeUnit> A(long j4, int i4) {
        return (j4 == 0 && i4 == 0) ? f81871f : new b0<>(j4, i4, net.time4j.scale.f.POSIX);
    }

    public static b0<u0> B(double d5) {
        if (Double.isInfinite(d5) || Double.isNaN(d5)) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("觶\u0001"), d5));
        }
        long floor = (long) Math.floor(d5);
        return E(floor, (int) ((d5 - floor) * 1.0E9d));
    }

    public static b0<u0> C(BigDecimal bigDecimal) {
        BigDecimal scale = bigDecimal.setScale(0, RoundingMode.FLOOR);
        return E(scale.longValueExact(), bigDecimal.subtract(scale).multiply(BigDecimal.valueOf(1000000000L)).setScale(0, RoundingMode.DOWN).intValueExact());
    }

    public static b0<u0> E(long j4, int i4) {
        return (j4 == 0 && i4 == 0) ? f81872g : new b0<>(j4, i4, net.time4j.scale.f.UTC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T h(Object obj) {
        return obj;
    }

    private void j(StringBuilder sb) {
        if (d()) {
            sb.append('-');
            sb.append(Math.abs(this.f81875b));
        } else {
            sb.append(this.f81875b);
        }
        if (this.f81876c != 0) {
            sb.append('.');
            String valueOf = String.valueOf(Math.abs(this.f81876c));
            for (int length = 9 - valueOf.length(); length > 0; length--) {
                sb.append('0');
            }
            sb.append(valueOf);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("觷\u0001"));
    }

    private static long v(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        throw new ArithmeticException(ProtectedSandApp.s("觸\u0001"));
    }

    public static b0<TimeUnit> w(long j4, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        if (timeUnit.compareTo(timeUnit2) >= 0) {
            return A(net.time4j.base.c.i(j4, timeUnit2.convert(1L, timeUnit)), 0);
        }
        long i4 = net.time4j.base.c.i(j4, TimeUnit.NANOSECONDS.convert(1L, timeUnit));
        return A(net.time4j.base.c.b(i4, 1000000000), net.time4j.base.c.d(i4, 1000000000));
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    public static b0<u0> x(long j4, u0 u0Var) {
        int i4 = a.f81878a[u0Var.ordinal()];
        if (i4 == 1) {
            return E(j4, 0);
        }
        if (i4 == 2) {
            return E(net.time4j.base.c.b(j4, 1000000000), net.time4j.base.c.d(j4, 1000000000));
        }
        throw new UnsupportedOperationException(u0Var.name());
    }

    public static b0<TimeUnit> y(double d5) {
        if (Double.isInfinite(d5) || Double.isNaN(d5)) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("觶\u0001"), d5));
        }
        long floor = (long) Math.floor(d5);
        return A(floor, (int) ((d5 - floor) * 1.0E9d));
    }

    public static b0<TimeUnit> z(BigDecimal bigDecimal) {
        BigDecimal scale = bigDecimal.setScale(0, RoundingMode.FLOOR);
        return A(scale.longValueExact(), bigDecimal.subtract(scale).multiply(BigDecimal.valueOf(1000000000L)).setScale(0, RoundingMode.DOWN).intValueExact());
    }

    public b0<U> G(long j4, U u4) {
        long f4;
        long f5;
        long j5 = this.f81875b;
        int i4 = this.f81876c;
        if (this.f81877d == net.time4j.scale.f.POSIX) {
            TimeUnit timeUnit = (TimeUnit) TimeUnit.class.cast(u4);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (timeUnit.compareTo(timeUnit2) >= 0) {
                f4 = net.time4j.base.c.f(j5, net.time4j.base.c.i(j4, timeUnit2.convert(1L, timeUnit)));
            } else {
                long f6 = net.time4j.base.c.f(i4, net.time4j.base.c.i(j4, TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
                f5 = net.time4j.base.c.f(j5, net.time4j.base.c.b(f6, 1000000000));
                i4 = net.time4j.base.c.d(f6, 1000000000);
                f4 = f5;
            }
        } else {
            int i5 = a.f81878a[((u0) u0.class.cast(u4)).ordinal()];
            if (i5 == 1) {
                f4 = net.time4j.base.c.f(j5, j4);
            } else {
                if (i5 != 2) {
                    throw new UnsupportedOperationException(u4.toString());
                }
                long f7 = net.time4j.base.c.f(i4, j4);
                f5 = net.time4j.base.c.f(j5, net.time4j.base.c.b(f7, 1000000000));
                i4 = net.time4j.base.c.d(f7, 1000000000);
                f4 = f5;
            }
        }
        return new b0<>(f4, i4, this.f81877d);
    }

    public b0<U> J(b0<U> b0Var) {
        return b0Var.isEmpty() ? this : isEmpty() ? b0Var : new b0<>(net.time4j.base.c.f(this.f81875b, b0Var.f81875b), this.f81876c + b0Var.f81876c, this.f81877d);
    }

    public BigDecimal K() {
        StringBuilder sb = new StringBuilder();
        j(sb);
        return new BigDecimal(sb.toString());
    }

    @Override // net.time4j.engine.n0
    public <T extends net.time4j.engine.m0<? super U, T>> T a(T t4) {
        Enum r02;
        Enum r12;
        if (this.f81877d == net.time4j.scale.f.POSIX) {
            r02 = TimeUnit.SECONDS;
            r12 = TimeUnit.NANOSECONDS;
        } else {
            r02 = u0.SECONDS;
            r12 = u0.NANOSECONDS;
        }
        return (T) t4.U(this.f81875b, r02).U(this.f81876c, r12);
    }

    @Override // net.time4j.engine.n0
    public <T extends net.time4j.engine.m0<? super U, T>> T b(T t4) {
        Enum r02;
        Enum r12;
        if (this.f81877d == net.time4j.scale.f.POSIX) {
            r02 = TimeUnit.SECONDS;
            r12 = TimeUnit.NANOSECONDS;
        } else {
            r02 = u0.SECONDS;
            r12 = u0.NANOSECONDS;
        }
        return (T) t4.W(this.f81875b, r02).W(this.f81876c, r12);
    }

    @Override // net.time4j.engine.n0
    public boolean c() {
        return this.f81875b > 0 || this.f81876c > 0;
    }

    @Override // net.time4j.engine.n0
    public boolean contains(Object obj) {
        net.time4j.scale.f fVar = this.f81877d;
        net.time4j.scale.f fVar2 = net.time4j.scale.f.POSIX;
        if (fVar != fVar2 || !TimeUnit.SECONDS.equals(obj)) {
            net.time4j.scale.f fVar3 = this.f81877d;
            net.time4j.scale.f fVar4 = net.time4j.scale.f.UTC;
            if (fVar3 != fVar4 || !u0.SECONDS.equals(obj)) {
                return ((this.f81877d == fVar2 && TimeUnit.NANOSECONDS.equals(obj)) || (this.f81877d == fVar4 && u0.NANOSECONDS.equals(obj))) && this.f81876c != 0;
            }
        }
        return this.f81875b != 0;
    }

    @Override // net.time4j.engine.n0
    public boolean d() {
        return this.f81875b < 0 || this.f81876c < 0;
    }

    @Override // net.time4j.engine.n0
    public long e(Object obj) {
        net.time4j.scale.f fVar = this.f81877d;
        net.time4j.scale.f fVar2 = net.time4j.scale.f.POSIX;
        if (fVar != fVar2 || !TimeUnit.SECONDS.equals(obj)) {
            net.time4j.scale.f fVar3 = this.f81877d;
            net.time4j.scale.f fVar4 = net.time4j.scale.f.UTC;
            if (fVar3 != fVar4 || !u0.SECONDS.equals(obj)) {
                if ((this.f81877d == fVar2 && TimeUnit.NANOSECONDS.equals(obj)) || (this.f81877d == fVar4 && u0.NANOSECONDS.equals(obj))) {
                    return Math.abs(this.f81876c);
                }
                return 0L;
            }
        }
        return Math.abs(this.f81875b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f81875b == b0Var.f81875b && this.f81876c == b0Var.f81876c && this.f81877d == b0Var.f81877d;
    }

    @Override // net.time4j.engine.n0
    public List<n0.a<U>> f() {
        ArrayList arrayList = new ArrayList(2);
        long j4 = this.f81875b;
        if (j4 != 0) {
            arrayList.add(n0.a.c(Math.abs(j4), this.f81877d == net.time4j.scale.f.UTC ? u0.SECONDS : TimeUnit.SECONDS));
        }
        if (this.f81876c != 0) {
            arrayList.add(n0.a.c(Math.abs(r1), this.f81877d == net.time4j.scale.f.UTC ? u0.NANOSECONDS : TimeUnit.NANOSECONDS));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public b0<U> g() {
        return d() ? new b0<>(v(this.f81875b), -this.f81876c, this.f81877d) : this;
    }

    public int hashCode() {
        long j4 = this.f81875b;
        return this.f81877d.hashCode() + ((((161 + ((int) (j4 ^ (j4 >>> 32)))) * 23) + this.f81876c) * 23);
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(b0<U> b0Var) {
        if (this.f81877d != b0Var.f81877d) {
            throw new ClassCastException(ProtectedSandApp.s("觹\u0001"));
        }
        long j4 = this.f81875b;
        long j5 = b0Var.f81875b;
        if (j4 < j5) {
            return -1;
        }
        if (j4 > j5) {
            return 1;
        }
        return this.f81876c - b0Var.f81876c;
    }

    @Override // net.time4j.engine.n0
    public boolean isEmpty() {
        return this.f81875b == 0 && this.f81876c == 0;
    }

    public b0<U> k(long j4, RoundingMode roundingMode) {
        if (j4 == 1) {
            return this;
        }
        BigDecimal divide = K().setScale(9, RoundingMode.FLOOR).divide(new BigDecimal(j4), roundingMode);
        return this.f81877d == net.time4j.scale.f.POSIX ? (b0<U>) z(divide) : (b0<U>) C(divide);
    }

    public int l() {
        int i4 = this.f81876c;
        return i4 < 0 ? i4 + 1000000000 : i4;
    }

    public net.time4j.scale.f m() {
        return this.f81877d;
    }

    public long n() {
        long j4 = this.f81875b;
        return this.f81876c < 0 ? j4 - 1 : j4;
    }

    public b0<U> o() {
        return isEmpty() ? this : new b0<>(v(this.f81875b), -this.f81876c, this.f81877d);
    }

    public boolean p(b0<U> b0Var) {
        return g().compareTo(b0Var.g()) > 0;
    }

    public boolean q(b0<U> b0Var) {
        return g().compareTo(b0Var.g()) < 0;
    }

    public b0<U> r(long j4, U u4) {
        return G(v(j4), u4);
    }

    public b0<U> s(b0<U> b0Var) {
        return b0Var.isEmpty() ? this : isEmpty() ? b0Var.o() : new b0<>(net.time4j.base.c.m(this.f81875b, b0Var.f81875b), this.f81876c - b0Var.f81876c, this.f81877d);
    }

    public b0<U> t(double d5) {
        if (d5 == 1.0d) {
            return this;
        }
        if (d5 == com.google.firebase.remoteconfig.p.f60679p) {
            return this.f81877d == net.time4j.scale.f.POSIX ? (b0<U>) f81871f : (b0<U>) f81872g;
        }
        if (Double.isInfinite(d5) || Double.isNaN(d5)) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("觺\u0001"), d5));
        }
        double doubleValue = K().doubleValue() * d5;
        return this.f81877d == net.time4j.scale.f.POSIX ? (b0<U>) y(doubleValue) : (b0<U>) B(doubleValue);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        j(sb);
        sb.append(ProtectedSandApp.s("觻\u0001"));
        sb.append(this.f81877d.name());
        sb.append(']');
        return sb.toString();
    }

    public b0<U> u(long j4) {
        if (j4 == 1) {
            return this;
        }
        if (j4 == 0) {
            return this.f81877d == net.time4j.scale.f.POSIX ? (b0<U>) f81871f : (b0<U>) f81872g;
        }
        BigDecimal multiply = K().multiply(BigDecimal.valueOf(j4));
        return this.f81877d == net.time4j.scale.f.POSIX ? (b0<U>) z(multiply) : (b0<U>) C(multiply);
    }

    private b0(long j4, int i4, net.time4j.scale.f fVar) {
        while (i4 < 0) {
            i4 += 1000000000;
            j4 = net.time4j.base.c.m(j4, 1L);
        }
        while (i4 >= 1000000000) {
            i4 -= 1000000000;
            j4 = net.time4j.base.c.f(j4, 1L);
        }
        if (j4 < 0 && i4 > 0) {
            j4++;
            i4 -= 1000000000;
        }
        this.f81875b = j4;
        this.f81876c = i4;
        this.f81877d = fVar;
    }
}

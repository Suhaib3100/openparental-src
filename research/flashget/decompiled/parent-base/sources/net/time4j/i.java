package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import net.time4j.engine.n0;

/* compiled from: ClockNormalizer.java */
/* loaded from: classes7.dex */
final class i implements net.time4j.engine.f0<j> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f83233d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f83234e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f83235f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<j, i> f83236g = a(0);

    /* renamed from: h, reason: collision with root package name */
    private static final Map<j, i> f83237h = a(1);

    /* renamed from: i, reason: collision with root package name */
    private static final Map<j, i> f83238i = a(2);

    /* renamed from: b, reason: collision with root package name */
    private final j f83239b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83240c;

    /* compiled from: ClockNormalizer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83241a;

        static {
            int[] iArr = new int[j.values().length];
            f83241a = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83241a[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83241a[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83241a[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83241a[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private i(j jVar, int i4) {
        this.f83239b = jVar;
        this.f83240c = i4;
    }

    private static Map<j, i> a(int i4) {
        EnumMap enumMap = new EnumMap(j.class);
        for (j jVar : j.values()) {
            enumMap.put((EnumMap) jVar, (j) new i(jVar, i4));
        }
        return Collections.unmodifiableMap(enumMap);
    }

    static i c(j jVar) {
        i iVar = f83236g.get(jVar);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException(jVar.name());
    }

    static i e(j jVar) {
        i iVar = f83238i.get(jVar);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException(jVar.name());
    }

    static i f(j jVar) {
        i iVar = f83237h.get(jVar);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException(jVar.name());
    }

    @Override // net.time4j.engine.f0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p<j> d(net.time4j.engine.n0<? extends j> n0Var) {
        long j4;
        int i4 = this.f83240c;
        if (i4 == 0) {
            return p.Y(this.f83239b.convert(n0Var), this.f83239b);
        }
        if (i4 == 1) {
            ArrayList arrayList = new ArrayList();
            for (n0.a<? extends j> aVar : n0Var.f()) {
                j b5 = aVar.b();
                if (b5.compareTo(this.f83239b) <= 0) {
                    arrayList.add(n0.a.c(aVar.a(), b5));
                }
            }
            return arrayList.isEmpty() ? p.f0() : new p<>(arrayList, n0Var.d());
        }
        if (i4 != 2) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("靻\u0001") + this.f83240c);
        }
        boolean d5 = n0Var.d();
        p s02 = p.f0().s0(n0Var);
        if (d5) {
            s02 = s02.l();
        }
        p<j> E0 = s02.E0(p.f83438r);
        int i5 = a.f83241a[this.f83239b.ordinal()];
        if (i5 == 1 || i5 == 2) {
            j4 = 30;
        } else {
            if (i5 != 3 && i5 != 4 && i5 != 5) {
                return E0;
            }
            j4 = 500;
        }
        j jVar = j.values()[this.f83239b.ordinal() + 1];
        E0.getClass();
        if (E0.e(jVar) >= j4) {
            E0 = E0.r0(1L, this.f83239b).E0(p.f83438r);
        }
        p<j> E02 = E0.E0(this.f83239b.truncated());
        return d5 ? E02.X(-1) : E02;
    }
}

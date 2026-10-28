package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: NumberProcessor.java */
/* loaded from: classes7.dex */
class u<V> implements i<V> {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f83035p = {9, 99, 999, org.threeten.bp.chrono.m.f87989n, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f83036q = false;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<V> f83037b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f83038c;

    /* renamed from: d, reason: collision with root package name */
    private final int f83039d;

    /* renamed from: e, reason: collision with root package name */
    private final int f83040e;

    /* renamed from: f, reason: collision with root package name */
    private final b0 f83041f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f83042g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f83043h;

    /* renamed from: i, reason: collision with root package name */
    private final net.time4j.format.g f83044i;

    /* renamed from: j, reason: collision with root package name */
    private final int f83045j;

    /* renamed from: k, reason: collision with root package name */
    private final char f83046k;

    /* renamed from: l, reason: collision with root package name */
    private final net.time4j.format.j f83047l;

    /* renamed from: m, reason: collision with root package name */
    private final int f83048m;

    /* renamed from: n, reason: collision with root package name */
    private final int f83049n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f83050o;

    /* compiled from: NumberProcessor.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83051a;

        static {
            int[] iArr = new int[b0.values().length];
            f83051a = iArr;
            try {
                iArr[b0.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83051a[b0.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    u(net.time4j.engine.q<V> qVar, boolean z4, int i4, int i5, b0 b0Var, boolean z5) {
        this(qVar, z4, i4, i5, b0Var, z5, 0, '0', net.time4j.format.j.ARABIC, net.time4j.format.g.SMART, 0, false);
    }

    private static void a(int i4, Appendable appendable, char c5) throws IOException {
        int i5 = (i4 * 103) >>> 10;
        appendable.append((char) (i5 + c5));
        appendable.append((char) ((i4 - ((i5 << 3) + (i5 << 1))) + c5));
    }

    private int b(net.time4j.format.j jVar) {
        if (!jVar.isDecimal()) {
            return 100;
        }
        Class<V> type = this.f83037b.getType();
        if (type == Integer.class) {
            return 10;
        }
        return type == Long.class ? 18 : 9;
    }

    private static int c(int i4) {
        int i5 = 0;
        while (i4 > f83035p[i5]) {
            i5++;
        }
        return i5 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f83037b.equals(uVar.f83037b) && this.f83038c == uVar.f83038c && this.f83039d == uVar.f83039d && this.f83040e == uVar.f83040e && this.f83041f == uVar.f83041f && this.f83042g == uVar.f83042g;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<V> getElement() {
        return this.f83037b;
    }

    public int hashCode() {
        return (((this.f83040e * 10) + this.f83039d) * 31) + (this.f83037b.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0391  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r25, net.time4j.format.expert.w r26, net.time4j.engine.d r27, net.time4j.format.expert.x<?> r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.u.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0295  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int print(net.time4j.engine.p r23, java.lang.Appendable r24, net.time4j.engine.d r25, java.util.Set<net.time4j.format.expert.h> r26, boolean r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.u.print(net.time4j.engine.p, java.lang.Appendable, net.time4j.engine.d, java.util.Set, boolean):int");
    }

    @Override // net.time4j.format.expert.i
    public i<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        char c5;
        char charAt;
        net.time4j.engine.c<net.time4j.format.j> cVar2 = net.time4j.format.a.f82790l;
        net.time4j.format.j jVar = net.time4j.format.j.ARABIC;
        net.time4j.format.j jVar2 = (net.time4j.format.j) dVar.b(cVar2, jVar);
        net.time4j.engine.c<Character> cVar3 = net.time4j.format.a.f82791m;
        if (dVar.c(cVar3)) {
            charAt = ((Character) dVar.a(cVar3)).charValue();
        } else {
            if (!jVar2.isDecimal()) {
                c5 = '0';
                int intValue = ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
                return new u(this.f83037b, this.f83038c, this.f83039d, this.f83040e, this.f83041f, this.f83042g, i4, c5, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), intValue, jVar2 != jVar && c5 == '0' && this.f83038c && intValue == 0 && this.f83037b.getType() == Integer.class && !this.f83043h);
            }
            charAt = jVar2.getDigits().charAt(0);
        }
        c5 = charAt;
        int intValue2 = ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
        return new u(this.f83037b, this.f83038c, this.f83039d, this.f83040e, this.f83041f, this.f83042g, i4, c5, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), intValue2, jVar2 != jVar && c5 == '0' && this.f83038c && intValue2 == 0 && this.f83037b.getType() == Integer.class && !this.f83043h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append(ProtectedSandApp.s("镌\u0001"));
        sb.append(this.f83037b.name());
        sb.append(ProtectedSandApp.s("镍\u0001"));
        sb.append(this.f83038c);
        sb.append(ProtectedSandApp.s("镎\u0001"));
        sb.append(this.f83039d);
        sb.append(ProtectedSandApp.s("镏\u0001"));
        sb.append(this.f83040e);
        sb.append(ProtectedSandApp.s("镐\u0001"));
        sb.append(this.f83041f);
        sb.append(ProtectedSandApp.s("镑\u0001"));
        return androidx.compose.animation.l.a(sb, this.f83042g, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<V> withElement(net.time4j.engine.q<V> qVar) {
        return (this.f83042g || this.f83037b == qVar) ? this : new u(qVar, this.f83038c, this.f83039d, this.f83040e, this.f83041f, false);
    }

    private u(net.time4j.engine.q<V> qVar, boolean z4, int i4, int i5, b0 b0Var, boolean z5, int i6, char c5, net.time4j.format.j jVar, net.time4j.format.g gVar, int i7, boolean z6) {
        this.f83037b = qVar;
        this.f83038c = z4;
        this.f83039d = i4;
        this.f83040e = i5;
        this.f83041f = b0Var;
        this.f83042g = z5;
        this.f83050o = z6;
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("锴\u0001"));
        }
        if (b0Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("锳\u0001"));
        }
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("锲\u0001"), i4));
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("锰\u0001"), i5, ProtectedSandApp.s("锱\u0001"), i4));
        }
        if (z4 && i4 != i5) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("锪\u0001"), i5, ProtectedSandApp.s("锫\u0001"), i4));
        }
        if (z4 && b0Var != b0.SHOW_NEVER) {
            throw new IllegalArgumentException(ProtectedSandApp.s("锬\u0001"));
        }
        int b5 = b(jVar);
        if (jVar.isDecimal()) {
            if (i4 > b5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("键\u0001"), i4));
            }
            if (i5 > b5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("锭\u0001"), i5));
            }
        }
        this.f83043h = qVar.name().equals(ProtectedSandApp.s("锯\u0001"));
        this.f83045j = i6;
        this.f83046k = c5;
        this.f83047l = jVar;
        this.f83044i = gVar;
        this.f83048m = i7;
        this.f83049n = b5;
    }
}

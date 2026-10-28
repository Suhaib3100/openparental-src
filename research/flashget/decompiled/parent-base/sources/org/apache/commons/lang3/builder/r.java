package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.k1;
import org.apache.commons.lang3.p0;

/* compiled from: ToStringBuilder.java */
/* loaded from: classes6.dex */
public class r implements a<String> {

    /* renamed from: e, reason: collision with root package name */
    private static volatile t f85775e = t.f85780w;

    /* renamed from: b, reason: collision with root package name */
    private final StringBuffer f85776b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f85777c;

    /* renamed from: d, reason: collision with root package name */
    private final t f85778d;

    public r(Object obj) {
        this(obj, null, null);
    }

    public static t Z() {
        return f85775e;
    }

    public static String d0(Object obj) {
        return p.D0(obj, null, false, false, null);
    }

    public static String e0(Object obj, t tVar) {
        return p.D0(obj, tVar, false, false, null);
    }

    public static String f0(Object obj, t tVar, boolean z4) {
        return p.D0(obj, tVar, z4, false, null);
    }

    public static <T> String g0(T t4, t tVar, boolean z4, Class<? super T> cls) {
        return p.D0(t4, tVar, z4, false, cls);
    }

    public static void h0(t tVar) {
        f85775e = (t) k1.b0(tVar, "The style must not be null", new Object[0]);
    }

    public r A(String str, int[] iArr) {
        this.f85778d.n(this.f85776b, str, iArr, null);
        return this;
    }

    public r B(String str, int[] iArr, boolean z4) {
        this.f85778d.n(this.f85776b, str, iArr, Boolean.valueOf(z4));
        return this;
    }

    public r C(String str, long[] jArr) {
        this.f85778d.o(this.f85776b, str, jArr, null);
        return this;
    }

    public r D(String str, long[] jArr, boolean z4) {
        this.f85778d.o(this.f85776b, str, jArr, Boolean.valueOf(z4));
        return this;
    }

    public r E(String str, Object[] objArr) {
        this.f85778d.p(this.f85776b, str, objArr, null);
        return this;
    }

    public r F(String str, Object[] objArr, boolean z4) {
        this.f85778d.p(this.f85776b, str, objArr, Boolean.valueOf(z4));
        return this;
    }

    public r G(String str, short[] sArr) {
        this.f85778d.q(this.f85776b, str, sArr, null);
        return this;
    }

    public r H(String str, short[] sArr, boolean z4) {
        this.f85778d.q(this.f85776b, str, sArr, Boolean.valueOf(z4));
        return this;
    }

    public r I(String str, boolean[] zArr) {
        this.f85778d.r(this.f85776b, str, zArr, null);
        return this;
    }

    public r J(String str, boolean[] zArr, boolean z4) {
        this.f85778d.r(this.f85776b, str, zArr, Boolean.valueOf(z4));
        return this;
    }

    public r K(short s4) {
        this.f85778d.h(this.f85776b, null, s4);
        return this;
    }

    public r L(boolean z4) {
        this.f85778d.i(this.f85776b, null, z4);
        return this;
    }

    public r M(byte[] bArr) {
        this.f85778d.j(this.f85776b, null, bArr, null);
        return this;
    }

    public r N(char[] cArr) {
        this.f85778d.k(this.f85776b, null, cArr, null);
        return this;
    }

    public r O(double[] dArr) {
        this.f85778d.l(this.f85776b, null, dArr, null);
        return this;
    }

    public r P(float[] fArr) {
        this.f85778d.m(this.f85776b, null, fArr, null);
        return this;
    }

    public r Q(int[] iArr) {
        this.f85778d.n(this.f85776b, null, iArr, null);
        return this;
    }

    public r R(long[] jArr) {
        this.f85778d.o(this.f85776b, null, jArr, null);
        return this;
    }

    public r S(Object[] objArr) {
        this.f85778d.p(this.f85776b, null, objArr, null);
        return this;
    }

    public r T(short[] sArr) {
        this.f85778d.q(this.f85776b, null, sArr, null);
        return this;
    }

    public r U(boolean[] zArr) {
        this.f85778d.r(this.f85776b, null, zArr, null);
        return this;
    }

    public r V(Object obj) {
        p0.C(b0(), obj);
        return this;
    }

    public r W(String str) {
        if (str != null) {
            this.f85778d.k0(this.f85776b, str);
        }
        return this;
    }

    public r X(String str) {
        if (str != null) {
            this.f85778d.l0(this.f85776b, str);
        }
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public String a() {
        return toString();
    }

    public Object a0() {
        return this.f85777c;
    }

    public r b(byte b5) {
        this.f85778d.a(this.f85776b, null, b5);
        return this;
    }

    public StringBuffer b0() {
        return this.f85776b;
    }

    public r c(char c5) {
        this.f85778d.b(this.f85776b, null, c5);
        return this;
    }

    public t c0() {
        return this.f85778d;
    }

    public r d(double d5) {
        this.f85778d.c(this.f85776b, null, d5);
        return this;
    }

    public r e(float f4) {
        this.f85778d.d(this.f85776b, null, f4);
        return this;
    }

    public r f(int i4) {
        this.f85778d.e(this.f85776b, null, i4);
        return this;
    }

    public r g(long j4) {
        this.f85778d.f(this.f85776b, null, j4);
        return this;
    }

    public r h(Object obj) {
        this.f85778d.g(this.f85776b, null, obj, null);
        return this;
    }

    public r i(String str, byte b5) {
        this.f85778d.a(this.f85776b, str, b5);
        return this;
    }

    public r j(String str, char c5) {
        this.f85778d.b(this.f85776b, str, c5);
        return this;
    }

    public r k(String str, double d5) {
        this.f85778d.c(this.f85776b, str, d5);
        return this;
    }

    public r l(String str, float f4) {
        this.f85778d.d(this.f85776b, str, f4);
        return this;
    }

    public r m(String str, int i4) {
        this.f85778d.e(this.f85776b, str, i4);
        return this;
    }

    public r n(String str, long j4) {
        this.f85778d.f(this.f85776b, str, j4);
        return this;
    }

    public r o(String str, Object obj) {
        this.f85778d.g(this.f85776b, str, obj, null);
        return this;
    }

    public r p(String str, Object obj, boolean z4) {
        this.f85778d.g(this.f85776b, str, obj, Boolean.valueOf(z4));
        return this;
    }

    public r q(String str, short s4) {
        this.f85778d.h(this.f85776b, str, s4);
        return this;
    }

    public r r(String str, boolean z4) {
        this.f85778d.i(this.f85776b, str, z4);
        return this;
    }

    public r s(String str, byte[] bArr) {
        this.f85778d.j(this.f85776b, str, bArr, null);
        return this;
    }

    public r t(String str, byte[] bArr, boolean z4) {
        this.f85778d.j(this.f85776b, str, bArr, Boolean.valueOf(z4));
        return this;
    }

    public String toString() {
        if (a0() == null) {
            b0().append(c0().t0());
        } else {
            this.f85778d.R(b0(), a0());
        }
        return b0().toString();
    }

    public r u(String str, char[] cArr) {
        this.f85778d.k(this.f85776b, str, cArr, null);
        return this;
    }

    public r v(String str, char[] cArr, boolean z4) {
        this.f85778d.k(this.f85776b, str, cArr, Boolean.valueOf(z4));
        return this;
    }

    public r w(String str, double[] dArr) {
        this.f85778d.l(this.f85776b, str, dArr, null);
        return this;
    }

    public r x(String str, double[] dArr, boolean z4) {
        this.f85778d.l(this.f85776b, str, dArr, Boolean.valueOf(z4));
        return this;
    }

    public r y(String str, float[] fArr) {
        this.f85778d.m(this.f85776b, str, fArr, null);
        return this;
    }

    public r z(String str, float[] fArr, boolean z4) {
        this.f85778d.m(this.f85776b, str, fArr, Boolean.valueOf(z4));
        return this;
    }

    public r(Object obj, t tVar) {
        this(obj, tVar, null);
    }

    public r(Object obj, t tVar, StringBuffer stringBuffer) {
        tVar = tVar == null ? f85775e : tVar;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f85776b = stringBuffer;
        this.f85778d = tVar;
        this.f85777c = obj;
        tVar.Y(stringBuffer, obj);
    }
}

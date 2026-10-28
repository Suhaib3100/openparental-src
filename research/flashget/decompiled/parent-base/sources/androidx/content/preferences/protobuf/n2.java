package androidx.content.preferences.protobuf;

import androidx.appcompat.view.g;
import androidx.content.preferences.protobuf.b2;
import androidx.content.preferences.protobuf.l;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.t4;
import androidx.content.preferences.protobuf.v4;
import androidx.content.preferences.protobuf.w;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes3.dex */
final class n2<T> implements m3<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int f28775r = 3;

    /* renamed from: s, reason: collision with root package name */
    private static final int f28776s = 20;

    /* renamed from: t, reason: collision with root package name */
    private static final int f28777t = 1048575;

    /* renamed from: u, reason: collision with root package name */
    private static final int f28778u = 267386880;

    /* renamed from: v, reason: collision with root package name */
    private static final int f28779v = 268435456;

    /* renamed from: w, reason: collision with root package name */
    private static final int f28780w = 536870912;

    /* renamed from: y, reason: collision with root package name */
    static final int f28782y = 51;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f28784a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f28785b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28786c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28787d;

    /* renamed from: e, reason: collision with root package name */
    private final i2 f28788e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28789f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28790g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28791h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f28792i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f28793j;

    /* renamed from: k, reason: collision with root package name */
    private final int f28794k;

    /* renamed from: l, reason: collision with root package name */
    private final int f28795l;

    /* renamed from: m, reason: collision with root package name */
    private final u2 f28796m;

    /* renamed from: n, reason: collision with root package name */
    private final w1 f28797n;

    /* renamed from: o, reason: collision with root package name */
    private final l4<?, ?> f28798o;

    /* renamed from: p, reason: collision with root package name */
    private final t0<?> f28799p;

    /* renamed from: q, reason: collision with root package name */
    private final d2 f28800q;

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f28781x = new int[0];

    /* renamed from: z, reason: collision with root package name */
    private static final Unsafe f28783z = p4.R();

    /* compiled from: MessageSchema.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28801a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28801a = iArr;
            try {
                iArr[t4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28801a[t4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28801a[t4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28801a[t4.b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28801a[t4.b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28801a[t4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28801a[t4.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28801a[t4.b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28801a[t4.b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28801a[t4.b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28801a[t4.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28801a[t4.b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28801a[t4.b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28801a[t4.b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28801a[t4.b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28801a[t4.b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28801a[t4.b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private n2(int[] iArr, Object[] objArr, int i4, int i5, i2 i2Var, boolean z4, boolean z5, int[] iArr2, int i6, int i7, u2 u2Var, w1 w1Var, l4<?, ?> l4Var, t0<?> t0Var, d2 d2Var) {
        this.f28784a = iArr;
        this.f28785b = objArr;
        this.f28786c = i4;
        this.f28787d = i5;
        this.f28790g = i2Var instanceof i1;
        this.f28791h = z4;
        this.f28789f = t0Var != null && t0Var.e(i2Var);
        this.f28792i = z5;
        this.f28793j = iArr2;
        this.f28794k = i6;
        this.f28795l = i7;
        this.f28796m = u2Var;
        this.f28797n = w1Var;
        this.f28798o = l4Var;
        this.f28799p = t0Var;
        this.f28788e = i2Var;
        this.f28800q = d2Var;
    }

    private <UT, UB> int A(l4<UT, UB> l4Var, T t4) {
        return l4Var.h(l4Var.g(t4));
    }

    private <UT, UB> void A0(l4<UT, UB> l4Var, T t4, v4 v4Var) throws IOException {
        l4Var.t(l4Var.g(t4), v4Var);
    }

    private static <T> int B(T t4, long j4) {
        return p4.I(t4, j4);
    }

    private static boolean C(int i4) {
        return (i4 & f28780w) != 0;
    }

    private boolean D(T t4, int i4) {
        if (!this.f28791h) {
            int j02 = j0(i4);
            return (p4.I(t4, (long) (j02 & f28777t)) & (1 << (j02 >>> 20))) != 0;
        }
        int u02 = u0(i4);
        long j4 = u02 & f28777t;
        switch (t0(u02)) {
            case 0:
                return p4.D(t4, j4) != p.f60679p;
            case 1:
                return p4.F(t4, j4) != 0.0f;
            case 2:
                return p4.L(t4, j4) != 0;
            case 3:
                return p4.L(t4, j4) != 0;
            case 4:
                return p4.I(t4, j4) != 0;
            case 5:
                return p4.L(t4, j4) != 0;
            case 6:
                return p4.I(t4, j4) != 0;
            case 7:
                return p4.u(t4, j4);
            case 8:
                Object O = p4.O(t4, j4);
                if (O instanceof String) {
                    return !((String) O).isEmpty();
                }
                if (O instanceof w) {
                    return !w.f28998f.equals(O);
                }
                throw new IllegalArgumentException();
            case 9:
                return p4.O(t4, j4) != null;
            case 10:
                return !w.f28998f.equals(p4.O(t4, j4));
            case 11:
                return p4.I(t4, j4) != 0;
            case 12:
                return p4.I(t4, j4) != 0;
            case 13:
                return p4.I(t4, j4) != 0;
            case 14:
                return p4.L(t4, j4) != 0;
            case 15:
                return p4.I(t4, j4) != 0;
            case 16:
                return p4.L(t4, j4) != 0;
            case 17:
                return p4.O(t4, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean E(T t4, int i4, int i5, int i6) {
        return this.f28791h ? D(t4, i4) : (i5 & i6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int i4, m3 m3Var) {
        return m3Var.d(p4.O(obj, i4 & f28777t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object obj, int i4, int i5) {
        List list = (List) p4.O(obj, i4 & f28777t);
        if (list.isEmpty()) {
            return true;
        }
        m3 v4 = v(i5);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!v4.d(list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.datastore.preferences.protobuf.m3] */
    private boolean H(T t4, int i4, int i5) {
        Map<?, ?> e4 = this.f28800q.e(p4.O(t4, i4 & f28777t));
        if (e4.isEmpty()) {
            return true;
        }
        if (this.f28800q.b(u(i5)).f28642c.getJavaType() != t4.c.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (Object obj : e4.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = f3.a().i(obj.getClass());
            }
            if (!r5.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean I(T t4, T t5, int i4) {
        long j02 = j0(i4) & f28777t;
        return p4.I(t4, j02) == p4.I(t5, j02);
    }

    private boolean J(T t4, int i4, int i5) {
        return p4.I(t4, (long) (j0(i5) & f28777t)) == i4;
    }

    private static boolean K(int i4) {
        return (i4 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j4) {
        return (List) p4.O(obj, j4);
    }

    private static <T> long M(T t4, long j4) {
        return p4.L(t4, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x007b, code lost:
    
        r0 = r16.f28794k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x007f, code lost:
    
        if (r0 >= r16.f28795l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0081, code lost:
    
        r13 = q(r19, r16.f28793j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x008c, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.c1.c<ET>> void N(androidx.content.preferences.protobuf.l4<UT, UB> r17, androidx.content.preferences.protobuf.t0<ET> r18, T r19, androidx.content.preferences.protobuf.k3 r20, androidx.content.preferences.protobuf.s0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.N(androidx.datastore.preferences.protobuf.l4, androidx.datastore.preferences.protobuf.t0, java.lang.Object, androidx.datastore.preferences.protobuf.k3, androidx.datastore.preferences.protobuf.s0):void");
    }

    private final <K, V> void O(Object obj, int i4, Object obj2, s0 s0Var, k3 k3Var) throws IOException {
        long u02 = u0(i4) & f28777t;
        Object O = p4.O(obj, u02);
        if (O == null) {
            O = this.f28800q.d(obj2);
            p4.q0(obj, u02, O);
        } else if (this.f28800q.h(O)) {
            Object d5 = this.f28800q.d(obj2);
            this.f28800q.a(d5, O);
            p4.q0(obj, u02, d5);
            O = d5;
        }
        k3Var.D(this.f28800q.c(O), this.f28800q.b(obj2), s0Var);
    }

    private void P(T t4, T t5, int i4) {
        long u02 = u0(i4) & f28777t;
        if (D(t5, i4)) {
            Object O = p4.O(t4, u02);
            Object O2 = p4.O(t5, u02);
            if (O != null && O2 != null) {
                p4.q0(t4, u02, p1.v(O, O2));
                p0(t4, i4);
            } else if (O2 != null) {
                p4.q0(t4, u02, O2);
                p0(t4, i4);
            }
        }
    }

    private void Q(T t4, T t5, int i4) {
        int u02 = u0(i4);
        int i5 = this.f28784a[i4];
        long j4 = u02 & f28777t;
        if (J(t5, i5, i4)) {
            Object O = p4.O(t4, j4);
            Object O2 = p4.O(t5, j4);
            if (O != null && O2 != null) {
                p4.q0(t4, j4, p1.v(O, O2));
                q0(t4, i5, i4);
            } else if (O2 != null) {
                p4.q0(t4, j4, O2);
                q0(t4, i5, i4);
            }
        }
    }

    private void R(T t4, T t5, int i4) {
        int u02 = u0(i4);
        long j4 = f28777t & u02;
        int i5 = this.f28784a[i4];
        switch (t0(u02)) {
            case 0:
                if (D(t5, i4)) {
                    p4.g0(t4, j4, p4.D(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 1:
                if (D(t5, i4)) {
                    p4.i0(t4, j4, p4.F(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 2:
                if (D(t5, i4)) {
                    p4.o0(t4, j4, p4.L(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 3:
                if (D(t5, i4)) {
                    p4.o0(t4, j4, p4.L(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 4:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 5:
                if (D(t5, i4)) {
                    p4.o0(t4, j4, p4.L(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 6:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 7:
                if (D(t5, i4)) {
                    p4.X(t4, j4, p4.u(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 8:
                if (D(t5, i4)) {
                    p4.q0(t4, j4, p4.O(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 9:
                P(t4, t5, i4);
                break;
            case 10:
                if (D(t5, i4)) {
                    p4.q0(t4, j4, p4.O(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 11:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 12:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 13:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 14:
                if (D(t5, i4)) {
                    p4.o0(t4, j4, p4.L(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 15:
                if (D(t5, i4)) {
                    p4.l0(t4, j4, p4.I(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 16:
                if (D(t5, i4)) {
                    p4.o0(t4, j4, p4.L(t5, j4));
                    p0(t4, i4);
                    break;
                }
                break;
            case 17:
                P(t4, t5, i4);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f28797n.d(t4, t5, j4);
                break;
            case 50:
                o3.I(this.f28800q, t4, t5, j4);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (J(t5, i5, i4)) {
                    p4.q0(t4, j4, p4.O(t5, j4));
                    q0(t4, i5, i4);
                    break;
                }
                break;
            case 60:
                Q(t4, t5, i4);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t5, i5, i4)) {
                    p4.q0(t4, j4, p4.O(t5, j4));
                    q0(t4, i5, i4);
                    break;
                }
                break;
            case 68:
                Q(t4, t5, i4);
                break;
        }
    }

    static <T> n2<T> S(Class<T> cls, g2 g2Var, u2 u2Var, w1 w1Var, l4<?, ?> l4Var, t0<?> t0Var, d2 d2Var) {
        return g2Var instanceof j3 ? U((j3) g2Var, u2Var, w1Var, l4Var, t0Var, d2Var) : T((y3) g2Var, u2Var, w1Var, l4Var, t0Var, d2Var);
    }

    static <T> n2<T> T(y3 y3Var, u2 u2Var, w1 w1Var, l4<?, ?> l4Var, t0<?> t0Var, d2 d2Var) {
        int o4;
        int o5;
        int i4;
        boolean z4 = y3Var.g() == e3.PROTO3;
        x0[] d5 = y3Var.d();
        if (d5.length == 0) {
            o4 = 0;
            o5 = 0;
        } else {
            o4 = d5[0].o();
            o5 = d5[d5.length - 1].o();
        }
        int length = d5.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i5 = 0;
        int i6 = 0;
        for (x0 x0Var : d5) {
            if (x0Var.w() == d1.MAP) {
                i5++;
            } else if (x0Var.w().id() >= 18 && x0Var.w().id() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = i5 > 0 ? new int[i5] : null;
        int[] iArr3 = i6 > 0 ? new int[i6] : null;
        int[] c5 = y3Var.c();
        if (c5 == null) {
            c5 = f28781x;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i7 < d5.length) {
            x0 x0Var2 = d5[i7];
            int o6 = x0Var2.o();
            s0(x0Var2, iArr, i10, z4, objArr);
            if (i11 < c5.length && c5[i11] == o6) {
                c5[i11] = i10;
                i11++;
            }
            if (x0Var2.w() == d1.MAP) {
                iArr2[i12] = i10;
                i12++;
            } else if (x0Var2.w().id() >= 18 && x0Var2.w().id() <= 49) {
                i4 = i10;
                iArr3[i13] = (int) p4.W(x0Var2.n());
                i13++;
                i7++;
                i10 = i4 + 3;
            }
            i4 = i10;
            i7++;
            i10 = i4 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f28781x;
        }
        if (iArr3 == null) {
            iArr3 = f28781x;
        }
        int[] iArr4 = new int[c5.length + iArr2.length + iArr3.length];
        System.arraycopy(c5, 0, iArr4, 0, c5.length);
        System.arraycopy(iArr2, 0, iArr4, c5.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, c5.length + iArr2.length, iArr3.length);
        return new n2<>(iArr, objArr, o4, o5, y3Var.b(), z4, true, iArr4, c5.length, c5.length + iArr2.length, u2Var, w1Var, l4Var, t0Var, d2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> androidx.content.preferences.protobuf.n2<T> U(androidx.content.preferences.protobuf.j3 r35, androidx.content.preferences.protobuf.u2 r36, androidx.content.preferences.protobuf.w1 r37, androidx.content.preferences.protobuf.l4<?, ?> r38, androidx.content.preferences.protobuf.t0<?> r39, androidx.content.preferences.protobuf.d2 r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.U(androidx.datastore.preferences.protobuf.j3, androidx.datastore.preferences.protobuf.u2, androidx.datastore.preferences.protobuf.w1, androidx.datastore.preferences.protobuf.l4, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.d2):androidx.datastore.preferences.protobuf.n2");
    }

    private int V(int i4) {
        return this.f28784a[i4];
    }

    private static long W(int i4) {
        return i4 & f28777t;
    }

    private static <T> boolean X(T t4, long j4) {
        return ((Boolean) p4.O(t4, j4)).booleanValue();
    }

    private static <T> double Y(T t4, long j4) {
        return ((Double) p4.O(t4, j4)).doubleValue();
    }

    private static <T> float Z(T t4, long j4) {
        return ((Float) p4.O(t4, j4)).floatValue();
    }

    private static <T> int a0(T t4, long j4) {
        return ((Integer) p4.O(t4, j4)).intValue();
    }

    private static <T> long b0(T t4, long j4) {
        return ((Long) p4.O(t4, j4)).longValue();
    }

    private <K, V> int c0(T t4, byte[] bArr, int i4, int i5, int i6, long j4, l.b bVar) throws IOException {
        Unsafe unsafe = f28783z;
        Object u4 = u(i6);
        Object object = unsafe.getObject(t4, j4);
        if (this.f28800q.h(object)) {
            Object d5 = this.f28800q.d(u4);
            this.f28800q.a(d5, object);
            unsafe.putObject(t4, j4, d5);
            object = d5;
        }
        return m(bArr, i4, i5, this.f28800q.b(u4), this.f28800q.c(object), bVar);
    }

    private int d0(T t4, byte[] bArr, int i4, int i5, int i6, int i7, int i10, int i11, int i12, long j4, int i13, l.b bVar) throws IOException {
        Unsafe unsafe = f28783z;
        long j5 = this.f28784a[i13 + 2] & f28777t;
        switch (i12) {
            case 51:
                if (i10 == 1) {
                    unsafe.putObject(t4, j4, Double.valueOf(l.d(bArr, i4)));
                    int i14 = i4 + 8;
                    unsafe.putInt(t4, j5, i7);
                    return i14;
                }
                break;
            case 52:
                if (i10 == 5) {
                    unsafe.putObject(t4, j4, Float.valueOf(l.l(bArr, i4)));
                    int i15 = i4 + 4;
                    unsafe.putInt(t4, j5, i7);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i10 == 0) {
                    int L = l.L(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, Long.valueOf(bVar.f28729b));
                    unsafe.putInt(t4, j5, i7);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i10 == 0) {
                    int I = l.I(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, Integer.valueOf(bVar.f28728a));
                    unsafe.putInt(t4, j5, i7);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i10 == 1) {
                    unsafe.putObject(t4, j4, Long.valueOf(l.j(bArr, i4)));
                    int i16 = i4 + 8;
                    unsafe.putInt(t4, j5, i7);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i10 == 5) {
                    unsafe.putObject(t4, j4, Integer.valueOf(l.h(bArr, i4)));
                    int i17 = i4 + 4;
                    unsafe.putInt(t4, j5, i7);
                    return i17;
                }
                break;
            case 58:
                if (i10 == 0) {
                    int L2 = l.L(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, Boolean.valueOf(bVar.f28729b != 0));
                    unsafe.putInt(t4, j5, i7);
                    return L2;
                }
                break;
            case 59:
                if (i10 == 2) {
                    int I2 = l.I(bArr, i4, bVar);
                    int i18 = bVar.f28728a;
                    if (i18 == 0) {
                        unsafe.putObject(t4, j4, "");
                    } else {
                        if ((i11 & f28780w) != 0 && !q4.u(bArr, I2, I2 + i18)) {
                            throw InvalidProtocolBufferException.d();
                        }
                        unsafe.putObject(t4, j4, new String(bArr, I2, i18, p1.f28847a));
                        I2 += i18;
                    }
                    unsafe.putInt(t4, j5, i7);
                    return I2;
                }
                break;
            case 60:
                if (i10 == 2) {
                    int p4 = l.p(v(i13), bArr, i4, i5, bVar);
                    Object object = unsafe.getInt(t4, j5) == i7 ? unsafe.getObject(t4, j4) : null;
                    if (object == null) {
                        unsafe.putObject(t4, j4, bVar.f28730c);
                    } else {
                        unsafe.putObject(t4, j4, p1.v(object, bVar.f28730c));
                    }
                    unsafe.putInt(t4, j5, i7);
                    return p4;
                }
                break;
            case 61:
                if (i10 == 2) {
                    int b5 = l.b(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, bVar.f28730c);
                    unsafe.putInt(t4, j5, i7);
                    return b5;
                }
                break;
            case 63:
                if (i10 == 0) {
                    int I3 = l.I(bArr, i4, bVar);
                    int i19 = bVar.f28728a;
                    p1.e t5 = t(i13);
                    if (t5 == null || t5.a(i19)) {
                        unsafe.putObject(t4, j4, Integer.valueOf(i19));
                        unsafe.putInt(t4, j5, i7);
                    } else {
                        w(t4).r(i6, Long.valueOf(i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i10 == 0) {
                    int I4 = l.I(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, Integer.valueOf(z.b(bVar.f28728a)));
                    unsafe.putInt(t4, j5, i7);
                    return I4;
                }
                break;
            case 67:
                if (i10 == 0) {
                    int L3 = l.L(bArr, i4, bVar);
                    unsafe.putObject(t4, j4, Long.valueOf(z.c(bVar.f28729b)));
                    unsafe.putInt(t4, j5, i7);
                    return L3;
                }
                break;
            case 68:
                if (i10 == 3) {
                    int n4 = l.n(v(i13), bArr, i4, i5, (i6 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t4, j5) == i7 ? unsafe.getObject(t4, j4) : null;
                    if (object2 == null) {
                        unsafe.putObject(t4, j4, bVar.f28730c);
                    } else {
                        unsafe.putObject(t4, j4, p1.v(object2, bVar.f28730c));
                    }
                    unsafe.putInt(t4, j5, i7);
                    return n4;
                }
                break;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01de, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f4, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0220, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023f, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x005e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f0(T r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.l.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.f0(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int g0(T t4, byte[] bArr, int i4, int i5, int i6, int i7, int i10, int i11, long j4, int i12, long j5, l.b bVar) throws IOException {
        int J;
        Unsafe unsafe = f28783z;
        p1.k kVar = (p1.k) unsafe.getObject(t4, j5);
        if (!kVar.S1()) {
            int size = kVar.size();
            kVar = kVar.e2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t4, j5, kVar);
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return l.s(bArr, i4, kVar, bVar);
                }
                if (i10 == 1) {
                    return l.e(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return l.v(bArr, i4, kVar, bVar);
                }
                if (i10 == 5) {
                    return l.m(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return l.z(bArr, i4, kVar, bVar);
                }
                if (i10 == 0) {
                    return l.M(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return l.y(bArr, i4, kVar, bVar);
                }
                if (i10 == 0) {
                    return l.J(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return l.u(bArr, i4, kVar, bVar);
                }
                if (i10 == 1) {
                    return l.k(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return l.t(bArr, i4, kVar, bVar);
                }
                if (i10 == 5) {
                    return l.i(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return l.r(bArr, i4, kVar, bVar);
                }
                if (i10 == 0) {
                    return l.a(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j4 & 536870912) == 0 ? l.D(i6, bArr, i4, i5, kVar, bVar) : l.E(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return l.q(v(i11), i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return l.c(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    J = l.y(bArr, i4, kVar, bVar);
                } else if (i10 == 0) {
                    J = l.J(i6, bArr, i4, i5, kVar, bVar);
                }
                i1 i1Var = (i1) t4;
                m4 m4Var = i1Var.unknownFields;
                if (m4Var == m4.e()) {
                    m4Var = null;
                }
                m4 m4Var2 = (m4) o3.C(i7, kVar, t(i11), m4Var, this.f28798o);
                if (m4Var2 != null) {
                    i1Var.unknownFields = m4Var2;
                }
                return J;
            case 33:
            case 47:
                if (i10 == 2) {
                    return l.w(bArr, i4, kVar, bVar);
                }
                if (i10 == 0) {
                    return l.A(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return l.x(bArr, i4, kVar, bVar);
                }
                if (i10 == 0) {
                    return l.B(i6, bArr, i4, i5, kVar, bVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return l.o(v(i11), i6, bArr, i4, i5, kVar, bVar);
                }
                break;
        }
        return i4;
    }

    private int h0(int i4) {
        if (i4 < this.f28786c || i4 > this.f28787d) {
            return -1;
        }
        return r0(i4, 0);
    }

    private int i0(int i4, int i5) {
        if (i4 < this.f28786c || i4 > this.f28787d) {
            return -1;
        }
        return r0(i4, i5);
    }

    private int j0(int i4) {
        return this.f28784a[i4 + 2];
    }

    private boolean k(T t4, T t5, int i4) {
        return D(t4, i4) == D(t5, i4);
    }

    private <E> void k0(Object obj, long j4, k3 k3Var, m3<E> m3Var, s0 s0Var) throws IOException {
        k3Var.K(this.f28797n.e(obj, j4), m3Var, s0Var);
    }

    private static <T> boolean l(T t4, long j4) {
        return p4.u(t4, j4);
    }

    private <E> void l0(Object obj, int i4, k3 k3Var, m3<E> m3Var, s0 s0Var) throws IOException {
        k3Var.q(this.f28797n.e(obj, i4 & f28777t), m3Var, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int m(byte[] bArr, int i4, int i5, b2.b<K, V> bVar, Map<K, V> map, l.b bVar2) throws IOException {
        int i6;
        int I = l.I(bArr, i4, bVar2);
        int i7 = bVar2.f28728a;
        if (i7 < 0 || i7 > i5 - I) {
            throw InvalidProtocolBufferException.l();
        }
        int i10 = I + i7;
        Object obj = bVar.f28641b;
        Object obj2 = bVar.f28643d;
        while (I < i10) {
            int i11 = I + 1;
            byte b5 = bArr[I];
            if (b5 < 0) {
                i6 = l.H(b5, bArr, i11, bVar2);
                b5 = bVar2.f28728a;
            } else {
                i6 = i11;
            }
            int i12 = b5 >>> 3;
            int i13 = b5 & 7;
            if (i12 != 1) {
                if (i12 == 2 && i13 == bVar.f28642c.getWireType()) {
                    I = n(bArr, i6, i5, bVar.f28642c, bVar.f28643d.getClass(), bVar2);
                    obj2 = bVar2.f28730c;
                }
                I = l.N(b5, bArr, i6, i5, bVar2);
            } else if (i13 == bVar.f28640a.getWireType()) {
                I = n(bArr, i6, i5, bVar.f28640a, null, bVar2);
                obj = bVar2.f28730c;
            } else {
                I = l.N(b5, bArr, i6, i5, bVar2);
            }
        }
        if (I != i10) {
            throw InvalidProtocolBufferException.h();
        }
        map.put(obj, obj2);
        return i10;
    }

    private void m0(Object obj, int i4, k3 k3Var) throws IOException {
        if (C(i4)) {
            p4.q0(obj, i4 & f28777t, k3Var.R());
        } else if (this.f28790g) {
            p4.q0(obj, i4 & f28777t, k3Var.G());
        } else {
            p4.q0(obj, i4 & f28777t, k3Var.o());
        }
    }

    private int n(byte[] bArr, int i4, int i5, t4.b bVar, Class<?> cls, l.b bVar2) throws IOException {
        switch (a.f28801a[bVar.ordinal()]) {
            case 1:
                int L = l.L(bArr, i4, bVar2);
                bVar2.f28730c = Boolean.valueOf(bVar2.f28729b != 0);
                return L;
            case 2:
                return l.b(bArr, i4, bVar2);
            case 3:
                bVar2.f28730c = Double.valueOf(l.d(bArr, i4));
                return i4 + 8;
            case 4:
            case 5:
                bVar2.f28730c = Integer.valueOf(l.h(bArr, i4));
                return i4 + 4;
            case 6:
            case 7:
                bVar2.f28730c = Long.valueOf(l.j(bArr, i4));
                return i4 + 8;
            case 8:
                bVar2.f28730c = Float.valueOf(l.l(bArr, i4));
                return i4 + 4;
            case 9:
            case 10:
            case 11:
                int I = l.I(bArr, i4, bVar2);
                bVar2.f28730c = Integer.valueOf(bVar2.f28728a);
                return I;
            case 12:
            case 13:
                int L2 = l.L(bArr, i4, bVar2);
                bVar2.f28730c = Long.valueOf(bVar2.f28729b);
                return L2;
            case 14:
                return l.p(f3.a().i(cls), bArr, i4, i5, bVar2);
            case 15:
                int I2 = l.I(bArr, i4, bVar2);
                bVar2.f28730c = Integer.valueOf(z.b(bVar2.f28728a));
                return I2;
            case 16:
                int L3 = l.L(bArr, i4, bVar2);
                bVar2.f28730c = Long.valueOf(z.c(bVar2.f28729b));
                return L3;
            case 17:
                return l.F(bArr, i4, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void n0(Object obj, int i4, k3 k3Var) throws IOException {
        if (C(i4)) {
            k3Var.n(this.f28797n.e(obj, i4 & f28777t));
        } else {
            k3Var.I(this.f28797n.e(obj, i4 & f28777t));
        }
    }

    private static <T> double o(T t4, long j4) {
        return p4.D(t4, j4);
    }

    private static Field o0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder a5 = g.a("Field ", str, " for ");
            m2.a(cls, a5, " not found. Known fields are ");
            a5.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a5.toString());
        }
    }

    private boolean p(T t4, T t5, int i4) {
        int u02 = u0(i4);
        long j4 = f28777t & u02;
        switch (t0(u02)) {
            case 0:
                if (k(t4, t5, i4) && Double.doubleToLongBits(p4.D(t4, j4)) == Double.doubleToLongBits(p4.D(t5, j4))) {
                    break;
                }
                break;
            case 1:
                if (k(t4, t5, i4) && Float.floatToIntBits(p4.F(t4, j4)) == Float.floatToIntBits(p4.F(t5, j4))) {
                    break;
                }
                break;
            case 2:
                if (k(t4, t5, i4) && p4.L(t4, j4) == p4.L(t5, j4)) {
                    break;
                }
                break;
            case 3:
                if (k(t4, t5, i4) && p4.L(t4, j4) == p4.L(t5, j4)) {
                    break;
                }
                break;
            case 4:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 5:
                if (k(t4, t5, i4) && p4.L(t4, j4) == p4.L(t5, j4)) {
                    break;
                }
                break;
            case 6:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 7:
                if (k(t4, t5, i4) && p4.u(t4, j4) == p4.u(t5, j4)) {
                    break;
                }
                break;
            case 8:
                if (k(t4, t5, i4) && o3.N(p4.O(t4, j4), p4.O(t5, j4))) {
                    break;
                }
                break;
            case 9:
                if (k(t4, t5, i4) && o3.N(p4.O(t4, j4), p4.O(t5, j4))) {
                    break;
                }
                break;
            case 10:
                if (k(t4, t5, i4) && o3.N(p4.O(t4, j4), p4.O(t5, j4))) {
                    break;
                }
                break;
            case 11:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 12:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 13:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 14:
                if (k(t4, t5, i4) && p4.L(t4, j4) == p4.L(t5, j4)) {
                    break;
                }
                break;
            case 15:
                if (k(t4, t5, i4) && p4.I(t4, j4) == p4.I(t5, j4)) {
                    break;
                }
                break;
            case 16:
                if (k(t4, t5, i4) && p4.L(t4, j4) == p4.L(t5, j4)) {
                    break;
                }
                break;
            case 17:
                if (k(t4, t5, i4) && o3.N(p4.O(t4, j4), p4.O(t5, j4))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (I(t4, t5, i4) && o3.N(p4.O(t4, j4), p4.O(t5, j4))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void p0(T t4, int i4) {
        if (this.f28791h) {
            return;
        }
        int j02 = j0(i4);
        long j4 = j02 & f28777t;
        p4.l0(t4, j4, p4.I(t4, j4) | (1 << (j02 >>> 20)));
    }

    private final <UT, UB> UB q(Object obj, int i4, UB ub, l4<UT, UB> l4Var) {
        int i5 = this.f28784a[i4];
        Object O = p4.O(obj, u0(i4) & f28777t);
        if (O == null) {
            return ub;
        }
        p1.e t4 = t(i4);
        return t4 == null ? ub : (UB) r(i4, i5, this.f28800q.c(O), t4, ub, l4Var);
    }

    private void q0(T t4, int i4, int i5) {
        p4.l0(t4, j0(i5) & f28777t, i4);
    }

    private final <K, V, UT, UB> UB r(int i4, int i5, Map<K, V> map, p1.e eVar, UB ub, l4<UT, UB> l4Var) {
        b2.b<?, ?> b5 = this.f28800q.b(u(i4));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = l4Var.n();
                }
                w.h R = w.R(b2.b(b5, next.getKey(), next.getValue()));
                try {
                    b2.l(R.b(), b5, next.getKey(), next.getValue());
                    l4Var.d(ub, i5, R.a());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    private int r0(int i4, int i5) {
        int length = (this.f28784a.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i10 = this.f28784a[i7];
            if (i4 == i10) {
                return i7;
            }
            if (i4 < i10) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static <T> float s(T t4, long j4) {
        return p4.F(t4, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void s0(androidx.content.preferences.protobuf.x0 r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            androidx.datastore.preferences.protobuf.z2 r0 = r8.s()
            r1 = 0
            if (r0 == 0) goto L27
            androidx.datastore.preferences.protobuf.d1 r11 = r8.w()
            int r11 = r11.id()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.c()
            long r2 = androidx.content.preferences.protobuf.p4.W(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.a()
            long r3 = androidx.content.preferences.protobuf.p4.W(r0)
            int r0 = (int) r3
        L23:
            r3 = r2
            r2 = r0
            r0 = r1
            goto L73
        L27:
            androidx.datastore.preferences.protobuf.d1 r0 = r8.w()
            java.lang.reflect.Field r2 = r8.n()
            long r2 = androidx.content.preferences.protobuf.p4.W(r2)
            int r2 = (int) r2
            int r3 = r0.id()
            if (r11 != 0) goto L5d
            boolean r11 = r0.isList()
            if (r11 != 0) goto L5d
            boolean r11 = r0.isMap()
            if (r11 != 0) goto L5d
            java.lang.reflect.Field r11 = r8.u()
            long r4 = androidx.content.preferences.protobuf.p4.W(r11)
            int r0 = (int) r4
            int r11 = r8.v()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r2
            r2 = r7
            goto L73
        L5d:
            java.lang.reflect.Field r11 = r8.l()
            if (r11 != 0) goto L68
            r0 = r1
            r11 = r3
            r3 = r2
            r2 = r0
            goto L73
        L68:
            java.lang.reflect.Field r11 = r8.l()
            long r4 = androidx.content.preferences.protobuf.p4.W(r11)
            int r0 = (int) r4
            r11 = r3
            goto L23
        L73:
            int r4 = r8.o()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.x()
            if (r5 == 0) goto L84
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L85
        L84:
            r5 = r1
        L85:
            boolean r6 = r8.z()
            if (r6 == 0) goto L8d
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L8d:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.r()
            java.lang.Object r11 = r8.q()
            if (r11 == 0) goto Lc5
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.q()
            r12[r10] = r11
            if (r9 == 0) goto Lb6
            int r10 = r10 + 1
            r12[r10] = r9
            goto Le2
        Lb6:
            androidx.datastore.preferences.protobuf.p1$e r9 = r8.m()
            if (r9 == 0) goto Le2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.p1$e r8 = r8.m()
            r12[r10] = r8
            goto Le2
        Lc5:
            if (r9 == 0) goto Ld0
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            goto Le2
        Ld0:
            androidx.datastore.preferences.protobuf.p1$e r9 = r8.m()
            if (r9 == 0) goto Le2
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.p1$e r8 = r8.m()
            r12[r10] = r8
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.s0(androidx.datastore.preferences.protobuf.x0, int[], int, boolean, java.lang.Object[]):void");
    }

    private p1.e t(int i4) {
        return (p1.e) this.f28785b[((i4 / 3) * 2) + 1];
    }

    private static int t0(int i4) {
        return (i4 & f28778u) >>> 20;
    }

    private Object u(int i4) {
        return this.f28785b[(i4 / 3) * 2];
    }

    private int u0(int i4) {
        return this.f28784a[i4 + 1];
    }

    private m3 v(int i4) {
        int i5 = (i4 / 3) * 2;
        m3 m3Var = (m3) this.f28785b[i5];
        if (m3Var != null) {
            return m3Var;
        }
        m3<T> i6 = f3.a().i((Class) this.f28785b[i5 + 1]);
        this.f28785b[i5] = i6;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(T r20, androidx.content.preferences.protobuf.v4 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.v0(java.lang.Object, androidx.datastore.preferences.protobuf.v4):void");
    }

    static m4 w(Object obj) {
        i1 i1Var = (i1) obj;
        m4 m4Var = i1Var.unknownFields;
        if (m4Var != m4.e()) {
            return m4Var;
        }
        m4 p4 = m4.p();
        i1Var.unknownFields = p4;
        return p4;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0(T r13, androidx.content.preferences.protobuf.v4 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.w0(java.lang.Object, androidx.datastore.preferences.protobuf.v4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x0(T r11, androidx.content.preferences.protobuf.v4 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.x0(java.lang.Object, androidx.datastore.preferences.protobuf.v4):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int y(T t4) {
        int i4;
        int i5;
        int i02;
        int a02;
        int g02;
        int p4;
        int N0;
        boolean z4;
        int f4;
        Unsafe unsafe = f28783z;
        int i6 = -1;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < this.f28784a.length) {
            int u02 = u0(i7);
            int i12 = this.f28784a[i7];
            int t02 = t0(u02);
            if (t02 <= 17) {
                i4 = this.f28784a[i7 + 2];
                int i13 = i4 & f28777t;
                i5 = 1 << (i4 >>> 20);
                if (i13 != i6) {
                    i11 = unsafe.getInt(t4, i13);
                    i6 = i13;
                }
            } else {
                i4 = (!this.f28792i || t02 < d1.DOUBLE_LIST_PACKED.id() || t02 > d1.SINT64_LIST_PACKED.id()) ? 0 : this.f28784a[i7 + 2] & f28777t;
                i5 = 0;
            }
            long j4 = u02 & f28777t;
            int i14 = i6;
            switch (t02) {
                case 0:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.i0(i12, p.f60679p);
                        i10 += i02;
                        break;
                    }
                case 1:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.q0(i12, 0.0f);
                        i10 += i02;
                        break;
                    }
                case 2:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.y0(i12, unsafe.getLong(t4, j4));
                        i10 += i02;
                        break;
                    }
                case 3:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.a1(i12, unsafe.getLong(t4, j4));
                        i10 += i02;
                        break;
                    }
                case 4:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.w0(i12, unsafe.getInt(t4, j4));
                        i10 += i02;
                        break;
                    }
                case 5:
                    if ((i11 & i5) == 0) {
                        break;
                    } else {
                        i02 = CodedOutputStream.o0(i12, 0L);
                        i10 += i02;
                        break;
                    }
                case 6:
                    if ((i11 & i5) != 0) {
                        i02 = CodedOutputStream.m0(i12, 0);
                        i10 += i02;
                        break;
                    }
                    break;
                case 7:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.a0(i12, true);
                        i10 += a02;
                    }
                    break;
                case 8:
                    if ((i11 & i5) != 0) {
                        Object object = unsafe.getObject(t4, j4);
                        g02 = object instanceof w ? CodedOutputStream.g0(i12, (w) object) : CodedOutputStream.V0(i12, (String) object);
                        i10 = g02 + i10;
                    }
                    break;
                case 9:
                    if ((i11 & i5) != 0) {
                        p4 = o3.p(i12, unsafe.getObject(t4, j4), v(i7));
                        i10 += p4;
                    }
                    break;
                case 10:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.g0(i12, (w) unsafe.getObject(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 11:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.Y0(i12, unsafe.getInt(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 12:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.k0(i12, unsafe.getInt(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 13:
                    if ((i11 & i5) != 0) {
                        N0 = CodedOutputStream.N0(i12, 0);
                        i10 += N0;
                    }
                    break;
                case 14:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.P0(i12, 0L);
                        i10 += a02;
                    }
                    break;
                case 15:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.R0(i12, unsafe.getInt(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 16:
                    if ((i11 & i5) != 0) {
                        a02 = CodedOutputStream.T0(i12, unsafe.getLong(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 17:
                    if ((i11 & i5) != 0) {
                        p4 = CodedOutputStream.t0(i12, (i2) unsafe.getObject(t4, j4), v(i7));
                        i10 += p4;
                    }
                    break;
                case 18:
                    p4 = o3.h(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += p4;
                    break;
                case 19:
                    z4 = false;
                    f4 = o3.f(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 20:
                    z4 = false;
                    f4 = o3.n(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 21:
                    z4 = false;
                    f4 = o3.z(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 22:
                    z4 = false;
                    f4 = o3.l(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 23:
                    z4 = false;
                    f4 = o3.h(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 24:
                    z4 = false;
                    f4 = o3.f(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 25:
                    z4 = false;
                    f4 = o3.a(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 26:
                    p4 = o3.w(i12, (List) unsafe.getObject(t4, j4));
                    i10 += p4;
                    break;
                case 27:
                    p4 = o3.r(i12, (List) unsafe.getObject(t4, j4), v(i7));
                    i10 += p4;
                    break;
                case 28:
                    p4 = o3.c(i12, (List) unsafe.getObject(t4, j4));
                    i10 += p4;
                    break;
                case 29:
                    p4 = o3.x(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += p4;
                    break;
                case 30:
                    z4 = false;
                    f4 = o3.d(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 31:
                    z4 = false;
                    f4 = o3.f(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 32:
                    z4 = false;
                    f4 = o3.h(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 33:
                    z4 = false;
                    f4 = o3.s(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 34:
                    z4 = false;
                    f4 = o3.u(i12, (List) unsafe.getObject(t4, j4), false);
                    i10 += f4;
                    break;
                case 35:
                    int i15 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i15 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, i15);
                        }
                        i10 = l2.a(i15, CodedOutputStream.X0(i12), i15, i10);
                    }
                    break;
                case 36:
                    int g4 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, g4);
                        }
                        i10 = l2.a(g4, CodedOutputStream.X0(i12), g4, i10);
                    }
                    break;
                case 37:
                    int o4 = o3.o((List) unsafe.getObject(t4, j4));
                    if (o4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, o4);
                        }
                        i10 = l2.a(o4, CodedOutputStream.X0(i12), o4, i10);
                    }
                    break;
                case 38:
                    int A = o3.A((List) unsafe.getObject(t4, j4));
                    if (A > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, A);
                        }
                        i10 = l2.a(A, CodedOutputStream.X0(i12), A, i10);
                    }
                    break;
                case 39:
                    int m4 = o3.m((List) unsafe.getObject(t4, j4));
                    if (m4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, m4);
                        }
                        i10 = l2.a(m4, CodedOutputStream.X0(i12), m4, i10);
                    }
                    break;
                case 40:
                    int i16 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i16 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, i16);
                        }
                        i10 = l2.a(i16, CodedOutputStream.X0(i12), i16, i10);
                    }
                    break;
                case 41:
                    int g5 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g5 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, g5);
                        }
                        i10 = l2.a(g5, CodedOutputStream.X0(i12), g5, i10);
                    }
                    break;
                case 42:
                    int b5 = o3.b((List) unsafe.getObject(t4, j4));
                    if (b5 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, b5);
                        }
                        i10 = l2.a(b5, CodedOutputStream.X0(i12), b5, i10);
                    }
                    break;
                case 43:
                    int y4 = o3.y((List) unsafe.getObject(t4, j4));
                    if (y4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, y4);
                        }
                        i10 = l2.a(y4, CodedOutputStream.X0(i12), y4, i10);
                    }
                    break;
                case 44:
                    int e4 = o3.e((List) unsafe.getObject(t4, j4));
                    if (e4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, e4);
                        }
                        i10 = l2.a(e4, CodedOutputStream.X0(i12), e4, i10);
                    }
                    break;
                case 45:
                    int g6 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g6 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, g6);
                        }
                        i10 = l2.a(g6, CodedOutputStream.X0(i12), g6, i10);
                    }
                    break;
                case 46:
                    int i17 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i17 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, i17);
                        }
                        i10 = l2.a(i17, CodedOutputStream.X0(i12), i17, i10);
                    }
                    break;
                case 47:
                    int t5 = o3.t((List) unsafe.getObject(t4, j4));
                    if (t5 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, t5);
                        }
                        i10 = l2.a(t5, CodedOutputStream.X0(i12), t5, i10);
                    }
                    break;
                case 48:
                    int v4 = o3.v((List) unsafe.getObject(t4, j4));
                    if (v4 > 0) {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i4, v4);
                        }
                        i10 = l2.a(v4, CodedOutputStream.X0(i12), v4, i10);
                    }
                    break;
                case 49:
                    p4 = o3.k(i12, (List) unsafe.getObject(t4, j4), v(i7));
                    i10 += p4;
                    break;
                case 50:
                    p4 = this.f28800q.g(i12, unsafe.getObject(t4, j4), u(i7));
                    i10 += p4;
                    break;
                case 51:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.i0(i12, p.f60679p);
                        i10 += a02;
                    }
                    break;
                case 52:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.q0(i12, 0.0f);
                        i10 += a02;
                    }
                    break;
                case 53:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.y0(i12, b0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 54:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.a1(i12, b0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 55:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.w0(i12, a0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 56:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.o0(i12, 0L);
                        i10 += a02;
                    }
                    break;
                case 57:
                    if (J(t4, i12, i7)) {
                        N0 = CodedOutputStream.m0(i12, 0);
                        i10 += N0;
                    }
                    break;
                case 58:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.a0(i12, true);
                        i10 += a02;
                    }
                    break;
                case 59:
                    if (J(t4, i12, i7)) {
                        Object object2 = unsafe.getObject(t4, j4);
                        g02 = object2 instanceof w ? CodedOutputStream.g0(i12, (w) object2) : CodedOutputStream.V0(i12, (String) object2);
                        i10 = g02 + i10;
                    }
                    break;
                case 60:
                    if (J(t4, i12, i7)) {
                        p4 = o3.p(i12, unsafe.getObject(t4, j4), v(i7));
                        i10 += p4;
                    }
                    break;
                case 61:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.g0(i12, (w) unsafe.getObject(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 62:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.Y0(i12, a0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 63:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.k0(i12, a0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 64:
                    if (J(t4, i12, i7)) {
                        N0 = CodedOutputStream.N0(i12, 0);
                        i10 += N0;
                    }
                    break;
                case 65:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.P0(i12, 0L);
                        i10 += a02;
                    }
                    break;
                case 66:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.R0(i12, a0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 67:
                    if (J(t4, i12, i7)) {
                        a02 = CodedOutputStream.T0(i12, b0(t4, j4));
                        i10 += a02;
                    }
                    break;
                case 68:
                    if (J(t4, i12, i7)) {
                        p4 = CodedOutputStream.t0(i12, (i2) unsafe.getObject(t4, j4), v(i7));
                        i10 += p4;
                    }
                    break;
            }
            i7 += 3;
            i6 = i14;
        }
        int A2 = i10 + A(this.f28798o, t4);
        return this.f28789f ? A2 + this.f28799p.c(t4).z() : A2;
    }

    private <K, V> void y0(v4 v4Var, int i4, Object obj, int i5) throws IOException {
        if (obj != null) {
            v4Var.s(i4, this.f28800q.b(u(i5)), this.f28800q.e(obj));
        }
    }

    private int z(T t4) {
        int i02;
        int g02;
        int p4;
        Unsafe unsafe = f28783z;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f28784a.length; i5 += 3) {
            int u02 = u0(i5);
            int t02 = t0(u02);
            int i6 = this.f28784a[i5];
            long j4 = u02 & f28777t;
            int i7 = (t02 < d1.DOUBLE_LIST_PACKED.id() || t02 > d1.SINT64_LIST_PACKED.id()) ? 0 : this.f28784a[i5 + 2] & f28777t;
            switch (t02) {
                case 0:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.i0(i6, p.f60679p);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.q0(i6, 0.0f);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.y0(i6, p4.L(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.a1(i6, p4.L(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.w0(i6, p4.I(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.o0(i6, 0L);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.m0(i6, 0);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.a0(i6, true);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (D(t4, i5)) {
                        Object O = p4.O(t4, j4);
                        g02 = O instanceof w ? CodedOutputStream.g0(i6, (w) O) : CodedOutputStream.V0(i6, (String) O);
                        i4 = g02 + i4;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (D(t4, i5)) {
                        p4 = o3.p(i6, p4.O(t4, j4), v(i5));
                        i4 += p4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.g0(i6, (w) p4.O(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.Y0(i6, p4.I(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.k0(i6, p4.I(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.N0(i6, 0);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.P0(i6, 0L);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.R0(i6, p4.I(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (D(t4, i5)) {
                        i02 = CodedOutputStream.T0(i6, p4.L(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (D(t4, i5)) {
                        p4 = CodedOutputStream.t0(i6, (i2) p4.O(t4, j4), v(i5));
                        i4 += p4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    p4 = o3.h(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 19:
                    p4 = o3.f(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 20:
                    p4 = o3.n(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 21:
                    p4 = o3.z(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 22:
                    p4 = o3.l(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 23:
                    p4 = o3.h(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 24:
                    p4 = o3.f(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 25:
                    p4 = o3.a(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 26:
                    p4 = o3.w(i6, (List) p4.O(t4, j4));
                    i4 += p4;
                    break;
                case 27:
                    p4 = o3.r(i6, (List) p4.O(t4, j4), v(i5));
                    i4 += p4;
                    break;
                case 28:
                    p4 = o3.c(i6, (List) p4.O(t4, j4));
                    i4 += p4;
                    break;
                case 29:
                    p4 = o3.x(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 30:
                    p4 = o3.d(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 31:
                    p4 = o3.f(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 32:
                    p4 = o3.h(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 33:
                    p4 = o3.s(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 34:
                    p4 = o3.u(i6, (List) p4.O(t4, j4), false);
                    i4 += p4;
                    break;
                case 35:
                    int i10 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, i10);
                        }
                        i4 = l2.a(i10, CodedOutputStream.X0(i6), i10, i4);
                        break;
                    }
                case 36:
                    int g4 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, g4);
                        }
                        i4 = l2.a(g4, CodedOutputStream.X0(i6), g4, i4);
                        break;
                    }
                case 37:
                    int o4 = o3.o((List) unsafe.getObject(t4, j4));
                    if (o4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, o4);
                        }
                        i4 = l2.a(o4, CodedOutputStream.X0(i6), o4, i4);
                        break;
                    }
                case 38:
                    int A = o3.A((List) unsafe.getObject(t4, j4));
                    if (A <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, A);
                        }
                        i4 = l2.a(A, CodedOutputStream.X0(i6), A, i4);
                        break;
                    }
                case 39:
                    int m4 = o3.m((List) unsafe.getObject(t4, j4));
                    if (m4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, m4);
                        }
                        i4 = l2.a(m4, CodedOutputStream.X0(i6), m4, i4);
                        break;
                    }
                case 40:
                    int i11 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, i11);
                        }
                        i4 = l2.a(i11, CodedOutputStream.X0(i6), i11, i4);
                        break;
                    }
                case 41:
                    int g5 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g5 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, g5);
                        }
                        i4 = l2.a(g5, CodedOutputStream.X0(i6), g5, i4);
                        break;
                    }
                case 42:
                    int b5 = o3.b((List) unsafe.getObject(t4, j4));
                    if (b5 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, b5);
                        }
                        i4 = l2.a(b5, CodedOutputStream.X0(i6), b5, i4);
                        break;
                    }
                case 43:
                    int y4 = o3.y((List) unsafe.getObject(t4, j4));
                    if (y4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, y4);
                        }
                        i4 = l2.a(y4, CodedOutputStream.X0(i6), y4, i4);
                        break;
                    }
                case 44:
                    int e4 = o3.e((List) unsafe.getObject(t4, j4));
                    if (e4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, e4);
                        }
                        i4 = l2.a(e4, CodedOutputStream.X0(i6), e4, i4);
                        break;
                    }
                case 45:
                    int g6 = o3.g((List) unsafe.getObject(t4, j4));
                    if (g6 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, g6);
                        }
                        i4 = l2.a(g6, CodedOutputStream.X0(i6), g6, i4);
                        break;
                    }
                case 46:
                    int i12 = o3.i((List) unsafe.getObject(t4, j4));
                    if (i12 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, i12);
                        }
                        i4 = l2.a(i12, CodedOutputStream.X0(i6), i12, i4);
                        break;
                    }
                case 47:
                    int t5 = o3.t((List) unsafe.getObject(t4, j4));
                    if (t5 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, t5);
                        }
                        i4 = l2.a(t5, CodedOutputStream.X0(i6), t5, i4);
                        break;
                    }
                case 48:
                    int v4 = o3.v((List) unsafe.getObject(t4, j4));
                    if (v4 <= 0) {
                        break;
                    } else {
                        if (this.f28792i) {
                            unsafe.putInt(t4, i7, v4);
                        }
                        i4 = l2.a(v4, CodedOutputStream.X0(i6), v4, i4);
                        break;
                    }
                case 49:
                    p4 = o3.k(i6, (List) p4.O(t4, j4), v(i5));
                    i4 += p4;
                    break;
                case 50:
                    p4 = this.f28800q.g(i6, p4.O(t4, j4), u(i5));
                    i4 += p4;
                    break;
                case 51:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.i0(i6, p.f60679p);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.q0(i6, 0.0f);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.y0(i6, b0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.a1(i6, b0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.w0(i6, a0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.o0(i6, 0L);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.m0(i6, 0);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.a0(i6, true);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t4, i6, i5)) {
                        Object O2 = p4.O(t4, j4);
                        g02 = O2 instanceof w ? CodedOutputStream.g0(i6, (w) O2) : CodedOutputStream.V0(i6, (String) O2);
                        i4 = g02 + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t4, i6, i5)) {
                        p4 = o3.p(i6, p4.O(t4, j4), v(i5));
                        i4 += p4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.g0(i6, (w) p4.O(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.Y0(i6, a0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.k0(i6, a0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.N0(i6, 0);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.P0(i6, 0L);
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.R0(i6, a0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t4, i6, i5)) {
                        i02 = CodedOutputStream.T0(i6, b0(t4, j4));
                        i4 += i02;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t4, i6, i5)) {
                        p4 = CodedOutputStream.t0(i6, (i2) p4.O(t4, j4), v(i5));
                        i4 += p4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i4 + A(this.f28798o, t4);
    }

    private void z0(int i4, Object obj, v4 v4Var) throws IOException {
        if (obj instanceof String) {
            v4Var.g(i4, (String) obj);
        } else {
            v4Var.k(i4, (w) obj);
        }
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void a(T t4, T t5) {
        t5.getClass();
        for (int i4 = 0; i4 < this.f28784a.length; i4 += 3) {
            R(t4, t5, i4);
        }
        if (this.f28791h) {
            return;
        }
        o3.J(this.f28798o, t4, t5);
        if (this.f28789f) {
            o3.H(this.f28799p, t4, t5);
        }
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void b(T t4, k3 k3Var, s0 s0Var) throws IOException {
        s0Var.getClass();
        N(this.f28798o, this.f28799p, t4, k3Var, s0Var);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void c(T t4) {
        int i4;
        int i5 = this.f28794k;
        while (true) {
            i4 = this.f28795l;
            if (i5 >= i4) {
                break;
            }
            long u02 = u0(this.f28793j[i5]) & f28777t;
            Object O = p4.O(t4, u02);
            if (O != null) {
                p4.q0(t4, u02, this.f28800q.f(O));
            }
            i5++;
        }
        int length = this.f28793j.length;
        while (i4 < length) {
            this.f28797n.c(t4, this.f28793j[i4]);
            i4++;
        }
        this.f28798o.j(t4);
        if (this.f28789f) {
            this.f28799p.f(t4);
        }
    }

    @Override // androidx.content.preferences.protobuf.m3
    public final boolean d(T t4) {
        int i4;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f28794k; i7++) {
            int i10 = this.f28793j[i7];
            int i11 = this.f28784a[i10];
            int u02 = u0(i10);
            if (this.f28791h) {
                i4 = 0;
            } else {
                int i12 = this.f28784a[i10 + 2];
                int i13 = f28777t & i12;
                i4 = 1 << (i12 >>> 20);
                if (i13 != i5) {
                    i6 = f28783z.getInt(t4, i13);
                    i5 = i13;
                }
            }
            if (K(u02) && !E(t4, i10, i6, i4)) {
                return false;
            }
            int t02 = t0(u02);
            if (t02 != 9 && t02 != 17) {
                if (t02 != 27) {
                    if (t02 == 60 || t02 == 68) {
                        if (J(t4, i11, i10) && !F(t4, u02, v(i10))) {
                            return false;
                        }
                    } else if (t02 != 49) {
                        if (t02 == 50 && !H(t4, u02, i10)) {
                            return false;
                        }
                    }
                }
                if (!G(t4, u02, i10)) {
                    return false;
                }
            } else if (E(t4, i10, i6, i4) && !F(t4, u02, v(i10))) {
                return false;
            }
        }
        return !this.f28789f || this.f28799p.c(t4).E();
    }

    @Override // androidx.content.preferences.protobuf.m3
    public int e(T t4) {
        return this.f28791h ? z(t4) : y(t4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0350, code lost:
    
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0352, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r18;
        r7 = r20;
        r6 = r21;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x036c, code lost:
    
        r2 = r0;
        r8 = r25;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a0, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c3, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int e0(T r30, byte[] r31, int r32, int r33, int r34, androidx.datastore.preferences.protobuf.l.b r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.n2.e0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    @Override // androidx.content.preferences.protobuf.m3
    public T f() {
        return (T) this.f28796m.a(this.f28788e);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public int g(T t4) {
        int i4;
        int s4;
        int i5;
        int I;
        int length = this.f28784a.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int u02 = u0(i7);
            int i10 = this.f28784a[i7];
            long j4 = f28777t & u02;
            int i11 = 37;
            switch (t0(u02)) {
                case 0:
                    i4 = i6 * 53;
                    s4 = p1.s(Double.doubleToLongBits(p4.D(t4, j4)));
                    i6 = s4 + i4;
                    break;
                case 1:
                    i4 = i6 * 53;
                    s4 = Float.floatToIntBits(p4.F(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 2:
                    i4 = i6 * 53;
                    s4 = p1.s(p4.L(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 3:
                    i4 = i6 * 53;
                    s4 = p1.s(p4.L(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 4:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 5:
                    i4 = i6 * 53;
                    s4 = p1.s(p4.L(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 6:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 7:
                    i4 = i6 * 53;
                    s4 = p1.k(p4.u(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 8:
                    i4 = i6 * 53;
                    s4 = ((String) p4.O(t4, j4)).hashCode();
                    i6 = s4 + i4;
                    break;
                case 9:
                    Object O = p4.O(t4, j4);
                    if (O != null) {
                        i11 = O.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 10:
                    i4 = i6 * 53;
                    s4 = p4.O(t4, j4).hashCode();
                    i6 = s4 + i4;
                    break;
                case 11:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 12:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 13:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 14:
                    i4 = i6 * 53;
                    s4 = p1.s(p4.L(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 15:
                    i5 = i6 * 53;
                    I = p4.I(t4, j4);
                    i6 = i5 + I;
                    break;
                case 16:
                    i4 = i6 * 53;
                    s4 = p1.s(p4.L(t4, j4));
                    i6 = s4 + i4;
                    break;
                case 17:
                    Object O2 = p4.O(t4, j4);
                    if (O2 != null) {
                        i11 = O2.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i6 * 53;
                    s4 = p4.O(t4, j4).hashCode();
                    i6 = s4 + i4;
                    break;
                case 50:
                    i4 = i6 * 53;
                    s4 = p4.O(t4, j4).hashCode();
                    i6 = s4 + i4;
                    break;
                case 51:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(Double.doubleToLongBits(Y(t4, j4)));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = Float.floatToIntBits(Z(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(b0(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(b0(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(b0(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.k(X(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = ((String) p4.O(t4, j4)).hashCode();
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p4.O(t4, j4).hashCode();
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p4.O(t4, j4).hashCode();
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(b0(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t4, i10, i7)) {
                        i5 = i6 * 53;
                        I = a0(t4, j4);
                        i6 = i5 + I;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p1.s(b0(t4, j4));
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t4, i10, i7)) {
                        i4 = i6 * 53;
                        s4 = p4.O(t4, j4).hashCode();
                        i6 = s4 + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f28798o.g(t4).hashCode() + (i6 * 53);
        return this.f28789f ? (hashCode * 53) + this.f28799p.c(t4).hashCode() : hashCode;
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void h(T t4, v4 v4Var) throws IOException {
        if (v4Var.z() == v4.a.DESCENDING) {
            x0(t4, v4Var);
        } else if (this.f28791h) {
            w0(t4, v4Var);
        } else {
            v0(t4, v4Var);
        }
    }

    @Override // androidx.content.preferences.protobuf.m3
    public boolean i(T t4, T t5) {
        int length = this.f28784a.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            if (!p(t4, t5, i4)) {
                return false;
            }
        }
        if (!this.f28798o.g(t4).equals(this.f28798o.g(t5))) {
            return false;
        }
        if (this.f28789f) {
            return this.f28799p.c(t4).equals(this.f28799p.c(t5));
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void j(T t4, byte[] bArr, int i4, int i5, l.b bVar) throws IOException {
        if (this.f28791h) {
            f0(t4, bArr, i4, i5, bVar);
        } else {
            e0(t4, bArr, i4, i5, 0, bVar);
        }
    }

    int x() {
        return this.f28784a.length * 3;
    }
}

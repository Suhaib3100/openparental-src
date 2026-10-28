package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import android.content.preferences.protobuf.l;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.s4;
import android.content.preferences.protobuf.w;
import androidx.appcompat.view.g;
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
final class k2<T> implements j3<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int f7289r = 3;

    /* renamed from: s, reason: collision with root package name */
    private static final int f7290s = 20;

    /* renamed from: t, reason: collision with root package name */
    private static final int f7291t = 1048575;

    /* renamed from: u, reason: collision with root package name */
    private static final int f7292u = 267386880;

    /* renamed from: v, reason: collision with root package name */
    private static final int f7293v = 268435456;

    /* renamed from: w, reason: collision with root package name */
    private static final int f7294w = 536870912;

    /* renamed from: y, reason: collision with root package name */
    static final int f7296y = 51;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f7298a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f7299b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7300c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7301d;

    /* renamed from: e, reason: collision with root package name */
    private final h2 f7302e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7303f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7304g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7305h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7306i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f7307j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7308k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7309l;

    /* renamed from: m, reason: collision with root package name */
    private final r2 f7310m;

    /* renamed from: n, reason: collision with root package name */
    private final v1 f7311n;

    /* renamed from: o, reason: collision with root package name */
    private final i4<?, ?> f7312o;

    /* renamed from: p, reason: collision with root package name */
    private final t0<?> f7313p;

    /* renamed from: q, reason: collision with root package name */
    private final c2 f7314q;

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f7295x = new int[0];

    /* renamed from: z, reason: collision with root package name */
    private static final Unsafe f7297z = m4.R();

    /* compiled from: MessageSchema.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7315a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7315a = iArr;
            try {
                iArr[q4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7315a[q4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7315a[q4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7315a[q4.b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7315a[q4.b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7315a[q4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7315a[q4.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7315a[q4.b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7315a[q4.b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7315a[q4.b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7315a[q4.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7315a[q4.b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7315a[q4.b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7315a[q4.b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7315a[q4.b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7315a[q4.b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7315a[q4.b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private k2(int[] iArr, Object[] objArr, int i5, int i6, h2 h2Var, boolean z5, boolean z6, int[] iArr2, int i7, int i8, r2 r2Var, v1 v1Var, i4<?, ?> i4Var, t0<?> t0Var, c2 c2Var) {
        this.f7298a = iArr;
        this.f7299b = objArr;
        this.f7300c = i5;
        this.f7301d = i6;
        this.f7304g = h2Var instanceof i1;
        this.f7305h = z5;
        this.f7303f = t0Var != null && t0Var.e(h2Var);
        this.f7306i = z6;
        this.f7307j = iArr2;
        this.f7308k = i7;
        this.f7309l = i8;
        this.f7310m = r2Var;
        this.f7311n = v1Var;
        this.f7312o = i4Var;
        this.f7313p = t0Var;
        this.f7302e = h2Var;
        this.f7314q = c2Var;
    }

    private <UT, UB> int A(i4<UT, UB> i4Var, T t5) {
        return i4Var.h(i4Var.g(t5));
    }

    private <UT, UB> void A0(i4<UT, UB> i4Var, T t5, s4 s4Var) throws IOException {
        i4Var.t(i4Var.g(t5), s4Var);
    }

    private static <T> int B(T t5, long j5) {
        return m4.I(t5, j5);
    }

    private static boolean C(int i5) {
        return (i5 & f7294w) != 0;
    }

    private boolean D(T t5, int i5) {
        if (!this.f7305h) {
            int j02 = j0(i5);
            return (m4.I(t5, (long) (j02 & f7291t)) & (1 << (j02 >>> 20))) != 0;
        }
        int u02 = u0(i5);
        long j5 = u02 & f7291t;
        switch ((u02 & f7292u) >>> 20) {
            case 0:
                return m4.D(t5, j5) != p.f18289o;
            case 1:
                return m4.F(t5, j5) != 0.0f;
            case 2:
                return m4.L(t5, j5) != 0;
            case 3:
                return m4.L(t5, j5) != 0;
            case 4:
                return m4.I(t5, j5) != 0;
            case 5:
                return m4.L(t5, j5) != 0;
            case 6:
                return m4.I(t5, j5) != 0;
            case 7:
                return m4.u(t5, j5);
            case 8:
                Object O = m4.O(t5, j5);
                if (O instanceof String) {
                    return !((String) O).isEmpty();
                }
                if (O instanceof w) {
                    return !w.f7553s.equals(O);
                }
                throw new IllegalArgumentException();
            case 9:
                return m4.O(t5, j5) != null;
            case 10:
                return !w.f7553s.equals(m4.O(t5, j5));
            case 11:
                return m4.I(t5, j5) != 0;
            case 12:
                return m4.I(t5, j5) != 0;
            case 13:
                return m4.I(t5, j5) != 0;
            case 14:
                return m4.L(t5, j5) != 0;
            case 15:
                return m4.I(t5, j5) != 0;
            case 16:
                return m4.L(t5, j5) != 0;
            case 17:
                return m4.O(t5, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean E(T t5, int i5, int i6, int i7) {
        return this.f7305h ? D(t5, i5) : (i6 & i7) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int i5, j3 j3Var) {
        return j3Var.d(m4.O(obj, i5 & f7291t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object obj, int i5, int i6) {
        List list = (List) m4.O(obj, i5 & f7291t);
        if (list.isEmpty()) {
            return true;
        }
        j3 v5 = v(i6);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!v5.d(list.get(i7))) {
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
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.datastore.preferences.protobuf.j3] */
    private boolean H(T t5, int i5, int i6) {
        Map<?, ?> h5 = this.f7314q.h(m4.O(t5, i5 & f7291t));
        if (h5.isEmpty()) {
            return true;
        }
        if (this.f7314q.c(u(i6)).f7179c.getJavaType() != q4.c.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (Object obj : h5.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = c3.a().i(obj.getClass());
            }
            if (!r5.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean I(T t5, T t6, int i5) {
        long j02 = j0(i5) & f7291t;
        return m4.I(t5, j02) == m4.I(t6, j02);
    }

    private boolean J(T t5, int i5, int i6) {
        return m4.I(t5, (long) (j0(i6) & f7291t)) == i5;
    }

    private static boolean K(int i5) {
        return (i5 & f7293v) != 0;
    }

    private static List<?> L(Object obj, long j5) {
        return (List) m4.O(obj, j5);
    }

    private static <T> long M(T t5, long j5) {
        return m4.L(t5, j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x0077, code lost:
    
        r0 = r16.f7308k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x007b, code lost:
    
        if (r0 >= r16.f7309l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x007d, code lost:
    
        r13 = q(r19, r16.f7307j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0088, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x008a, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.c1.c<ET>> void N(android.content.preferences.protobuf.i4<UT, UB> r17, android.content.preferences.protobuf.t0<ET> r18, T r19, android.content.preferences.protobuf.h3 r20, android.content.preferences.protobuf.s0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.N(androidx.datastore.preferences.protobuf.i4, androidx.datastore.preferences.protobuf.t0, java.lang.Object, androidx.datastore.preferences.protobuf.h3, androidx.datastore.preferences.protobuf.s0):void");
    }

    private final <K, V> void O(Object obj, int i5, Object obj2, s0 s0Var, h3 h3Var) throws IOException {
        long u02 = u0(i5) & f7291t;
        Object O = m4.O(obj, u02);
        if (O == null) {
            O = this.f7314q.e(obj2);
            m4.q0(obj, u02, O);
        } else if (this.f7314q.g(O)) {
            Object e6 = this.f7314q.e(obj2);
            this.f7314q.a(e6, O);
            m4.q0(obj, u02, e6);
            O = e6;
        }
        h3Var.v(this.f7314q.d(O), this.f7314q.c(obj2), s0Var);
    }

    private void P(T t5, T t6, int i5) {
        long u02 = u0(i5) & f7291t;
        if (D(t6, i5)) {
            Object O = m4.O(t5, u02);
            Object O2 = m4.O(t6, u02);
            if (O != null && O2 != null) {
                m4.q0(t5, u02, o1.v(O, O2));
                p0(t5, i5);
            } else if (O2 != null) {
                m4.q0(t5, u02, O2);
                p0(t5, i5);
            }
        }
    }

    private void Q(T t5, T t6, int i5) {
        int u02 = u0(i5);
        int i6 = this.f7298a[i5];
        long j5 = u02 & f7291t;
        if (J(t6, i6, i5)) {
            Object O = m4.O(t5, j5);
            Object O2 = m4.O(t6, j5);
            if (O != null && O2 != null) {
                m4.q0(t5, j5, o1.v(O, O2));
                q0(t5, i6, i5);
            } else if (O2 != null) {
                m4.q0(t5, j5, O2);
                q0(t5, i6, i5);
            }
        }
    }

    private void R(T t5, T t6, int i5) {
        int u02 = u0(i5);
        long j5 = f7291t & u02;
        int i6 = this.f7298a[i5];
        switch ((u02 & f7292u) >>> 20) {
            case 0:
                if (D(t6, i5)) {
                    m4.g0(t5, j5, m4.D(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 1:
                if (D(t6, i5)) {
                    m4.i0(t5, j5, m4.F(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 2:
                if (D(t6, i5)) {
                    m4.o0(t5, j5, m4.L(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 3:
                if (D(t6, i5)) {
                    m4.o0(t5, j5, m4.L(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 4:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 5:
                if (D(t6, i5)) {
                    m4.o0(t5, j5, m4.L(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 6:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 7:
                if (D(t6, i5)) {
                    m4.X(t5, j5, m4.u(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 8:
                if (D(t6, i5)) {
                    m4.q0(t5, j5, m4.O(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 9:
                P(t5, t6, i5);
                break;
            case 10:
                if (D(t6, i5)) {
                    m4.q0(t5, j5, m4.O(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 11:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 12:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 13:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 14:
                if (D(t6, i5)) {
                    m4.o0(t5, j5, m4.L(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 15:
                if (D(t6, i5)) {
                    m4.l0(t5, j5, m4.I(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 16:
                if (D(t6, i5)) {
                    m4.o0(t5, j5, m4.L(t6, j5));
                    p0(t5, i5);
                    break;
                }
                break;
            case 17:
                P(t5, t6, i5);
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
                this.f7311n.d(t5, t6, j5);
                break;
            case 50:
                l3.I(this.f7314q, t5, t6, j5);
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
                if (J(t6, i6, i5)) {
                    m4.q0(t5, j5, m4.O(t6, j5));
                    q0(t5, i6, i5);
                    break;
                }
                break;
            case 60:
                Q(t5, t6, i5);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t6, i6, i5)) {
                    m4.q0(t5, j5, m4.O(t6, j5));
                    q0(t5, i6, i5);
                    break;
                }
                break;
            case 68:
                Q(t5, t6, i5);
                break;
        }
    }

    static <T> k2<T> S(Class<T> cls, f2 f2Var, r2 r2Var, v1 v1Var, i4<?, ?> i4Var, t0<?> t0Var, c2 c2Var) {
        return f2Var instanceof g3 ? U((g3) f2Var, r2Var, v1Var, i4Var, t0Var, c2Var) : T((v3) f2Var, r2Var, v1Var, i4Var, t0Var, c2Var);
    }

    static <T> k2<T> T(v3 v3Var, r2 r2Var, v1 v1Var, i4<?, ?> i4Var, t0<?> t0Var, c2 c2Var) {
        int y5;
        int y6;
        int i5;
        boolean z5 = v3Var.e() == b3.PROTO3;
        x0[] d6 = v3Var.d();
        if (d6.length == 0) {
            y5 = 0;
            y6 = 0;
        } else {
            y5 = d6[0].y();
            y6 = d6[d6.length - 1].y();
        }
        int length = d6.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i6 = 0;
        int i7 = 0;
        for (x0 x0Var : d6) {
            if (x0Var.G() == d1.MAP) {
                i6++;
            } else if (x0Var.G().id() >= 18 && x0Var.G().id() <= 49) {
                i7++;
            }
        }
        int[] iArr2 = i6 > 0 ? new int[i6] : null;
        int[] iArr3 = i7 > 0 ? new int[i7] : null;
        int[] c6 = v3Var.c();
        if (c6 == null) {
            c6 = f7295x;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i8 < d6.length) {
            x0 x0Var2 = d6[i8];
            int y7 = x0Var2.y();
            s0(x0Var2, iArr, i9, z5, objArr);
            if (i10 < c6.length && c6[i10] == y7) {
                c6[i10] = i9;
                i10++;
            }
            if (x0Var2.G() == d1.MAP) {
                iArr2[i11] = i9;
                i11++;
            } else if (x0Var2.G().id() >= 18 && x0Var2.G().id() <= 49) {
                i5 = i9;
                iArr3[i12] = (int) m4.W(x0Var2.x());
                i12++;
                i8++;
                i9 = i5 + 3;
            }
            i5 = i9;
            i8++;
            i9 = i5 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f7295x;
        }
        if (iArr3 == null) {
            iArr3 = f7295x;
        }
        int[] iArr4 = new int[c6.length + iArr2.length + iArr3.length];
        System.arraycopy(c6, 0, iArr4, 0, c6.length);
        System.arraycopy(iArr2, 0, iArr4, c6.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, c6.length + iArr2.length, iArr3.length);
        return new k2<>(iArr, objArr, y5, y6, v3Var.b(), z5, true, iArr4, c6.length, c6.length + iArr2.length, r2Var, v1Var, i4Var, t0Var, c2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> android.content.preferences.protobuf.k2<T> U(android.content.preferences.protobuf.g3 r36, android.content.preferences.protobuf.r2 r37, android.content.preferences.protobuf.v1 r38, android.content.preferences.protobuf.i4<?, ?> r39, android.content.preferences.protobuf.t0<?> r40, android.content.preferences.protobuf.c2 r41) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.U(androidx.datastore.preferences.protobuf.g3, androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.v1, androidx.datastore.preferences.protobuf.i4, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.c2):androidx.datastore.preferences.protobuf.k2");
    }

    private int V(int i5) {
        return this.f7298a[i5];
    }

    private static long W(int i5) {
        return i5 & f7291t;
    }

    private static <T> boolean X(T t5, long j5) {
        return ((Boolean) m4.O(t5, j5)).booleanValue();
    }

    private static <T> double Y(T t5, long j5) {
        return ((Double) m4.O(t5, j5)).doubleValue();
    }

    private static <T> float Z(T t5, long j5) {
        return ((Float) m4.O(t5, j5)).floatValue();
    }

    private static <T> int a0(T t5, long j5) {
        return ((Integer) m4.O(t5, j5)).intValue();
    }

    private static <T> long b0(T t5, long j5) {
        return ((Long) m4.O(t5, j5)).longValue();
    }

    private <K, V> int c0(T t5, byte[] bArr, int i5, int i6, int i7, long j5, l.b bVar) throws IOException {
        Unsafe unsafe = f7297z;
        Object u5 = u(i7);
        Object object = unsafe.getObject(t5, j5);
        if (this.f7314q.g(object)) {
            Object e6 = this.f7314q.e(u5);
            this.f7314q.a(e6, object);
            unsafe.putObject(t5, j5, e6);
            object = e6;
        }
        return m(bArr, i5, i6, this.f7314q.c(u5), this.f7314q.d(object), bVar);
    }

    private int d0(T t5, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j5, int i12, l.b bVar) throws IOException {
        Unsafe unsafe = f7297z;
        long j6 = this.f7298a[i12 + 2] & f7291t;
        switch (i11) {
            case 51:
                if (i9 == 1) {
                    unsafe.putObject(t5, j5, Double.valueOf(l.d(bArr, i5)));
                    int i13 = i5 + 8;
                    unsafe.putInt(t5, j6, i8);
                    return i13;
                }
                break;
            case 52:
                if (i9 == 5) {
                    unsafe.putObject(t5, j5, Float.valueOf(l.l(bArr, i5)));
                    int i14 = i5 + 4;
                    unsafe.putInt(t5, j6, i8);
                    return i14;
                }
                break;
            case 53:
            case 54:
                if (i9 == 0) {
                    int L = l.L(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, Long.valueOf(bVar.f7318b));
                    unsafe.putInt(t5, j6, i8);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i9 == 0) {
                    int I = l.I(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, Integer.valueOf(bVar.f7317a));
                    unsafe.putInt(t5, j6, i8);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i9 == 1) {
                    unsafe.putObject(t5, j5, Long.valueOf(l.j(bArr, i5)));
                    int i15 = i5 + 8;
                    unsafe.putInt(t5, j6, i8);
                    return i15;
                }
                break;
            case 57:
            case 64:
                if (i9 == 5) {
                    unsafe.putObject(t5, j5, Integer.valueOf(l.h(bArr, i5)));
                    int i16 = i5 + 4;
                    unsafe.putInt(t5, j6, i8);
                    return i16;
                }
                break;
            case 58:
                if (i9 == 0) {
                    int L2 = l.L(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, Boolean.valueOf(bVar.f7318b != 0));
                    unsafe.putInt(t5, j6, i8);
                    return L2;
                }
                break;
            case 59:
                if (i9 == 2) {
                    int I2 = l.I(bArr, i5, bVar);
                    int i17 = bVar.f7317a;
                    if (i17 == 0) {
                        unsafe.putObject(t5, j5, "");
                    } else {
                        if ((i10 & f7294w) != 0 && !n4.u(bArr, I2, I2 + i17)) {
                            throw InvalidProtocolBufferException.d();
                        }
                        unsafe.putObject(t5, j5, new String(bArr, I2, i17, o1.f7439a));
                        I2 += i17;
                    }
                    unsafe.putInt(t5, j6, i8);
                    return I2;
                }
                break;
            case 60:
                if (i9 == 2) {
                    int p5 = l.p(v(i12), bArr, i5, i6, bVar);
                    Object object = unsafe.getInt(t5, j6) == i8 ? unsafe.getObject(t5, j5) : null;
                    if (object == null) {
                        unsafe.putObject(t5, j5, bVar.f7319c);
                    } else {
                        unsafe.putObject(t5, j5, o1.v(object, bVar.f7319c));
                    }
                    unsafe.putInt(t5, j6, i8);
                    return p5;
                }
                break;
            case 61:
                if (i9 == 2) {
                    int b6 = l.b(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, bVar.f7319c);
                    unsafe.putInt(t5, j6, i8);
                    return b6;
                }
                break;
            case 63:
                if (i9 == 0) {
                    int I3 = l.I(bArr, i5, bVar);
                    int i18 = bVar.f7317a;
                    o1.e t6 = t(i12);
                    if (t6 == null || t6.a(i18)) {
                        unsafe.putObject(t5, j5, Integer.valueOf(i18));
                        unsafe.putInt(t5, j6, i8);
                    } else {
                        w(t5).r(i7, Long.valueOf(i18));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i9 == 0) {
                    int I4 = l.I(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, Integer.valueOf(z.b(bVar.f7317a)));
                    unsafe.putInt(t5, j6, i8);
                    return I4;
                }
                break;
            case 67:
                if (i9 == 0) {
                    int L3 = l.L(bArr, i5, bVar);
                    unsafe.putObject(t5, j5, Long.valueOf(z.c(bVar.f7318b)));
                    unsafe.putInt(t5, j6, i8);
                    return L3;
                }
                break;
            case 68:
                if (i9 == 3) {
                    int n5 = l.n(v(i12), bArr, i5, i6, (i7 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t5, j6) == i8 ? unsafe.getObject(t5, j5) : null;
                    if (object2 == null) {
                        unsafe.putObject(t5, j5, bVar.f7319c);
                    } else {
                        unsafe.putObject(t5, j5, o1.v(object2, bVar.f7319c));
                    }
                    unsafe.putInt(t5, j6, i8);
                    return n5;
                }
                break;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020e, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x022d, code lost:
    
        if (r0 != r15) goto L106;
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
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.f0(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int g0(T t5, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, long j6, l.b bVar) throws IOException {
        int J;
        Unsafe unsafe = f7297z;
        o1.k kVar = (o1.k) unsafe.getObject(t5, j6);
        if (!kVar.m1()) {
            int size = kVar.size();
            kVar = kVar.a2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t5, j6, kVar);
        }
        switch (i11) {
            case 18:
            case 35:
                if (i9 == 2) {
                    return l.s(bArr, i5, kVar, bVar);
                }
                if (i9 == 1) {
                    return l.e(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i9 == 2) {
                    return l.v(bArr, i5, kVar, bVar);
                }
                if (i9 == 5) {
                    return l.m(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i9 == 2) {
                    return l.z(bArr, i5, kVar, bVar);
                }
                if (i9 == 0) {
                    return l.M(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i9 == 2) {
                    return l.y(bArr, i5, kVar, bVar);
                }
                if (i9 == 0) {
                    return l.J(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i9 == 2) {
                    return l.u(bArr, i5, kVar, bVar);
                }
                if (i9 == 1) {
                    return l.k(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i9 == 2) {
                    return l.t(bArr, i5, kVar, bVar);
                }
                if (i9 == 5) {
                    return l.i(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i9 == 2) {
                    return l.r(bArr, i5, kVar, bVar);
                }
                if (i9 == 0) {
                    return l.a(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 26:
                if (i9 == 2) {
                    return (j5 & 536870912) == 0 ? l.D(i7, bArr, i5, i6, kVar, bVar) : l.E(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 27:
                if (i9 == 2) {
                    return l.q(v(i10), i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 28:
                if (i9 == 2) {
                    return l.c(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i9 == 2) {
                    J = l.y(bArr, i5, kVar, bVar);
                } else if (i9 == 0) {
                    J = l.J(i7, bArr, i5, i6, kVar, bVar);
                }
                i1 i1Var = (i1) t5;
                j4 j4Var = i1Var.unknownFields;
                if (j4Var == j4.e()) {
                    j4Var = null;
                }
                j4 j4Var2 = (j4) l3.C(i8, kVar, t(i10), j4Var, this.f7312o);
                if (j4Var2 != null) {
                    i1Var.unknownFields = j4Var2;
                }
                return J;
            case 33:
            case 47:
                if (i9 == 2) {
                    return l.w(bArr, i5, kVar, bVar);
                }
                if (i9 == 0) {
                    return l.A(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i9 == 2) {
                    return l.x(bArr, i5, kVar, bVar);
                }
                if (i9 == 0) {
                    return l.B(i7, bArr, i5, i6, kVar, bVar);
                }
                break;
            case 49:
                if (i9 == 3) {
                    return l.o(v(i10), i7, bArr, i5, i6, kVar, bVar);
                }
                break;
        }
        return i5;
    }

    private int h0(int i5) {
        if (i5 < this.f7300c || i5 > this.f7301d) {
            return -1;
        }
        return r0(i5, 0);
    }

    private int i0(int i5, int i6) {
        if (i5 < this.f7300c || i5 > this.f7301d) {
            return -1;
        }
        return r0(i5, i6);
    }

    private int j0(int i5) {
        return this.f7298a[i5 + 2];
    }

    private boolean k(T t5, T t6, int i5) {
        return D(t5, i5) == D(t6, i5);
    }

    private <E> void k0(Object obj, long j5, h3 h3Var, j3<E> j3Var, s0 s0Var) throws IOException {
        h3Var.I(this.f7311n.e(obj, j5), j3Var, s0Var);
    }

    private static <T> boolean l(T t5, long j5) {
        return m4.u(t5, j5);
    }

    private <E> void l0(Object obj, int i5, h3 h3Var, j3<E> j3Var, s0 s0Var) throws IOException {
        h3Var.O(this.f7311n.e(obj, i5 & f7291t), j3Var, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int m(byte[] bArr, int i5, int i6, a2.b<K, V> bVar, Map<K, V> map, l.b bVar2) throws IOException {
        int i7;
        int I = l.I(bArr, i5, bVar2);
        int i8 = bVar2.f7317a;
        if (i8 < 0 || i8 > i6 - I) {
            throw InvalidProtocolBufferException.l();
        }
        int i9 = I + i8;
        Object obj = bVar.f7178b;
        Object obj2 = bVar.f7180d;
        while (I < i9) {
            int i10 = I + 1;
            byte b6 = bArr[I];
            if (b6 < 0) {
                i7 = l.H(b6, bArr, i10, bVar2);
                b6 = bVar2.f7317a;
            } else {
                i7 = i10;
            }
            int i11 = b6 >>> 3;
            int i12 = b6 & 7;
            if (i11 != 1) {
                if (i11 == 2 && i12 == bVar.f7179c.getWireType()) {
                    I = n(bArr, i7, i6, bVar.f7179c, bVar.f7180d.getClass(), bVar2);
                    obj2 = bVar2.f7319c;
                }
                I = l.N(b6, bArr, i7, i6, bVar2);
            } else if (i12 == bVar.f7177a.getWireType()) {
                I = n(bArr, i7, i6, bVar.f7177a, null, bVar2);
                obj = bVar2.f7319c;
            } else {
                I = l.N(b6, bArr, i7, i6, bVar2);
            }
        }
        if (I != i9) {
            throw InvalidProtocolBufferException.h();
        }
        map.put(obj, obj2);
        return i9;
    }

    private void m0(Object obj, int i5, h3 h3Var) throws IOException {
        if (C(i5)) {
            m4.q0(obj, i5 & f7291t, h3Var.Q());
        } else if (this.f7304g) {
            m4.q0(obj, i5 & f7291t, h3Var.B());
        } else {
            m4.q0(obj, i5 & f7291t, h3Var.F());
        }
    }

    private int n(byte[] bArr, int i5, int i6, q4.b bVar, Class<?> cls, l.b bVar2) throws IOException {
        switch (a.f7315a[bVar.ordinal()]) {
            case 1:
                int L = l.L(bArr, i5, bVar2);
                bVar2.f7319c = Boolean.valueOf(bVar2.f7318b != 0);
                return L;
            case 2:
                return l.b(bArr, i5, bVar2);
            case 3:
                bVar2.f7319c = Double.valueOf(l.d(bArr, i5));
                return i5 + 8;
            case 4:
            case 5:
                bVar2.f7319c = Integer.valueOf(l.h(bArr, i5));
                return i5 + 4;
            case 6:
            case 7:
                bVar2.f7319c = Long.valueOf(l.j(bArr, i5));
                return i5 + 8;
            case 8:
                bVar2.f7319c = Float.valueOf(l.l(bArr, i5));
                return i5 + 4;
            case 9:
            case 10:
            case 11:
                int I = l.I(bArr, i5, bVar2);
                bVar2.f7319c = Integer.valueOf(bVar2.f7317a);
                return I;
            case 12:
            case 13:
                int L2 = l.L(bArr, i5, bVar2);
                bVar2.f7319c = Long.valueOf(bVar2.f7318b);
                return L2;
            case 14:
                return l.p(c3.a().i(cls), bArr, i5, i6, bVar2);
            case 15:
                int I2 = l.I(bArr, i5, bVar2);
                bVar2.f7319c = Integer.valueOf(z.b(bVar2.f7317a));
                return I2;
            case 16:
                int L3 = l.L(bArr, i5, bVar2);
                bVar2.f7319c = Long.valueOf(z.c(bVar2.f7318b));
                return L3;
            case 17:
                return l.F(bArr, i5, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void n0(Object obj, int i5, h3 h3Var) throws IOException {
        if (C(i5)) {
            h3Var.E(this.f7311n.e(obj, i5 & f7291t));
        } else {
            h3Var.D(this.f7311n.e(obj, i5 & f7291t));
        }
    }

    private static <T> double o(T t5, long j5) {
        return m4.D(t5, j5);
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
            StringBuilder a6 = g.a("Field ", str, " for ");
            a6.append(cls.getName());
            a6.append(" not found. Known fields are ");
            a6.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a6.toString());
        }
    }

    private boolean p(T t5, T t6, int i5) {
        int u02 = u0(i5);
        long j5 = f7291t & u02;
        switch ((u02 & f7292u) >>> 20) {
            case 0:
                if (k(t5, t6, i5) && Double.doubleToLongBits(m4.D(t5, j5)) == Double.doubleToLongBits(m4.D(t6, j5))) {
                    break;
                }
                break;
            case 1:
                if (k(t5, t6, i5) && Float.floatToIntBits(m4.F(t5, j5)) == Float.floatToIntBits(m4.F(t6, j5))) {
                    break;
                }
                break;
            case 2:
                if (k(t5, t6, i5) && m4.L(t5, j5) == m4.L(t6, j5)) {
                    break;
                }
                break;
            case 3:
                if (k(t5, t6, i5) && m4.L(t5, j5) == m4.L(t6, j5)) {
                    break;
                }
                break;
            case 4:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 5:
                if (k(t5, t6, i5) && m4.L(t5, j5) == m4.L(t6, j5)) {
                    break;
                }
                break;
            case 6:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 7:
                if (k(t5, t6, i5) && m4.u(t5, j5) == m4.u(t6, j5)) {
                    break;
                }
                break;
            case 8:
                if (k(t5, t6, i5) && l3.N(m4.O(t5, j5), m4.O(t6, j5))) {
                    break;
                }
                break;
            case 9:
                if (k(t5, t6, i5) && l3.N(m4.O(t5, j5), m4.O(t6, j5))) {
                    break;
                }
                break;
            case 10:
                if (k(t5, t6, i5) && l3.N(m4.O(t5, j5), m4.O(t6, j5))) {
                    break;
                }
                break;
            case 11:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 12:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 13:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 14:
                if (k(t5, t6, i5) && m4.L(t5, j5) == m4.L(t6, j5)) {
                    break;
                }
                break;
            case 15:
                if (k(t5, t6, i5) && m4.I(t5, j5) == m4.I(t6, j5)) {
                    break;
                }
                break;
            case 16:
                if (k(t5, t6, i5) && m4.L(t5, j5) == m4.L(t6, j5)) {
                    break;
                }
                break;
            case 17:
                if (k(t5, t6, i5) && l3.N(m4.O(t5, j5), m4.O(t6, j5))) {
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
                if (I(t5, t6, i5) && l3.N(m4.O(t5, j5), m4.O(t6, j5))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void p0(T t5, int i5) {
        if (this.f7305h) {
            return;
        }
        int j02 = j0(i5);
        long j5 = j02 & f7291t;
        m4.l0(t5, j5, m4.I(t5, j5) | (1 << (j02 >>> 20)));
    }

    private final <UT, UB> UB q(Object obj, int i5, UB ub, i4<UT, UB> i4Var) {
        int i6 = this.f7298a[i5];
        Object O = m4.O(obj, u0(i5) & f7291t);
        if (O == null) {
            return ub;
        }
        o1.e t5 = t(i5);
        return t5 == null ? ub : (UB) r(i5, i6, this.f7314q.d(O), t5, ub, i4Var);
    }

    private void q0(T t5, int i5, int i6) {
        m4.l0(t5, j0(i6) & f7291t, i5);
    }

    private final <K, V, UT, UB> UB r(int i5, int i6, Map<K, V> map, o1.e eVar, UB ub, i4<UT, UB> i4Var) {
        a2.b<?, ?> c6 = this.f7314q.c(u(i5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = i4Var.n();
                }
                w.h N = w.N(a2.b(c6, next.getKey(), next.getValue()));
                try {
                    a2.l(N.b(), c6, next.getKey(), next.getValue());
                    i4Var.d(ub, i6, N.a());
                    it.remove();
                } catch (IOException e6) {
                    throw new RuntimeException(e6);
                }
            }
        }
        return ub;
    }

    private int r0(int i5, int i6) {
        int length = (this.f7298a.length / 3) - 1;
        while (i6 <= length) {
            int i7 = (length + i6) >>> 1;
            int i8 = i7 * 3;
            int i9 = this.f7298a[i8];
            if (i5 == i9) {
                return i8;
            }
            if (i5 < i9) {
                length = i7 - 1;
            } else {
                i6 = i7 + 1;
            }
        }
        return -1;
    }

    private static <T> float s(T t5, long j5) {
        return m4.F(t5, j5);
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
    private static void s0(android.content.preferences.protobuf.x0 r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            androidx.datastore.preferences.protobuf.w2 r0 = r8.C()
            r1 = 0
            if (r0 == 0) goto L27
            androidx.datastore.preferences.protobuf.d1 r11 = r8.G()
            int r11 = r11.id()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.c()
            long r2 = android.content.preferences.protobuf.m4.W(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.a()
            long r3 = android.content.preferences.protobuf.m4.W(r0)
            int r0 = (int) r3
        L23:
            r3 = r2
            r2 = r0
            r0 = r1
            goto L73
        L27:
            androidx.datastore.preferences.protobuf.d1 r0 = r8.G()
            java.lang.reflect.Field r2 = r8.x()
            long r2 = android.content.preferences.protobuf.m4.W(r2)
            int r2 = (int) r2
            int r3 = r0.id()
            if (r11 != 0) goto L5d
            boolean r11 = r0.isList()
            if (r11 != 0) goto L5d
            boolean r11 = r0.isMap()
            if (r11 != 0) goto L5d
            java.lang.reflect.Field r11 = r8.E()
            long r4 = android.content.preferences.protobuf.m4.W(r11)
            int r0 = (int) r4
            int r11 = r8.F()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r2
            r2 = r7
            goto L73
        L5d:
            java.lang.reflect.Field r11 = r8.v()
            if (r11 != 0) goto L68
            r0 = r1
            r11 = r3
            r3 = r2
            r2 = r0
            goto L73
        L68:
            java.lang.reflect.Field r11 = r8.v()
            long r4 = android.content.preferences.protobuf.m4.W(r11)
            int r0 = (int) r4
            r11 = r3
            goto L23
        L73:
            int r4 = r8.y()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.H()
            if (r5 == 0) goto L84
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L85
        L84:
            r5 = r1
        L85:
            boolean r6 = r8.J()
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
            java.lang.Class r9 = r8.B()
            java.lang.Object r11 = r8.A()
            if (r11 == 0) goto Lc5
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.A()
            r12[r10] = r11
            if (r9 == 0) goto Lb6
            int r10 = r10 + 1
            r12[r10] = r9
            goto Le2
        Lb6:
            androidx.datastore.preferences.protobuf.o1$e r9 = r8.w()
            if (r9 == 0) goto Le2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.o1$e r8 = r8.w()
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
            androidx.datastore.preferences.protobuf.o1$e r9 = r8.w()
            if (r9 == 0) goto Le2
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.o1$e r8 = r8.w()
            r12[r10] = r8
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.s0(androidx.datastore.preferences.protobuf.x0, int[], int, boolean, java.lang.Object[]):void");
    }

    private o1.e t(int i5) {
        return (o1.e) this.f7299b[((i5 / 3) * 2) + 1];
    }

    private static int t0(int i5) {
        return (i5 & f7292u) >>> 20;
    }

    private Object u(int i5) {
        return this.f7299b[(i5 / 3) * 2];
    }

    private int u0(int i5) {
        return this.f7298a[i5 + 1];
    }

    private j3 v(int i5) {
        int i6 = (i5 / 3) * 2;
        j3 j3Var = (j3) this.f7299b[i6];
        if (j3Var != null) {
            return j3Var;
        }
        j3<T> i7 = c3.a().i((Class) this.f7299b[i6 + 1]);
        this.f7299b[i6] = i7;
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(T r18, android.content.preferences.protobuf.s4 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.v0(java.lang.Object, androidx.datastore.preferences.protobuf.s4):void");
    }

    static j4 w(Object obj) {
        i1 i1Var = (i1) obj;
        j4 j4Var = i1Var.unknownFields;
        if (j4Var != j4.e()) {
            return j4Var;
        }
        j4 p5 = j4.p();
        i1Var.unknownFields = p5;
        return p5;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0(T r13, android.content.preferences.protobuf.s4 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.w0(java.lang.Object, androidx.datastore.preferences.protobuf.s4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x0(T r11, android.content.preferences.protobuf.s4 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.x0(java.lang.Object, androidx.datastore.preferences.protobuf.s4):void");
    }

    private int y(T t5) {
        int i5;
        int i6;
        int i02;
        int g02;
        int i7;
        int X0;
        int Z0;
        Unsafe unsafe = f7297z;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7298a.length; i11 += 3) {
            int u02 = u0(i11);
            int[] iArr = this.f7298a;
            int i12 = iArr[i11];
            int i13 = (f7292u & u02) >>> 20;
            if (i13 <= 17) {
                i5 = iArr[i11 + 2];
                int i14 = i5 & f7291t;
                i6 = 1 << (i5 >>> 20);
                if (i14 != i8) {
                    i10 = unsafe.getInt(t5, i14);
                    i8 = i14;
                }
            } else {
                i5 = (!this.f7306i || i13 < d1.DOUBLE_LIST_PACKED.id() || i13 > d1.SINT64_LIST_PACKED.id()) ? 0 : this.f7298a[i11 + 2] & f7291t;
                i6 = 0;
            }
            long j5 = u02 & f7291t;
            int i15 = i5;
            switch (i13) {
                case 0:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.i0(i12, p.f18289o);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.q0(i12, 0.0f);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.y0(i12, unsafe.getLong(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.a1(i12, unsafe.getLong(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.w0(i12, unsafe.getInt(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.o0(i12, 0L);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.m0(i12, 0);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.a0(i12, true);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i6) != 0) {
                        Object object = unsafe.getObject(t5, j5);
                        g02 = object instanceof w ? CodedOutputStream.g0(i12, (w) object) : CodedOutputStream.V0(i12, (String) object);
                        i9 += g02;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i10 & i6) != 0) {
                        i02 = l3.p(i12, unsafe.getObject(t5, j5), v(i11));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.g0(i12, (w) unsafe.getObject(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.Y0(i12, unsafe.getInt(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.k0(i12, unsafe.getInt(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.N0(i12, 0);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.P0(i12, 0L);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.R0(i12, unsafe.getInt(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.T0(i12, unsafe.getLong(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i6) != 0) {
                        i02 = CodedOutputStream.t0(i12, (h2) unsafe.getObject(t5, j5), v(i11));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i02 = l3.h(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 19:
                    i02 = l3.f(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 20:
                    i02 = l3.n(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 21:
                    i02 = l3.z(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 22:
                    i02 = l3.l(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 23:
                    i02 = l3.h(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 24:
                    i02 = l3.f(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 25:
                    i02 = l3.a(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 26:
                    i02 = l3.w(i12, (List) unsafe.getObject(t5, j5));
                    i9 += i02;
                    break;
                case 27:
                    i02 = l3.r(i12, (List) unsafe.getObject(t5, j5), v(i11));
                    i9 += i02;
                    break;
                case 28:
                    i02 = l3.c(i12, (List) unsafe.getObject(t5, j5));
                    i9 += i02;
                    break;
                case 29:
                    i02 = l3.x(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 30:
                    i02 = l3.d(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 31:
                    i02 = l3.f(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 32:
                    i02 = l3.h(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 33:
                    i02 = l3.s(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 34:
                    i02 = l3.u(i12, (List) unsafe.getObject(t5, j5), false);
                    i9 += i02;
                    break;
                case 35:
                    i7 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 36:
                    i7 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 37:
                    i7 = l3.o((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 38:
                    i7 = l3.A((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 39:
                    i7 = l3.m((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 40:
                    i7 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 41:
                    i7 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 42:
                    i7 = l3.b((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 43:
                    i7 = l3.y((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 44:
                    i7 = l3.e((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 45:
                    i7 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 46:
                    i7 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 47:
                    i7 = l3.t((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 48:
                    i7 = l3.v((List) unsafe.getObject(t5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i15, i7);
                        }
                        X0 = CodedOutputStream.X0(i12);
                        Z0 = CodedOutputStream.Z0(i7);
                        i9 += Z0 + X0 + i7;
                        break;
                    }
                case 49:
                    i02 = l3.k(i12, (List) unsafe.getObject(t5, j5), v(i11));
                    i9 += i02;
                    break;
                case 50:
                    i02 = this.f7314q.f(i12, unsafe.getObject(t5, j5), u(i11));
                    i9 += i02;
                    break;
                case 51:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.i0(i12, p.f18289o);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.q0(i12, 0.0f);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.y0(i12, b0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.a1(i12, b0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.w0(i12, a0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.o0(i12, 0L);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.m0(i12, 0);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.a0(i12, true);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t5, i12, i11)) {
                        Object object2 = unsafe.getObject(t5, j5);
                        g02 = object2 instanceof w ? CodedOutputStream.g0(i12, (w) object2) : CodedOutputStream.V0(i12, (String) object2);
                        i9 += g02;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t5, i12, i11)) {
                        i02 = l3.p(i12, unsafe.getObject(t5, j5), v(i11));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.g0(i12, (w) unsafe.getObject(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.Y0(i12, a0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.k0(i12, a0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.N0(i12, 0);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.P0(i12, 0L);
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.R0(i12, a0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.T0(i12, b0(t5, j5));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t5, i12, i11)) {
                        i02 = CodedOutputStream.t0(i12, (h2) unsafe.getObject(t5, j5), v(i11));
                        i9 += i02;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int A = i9 + A(this.f7312o, t5);
        return this.f7303f ? A + this.f7313p.c(t5).z() : A;
    }

    private <K, V> void y0(s4 s4Var, int i5, Object obj, int i6) throws IOException {
        if (obj != null) {
            s4Var.P(i5, this.f7314q.c(u(i6)), this.f7314q.h(obj));
        }
    }

    private int z(T t5) {
        int i02;
        int g02;
        int i5;
        int X0;
        int Z0;
        Unsafe unsafe = f7297z;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f7298a.length; i7 += 3) {
            int u02 = u0(i7);
            int i8 = (f7292u & u02) >>> 20;
            int i9 = this.f7298a[i7];
            long j5 = u02 & f7291t;
            int i10 = (i8 < d1.DOUBLE_LIST_PACKED.id() || i8 > d1.SINT64_LIST_PACKED.id()) ? 0 : this.f7298a[i7 + 2] & f7291t;
            switch (i8) {
                case 0:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.i0(i9, p.f18289o);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.q0(i9, 0.0f);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.y0(i9, m4.L(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.a1(i9, m4.L(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.w0(i9, m4.I(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.o0(i9, 0L);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.m0(i9, 0);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.a0(i9, true);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (D(t5, i7)) {
                        Object O = m4.O(t5, j5);
                        g02 = O instanceof w ? CodedOutputStream.g0(i9, (w) O) : CodedOutputStream.V0(i9, (String) O);
                        i6 += g02;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (D(t5, i7)) {
                        i02 = l3.p(i9, m4.O(t5, j5), v(i7));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.g0(i9, (w) m4.O(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.Y0(i9, m4.I(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.k0(i9, m4.I(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.N0(i9, 0);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.P0(i9, 0L);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.R0(i9, m4.I(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.T0(i9, m4.L(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (D(t5, i7)) {
                        i02 = CodedOutputStream.t0(i9, (h2) m4.O(t5, j5), v(i7));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i02 = l3.h(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 19:
                    i02 = l3.f(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 20:
                    i02 = l3.n(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 21:
                    i02 = l3.z(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 22:
                    i02 = l3.l(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 23:
                    i02 = l3.h(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 24:
                    i02 = l3.f(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 25:
                    i02 = l3.a(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 26:
                    i02 = l3.w(i9, L(t5, j5));
                    i6 += i02;
                    break;
                case 27:
                    i02 = l3.r(i9, L(t5, j5), v(i7));
                    i6 += i02;
                    break;
                case 28:
                    i02 = l3.c(i9, L(t5, j5));
                    i6 += i02;
                    break;
                case 29:
                    i02 = l3.x(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 30:
                    i02 = l3.d(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 31:
                    i02 = l3.f(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 32:
                    i02 = l3.h(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 33:
                    i02 = l3.s(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 34:
                    i02 = l3.u(i9, L(t5, j5), false);
                    i6 += i02;
                    break;
                case 35:
                    i5 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 36:
                    i5 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 37:
                    i5 = l3.o((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 38:
                    i5 = l3.A((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 39:
                    i5 = l3.m((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 40:
                    i5 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 41:
                    i5 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 42:
                    i5 = l3.b((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 43:
                    i5 = l3.y((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 44:
                    i5 = l3.e((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 45:
                    i5 = l3.g((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 46:
                    i5 = l3.i((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 47:
                    i5 = l3.t((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 48:
                    i5 = l3.v((List) unsafe.getObject(t5, j5));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f7306i) {
                            unsafe.putInt(t5, i10, i5);
                        }
                        X0 = CodedOutputStream.X0(i9);
                        Z0 = CodedOutputStream.Z0(i5);
                        i6 += Z0 + X0 + i5;
                        break;
                    }
                case 49:
                    i02 = l3.k(i9, L(t5, j5), v(i7));
                    i6 += i02;
                    break;
                case 50:
                    i02 = this.f7314q.f(i9, m4.O(t5, j5), u(i7));
                    i6 += i02;
                    break;
                case 51:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.i0(i9, p.f18289o);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.q0(i9, 0.0f);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.y0(i9, b0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.a1(i9, b0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.w0(i9, a0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.o0(i9, 0L);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.m0(i9, 0);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.a0(i9, true);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t5, i9, i7)) {
                        Object O2 = m4.O(t5, j5);
                        g02 = O2 instanceof w ? CodedOutputStream.g0(i9, (w) O2) : CodedOutputStream.V0(i9, (String) O2);
                        i6 += g02;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t5, i9, i7)) {
                        i02 = l3.p(i9, m4.O(t5, j5), v(i7));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.g0(i9, (w) m4.O(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.Y0(i9, a0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.k0(i9, a0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.N0(i9, 0);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.P0(i9, 0L);
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.R0(i9, a0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.T0(i9, b0(t5, j5));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t5, i9, i7)) {
                        i02 = CodedOutputStream.t0(i9, (h2) m4.O(t5, j5), v(i7));
                        i6 += i02;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i6 + A(this.f7312o, t5);
    }

    private void z0(int i5, Object obj, s4 s4Var) throws IOException {
        if (obj instanceof String) {
            s4Var.o(i5, (String) obj);
        } else {
            s4Var.z(i5, (w) obj);
        }
    }

    @Override // android.content.preferences.protobuf.j3
    public void a(T t5, T t6) {
        t6.getClass();
        for (int i5 = 0; i5 < this.f7298a.length; i5 += 3) {
            R(t5, t6, i5);
        }
        if (this.f7305h) {
            return;
        }
        l3.J(this.f7312o, t5, t6);
        if (this.f7303f) {
            l3.H(this.f7313p, t5, t6);
        }
    }

    @Override // android.content.preferences.protobuf.j3
    public void b(T t5, h3 h3Var, s0 s0Var) throws IOException {
        s0Var.getClass();
        N(this.f7312o, this.f7313p, t5, h3Var, s0Var);
    }

    @Override // android.content.preferences.protobuf.j3
    public void c(T t5) {
        int i5;
        int i6 = this.f7308k;
        while (true) {
            i5 = this.f7309l;
            if (i6 >= i5) {
                break;
            }
            long u02 = u0(this.f7307j[i6]) & f7291t;
            Object O = m4.O(t5, u02);
            if (O != null) {
                m4.q0(t5, u02, this.f7314q.b(O));
            }
            i6++;
        }
        int length = this.f7307j.length;
        while (i5 < length) {
            this.f7311n.c(t5, this.f7307j[i5]);
            i5++;
        }
        this.f7312o.j(t5);
        if (this.f7303f) {
            this.f7313p.f(t5);
        }
    }

    @Override // android.content.preferences.protobuf.j3
    public final boolean d(T t5) {
        int i5;
        int i6 = -1;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f7308k; i8++) {
            int i9 = this.f7307j[i8];
            int i10 = this.f7298a[i9];
            int u02 = u0(i9);
            if (this.f7305h) {
                i5 = 0;
            } else {
                int i11 = this.f7298a[i9 + 2];
                int i12 = f7291t & i11;
                i5 = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i7 = f7297z.getInt(t5, i12);
                    i6 = i12;
                }
            }
            if (K(u02) && !E(t5, i9, i7, i5)) {
                return false;
            }
            int i13 = (f7292u & u02) >>> 20;
            if (i13 != 9 && i13 != 17) {
                if (i13 != 27) {
                    if (i13 == 60 || i13 == 68) {
                        if (J(t5, i10, i9) && !F(t5, u02, v(i9))) {
                            return false;
                        }
                    } else if (i13 != 49) {
                        if (i13 == 50 && !H(t5, u02, i9)) {
                            return false;
                        }
                    }
                }
                if (!G(t5, u02, i9)) {
                    return false;
                }
            } else if (E(t5, i9, i7, i5) && !F(t5, u02, v(i9))) {
                return false;
            }
        }
        return !this.f7303f || this.f7313p.c(t5).E();
    }

    @Override // android.content.preferences.protobuf.j3
    public void e(T t5, s4 s4Var) throws IOException {
        if (s4Var.j() == s4.a.DESCENDING) {
            x0(t5, s4Var);
        } else if (this.f7305h) {
            w0(t5, s4Var);
        } else {
            v0(t5, s4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x034c, code lost:
    
        if (r0 != r13) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x034e, code lost:
    
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r6 = r17;
        r1 = r18;
        r2 = r19;
        r7 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03ba, code lost:
    
        r2 = r0;
        r8 = r25;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0393, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03b7, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0084. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int e0(T r28, byte[] r29, int r30, int r31, int r32, androidx.datastore.preferences.protobuf.l.b r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.k2.e0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    @Override // android.content.preferences.protobuf.j3
    public boolean f(T t5, T t6) {
        int length = this.f7298a.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            if (!p(t5, t6, i5)) {
                return false;
            }
        }
        if (!this.f7312o.g(t5).equals(this.f7312o.g(t6))) {
            return false;
        }
        if (this.f7303f) {
            return this.f7313p.c(t5).equals(this.f7313p.c(t6));
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.j3
    public int g(T t5) {
        return this.f7305h ? z(t5) : y(t5);
    }

    @Override // android.content.preferences.protobuf.j3
    public T h() {
        return (T) this.f7310m.a(this.f7302e);
    }

    @Override // android.content.preferences.protobuf.j3
    public void i(T t5, byte[] bArr, int i5, int i6, l.b bVar) throws IOException {
        if (this.f7305h) {
            f0(t5, bArr, i5, i6, bVar);
        } else {
            e0(t5, bArr, i5, i6, 0, bVar);
        }
    }

    @Override // android.content.preferences.protobuf.j3
    public int j(T t5) {
        int i5;
        int s5;
        int i6;
        int I;
        int length = this.f7298a.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int u02 = u0(i8);
            int i9 = this.f7298a[i8];
            long j5 = f7291t & u02;
            int i10 = 37;
            switch ((u02 & f7292u) >>> 20) {
                case 0:
                    i5 = i7 * 53;
                    s5 = o1.s(Double.doubleToLongBits(m4.D(t5, j5)));
                    i7 = s5 + i5;
                    break;
                case 1:
                    i5 = i7 * 53;
                    s5 = Float.floatToIntBits(m4.F(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 2:
                    i5 = i7 * 53;
                    s5 = o1.s(m4.L(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 3:
                    i5 = i7 * 53;
                    s5 = o1.s(m4.L(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 4:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 5:
                    i5 = i7 * 53;
                    s5 = o1.s(m4.L(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 6:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 7:
                    i5 = i7 * 53;
                    s5 = o1.k(m4.u(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 8:
                    i5 = i7 * 53;
                    s5 = ((String) m4.O(t5, j5)).hashCode();
                    i7 = s5 + i5;
                    break;
                case 9:
                    Object O = m4.O(t5, j5);
                    if (O != null) {
                        i10 = O.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
                    break;
                case 10:
                    i5 = i7 * 53;
                    s5 = m4.O(t5, j5).hashCode();
                    i7 = s5 + i5;
                    break;
                case 11:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 12:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 13:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 14:
                    i5 = i7 * 53;
                    s5 = o1.s(m4.L(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 15:
                    i6 = i7 * 53;
                    I = m4.I(t5, j5);
                    i7 = i6 + I;
                    break;
                case 16:
                    i5 = i7 * 53;
                    s5 = o1.s(m4.L(t5, j5));
                    i7 = s5 + i5;
                    break;
                case 17:
                    Object O2 = m4.O(t5, j5);
                    if (O2 != null) {
                        i10 = O2.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
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
                    i5 = i7 * 53;
                    s5 = m4.O(t5, j5).hashCode();
                    i7 = s5 + i5;
                    break;
                case 50:
                    i5 = i7 * 53;
                    s5 = m4.O(t5, j5).hashCode();
                    i7 = s5 + i5;
                    break;
                case 51:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(Double.doubleToLongBits(Y(t5, j5)));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = Float.floatToIntBits(Z(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(b0(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(b0(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(b0(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.k(X(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = ((String) m4.O(t5, j5)).hashCode();
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = m4.O(t5, j5).hashCode();
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = m4.O(t5, j5).hashCode();
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(b0(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t5, i9, i8)) {
                        i6 = i7 * 53;
                        I = a0(t5, j5);
                        i7 = i6 + I;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = o1.s(b0(t5, j5));
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t5, i9, i8)) {
                        i5 = i7 * 53;
                        s5 = m4.O(t5, j5).hashCode();
                        i7 = s5 + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f7312o.g(t5).hashCode() + (i7 * 53);
        return this.f7303f ? (hashCode * 53) + this.f7313p.c(t5).hashCode() : hashCode;
    }

    int x() {
        return this.f7298a.length * 3;
    }
}

package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.q4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes3.dex */
final class u0 extends t0<i1.g> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7529a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7529a = iArr;
            try {
                iArr[q4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7529a[q4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7529a[q4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7529a[q4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7529a[q4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7529a[q4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7529a[q4.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7529a[q4.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7529a[q4.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7529a[q4.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7529a[q4.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7529a[q4.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7529a[q4.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7529a[q4.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7529a[q4.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7529a[q4.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7529a[q4.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7529a[q4.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    u0() {
    }

    @Override // android.content.preferences.protobuf.t0
    int a(Map.Entry<?, ?> entry) {
        return ((i1.g) entry.getKey()).f7248p;
    }

    @Override // android.content.preferences.protobuf.t0
    Object b(s0 s0Var, h2 h2Var, int i5) {
        return s0Var.c(h2Var, i5);
    }

    @Override // android.content.preferences.protobuf.t0
    c1<i1.g> c(Object obj) {
        return ((i1.e) obj).extensions;
    }

    @Override // android.content.preferences.protobuf.t0
    c1<i1.g> d(Object obj) {
        return ((i1.e) obj).K2();
    }

    @Override // android.content.preferences.protobuf.t0
    boolean e(h2 h2Var) {
        return h2Var instanceof i1.e;
    }

    @Override // android.content.preferences.protobuf.t0
    void f(Object obj) {
        ((i1.e) obj).extensions.I();
    }

    @Override // android.content.preferences.protobuf.t0
    <UT, UB> UB g(h3 h3Var, Object obj, s0 s0Var, c1<i1.g> c1Var, UB ub, i4<UT, UB> i4Var) throws IOException {
        Object valueOf;
        Object u5;
        ArrayList arrayList;
        i1.h hVar = (i1.h) obj;
        int d6 = hVar.d();
        i1.g gVar = hVar.f7255d;
        if (gVar.f7250r && gVar.f7251s) {
            switch (a.f7529a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    h3Var.N(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    h3Var.G(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    h3Var.r(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    h3Var.n(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    h3Var.t(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    h3Var.R(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    h3Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    h3Var.A(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    h3Var.j(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    h3Var.h(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    h3Var.s(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    h3Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    h3Var.i(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    h3Var.u(arrayList);
                    ub = (UB) l3.B(d6, arrayList, hVar.f7255d.f7247o, ub, i4Var);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Type cannot be packed: ");
                    sb.append(hVar.f7255d.f7249q);
                    throw new IllegalStateException(sb.toString());
            }
            c1Var.O(hVar.f7255d, arrayList);
        } else {
            if (hVar.b() != q4.b.ENUM) {
                switch (a.f7529a[hVar.b().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(h3Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(h3Var.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(h3Var.P());
                        break;
                    case 4:
                        valueOf = Long.valueOf(h3Var.d());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(h3Var.H());
                        break;
                    case 6:
                        valueOf = Long.valueOf(h3Var.e());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(h3Var.k());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(h3Var.l());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(h3Var.q());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(h3Var.L());
                        break;
                    case 11:
                        valueOf = Long.valueOf(h3Var.m());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(h3Var.y());
                        break;
                    case 13:
                        valueOf = Long.valueOf(h3Var.z());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = h3Var.F();
                        break;
                    case 16:
                        valueOf = h3Var.B();
                        break;
                    case 17:
                        valueOf = h3Var.o(hVar.c().getClass(), s0Var);
                        break;
                    case 18:
                        valueOf = h3Var.f(hVar.c().getClass(), s0Var);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int H = h3Var.H();
                if (hVar.f7255d.f7247o.a(H) == null) {
                    return (UB) l3.Q(d6, H, ub, i4Var);
                }
                valueOf = Integer.valueOf(H);
            }
            if (hVar.f()) {
                c1Var.h(hVar.f7255d, valueOf);
            } else {
                int i5 = a.f7529a[hVar.b().ordinal()];
                if ((i5 == 17 || i5 == 18) && (u5 = c1Var.u(hVar.f7255d)) != null) {
                    valueOf = o1.v(u5, valueOf);
                }
                c1Var.O(hVar.f7255d, valueOf);
            }
        }
        return ub;
    }

    @Override // android.content.preferences.protobuf.t0
    void h(h3 h3Var, Object obj, s0 s0Var, c1<i1.g> c1Var) throws IOException {
        i1.h hVar = (i1.h) obj;
        c1Var.O(hVar.f7255d, h3Var.f(hVar.c().getClass(), s0Var));
    }

    @Override // android.content.preferences.protobuf.t0
    void i(w wVar, Object obj, s0 s0Var, c1<i1.g> c1Var) throws IOException {
        i1.h hVar = (i1.h) obj;
        h2 N0 = hVar.c().x().N0();
        m U = m.U(ByteBuffer.wrap(wVar.f0()), true);
        c3.a().f(N0, U, s0Var);
        c1Var.O(hVar.f7255d, N0);
        if (U.C() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // android.content.preferences.protobuf.t0
    void j(s4 s4Var, Map.Entry<?, ?> entry) throws IOException {
        i1.g gVar = (i1.g) entry.getKey();
        if (!gVar.f7250r) {
            switch (a.f7529a[gVar.f7249q.ordinal()]) {
                case 1:
                    s4Var.e(gVar.f7248p, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    s4Var.I(gVar.f7248p, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    s4Var.s(gVar.f7248p, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    s4Var.p(gVar.f7248p, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    s4Var.w(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    s4Var.i(gVar.f7248p, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    s4Var.d(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    s4Var.t(gVar.f7248p, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    s4Var.b(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    s4Var.u(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    s4Var.A(gVar.f7248p, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    s4Var.Q(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    s4Var.H(gVar.f7248p, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    s4Var.w(gVar.f7248p, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    s4Var.z(gVar.f7248p, (w) entry.getValue());
                    break;
                case 16:
                    s4Var.o(gVar.f7248p, (String) entry.getValue());
                    break;
                case 17:
                    s4Var.S(gVar.f7248p, entry.getValue(), c3.a().i(entry.getValue().getClass()));
                    break;
                case 18:
                    s4Var.C(gVar.f7248p, entry.getValue(), c3.a().i(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f7529a[gVar.f7249q.ordinal()]) {
            case 1:
                l3.Y(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 2:
                l3.g0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 3:
                l3.m0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 4:
                l3.F0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 5:
                l3.k0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 6:
                l3.e0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 7:
                l3.c0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 8:
                l3.U(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 9:
                l3.D0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 10:
                l3.s0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 11:
                l3.u0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 12:
                l3.w0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 13:
                l3.y0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 14:
                l3.k0(gVar.f7248p, (List) entry.getValue(), s4Var, gVar.f7251s);
                break;
            case 15:
                l3.W(gVar.f7248p, (List) entry.getValue(), s4Var);
                break;
            case 16:
                l3.B0(gVar.f7248p, (List) entry.getValue(), s4Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    l3.i0(gVar.f7248p, (List) entry.getValue(), s4Var, c3.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    l3.q0(gVar.f7248p, (List) entry.getValue(), s4Var, c3.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // android.content.preferences.protobuf.t0
    void k(Object obj, c1<i1.g> c1Var) {
        ((i1.e) obj).extensions = c1Var;
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.t4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes3.dex */
final class u0 extends t0<i1.g> {

    /* compiled from: ExtensionSchemaLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28985a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28985a = iArr;
            try {
                iArr[t4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28985a[t4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28985a[t4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28985a[t4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28985a[t4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28985a[t4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28985a[t4.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28985a[t4.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28985a[t4.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28985a[t4.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28985a[t4.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28985a[t4.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28985a[t4.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28985a[t4.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28985a[t4.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28985a[t4.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28985a[t4.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28985a[t4.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    u0() {
    }

    @Override // androidx.content.preferences.protobuf.t0
    int a(Map.Entry<?, ?> entry) {
        return ((i1.g) entry.getKey()).f28703c;
    }

    @Override // androidx.content.preferences.protobuf.t0
    Object b(s0 s0Var, i2 i2Var, int i4) {
        return s0Var.c(i2Var, i4);
    }

    @Override // androidx.content.preferences.protobuf.t0
    c1<i1.g> c(Object obj) {
        return ((i1.e) obj).extensions;
    }

    @Override // androidx.content.preferences.protobuf.t0
    c1<i1.g> d(Object obj) {
        return ((i1.e) obj).J2();
    }

    @Override // androidx.content.preferences.protobuf.t0
    boolean e(i2 i2Var) {
        return i2Var instanceof i1.e;
    }

    @Override // androidx.content.preferences.protobuf.t0
    void f(Object obj) {
        ((i1.e) obj).extensions.I();
    }

    @Override // androidx.content.preferences.protobuf.t0
    <UT, UB> UB g(k3 k3Var, Object obj, s0 s0Var, c1<i1.g> c1Var, UB ub, l4<UT, UB> l4Var) throws IOException {
        Object valueOf;
        Object u4;
        ArrayList arrayList;
        i1.h hVar = (i1.h) obj;
        int d5 = hVar.d();
        i1.g gVar = hVar.f28710d;
        if (gVar.f28705e && gVar.f28706f) {
            switch (a.f28985a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    k3Var.P(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    k3Var.J(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    k3Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    k3Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    k3Var.C(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    k3Var.r(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    k3Var.E(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    k3Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    k3Var.x(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    k3Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    k3Var.B(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    k3Var.t(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    k3Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    k3Var.j(arrayList);
                    ub = (UB) o3.B(d5, arrayList, hVar.f28710d.f28702b, ub, l4Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f28710d.f28704d);
            }
            c1Var.O(hVar.f28710d, arrayList);
        } else {
            if (hVar.b() != t4.b.ENUM) {
                switch (a.f28985a[hVar.b().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(k3Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(k3Var.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(k3Var.Q());
                        break;
                    case 4:
                        valueOf = Long.valueOf(k3Var.u());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(k3Var.p());
                        break;
                    case 6:
                        valueOf = Long.valueOf(k3Var.b());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(k3Var.y());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(k3Var.e());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(k3Var.h());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(k3Var.N());
                        break;
                    case 11:
                        valueOf = Long.valueOf(k3Var.f());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(k3Var.l());
                        break;
                    case 13:
                        valueOf = Long.valueOf(k3Var.F());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = k3Var.o();
                        break;
                    case 16:
                        valueOf = k3Var.G();
                        break;
                    case 17:
                        valueOf = k3Var.z(hVar.c().getClass(), s0Var);
                        break;
                    case 18:
                        valueOf = k3Var.v(hVar.c().getClass(), s0Var);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int p4 = k3Var.p();
                if (hVar.f28710d.f28702b.a(p4) == null) {
                    return (UB) o3.Q(d5, p4, ub, l4Var);
                }
                valueOf = Integer.valueOf(p4);
            }
            if (hVar.f()) {
                c1Var.h(hVar.f28710d, valueOf);
            } else {
                int i4 = a.f28985a[hVar.b().ordinal()];
                if ((i4 == 17 || i4 == 18) && (u4 = c1Var.u(hVar.f28710d)) != null) {
                    valueOf = p1.v(u4, valueOf);
                }
                c1Var.O(hVar.f28710d, valueOf);
            }
        }
        return ub;
    }

    @Override // androidx.content.preferences.protobuf.t0
    void h(k3 k3Var, Object obj, s0 s0Var, c1<i1.g> c1Var) throws IOException {
        i1.h hVar = (i1.h) obj;
        c1Var.O(hVar.f28710d, k3Var.v(hVar.c().getClass(), s0Var));
    }

    @Override // androidx.content.preferences.protobuf.t0
    void i(w wVar, Object obj, s0 s0Var, c1<i1.g> c1Var) throws IOException {
        i1.h hVar = (i1.h) obj;
        i2 l12 = hVar.c().w().l1();
        m T = m.T(ByteBuffer.wrap(wVar.i0()), true);
        f3.a().f(l12, T, s0Var);
        c1Var.O(hVar.f28710d, l12);
        if (T.H() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // androidx.content.preferences.protobuf.t0
    void j(v4 v4Var, Map.Entry<?, ?> entry) throws IOException {
        i1.g gVar = (i1.g) entry.getKey();
        if (!gVar.f28705e) {
            switch (a.f28985a[gVar.f28704d.ordinal()]) {
                case 1:
                    v4Var.v(gVar.f28703c, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    v4Var.L(gVar.f28703c, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    v4Var.D(gVar.f28703c, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    v4Var.h(gVar.f28703c, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    v4Var.j(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    v4Var.y(gVar.f28703c, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    v4Var.c(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    v4Var.E(gVar.f28703c, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    v4Var.u(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    v4Var.F(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    v4Var.l(gVar.f28703c, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    v4Var.R(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    v4Var.q(gVar.f28703c, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    v4Var.j(gVar.f28703c, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    v4Var.k(gVar.f28703c, (w) entry.getValue());
                    break;
                case 16:
                    v4Var.g(gVar.f28703c, (String) entry.getValue());
                    break;
                case 17:
                    v4Var.t(gVar.f28703c, entry.getValue(), f3.a().i(entry.getValue().getClass()));
                    break;
                case 18:
                    v4Var.n(gVar.f28703c, entry.getValue(), f3.a().i(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f28985a[gVar.f28704d.ordinal()]) {
            case 1:
                o3.Y(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 2:
                o3.g0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 3:
                o3.m0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 4:
                o3.F0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 5:
                o3.k0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 6:
                o3.e0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 7:
                o3.c0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 8:
                o3.U(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 9:
                o3.D0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 10:
                o3.s0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 11:
                o3.u0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 12:
                o3.w0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 13:
                o3.y0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 14:
                o3.k0(gVar.f28703c, (List) entry.getValue(), v4Var, gVar.f28706f);
                break;
            case 15:
                o3.W(gVar.f28703c, (List) entry.getValue(), v4Var);
                break;
            case 16:
                o3.B0(gVar.f28703c, (List) entry.getValue(), v4Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    o3.i0(gVar.f28703c, (List) entry.getValue(), v4Var, f3.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    o3.q0(gVar.f28703c, (List) entry.getValue(), v4Var, f3.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // androidx.content.preferences.protobuf.t0
    void k(Object obj, c1<i1.g> c1Var) {
        ((i1.e) obj).extensions = c1Var;
    }
}

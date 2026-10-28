package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: PropertyDescriptorImpl.java */
/* loaded from: classes6.dex */
public class c0 extends n0 implements u0 {
    private Collection<? extends u0> A;
    private final u0 B;
    private final b.a C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    private final boolean G;
    private final boolean H;
    private final boolean I;
    private List<x0> J;
    private x0 K;
    private x0 L;
    private List<f1> M;
    private d0 N;
    private w0 O;
    private boolean P;
    private kotlin.reflect.jvm.internal.impl.descriptors.x Q;
    private kotlin.reflect.jvm.internal.impl.descriptors.x R;

    /* renamed from: y, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f24162y;

    /* renamed from: z, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f24163z;

    /* compiled from: PropertyDescriptorImpl.java */
    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.m f24164a;

        /* renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.e0 f24165b;

        /* renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.u f24166c;

        /* renamed from: f, reason: collision with root package name */
        private b.a f24169f;

        /* renamed from: i, reason: collision with root package name */
        private x0 f24172i;

        /* renamed from: k, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.name.f f24174k;

        /* renamed from: l, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.types.h0 f24175l;

        /* renamed from: d, reason: collision with root package name */
        private u0 f24167d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f24168e = false;

        /* renamed from: g, reason: collision with root package name */
        private o1 f24170g = o1.f26512b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24171h = true;

        /* renamed from: j, reason: collision with root package name */
        private List<f1> f24173j = null;

        public a() {
            this.f24164a = c0.this.b();
            this.f24165b = c0.this.r();
            this.f24166c = c0.this.c();
            this.f24169f = c0.this.j();
            this.f24172i = c0.this.K;
            this.f24174k = c0.this.getName();
            this.f24175l = c0.this.getType();
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 7 || i5 == 9 || i5 == 11 || i5 == 19 || i5 == 13 || i5 == 14 || i5 == 16 || i5 == 17) ? ProtectedSandApp.s("䞔") : ProtectedSandApp.s("䞓");
            Object[] objArr = new Object[(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 7 || i5 == 9 || i5 == 11 || i5 == 19 || i5 == 13 || i5 == 14 || i5 == 16 || i5 == 17) ? 2 : 3];
            String s6 = ProtectedSandApp.s("䞕");
            switch (i5) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = s6;
                    break;
                case 4:
                    objArr[0] = ProtectedSandApp.s("䞝");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("䞜");
                    break;
                case 8:
                    objArr[0] = ProtectedSandApp.s("䞛");
                    break;
                case 10:
                    objArr[0] = ProtectedSandApp.s("䞚");
                    break;
                case 12:
                    objArr[0] = ProtectedSandApp.s("䞙");
                    break;
                case 15:
                    objArr[0] = ProtectedSandApp.s("䞘");
                    break;
                case 18:
                    objArr[0] = ProtectedSandApp.s("䞗");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("䞖");
                    break;
            }
            String s7 = ProtectedSandApp.s("䞞");
            String s8 = ProtectedSandApp.s("䞟");
            String s9 = ProtectedSandApp.s("䞠");
            String s10 = ProtectedSandApp.s("䞡");
            String s11 = ProtectedSandApp.s("䞢");
            String s12 = ProtectedSandApp.s("䞣");
            String s13 = ProtectedSandApp.s("䞤");
            String s14 = ProtectedSandApp.s("䞥");
            if (i5 == 1) {
                objArr[1] = s14;
            } else if (i5 == 2) {
                objArr[1] = ProtectedSandApp.s("䞩");
            } else if (i5 == 3) {
                objArr[1] = ProtectedSandApp.s("䞨");
            } else if (i5 == 5) {
                objArr[1] = s13;
            } else if (i5 == 7) {
                objArr[1] = s12;
            } else if (i5 == 9) {
                objArr[1] = s11;
            } else if (i5 == 11) {
                objArr[1] = s10;
            } else if (i5 == 19) {
                objArr[1] = s7;
            } else if (i5 == 13) {
                objArr[1] = s9;
            } else if (i5 == 14) {
                objArr[1] = ProtectedSandApp.s("䞧");
            } else if (i5 == 16) {
                objArr[1] = s8;
            } else if (i5 != 17) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("䞦");
            }
            switch (i5) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = s13;
                    break;
                case 6:
                    objArr[2] = s12;
                    break;
                case 8:
                    objArr[2] = s11;
                    break;
                case 10:
                    objArr[2] = s10;
                    break;
                case 12:
                    objArr[2] = s9;
                    break;
                case 15:
                    objArr[2] = s8;
                    break;
                case 18:
                    objArr[2] = s7;
                    break;
                default:
                    objArr[2] = s14;
                    break;
            }
            String format = String.format(s5, objArr);
            if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 5 && i5 != 7 && i5 != 9 && i5 != 11 && i5 != 19 && i5 != 13 && i5 != 14 && i5 != 16 && i5 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @d5.e
        public u0 n() {
            return c0.this.Y0(this);
        }

        v0 o() {
            u0 u0Var = this.f24167d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.e();
        }

        w0 p() {
            u0 u0Var = this.f24167d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.h();
        }

        @d5.d
        public a q(boolean z5) {
            this.f24171h = z5;
            return this;
        }

        @d5.d
        public a r(@d5.d b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f24169f = aVar;
            return this;
        }

        @d5.d
        public a s(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
            if (e0Var == null) {
                a(6);
            }
            this.f24165b = e0Var;
            return this;
        }

        @d5.d
        public a t(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f24167d = (u0) bVar;
            return this;
        }

        @d5.d
        public a u(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f24164a = mVar;
            return this;
        }

        @d5.d
        public a v(@d5.d o1 o1Var) {
            if (o1Var == null) {
                a(15);
            }
            this.f24170g = o1Var;
            return this;
        }

        @d5.d
        public a w(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f24166c = uVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected c0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        super(mVar, gVar, fVar, null, z5, a1Var);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (e0Var == null) {
            Q(2);
        }
        if (uVar == null) {
            Q(3);
        }
        if (fVar == null) {
            Q(4);
        }
        if (aVar == null) {
            Q(5);
        }
        if (a1Var == null) {
            Q(6);
        }
        this.A = null;
        this.J = Collections.emptyList();
        this.f24162y = e0Var;
        this.f24163z = uVar;
        this.B = u0Var == null ? this : u0Var;
        this.C = aVar;
        this.D = z6;
        this.E = z7;
        this.F = z8;
        this.G = z9;
        this.H = z10;
        this.I = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void Q(int r11) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.c0.Q(int):void");
    }

    @d5.d
    public static c0 W0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        if (mVar == null) {
            Q(7);
        }
        if (gVar == null) {
            Q(8);
        }
        if (e0Var == null) {
            Q(9);
        }
        if (uVar == null) {
            Q(10);
        }
        if (fVar == null) {
            Q(11);
        }
        if (aVar == null) {
            Q(12);
        }
        if (a1Var == null) {
            Q(13);
        }
        return new c0(mVar, null, gVar, e0Var, uVar, z5, fVar, aVar, a1Var, z6, z7, z8, z9, z10, z11);
    }

    @d5.d
    private a1 a1(boolean z5, @d5.e u0 u0Var) {
        a1 a1Var;
        if (z5) {
            if (u0Var == null) {
                u0Var = R0();
            }
            a1Var = u0Var.k();
        } else {
            a1Var = a1.f24103a;
        }
        if (a1Var == null) {
            Q(28);
        }
        return a1Var;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.z b1(@d5.d q1 q1Var, @d5.d t0 t0Var) {
        if (q1Var == null) {
            Q(30);
        }
        if (t0Var == null) {
            Q(31);
        }
        if (t0Var.k0() != null) {
            return t0Var.k0().d(q1Var);
        }
        return null;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.u g1(kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar) {
        return (aVar == b.a.FAKE_OVERRIDE && kotlin.reflect.jvm.internal.impl.descriptors.t.g(uVar.f())) ? kotlin.reflect.jvm.internal.impl.descriptors.t.f24443h : uVar;
    }

    private static x0 l1(q1 q1Var, u0 u0Var, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = q1Var.p(x0Var.getType(), x1.IN_VARIANCE);
        if (p5 == null) {
            return null;
        }
        return new f0(u0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(u0Var, p5, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) x0Var.getValue()).a(), x0Var.getValue()), x0Var.getAnnotations());
    }

    private static x0 m1(q1 q1Var, u0 u0Var, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = q1Var.p(x0Var.getType(), x1.IN_VARIANCE);
        if (p5 == null) {
            return null;
        }
        return new f0(u0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(u0Var, p5, x0Var.getValue()), x0Var.getAnnotations());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void E0(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            Q(40);
        }
        this.A = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.d
    public List<t0> J() {
        ArrayList arrayList = new ArrayList(2);
        d0 d0Var = this.N;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        w0 w0Var = this.O;
        if (w0Var != null) {
            arrayList.add(w0Var);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.d(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return this.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public u0 r0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z5) {
        u0 n5 = f1().u(mVar).t(null).s(e0Var).w(uVar).r(aVar).q(z5).n();
        if (n5 == null) {
            Q(42);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public boolean W() {
        return this.I;
    }

    @d5.d
    protected c0 X0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.e u0 u0Var, @d5.d b.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(32);
        }
        if (e0Var == null) {
            Q(33);
        }
        if (uVar == null) {
            Q(34);
        }
        if (aVar == null) {
            Q(35);
        }
        if (fVar == null) {
            Q(36);
        }
        if (a1Var == null) {
            Q(37);
        }
        return new c0(mVar, u0Var, getAnnotations(), e0Var, uVar, q0(), fVar, aVar, a1Var, z0(), s(), U(), L0(), q(), W());
    }

    @d5.e
    protected u0 Y0(@d5.d a aVar) {
        x0 x0Var;
        q3.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar2;
        if (aVar == null) {
            Q(29);
        }
        c0 X0 = X0(aVar.f24164a, aVar.f24165b, aVar.f24166c, aVar.f24167d, aVar.f24169f, aVar.f24174k, a1(aVar.f24168e, aVar.f24167d));
        List<f1> typeParameters = aVar.f24173j == null ? getTypeParameters() : aVar.f24173j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        q1 b6 = kotlin.reflect.jvm.internal.impl.types.u.b(typeParameters, aVar.f24170g, X0, arrayList);
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = aVar.f24175l;
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = b6.p(h0Var, x1.OUT_VARIANCE);
        if (p5 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p6 = b6.p(h0Var, x1.IN_VARIANCE);
        if (p6 != null) {
            X0.h1(p6);
        }
        x0 x0Var2 = aVar.f24172i;
        if (x0Var2 != null) {
            x0 d6 = x0Var2.d(b6);
            if (d6 == null) {
                return null;
            }
            x0Var = d6;
        } else {
            x0Var = null;
        }
        x0 x0Var3 = this.L;
        x0 m12 = x0Var3 != null ? m1(b6, X0, x0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<x0> it = this.J.iterator();
        while (it.hasNext()) {
            x0 l12 = l1(b6, X0, it.next());
            if (l12 != null) {
                arrayList2.add(l12);
            }
        }
        X0.j1(p5, arrayList, x0Var, m12, arrayList2);
        d0 d0Var = this.N == null ? null : new d0(X0, this.N.getAnnotations(), aVar.f24165b, g1(this.N.c(), aVar.f24169f), this.N.c0(), this.N.q(), this.N.p(), aVar.f24169f, aVar.o(), a1.f24103a);
        if (d0Var != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 i5 = this.N.i();
            d0Var.U0(b1(b6, this.N));
            d0Var.X0(i5 != null ? b6.p(i5, x1.OUT_VARIANCE) : null);
        }
        e0 e0Var = this.O == null ? null : new e0(X0, this.O.getAnnotations(), aVar.f24165b, g1(this.O.c(), aVar.f24169f), this.O.c0(), this.O.q(), this.O.p(), aVar.f24169f, aVar.p(), a1.f24103a);
        if (e0Var != null) {
            List<j1> W0 = p.W0(e0Var, this.O.n(), b6, false, false, null);
            if (W0 == null) {
                X0.i1(true);
                W0 = Collections.singletonList(e0.W0(e0Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(aVar.f24164a).H(), this.O.n().get(0).getAnnotations()));
            }
            if (W0.size() != 1) {
                throw new IllegalStateException();
            }
            e0Var.U0(b1(b6, this.O));
            e0Var.Y0(W0.get(0));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.x xVar = this.Q;
        o oVar = xVar == null ? null : new o(xVar.getAnnotations(), X0);
        kotlin.reflect.jvm.internal.impl.descriptors.x xVar2 = this.R;
        X0.d1(d0Var, e0Var, oVar, xVar2 != null ? new o(xVar2.getAnnotations(), X0) : null);
        if (aVar.f24171h) {
            kotlin.reflect.jvm.internal.impl.utils.f b7 = kotlin.reflect.jvm.internal.impl.utils.f.b();
            Iterator<? extends u0> it2 = g().iterator();
            while (it2.hasNext()) {
                b7.add(it2.next().d(b6));
            }
            X0.E0(b7);
        }
        if (s() && (aVar2 = this.f24245w) != null) {
            X0.S0(this.f24244v, aVar2);
        }
        return X0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public d0 e() {
        return this.N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f24163z;
        if (uVar == null) {
            Q(25);
        }
        return uVar;
    }

    public void c1(@d5.e d0 d0Var, @d5.e w0 w0Var) {
        d1(d0Var, w0Var, null, null);
    }

    public void d1(@d5.e d0 d0Var, @d5.e w0 w0Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.x xVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.x xVar2) {
        this.N = d0Var;
        this.O = w0Var;
        this.Q = xVar;
        this.R = xVar2;
    }

    public boolean e1() {
        return this.P;
    }

    @d5.d
    public a f1() {
        return new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends u0> g() {
        Collection<? extends u0> collection = this.A;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            Q(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<f1> getTypeParameters() {
        List<f1> list = this.M;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("膜") + toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public w0 h() {
        return this.O;
    }

    public void h1(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            Q(14);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        if (type == null) {
            Q(23);
        }
        return type;
    }

    public void i1(boolean z5) {
        this.P = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    public b.a j() {
        b.a aVar = this.C;
        if (aVar == null) {
            Q(39);
        }
        return aVar;
    }

    public void j1(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.d List<? extends f1> list, @d5.e x0 x0Var, @d5.e x0 x0Var2, @d5.d List<x0> list2) {
        if (h0Var == null) {
            Q(17);
        }
        if (list == null) {
            Q(18);
        }
        if (list2 == null) {
            Q(19);
        }
        R0(h0Var);
        this.M = new ArrayList(list);
        this.L = x0Var2;
        this.K = x0Var;
        this.J = list2;
    }

    public void k1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            Q(20);
        }
        this.f24163z = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 m0() {
        return this.K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f24162y;
        if (e0Var == null) {
            Q(24);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean s() {
        return this.E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 t0() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.x u0() {
        return this.R;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.x x0() {
        return this.Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<x0> y0() {
        List<x0> list = this.J;
        if (list == null) {
            Q(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean z0() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public u0 d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(27);
        }
        return q1Var.k() ? this : f1().v(q1Var.j()).t(R0()).n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u0 R0() {
        u0 u0Var = this.B;
        u0 R0 = u0Var == this ? this : u0Var.R0();
        if (R0 == null) {
            Q(38);
        }
        return R0;
    }
}

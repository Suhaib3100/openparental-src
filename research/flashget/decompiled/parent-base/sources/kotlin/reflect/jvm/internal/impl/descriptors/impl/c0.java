package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public class c0 extends n0 implements u0 {
    private d0 A;
    private w0 B;
    private boolean C;
    private kotlin.reflect.jvm.internal.impl.descriptors.x D;
    private kotlin.reflect.jvm.internal.impl.descriptors.x E;

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f75961l;

    /* renamed from: m, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f75962m;

    /* renamed from: n, reason: collision with root package name */
    private Collection<? extends u0> f75963n;

    /* renamed from: o, reason: collision with root package name */
    private final u0 f75964o;

    /* renamed from: p, reason: collision with root package name */
    private final b.a f75965p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f75966q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f75967r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f75968s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f75969t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f75970u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f75971v;

    /* renamed from: w, reason: collision with root package name */
    private List<x0> f75972w;

    /* renamed from: x, reason: collision with root package name */
    private x0 f75973x;

    /* renamed from: y, reason: collision with root package name */
    private x0 f75974y;

    /* renamed from: z, reason: collision with root package name */
    private List<f1> f75975z;

    /* compiled from: PropertyDescriptorImpl.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.m f75976a;

        /* renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.e0 f75977b;

        /* renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.u f75978c;

        /* renamed from: f, reason: collision with root package name */
        private b.a f75981f;

        /* renamed from: i, reason: collision with root package name */
        private x0 f75984i;

        /* renamed from: k, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.name.f f75986k;

        /* renamed from: l, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.types.h0 f75987l;

        /* renamed from: d, reason: collision with root package name */
        private u0 f75979d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f75980e = false;

        /* renamed from: g, reason: collision with root package name */
        private o1 f75982g = o1.f78521b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f75983h = true;

        /* renamed from: j, reason: collision with root package name */
        private List<f1> f75985j = null;

        public a() {
            this.f75976a = c0.this.c();
            this.f75977b = c0.this.u();
            this.f75978c = c0.this.getVisibility();
            this.f75981f = c0.this.b();
            this.f75984i = c0.this.f75973x;
            this.f75986k = c0.this.getName();
            this.f75987l = c0.this.getType();
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) ? ProtectedSandApp.s("每\u0001") : ProtectedSandApp.s("毎\u0001");
            Object[] objArr = new Object[(i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) ? 2 : 3];
            String s5 = ProtectedSandApp.s("毐\u0001");
            switch (i4) {
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
                    objArr[0] = s5;
                    break;
                case 4:
                    objArr[0] = ProtectedSandApp.s("毘\u0001");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("毗\u0001");
                    break;
                case 8:
                    objArr[0] = ProtectedSandApp.s("毖\u0001");
                    break;
                case 10:
                    objArr[0] = ProtectedSandApp.s("毕\u0001");
                    break;
                case 12:
                    objArr[0] = ProtectedSandApp.s("比\u0001");
                    break;
                case 15:
                    objArr[0] = ProtectedSandApp.s("毓\u0001");
                    break;
                case 18:
                    objArr[0] = ProtectedSandApp.s("毒\u0001");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("毑\u0001");
                    break;
            }
            String s6 = ProtectedSandApp.s("毙\u0001");
            String s7 = ProtectedSandApp.s("毚\u0001");
            String s10 = ProtectedSandApp.s("毛\u0001");
            String s11 = ProtectedSandApp.s("毜\u0001");
            String s12 = ProtectedSandApp.s("毝\u0001");
            String s13 = ProtectedSandApp.s("毞\u0001");
            String s14 = ProtectedSandApp.s("毟\u0001");
            String s15 = ProtectedSandApp.s("毠\u0001");
            if (i4 == 1) {
                objArr[1] = s6;
            } else if (i4 == 2) {
                objArr[1] = ProtectedSandApp.s("毤\u0001");
            } else if (i4 == 3) {
                objArr[1] = ProtectedSandApp.s("毣\u0001");
            } else if (i4 == 5) {
                objArr[1] = s7;
            } else if (i4 == 7) {
                objArr[1] = s10;
            } else if (i4 == 9) {
                objArr[1] = s11;
            } else if (i4 == 11) {
                objArr[1] = s12;
            } else if (i4 == 19) {
                objArr[1] = s15;
            } else if (i4 == 13) {
                objArr[1] = s13;
            } else if (i4 == 14) {
                objArr[1] = ProtectedSandApp.s("毢\u0001");
            } else if (i4 == 16) {
                objArr[1] = s14;
            } else if (i4 != 17) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("毡\u0001");
            }
            switch (i4) {
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
                    objArr[2] = s7;
                    break;
                case 6:
                    objArr[2] = s10;
                    break;
                case 8:
                    objArr[2] = s11;
                    break;
                case 10:
                    objArr[2] = s12;
                    break;
                case 12:
                    objArr[2] = s13;
                    break;
                case 15:
                    objArr[2] = s14;
                    break;
                case 18:
                    objArr[2] = s15;
                    break;
                default:
                    objArr[2] = s6;
                    break;
            }
            String format = String.format(s4, objArr);
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 5 && i4 != 7 && i4 != 9 && i4 != 11 && i4 != 19 && i4 != 13 && i4 != 14 && i4 != 16 && i4 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @fg.m
        public u0 n() {
            return c0.this.S0(this);
        }

        v0 o() {
            u0 u0Var = this.f75979d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.getGetter();
        }

        w0 p() {
            u0 u0Var = this.f75979d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.getSetter();
        }

        @fg.l
        public a q(boolean z4) {
            this.f75983h = z4;
            return this;
        }

        @fg.l
        public a r(@fg.l b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f75981f = aVar;
            return this;
        }

        @fg.l
        public a s(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
            if (e0Var == null) {
                a(6);
            }
            this.f75977b = e0Var;
            return this;
        }

        @fg.l
        public a t(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f75979d = (u0) bVar;
            return this;
        }

        @fg.l
        public a u(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f75976a = mVar;
            return this;
        }

        @fg.l
        public a v(@fg.l o1 o1Var) {
            if (o1Var == null) {
                a(15);
            }
            this.f75982g = o1Var;
            return this;
        }

        @fg.l
        public a w(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f75978c = uVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected c0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a1 a1Var, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12) {
        super(mVar, gVar, fVar, null, z4, a1Var);
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (e0Var == null) {
            j0(2);
        }
        if (uVar == null) {
            j0(3);
        }
        if (fVar == null) {
            j0(4);
        }
        if (aVar == null) {
            j0(5);
        }
        if (a1Var == null) {
            j0(6);
        }
        this.f75963n = null;
        this.f75972w = Collections.emptyList();
        this.f75961l = e0Var;
        this.f75962m = uVar;
        this.f75964o = u0Var == null ? this : u0Var;
        this.f75965p = aVar;
        this.f75966q = z5;
        this.f75967r = z6;
        this.f75968s = z7;
        this.f75969t = z10;
        this.f75970u = z11;
        this.f75971v = z12;
    }

    @fg.l
    public static c0 Q0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a1 a1Var, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12) {
        if (mVar == null) {
            j0(7);
        }
        if (gVar == null) {
            j0(8);
        }
        if (e0Var == null) {
            j0(9);
        }
        if (uVar == null) {
            j0(10);
        }
        if (fVar == null) {
            j0(11);
        }
        if (aVar == null) {
            j0(12);
        }
        if (a1Var == null) {
            j0(13);
        }
        return new c0(mVar, null, gVar, e0Var, uVar, z4, fVar, aVar, a1Var, z5, z6, z7, z10, z11, z12);
    }

    @fg.l
    private a1 U0(boolean z4, @fg.m u0 u0Var) {
        a1 a1Var;
        if (z4) {
            if (u0Var == null) {
                u0Var = a();
            }
            a1Var = u0Var.f();
        } else {
            a1Var = a1.f75900a;
        }
        if (a1Var == null) {
            j0(28);
        }
        return a1Var;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.z V0(@fg.l q1 q1Var, @fg.l t0 t0Var) {
        if (q1Var == null) {
            j0(30);
        }
        if (t0Var == null) {
            j0(31);
        }
        if (t0Var.u0() != null) {
            return t0Var.u0().d(q1Var);
        }
        return null;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.u a1(kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar) {
        return (aVar == b.a.FAKE_OVERRIDE && kotlin.reflect.jvm.internal.impl.descriptors.t.g(uVar.f())) ? kotlin.reflect.jvm.internal.impl.descriptors.t.f76293h : uVar;
    }

    private static x0 f1(q1 q1Var, u0 u0Var, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.types.h0 p4 = q1Var.p(x0Var.getType(), x1.IN_VARIANCE);
        if (p4 == null) {
            return null;
        }
        return new f0(u0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(u0Var, p4, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) x0Var.getValue()).a(), x0Var.getValue()), x0Var.getAnnotations());
    }

    private static x0 g1(q1 q1Var, u0 u0Var, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.types.h0 p4 = q1Var.p(x0Var.getType(), x1.IN_VARIANCE);
        if (p4 == null) {
            return null;
        }
        return new f0(u0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(u0Var, p4, x0Var.getValue()), x0Var.getAnnotations());
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
    private static /* synthetic */ void j0(int r11) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.c0.j0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean A0() {
        return this.f75966q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.l
    public List<t0> D() {
        ArrayList arrayList = new ArrayList(2);
        d0 d0Var = this.A;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        w0 w0Var = this.B;
        if (w0Var != null) {
            arrayList.add(w0Var);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.c(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public boolean F() {
        return this.f75971v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void F0(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            j0(40);
        }
        this.f75963n = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 O() {
        return this.f75973x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public u0 R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z4) {
        u0 n4 = Z0().u(mVar).t(null).s(e0Var).w(uVar).r(aVar).q(z4).n();
        if (n4 == null) {
            j0(42);
        }
        return n4;
    }

    @fg.l
    protected c0 R0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.m u0 u0Var, @fg.l b.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l a1 a1Var) {
        if (mVar == null) {
            j0(32);
        }
        if (e0Var == null) {
            j0(33);
        }
        if (uVar == null) {
            j0(34);
        }
        if (aVar == null) {
            j0(35);
        }
        if (fVar == null) {
            j0(36);
        }
        if (a1Var == null) {
            j0(37);
        }
        return new c0(mVar, u0Var, getAnnotations(), e0Var, uVar, Q(), fVar, aVar, a1Var, A0(), isConst(), m0(), a0(), t(), F());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 S() {
        return this.f75974y;
    }

    @fg.m
    protected u0 S0(@fg.l a aVar) {
        x0 x0Var;
        ld.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar2;
        if (aVar == null) {
            j0(29);
        }
        c0 R0 = R0(aVar.f75976a, aVar.f75977b, aVar.f75978c, aVar.f75979d, aVar.f75981f, aVar.f75986k, U0(aVar.f75980e, aVar.f75979d));
        List<f1> typeParameters = aVar.f75985j == null ? getTypeParameters() : aVar.f75985j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        q1 b5 = kotlin.reflect.jvm.internal.impl.types.u.b(typeParameters, aVar.f75982g, R0, arrayList);
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = aVar.f75987l;
        kotlin.reflect.jvm.internal.impl.types.h0 p4 = b5.p(h0Var, x1.OUT_VARIANCE);
        if (p4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = b5.p(h0Var, x1.IN_VARIANCE);
        if (p5 != null) {
            R0.b1(p5);
        }
        x0 x0Var2 = aVar.f75984i;
        if (x0Var2 != null) {
            x0 d5 = x0Var2.d(b5);
            if (d5 == null) {
                return null;
            }
            x0Var = d5;
        } else {
            x0Var = null;
        }
        x0 x0Var3 = this.f75974y;
        x0 g12 = x0Var3 != null ? g1(b5, R0, x0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<x0> it = this.f75972w.iterator();
        while (it.hasNext()) {
            x0 f12 = f1(b5, R0, it.next());
            if (f12 != null) {
                arrayList2.add(f12);
            }
        }
        R0.d1(p4, arrayList, x0Var, g12, arrayList2);
        d0 d0Var = this.A == null ? null : new d0(R0, this.A.getAnnotations(), aVar.f75977b, a1(this.A.getVisibility(), aVar.f75981f), this.A.J(), this.A.t(), this.A.k(), aVar.f75981f, aVar.o(), a1.f75900a);
        if (d0Var != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 returnType = this.A.getReturnType();
            d0Var.O0(V0(b5, this.A));
            d0Var.R0(returnType != null ? b5.p(returnType, x1.OUT_VARIANCE) : null);
        }
        e0 e0Var = this.B == null ? null : new e0(R0, this.B.getAnnotations(), aVar.f75977b, a1(this.B.getVisibility(), aVar.f75981f), this.B.J(), this.B.t(), this.B.k(), aVar.f75981f, aVar.p(), a1.f75900a);
        if (e0Var != null) {
            List<j1> Q0 = p.Q0(e0Var, this.B.i(), b5, false, false, null);
            if (Q0 == null) {
                R0.c1(true);
                Q0 = Collections.singletonList(e0.Q0(e0Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(aVar.f75976a).H(), this.B.i().get(0).getAnnotations()));
            }
            if (Q0.size() != 1) {
                throw new IllegalStateException();
            }
            e0Var.O0(V0(b5, this.B));
            e0Var.S0(Q0.get(0));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.x xVar = this.D;
        o oVar = xVar == null ? null : new o(xVar.getAnnotations(), R0);
        kotlin.reflect.jvm.internal.impl.descriptors.x xVar2 = this.E;
        R0.X0(d0Var, e0Var, oVar, xVar2 != null ? new o(xVar2.getAnnotations(), R0) : null);
        if (aVar.f75983h) {
            kotlin.reflect.jvm.internal.impl.utils.g b6 = kotlin.reflect.jvm.internal.impl.utils.g.b();
            Iterator<? extends u0> it2 = e().iterator();
            while (it2.hasNext()) {
                b6.add(it2.next().d(b5));
            }
            R0.F0(b6);
        }
        if (isConst() && (aVar2 = this.f76075j) != null) {
            R0.M0(this.f76074i, aVar2);
        }
        return R0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.x T() {
        return this.E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.m
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public d0 getGetter() {
        return this.A;
    }

    public void W0(@fg.m d0 d0Var, @fg.m w0 w0Var) {
        X0(d0Var, w0Var, null, null);
    }

    public void X0(@fg.m d0 d0Var, @fg.m w0 w0Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.x xVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.x xVar2) {
        this.A = d0Var;
        this.B = w0Var;
        this.D = xVar;
        this.E = xVar2;
    }

    public boolean Y0() {
        return this.C;
    }

    @fg.l
    public a Z0() {
        return new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return this.f75969t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    public b.a b() {
        b.a aVar = this.f75965p;
        if (aVar == null) {
            j0(39);
        }
        return aVar;
    }

    public void b1(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            j0(14);
        }
    }

    public void c1(boolean z4) {
        this.C = z4;
    }

    public void d1(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.l List<? extends f1> list, @fg.m x0 x0Var, @fg.m x0 x0Var2, @fg.l List<x0> list2) {
        if (h0Var == null) {
            j0(17);
        }
        if (list == null) {
            j0(18);
        }
        if (list2 == null) {
            j0(19);
        }
        L0(h0Var);
        this.f75975z = new ArrayList(list);
        this.f75974y = x0Var2;
        this.f75973x = x0Var;
        this.f75972w = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends u0> e() {
        Collection<? extends u0> collection = this.f75963n;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            j0(41);
        }
        return collection;
    }

    public void e1(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            j0(20);
        }
        this.f75962m = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        if (type == null) {
            j0(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.m
    public w0 getSetter() {
        return this.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<f1> getTypeParameters() {
        List<f1> list = this.f75975z;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("氪\u0001") + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f75962m;
        if (uVar == null) {
            j0(25);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean isConst() {
        return this.f75967r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return this.f75968s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return this.f75970u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f75961l;
        if (e0Var == null) {
            j0(24);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.x y0() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<x0> z0() {
        List<x0> list = this.f75972w;
        if (list == null) {
            j0(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public u0 d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(27);
        }
        return q1Var.k() ? this : Z0().v(q1Var.j()).t(a()).n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public u0 a() {
        u0 u0Var = this.f75964o;
        u0 a5 = u0Var == this ? this : u0Var.a();
        if (a5 == null) {
            j0(38);
        }
        return a5;
    }
}

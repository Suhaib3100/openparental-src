package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: AbstractClassDescriptor.java */
/* loaded from: classes6.dex */
public abstract class a extends t {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ boolean f24141t = false;

    /* renamed from: p, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.name.f f24142p;

    /* renamed from: q, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.i<p0> f24143q;

    /* renamed from: r, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> f24144r;

    /* renamed from: s, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<x0> f24145s;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a, reason: collision with other inner class name */
    class C0276a implements q3.a<p0> {

        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a, reason: collision with other inner class name */
        class C0277a implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
            C0277a() {
            }

            @Override // q3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p0 N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
                kotlin.reflect.jvm.internal.impl.descriptors.h f6 = gVar.f(a.this);
                return f6 == null ? a.this.f24143q.n() : f6 instanceof e1 ? kotlin.reflect.jvm.internal.impl.types.i0.b((e1) f6, t1.g(f6.m().r())) : f6 instanceof t ? t1.v(f6.m().a(gVar), ((t) f6).S(gVar), this) : f6.E();
            }
        }

        C0276a() {
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 n() {
            a aVar = a.this;
            return t1.u(aVar, aVar.K0(), new C0277a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    class b implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
        b() {
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h n() {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(a.this.K0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    class c implements q3.a<x0> {
        c() {
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 n() {
            return new q(a.this);
        }
    }

    public a(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (nVar == null) {
            H0(0);
        }
        if (fVar == null) {
            H0(1);
        }
        this.f24142p = fVar;
        this.f24143q = nVar.d(new C0276a());
        this.f24144r = nVar.d(new b());
        this.f24145s = nVar.d(new c());
    }

    private static /* synthetic */ void H0(int i5) {
        String s5 = (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16 || i5 == 17 || i5 == 19 || i5 == 20) ? ProtectedSandApp.s("耽") : ProtectedSandApp.s("耼");
        Object[] objArr = new Object[(i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16 || i5 == 17 || i5 == 19 || i5 == 20) ? 2 : 3];
        String s6 = ProtectedSandApp.s("耾");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("聄");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = s6;
                break;
            case 7:
            case 13:
                objArr[0] = ProtectedSandApp.s("聃");
                break;
            case 8:
            case 11:
                objArr[0] = ProtectedSandApp.s("聂");
                break;
            case 10:
            case 15:
                objArr[0] = ProtectedSandApp.s("聁");
                break;
            case 18:
                objArr[0] = ProtectedSandApp.s("聀");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("耿");
                break;
        }
        String s7 = ProtectedSandApp.s("聅");
        String s8 = ProtectedSandApp.s("聆");
        if (i5 == 2) {
            objArr[1] = ProtectedSandApp.s("聍");
        } else if (i5 == 3) {
            objArr[1] = ProtectedSandApp.s("职");
        } else if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("聋");
        } else if (i5 == 5) {
            objArr[1] = ProtectedSandApp.s("聊");
        } else if (i5 == 6) {
            objArr[1] = ProtectedSandApp.s("聉");
        } else if (i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16) {
            objArr[1] = s8;
        } else if (i5 == 17) {
            objArr[1] = ProtectedSandApp.s("聈");
        } else if (i5 == 19) {
            objArr[1] = s7;
        } else if (i5 != 20) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("聇");
        }
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = s8;
                break;
            case 18:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("聎");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 9 && i5 != 12 && i5 != 14 && i5 != 16 && i5 != 17 && i5 != 19 && i5 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public p0 E() {
        p0 n5 = this.f24143q.n();
        if (n5 == null) {
            H0(20);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h n5 = this.f24144r.n();
        if (n5 == null) {
            H0(4);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h K0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h S = S(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.e.g(this)));
        if (S == null) {
            H0(17);
        }
        return S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.d
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            H0(18);
        }
        return q1Var.k() ? this : new s(this, q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public List<x0> N0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(6);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q(@d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (o1Var == null) {
            H0(10);
        }
        if (gVar == null) {
            H0(11);
        }
        if (!o1Var.f()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(S(gVar), q1.g(o1Var));
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h S = S(gVar);
        if (S == null) {
            H0(12);
        }
        return S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public x0 Q0() {
        x0 n5 = this.f24145s.n();
        if (n5 == null) {
            H0(5);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.a(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f24142p;
        if (fVar == null) {
            H0(2);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h h0(@d5.d o1 o1Var) {
        if (o1Var == null) {
            H0(15);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q = Q(o1Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.e.g(this)));
        if (Q == null) {
            H0(16);
        }
        return Q;
    }
}

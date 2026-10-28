package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: AbstractClassDescriptor.java */
/* loaded from: classes7.dex */
public abstract class a extends t {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f75939g = false;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.name.f f75940c;

    /* renamed from: d, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.i<p0> f75941d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> f75942e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<x0> f75943f;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a, reason: collision with other inner class name */
    class C1079a implements ld.a<p0> {

        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a, reason: collision with other inner class name */
        class C1080a implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
            C1080a() {
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
                kotlin.reflect.jvm.internal.impl.descriptors.h f4 = gVar.f(a.this);
                return f4 == null ? a.this.f75941d.invoke() : f4 instanceof e1 ? kotlin.reflect.jvm.internal.impl.types.i0.b((e1) f4, t1.g(f4.j().getParameters())) : f4 instanceof t ? t1.v(f4.j().a(gVar), ((t) f4).l0(gVar), this) : f4.r();
            }
        }

        C1079a() {
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 invoke() {
            a aVar = a.this;
            return t1.u(aVar, aVar.Z(), new C1080a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    class b implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
        b() {
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(a.this.Z());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    class c implements ld.a<x0> {
        c() {
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 invoke() {
            return new q(a.this);
        }
    }

    public a(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (nVar == null) {
            G0(0);
        }
        if (fVar == null) {
            G0(1);
        }
        this.f75940c = fVar;
        this.f75941d = nVar.h(new C1079a());
        this.f75942e = nVar.h(new b());
        this.f75943f = nVar.h(new c());
    }

    private static /* synthetic */ void G0(int i4) {
        String s4 = (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6 || i4 == 9 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 17 || i4 == 19 || i4 == 20) ? ProtectedSandApp.s("格\u0001") : ProtectedSandApp.s("栻\u0001");
        Object[] objArr = new Object[(i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6 || i4 == 9 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 17 || i4 == 19 || i4 == 20) ? 2 : 3];
        String s5 = ProtectedSandApp.s("栽\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("桃\u0001");
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
                objArr[0] = s5;
                break;
            case 7:
            case 13:
                objArr[0] = ProtectedSandApp.s("桂\u0001");
                break;
            case 8:
            case 11:
                objArr[0] = ProtectedSandApp.s("桁\u0001");
                break;
            case 10:
            case 15:
                objArr[0] = ProtectedSandApp.s("桀\u0001");
                break;
            case 18:
                objArr[0] = ProtectedSandApp.s("栿\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("栾\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("桄\u0001");
        String s7 = ProtectedSandApp.s("桅\u0001");
        if (i4 == 2) {
            objArr[1] = ProtectedSandApp.s("桌\u0001");
        } else if (i4 == 3) {
            objArr[1] = ProtectedSandApp.s("桋\u0001");
        } else if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("桊\u0001");
        } else if (i4 == 5) {
            objArr[1] = ProtectedSandApp.s("桉\u0001");
        } else if (i4 == 6) {
            objArr[1] = ProtectedSandApp.s("案\u0001");
        } else if (i4 == 9 || i4 == 12 || i4 == 14 || i4 == 16) {
            objArr[1] = s6;
        } else if (i4 == 17) {
            objArr[1] = ProtectedSandApp.s("桇\u0001");
        } else if (i4 == 19) {
            objArr[1] = s7;
        } else if (i4 != 20) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("框\u0001");
        }
        switch (i4) {
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
                objArr[2] = s6;
                break;
            case 18:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("桍\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16 && i4 != 17 && i4 != 19 && i4 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.a(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.l
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            G0(18);
        }
        return q1Var.k() ? this : new s(this, q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public x0 K0() {
        x0 invoke = this.f75943f.invoke();
        if (invoke == null) {
            G0(5);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h W() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke = this.f75942e.invoke();
        if (invoke == null) {
            G0(4);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h l02 = l0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.f.g(this)));
        if (l02 == null) {
            G0(17);
        }
        return l02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public List<x0> b0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(6);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f75940c;
        if (fVar == null) {
            G0(2);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h j0(@fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (o1Var == null) {
            G0(10);
        }
        if (gVar == null) {
            G0(11);
        }
        if (!o1Var.f()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(l0(gVar), q1.g(o1Var));
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h l02 = l0(gVar);
        if (l02 == null) {
            G0(12);
        }
        return l02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public p0 r() {
        p0 invoke = this.f75941d.invoke();
        if (invoke == null) {
            G0(20);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h s0(@fg.l o1 o1Var) {
        if (o1Var == null) {
            G0(15);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h j02 = j0(o1Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.f.g(this)));
        if (j02 == null) {
            G0(16);
        }
        return j02;
    }
}

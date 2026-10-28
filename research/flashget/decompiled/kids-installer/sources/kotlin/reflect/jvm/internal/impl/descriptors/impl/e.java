package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes6.dex */
public abstract class e extends k implements f1 {

    /* renamed from: s, reason: collision with root package name */
    private final x1 f24183s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f24184t;

    /* renamed from: u, reason: collision with root package name */
    private final int f24185u;

    /* renamed from: v, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<h1> f24186v;

    /* renamed from: w, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<p0> f24187w;

    /* renamed from: x, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.n f24188x;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    class a implements q3.a<h1> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.n f24189o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ d1 f24190p;

        a(kotlin.reflect.jvm.internal.impl.storage.n nVar, d1 d1Var) {
            this.f24189o = nVar;
            this.f24190p = d1Var;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h1 n() {
            return new c(e.this, this.f24189o, this.f24190p);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    class b implements q3.a<p0> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f24192o;

        /* compiled from: AbstractTypeParameterDescriptor.java */
        class a implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
            a() {
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public kotlin.reflect.jvm.internal.impl.resolve.scopes.h n() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.n.k(ProtectedSandApp.s("臌") + b.this.f24192o.h(), e.this.getUpperBounds());
            }
        }

        b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            this.f24192o = fVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 n() {
            kotlin.reflect.jvm.internal.impl.types.d1.f26381p.getClass();
            return kotlin.reflect.jvm.internal.impl.types.i0.m(kotlin.reflect.jvm.internal.impl.types.d1.f26382q, e.this.m(), Collections.emptyList(), false, new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(new a()));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    private class c extends kotlin.reflect.jvm.internal.impl.types.h {

        /* renamed from: d, reason: collision with root package name */
        private final d1 f24195d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f24196e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@d5.d e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, d1 d1Var) {
            super(nVar);
            if (nVar == null) {
                v(0);
            }
            this.f24196e = eVar;
            this.f24195d = d1Var;
        }

        private static /* synthetic */ void v(int i5) {
            String s5 = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 8) ? ProtectedSandApp.s("臎") : ProtectedSandApp.s("臍");
            Object[] objArr = new Object[(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 8) ? 2 : 3];
            String s6 = ProtectedSandApp.s("臏");
            switch (i5) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = s6;
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("臓");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("臒");
                    break;
                case 9:
                    objArr[0] = ProtectedSandApp.s("臑");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("臐");
                    break;
            }
            String s7 = ProtectedSandApp.s("臔");
            if (i5 == 1) {
                objArr[1] = ProtectedSandApp.s("臙");
            } else if (i5 == 2) {
                objArr[1] = ProtectedSandApp.s("臘");
            } else if (i5 == 3) {
                objArr[1] = ProtectedSandApp.s("臗");
            } else if (i5 == 4) {
                objArr[1] = ProtectedSandApp.s("臖");
            } else if (i5 == 5) {
                objArr[1] = ProtectedSandApp.s("臕");
            } else if (i5 != 8) {
                objArr[1] = s6;
            } else {
                objArr[1] = s7;
            }
            switch (i5) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = ProtectedSandApp.s("臜");
                    break;
                case 7:
                    objArr[2] = s7;
                    break;
                case 9:
                    objArr[2] = ProtectedSandApp.s("臛");
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("臚");
                    break;
            }
            String format = String.format(s5, objArr);
            if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public kotlin.reflect.jvm.internal.impl.builtins.h A() {
            kotlin.reflect.jvm.internal.impl.builtins.h j5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this.f24196e);
            if (j5 == null) {
                v(4);
            }
            return j5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
            e eVar = this.f24196e;
            if (eVar == null) {
                v(3);
            }
            return eVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.n
        protected boolean h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            if (hVar == null) {
                v(9);
            }
            return (hVar instanceof f1) && kotlin.reflect.jvm.internal.impl.resolve.c.f25882a.h(this.f24196e, (f1) hVar, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected Collection<kotlin.reflect.jvm.internal.impl.types.h0> k() {
            List<kotlin.reflect.jvm.internal.impl.types.h0> S0 = this.f24196e.S0();
            if (S0 == null) {
                v(1);
            }
            return S0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.e
        protected kotlin.reflect.jvm.internal.impl.types.h0 l() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected d1 p() {
            d1 d1Var = this.f24195d;
            if (d1Var == null) {
                v(5);
            }
            return d1Var;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<f1> r() {
            List<f1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                v(2);
            }
            return emptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected List<kotlin.reflect.jvm.internal.impl.types.h0> s(@d5.d List<kotlin.reflect.jvm.internal.impl.types.h0> list) {
            if (list == null) {
                v(7);
            }
            List<kotlin.reflect.jvm.internal.impl.types.h0> M0 = this.f24196e.M0(list);
            if (M0 == null) {
                v(8);
            }
            return M0;
        }

        public String toString() {
            return this.f24196e.getName().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        protected void u(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            if (h0Var == null) {
                v(6);
            }
            this.f24196e.R0(h0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d x1 x1Var, boolean z5, int i5, @d5.d a1 a1Var, @d5.d d1 d1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (nVar == null) {
            Q(0);
        }
        if (mVar == null) {
            Q(1);
        }
        if (gVar == null) {
            Q(2);
        }
        if (fVar == null) {
            Q(3);
        }
        if (x1Var == null) {
            Q(4);
        }
        if (a1Var == null) {
            Q(5);
        }
        if (d1Var == null) {
            Q(6);
        }
        this.f24183s = x1Var;
        this.f24184t = z5;
        this.f24185u = i5;
        this.f24186v = nVar.d(new a(nVar, d1Var));
        this.f24187w = nVar.d(new b(fVar));
        this.f24188x = nVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                s5 = ProtectedSandApp.s("脸");
                break;
            case 12:
            default:
                s5 = ProtectedSandApp.s("脷");
                break;
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i6 = 2;
                break;
            case 12:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("脹");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("腁");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("腀");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("脿");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("脾");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("脽");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("脼");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = s6;
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("脻");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("脺");
                break;
        }
        String s7 = ProtectedSandApp.s("腂");
        switch (i5) {
            case 7:
                objArr[1] = ProtectedSandApp.s("腈");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("腇");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("腆");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("腅");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("腄");
                break;
            case 12:
            default:
                objArr[1] = s6;
                break;
            case 13:
                objArr[1] = s7;
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("腃");
                break;
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("腉");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public p0 E() {
        p0 n5 = this.f24187w.n();
        if (n5 == null) {
            Q(10);
        }
        return n5;
    }

    @d5.d
    protected List<kotlin.reflect.jvm.internal.impl.types.h0> M0(@d5.d List<kotlin.reflect.jvm.internal.impl.types.h0> list) {
        if (list == null) {
            Q(12);
        }
        if (list == null) {
            Q(13);
        }
        return list;
    }

    protected abstract void R0(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var);

    @d5.d
    protected abstract List<kotlin.reflect.jvm.internal.impl.types.h0> S0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.m(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 R0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public int getIndex() {
        return this.f24185u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.types.h0> getUpperBounds() {
        List<kotlin.reflect.jvm.internal.impl.types.h0> m5 = ((c) m()).m();
        if (m5 == null) {
            Q(8);
        }
        return m5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public final h1 m() {
        h1 n5 = this.f24186v.n();
        if (n5 == null) {
            Q(9);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.storage.n o0() {
        kotlin.reflect.jvm.internal.impl.storage.n nVar = this.f24188x;
        if (nVar == null) {
            Q(14);
        }
        return nVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean v() {
        return this.f24184t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean v0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @d5.d
    public x1 z() {
        x1 x1Var = this.f24183s;
        if (x1Var == null) {
            Q(7);
        }
        return x1Var;
    }
}

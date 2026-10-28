package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public abstract class e extends k implements f1 {

    /* renamed from: f, reason: collision with root package name */
    private final x1 f76001f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f76002g;

    /* renamed from: h, reason: collision with root package name */
    private final int f76003h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<h1> f76004i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<p0> f76005j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.n f76006k;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    class a implements ld.a<h1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.n f76007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d1 f76008c;

        a(kotlin.reflect.jvm.internal.impl.storage.n nVar, d1 d1Var) {
            this.f76007b = nVar;
            this.f76008c = d1Var;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h1 invoke() {
            return new c(e.this, this.f76007b, this.f76008c);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    class b implements ld.a<p0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f76010b;

        /* compiled from: AbstractTypeParameterDescriptor.java */
        class a implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
            a() {
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.n.k(ProtectedSandApp.s("汜\u0001") + b.this.f76010b.b(), e.this.getUpperBounds());
            }
        }

        b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            this.f76010b = fVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 invoke() {
            kotlin.reflect.jvm.internal.impl.types.d1.f78389c.getClass();
            return kotlin.reflect.jvm.internal.impl.types.i0.m(kotlin.reflect.jvm.internal.impl.types.d1.f78390d, e.this.j(), Collections.emptyList(), false, new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(new a()));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    private class c extends kotlin.reflect.jvm.internal.impl.types.h {

        /* renamed from: d, reason: collision with root package name */
        private final d1 f76013d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f76014e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@fg.l e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, d1 d1Var) {
            super(nVar);
            if (nVar == null) {
                u(0);
            }
            this.f76014e = eVar;
            this.f76013d = d1Var;
        }

        private static /* synthetic */ void u(int i4) {
            String s4 = (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 8) ? ProtectedSandApp.s("汞\u0001") : ProtectedSandApp.s("汝\u0001");
            Object[] objArr = new Object[(i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 8) ? 2 : 3];
            String s5 = ProtectedSandApp.s("江\u0001");
            switch (i4) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = s5;
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("汣\u0001");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("汢\u0001");
                    break;
                case 9:
                    objArr[0] = ProtectedSandApp.s("污\u0001");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("池\u0001");
                    break;
            }
            String s6 = ProtectedSandApp.s("汤\u0001");
            if (i4 == 1) {
                objArr[1] = ProtectedSandApp.s("汩\u0001");
            } else if (i4 == 2) {
                objArr[1] = ProtectedSandApp.s("汨\u0001");
            } else if (i4 == 3) {
                objArr[1] = ProtectedSandApp.s("汧\u0001");
            } else if (i4 == 4) {
                objArr[1] = ProtectedSandApp.s("汦\u0001");
            } else if (i4 == 5) {
                objArr[1] = ProtectedSandApp.s("汥\u0001");
            } else if (i4 != 8) {
                objArr[1] = s5;
            } else {
                objArr[1] = s6;
            }
            switch (i4) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = ProtectedSandApp.s("汬\u0001");
                    break;
                case 7:
                    objArr[2] = s6;
                    break;
                case 9:
                    objArr[2] = ProtectedSandApp.s("汫\u0001");
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("汪\u0001");
                    break;
            }
            String format = String.format(s4, objArr);
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            e eVar = this.f76014e;
            if (eVar == null) {
                u(3);
            }
            return eVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.n
        protected boolean g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            if (hVar == null) {
                u(9);
            }
            return (hVar instanceof f1) && kotlin.reflect.jvm.internal.impl.resolve.d.f77899a.h(this.f76014e, (f1) hVar, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public List<f1> getParameters() {
            List<f1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                u(2);
            }
            return emptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected Collection<kotlin.reflect.jvm.internal.impl.types.h0> k() {
            List<kotlin.reflect.jvm.internal.impl.types.h0> M0 = this.f76014e.M0();
            if (M0 == null) {
                u(1);
            }
            return M0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.m
        protected kotlin.reflect.jvm.internal.impl.types.h0 l() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected d1 o() {
            d1 d1Var = this.f76013d;
            if (d1Var == null) {
                u(5);
            }
            return d1Var;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.builtins.h p() {
            kotlin.reflect.jvm.internal.impl.builtins.h j4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this.f76014e);
            if (j4 == null) {
                u(4);
            }
            return j4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected List<kotlin.reflect.jvm.internal.impl.types.h0> r(@fg.l List<kotlin.reflect.jvm.internal.impl.types.h0> list) {
            if (list == null) {
                u(7);
            }
            List<kotlin.reflect.jvm.internal.impl.types.h0> I0 = this.f76014e.I0(list);
            if (I0 == null) {
                u(8);
            }
            return I0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        protected void t(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            if (h0Var == null) {
                u(6);
            }
            this.f76014e.L0(h0Var);
        }

        public String toString() {
            return this.f76014e.getName().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l x1 x1Var, boolean z4, int i4, @fg.l a1 a1Var, @fg.l d1 d1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (nVar == null) {
            j0(0);
        }
        if (mVar == null) {
            j0(1);
        }
        if (gVar == null) {
            j0(2);
        }
        if (fVar == null) {
            j0(3);
        }
        if (x1Var == null) {
            j0(4);
        }
        if (a1Var == null) {
            j0(5);
        }
        if (d1Var == null) {
            j0(6);
        }
        this.f76001f = x1Var;
        this.f76002g = z4;
        this.f76003h = i4;
        this.f76004i = nVar.h(new a(nVar, d1Var));
        this.f76005j = nVar.h(new b(fVar));
        this.f76006k = nVar;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                s4 = ProtectedSandApp.s("殯\u0001");
                break;
            case 12:
            default:
                s4 = ProtectedSandApp.s("殮\u0001");
                break;
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i5 = 2;
                break;
            case 12:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("殰\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("殸\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("殷\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("殶\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("段\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("殴\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("殳\u0001");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = s5;
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("殲\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("殱\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("殹\u0001");
        switch (i4) {
            case 7:
                objArr[1] = ProtectedSandApp.s("殿\u0001");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("殾\u0001");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("殽\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("殼\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("殻\u0001");
                break;
            case 12:
            default:
                objArr[1] = s5;
                break;
            case 13:
                objArr[1] = s6;
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("殺\u0001");
                break;
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = s6;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("毀\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.m(this, d5);
    }

    @fg.l
    protected List<kotlin.reflect.jvm.internal.impl.types.h0> I0(@fg.l List<kotlin.reflect.jvm.internal.impl.types.h0> list) {
        if (list == null) {
            j0(12);
        }
        if (list == null) {
            j0(13);
        }
        return list;
    }

    protected abstract void L0(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var);

    @fg.l
    protected abstract List<kotlin.reflect.jvm.internal.impl.types.h0> M0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.storage.n P() {
        kotlin.reflect.jvm.internal.impl.storage.n nVar = this.f76006k;
        if (nVar == null) {
            j0(14);
        }
        return nVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean U() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 L0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public int getIndex() {
        return this.f76003h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.types.h0> getUpperBounds() {
        List<kotlin.reflect.jvm.internal.impl.types.h0> j4 = ((c) j()).j();
        if (j4 == null) {
            j0(8);
        }
        return j4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public final h1 j() {
        h1 invoke = this.f76004i.invoke();
        if (invoke == null) {
            j0(9);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    public boolean l() {
        return this.f76002g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f1
    @fg.l
    public x1 o() {
        x1 x1Var = this.f76001f;
        if (x1Var == null) {
            j0(7);
        }
        return x1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public p0 r() {
        p0 invoke = this.f76005j.invoke();
        if (invoke == null) {
            j0(10);
        }
        return invoke;
    }
}

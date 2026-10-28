package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes6.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {

    @d5.d
    public static final a B = new a(null);

    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b C = new kotlin.reflect.jvm.internal.impl.name.b(l.f24035u, f.p(ProtectedSandApp.s("聏")));

    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b D = new kotlin.reflect.jvm.internal.impl.name.b(l.f24032r, f.p(ProtectedSandApp.s("聐")));

    @d5.d
    private final List<f1> A;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final n f23895u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final l0 f23896v;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private final c f23897w;

    /* renamed from: x, reason: collision with root package name */
    private final int f23898x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final C0270b f23899y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final d f23900z;

    /* compiled from: FunctionClassDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b, reason: collision with other inner class name */
    private final class C0270b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23902a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f23902a = iArr;
            }
        }

        public C0270b() {
            super(b.this.f23895u);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public h b() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected Collection<h0> k() {
            List<kotlin.reflect.jvm.internal.impl.name.b> k5;
            int b02;
            List V5;
            List K5;
            int b03;
            int i5 = a.f23902a[b.this.b1().ordinal()];
            if (i5 == 1) {
                k5 = z.k(b.C);
            } else if (i5 == 2) {
                k5 = a0.O(b.D, new kotlin.reflect.jvm.internal.impl.name.b(l.f24035u, c.Function.numberedClassName(b.this.X0())));
            } else if (i5 == 3) {
                k5 = z.k(b.C);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                k5 = a0.O(b.D, new kotlin.reflect.jvm.internal.impl.name.b(l.f24027m, c.SuspendFunction.numberedClassName(b.this.X0())));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h0 b6 = b.this.f23896v.b();
            b02 = b0.b0(k5, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (kotlin.reflect.jvm.internal.impl.name.b bVar : k5) {
                kotlin.reflect.jvm.internal.impl.descriptors.e a6 = y.a(b6, bVar);
                if (a6 == null) {
                    throw new IllegalStateException((ProtectedSandApp.s("耺") + bVar + ProtectedSandApp.s("耻")).toString());
                }
                K5 = j0.K5(r(), a6.m().r().size());
                b03 = b0.b0(K5, 10);
                ArrayList arrayList2 = new ArrayList(b03);
                Iterator it = K5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new n1(((f1) it.next()).E()));
                }
                d1.f26381p.getClass();
                arrayList.add(i0.g(d1.f26382q, a6, arrayList2));
            }
            V5 = j0.V5(arrayList);
            return V5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.d1 p() {
            return d1.a.f24134a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<f1> r() {
            return b.this.A;
        }

        @d5.d
        public String toString() {
            return b.this.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        /* renamed from: w */
        public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
            return b.this;
        }

        @d5.d
        public b x() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d5.d n nVar, @d5.d l0 l0Var, @d5.d c cVar, int i5) {
        super(nVar, cVar.numberedClassName(i5));
        int b02;
        List<f1> V5;
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("聑"));
        kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("聒"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("聓"));
        this.f23895u = nVar;
        this.f23896v = l0Var;
        this.f23897w = cVar;
        this.f23898x = i5;
        this.f23899y = new C0270b();
        this.f23900z = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i5);
        b02 = b0.b0(intRange, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            R0(arrayList, this, x1.IN_VARIANCE, s.a(ProtectedSandApp.s("联"), ((IntIterator) it).nextInt()));
            arrayList2.add(m2.f23662a);
        }
        R0(arrayList, this, x1.OUT_VARIANCE, ProtectedSandApp.s("聕"));
        V5 = j0.V5(arrayList);
        this.A = V5;
    }

    private static final void R0(ArrayList<f1> arrayList, b bVar, x1 x1Var, String str) {
        arrayList.add(k0.Y0(bVar, g.f24114e.b(), false, x1Var, f.p(str), arrayList.size(), bVar.f23895u));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public h1<p0> G0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean L() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    public final int X0() {
        return this.f23898x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return null;
    }

    @d5.e
    public Void Y0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        return h.c.f26018b;
    }

    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> Z0() {
        return EmptyList.f23167o;
    }

    @d5.d
    public l0 a1() {
        return this.f23896v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    public m b() {
        return this.f23896v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e b0() {
        return null;
    }

    @d5.d
    public final c b1() {
        return this.f23897w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public u c() {
        u uVar = t.f24440e;
        kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("聖"));
        return uVar;
    }

    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e> c1() {
        return EmptyList.f23167o;
    }

    @d5.d
    public h.c d1() {
        return h.c.f26018b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public d S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("聗"));
        return this.f23900z;
    }

    @d5.e
    public Void f1() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public g getAnnotations() {
        return g.f24114e.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        return kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = a1.f24103a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("聘"));
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection l() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h1 m() {
        return this.f23899y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean p() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public e0 r() {
        return e0.ABSTRACT;
    }

    @d5.d
    public String toString() {
        String h5 = getName().h();
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("聙"));
        return h5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection w() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        return false;
    }
}

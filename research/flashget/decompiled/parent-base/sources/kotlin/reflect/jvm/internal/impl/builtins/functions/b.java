package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: FunctionClassDescriptor.kt */
@r1({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1549#2:147\n1620#2,3:148\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n*L\n54#1:147\n54#1:148,3\n*E\n"})
/* loaded from: classes7.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {

    /* renamed from: p, reason: collision with root package name */
    @l
    public static final a f75672p = new a();

    /* renamed from: q, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75673q = new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75836y, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("桎\u0001")));

    /* renamed from: r, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75674r = new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75833v, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("桏\u0001")));

    /* renamed from: h, reason: collision with root package name */
    @l
    private final n f75675h;

    /* renamed from: i, reason: collision with root package name */
    @l
    private final l0 f75676i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private final f f75677j;

    /* renamed from: k, reason: collision with root package name */
    private final int f75678k;

    /* renamed from: l, reason: collision with root package name */
    @l
    private final C1074b f75679l;

    /* renamed from: m, reason: collision with root package name */
    @l
    private final d f75680m;

    /* renamed from: n, reason: collision with root package name */
    @l
    private final List<f1> f75681n;

    /* renamed from: o, reason: collision with root package name */
    @l
    private final c f75682o;

    /* compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    @r1({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1549#2:147\n1620#2,2:148\n1549#2:150\n1620#2,3:151\n1622#2:154\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n*L\n113#1:147\n113#1:148,2\n117#1:150\n117#1:151,3\n113#1:154\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b, reason: collision with other inner class name */
    private final class C1074b extends kotlin.reflect.jvm.internal.impl.types.b {
        public C1074b() {
            super(b.this.f75675h);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public h c() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @l
        public List<f1> getParameters() {
            return b.this.f75681n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @l
        protected Collection<h0> k() {
            List O;
            f V0 = b.this.V0();
            f.a aVar = f.a.f75688e;
            if (kotlin.jvm.internal.l0.g(V0, aVar)) {
                O = kotlin.collections.w.k(b.f75673q);
            } else if (kotlin.jvm.internal.l0.g(V0, f.b.f75689e)) {
                O = kotlin.collections.w.O(b.f75674r, new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75836y, aVar.c(b.this.R0())));
            } else {
                f.d dVar = f.d.f75691e;
                if (kotlin.jvm.internal.l0.g(V0, dVar)) {
                    O = kotlin.collections.w.k(b.f75673q);
                } else {
                    if (!kotlin.jvm.internal.l0.g(V0, f.c.f75690e)) {
                        fe.a.b(null, 1, null);
                        throw null;
                    }
                    O = kotlin.collections.w.O(b.f75674r, new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75828q, dVar.c(b.this.R0())));
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h0 c5 = b.this.f75676i.c();
            List<kotlin.reflect.jvm.internal.impl.name.b> list = O;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            for (kotlin.reflect.jvm.internal.impl.name.b bVar : list) {
                kotlin.reflect.jvm.internal.impl.descriptors.e a5 = y.a(c5, bVar);
                if (a5 == null) {
                    throw new IllegalStateException((ProtectedSandApp.s("根\u0001") + bVar + ProtectedSandApp.s("栺\u0001")).toString());
                }
                List K5 = kotlin.collections.w.K5(b.this.f75681n, a5.j().getParameters().size());
                ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(K5, 10));
                Iterator it = K5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new n1(((f1) it.next()).r()));
                }
                d1.f78389c.getClass();
                arrayList.add(i0.g(d1.f78390d, a5, arrayList2));
            }
            return kotlin.collections.w.V5(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @l
        protected kotlin.reflect.jvm.internal.impl.descriptors.d1 o() {
            return d1.a.f75932a;
        }

        @l
        public String toString() {
            return b.this.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        /* renamed from: v */
        public kotlin.reflect.jvm.internal.impl.descriptors.e c() {
            return b.this;
        }

        @l
        public b w() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@l n nVar, @l l0 l0Var, @l f fVar, int i4) {
        super(nVar, fVar.c(i4));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("桐\u0001"));
        kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("桑\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("桒\u0001"));
        this.f75675h = nVar;
        this.f75676i = l0Var;
        this.f75677j = fVar;
        this.f75678k = i4;
        this.f75679l = new C1074b();
        this.f75680m = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.l lVar = new kotlin.ranges.l(1, i4, 1);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (it.hasNext()) {
            L0(arrayList, this, x1.IN_VARIANCE, android.support.v4.media.a.a(ProtectedSandApp.s("桓\u0001"), ((u0) it).c()));
            arrayList2.add(k2.f75408a);
        }
        L0(arrayList, this, x1.OUT_VARIANCE, ProtectedSandApp.s("桔\u0001"));
        this.f75681n = kotlin.collections.w.V5(arrayList);
        this.f75682o = c.Companion.a(this.f75677j);
    }

    private static final void L0(ArrayList<f1> arrayList, b bVar, x1 x1Var, String str) {
        arrayList.add(k0.S0(bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), false, x1Var, kotlin.reflect.jvm.internal.impl.name.f.f(str), arrayList.size(), bVar.f75675h));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return null;
    }

    public final int R0() {
        return this.f75678k;
    }

    @m
    public Void S0() {
        return null;
    }

    @l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> T0() {
        return j0.f74919b;
    }

    @l
    public l0 U0() {
        return this.f75676i;
    }

    @l
    public final f V0() {
        return this.f75677j;
    }

    @l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e> W0() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @m
    public h1<p0> X() {
        return null;
    }

    @l
    public h.c X0() {
        return h.c.f78002b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @l
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public d l0(@l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("桕\u0001"));
        return this.f75680m;
    }

    @m
    public Void Z0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @l
    public kotlin.reflect.jvm.internal.impl.descriptors.f b() {
        return kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return this.f75676i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @l
    public a1 f() {
        a1 a1Var = a1.f75900a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("桖\u0001"));
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @l
    public u getVisibility() {
        u uVar = t.f76290e;
        kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("桗\u0001"));
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection h() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @l
    public kotlin.reflect.jvm.internal.impl.types.h1 j() {
        return this.f75679l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection m() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        return h.c.f78002b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @l
    public List<f1> s() {
        return this.f75681n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return false;
    }

    @l
    public String toString() {
        String b5 = getName().b();
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("桘\u0001"));
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @l
    public e0 u() {
        return e0.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean v() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean w() {
        return false;
    }
}

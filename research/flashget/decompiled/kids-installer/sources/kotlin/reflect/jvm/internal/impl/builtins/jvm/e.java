package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.j0;
import kotlin.collections.p1;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.w;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes5.dex */
public final class e implements w3.b {

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f23966g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f23967h;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final h0 f23968a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<h0, m> f23969b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f23970c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23964e = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("䕗"), ProtectedSandApp.s("䕘")))};

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final b f23963d = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f23965f = kotlin.reflect.jvm.internal.impl.builtins.l.f24035u;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<h0, kotlin.reflect.jvm.internal.impl.builtins.b> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f23971p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.builtins.b N(@d5.d h0 h0Var) {
            Object B2;
            l0.p(h0Var, ProtectedSandApp.s("胠"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.l0> R = h0Var.V(e.f23965f).R();
            ArrayList arrayList = new ArrayList();
            for (Object obj : R) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                    arrayList.add(obj);
                }
            }
            B2 = j0.B2(arrayList);
            return (kotlin.reflect.jvm.internal.impl.builtins.b) B2;
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class b {
        private b() {
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return e.f23967h;
        }

        public b(w wVar) {
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.impl.h> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ n f23973q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f23973q = nVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.h n() {
            List k5;
            m mVar = (m) e.this.f23969b.N(e.this.f23968a);
            kotlin.reflect.jvm.internal.impl.name.f fVar = e.f23966g;
            e0 e0Var = e0.ABSTRACT;
            kotlin.reflect.jvm.internal.impl.descriptors.f fVar2 = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
            k5 = z.k(e.this.f23968a.A().i());
            kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(mVar, fVar, e0Var, fVar2, k5, a1.f24103a, false, this.f23973q);
            hVar.R0(new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(this.f23973q, hVar), EmptySet.f23181o, null);
            return hVar;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.d dVar = l.a.f24047d;
        kotlin.reflect.jvm.internal.impl.name.f i5 = dVar.i();
        l0.o(i5, ProtectedSandApp.s("䕙"));
        f23966g = i5;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(dVar.l());
        l0.o(m5, ProtectedSandApp.s("䕚"));
        f23967h = m5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@d5.d n nVar, @d5.d h0 h0Var, @d5.d q3.l<? super h0, ? extends m> lVar) {
        l0.p(nVar, ProtectedSandApp.s("䕛"));
        l0.p(h0Var, ProtectedSandApp.s("䕜"));
        l0.p(lVar, ProtectedSandApp.s("䕝"));
        this.f23968a = h0Var;
        this.f23969b = lVar;
        this.f23970c = nVar.d(new c(nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.h i() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.h) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f23970c, this, f23964e[0]);
    }

    @Override // w3.b
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Set f6;
        l0.p(cVar, ProtectedSandApp.s("䕞"));
        if (!l0.g(cVar, f23965f)) {
            return EmptySet.f23181o;
        }
        f6 = p1.f(i());
        return f6;
    }

    @Override // w3.b
    public boolean b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("䕟"));
        l0.p(fVar, ProtectedSandApp.s("䕠"));
        return l0.g(fVar, f23966g) && l0.g(cVar, f23965f);
    }

    @Override // w3.b
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䕡"));
        if (l0.g(bVar, f23967h)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ e(n nVar, h0 h0Var, q3.l lVar, int i5, w wVar) {
        this(nVar, h0Var, (i5 & 4) != 0 ? a.f23971p : lVar);
    }
}

package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f25882a = new c();

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f25883p = new a();

        a() {
            super(2);
        }

        @d5.d
        public final Boolean a(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }

        @Override // q3.p
        public Boolean g0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f25884p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f25885q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            super(2);
            this.f25884p = aVar;
            this.f25885q = aVar2;
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean g0(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.valueOf(l0.g(mVar, this.f25884p) && l0.g(mVar2, this.f25885q));
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0371c extends Lambda implements q3.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0371c f25886p = new C0371c();

        C0371c() {
            super(2);
        }

        @d5.d
        public final Boolean a(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }

        @Override // q3.p
        public Boolean g0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }
    }

    private c() {
    }

    public static /* synthetic */ boolean c(c cVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z5, boolean z6, boolean z7, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z6 = true;
        }
        boolean z8 = z6;
        if ((i5 & 16) != 0) {
            z7 = false;
        }
        return cVar.b(aVar, aVar2, z5, z8, z7, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z5, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, h1 h1Var, h1 h1Var2) {
        l0.p(aVar, ProtectedSandApp.s("兠"));
        l0.p(aVar2, ProtectedSandApp.s("兡"));
        l0.p(h1Var, ProtectedSandApp.s("兢"));
        l0.p(h1Var2, ProtectedSandApp.s("兣"));
        if (l0.g(h1Var, h1Var2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        kotlin.reflect.jvm.internal.impl.descriptors.h b7 = h1Var2.b();
        if ((b6 instanceof f1) && (b7 instanceof f1)) {
            return f25882a.i((f1) b6, (f1) b7, z5, new b(aVar, aVar2));
        }
        return false;
    }

    private final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        return l0.g(eVar.m(), eVar2.m());
    }

    public static /* synthetic */ boolean g(c cVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, boolean z5, boolean z6, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z6 = true;
        }
        return cVar.f(mVar, mVar2, z5, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean j(c cVar, f1 f1Var, f1 f1Var2, boolean z5, q3.p pVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            pVar = C0371c.f25886p;
        }
        return cVar.i(f1Var, f1Var2, z5, pVar);
    }

    private final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, q3.p<? super kotlin.reflect.jvm.internal.impl.descriptors.m, ? super kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> pVar, boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = mVar.b();
        kotlin.reflect.jvm.internal.impl.descriptors.m b7 = mVar2.b();
        return ((b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) || (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) ? pVar.g0(b6, b7).booleanValue() : g(this, b6, b7, z5, false, 8, null);
    }

    private final a1 l(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        Object i5;
        while (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) aVar;
            if (bVar.j() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = bVar.g();
            l0.o(g5, ProtectedSandApp.s("兤"));
            i5 = j0.i5(g5);
            aVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) i5;
            if (aVar == null) {
                return null;
            }
        }
        return aVar.k();
    }

    public final boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z5, boolean z6, boolean z7, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(aVar, ProtectedSandApp.s("入"));
        l0.p(aVar2, ProtectedSandApp.s("兦"));
        l0.p(gVar, ProtectedSandApp.s("內"));
        if (l0.g(aVar, aVar2)) {
            return true;
        }
        if (!l0.g(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z6 && (aVar instanceof d0) && (aVar2 instanceof d0) && ((d0) aVar).U() != ((d0) aVar2).U()) {
            return false;
        }
        if ((l0.g(aVar.b(), aVar2.b()) && (!z5 || !l0.g(l(aVar), l(aVar2)))) || e.E(aVar) || e.E(aVar2) || !k(aVar, aVar2, a.f25883p, z5)) {
            return false;
        }
        k i5 = k.i(gVar, new kotlin.reflect.jvm.internal.impl.resolve.b(z5, aVar, aVar2));
        l0.o(i5, ProtectedSandApp.s("全"));
        boolean z8 = !z7;
        k.i.a c6 = i5.E(aVar, aVar2, null, z8).c();
        k.i.a aVar3 = k.i.a.OVERRIDABLE;
        return c6 == aVar3 && i5.E(aVar2, aVar, null, z8).c() == aVar3;
    }

    public final boolean f(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, boolean z5, boolean z6) {
        return ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) ? e((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar2) : ((mVar instanceof f1) && (mVar2 instanceof f1)) ? j(this, (f1) mVar, (f1) mVar2, z5, null, 8, null) : ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) ? c(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar2, z5, z6, false, g.a.f26343a, 16, null) : ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) ? l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).f(), ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar2).f()) : l0.g(mVar, mVar2);
    }

    @p3.j
    public final boolean h(@d5.d f1 f1Var, @d5.d f1 f1Var2, boolean z5) {
        l0.p(f1Var, ProtectedSandApp.s("兩"));
        l0.p(f1Var2, ProtectedSandApp.s("兪"));
        return j(this, f1Var, f1Var2, z5, null, 8, null);
    }

    @p3.j
    public final boolean i(@d5.d f1 f1Var, @d5.d f1 f1Var2, boolean z5, @d5.d q3.p<? super kotlin.reflect.jvm.internal.impl.descriptors.m, ? super kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> pVar) {
        l0.p(f1Var, ProtectedSandApp.s("八"));
        l0.p(f1Var2, ProtectedSandApp.s("公"));
        l0.p(pVar, ProtectedSandApp.s("六"));
        if (l0.g(f1Var, f1Var2)) {
            return true;
        }
        return !l0.g(f1Var.b(), f1Var2.b()) && k(f1Var, f1Var2, pVar, z5) && f1Var.getIndex() == f1Var2.getIndex();
    }
}

package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.resolve.l;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f77899a = new d();

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class a extends n0 implements ld.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f77900b = new a(2);

        a() {
            super(2);
        }

        @fg.l
        public final Boolean a(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }

        @Override // ld.p
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class b extends n0 implements ld.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f77901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f77902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            super(2);
            this.f77901b = aVar;
            this.f77902c = aVar2;
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.valueOf(l0.g(mVar, this.f77901b) && l0.g(mVar2, this.f77902c));
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class c extends n0 implements ld.p<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f77903b = new c(2);

        c() {
            super(2);
        }

        @fg.l
        public final Boolean a(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }

        @Override // ld.p
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            return Boolean.FALSE;
        }
    }

    private d() {
    }

    public static /* synthetic */ boolean c(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z4, boolean z5, boolean z6, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        boolean z7 = z5;
        if ((i4 & 16) != 0) {
            z6 = false;
        }
        return dVar.b(aVar, aVar2, z4, z7, z6, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z4, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, h1 h1Var, h1 h1Var2) {
        l0.p(aVar, ProtectedSandApp.s("磳\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("磴\u0001"));
        l0.p(h1Var, ProtectedSandApp.s("磵\u0001"));
        l0.p(h1Var2, ProtectedSandApp.s("磶\u0001"));
        if (l0.g(h1Var, h1Var2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        kotlin.reflect.jvm.internal.impl.descriptors.h c6 = h1Var2.c();
        if ((c5 instanceof f1) && (c6 instanceof f1)) {
            return f77899a.i((f1) c5, (f1) c6, z4, new b(aVar, aVar2));
        }
        return false;
    }

    private final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        return l0.g(eVar.j(), eVar2.j());
    }

    public static /* synthetic */ boolean g(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        return dVar.f(mVar, mVar2, z4, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean j(d dVar, f1 f1Var, f1 f1Var2, boolean z4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            pVar = c.f77903b;
        }
        return dVar.i(f1Var, f1Var2, z4, pVar);
    }

    private final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, ld.p<? super kotlin.reflect.jvm.internal.impl.descriptors.m, ? super kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> pVar, boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = mVar.c();
        kotlin.reflect.jvm.internal.impl.descriptors.m c6 = mVar2.c();
        return ((c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) || (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) ? pVar.invoke(c5, c6).booleanValue() : g(this, c5, c6, z4, false, 8, null);
    }

    private final a1 l(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        while (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) aVar;
            if (bVar.b() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar.e();
            l0.o(e4, ProtectedSandApp.s("磷\u0001"));
            aVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) w.i5(e4);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.f();
    }

    public final boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z4, boolean z5, boolean z6, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(aVar, ProtectedSandApp.s("磸\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("磹\u0001"));
        l0.p(gVar, ProtectedSandApp.s("磺\u0001"));
        if (l0.g(aVar, aVar2)) {
            return true;
        }
        if (!l0.g(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z5 && (aVar instanceof d0) && (aVar2 instanceof d0) && ((d0) aVar).m0() != ((d0) aVar2).m0()) {
            return false;
        }
        if ((l0.g(aVar.c(), aVar2.c()) && (!z4 || !l0.g(l(aVar), l(aVar2)))) || f.E(aVar) || f.E(aVar2) || !k(aVar, aVar2, a.f77900b, z4)) {
            return false;
        }
        l i4 = l.i(gVar, new kotlin.reflect.jvm.internal.impl.resolve.c(z4, aVar, aVar2));
        l0.o(i4, ProtectedSandApp.s("磻\u0001"));
        l.i.a c5 = i4.E(aVar, aVar2, null, !z6).c();
        l.i.a aVar3 = l.i.a.OVERRIDABLE;
        return c5 == aVar3 && i4.E(aVar2, aVar, null, z6 ^ true).c() == aVar3;
    }

    public final boolean f(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, boolean z4, boolean z5) {
        return ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) ? e((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar2) : ((mVar instanceof f1) && (mVar2 instanceof f1)) ? j(this, (f1) mVar, (f1) mVar2, z4, null, 8, null) : ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) ? c(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar2, z4, z5, false, g.a.f78351a, 16, null) : ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) ? l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).g(), ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar2).g()) : l0.g(mVar, mVar2);
    }

    @kd.j
    public final boolean h(@fg.l f1 f1Var, @fg.l f1 f1Var2, boolean z4) {
        l0.p(f1Var, ProtectedSandApp.s("磸\u0001"));
        l0.p(f1Var2, ProtectedSandApp.s("磹\u0001"));
        return j(this, f1Var, f1Var2, z4, null, 8, null);
    }

    @kd.j
    public final boolean i(@fg.l f1 f1Var, @fg.l f1 f1Var2, boolean z4, @fg.l ld.p<? super kotlin.reflect.jvm.internal.impl.descriptors.m, ? super kotlin.reflect.jvm.internal.impl.descriptors.m, Boolean> pVar) {
        l0.p(f1Var, ProtectedSandApp.s("磸\u0001"));
        l0.p(f1Var2, ProtectedSandApp.s("磹\u0001"));
        l0.p(pVar, ProtectedSandApp.s("磼\u0001"));
        if (l0.g(f1Var, f1Var2)) {
            return true;
        }
        return !l0.g(f1Var.c(), f1Var2.c()) && k(f1Var, f1Var2, pVar, z4) && f1Var.getIndex() == f1Var2.getIndex();
    }
}

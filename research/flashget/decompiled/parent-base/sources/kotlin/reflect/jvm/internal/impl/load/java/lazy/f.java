package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import kotlin.reflect.jvm.internal.impl.load.java.o;
import kotlin.x;
import wd.u;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes7.dex */
public final class f implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final g f76638a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> f76639b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f76641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(0);
            this.f76641c = uVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h invoke() {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h(f.this.f76638a, this.f76641c);
        }
    }

    public f(@l b bVar) {
        l0.p(bVar, ProtectedSandApp.s("燹\u0001"));
        g gVar = new g(bVar, k.a.f76654a, new x(null));
        this.f76638a = gVar;
        this.f76639b = gVar.e().a();
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        u a5 = o.a(this.f76638a.a().d(), cVar, false, 2, null);
        if (a5 == null) {
            return null;
        }
        return this.f76639b.a(cVar, new a(a5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @l
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> a(@l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("燺\u0001"));
        return w.P(e(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> collection) {
        l0.p(cVar, ProtectedSandApp.s("燺\u0001"));
        l0.p(collection, ProtectedSandApp.s("燻\u0001"));
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, e(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("燺\u0001"));
        return o.a(this.f76638a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.c> z(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(cVar, ProtectedSandApp.s("燺\u0001"));
        l0.p(lVar, ProtectedSandApp.s("燼\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h e4 = e(cVar);
        List<kotlin.reflect.jvm.internal.impl.name.c> Q0 = e4 != null ? e4.Q0() : null;
        return Q0 == null ? j0.f74919b : Q0;
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("燽\u0001") + this.f76638a.a().m();
    }
}

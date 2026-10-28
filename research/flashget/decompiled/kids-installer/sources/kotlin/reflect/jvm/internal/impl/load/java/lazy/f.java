package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b4.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.collections.a0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import kotlin.reflect.jvm.internal.impl.load.java.o;
import q3.l;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes6.dex */
public final class f implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final g f24763a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> f24764b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ u f24766q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(0);
            this.f24766q = uVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h n() {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h(f.this.f24763a, this.f24766q);
        }
    }

    public f(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("蕠"));
        g gVar = new g(bVar, k.a.f24779a, new InitializedLazyImpl(null));
        this.f24763a = gVar;
        this.f24764b = gVar.e().e();
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        u a6 = o.a(this.f24763a.a().d(), cVar, false, 2, null);
        if (a6 == null) {
            return null;
        }
        return this.f24764b.a(cVar, new a(a6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h> P;
        l0.p(cVar, ProtectedSandApp.s("蕡"));
        P = a0.P(e(cVar));
        return P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> collection) {
        l0.p(cVar, ProtectedSandApp.s("蕢"));
        l0.p(collection, ProtectedSandApp.s("蕣"));
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, e(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("蕤"));
        return o.a(this.f24763a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @d5.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(cVar, ProtectedSandApp.s("蕥"));
        l0.p(lVar, ProtectedSandApp.s("蕦"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h e6 = e(cVar);
        List<kotlin.reflect.jvm.internal.impl.name.c> V0 = e6 != null ? e6.V0() : null;
        return V0 == null ? EmptyList.f23167o : V0;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蕧") + this.f24763a.a().m();
    }
}

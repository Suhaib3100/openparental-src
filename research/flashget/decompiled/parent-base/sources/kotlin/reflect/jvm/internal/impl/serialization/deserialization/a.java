package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes7.dex */
public abstract class a implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f78033a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final v f78034b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.h0 f78035c;

    /* renamed from: d, reason: collision with root package name */
    protected k f78036d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, l0> f78037e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a$a, reason: collision with other inner class name */
    static final class C1181a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, l0> {
        C1181a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("竧\u0001"));
            o d5 = a.this.d(cVar);
            if (d5 == null) {
                return null;
            }
            d5.M0(a.this.e());
            return d5;
        }
    }

    public a(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l v vVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("榧\u0001"));
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("榨\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("榩\u0001"));
        this.f78033a = nVar;
        this.f78034b = vVar;
        this.f78035c = h0Var;
        this.f78037e = nVar.b(new C1181a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<l0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("榪\u0001"));
        return kotlin.collections.w.P(this.f78037e.invoke(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("榪\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("榫\u0001"));
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, this.f78037e.invoke(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("榪\u0001"));
        return (this.f78037e.X(cVar) ? (l0) this.f78037e.invoke(cVar) : d(cVar)) == null;
    }

    @fg.m
    protected abstract o d(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);

    @fg.l
    protected final k e() {
        k kVar = this.f78036d;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("榬\u0001"));
        return null;
    }

    @fg.l
    protected final v f() {
        return this.f78034b;
    }

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.descriptors.h0 g() {
        return this.f78035c;
    }

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.storage.n h() {
        return this.f78033a;
    }

    protected final void i(@fg.l k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("榭\u0001"));
        this.f78036d = kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("榪\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("榮\u0001"));
        return kotlin.collections.l0.f74939b;
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes6.dex */
public abstract class a implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f26048a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final u f26049b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h0 f26050c;

    /* renamed from: d, reason: collision with root package name */
    protected k f26051d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, l0> f26052e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a$a, reason: collision with other inner class name */
    static final class C0377a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, l0> {
        C0377a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("蜜"));
            p d6 = a.this.d(cVar);
            if (d6 == null) {
                return null;
            }
            d6.S0(a.this.e());
            return d6;
        }
    }

    public a(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d u uVar, @d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("胰"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("胱"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("胲"));
        this.f26048a = nVar;
        this.f26049b = uVar;
        this.f26050c = h0Var;
        this.f26052e = nVar.i(new C0377a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @d5.d
    public List<l0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        List<l0> P;
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("胳"));
        P = kotlin.collections.a0.P(this.f26052e.N(cVar));
        return P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("胴"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("胵"));
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, this.f26052e.N(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("胶"));
        return (this.f26052e.V(cVar) ? (l0) this.f26052e.N(cVar) : d(cVar)) == null;
    }

    @d5.e
    protected abstract p d(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @d5.d
    protected final k e() {
        k kVar = this.f26051d;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("胷"));
        return null;
    }

    @d5.d
    protected final u f() {
        return this.f26049b;
    }

    @d5.d
    protected final h0 g() {
        return this.f26050c;
    }

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.storage.n h() {
        return this.f26048a;
    }

    protected final void i(@d5.d k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("胸"));
        this.f26051d = kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("胹"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("胺"));
        return EmptySet.f23181o;
    }
}

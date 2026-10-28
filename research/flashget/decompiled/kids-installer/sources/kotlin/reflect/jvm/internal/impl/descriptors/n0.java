package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* compiled from: PackageFragmentProviderImpl.kt */
/* loaded from: classes6.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Collection<l0> f24336a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class a extends Lambda implements q3.l<l0, kotlin.reflect.jvm.internal.impl.name.c> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24337p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c N(@d5.d l0 l0Var) {
            kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("荄"));
            return l0Var.f();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f24338p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f24338p = cVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荅"));
            return Boolean.valueOf(!cVar.d() && kotlin.jvm.internal.l0.g(cVar.e(), this.f24338p));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@d5.d Collection<? extends l0> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("荆"));
        this.f24336a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @d5.d
    public List<l0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荇"));
        Collection<l0> collection = this.f24336a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.l0.g(((l0) obj).f(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荈"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("草"));
        for (Object obj : this.f24336a) {
            if (kotlin.jvm.internal.l0.g(((l0) obj).f(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荊"));
        Collection<l0> collection = this.f24336a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(((l0) it.next()).f(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        Sequence A1;
        Sequence k12;
        Sequence p02;
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荋"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("荌"));
        A1 = kotlin.collections.j0.A1(this.f24336a);
        k12 = kotlin.sequences.v.k1(A1, a.f24337p);
        p02 = kotlin.sequences.v.p0(k12, new b(cVar));
        return kotlin.sequences.v.c3(p02);
    }
}

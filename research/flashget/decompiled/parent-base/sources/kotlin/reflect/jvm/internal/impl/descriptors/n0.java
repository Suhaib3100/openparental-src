package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r1;

/* compiled from: PackageFragmentProviderImpl.kt */
@r1({"SMAP\nPackageFragmentProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n857#2,2:43\n2624#2,3:45\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n*L\n26#1:43,2\n30#1:45,3\n34#1:48\n34#1:49,2\n*E\n"})
/* loaded from: classes7.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Collection<l0> f76186a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<l0, kotlin.reflect.jvm.internal.impl.name.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76187b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c invoke(@fg.l l0 l0Var) {
            kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("渠\u0001"));
            return l0Var.g();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f76188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f76188b = cVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渡\u0001"));
            return Boolean.valueOf(!cVar.d() && kotlin.jvm.internal.l0.g(cVar.e(), this.f76188b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@fg.l Collection<? extends l0> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("渢\u0001"));
        this.f76186a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<l0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渣\u0001"));
        Collection<l0> collection = this.f76186a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.l0.g(((l0) obj).g(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渣\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("渢\u0001"));
        for (Object obj : this.f76186a) {
            if (kotlin.jvm.internal.l0.g(((l0) obj).g(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渣\u0001"));
        Collection<l0> collection = this.f76186a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(((l0) it.next()).g(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渣\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("渤\u0001"));
        return kotlin.sequences.p.c3(kotlin.sequences.p.p0(kotlin.sequences.p.k1(kotlin.collections.w.A1(this.f76186a), a.f76187b), new b(cVar)));
    }
}

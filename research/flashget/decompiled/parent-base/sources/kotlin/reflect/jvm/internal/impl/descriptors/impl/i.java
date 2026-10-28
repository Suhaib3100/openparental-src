package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: CompositePackageFragmentProvider.kt */
@r1({"SMAP\nCompositePackageFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n*L\n51#1:64,3\n*E\n"})
/* loaded from: classes7.dex */
public final class i implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.m0> f76033a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final String f76034b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@fg.l List<? extends kotlin.reflect.jvm.internal.impl.descriptors.m0> list, @fg.l String str) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泚\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("泛\u0001"));
        this.f76033a = list;
        this.f76034b = str;
        list.size();
        kotlin.collections.w.a6(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<kotlin.reflect.jvm.internal.impl.descriptors.l0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("泜\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f76033a.iterator();
        while (it.hasNext()) {
            o0.a(it.next(), cVar, arrayList);
        }
        return kotlin.collections.w.V5(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("泜\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泝\u0001"));
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f76033a.iterator();
        while (it.hasNext()) {
            o0.a(it.next(), cVar, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("泜\u0001"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m0> list = this.f76033a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!o0.b((kotlin.reflect.jvm.internal.impl.descriptors.m0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public String toString() {
        return this.f76034b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("泜\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("泞\u0001"));
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f76033a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().z(cVar, lVar));
        }
        return hashSet;
    }
}

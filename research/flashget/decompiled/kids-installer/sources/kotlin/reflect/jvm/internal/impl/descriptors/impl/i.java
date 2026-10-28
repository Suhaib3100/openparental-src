package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: CompositePackageFragmentProvider.kt */
/* loaded from: classes6.dex */
public final class i implements p0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.m0> f24208a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final String f24209b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@d5.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.m0> list, @d5.d String str) {
        Set a6;
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("艉"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("艊"));
        this.f24208a = list;
        this.f24209b = str;
        list.size();
        a6 = kotlin.collections.j0.a6(list);
        a6.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.l0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.l0> V5;
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("艋"));
        ArrayList arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f24208a.iterator();
        while (it.hasNext()) {
            o0.a(it.next(), cVar, arrayList);
        }
        V5 = kotlin.collections.j0.V5(arrayList);
        return V5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> collection) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("艌"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("艍"));
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f24208a.iterator();
        while (it.hasNext()) {
            o0.a(it.next(), cVar, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("艎"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m0> list = this.f24208a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!o0.b((kotlin.reflect.jvm.internal.impl.descriptors.m0) it.next(), cVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("艏"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("艐"));
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m0> it = this.f24208a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().t(cVar, lVar));
        }
        return hashSet;
    }

    @d5.d
    public String toString() {
        return this.f24209b;
    }
}

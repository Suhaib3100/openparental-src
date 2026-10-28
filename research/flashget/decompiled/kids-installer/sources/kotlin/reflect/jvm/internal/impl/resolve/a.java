package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;

/* compiled from: SealedClassInheritorsProvider.kt */
/* loaded from: classes5.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f25878a = new a();

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a$a, reason: collision with other inner class name */
    public static final class C0370a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t5).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t6).b());
            return l5;
        }
    }

    private a() {
    }

    private static final void b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e> linkedHashSet, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, boolean z5) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : k.a.a(hVar, kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25994t, null, 2, null)) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
                if (eVar2.U()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = eVar2.getName();
                    l0.o(name, ProtectedSandApp.s("兜"));
                    kotlin.reflect.jvm.internal.impl.descriptors.h h5 = hVar.h(name, z3.d.WHEN_GET_ALL_DESCRIPTORS);
                    eVar2 = h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) h5 : h5 instanceof e1 ? ((e1) h5).D() : null;
                }
                if (eVar2 != null) {
                    if (e.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z5) {
                        kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0 = eVar2.F0();
                        l0.o(F0, ProtectedSandApp.s("兝"));
                        b(eVar, linkedHashSet, F0, z5);
                    }
                }
            }
        }
    }

    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar;
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar2;
        List u5;
        l0.p(eVar, ProtectedSandApp.s("兞"));
        if (eVar.r() != e0.SEALED) {
            return EmptyList.f23167o;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z5) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.q(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                mVar = it.next();
                if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
                    break;
                }
            }
            mVar2 = mVar;
        } else {
            mVar2 = eVar.b();
        }
        if (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            b(eVar, linkedHashSet, ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar2).C(), z5);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0 = eVar.F0();
        l0.o(F0, ProtectedSandApp.s("兟"));
        b(eVar, linkedHashSet, F0, true);
        u5 = j0.u5(linkedHashSet, new C0370a());
        return u5;
    }
}

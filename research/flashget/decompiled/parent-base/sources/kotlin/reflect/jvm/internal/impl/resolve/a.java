package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;

/* compiled from: SealedClassInheritorsProvider.kt */
@r1({"SMAP\nSealedClassInheritorsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n179#2,2:87\n1045#3:89\n*S KotlinDebug\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n73#1:87,2\n82#1:89\n*E\n"})
/* loaded from: classes7.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f77859a = new a();

    /* compiled from: Comparisons.kt */
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n1#1,328:1\n82#2:329\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a$a, reason: collision with other inner class name */
    public static final class C1175a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t4).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t5).b());
        }
    }

    private a() {
    }

    private static final void b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e> linkedHashSet, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, boolean z4) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : k.a.a(hVar, kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77978t, null, 2, null)) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
                if (eVar2.m0()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = eVar2.getName();
                    l0.o(name, ProtectedSandApp.s("硶\u0001"));
                    kotlin.reflect.jvm.internal.impl.descriptors.h f4 = hVar.f(name, ud.d.WHEN_GET_ALL_DESCRIPTORS);
                    eVar2 = f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) f4 : f4 instanceof e1 ? ((e1) f4).y() : null;
                }
                if (eVar2 != null) {
                    if (f.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z4) {
                        kotlin.reflect.jvm.internal.impl.resolve.scopes.h W = eVar2.W();
                        l0.o(W, ProtectedSandApp.s("硷\u0001"));
                        b(eVar, linkedHashSet, W, z4);
                    }
                }
            }
        }
    }

    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar;
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar2;
        l0.p(eVar, ProtectedSandApp.s("硸\u0001"));
        if (eVar.u() != e0.SEALED) {
            return j0.f74919b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z4) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.m> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.r(eVar).iterator();
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
            mVar2 = eVar.c();
        }
        if (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            b(eVar, linkedHashSet, ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar2).q(), z4);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h W = eVar.W();
        l0.o(W, ProtectedSandApp.s("硷\u0001"));
        b(eVar, linkedHashSet, W, true);
        return w.u5(linkedHashSet, new C1175a());
    }
}

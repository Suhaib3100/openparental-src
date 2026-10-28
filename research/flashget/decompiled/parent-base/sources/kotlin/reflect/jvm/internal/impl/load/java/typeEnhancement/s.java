package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.java.b0;

/* compiled from: typeEnhancementUtils.kt */
@r1({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1603#3,9:63\n1855#3:72\n1856#3:74\n1612#3:75\n1603#3,9:76\n1855#3:85\n1856#3:87\n1612#3:88\n1603#3,9:89\n1855#3:98\n1856#3:100\n1612#3:101\n1747#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
/* loaded from: classes7.dex */
public final class s {
    @fg.l
    public static final e a(@fg.l e eVar, @fg.l Collection<e> collection, boolean z4, boolean z5, boolean z6) {
        h hVar;
        boolean z7;
        l0.p(eVar, ProtectedSandApp.s("猞\u0001"));
        l0.p(collection, ProtectedSandApp.s("猟\u0001"));
        Collection<e> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            h b5 = b((e) it.next());
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        h e4 = e(w.a6(arrayList), b(eVar), z4);
        if (e4 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                h d5 = ((e) it2.next()).d();
                if (d5 != null) {
                    arrayList2.add(d5);
                }
            }
            hVar = e(w.a6(arrayList2), eVar.d(), z4);
        } else {
            hVar = e4;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            f c5 = ((e) it3.next()).c();
            if (c5 != null) {
                arrayList3.add(c5);
            }
        }
        f fVar = (f) d(w.a6(arrayList3), f.MUTABLE, f.READ_ONLY, eVar.c(), z4);
        h hVar2 = null;
        if (hVar != null && !z6 && (!z5 || hVar != h.NULLABLE)) {
            hVar2 = hVar;
        }
        boolean z10 = false;
        if (hVar2 == h.NOT_NULL) {
            if (!eVar.b()) {
                if (!collection2.isEmpty()) {
                    Iterator<T> it4 = collection2.iterator();
                    while (it4.hasNext()) {
                        if (((e) it4.next()).b()) {
                        }
                    }
                }
            }
            z7 = true;
            if (hVar2 != null && e4 != hVar) {
                z10 = true;
            }
            return new e(hVar2, fVar, z7, z10);
        }
        z7 = false;
        if (hVar2 != null) {
            z10 = true;
        }
        return new e(hVar2, fVar, z7, z10);
    }

    private static final h b(e eVar) {
        if (eVar.e()) {
            return null;
        }
        return eVar.d();
    }

    public static final boolean c(@fg.l kotlin.reflect.jvm.internal.impl.types.r1 r1Var, @fg.l ce.i iVar) {
        l0.p(r1Var, ProtectedSandApp.s("猞\u0001"));
        l0.p(iVar, ProtectedSandApp.s("猠\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = b0.f76346v;
        l0.o(cVar, ProtectedSandApp.s("猡\u0001"));
        return r1Var.M(iVar, cVar);
    }

    private static final <T> T d(Set<? extends T> set, T t4, T t5, T t6, boolean z4) {
        Set<? extends T> a6;
        if (!z4) {
            if (t6 != null && (a6 = w.a6(l1.D(set, t6))) != null) {
                set = a6;
            }
            return (T) w.i5(set);
        }
        T t7 = set.contains(t4) ? t4 : set.contains(t5) ? t5 : null;
        if (l0.g(t7, t4) && l0.g(t6, t5)) {
            return null;
        }
        return t6 == null ? t7 : t6;
    }

    private static final h e(Set<? extends h> set, h hVar, boolean z4) {
        h hVar2 = h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (h) d(set, h.NOT_NULL, h.NULLABLE, hVar, z4);
    }
}

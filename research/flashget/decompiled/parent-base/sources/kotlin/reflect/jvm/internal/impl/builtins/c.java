package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: CompanionObjectMapping.kt */
@r1({"SMAP\nCompanionObjectMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n*L\n12#1:21\n12#1:22,3\n16#1:25,3\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f75665a = new c();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f75666b;

    static {
        Set<i> set = i.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(w.b0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(l.c((i) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.name.c l4 = l.a.f75852h.l();
        String s4 = ProtectedSandApp.s("杵\u0001");
        l0.o(l4, s4);
        List E4 = w.E4(arrayList, l4);
        kotlin.reflect.jvm.internal.impl.name.c l5 = l.a.f75856j.l();
        l0.o(l5, s4);
        List E42 = w.E4(E4, l5);
        kotlin.reflect.jvm.internal.impl.name.c l6 = l.a.f75874s.l();
        l0.o(l6, s4);
        List E43 = w.E4(E42, l6);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = E43.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.b.m((kotlin.reflect.jvm.internal.impl.name.c) it2.next()));
        }
        f75666b = linkedHashSet;
    }

    private c() {
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
        return f75666b;
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return f75666b;
    }
}

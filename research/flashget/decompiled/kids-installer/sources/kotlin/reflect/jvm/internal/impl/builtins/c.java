package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f23889a = new c();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f23890b;

    static {
        int b02;
        List E4;
        List E42;
        List E43;
        Set<i> set = i.NUMBER_TYPES;
        b02 = b0.b0(set, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(l.c((i) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.name.c l5 = l.a.f24055h.l();
        l0.o(l5, ProtectedSandApp.s("䏵"));
        E4 = j0.E4(arrayList, l5);
        kotlin.reflect.jvm.internal.impl.name.c l6 = l.a.f24059j.l();
        l0.o(l6, ProtectedSandApp.s("䏶"));
        E42 = j0.E4(E4, l6);
        kotlin.reflect.jvm.internal.impl.name.c l7 = l.a.f24077s.l();
        l0.o(l7, ProtectedSandApp.s("䏷"));
        E43 = j0.E4(E42, l7);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = E43.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.b.m((kotlin.reflect.jvm.internal.impl.name.c) it2.next()));
        }
        f23890b = linkedHashSet;
    }

    private c() {
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
        return f23890b;
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return f23890b;
    }
}

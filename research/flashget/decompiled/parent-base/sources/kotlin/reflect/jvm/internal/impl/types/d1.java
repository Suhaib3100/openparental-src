package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypeAttributes.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n766#2:161\n857#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
/* loaded from: classes7.dex */
public final class d1 extends kotlin.reflect.jvm.internal.impl.util.e<b1<?>, b1<?>> implements Iterable<b1<?>>, md.a {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f78389c = new a();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final d1 f78390d = new d1(kotlin.collections.j0.f74919b);

    /* compiled from: TypeAttributes.kt */
    @kotlin.jvm.internal.r1({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.s<b1<?>, b1<?>> {
        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.s
        public int b(@fg.l ConcurrentHashMap<String, Integer> concurrentHashMap, @fg.l String str, @fg.l ld.l<? super String, Integer> lVar) {
            int intValue;
            kotlin.jvm.internal.l0.p(concurrentHashMap, ProtectedSandApp.s("緱\u0001"));
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("緲\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("緳\u0001"));
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 == null) {
                        Integer invoke = lVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(invoke.intValue()));
                        num2 = invoke;
                    }
                    kotlin.jvm.internal.l0.m(num2);
                    intValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }

        @fg.l
        public final d1 h(@fg.l List<? extends b1<?>> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("練\u0001"));
            return list.isEmpty() ? d1.f78390d : new d1(list, null);
        }

        @fg.l
        public final d1 i() {
            return d1.f78390d;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ d1(List list, kotlin.jvm.internal.w wVar) {
        this((List<? extends b1<?>>) list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @fg.l
    protected kotlin.reflect.jvm.internal.impl.util.s<b1<?>, b1<?>> c() {
        return f78389c;
    }

    @fg.l
    public final d1 j(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("緼\u0001"));
        if (isEmpty() && d1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f78389c.f().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            b1<?> b1Var = b().get(intValue);
            b1<?> b1Var2 = d1Var.b().get(intValue);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, b1Var == null ? b1Var2 != null ? b1Var2.a(b1Var) : null : b1Var.a(b1Var2));
        }
        return f78389c.h(arrayList);
    }

    public final boolean l(@fg.l b1<?> b1Var) {
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("緽\u0001"));
        return b().get(f78389c.e(b1Var.b())) != null;
    }

    @fg.l
    public final d1 m(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("緼\u0001"));
        if (isEmpty() && d1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f78389c.f().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            b1<?> b1Var = b().get(intValue);
            b1<?> b1Var2 = d1Var.b().get(intValue);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, b1Var == null ? b1Var2 != null ? b1Var2.c(b1Var) : null : b1Var.c(b1Var2));
        }
        return f78389c.h(arrayList);
    }

    @fg.l
    public final d1 p(@fg.l b1<?> b1Var) {
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("緽\u0001"));
        if (l(b1Var)) {
            return this;
        }
        if (isEmpty()) {
            return new d1(b1Var);
        }
        return f78389c.h(kotlin.collections.w.E4(kotlin.collections.w.V5(this), b1Var));
    }

    @fg.l
    public final d1 q(@fg.l b1<?> b1Var) {
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("緽\u0001"));
        if (isEmpty()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.util.c<b1<?>> b5 = b();
        ArrayList arrayList = new ArrayList();
        for (b1<?> b1Var2 : b5) {
            if (!kotlin.jvm.internal.l0.g(b1Var2, b1Var)) {
                arrayList.add(b1Var2);
            }
        }
        return arrayList.size() == b().b() ? this : f78389c.h(arrayList);
    }

    private d1(List<? extends b1<?>> list) {
        for (b1<?> b1Var : list) {
            h(b1Var.b(), b1Var);
        }
    }

    private d1(b1<?> b1Var) {
        this((List<? extends b1<?>>) kotlin.collections.w.k(b1Var));
    }
}

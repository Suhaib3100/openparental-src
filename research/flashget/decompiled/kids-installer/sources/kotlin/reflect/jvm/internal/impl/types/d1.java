package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes6.dex */
public final class d1 extends kotlin.reflect.jvm.internal.impl.util.e<b1<?>, b1<?>> implements Iterable<b1<?>>, r3.a {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f26381p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final d1 f26382q = new d1(EmptyList.f23167o);

    /* compiled from: TypeAttributes.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.s<b1<?>, b1<?>> {
        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.util.s
        public <T extends b1<?>> int b(@d5.d ConcurrentHashMap<KClass<? extends b1<?>>, Integer> concurrentHashMap, @d5.d KClass<T> kClass, @d5.d q3.l<? super KClass<? extends b1<?>>, Integer> lVar) {
            int intValue;
            kotlin.jvm.internal.l0.p(concurrentHashMap, ProtectedSandApp.s("嗵"));
            kotlin.jvm.internal.l0.p(kClass, ProtectedSandApp.s("嗶"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("嗷"));
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer N = lVar.N(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(N.intValue()));
                    num2 = N;
                }
                kotlin.jvm.internal.l0.o(num2, ProtectedSandApp.s("嗸"));
                intValue = num2.intValue();
            }
            return intValue;
        }

        @d5.d
        public final d1 g(@d5.d List<? extends b1<?>> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("嗹"));
            return list.isEmpty() ? d1.f26382q : new d1(list, null);
        }

        @d5.d
        public final d1 h() {
            return d1.f26382q;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ d1(List list, kotlin.jvm.internal.w wVar) {
        this((List<? extends b1<?>>) list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @d5.d
    protected kotlin.reflect.jvm.internal.impl.util.s<b1<?>, b1<?>> f() {
        return f26381p;
    }

    @d5.d
    public final d1 p(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("裥"));
        if (isEmpty() && d1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f26381p.e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            b1<?> b1Var = b().get(intValue);
            b1<?> b1Var2 = d1Var.b().get(intValue);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, b1Var == null ? b1Var2 != null ? b1Var2.a(b1Var) : null : b1Var.a(b1Var2));
        }
        return f26381p.g(arrayList);
    }

    public final boolean q(@d5.d b1<?> b1Var) {
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("裦"));
        return b().get(f26381p.d(b1Var.b())) != null;
    }

    @d5.d
    public final d1 r(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("裧"));
        if (isEmpty() && d1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f26381p.e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            b1<?> b1Var = b().get(intValue);
            b1<?> b1Var2 = d1Var.b().get(intValue);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, b1Var == null ? b1Var2 != null ? b1Var2.c(b1Var) : null : b1Var.c(b1Var2));
        }
        return f26381p.g(arrayList);
    }

    @d5.d
    public final d1 s(@d5.d b1<?> b1Var) {
        List V5;
        List<? extends b1<?>> E4;
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("裨"));
        if (q(b1Var)) {
            return this;
        }
        if (isEmpty()) {
            return new d1(b1Var);
        }
        V5 = kotlin.collections.j0.V5(this);
        E4 = kotlin.collections.j0.E4(V5, b1Var);
        return f26381p.g(E4);
    }

    @d5.d
    public final d1 t(@d5.d b1<?> b1Var) {
        kotlin.jvm.internal.l0.p(b1Var, ProtectedSandApp.s("裩"));
        if (isEmpty()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.util.c<b1<?>> b6 = b();
        ArrayList arrayList = new ArrayList();
        for (b1<?> b1Var2 : b6) {
            if (!kotlin.jvm.internal.l0.g(b1Var2, b1Var)) {
                arrayList.add(b1Var2);
            }
        }
        return arrayList.size() == b().b() ? this : f26381p.g(arrayList);
    }

    private d1(List<? extends b1<?>> list) {
        for (b1<?> b1Var : list) {
            g(b1Var.b(), b1Var);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private d1(kotlin.reflect.jvm.internal.impl.types.b1<?> r1) {
        /*
            r0 = this;
            java.util.List r1 = kotlin.collections.y.k(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.d1.<init>(kotlin.reflect.jvm.internal.impl.types.b1):void");
    }
}

package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: moduleByClassLoader.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "b", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "Lkotlin/k2;", "a", "()V", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/q0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nmoduleByClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 moduleByClassLoader.kt\nkotlin/reflect/jvm/internal/ModuleByClassLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ConcurrentMap<q0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> f75652a = new ConcurrentHashMap();

    public static final void a() {
        f75652a.clear();
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b(@fg.l Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("条\u0001"));
        ClassLoader f4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(cls);
        q0 q0Var = new q0(f4);
        ConcurrentMap<q0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> concurrentMap = f75652a;
        WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> weakReference = concurrentMap.get(q0Var);
        if (weakReference != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(q0Var, weakReference);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.f76217c.a(f4);
        while (true) {
            try {
                ConcurrentMap<q0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> concurrentMap2 = f75652a;
                WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> putIfAbsent = concurrentMap2.putIfAbsent(q0Var, new WeakReference<>(a5));
                if (putIfAbsent == null) {
                    return a5;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar2 = putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(q0Var, putIfAbsent);
            } finally {
                q0Var.a(null);
            }
        }
    }
}

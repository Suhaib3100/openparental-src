package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;

/* compiled from: moduleByClassLoader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0000\"&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "b", "Lkotlin/m2;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/o0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final ConcurrentMap<o0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> f23868a = new ConcurrentHashMap();

    public static final void a() {
        f23868a.clear();
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b(@d5.d Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("䎿"));
        ClassLoader f6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(cls);
        o0 o0Var = new o0(f6);
        ConcurrentMap<o0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> concurrentMap = f23868a;
        WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> weakReference = concurrentMap.get(o0Var);
        if (weakReference != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(o0Var, weakReference);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.f24367c.a(f6);
        while (true) {
            try {
                ConcurrentMap<o0, WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> concurrentMap2 = f23868a;
                WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> putIfAbsent = concurrentMap2.putIfAbsent(o0Var, new WeakReference<>(a6));
                if (putIfAbsent == null) {
                    return a6;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar2 = putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(o0Var, putIfAbsent);
            } finally {
                o0Var.a(null);
            }
        }
    }
}

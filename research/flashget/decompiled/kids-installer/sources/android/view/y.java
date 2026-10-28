package android.view;

import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q3;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/t;", "Landroidx/lifecycle/u;", "a", "(Landroidx/lifecycle/t;)Landroidx/lifecycle/u;", "coroutineScope", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class y {
    @d
    public static final u a(@d t tVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        l0.p(tVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) tVar.f8658a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(tVar, q3.c(null, 1, null).B(m1.e().J0()));
        } while (!x.a(tVar.f8658a, null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m();
        return lifecycleCoroutineScopeImpl;
    }
}

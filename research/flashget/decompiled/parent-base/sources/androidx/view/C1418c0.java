package androidx.view;

import androidx.compose.animation.core.k1;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/w;", "Landroidx/lifecycle/z;", "a", "(Landroidx/lifecycle/w;)Landroidx/lifecycle/z;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1418c0 {
    @l
    public static final AbstractC1453z a(@l AbstractC1450w abstractC1450w) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        l0.p(abstractC1450w, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC1450w.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC1450w, k3.c(null, 1, null).O(j1.e().j1()));
        } while (!k1.a(abstractC1450w.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.h();
        return lifecycleCoroutineScopeImpl;
    }
}

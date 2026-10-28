package androidx.view;

import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.r0;

/* compiled from: ViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "Ljava/lang/String;", "JOB_KEY", "Landroidx/lifecycle/h1;", "Lkotlinx/coroutines/r0;", "(Landroidx/lifecycle/h1;)Lkotlinx/coroutines/r0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final String f30340a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @l
    public static final r0 a(@l h1 h1Var) {
        l0.p(h1Var, "<this>");
        r0 r0Var = (r0) h1Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (r0Var != null) {
            return r0Var;
        }
        Object tagIfAbsent = h1Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1424f(k3.c(null, 1, null).O(j1.e().j1())));
        l0.o(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (r0) tagIfAbsent;
    }
}

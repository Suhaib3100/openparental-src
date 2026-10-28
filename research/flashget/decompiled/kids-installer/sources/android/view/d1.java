package android.view;

import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.u0;

/* compiled from: ViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "Ljava/lang/String;", "JOB_KEY", "Landroidx/lifecycle/c1;", "Lkotlinx/coroutines/u0;", "(Landroidx/lifecycle/c1;)Lkotlinx/coroutines/u0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @d
    private static final String f8524a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @d
    public static final u0 a(@d c1 c1Var) {
        l0.p(c1Var, "<this>");
        u0 u0Var = (u0) c1Var.d("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (u0Var != null) {
            return u0Var;
        }
        Object f6 = c1Var.f("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0528e(q3.c(null, 1, null).B(m1.e().J0())));
        l0.o(f6, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (u0) f6;
    }
}

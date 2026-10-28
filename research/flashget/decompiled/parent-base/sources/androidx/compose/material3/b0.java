package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@androidx.compose.runtime.x4
@f5
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/b0;", "", "Landroidx/compose/foundation/a2;", "mutatePriority", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "()V", "a", "", "isVisible", "()Z", "d", "isPersistent", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b0 {
    static /* synthetic */ Object e(b0 b0Var, androidx.compose.foundation.a2 a2Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i4 & 1) != 0) {
            a2Var = androidx.compose.foundation.a2.Default;
        }
        return b0Var.c(a2Var, dVar);
    }

    void a();

    @fg.m
    Object c(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar);

    boolean d();

    void dismiss();

    boolean isVisible();
}

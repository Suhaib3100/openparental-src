package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@f5
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/x6;", "", "<init>", "()V", "Landroidx/compose/ui/window/q;", "securePolicy", "", "isFocusable", "shouldDismissOnBackPress", "Landroidx/compose/material3/y6;", "a", "(Landroidx/compose/ui/window/q;ZZ)Landroidx/compose/material3/y6;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final x6 f15587a = new x6();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15588b = 0;

    private x6() {
    }

    public static y6 b(x6 x6Var, androidx.compose.ui.window.q qVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qVar = androidx.compose.ui.window.q.Inherit;
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        if ((i4 & 4) != 0) {
            z5 = true;
        }
        x6Var.getClass();
        return new y6(qVar, z4, z5);
    }

    @fg.l
    public final y6 a(@fg.l androidx.compose.ui.window.q securePolicy, boolean isFocusable, boolean shouldDismissOnBackPress) {
        return new y6(securePolicy, isFocusable, shouldDismissOnBackPress);
    }
}

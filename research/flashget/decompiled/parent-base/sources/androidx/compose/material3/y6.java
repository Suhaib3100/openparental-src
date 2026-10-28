package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/y6;", "", "Landroidx/compose/ui/window/q;", "securePolicy", "", "isFocusable", "shouldDismissOnBackPress", "<init>", "(Landroidx/compose/ui/window/q;ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/window/q;", "()Landroidx/compose/ui/window/q;", "b", "Z", "c", "()Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y6 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15809d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.window.q securePolicy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isFocusable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldDismissOnBackPress;

    public y6(@fg.l androidx.compose.ui.window.q qVar, boolean z4, boolean z5) {
        this.securePolicy = qVar;
        this.isFocusable = z4;
        this.shouldDismissOnBackPress = z5;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.window.q getSecurePolicy() {
        return this.securePolicy;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsFocusable() {
        return this.isFocusable;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) other;
        return this.securePolicy == y6Var.securePolicy && this.isFocusable == y6Var.isFocusable && this.shouldDismissOnBackPress == y6Var.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldDismissOnBackPress) + androidx.compose.animation.d1.a(this.isFocusable, this.securePolicy.hashCode() * 31, 31);
    }
}

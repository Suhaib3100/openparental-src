package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import kotlin.Metadata;

/* compiled from: PointerIcon.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/a;", "Landroidx/compose/ui/input/pointer/w;", "Landroid/view/PointerIcon;", "pointerIcon", "<init>", "(Landroid/view/PointerIcon;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Landroid/view/PointerIcon;", "a", "()Landroid/view/PointerIcon;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18701c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PointerIcon pointerIcon;

    public a(@fg.l PointerIcon pointerIcon) {
        this.pointerIcon = pointerIcon;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(a.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l0.n(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return kotlin.jvm.internal.l0.g(this.pointerIcon, ((a) other).pointerIcon);
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    @fg.l
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}

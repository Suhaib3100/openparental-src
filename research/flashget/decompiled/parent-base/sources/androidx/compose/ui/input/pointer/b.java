package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerIcon.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/b;", "Landroidx/compose/ui/input/pointer/w;", "", "type", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18704c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    public b(int i4) {
        this.type = i4;
    }

    /* renamed from: a, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l0.n(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.type == ((b) other).type;
    }

    public int hashCode() {
        return this.type;
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(new StringBuilder("AndroidPointerIcon(type="), this.type, ')');
    }
}

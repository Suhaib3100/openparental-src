package androidx.compose.foundation.layout;

import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@x4
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/l2;", "Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/foundation/layout/t0;", "insets", "", "name", "<init>", "(Landroidx/compose/foundation/layout/t0;Ljava/lang/String;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "e", "<set-?>", "Landroidx/compose/runtime/k2;", "f", "()Landroidx/compose/foundation/layout/t0;", "g", "(Landroidx/compose/foundation/layout/t0;)V", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n367#1:749\n367#1:750,2\n*E\n"})
/* loaded from: classes.dex */
public final class l2 implements n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5194d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 value;

    public l2(@fg.l t0 t0Var, @fg.l String str) {
        androidx.compose.runtime.k2 g4;
        this.name = str;
        g4 = t4.g(t0Var, null, 2, null);
        this.value = g4;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        return f().getTop();
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return f().getRight();
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        return f().getBottom();
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return f().getLeft();
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof l2) {
            return kotlin.jvm.internal.l0.g(f(), ((l2) other).f());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final t0 f() {
        return (t0) this.value.getValue();
    }

    public final void g(@fg.l t0 t0Var) {
        this.value.setValue(t0Var);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @fg.l
    public String toString() {
        return this.name + "(left=" + f().getLeft() + ", top=" + f().getTop() + ", right=" + f().getRight() + ", bottom=" + f().getBottom() + ')';
    }
}

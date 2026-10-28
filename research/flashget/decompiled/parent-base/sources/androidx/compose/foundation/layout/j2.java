package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@x4
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/j2;", "Landroidx/compose/foundation/layout/p0;", "Landroidx/compose/foundation/layout/n2;", "insets", "<init>", "(Landroidx/compose/foundation/layout/n2;)V", "modifierLocalInsets", "b", "(Landroidx/compose/foundation/layout/n2;)Landroidx/compose/foundation/layout/n2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Landroidx/compose/foundation/layout/n2;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j2 extends p0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 insets;

    public j2(@fg.l n2 n2Var) {
        super(null);
        this.insets = n2Var;
    }

    @Override // androidx.compose.foundation.layout.p0
    @fg.l
    public n2 b(@fg.l n2 modifierLocalInsets) {
        return new i2(this.insets, modifierLocalInsets);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof j2) {
            return kotlin.jvm.internal.l0.g(((j2) other).insets, this.insets);
        }
        return false;
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}

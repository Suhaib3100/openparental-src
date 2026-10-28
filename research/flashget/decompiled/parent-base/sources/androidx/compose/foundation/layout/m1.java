package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@x4
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/m1;", "Landroidx/compose/foundation/layout/p0;", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/l1;)V", "Landroidx/compose/foundation/layout/n2;", "modifierLocalInsets", "b", "(Landroidx/compose/foundation/layout/n2;)Landroidx/compose/foundation/layout/n2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Landroidx/compose/foundation/layout/l1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m1 extends p0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 paddingValues;

    public m1(@fg.l l1 l1Var) {
        super(null);
        this.paddingValues = l1Var;
    }

    @Override // androidx.compose.foundation.layout.p0
    @fg.l
    public n2 b(@fg.l n2 modifierLocalInsets) {
        return new a(new o1(this.paddingValues), modifierLocalInsets);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m1) {
            return kotlin.jvm.internal.l0.g(((m1) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}

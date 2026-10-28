package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@x4
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/w;", "Landroidx/compose/ui/modifier/d;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/n2;", "Lkotlin/k2;", "block", "<init>", "(Lld/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/modifier/n;", "scope", "e4", "(Landroidx/compose/ui/modifier/n;)V", "b", "Lld/l;", "c", "Landroidx/compose/foundation/layout/n2;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class w implements androidx.compose.ui.modifier.d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<n2, kotlin.k2> block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n2 oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@fg.l ld.l<? super n2, kotlin.k2> lVar) {
        this.block = lVar;
    }

    @Override // androidx.compose.ui.modifier.d
    public void e4(@fg.l androidx.compose.ui.modifier.n scope) {
        n2 n2Var = (n2) scope.v(d3.c());
        if (kotlin.jvm.internal.l0.g(n2Var, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = n2Var;
        this.block.invoke(n2Var);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof w) {
            return kotlin.jvm.internal.l0.g(((w) other).block, this.block);
        }
        return false;
    }

    public int hashCode() {
        return this.block.hashCode();
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.b2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/layout/b1;", "Landroidx/compose/ui/platform/b2;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/u;", "Lkotlin/k2;", "onSizeChanged", "Landroidx/compose/ui/platform/a2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Lld/l;Lld/l;)V", "size", "l", "(J)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "Lld/l;", "j", "()Lld/l;", "f", "J", "previousSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d1 extends b2 implements b1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.u, k2> onSizeChanged;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long previousSize;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@fg.l ld.l<? super androidx.compose.ui.unit.u, k2> lVar, @fg.l ld.l<? super a2, k2> lVar2) {
        super(lVar2);
        this.onSizeChanged = lVar;
        this.previousSize = androidx.compose.ui.unit.v.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof d1) {
            return kotlin.jvm.internal.l0.g(this.onSizeChanged, ((d1) other).onSizeChanged);
        }
        return false;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.u, k2> j() {
        return this.onSizeChanged;
    }

    @Override // androidx.compose.ui.layout.b1
    public void l(long size) {
        if (androidx.compose.ui.unit.u.h(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(androidx.compose.ui.unit.u.b(size));
        this.previousSize = size;
    }
}

package androidx.compose.ui.focus;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: FocusRestorer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/focus/i0;", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/a0;", "onRestoreFailed", "<init>", "(Lld/a;)V", "s", "()Landroidx/compose/ui/focus/i0;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/ui/focus/i0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/a;", "o", "(Lld/a;)Landroidx/compose/ui/focus/FocusRestorerElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/a;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRestorerElement extends y0<i0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<a0> onRestoreFailed;

    public FocusRestorerElement(@fg.m ld.a<a0> aVar) {
        this.onRestoreFailed = aVar;
    }

    public static FocusRestorerElement r(FocusRestorerElement focusRestorerElement, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = focusRestorerElement.onRestoreFailed;
        }
        focusRestorerElement.getClass();
        return new FocusRestorerElement(aVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusRestorerElement) && kotlin.jvm.internal.l0.g(this.onRestoreFailed, ((FocusRestorerElement) other).onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        ld.a<a0> aVar = this.onRestoreFailed;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("focusRestorer");
        a2Var.getProperties().c("onRestoreFailed", this.onRestoreFailed);
    }

    @fg.m
    public final ld.a<a0> n() {
        return this.onRestoreFailed;
    }

    @fg.l
    public final FocusRestorerElement o(@fg.m ld.a<a0> onRestoreFailed) {
        return new FocusRestorerElement(onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public i0 i() {
        return new i0(this.onRestoreFailed);
    }

    @fg.l
    public String toString() {
        return "FocusRestorerElement(onRestoreFailed=" + this.onRestoreFailed + ')';
    }

    @fg.m
    public final ld.a<a0> u() {
        return this.onRestoreFailed;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l i0 node) {
        node.A7(this.onRestoreFailed);
    }
}

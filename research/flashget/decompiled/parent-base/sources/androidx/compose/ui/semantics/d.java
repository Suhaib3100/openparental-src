package androidx.compose.ui.semantics;

import androidx.compose.ui.node.y1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SemanticsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0014\u0010!\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0012¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/y1;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "Lkotlin/u;", "properties", "<init>", "(ZZLld/l;)V", "f6", "(Landroidx/compose/ui/semantics/z;)V", "p", "Z", "y7", "()Z", "C7", "(Z)V", "q", "A7", "B7", "r", "Lld/l;", "z7", "()Lld/l;", "D7", "(Lld/l;)V", "h1", "shouldClearDescendantSemantics", "s6", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends q.d implements y1 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f20290s = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean mergeDescendants;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super z, k2> properties;

    public d(boolean z4, boolean z5, @fg.l ld.l<? super z, k2> lVar) {
        this.mergeDescendants = z4;
        this.isClearingSemantics = z5;
        this.properties = lVar;
    }

    /* renamed from: A7, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void B7(boolean z4) {
        this.isClearingSemantics = z4;
    }

    public final void C7(boolean z4) {
        this.mergeDescendants = z4;
    }

    public final void D7(@fg.l ld.l<? super z, k2> lVar) {
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l z zVar) {
        this.properties.invoke(zVar);
    }

    @Override // androidx.compose.ui.node.y1
    public boolean h1() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.y1
    /* renamed from: s6, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final boolean y7() {
        return this.mergeDescendants;
    }

    @fg.l
    public final ld.l<z, k2> z7() {
        return this.properties;
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/i0;", "Landroidx/compose/foundation/a;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;Lkotlin/jvm/internal/w;)V", "R7", "(Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;)V", "Landroidx/compose/foundation/k0;", "y", "Landroidx/compose/foundation/k0;", "M7", "()Landroidx/compose/foundation/k0;", "clickableSemanticsNode", "Landroidx/compose/foundation/j0;", "z", "Landroidx/compose/foundation/j0;", "Q7", "()Landroidx/compose/foundation/j0;", "clickablePointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i0 extends a {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k0 clickableSemanticsNode;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 clickablePointerInputNode;

    public /* synthetic */ i0(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, iVar, aVar);
    }

    @Override // androidx.compose.foundation.a
    public b L7() {
        return this.clickablePointerInputNode;
    }

    @Override // androidx.compose.foundation.a
    @fg.l
    /* renamed from: M7, reason: from getter */
    public k0 getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    @fg.l
    /* renamed from: Q7, reason: from getter */
    public j0 getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }

    public final void R7(@fg.l androidx.compose.foundation.interaction.k interactionSource, boolean enabled, @fg.m String onClickLabel, @fg.m androidx.compose.ui.semantics.i role, @fg.l ld.a<kotlin.k2> onClick) {
        O7(interactionSource, enabled, onClickLabel, role, onClick);
        this.clickableSemanticsNode.A7(enabled, onClickLabel, role, onClick, null, null);
        this.clickablePointerInputNode.S7(enabled, interactionSource, onClick);
    }

    private i0(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar) {
        super(kVar, z4, str, iVar, aVar, null);
        this.clickableSemanticsNode = (k0) y7(new k0(z4, str, iVar, aVar, null, null, null));
        this.clickablePointerInputNode = (j0) y7(new j0(z4, kVar, aVar, getInteractionData(), null));
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jn\u0010\u0013\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/o0;", "Landroidx/compose/foundation/n0;", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "<init>", "(Lld/a;Ljava/lang/String;Lld/a;Lld/a;Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lkotlin/jvm/internal/w;)V", "J4", "(Lld/a;Ljava/lang/String;Lld/a;Lld/a;Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;)V", "y", "Lld/a;", "Landroidx/compose/foundation/k0;", "z", "Landroidx/compose/foundation/k0;", "M7", "()Landroidx/compose/foundation/k0;", "clickableSemanticsNode", "Landroidx/compose/foundation/p0;", "A", "Landroidx/compose/foundation/p0;", "Q7", "()Landroidx/compose/foundation/p0;", "clickablePointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o0 extends a implements n0 {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final p0 clickablePointerInputNode;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> onLongClick;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k0 clickableSemanticsNode;

    public /* synthetic */ o0(ld.a aVar, String str, ld.a aVar2, ld.a aVar3, androidx.compose.foundation.interaction.k kVar, boolean z4, String str2, androidx.compose.ui.semantics.i iVar, kotlin.jvm.internal.w wVar) {
        this(aVar, str, aVar2, aVar3, kVar, z4, str2, iVar);
    }

    @Override // androidx.compose.foundation.n0
    public void J4(@fg.l ld.a<kotlin.k2> onClick, @fg.m String onLongClickLabel, @fg.m ld.a<kotlin.k2> onLongClick, @fg.m ld.a<kotlin.k2> onDoubleClick, @fg.l androidx.compose.foundation.interaction.k interactionSource, boolean enabled, @fg.m String onClickLabel, @fg.m androidx.compose.ui.semantics.i role) {
        if ((this.onLongClick == null) != (onLongClick == null)) {
            K7();
        }
        this.onLongClick = onLongClick;
        O7(interactionSource, enabled, onClickLabel, role, onClick);
        this.clickableSemanticsNode.A7(enabled, onClickLabel, role, onClick, onLongClickLabel, onLongClick);
        this.clickablePointerInputNode.U7(enabled, interactionSource, onClick, onLongClick, onDoubleClick);
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
    public p0 getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }

    private o0(ld.a<kotlin.k2> aVar, String str, ld.a<kotlin.k2> aVar2, ld.a<kotlin.k2> aVar3, androidx.compose.foundation.interaction.k kVar, boolean z4, String str2, androidx.compose.ui.semantics.i iVar) {
        super(kVar, z4, str2, iVar, aVar, null);
        this.onLongClick = aVar2;
        this.clickableSemanticsNode = (k0) y7(new k0(z4, str2, iVar, aVar, str, aVar2, null));
        this.clickablePointerInputNode = (p0) y7(new p0(z4, kVar, aVar, getInteractionData(), this.onLongClick, aVar3));
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\f*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/i0;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/i0;", "node", "o", "(Landroidx/compose/foundation/i0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Landroidx/compose/foundation/interaction/k;", "e", "Z", "f", "Ljava/lang/String;", "g", "Landroidx/compose/ui/semantics/i;", "h", "Lld/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends androidx.compose.ui.node.y0<i0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String onClickLabel;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.semantics.i role;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onClick;

    public /* synthetic */ ClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, (i4 & 8) != 0 ? null : iVar, aVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return kotlin.jvm.internal.l0.g(this.interactionSource, clickableElement.interactionSource) && this.enabled == clickableElement.enabled && kotlin.jvm.internal.l0.g(this.onClickLabel, clickableElement.onClickLabel) && kotlin.jvm.internal.l0.g(this.role, clickableElement.role) && kotlin.jvm.internal.l0.g(this.onClick, clickableElement.onClick);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.enabled, this.interactionSource.hashCode() * 31, 31);
        String str = this.onClickLabel;
        int hashCode = (a5 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.role;
        return this.onClick.hashCode() + ((hashCode + (iVar != null ? Integer.hashCode(iVar.getValue()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i0 i() {
        return new i0(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l i0 node) {
        node.R7(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public /* synthetic */ ClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, iVar, aVar);
    }

    private ClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar) {
        this.interactionSource = kVar;
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = iVar;
        this.onClick = aVar;
    }
}

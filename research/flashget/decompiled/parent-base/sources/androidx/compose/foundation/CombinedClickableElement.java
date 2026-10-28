package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\f*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/o0;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "<init>", "(Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;Ljava/lang/String;Lld/a;Lld/a;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/o0;", "node", "o", "(Landroidx/compose/foundation/o0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Landroidx/compose/foundation/interaction/k;", "e", "Z", "f", "Ljava/lang/String;", "g", "Landroidx/compose/ui/semantics/i;", "h", "Lld/a;", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedClickableElement extends androidx.compose.ui.node.y0<o0> {

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

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String onLongClickLabel;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<kotlin.k2> onLongClick;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<kotlin.k2> onDoubleClick;

    public /* synthetic */ CombinedClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, String str2, ld.a aVar2, ld.a aVar3, int i4, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, (i4 & 8) != 0 ? null : iVar, aVar, str2, aVar2, aVar3);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || CombinedClickableElement.class != other.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) other;
        return kotlin.jvm.internal.l0.g(this.interactionSource, combinedClickableElement.interactionSource) && this.enabled == combinedClickableElement.enabled && kotlin.jvm.internal.l0.g(this.onClickLabel, combinedClickableElement.onClickLabel) && kotlin.jvm.internal.l0.g(this.role, combinedClickableElement.role) && kotlin.jvm.internal.l0.g(this.onClick, combinedClickableElement.onClick) && kotlin.jvm.internal.l0.g(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && kotlin.jvm.internal.l0.g(this.onLongClick, combinedClickableElement.onLongClick) && kotlin.jvm.internal.l0.g(this.onDoubleClick, combinedClickableElement.onDoubleClick);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.enabled, this.interactionSource.hashCode() * 31, 31);
        String str = this.onClickLabel;
        int hashCode = (a5 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.role;
        int hashCode2 = (this.onClick.hashCode() + ((hashCode + (iVar != null ? Integer.hashCode(iVar.getValue()) : 0)) * 31)) * 31;
        String str2 = this.onLongClickLabel;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ld.a<kotlin.k2> aVar = this.onLongClick;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ld.a<kotlin.k2> aVar2 = this.onDoubleClick;
        return hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o0 i() {
        return new o0(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l o0 node) {
        node.J4(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.enabled, this.onClickLabel, this.role);
    }

    public /* synthetic */ CombinedClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, String str2, ld.a aVar2, ld.a aVar3, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, iVar, aVar, str2, aVar2, aVar3);
    }

    private CombinedClickableElement(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar, String str2, ld.a<kotlin.k2> aVar2, ld.a<kotlin.k2> aVar3) {
        this.interactionSource = kVar;
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = iVar;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/k0;", "", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "", "onLongClickLabel", "Lkotlin/Function0;", "Lkotlin/k2;", "onLongClick", "onClickLabel", "onClick", "<init>", "(ZLandroidx/compose/ui/semantics/i;Ljava/lang/String;Lld/a;Ljava/lang/String;Lld/a;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/k0;", "node", "o", "(Landroidx/compose/foundation/k0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "e", "Landroidx/compose/ui/semantics/i;", "f", "Ljava/lang/String;", "g", "Lld/a;", "h", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableSemanticsElement extends androidx.compose.ui.node.y0<k0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.semantics.i role;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String onLongClickLabel;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<kotlin.k2> onLongClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String onClickLabel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onClick;

    public /* synthetic */ ClickableSemanticsElement(boolean z4, androidx.compose.ui.semantics.i iVar, String str, ld.a aVar, String str2, ld.a aVar2, kotlin.jvm.internal.w wVar) {
        this(z4, iVar, str, aVar, str2, aVar2);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) other;
        return this.enabled == clickableSemanticsElement.enabled && kotlin.jvm.internal.l0.g(this.role, clickableSemanticsElement.role) && kotlin.jvm.internal.l0.g(this.onLongClickLabel, clickableSemanticsElement.onLongClickLabel) && kotlin.jvm.internal.l0.g(this.onLongClick, clickableSemanticsElement.onLongClick) && kotlin.jvm.internal.l0.g(this.onClickLabel, clickableSemanticsElement.onClickLabel) && kotlin.jvm.internal.l0.g(this.onClick, clickableSemanticsElement.onClick);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        androidx.compose.ui.semantics.i iVar = this.role;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.onLongClickLabel;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ld.a<kotlin.k2> aVar = this.onLongClick;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str2 = this.onClickLabel;
        return this.onClick.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public k0 i() {
        return new k0(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l k0 node) {
        node.A7(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick);
    }

    private ClickableSemanticsElement(boolean z4, androidx.compose.ui.semantics.i iVar, String str, ld.a<kotlin.k2> aVar, String str2, ld.a<kotlin.k2> aVar2) {
        this.enabled = z4;
        this.role = iVar;
        this.onLongClickLabel = str;
        this.onLongClick = aVar;
        this.onClickLabel = str2;
        this.onClick = aVar2;
    }
}

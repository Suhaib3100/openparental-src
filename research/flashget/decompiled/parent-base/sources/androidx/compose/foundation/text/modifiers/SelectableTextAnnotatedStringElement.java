package androidx.compose.foundation.text.modifiers;

import androidx.compose.animation.d1;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\u00020\rHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b-\u0010)J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014HÂ\u0003¢\u0006\u0004\b.\u0010/J&\u00100\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u001aHÂ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u001cHÂ\u0003¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010)J\u0013\u0010@\u001a\u00020\u000b*\u00020?H\u0016¢\u0006\u0004\b@\u0010AJÁ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010PR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010PR\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010NR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010WR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010X\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text/modifiers/i;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/i;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/j;", "selectionController", "Landroidx/compose/ui/graphics/k2;", "color", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;Lld/l;IZIILjava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/ui/text/e;", "u", "()Landroidx/compose/ui/text/v0;", "v", "()Landroidx/compose/ui/text/font/y$b;", "w", "()Lld/l;", "x", "()I", "z", "()Z", "A", "B", "C", "()Ljava/util/List;", "o", "r", "()Landroidx/compose/foundation/text/modifiers/j;", "s", "()Landroidx/compose/ui/graphics/k2;", "H", "()Landroidx/compose/foundation/text/modifiers/i;", "node", "J", "(Landroidx/compose/foundation/text/modifiers/i;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "D", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;Lld/l;IZIILjava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "", "toString", "()Ljava/lang/String;", "d", "Landroidx/compose/ui/text/e;", "e", "Landroidx/compose/ui/text/v0;", "f", "Landroidx/compose/ui/text/font/y$b;", "g", "Lld/l;", "h", "I", "i", "Z", "j", "l", "Ljava/util/List;", "m", "Landroidx/compose/foundation/text/modifiers/j;", "Landroidx/compose/ui/graphics/k2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends y0<i> {

    /* renamed from: p, reason: collision with root package name */
    public static final int f7674p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e text;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 style;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<n0, k2> onTextLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<e.b<a0>> placeholders;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<List<i0.i>, k2> onPlaceholderLayout;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final j selectionController;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.graphics.k2 color;

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l lVar, int i4, boolean z4, int i5, int i6, List list, ld.l lVar2, j jVar, androidx.compose.ui.graphics.k2 k2Var, w wVar) {
        this(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, jVar, k2Var);
    }

    /* renamed from: A, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: B, reason: from getter */
    private final int getMinLines() {
        return this.minLines;
    }

    private final List<e.b<a0>> C() {
        return this.placeholders;
    }

    public static SelectableTextAnnotatedStringElement F(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l lVar, int i4, boolean z4, int i5, int i6, List list, ld.l lVar2, j jVar, androidx.compose.ui.graphics.k2 k2Var, int i7, Object obj) {
        androidx.compose.ui.text.e eVar2 = (i7 & 1) != 0 ? selectableTextAnnotatedStringElement.text : eVar;
        v0 v0Var2 = (i7 & 2) != 0 ? selectableTextAnnotatedStringElement.style : v0Var;
        y.b bVar2 = (i7 & 4) != 0 ? selectableTextAnnotatedStringElement.fontFamilyResolver : bVar;
        ld.l lVar3 = (i7 & 8) != 0 ? selectableTextAnnotatedStringElement.onTextLayout : lVar;
        int i10 = (i7 & 16) != 0 ? selectableTextAnnotatedStringElement.overflow : i4;
        boolean z5 = (i7 & 32) != 0 ? selectableTextAnnotatedStringElement.softWrap : z4;
        int i11 = (i7 & 64) != 0 ? selectableTextAnnotatedStringElement.maxLines : i5;
        int i12 = (i7 & 128) != 0 ? selectableTextAnnotatedStringElement.minLines : i6;
        List list2 = (i7 & 256) != 0 ? selectableTextAnnotatedStringElement.placeholders : list;
        ld.l lVar4 = (i7 & 512) != 0 ? selectableTextAnnotatedStringElement.onPlaceholderLayout : lVar2;
        j jVar2 = (i7 & 1024) != 0 ? selectableTextAnnotatedStringElement.selectionController : jVar;
        androidx.compose.ui.graphics.k2 k2Var2 = (i7 & 2048) != 0 ? selectableTextAnnotatedStringElement.color : k2Var;
        selectableTextAnnotatedStringElement.getClass();
        return new SelectableTextAnnotatedStringElement(eVar2, v0Var2, bVar2, lVar3, i10, z5, i11, i12, list2, lVar4, jVar2, k2Var2);
    }

    /* renamed from: n, reason: from getter */
    private final androidx.compose.ui.text.e getText() {
        return this.text;
    }

    private final ld.l<List<i0.i>, k2> o() {
        return this.onPlaceholderLayout;
    }

    /* renamed from: r, reason: from getter */
    private final j getSelectionController() {
        return this.selectionController;
    }

    /* renamed from: s, reason: from getter */
    private final androidx.compose.ui.graphics.k2 getColor() {
        return this.color;
    }

    /* renamed from: u, reason: from getter */
    private final v0 getStyle() {
        return this.style;
    }

    /* renamed from: v, reason: from getter */
    private final y.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    private final ld.l<n0, k2> w() {
        return this.onTextLayout;
    }

    /* renamed from: x, reason: from getter */
    private final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: z, reason: from getter */
    private final boolean getSoftWrap() {
        return this.softWrap;
    }

    @fg.l
    public final SelectableTextAnnotatedStringElement D(@fg.l androidx.compose.ui.text.e text, @fg.l v0 style, @fg.l y.b fontFamilyResolver, @fg.m ld.l<? super n0, k2> onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, @fg.m List<e.b<a0>> placeholders, @fg.m ld.l<? super List<i0.i>, k2> onPlaceholderLayout, @fg.m j selectionController, @fg.m androidx.compose.ui.graphics.k2 color) {
        return new SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, onTextLayout, overflow, softWrap, maxLines, minLines, placeholders, onPlaceholderLayout, selectionController, color);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public i i() {
        return new i(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l i node) {
        node.J7(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) other;
        return l0.g(this.color, selectableTextAnnotatedStringElement.color) && l0.g(this.text, selectableTextAnnotatedStringElement.text) && l0.g(this.style, selectableTextAnnotatedStringElement.style) && l0.g(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && l0.g(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && l0.g(this.onTextLayout, selectableTextAnnotatedStringElement.onTextLayout) && t.g(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && l0.g(this.onPlaceholderLayout, selectableTextAnnotatedStringElement.onPlaceholderLayout) && l0.g(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = (this.fontFamilyResolver.hashCode() + h.a(this.style, this.text.hashCode() * 31, 31)) * 31;
        ld.l<n0, k2> lVar = this.onTextLayout;
        int a5 = (((d1.a(this.softWrap, (t.h(this.overflow) + ((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31)) * 31, 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<e.b<a0>> list = this.placeholders;
        int hashCode2 = (a5 + (list != null ? list.hashCode() : 0)) * 31;
        ld.l<List<i0.i>, k2> lVar2 = this.onPlaceholderLayout;
        int hashCode3 = (hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        j jVar = this.selectionController;
        int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.k2 k2Var = this.color;
        return hashCode4 + (k2Var != null ? k2Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @fg.l
    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) t.i(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SelectableTextAnnotatedStringElement(androidx.compose.ui.text.e r17, androidx.compose.ui.text.v0 r18, androidx.compose.ui.text.font.y.b r19, ld.l r20, int r21, boolean r22, int r23, int r24, java.util.List r25, ld.l r26, androidx.compose.foundation.text.modifiers.j r27, androidx.compose.ui.graphics.k2 r28, int r29, kotlin.jvm.internal.w r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r20
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r8 = r1
            goto L1c
        L1a:
            r8 = r21
        L1c:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L23
            r9 = r3
            goto L25
        L23:
            r9 = r22
        L25:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L30
        L2e:
            r10 = r23
        L30:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L36
            r11 = r3
            goto L38
        L36:
            r11 = r24
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            r12 = r2
            goto L40
        L3e:
            r12 = r25
        L40:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L46
            r13 = r2
            goto L48
        L46:
            r13 = r26
        L48:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4e
            r14 = r2
            goto L50
        L4e:
            r14 = r27
        L50:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L56
            r15 = r2
            goto L58
        L56:
            r15 = r28
        L58:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, ld.l, int, boolean, int, int, java.util.List, ld.l, androidx.compose.foundation.text.modifiers.j, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l<? super n0, k2> lVar, int i4, boolean z4, int i5, int i6, List<e.b<a0>> list, ld.l<? super List<i0.i>, k2> lVar2, j jVar, androidx.compose.ui.graphics.k2 k2Var) {
        this.text = eVar;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = jVar;
        this.color = k2Var;
    }
}

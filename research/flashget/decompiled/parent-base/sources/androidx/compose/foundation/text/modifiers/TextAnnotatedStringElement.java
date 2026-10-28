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

/* compiled from: TextAnnotatedStringElement.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u000b*\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00107R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010>R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text/modifiers/m;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/i;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/j;", "selectionController", "Landroidx/compose/ui/graphics/k2;", "color", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;Lld/l;IZIILjava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/text/modifiers/m;", "node", "o", "(Landroidx/compose/foundation/text/modifiers/m;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/ui/text/e;", "e", "Landroidx/compose/ui/text/v0;", "f", "Landroidx/compose/ui/text/font/y$b;", "g", "Lld/l;", "h", "I", "i", "Z", "j", "l", "Ljava/util/List;", "m", "Landroidx/compose/foundation/text/modifiers/j;", "Landroidx/compose/ui/graphics/k2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends y0<m> {

    /* renamed from: p, reason: collision with root package name */
    public static final int f7687p = 0;

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

    public /* synthetic */ TextAnnotatedStringElement(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l lVar, int i4, boolean z4, int i5, int i6, List list, ld.l lVar2, j jVar, androidx.compose.ui.graphics.k2 k2Var, w wVar) {
        this(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, jVar, k2Var);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return l0.g(this.color, textAnnotatedStringElement.color) && l0.g(this.text, textAnnotatedStringElement.text) && l0.g(this.style, textAnnotatedStringElement.style) && l0.g(this.placeholders, textAnnotatedStringElement.placeholders) && l0.g(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && l0.g(this.onTextLayout, textAnnotatedStringElement.onTextLayout) && t.g(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && l0.g(this.onPlaceholderLayout, textAnnotatedStringElement.onPlaceholderLayout) && l0.g(this.selectionController, textAnnotatedStringElement.selectionController);
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

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public m i() {
        return new m(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l m node) {
        node.F7(node.S7(this.color, this.style), node.U7(this.text), node.T7(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.R7(this.onTextLayout, this.onPlaceholderLayout, this.selectionController));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextAnnotatedStringElement(androidx.compose.ui.text.e r17, androidx.compose.ui.text.v0 r18, androidx.compose.ui.text.font.y.b r19, ld.l r20, int r21, boolean r22, int r23, int r24, java.util.List r25, ld.l r26, androidx.compose.foundation.text.modifiers.j r27, androidx.compose.ui.graphics.k2 r28, int r29, kotlin.jvm.internal.w r30) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, ld.l, int, boolean, int, int, java.util.List, ld.l, androidx.compose.foundation.text.modifiers.j, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l<? super n0, k2> lVar, int i4, boolean z4, int i5, int i6, List<e.b<a0>> list, ld.l<? super List<i0.i>, k2> lVar2, j jVar, androidx.compose.ui.graphics.k2 k2Var) {
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

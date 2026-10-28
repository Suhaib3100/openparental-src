package androidx.compose.foundation.text.modifiers;

import androidx.compose.animation.d1;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: TextStringSimpleElement.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0017*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text/modifiers/o;", "", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/k2;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZIILandroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/text/modifiers/o;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/foundation/text/modifiers/o;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Ljava/lang/String;", "e", "Landroidx/compose/ui/text/v0;", "f", "Landroidx/compose/ui/text/font/y$b;", "g", "I", "h", "Z", "i", "j", "Landroidx/compose/ui/graphics/k2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends y0<o> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f7700l = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String text;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 style;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final k2 color;

    public /* synthetic */ TextStringSimpleElement(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, k2 k2Var, w wVar) {
        this(str, v0Var, bVar, i4, z4, i5, i6, k2Var);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return l0.g(this.color, textStringSimpleElement.color) && l0.g(this.text, textStringSimpleElement.text) && l0.g(this.style, textStringSimpleElement.style) && l0.g(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && t.g(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = (((d1.a(this.softWrap, (t.h(this.overflow) + ((this.fontFamilyResolver.hashCode() + h.a(this.style, this.text.hashCode() * 31, 31)) * 31)) * 31, 31) + this.maxLines) * 31) + this.minLines) * 31;
        k2 k2Var = this.color;
        return a5 + (k2Var != null ? k2Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o i() {
        return new o(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l o node) {
        node.F7(node.L7(this.color, this.style), node.N7(this.text), node.M7(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStringSimpleElement(java.lang.String r12, androidx.compose.ui.text.v0 r13, androidx.compose.ui.text.font.y.b r14, int r15, boolean r16, int r17, int r18, androidx.compose.ui.graphics.k2 r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L11
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r6 = r1
            goto L12
        L11:
            r6 = r15
        L12:
            r1 = r0 & 16
            r2 = 1
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r16
        L1b:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8 = r1
            goto L26
        L24:
            r8 = r17
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2c
            r9 = r2
            goto L2e
        L2c:
            r9 = r18
        L2e:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L35
            r0 = 0
            r10 = r0
            goto L37
        L35:
            r10 = r19
        L37:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.<init>(java.lang.String, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, int, boolean, int, int, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    private TextStringSimpleElement(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, k2 k2Var) {
        this.text = str;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        this.color = k2Var;
    }
}

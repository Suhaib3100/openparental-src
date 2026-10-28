package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.node.c0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.q;
import androidx.compose.ui.node.s;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: SelectableTextAnnotatedStringNode.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B¯\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\r*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J&\u0010/\u001a\u00020.*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J#\u00104\u001a\u00020\u0013*\u0002012\u0006\u0010+\u001a\u0002022\u0006\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u00105J#\u00107\u001a\u00020\u0013*\u0002012\u0006\u0010+\u001a\u0002022\u0006\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b7\u00105J#\u00108\u001a\u00020\u0013*\u0002012\u0006\u0010+\u001a\u0002022\u0006\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00105J#\u00109\u001a\u00020\u0013*\u0002012\u0006\u0010+\u001a\u0002022\u0006\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u00105J¦\u0001\u0010;\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010:\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b;\u0010<R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/i;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/i;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/j;", "selectionController", "Landroidx/compose/ui/graphics/k2;", "overrideColor", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;Lld/l;IZIILjava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "color", "J7", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IIZLandroidx/compose/ui/text/font/y$b;ILld/l;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;)V", "s", "Landroidx/compose/foundation/text/modifiers/j;", "Landroidx/compose/foundation/text/modifiers/m;", "t", "Landroidx/compose/foundation/text/modifiers/m;", "delegate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends androidx.compose.ui.node.l implements c0, q, s {

    /* renamed from: u, reason: collision with root package name */
    public static final int f7765u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private j selectionController;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m delegate;

    public /* synthetic */ i(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l lVar, int i4, boolean z4, int i5, int i6, List list, ld.l lVar2, j jVar, k2 k2Var, w wVar) {
        this(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, jVar, k2Var);
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        this.delegate.E(cVar);
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return this.delegate.G(qVar, pVar, i4);
    }

    public final void J7(@fg.l androidx.compose.ui.text.e text, @fg.l v0 style, @fg.m List<e.b<a0>> placeholders, int minLines, int maxLines, boolean softWrap, @fg.l y.b fontFamilyResolver, int overflow, @fg.m ld.l<? super n0, kotlin.k2> onTextLayout, @fg.m ld.l<? super List<i0.i>, kotlin.k2> onPlaceholderLayout, @fg.m j selectionController, @fg.m k2 color) {
        m mVar = this.delegate;
        mVar.F7(mVar.S7(color, style), this.delegate.U7(text), this.delegate.T7(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow), this.delegate.R7(onTextLayout, onPlaceholderLayout, selectionController));
        this.selectionController = selectionController;
        f0.b(this);
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return this.delegate.P(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return this.delegate.V(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        j jVar = this.selectionController;
        if (jVar != null) {
            jVar.g(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        return this.delegate.f(o0Var, l0Var, j4);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return this.delegate.p(qVar, pVar, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(androidx.compose.ui.text.e r17, androidx.compose.ui.text.v0 r18, androidx.compose.ui.text.font.y.b r19, ld.l r20, int r21, boolean r22, int r23, int r24, java.util.List r25, ld.l r26, androidx.compose.foundation.text.modifiers.j r27, androidx.compose.ui.graphics.k2 r28, int r29, kotlin.jvm.internal.w r30) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.i.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, ld.l, int, boolean, int, int, java.util.List, ld.l, androidx.compose.foundation.text.modifiers.j, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    private i(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l<? super n0, kotlin.k2> lVar, int i4, boolean z4, int i5, int i6, List<e.b<a0>> list, ld.l<? super List<i0.i>, kotlin.k2> lVar2, j jVar, k2 k2Var) {
        this.selectionController = jVar;
        this.delegate = (m) y7(new m(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, this.selectionController, k2Var, null));
        if (this.selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }
}

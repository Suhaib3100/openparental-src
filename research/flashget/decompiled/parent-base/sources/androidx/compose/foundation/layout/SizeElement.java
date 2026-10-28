package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/e2;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(FFFFZLld/l;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/layout/e2;", "node", "o", "(Landroidx/compose/foundation/layout/e2;)V", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "e", "f", "g", "h", "Z", "i", "Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends androidx.compose.ui.node.y0<e2> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    public /* synthetic */ SizeElement(float f4, float f5, float f6, float f7, boolean z4, ld.l lVar, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, z4, lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return androidx.compose.ui.unit.h.l(this.minWidth, sizeElement.minWidth) && androidx.compose.ui.unit.h.l(this.minHeight, sizeElement.minHeight) && androidx.compose.ui.unit.h.l(this.maxWidth, sizeElement.maxWidth) && androidx.compose.ui.unit.h.l(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.enforceIncoming) + androidx.compose.animation.l0.a(this.maxHeight, androidx.compose.animation.l0.a(this.maxWidth, androidx.compose.animation.l0.a(this.minHeight, androidx.compose.ui.unit.h.n(this.minWidth) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e2 i() {
        return new e2(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l e2 node) {
        node.I7(this.minWidth);
        node.H7(this.minHeight);
        node.G7(this.maxWidth);
        node.F7(this.maxHeight);
        node.E7(this.enforceIncoming);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SizeElement(float r8, float r9, float r10, float r11, boolean r12, ld.l r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto Ld
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.INSTANCE
            r8.getClass()
            float r8 = androidx.compose.ui.unit.h.c()
        Ld:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L1b
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.INSTANCE
            r8.getClass()
            float r9 = androidx.compose.ui.unit.h.c()
        L1b:
            r2 = r9
            r8 = r14 & 4
            if (r8 == 0) goto L29
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.INSTANCE
            r8.getClass()
            float r10 = androidx.compose.ui.unit.h.c()
        L29:
            r3 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L37
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.INSTANCE
            r8.getClass()
            float r11 = androidx.compose.ui.unit.h.c()
        L37:
            r4 = r11
            r0 = r7
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeElement.<init>(float, float, float, float, boolean, ld.l, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f4, float f5, float f6, float f7, boolean z4, ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.minWidth = f4;
        this.minHeight = f5;
        this.maxWidth = f6;
        this.maxHeight = f7;
        this.enforceIncoming = z4;
        this.inspectorInfo = lVar;
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Magnifier.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\n*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R%\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R'\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010-R\u001a\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010-R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/t1;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Li0/f;", "Lkotlin/u;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/l;", "Lkotlin/k2;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/l2;", "platformMagnifierFactory", "<init>", "(Lld/l;Lld/l;Lld/l;FZJFFZLandroidx/compose/foundation/l2;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/t1;", "node", "o", "(Landroidx/compose/foundation/t1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Lld/l;", "e", "f", "g", "F", "h", "Z", "i", "J", "j", "l", "m", "Landroidx/compose/foundation/l2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierElement extends androidx.compose.ui.node.y0<t1> {

    /* renamed from: n, reason: collision with root package name */
    public static final int f3466n = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.d, i0.f> sourceCenter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<androidx.compose.ui.unit.d, i0.f> magnifierCenter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<androidx.compose.ui.unit.l, kotlin.k2> onSizeChanged;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float zoom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean useTextDefault;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 platformMagnifierFactory;

    public /* synthetic */ MagnifierElement(ld.l lVar, ld.l lVar2, ld.l lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, l2 l2Var, kotlin.jvm.internal.w wVar) {
        this(lVar, lVar2, lVar3, f4, z4, j4, f5, f6, z5, l2Var);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) other;
        return kotlin.jvm.internal.l0.g(this.sourceCenter, magnifierElement.sourceCenter) && kotlin.jvm.internal.l0.g(this.magnifierCenter, magnifierElement.magnifierCenter) && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && androidx.compose.ui.unit.l.l(this.size, magnifierElement.size) && androidx.compose.ui.unit.h.l(this.cornerRadius, magnifierElement.cornerRadius) && androidx.compose.ui.unit.h.l(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && kotlin.jvm.internal.l0.g(this.onSizeChanged, magnifierElement.onSizeChanged) && kotlin.jvm.internal.l0.g(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = this.sourceCenter.hashCode() * 31;
        ld.l<androidx.compose.ui.unit.d, i0.f> lVar = this.magnifierCenter;
        int a5 = androidx.compose.animation.d1.a(this.clippingEnabled, androidx.compose.animation.l0.a(this.elevation, (androidx.compose.ui.unit.h.n(this.cornerRadius) + ((androidx.compose.ui.unit.l.r(this.size) + androidx.compose.animation.d1.a(this.useTextDefault, androidx.compose.animation.l0.a(this.zoom, (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31, 31), 31);
        ld.l<androidx.compose.ui.unit.l, kotlin.k2> lVar2 = this.onSizeChanged;
        return this.platformMagnifierFactory.hashCode() + ((a5 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("magnifier");
        a2Var.getProperties().c("sourceCenter", this.sourceCenter);
        a2Var.getProperties().c("magnifierCenter", this.magnifierCenter);
        a2Var.getProperties().c("zoom", Float.valueOf(this.zoom));
        a2Var.getProperties().c("size", androidx.compose.ui.unit.l.c(this.size));
        s1.a(this.elevation, s1.a(this.cornerRadius, a2Var.getProperties(), "cornerRadius", a2Var), "elevation", a2Var).c("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public t1 i() {
        return new t1(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l t1 node) {
        node.d8(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MagnifierElement(ld.l r16, ld.l r17, ld.l r18, float r19, boolean r20, long r21, float r23, float r24, boolean r25, androidx.compose.foundation.l2 r26, int r27, kotlin.jvm.internal.w r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r17
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L11
            r6 = r2
            goto L13
        L11:
            r6 = r18
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r1 = 2143289344(0x7fc00000, float:NaN)
            r7 = r1
            goto L1d
        L1b:
            r7 = r19
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L24
            r1 = 0
            r8 = r1
            goto L26
        L24:
            r8 = r20
        L26:
            r1 = r0 & 32
            if (r1 == 0) goto L35
            androidx.compose.ui.unit.l$a r1 = androidx.compose.ui.unit.l.INSTANCE
            r1.getClass()
            long r1 = androidx.compose.ui.unit.l.a()
            r9 = r1
            goto L37
        L35:
            r9 = r21
        L37:
            r1 = r0 & 64
            if (r1 == 0) goto L46
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.INSTANCE
            r1.getClass()
            float r1 = androidx.compose.ui.unit.h.c()
            r11 = r1
            goto L48
        L46:
            r11 = r23
        L48:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L57
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.INSTANCE
            r1.getClass()
            float r1 = androidx.compose.ui.unit.h.c()
            r12 = r1
            goto L59
        L57:
            r12 = r24
        L59:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            r0 = 1
            r13 = r0
            goto L62
        L60:
            r13 = r25
        L62:
            r3 = r15
            r4 = r16
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierElement.<init>(ld.l, ld.l, ld.l, float, boolean, long, float, float, boolean, androidx.compose.foundation.l2, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar, ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar2, ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, l2 l2Var) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f4;
        this.useTextDefault = z4;
        this.size = j4;
        this.cornerRadius = f5;
        this.elevation = f6;
        this.clippingEnabled = z5;
        this.platformMagnifierFactory = l2Var;
    }
}

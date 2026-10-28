package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u0005HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u000bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001b*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u0010J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/x1;", "", "iterations", "Landroidx/compose/foundation/v1;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/z1;", "spacing", "Landroidx/compose/ui/unit/h;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/z1;FLkotlin/jvm/internal/w;)V", "n", "()I", "o", "r", "s", "u", "()Landroidx/compose/foundation/z1;", "v", "()F", "z", "()Landroidx/compose/foundation/x1;", "node", "Lkotlin/k2;", "A", "(Landroidx/compose/foundation/x1;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "w", "(IIIILandroidx/compose/foundation/z1;F)Landroidx/compose/foundation/MarqueeModifierElement;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "I", "e", "f", "g", "h", "Landroidx/compose/foundation/z1;", "i", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class MarqueeModifierElement extends androidx.compose.ui.node.y0<x1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int iterations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int animationMode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int initialDelayMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z1 spacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int i4, int i5, int i6, int i7, z1 z1Var, float f4, kotlin.jvm.internal.w wVar) {
        this(i4, i5, i6, i7, z1Var, f4);
    }

    /* renamed from: n, reason: from getter */
    private final int getIterations() {
        return this.iterations;
    }

    /* renamed from: o, reason: from getter */
    private final int getAnimationMode() {
        return this.animationMode;
    }

    /* renamed from: r, reason: from getter */
    private final int getDelayMillis() {
        return this.delayMillis;
    }

    /* renamed from: s, reason: from getter */
    private final int getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    /* renamed from: u, reason: from getter */
    private final z1 getSpacing() {
        return this.spacing;
    }

    /* renamed from: v, reason: from getter */
    private final float getVelocity() {
        return this.velocity;
    }

    public static MarqueeModifierElement x(MarqueeModifierElement marqueeModifierElement, int i4, int i5, int i6, int i7, z1 z1Var, float f4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = marqueeModifierElement.iterations;
        }
        if ((i10 & 2) != 0) {
            i5 = marqueeModifierElement.animationMode;
        }
        int i11 = i5;
        if ((i10 & 4) != 0) {
            i6 = marqueeModifierElement.delayMillis;
        }
        int i12 = i6;
        if ((i10 & 8) != 0) {
            i7 = marqueeModifierElement.initialDelayMillis;
        }
        int i13 = i7;
        if ((i10 & 16) != 0) {
            z1Var = marqueeModifierElement.spacing;
        }
        z1 z1Var2 = z1Var;
        if ((i10 & 32) != 0) {
            f4 = marqueeModifierElement.velocity;
        }
        marqueeModifierElement.getClass();
        return new MarqueeModifierElement(i4, i11, i12, i13, z1Var2, f4);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l x1 node) {
        node.X7(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) other;
        return this.iterations == marqueeModifierElement.iterations && v1.f(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && kotlin.jvm.internal.l0.g(this.spacing, marqueeModifierElement.spacing) && androidx.compose.ui.unit.h.l(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return androidx.compose.ui.unit.h.n(this.velocity) + ((this.spacing.hashCode() + w1.a(this.initialDelayMillis, w1.a(this.delayMillis, (v1.g(this.animationMode) + (Integer.hashCode(this.iterations) * 31)) * 31, 31), 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("basicMarquee");
        a2Var.getProperties().c("iterations", Integer.valueOf(this.iterations));
        a2Var.getProperties().c("animationMode", v1.c(this.animationMode));
        a2Var.getProperties().c("delayMillis", Integer.valueOf(this.delayMillis));
        a2Var.getProperties().c("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        a2Var.getProperties().c("spacing", this.spacing);
        a2Var.getProperties().c("velocity", androidx.compose.ui.unit.h.d(this.velocity));
    }

    @fg.l
    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) v1.h(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) androidx.compose.ui.unit.h.s(this.velocity)) + ')';
    }

    @fg.l
    public final MarqueeModifierElement w(int iterations, int animationMode, int delayMillis, int initialDelayMillis, @fg.l z1 spacing, float velocity) {
        return new MarqueeModifierElement(iterations, animationMode, delayMillis, initialDelayMillis, spacing, velocity);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public x1 i() {
        return new x1(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    private MarqueeModifierElement(int i4, int i5, int i6, int i7, z1 z1Var, float f4) {
        this.iterations = i4;
        this.animationMode = i5;
        this.delayMillis = i6;
        this.initialDelayMillis = i7;
        this.spacing = z1Var;
        this.velocity = f4;
    }
}

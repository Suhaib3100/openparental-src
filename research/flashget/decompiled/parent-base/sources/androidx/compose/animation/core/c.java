package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "a", "(FF)Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "positiveInfinityBounds1D", "Landroidx/compose/animation/core/p;", "b", "Landroidx/compose/animation/core/p;", "positiveInfinityBounds2D", "Landroidx/compose/animation/core/q;", "c", "Landroidx/compose/animation/core/q;", "positiveInfinityBounds3D", "Landroidx/compose/animation/core/r;", "d", "Landroidx/compose/animation/core/r;", "positiveInfinityBounds4D", "e", "negativeInfinityBounds1D", "f", "negativeInfinityBounds2D", "g", "negativeInfinityBounds3D", "h", "negativeInfinityBounds4D", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final o f2566a = new o(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final p f2567b = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final q f2568c = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final r f2569d = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final o f2570e = new o(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final p f2571f = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final q f2572g = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final r f2573h = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @fg.l
    public static final b<Float, o> a(float f4, float f5) {
        return new b<>(Float.valueOf(f4), k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(f5), null, 8, null);
    }

    public static /* synthetic */ b b(float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.01f;
        }
        return a(f4, f5);
    }
}

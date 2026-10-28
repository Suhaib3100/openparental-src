package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: Easing.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/d0;", "a", "Landroidx/compose/animation/core/d0;", "d", "()Landroidx/compose/animation/core/d0;", "FastOutSlowInEasing", "b", "f", "LinearOutSlowInEasing", "c", "FastOutLinearInEasing", "e", "LinearEasing", "", "F", "CubicErrorBound", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final d0 f2839a = new x(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final d0 f2840b = new x(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final d0 f2841c = new x(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final d0 f2842d = new l0();

    /* renamed from: e, reason: collision with root package name */
    private static final float f2843e = 0.001f;

    public static float a(float f4) {
        return f4;
    }

    private static final float b(float f4) {
        return f4;
    }

    @fg.l
    public static final d0 c() {
        return f2841c;
    }

    @fg.l
    public static final d0 d() {
        return f2839a;
    }

    @fg.l
    public static final d0 e() {
        return f2842d;
    }

    @fg.l
    public static final d0 f() {
        return f2840b;
    }
}

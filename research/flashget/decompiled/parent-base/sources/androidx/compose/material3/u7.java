package androidx.compose.material3;

import androidx.compose.ui.graphics.i6;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u001a8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u001a8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010 \u001a\u00020\u001a8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010!\u001a\u00020\u001a8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/u7;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "b", "F", "d", "()F", "CircularStrokeWidth", "Landroidx/compose/ui/graphics/i6;", "c", "I", "g", "()I", "LinearStrokeCap", "CircularDeterminateStrokeCap", "e", "CircularIndeterminateStrokeCap", "Landroidx/compose/animation/core/y1;", "", "f", "Landroidx/compose/animation/core/y1;", "i", "()Landroidx/compose/animation/core/y1;", "ProgressAnimationSpec", "Landroidx/compose/ui/graphics/d2;", "(Landroidx/compose/runtime/t;I)J", "linearColor", "a", "circularColor", "h", "linearTrackColor", "circularTrackColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u7 f14959a = new u7();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float CircularStrokeWidth = c0.e.f37178a.b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int LinearStrokeCap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int CircularDeterminateStrokeCap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int CircularIndeterminateStrokeCap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.animation.core.y1<Float> ProgressAnimationSpec;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14965g = 0;

    static {
        i6.Companion companion = androidx.compose.ui.graphics.i6.INSTANCE;
        companion.getClass();
        LinearStrokeCap = androidx.compose.ui.graphics.i6.f17861c;
        companion.getClass();
        CircularDeterminateStrokeCap = androidx.compose.ui.graphics.i6.f17861c;
        companion.getClass();
        CircularIndeterminateStrokeCap = androidx.compose.ui.graphics.i6.f17863e;
        ProgressAnimationSpec = new androidx.compose.animation.core.y1<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private u7() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getCircularColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1803349725);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1803349725, i4, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:601)");
        }
        long k4 = b3.k(c0.e.f37178a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final int b() {
        return CircularDeterminateStrokeCap;
    }

    public final int c() {
        return CircularIndeterminateStrokeCap;
    }

    public final float d() {
        return CircularStrokeWidth;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getCircularTrackColor")
    public final long e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-404222247);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-404222247, i4, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:608)");
        }
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getLinearColor")
    public final long f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-914312983);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-914312983, i4, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:597)");
        }
        long k4 = b3.k(c0.e0.f37188a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final int g() {
        return LinearStrokeCap;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getLinearTrackColor")
    public final long h(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1677541593);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1677541593, i4, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:605)");
        }
        long k4 = b3.k(c0.e0.f37188a.h(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    public final androidx.compose.animation.core.y1<Float> i() {
        return ProgressAnimationSpec;
    }
}

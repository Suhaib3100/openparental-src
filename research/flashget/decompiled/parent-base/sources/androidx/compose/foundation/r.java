package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001aR\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001f\u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\" \u0010\"\u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c\" \u0010(\u001a\u00020\u00078GX\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u001e\u001a\u0004\b%\u0010&\" \u0010.\u001a\u00020\t8GX\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u001e\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/q;", "", "iterations", "Landroidx/compose/foundation/v1;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/z1;", "spacing", "Landroidx/compose/ui/unit/h;", "velocity", "e", "(Landroidx/compose/ui/q;IIIILandroidx/compose/foundation/z1;F)Landroidx/compose/ui/q;", "", "targetValue", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/animation/core/k;", "g", "(IFIIFLandroidx/compose/ui/unit/d;)Landroidx/compose/animation/core/k;", "Landroidx/compose/animation/core/h2;", "p", "(FFI)Landroidx/compose/animation/core/h2;", "b", "(F)Landroidx/compose/foundation/z1;", "a", "I", "j", "()I", "k", "()V", "DefaultMarqueeIterations", "h", "i", "DefaultMarqueeDelayMillis", "c", "Landroidx/compose/foundation/z1;", "l", "()Landroidx/compose/foundation/z1;", "m", "DefaultMarqueeSpacing", "d", "F", "n", "()F", "o", "DefaultMarqueeVelocity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,515:1\n1#2:516\n154#3:517\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n95#1:517\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6952a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6953b = 1200;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final z1 f6954c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f6955d;

    static {
        z1.INSTANCE.getClass();
        f6954c = new y1(0.33333334f);
        f6955d = androidx.compose.ui.unit.h.g(30);
    }

    public static int a(float f4, androidx.compose.ui.unit.d dVar, int i4, int i5) {
        return dVar.q2(f4);
    }

    @fg.l
    @z0
    public static final z1 b(final float f4) {
        return new z1() { // from class: androidx.compose.foundation.q
            @Override // androidx.compose.foundation.z1
            public final int a(androidx.compose.ui.unit.d dVar, int i4, int i5) {
                return r.a(f4, dVar, i4, i5);
            }
        };
    }

    private static final int c(float f4, androidx.compose.ui.unit.d dVar, int i4, int i5) {
        return dVar.q2(f4);
    }

    @x4
    @fg.l
    @z0
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, int i4, int i5, int i6, int i7, @fg.l z1 z1Var, float f4) {
        return qVar.w3(new MarqueeModifierElement(i4, i5, i6, i7, z1Var, f4, null));
    }

    public static androidx.compose.ui.q f(androidx.compose.ui.q qVar, int i4, int i5, int i6, int i7, z1 z1Var, float f4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = f6952a;
        }
        if ((i10 & 2) != 0) {
            v1.INSTANCE.getClass();
            i5 = v1.f9119c;
        }
        int i11 = i5;
        if ((i10 & 4) != 0) {
            i6 = f6953b;
        }
        int i12 = i6;
        if ((i10 & 8) != 0) {
            v1.INSTANCE.getClass();
            i7 = v1.f(i11, v1.f9119c) ? i12 : 0;
        }
        int i13 = i7;
        if ((i10 & 16) != 0) {
            z1Var = f6954c;
        }
        z1 z1Var2 = z1Var;
        if ((i10 & 32) != 0) {
            f4 = f6955d;
        }
        return e(qVar, i4, i11, i12, i13, z1Var2, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.k<Float> g(int i4, float f4, int i5, int i6, float f5, androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.h2<Float> p4 = p(Math.abs(dVar.v5(f5)), f4, i6);
        long d5 = androidx.compose.animation.core.z1.d((-i6) + i5, 0, 2, null);
        return i4 == Integer.MAX_VALUE ? androidx.compose.animation.core.l.f(p4, null, d5, 2, null) : androidx.compose.animation.core.l.l(i4, p4, null, d5, 4, null);
    }

    @z0
    public static final int h() {
        return f6953b;
    }

    @z0
    public static /* synthetic */ void i() {
    }

    @z0
    public static final int j() {
        return f6952a;
    }

    @z0
    public static /* synthetic */ void k() {
    }

    @fg.l
    @z0
    public static final z1 l() {
        return f6954c;
    }

    @z0
    public static /* synthetic */ void m() {
    }

    @z0
    public static final float n() {
        return f6955d;
    }

    @z0
    public static /* synthetic */ void o() {
    }

    private static final androidx.compose.animation.core.h2<Float> p(float f4, float f5, int i4) {
        return new androidx.compose.animation.core.h2<>((int) Math.ceil(f5 / (f4 / 1000.0f)), i4, androidx.compose.animation.core.m0.e());
    }
}

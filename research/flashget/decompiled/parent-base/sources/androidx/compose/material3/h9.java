package androidx.compose.material3;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@kotlin.k(message = "Not necessary with the introduction of Slider state")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/h9;", "", "Lkotlin/ranges/f;", "", "initialActiveRange", "", "initialTickFractions", "<init>", "(Lkotlin/ranges/f;[F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "()Lkotlin/ranges/f;", "c", "(Lkotlin/ranges/f;)V", "activeRange", "b", "()[F", "d", "([F)V", "tickFractions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n81#2:2152\n107#2,2:2153\n81#2:2155\n107#2,2:2156\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1743#1:2152\n1743#1:2153,2\n1751#1:2155\n1751#1:2156,2\n*E\n"})
/* loaded from: classes.dex */
public final class h9 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11355c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 activeRange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 tickFractions;

    /* JADX WARN: Multi-variable type inference failed */
    public h9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @fg.l
    public final kotlin.ranges.f<Float> a() {
        return (kotlin.ranges.f) this.activeRange.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final float[] b() {
        return (float[]) this.tickFractions.getValue();
    }

    public final void c(@fg.l kotlin.ranges.f<Float> fVar) {
        this.activeRange.setValue(fVar);
    }

    public final void d(@fg.l float[] fArr) {
        this.tickFractions.setValue(fArr);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) other;
        return kotlin.jvm.internal.l0.g(a(), h9Var.a()) && Arrays.equals(b(), h9Var.b());
    }

    public int hashCode() {
        return Arrays.hashCode(b()) + (a().hashCode() * 31);
    }

    public h9(@fg.l kotlin.ranges.f<Float> fVar, @fg.l float[] fArr) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        g4 = androidx.compose.runtime.t4.g(fVar, null, 2, null);
        this.activeRange = g4;
        g5 = androidx.compose.runtime.t4.g(fArr, null, 2, null);
        this.tickFractions = g5;
    }

    public /* synthetic */ h9(kotlin.ranges.f fVar, float[] fArr, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? kotlin.ranges.s.e(0.0f, 1.0f) : fVar, (i4 & 2) != 0 ? new float[0] : fArr);
    }
}

package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: VectorizedMonoSplineKeyframesSpec.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0016\u0010#\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0016\u0010(\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/animation/core/u2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/o2;", "Landroidx/collection/h0;", "timestamps", "Landroidx/collection/l0;", "keyframes", "", "durationMillis", "delayMillis", "<init>", "(Landroidx/collection/h0;Landroidx/collection/l0;II)V", "initialValue", "targetValue", "initialVelocity", "Lkotlin/k2;", "n", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)V", "", "playTimeNanos", "m", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "j", "a", "Landroidx/collection/h0;", "b", "Landroidx/collection/l0;", "c", "I", "g", "()I", "d", "e", "Landroidx/compose/animation/core/s;", "valueVector", "f", "velocityVector", "lastInitialValue", "h", "lastTargetValue", "Landroidx/compose/animation/core/f1;", "i", "Landroidx/compose/animation/core/f1;", "monoSpline", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@n0
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,127:1\n266#2,6:128\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n68#1:128,6\n*E\n"})
/* loaded from: classes.dex */
public final class u2<V extends s> implements o2<V> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f2937j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.collection.h0 timestamps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.collection.l0<V> keyframes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private V lastInitialValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private V lastTargetValue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private f1 monoSpline;

    public u2(@fg.l androidx.collection.h0 h0Var, @fg.l androidx.collection.l0<V> l0Var, int i4, int i5) {
        this.timestamps = h0Var;
        this.keyframes = l0Var;
        this.durationMillis = i4;
        this.delayMillis = i5;
    }

    private final void n(V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) t.g(initialValue);
            this.velocityVector = (V) t.g(initialVelocity);
        }
        if (this.monoSpline != null) {
            V v4 = this.lastInitialValue;
            V v5 = null;
            if (v4 == null) {
                kotlin.jvm.internal.l0.S("lastInitialValue");
                v4 = null;
            }
            if (kotlin.jvm.internal.l0.g(v4, initialValue)) {
                V v6 = this.lastTargetValue;
                if (v6 == null) {
                    kotlin.jvm.internal.l0.S("lastTargetValue");
                } else {
                    v5 = v6;
                }
                if (kotlin.jvm.internal.l0.g(v5, targetValue)) {
                    return;
                }
            }
        }
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int i4 = this.keyframes._size;
        int i5 = i4 + 2;
        float[] fArr = new float[i5];
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(new float[initialValue.getSize()]);
        }
        fArr[0] = 0.0f;
        int i7 = i4 + 1;
        float f4 = 1000L;
        fArr[i7] = this.durationMillis / f4;
        float[] fArr2 = (float[]) arrayList.get(0);
        float[] fArr3 = (float[]) arrayList.get(i7);
        int size = initialValue.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            fArr2[i10] = initialValue.a(i10);
            fArr3[i10] = targetValue.a(i10);
        }
        androidx.collection.h0 h0Var = this.timestamps;
        int[] iArr = h0Var.content;
        int i11 = h0Var._size;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            V n4 = this.keyframes.n(i13);
            kotlin.jvm.internal.l0.m(n4);
            V v7 = n4;
            i12++;
            fArr[i12] = i13 / f4;
            float[] fArr4 = (float[]) arrayList.get(i12);
            int length = fArr4.length;
            for (int i14 = 0; i14 < length; i14++) {
                fArr4[i14] = v7.a(i14);
            }
        }
        this.monoSpline = new f1(fArr, arrayList);
    }

    @Override // androidx.compose.animation.core.o2
    /* renamed from: e, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.o2
    /* renamed from: g, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V j(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        long b5 = m2.b(this, playTimeNanos / 1000000);
        if (b5 < 0) {
            return initialVelocity;
        }
        n(initialValue, targetValue, initialVelocity);
        f1 f1Var = this.monoSpline;
        if (f1Var == null) {
            kotlin.jvm.internal.l0.S("monoSpline");
            f1Var = null;
        }
        float f4 = b5 / 1000;
        V v4 = this.velocityVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("velocityVector");
            v4 = null;
        }
        f1Var.g(f4, v4);
        V v5 = this.velocityVector;
        if (v5 != null) {
            return v5;
        }
        kotlin.jvm.internal.l0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V m(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        int b5 = (int) m2.b(this, playTimeNanos / 1000000);
        if (this.keyframes.e(b5)) {
            V n4 = this.keyframes.n(b5);
            kotlin.jvm.internal.l0.m(n4);
            return n4;
        }
        if (b5 >= this.durationMillis) {
            return targetValue;
        }
        if (b5 <= 0) {
            return initialValue;
        }
        n(initialValue, targetValue, initialVelocity);
        f1 f1Var = this.monoSpline;
        if (f1Var == null) {
            kotlin.jvm.internal.l0.S("monoSpline");
            f1Var = null;
        }
        float f4 = b5 / 1000;
        V v4 = this.valueVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("valueVector");
            v4 = null;
        }
        f1Var.d(f4, v4);
        V v5 = this.valueVector;
        if (v5 != null) {
            return v5;
        }
        kotlin.jvm.internal.l0.S("valueVector");
        return null;
    }

    public /* synthetic */ u2(androidx.collection.h0 h0Var, androidx.collection.l0 l0Var, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(h0Var, l0Var, i4, (i6 & 8) != 0 ? 0 : i5);
    }
}

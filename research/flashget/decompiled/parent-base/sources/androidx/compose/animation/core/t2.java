package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/t2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/o2;", "", "", "Lkotlin/q0;", "Landroidx/compose/animation/core/d0;", "keyframes", "durationMillis", "delayMillis", "<init>", "(Ljava/util/Map;II)V", "value", "Lkotlin/k2;", "n", "(Landroidx/compose/animation/core/s;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "m", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "j", "a", "Ljava/util/Map;", "b", "I", "g", "()I", "c", "e", "d", "Landroidx/compose/animation/core/s;", "valueVector", "velocityVector", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t2<V extends s> implements o2<V> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2914f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, kotlin.q0<V, d0>> keyframes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(@fg.l Map<Integer, ? extends kotlin.q0<? extends V, ? extends d0>> map, int i4, int i5) {
        this.keyframes = map;
        this.durationMillis = i4;
        this.delayMillis = i5;
    }

    private final void n(V value) {
        if (this.valueVector == null) {
            this.valueVector = (V) t.g(value);
            this.velocityVector = (V) t.g(value);
        }
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
        if (b5 <= 0) {
            return initialVelocity;
        }
        s e4 = m2.e(this, b5 - 1, initialValue, targetValue, initialVelocity);
        s e5 = m2.e(this, b5, initialValue, targetValue, initialVelocity);
        n(initialValue);
        int size = e4.getSize();
        int i4 = 0;
        while (true) {
            V v4 = null;
            if (i4 >= size) {
                break;
            }
            V v5 = this.velocityVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("velocityVector");
            } else {
                v4 = v5;
            }
            v4.e(i4, (e4.a(i4) - e5.a(i4)) * 1000.0f);
            i4++;
        }
        V v6 = this.velocityVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V m(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        int b5 = (int) m2.b(this, playTimeNanos / 1000000);
        if (this.keyframes.containsKey(Integer.valueOf(b5))) {
            return (V) ((kotlin.q0) kotlin.collections.z0.K(this.keyframes, Integer.valueOf(b5))).e();
        }
        int i4 = this.durationMillis;
        if (b5 >= i4) {
            return targetValue;
        }
        if (b5 <= 0) {
            return initialValue;
        }
        d0 e4 = m0.e();
        int i5 = 0;
        V v4 = initialValue;
        int i6 = 0;
        for (Map.Entry<Integer, kotlin.q0<V, d0>> entry : this.keyframes.entrySet()) {
            int intValue = entry.getKey().intValue();
            kotlin.q0<V, d0> value = entry.getValue();
            if (b5 > intValue && intValue >= i6) {
                v4 = value.e();
                e4 = value.f();
                i6 = intValue;
            } else if (b5 < intValue && intValue <= i4) {
                targetValue = value.e();
                i4 = intValue;
            }
        }
        float a5 = e4.a((b5 - i6) / (i4 - i6));
        n(initialValue);
        int size = v4.getSize();
        while (true) {
            V v5 = null;
            if (i5 >= size) {
                break;
            }
            V v6 = this.valueVector;
            if (v6 == null) {
                kotlin.jvm.internal.l0.S("valueVector");
            } else {
                v5 = v6;
            }
            v5.e(i5, k2.k(v4.a(i5), targetValue.a(i5), a5));
            i5++;
        }
        V v7 = this.valueVector;
        if (v7 != null) {
            return v7;
        }
        kotlin.jvm.internal.l0.S("valueVector");
        return null;
    }

    public /* synthetic */ t2(Map map, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(map, i4, (i6 & 4) != 0 ? 0 : i5);
    }
}

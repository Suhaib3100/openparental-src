package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: AnimationState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b'\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u001b¨\u00067"}, d2 = {"Landroidx/compose/animation/core/m;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/i2;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Landroidx/compose/animation/core/i2;Ljava/lang/Object;Landroidx/compose/animation/core/s;JJZ)V", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/animation/core/i2;", "l", "()Landroidx/compose/animation/core/i2;", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "getValue", "()Ljava/lang/Object;", "F", "(Ljava/lang/Object;)V", "value", "d", "Landroidx/compose/animation/core/s;", "q", "()Landroidx/compose/animation/core/s;", "G", "(Landroidx/compose/animation/core/s;)V", "velocityVector", "e", "J", "i", "()J", "A", "(J)V", "f", "a", "y", "g", "Z", "s", "()Z", "D", "(Z)V", "m", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 4)
@kotlin.jvm.internal.r1({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
/* loaded from: classes.dex */
public final class m<T, V extends s> implements b5<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f2832h = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2<T, V> typeConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private V velocityVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long finishedTimeNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    public m(@fg.l i2<T, V> i2Var, T t4, @fg.m V v4, long j4, long j5, boolean z4) {
        androidx.compose.runtime.k2 g4;
        V v5;
        this.typeConverter = i2Var;
        g4 = t4.g(t4, null, 2, null);
        this.value = g4;
        this.velocityVector = (v4 == null || (v5 = (V) t.e(v4)) == null) ? (V) n.i(i2Var, t4) : v5;
        this.lastFrameTimeNanos = j4;
        this.finishedTimeNanos = j5;
        this.isRunning = z4;
    }

    public final void A(long j4) {
        this.lastFrameTimeNanos = j4;
    }

    public final void D(boolean z4) {
        this.isRunning = z4;
    }

    public void F(T t4) {
        this.value.setValue(t4);
    }

    public final void G(@fg.l V v4) {
        this.velocityVector = v4;
    }

    /* renamed from: a, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    @Override // androidx.compose.runtime.b5
    public T getValue() {
        return this.value.getValue();
    }

    /* renamed from: i, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @fg.l
    public final i2<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    @fg.l
    public final V q() {
        return this.velocityVector;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.value.getValue());
        sb.append(", velocity=");
        sb.append(m());
        sb.append(", isRunning=");
        sb.append(this.isRunning);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.lastFrameTimeNanos);
        sb.append(", finishedTimeNanos=");
        return androidx.collection.y0.a(sb, this.finishedTimeNanos, ')');
    }

    public final void y(long j4) {
        this.finishedTimeNanos = j4;
    }

    public /* synthetic */ m(i2 i2Var, Object obj, s sVar, long j4, long j5, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(i2Var, obj, (i4 & 4) != 0 ? null : sVar, (i4 & 8) != 0 ? Long.MIN_VALUE : j4, (i4 & 16) != 0 ? Long.MIN_VALUE : j5, (i4 & 32) != 0 ? false : z4);
    }
}

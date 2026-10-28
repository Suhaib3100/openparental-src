package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: AnimationState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R+\u0010*\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010)R*\u00100\u001a\u00028\u00012\u0006\u0010%\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b \u0010#\"\u0004\b1\u00102R*\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b\u001c\u0010#\"\u0004\b4\u00102R+\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010:\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b3\u0010\u001f¨\u0006;"}, d2 = {"Landroidx/compose/animation/core/j;", "T", "Landroidx/compose/animation/core/s;", "V", "", "initialValue", "Landroidx/compose/animation/core/i2;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "Lkotlin/k2;", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/s;JLjava/lang/Object;JZLld/a;)V", "a", "()V", "Landroidx/compose/animation/core/m;", "p", "()Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/i2;", "f", "()Landroidx/compose/animation/core/i2;", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "c", "J", "d", "()J", "Lld/a;", "<set-?>", "Landroidx/compose/runtime/k2;", "g", "n", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/animation/core/s;", "i", "()Landroidx/compose/animation/core/s;", "o", "(Landroidx/compose/animation/core/s;)V", "velocityVector", "l", "(J)V", "h", "k", "finishedTimeNanos", "j", "()Z", "m", "(Z)V", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
/* loaded from: classes.dex */
public final class j<T, V extends s> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f2744j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2<T, V> typeConverter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startTimeNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onCancel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private V velocityVector;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long finishedTimeNanos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isRunning;

    public j(T t4, @fg.l i2<T, V> i2Var, @fg.l V v4, long j4, T t5, long j5, boolean z4, @fg.l ld.a<kotlin.k2> aVar) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.typeConverter = i2Var;
        this.targetValue = t5;
        this.startTimeNanos = j5;
        this.onCancel = aVar;
        g4 = t4.g(t4, null, 2, null);
        this.value = g4;
        this.velocityVector = (V) t.e(v4);
        this.lastFrameTimeNanos = j4;
        this.finishedTimeNanos = Long.MIN_VALUE;
        g5 = t4.g(Boolean.valueOf(z4), null, 2, null);
        this.isRunning = g5;
    }

    public final void a() {
        m(false);
        this.onCancel.invoke();
    }

    /* renamed from: b, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* renamed from: c, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    /* renamed from: d, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T e() {
        return this.targetValue;
    }

    @fg.l
    public final i2<T, V> f() {
        return this.typeConverter;
    }

    public final T g() {
        return this.value.getValue();
    }

    public final T h() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    @fg.l
    public final V i() {
        return this.velocityVector;
    }

    public final boolean j() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void k(long j4) {
        this.finishedTimeNanos = j4;
    }

    public final void l(long j4) {
        this.lastFrameTimeNanos = j4;
    }

    public final void m(boolean z4) {
        this.isRunning.setValue(Boolean.valueOf(z4));
    }

    public final void n(T t4) {
        this.value.setValue(t4);
    }

    public final void o(@fg.l V v4) {
        this.velocityVector = v4;
    }

    @fg.l
    public final m<T, V> p() {
        return new m<>(this.typeConverter, this.value.getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, j());
    }
}

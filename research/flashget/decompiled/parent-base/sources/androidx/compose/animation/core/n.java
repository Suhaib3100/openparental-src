package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationState.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001d\u0010\u001e\u001a\u00020\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/m;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Landroidx/compose/animation/core/m;Ljava/lang/Object;Landroidx/compose/animation/core/s;JJZ)Landroidx/compose/animation/core/m;", "", "Landroidx/compose/animation/core/o;", "velocity", "e", "(Landroidx/compose/animation/core/m;FFJJZ)Landroidx/compose/animation/core/m;", "initialValue", "initialVelocity", "a", "(FFJJZ)Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/i2;", "typeConverter", "b", "(Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/m;", "i", "(Landroidx/compose/animation/core/i2;Ljava/lang/Object;)Landroidx/compose/animation/core/s;", "j", "(Landroidx/compose/animation/core/m;)Z", "isFinished", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
/* loaded from: classes.dex */
public final class n {
    @fg.l
    public static final m<Float, o> a(float f4, float f5, long j4, long j5, boolean z4) {
        return new m<>(k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(f4), new o(f5), j4, j5, z4);
    }

    @fg.l
    public static final <T, V extends s> m<T, V> b(@fg.l i2<T, V> i2Var, T t4, T t5, long j4, long j5, boolean z4) {
        return new m<>(i2Var, t4, i2Var.a().invoke(t5), j4, j5, z4);
    }

    public static /* synthetic */ m c(float f4, float f5, long j4, long j5, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        long j6 = (i4 & 4) != 0 ? Long.MIN_VALUE : j4;
        long j7 = (i4 & 8) == 0 ? j5 : Long.MIN_VALUE;
        if ((i4 & 16) != 0) {
            z4 = false;
        }
        return a(f4, f5, j6, j7, z4);
    }

    @fg.l
    public static final m<Float, o> e(@fg.l m<Float, o> mVar, float f4, float f5, long j4, long j5, boolean z4) {
        return new m<>(mVar.l(), Float.valueOf(f4), new o(f5), j4, j5, z4);
    }

    @fg.l
    public static final <T, V extends s> m<T, V> f(@fg.l m<T, V> mVar, T t4, @fg.m V v4, long j4, long j5, boolean z4) {
        return new m<>(mVar.l(), t4, v4, j4, j5, z4);
    }

    public static /* synthetic */ m g(m mVar, float f4, float f5, long j4, long j5, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = ((Number) mVar.getValue()).floatValue();
        }
        if ((i4 & 2) != 0) {
            f5 = ((o) mVar.q()).getValue();
        }
        float f6 = f5;
        if ((i4 & 4) != 0) {
            j4 = mVar.getLastFrameTimeNanos();
        }
        long j6 = j4;
        if ((i4 & 8) != 0) {
            j5 = mVar.getFinishedTimeNanos();
        }
        long j7 = j5;
        if ((i4 & 16) != 0) {
            z4 = mVar.getIsRunning();
        }
        return e(mVar, f4, f6, j6, j7, z4);
    }

    public static /* synthetic */ m h(m mVar, Object obj, s sVar, long j4, long j5, boolean z4, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = mVar.getValue();
        }
        if ((i4 & 2) != 0) {
            sVar = t.e(mVar.q());
        }
        s sVar2 = sVar;
        if ((i4 & 4) != 0) {
            j4 = mVar.getLastFrameTimeNanos();
        }
        long j6 = j4;
        if ((i4 & 8) != 0) {
            j5 = mVar.getFinishedTimeNanos();
        }
        long j7 = j5;
        if ((i4 & 16) != 0) {
            z4 = mVar.getIsRunning();
        }
        return f(mVar, obj, sVar2, j6, j7, z4);
    }

    @fg.l
    public static final <T, V extends s> V i(@fg.l i2<T, V> i2Var, T t4) {
        V invoke = i2Var.a().invoke(t4);
        invoke.d();
        return invoke;
    }

    public static final boolean j(@fg.l m<?, ?> mVar) {
        return mVar.getFinishedTimeNanos() != Long.MIN_VALUE;
    }
}

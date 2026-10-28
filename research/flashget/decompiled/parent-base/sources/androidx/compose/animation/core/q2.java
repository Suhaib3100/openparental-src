package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/q2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/p2;", "Landroidx/compose/animation/core/u;", "anims", "<init>", "(Landroidx/compose/animation/core/u;)V", "Landroidx/compose/animation/core/q0;", "anim", "(Landroidx/compose/animation/core/q0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "m", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "j", "f", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "b", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "a", "Landroidx/compose/animation/core/u;", "Landroidx/compose/animation/core/s;", "valueVector", "c", "velocityVector", "d", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,818:1\n1855#2,2:819\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n809#1:819,2\n*E\n"})
/* loaded from: classes.dex */
public final class q2<V extends s> implements p2<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2864e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u anims;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/animation/core/q2$a", "Landroidx/compose/animation/core/u;", "", "index", "Landroidx/compose/animation/core/q0;", "get", "(I)Landroidx/compose/animation/core/q0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f2869a;

        a(q0 q0Var) {
            this.f2869a = q0Var;
        }

        @Override // androidx.compose.animation.core.u
        @fg.l
        public q0 get(int index) {
            return this.f2869a;
        }
    }

    public q2(@fg.l u uVar) {
        this.anims = uVar;
    }

    @Override // androidx.compose.animation.core.l2
    public long b(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        Iterator<Integer> it = kotlin.ranges.s.W1(0, initialValue.getSize()).iterator();
        long j4 = 0;
        while (it.hasNext()) {
            int c5 = ((kotlin.collections.u0) it).c();
            j4 = Math.max(j4, this.anims.get(c5).f(initialValue.a(c5), targetValue.a(c5), initialVelocity.a(c5)));
        }
        return j4;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V f(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) t.g(initialVelocity);
        }
        V v4 = this.endVelocityVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("endVelocityVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.endVelocityVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("endVelocityVector");
                v5 = null;
            }
            v5.e(i4, this.anims.get(i4).c(initialValue.a(i4), targetValue.a(i4), initialVelocity.a(i4)));
        }
        V v6 = this.endVelocityVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V j(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) t.g(initialVelocity);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("velocityVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.velocityVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("velocityVector");
                v5 = null;
            }
            v5.e(i4, this.anims.get(i4).e(playTimeNanos, initialValue.a(i4), targetValue.a(i4), initialVelocity.a(i4)));
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
        if (this.valueVector == null) {
            this.valueVector = (V) t.g(initialValue);
        }
        V v4 = this.valueVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("valueVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.valueVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("valueVector");
                v5 = null;
            }
            v5.e(i4, this.anims.get(i4).d(playTimeNanos, initialValue.a(i4), targetValue.a(i4), initialVelocity.a(i4)));
        }
        V v6 = this.valueVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("valueVector");
        return null;
    }

    public q2(@fg.l q0 q0Var) {
        this(new a(q0Var));
    }
}

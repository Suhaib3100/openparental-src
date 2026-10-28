package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/l2;", "initialValue", "targetValue", "initialVelocity", "", "d", "(Landroidx/compose/animation/core/l2;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "playTimeMillis", "start", "end", "startVelocity", "e", "(Landroidx/compose/animation/core/l2;JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "Landroidx/compose/animation/core/o2;", "playTime", "b", "(Landroidx/compose/animation/core/o2;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Landroidx/compose/animation/core/u;", "c", "(Landroidx/compose/animation/core/s;FF)Landroidx/compose/animation/core/u;", "", "a", "I", "InfiniteIterations", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2847a = Integer.MAX_VALUE;

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"androidx/compose/animation/core/m2$a", "Landroidx/compose/animation/core/u;", "", "index", "Landroidx/compose/animation/core/u0;", "a", "(I)Landroidx/compose/animation/core/u0;", "", "Ljava/util/List;", "anims", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,818:1\n1549#2:819\n1620#2,3:820\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n676#1:819\n676#1:820,3\n*E\n"})
    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<u0> anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(s sVar, float f4, float f5) {
            kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, sVar.getSize());
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                arrayList.add(new u0(f4, f5, sVar.a(((kotlin.collections.u0) it).c())));
            }
            this.anims = arrayList;
        }

        @Override // androidx.compose.animation.core.u
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 get(int index) {
            return this.anims.get(index);
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/animation/core/m2$b", "Landroidx/compose/animation/core/u;", "", "index", "Landroidx/compose/animation/core/u0;", "a", "(I)Landroidx/compose/animation/core/u0;", "Landroidx/compose/animation/core/u0;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final u0 anim;

        b(float f4, float f5) {
            this.anim = new u0(f4, f5, 0.0f, 4, null);
        }

        @fg.l
        public u0 a(int index) {
            return this.anim;
        }

        @Override // androidx.compose.animation.core.u
        public q0 get(int i4) {
            return this.anim;
        }
    }

    public static final long b(@fg.l o2<?> o2Var, long j4) {
        return kotlin.ranges.s.K(j4 - o2Var.getDelayMillis(), 0L, o2Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends s> u c(V v4, float f4, float f5) {
        return v4 != null ? new a(v4, f4, f5) : new b(f4, f5);
    }

    public static final <V extends s> long d(@fg.l l2<V> l2Var, @fg.l V v4, @fg.l V v5, @fg.l V v6) {
        return l2Var.b(v4, v5, v6) / 1000000;
    }

    @fg.l
    public static final <V extends s> V e(@fg.l l2<V> l2Var, long j4, @fg.l V v4, @fg.l V v5, @fg.l V v6) {
        return l2Var.m(j4 * 1000000, v4, v5, v6);
    }
}

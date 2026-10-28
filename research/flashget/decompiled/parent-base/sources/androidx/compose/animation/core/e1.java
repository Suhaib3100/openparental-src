package androidx.compose.animation.core;

import androidx.compose.animation.core.c1;
import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/core/e1;", "T", "Landroidx/compose/animation/core/c0;", "Landroidx/compose/animation/core/e1$a;", "config", "<init>", "(Landroidx/compose/animation/core/e1$a;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/o2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/o2;", "Landroidx/compose/animation/core/e1$a;", "h", "()Landroidx/compose/animation/core/e1$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@n0
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n618#1:787,4\n618#1:791,6\n618#1:798,3\n618#1:802,2\n618#1:804,2\n618#1:806,6\n618#1:812\n618#1:797\n618#1:801\n*E\n"})
/* loaded from: classes.dex */
public final class e1<T> implements c0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2641b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a<T> config;

    /* compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/core/e1$a;", "T", "Landroidx/compose/animation/core/d1;", "Landroidx/compose/animation/core/c1$a;", "<init>", "()V", "value", "j", "(Ljava/lang/Object;)Landroidx/compose/animation/core/c1$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @n0
    @androidx.compose.runtime.internal.u(parameters = 2)
    public static final class a<T> extends d1<T, c1.a<T>> {

        /* renamed from: e, reason: collision with root package name */
        public static final int f2643e = 0;

        public a() {
            super(null);
        }

        @Override // androidx.compose.animation.core.d1
        @fg.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c1.a<T> c(T value) {
            return new c1.a<>(value, null, 2, null);
        }
    }

    public e1(@fg.l a<T> aVar) {
        this.config = aVar;
    }

    @fg.l
    public final a<T> h() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.p0, androidx.compose.animation.core.k
    @fg.l
    public <V extends s> o2<V> a(@fg.l i2<T, V> converter) {
        int i4 = 0;
        androidx.collection.u1 u1Var = new androidx.collection.u1(0, 1, null);
        androidx.collection.w1 w1Var = new androidx.collection.w1(0, 1, null);
        androidx.collection.w1<c1.a<T>> f4 = this.config.f();
        int[] iArr = f4.keys;
        Object[] objArr = f4.values;
        long[] jArr = f4.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = i4; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i10 = (i5 << 3) + i7;
                            int i11 = iArr[i10];
                            c1.a aVar = (c1.a) objArr[i10];
                            u1Var.X(i11);
                            w1Var.j0(i11, converter.a().invoke(aVar.b()));
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                i4 = 0;
            }
        }
        u1Var.t0();
        return new u2(u1Var, w1Var, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}

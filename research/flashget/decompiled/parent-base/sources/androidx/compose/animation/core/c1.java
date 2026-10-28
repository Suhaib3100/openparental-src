package androidx.compose.animation.core;

import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/c1;", "T", "Landroidx/compose/animation/core/c0;", "Landroidx/compose/animation/core/c1$b;", "config", "<init>", "(Landroidx/compose/animation/core/c1$b;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/t2;", "i", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/t2;", "a", "Landroidx/compose/animation/core/c1$b;", "h", "()Landroidx/compose/animation/core/c1$b;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n560#1:787,4\n560#1:791,6\n560#1:798,3\n560#1:802,2\n560#1:804,2\n560#1:806,6\n560#1:812\n560#1:797\n560#1:801\n*E\n"})
/* loaded from: classes.dex */
public final class c1<T> implements c0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2574b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b<T> config;

    /* compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\n\u001a\u00020\tH\u0096\u0004¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "T", "Landroidx/compose/animation/core/d1;", "Landroidx/compose/animation/core/c1$a;", "<init>", "()V", "value", "l", "(Ljava/lang/Object;)Landroidx/compose/animation/core/c1$a;", "", "timeStamp", "j", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/c1$a;", "", "fraction", "k", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/c1$a;", "Landroidx/compose/animation/core/d0;", "easing", "Lkotlin/k2;", "m", "(Landroidx/compose/animation/core/c1$a;Landroidx/compose/animation/core/d0;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 2)
    public static final class b<T> extends d1<T, a<T>> {

        /* renamed from: e, reason: collision with root package name */
        public static final int f2577e = 0;

        public b() {
            super(null);
        }

        @Override // androidx.compose.animation.core.d1
        @fg.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<T> a(T t4, @androidx.annotation.g0(from = 0) int i4) {
            a<T> aVar = new a<>(t4, null, 2, null);
            f().j0(i4, aVar);
            return aVar;
        }

        @Override // androidx.compose.animation.core.d1
        @fg.l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> b(T t4, float f4) {
            return a(t4, kotlin.math.b.L0(getDurationMillis() * f4));
        }

        @Override // androidx.compose.animation.core.d1
        @fg.l
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<T> c(T value) {
            return new a<>(value, null, 2, null);
        }

        @kotlin.k(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @kotlin.x0(expression = "this using easing", imports = {}))
        public final void m(@fg.l a<T> aVar, @fg.l d0 d0Var) {
            aVar.c(d0Var);
        }
    }

    public c1(@fg.l b<T> bVar) {
        this.config = bVar;
    }

    @fg.l
    public final b<T> h() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.p0, androidx.compose.animation.core.k
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends s> t2<V> a(@fg.l i2<T, V> converter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        androidx.collection.w1<a<T>> f4 = this.config.f();
        int[] iArr = f4.keys;
        Object[] objArr = f4.values;
        long[] jArr = f4.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i4 << 3) + i6;
                            linkedHashMap.put(Integer.valueOf(iArr[i7]), ((a) objArr[i7]).d(converter.a()));
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return new t2<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    /* compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/c1$a;", "T", "Landroidx/compose/animation/core/b1;", "value", "Landroidx/compose/animation/core/d0;", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/d0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 2)
    public static final class a<T> extends b1<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f2576d = 0;

        public a(Object obj, d0 d0Var, int i4, kotlin.jvm.internal.w wVar) {
            super(obj, (i4 & 2) != 0 ? m0.e() : d0Var, null);
        }

        public boolean equals(@fg.m Object other) {
            if (other instanceof a) {
                a aVar = (a) other;
                if (kotlin.jvm.internal.l0.g(aVar.b(), b()) && kotlin.jvm.internal.l0.g(aVar.getEasing(), getEasing())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T b5 = b();
            return getEasing().hashCode() + ((b5 != null ? b5.hashCode() : 0) * 31);
        }

        public a(T t4, @fg.l d0 d0Var) {
            super(t4, d0Var, null);
        }
    }
}

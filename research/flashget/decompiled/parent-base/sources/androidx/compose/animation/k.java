package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.z2;
import androidx.compose.animation.h0;
import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0014J\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\rH&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\rH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u00020\u0017*\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0001\"ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/k;", "S", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/x;", "Landroidx/compose/animation/w0;", "sizeTransform", "h", "(Landroidx/compose/animation/x;Landroidx/compose/animation/w0;)Landroidx/compose/animation/x;", "Landroidx/compose/animation/k$a;", "towards", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/f0;", "a", "(ILandroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/f0;", "targetOffset", "Landroidx/compose/animation/h0;", "b", "(ILandroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/h0;", "Landroidx/compose/animation/h0$a;", "e", "(Landroidx/compose/animation/h0$a;)Landroidx/compose/animation/h0;", "KeepUntilTransitionsFinished", "Landroidx/compose/ui/c;", "k", "()Landroidx/compose/ui/c;", "contentAlignment", "Landroidx/compose/animation/m;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k<S> extends e2.b<S> {

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/k$a;", "", "", "value", "h", "(I)I", "", "l", "(I)Ljava/lang/String;", "k", "other", "", "i", "(ILjava/lang/Object;)Z", "a", "I", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    @m1
    public static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f3185c = 0;

        /* renamed from: d, reason: collision with root package name */
        private static final int f3186d = 1;

        /* renamed from: e, reason: collision with root package name */
        private static final int f3187e = 2;

        /* renamed from: f, reason: collision with root package name */
        private static final int f3188f = 3;

        /* renamed from: g, reason: collision with root package name */
        private static final int f3189g = 4;

        /* renamed from: h, reason: collision with root package name */
        private static final int f3190h = 5;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/k$a$a;", "", "<init>", "()V", "Landroidx/compose/animation/k$a;", "Left", "I", "c", "()I", "Right", "d", "Up", "f", "Down", "a", "Start", "e", "End", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.k$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return a.f3188f;
            }

            public final int b() {
                return a.f3190h;
            }

            public final int c() {
                return a.f3185c;
            }

            public final int d() {
                return a.f3186d;
            }

            public final int e() {
                return a.f3189g;
            }

            public final int f() {
                return a.f3187e;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        private /* synthetic */ a(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ a g(int i4) {
            return new a(i4);
        }

        public static int h(int i4) {
            return i4;
        }

        public static boolean i(int i4, Object obj) {
            return (obj instanceof a) && i4 == ((a) obj).value;
        }

        public static final boolean j(int i4, int i5) {
            return i4 == i5;
        }

        public static int k(int i4) {
            return Integer.hashCode(i4);
        }

        @fg.l
        public static String l(int i4) {
            return j(i4, f3185c) ? "Left" : j(i4, f3186d) ? "Right" : j(i4, f3187e) ? "Up" : j(i4, f3188f) ? "Down" : j(i4, f3189g) ? "Start" : j(i4, f3190h) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return i(this.value, obj);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        /* renamed from: m, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @fg.l
        public String toString() {
            return l(this.value);
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3192b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf(i4);
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f3193b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf(i4);
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ h0 c(k kVar, int i4, androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i5 & 2) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 0.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 3, null);
        }
        if ((i5 & 4) != 0) {
            lVar = c.f3193b;
        }
        return kVar.b(i4, p0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ f0 d(k kVar, int i4, androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i5 & 2) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 0.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 3, null);
        }
        if ((i5 & 4) != 0) {
            lVar = b.f3192b;
        }
        return kVar.a(i4, p0Var, lVar);
    }

    @fg.l
    f0 a(int towards, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec, @fg.l ld.l<? super Integer, Integer> initialOffset);

    @fg.l
    h0 b(int towards, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec, @fg.l ld.l<? super Integer, Integer> targetOffset);

    @fg.l
    default h0 e(@fg.l h0.Companion companion) {
        companion.getClass();
        return h0.f3181d;
    }

    @fg.l
    x h(@fg.l x xVar, @fg.m w0 w0Var);

    @fg.l
    androidx.compose.ui.c k();
}

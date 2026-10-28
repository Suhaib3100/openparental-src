package androidx.compose.ui.layout;

import androidx.collection.q2;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import androidx.core.view.x1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JN\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/q;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,79:1\n120#2,5:80\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n50#1:80,5\n*E\n"})
/* loaded from: classes.dex */
public interface o0 extends q {

    /* compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l o0 o0Var) {
            o0Var.getClass();
            return false;
        }

        @fg.l
        @Deprecated
        public static n0 b(@fg.l o0 o0Var, int i4, int i5, @fg.l Map<androidx.compose.ui.layout.a, Integer> map, @fg.l ld.l<? super i1.a, k2> lVar) {
            return o0.super.U3(i4, i5, map, lVar);
        }

        @x4
        @Deprecated
        public static int d(@fg.l o0 o0Var, long j4) {
            return o0.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int e(@fg.l o0 o0Var, float f4) {
            return o0.super.q2(f4);
        }

        @x4
        @Deprecated
        public static float f(@fg.l o0 o0Var, long j4) {
            return o0.super.i(j4);
        }

        @x4
        @Deprecated
        public static float g(@fg.l o0 o0Var, float f4) {
            return o0.super.S(f4);
        }

        @x4
        @Deprecated
        public static float h(@fg.l o0 o0Var, int i4) {
            return o0.super.R(i4);
        }

        @x4
        @Deprecated
        public static long i(@fg.l o0 o0Var, long j4) {
            return o0.super.n(j4);
        }

        @x4
        @Deprecated
        public static float j(@fg.l o0 o0Var, long j4) {
            return o0.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float k(@fg.l o0 o0Var, float f4) {
            return o0Var.b() * f4;
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i l(@fg.l o0 o0Var, @fg.l androidx.compose.ui.unit.k kVar) {
            return o0.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long m(@fg.l o0 o0Var, long j4) {
            return o0.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long n(@fg.l o0 o0Var, float f4) {
            return o0.super.h(f4);
        }

        @x4
        @Deprecated
        public static long o(@fg.l o0 o0Var, float f4) {
            return o0.super.w(f4);
        }

        @x4
        @Deprecated
        public static long p(@fg.l o0 o0Var, int i4) {
            return o0.super.u(i4);
        }
    }

    /* compiled from: MeasureScope.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/o0$b", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements n0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19067d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o0 f19068e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<i1.a, k2> f19069f;

        /* JADX WARN: Multi-variable type inference failed */
        b(int i4, int i5, Map<androidx.compose.ui.layout.a, Integer> map, o0 o0Var, ld.l<? super i1.a, k2> lVar) {
            this.f19067d = i4;
            this.f19068e = o0Var;
            this.f19069f = lVar;
            this.width = i4;
            this.height = i5;
            this.alignmentLines = map;
        }

        @Override // androidx.compose.ui.layout.n0
        /* renamed from: getHeight, reason: from getter */
        public int getF19463b() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.n0
        /* renamed from: getWidth, reason: from getter */
        public int getF19462a() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
            o0 o0Var = this.f19068e;
            if (o0Var instanceof androidx.compose.ui.node.q0) {
                this.f19069f.invoke(((androidx.compose.ui.node.q0) o0Var).getPlacementScope());
            } else {
                this.f19069f.invoke(new p1(this.f19067d, this.f19068e.getLayoutDirection()));
            }
        }
    }

    static boolean X5(o0 o0Var) {
        o0Var.getClass();
        return false;
    }

    static float b2(o0 o0Var, float f4) {
        return o0Var.b() * f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ n0 x2(o0 o0Var, int i4, int i5, Map map, ld.l lVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i6 & 4) != 0) {
            map = kotlin.collections.z0.z();
        }
        return o0Var.U3(i4, i5, map, lVar);
    }

    @fg.l
    default n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
        if ((width & x1.f27484y) == 0 && ((-16777216) & height) == 0) {
            return new b(width, height, alignmentLines, this, placementBlock);
        }
        throw new IllegalStateException(q2.a("Size(", width, " x ", height, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}

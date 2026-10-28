package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0011\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/t1;", "", "<init>", "()V", "Li0/n;", "size", "Landroidx/compose/ui/graphics/d5;", "p", "", "alpha", "Lkotlin/k2;", "a", "(JLandroidx/compose/ui/graphics/d5;F)V", "J", "b", "()J", "intrinsicSize", "Landroidx/compose/ui/graphics/a6;", "Landroidx/compose/ui/graphics/g6;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    /* compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\\\u0010\u001e\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ\\\u0010!\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$JH\u0010%\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&J*\u0010'\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/t1$a;", "", "<init>", "()V", "", "Lkotlin/q0;", "", "Landroidx/compose/ui/graphics/d2;", "colorStops", "Li0/f;", "start", "end", "Landroidx/compose/ui/graphics/n6;", "tileMode", "Landroidx/compose/ui/graphics/t1;", "f", "([Lkotlin/q0;JJI)Landroidx/compose/ui/graphics/t1;", "", "colors", "e", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/t1;", "startX", "endX", "a", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/t1;", "b", "([Lkotlin/q0;FFI)Landroidx/compose/ui/graphics/t1;", "startY", "endY", "q", "r", "center", "radius", "j", "([Lkotlin/q0;JFI)Landroidx/compose/ui/graphics/t1;", "i", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/t1;", "n", "([Lkotlin/q0;J)Landroidx/compose/ui/graphics/t1;", "m", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/t1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
    /* renamed from: androidx.compose.ui.graphics.t1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static t1 c(Companion companion, List list, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.a(list, f4, f5, i4);
        }

        public static t1 d(Companion companion, kotlin.q0[] q0VarArr, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.b(q0VarArr, f4, f5, i4);
        }

        public static t1 g(Companion companion, List list, long j4, long j5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74147c;
            }
            long j6 = j4;
            if ((i5 & 4) != 0) {
                i0.f.INSTANCE.getClass();
                j5 = i0.f.f74148d;
            }
            long j7 = j5;
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.e(list, j6, j7, i4);
        }

        public static t1 h(Companion companion, kotlin.q0[] q0VarArr, long j4, long j5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74147c;
            }
            long j6 = j4;
            if ((i5 & 4) != 0) {
                i0.f.INSTANCE.getClass();
                j5 = i0.f.f74148d;
            }
            long j7 = j5;
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.f(q0VarArr, j6, j7, i4);
        }

        public static t1 k(Companion companion, List list, long j4, float f4, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74149e;
            }
            long j5 = j4;
            if ((i5 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            float f5 = f4;
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.i(list, j5, f5, i4);
        }

        public static t1 l(Companion companion, kotlin.q0[] q0VarArr, long j4, float f4, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74149e;
            }
            long j5 = j4;
            if ((i5 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            float f5 = f4;
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.j(q0VarArr, j5, f5, i4);
        }

        public static t1 o(Companion companion, List list, long j4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74149e;
            }
            return companion.m(list, j4);
        }

        public static t1 p(Companion companion, kotlin.q0[] q0VarArr, long j4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74149e;
            }
            return companion.n(q0VarArr, j4);
        }

        public static t1 s(Companion companion, List list, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.q(list, f4, f5, i4);
        }

        public static t1 t(Companion companion, kotlin.q0[] q0VarArr, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                n6.INSTANCE.getClass();
                i4 = n6.f17973c;
            }
            return companion.r(q0VarArr, f4, f5, i4);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 a(@fg.l List<d2> colors, float startX, float endX, int tileMode) {
            return e(colors, i0.g.a(startX, 0.0f), i0.g.a(endX, 0.0f), tileMode);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 b(@fg.l kotlin.q0<Float, d2>[] colorStops, float startX, float endX, int tileMode) {
            return f((kotlin.q0[]) Arrays.copyOf(colorStops, colorStops.length), i0.g.a(startX, 0.0f), i0.g.a(endX, 0.0f), tileMode);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 e(@fg.l List<d2> colors, long start, long end, int tileMode) {
            return new w4(colors, null, start, end, tileMode, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 f(@fg.l kotlin.q0<Float, d2>[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var : colorStops) {
                arrayList.add(d2.n(q0Var.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var2 : colorStops) {
                arrayList2.add(Float.valueOf(q0Var2.e().floatValue()));
            }
            return new w4(arrayList, arrayList2, start, end, tileMode, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 i(@fg.l List<d2> colors, long center, float radius, int tileMode) {
            return new p5(colors, null, center, radius, tileMode, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 j(@fg.l kotlin.q0<Float, d2>[] colorStops, long center, float radius, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var : colorStops) {
                arrayList.add(d2.n(q0Var.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var2 : colorStops) {
                arrayList2.add(Float.valueOf(q0Var2.e().floatValue()));
            }
            return new p5(arrayList, arrayList2, center, radius, tileMode, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 m(@fg.l List<d2> colors, long center) {
            return new m6(center, colors, null, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 n(@fg.l kotlin.q0<Float, d2>[] colorStops, long center) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var : colorStops) {
                arrayList.add(d2.n(q0Var.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (kotlin.q0<Float, d2> q0Var2 : colorStops) {
                arrayList2.add(Float.valueOf(q0Var2.e().floatValue()));
            }
            return new m6(center, arrayList, arrayList2, null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 q(@fg.l List<d2> colors, float startY, float endY, int tileMode) {
            return e(colors, i0.g.a(0.0f, startY), i0.g.a(0.0f, endY), tileMode);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final t1 r(@fg.l kotlin.q0<Float, d2>[] colorStops, float startY, float endY, int tileMode) {
            return f((kotlin.q0[]) Arrays.copyOf(colorStops, colorStops.length), i0.g.a(0.0f, startY), i0.g.a(0.0f, endY), tileMode);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ t1(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract void a(long size, @fg.l d5 p4, float alpha);

    /* renamed from: b, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    private t1() {
        i0.n.INSTANCE.getClass();
        this.intrinsicSize = i0.n.f74172d;
    }
}

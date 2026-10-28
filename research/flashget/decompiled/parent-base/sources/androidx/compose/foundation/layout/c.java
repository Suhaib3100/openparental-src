package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a>\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/h;", "before", "after", "e", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/a;FF)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/z;", "g", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/a;JJ)Landroidx/compose/ui/q;", "top", "bottom", "i", "(Landroidx/compose/ui/q;FF)Landroidx/compose/ui/q;", "k", "(Landroidx/compose/ui/q;JJ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "c", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/a;FFLandroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "d", "(Landroidx/compose/ui/layout/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: AlignmentLine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.a f4861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4862c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4863d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4864e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4865f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f4866g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4867h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.a aVar, float f4, int i4, int i5, int i6, androidx.compose.ui.layout.i1 i1Var, int i7) {
            super(1);
            this.f4861b = aVar;
            this.f4862c = f4;
            this.f4863d = i4;
            this.f4864e = i5;
            this.f4865f = i6;
            this.f4866g = i1Var;
            this.f4867h = i7;
        }

        public final void a(@fg.l i1.a aVar) {
            int width;
            int i4 = 0;
            if (this.f4861b instanceof androidx.compose.ui.layout.m) {
                width = 0;
            } else {
                width = !androidx.compose.foundation.layout.b.a(androidx.compose.ui.unit.h.INSTANCE, this.f4862c) ? this.f4863d : (this.f4864e - this.f4865f) - this.f4866g.getWidth();
            }
            if (this.f4861b instanceof androidx.compose.ui.layout.m) {
                i4 = !androidx.compose.foundation.layout.b.a(androidx.compose.ui.unit.h.INSTANCE, this.f4862c) ? this.f4863d : (this.f4867h - this.f4865f) - this.f4866g.getHeight();
            }
            i1.a.m(aVar, this.f4866g, width, i4, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n76#2,5:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.a f4868b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4869c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.a aVar, float f4, float f5) {
            super(1);
            this.f4868b = aVar;
            this.f4869c = f4;
            this.f4870d = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("paddingFrom");
            a2Var.getProperties().c("alignmentLine", this.f4868b);
            androidx.compose.foundation.s1.a(this.f4869c, a2Var.getProperties(), "before", a2Var).c("after", androidx.compose.ui.unit.h.d(this.f4870d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n122#2,5:171\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.c$c, reason: collision with other inner class name */
    public static final class C0090c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.a f4871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4873d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0090c(androidx.compose.ui.layout.a aVar, long j4, long j5) {
            super(1);
            this.f4871b = aVar;
            this.f4872c = j4;
            this.f4873d = j5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("paddingFrom");
            a2Var.getProperties().c("alignmentLine", this.f4871b);
            a2Var.getProperties().c("before", androidx.compose.ui.unit.z.c(this.f4872c));
            a2Var.getProperties().c("after", androidx.compose.ui.unit.z.c(this.f4873d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    public static final boolean b(androidx.compose.ui.layout.a aVar) {
        return aVar instanceof androidx.compose.ui.layout.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 c(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.a aVar, float f4, float f5, androidx.compose.ui.layout.l0 l0Var, long j4) {
        boolean z4 = aVar instanceof androidx.compose.ui.layout.m;
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(z4 ? androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null) : androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 14, null));
        int q4 = m02.q(aVar);
        if (q4 == Integer.MIN_VALUE) {
            q4 = 0;
        }
        int height = z4 ? m02.getHeight() : m02.getWidth();
        int o4 = z4 ? androidx.compose.ui.unit.b.o(j4) : androidx.compose.ui.unit.b.p(j4);
        h.Companion companion = androidx.compose.ui.unit.h.INSTANCE;
        int i4 = o4 - height;
        int I = kotlin.ranges.s.I((!androidx.compose.foundation.layout.b.a(companion, f4) ? o0Var.q2(f4) : 0) - q4, 0, i4);
        int I2 = kotlin.ranges.s.I(((!androidx.compose.foundation.layout.b.a(companion, f5) ? o0Var.q2(f5) : 0) - height) + q4, 0, i4 - I);
        int width = z4 ? m02.getWidth() : Math.max(m02.getWidth() + I + I2, androidx.compose.ui.unit.b.r(j4));
        int max = z4 ? Math.max(m02.getHeight() + I + I2, androidx.compose.ui.unit.b.q(j4)) : m02.getHeight();
        return androidx.compose.ui.layout.o0.x2(o0Var, width, max, null, new a(aVar, f4, I, width, I2, m02, max), 4, null);
    }

    private static final boolean d(androidx.compose.ui.layout.a aVar) {
        return aVar instanceof androidx.compose.ui.layout.m;
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.layout.a aVar, float f4, float f5) {
        return qVar.w3(new AlignmentLineOffsetDpElement(aVar, f4, f5, androidx.compose.ui.platform.y1.e() ? new b(aVar, f4, f5) : androidx.compose.ui.platform.y1.b(), null));
    }

    public static androidx.compose.ui.q f(androidx.compose.ui.q qVar, androidx.compose.ui.layout.a aVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 4) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return e(qVar, aVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.layout.a aVar, long j4, long j5) {
        return qVar.w3(new AlignmentLineOffsetTextUnitElement(aVar, j4, j5, androidx.compose.ui.platform.y1.e() ? new C0090c(aVar, j4, j5) : androidx.compose.ui.platform.y1.b(), null));
    }

    public static androidx.compose.ui.q h(androidx.compose.ui.q qVar, androidx.compose.ui.layout.a aVar, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.z.f21534d;
        }
        long j6 = j4;
        if ((i4 & 4) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.z.f21534d;
        }
        return g(qVar, aVar, j6, j5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q i(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        h.Companion companion = androidx.compose.ui.unit.h.INSTANCE;
        return qVar.w3(!androidx.compose.foundation.layout.b.a(companion, f4) ? f(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.layout.b.a(), f4, 0.0f, 4, null) : androidx.compose.ui.q.INSTANCE).w3(!androidx.compose.foundation.layout.b.a(companion, f5) ? f(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.layout.b.b(), 0.0f, f5, 2, null) : androidx.compose.ui.q.INSTANCE);
    }

    public static androidx.compose.ui.q j(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return i(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q k(@fg.l androidx.compose.ui.q qVar, long j4, long j5) {
        return qVar.w3(!androidx.compose.ui.unit.a0.s(j4) ? h(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.layout.b.a(), j4, 0L, 4, null) : androidx.compose.ui.q.INSTANCE).w3(!androidx.compose.ui.unit.a0.s(j5) ? h(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.layout.b.b(), 0L, j5, 2, null) : androidx.compose.ui.q.INSTANCE);
    }

    public static androidx.compose.ui.q l(androidx.compose.ui.q qVar, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.z.f21534d;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.z.f21534d;
        }
        return k(qVar, j4, j5);
    }
}

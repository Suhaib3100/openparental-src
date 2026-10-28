package androidx.compose.ui.layout;

import androidx.collection.q2;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import androidx.core.view.x1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Layout.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\"J\u001a\u0010$\u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%JL\u00101\u001a\u0002002\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0(2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+¢\u0006\u0002\b.H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00107R\u0014\u0010:\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010>\u001a\u00020;8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/layout/t;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/q;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/w;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/unit/h;", "", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "", "S", "(F)F", "R", "(I)F", "Li0/n;", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "b", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "()F", "density", "U", "fontScale", "", "E1", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,390:1\n120#2,5:391\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n*L\n375#1:391,5\n*E\n"})
/* loaded from: classes.dex */
public final class t implements o0, q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19101d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ q f19103c;

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/ui/layout/t$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements n0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f19106c;

        a(int i4, int i5, Map<androidx.compose.ui.layout.a, Integer> map) {
            this.f19104a = i4;
            this.f19105b = i5;
            this.f19106c = map;
        }

        @Override // androidx.compose.ui.layout.n0
        /* renamed from: getHeight, reason: from getter */
        public int getF19105b() {
            return this.f19105b;
        }

        @Override // androidx.compose.ui.layout.n0
        /* renamed from: getWidth, reason: from getter */
        public int getF19104a() {
            return this.f19104a;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.f19106c;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
        }
    }

    public t(@fg.l q qVar, @fg.l androidx.compose.ui.unit.w wVar) {
        this.layoutDirection = wVar;
        this.f19103c = qVar;
    }

    @Override // androidx.compose.ui.layout.q
    public boolean E1() {
        return this.f19103c.E1();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float J2(long j4) {
        return this.f19103c.J2(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int J5(long j4) {
        return this.f19103c.J5(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float R(int i4) {
        return this.f19103c.R(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float S(float f4) {
        return this.f19103c.S(f4);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.f19103c.getFontScale();
    }

    @Override // androidx.compose.ui.layout.o0
    @fg.l
    public n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & x1.f27484y) == 0 && ((-16777216) & height) == 0) {
            return new a(width, height, alignmentLines);
        }
        throw new IllegalStateException(q2.a("Size(", width, " x ", height, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.f19103c.getDensity();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    @fg.l
    public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
        return this.f19103c.c5(kVar);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long d0(long j4) {
        return this.f19103c.d0(j4);
    }

    @Override // androidx.compose.ui.layout.q
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public long h(float f4) {
        return this.f19103c.h(f4);
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public float i(long j4) {
        return this.f19103c.i(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long n(long j4) {
        return this.f19103c.n(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int q2(float f4) {
        return this.f19103c.q2(f4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long u(int i4) {
        return this.f19103c.u(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float v5(float f4) {
        return this.f19103c.v5(f4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long w(float f4) {
        return this.f19103c.w(f4);
    }
}

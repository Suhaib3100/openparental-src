package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bc\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/b2;", "", "Landroid/graphics/Insets;", "insets", "", "e", "(Landroid/graphics/Insets;)I", "", "x", "y", "b", "(FF)F", "a", "d", "oldInsets", "newValue", "c", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Li0/f;", "available", "f", "(J)J", "Landroidx/compose/ui/unit/c0;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(30)
/* loaded from: classes.dex */
interface b2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f4856a;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0004\u000b\u000f\u0013\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/b2$a;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/g3;", "side", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/foundation/layout/b2;", "a", "(ILandroidx/compose/ui/unit/w;)Landroidx/compose/foundation/layout/b2;", "androidx/compose/foundation/layout/b2$a$b", "b", "Landroidx/compose/foundation/layout/b2$a$b;", "LeftSideCalculator", "androidx/compose/foundation/layout/b2$a$d", "c", "Landroidx/compose/foundation/layout/b2$a$d;", "TopSideCalculator", "androidx/compose/foundation/layout/b2$a$c", "d", "Landroidx/compose/foundation/layout/b2$a$c;", "RightSideCalculator", "androidx/compose/foundation/layout/b2$a$a", "e", "Landroidx/compose/foundation/layout/b2$a$a;", "BottomSideCalculator", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.b2$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4856a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final b LeftSideCalculator = new b();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final d TopSideCalculator = new d();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c RightSideCalculator = new c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final C0089a BottomSideCalculator = new C0089a();

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/foundation/layout/b2$a$a", "Landroidx/compose/foundation/layout/b2;", "Landroid/graphics/Insets;", "insets", "", "e", "(Landroid/graphics/Insets;)I", "", "x", "y", "b", "(FF)F", "oldInsets", "newValue", "c", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Li0/f;", "available", "f", "(J)J", "Landroidx/compose/ui/unit/c0;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.b2$a$a, reason: collision with other inner class name */
        public static final class C0089a implements b2 {
            C0089a() {
            }

            @Override // androidx.compose.foundation.layout.b2
            public float b(float x4, float y4) {
                return -y4;
            }

            @Override // androidx.compose.foundation.layout.b2
            @fg.l
            public Insets c(@fg.l Insets oldInsets, int newValue) {
                int i4;
                int i5;
                int i6;
                Insets of2;
                i4 = oldInsets.left;
                i5 = oldInsets.top;
                i6 = oldInsets.right;
                of2 = Insets.of(i4, i5, i6, newValue);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.b2
            public int e(@fg.l Insets insets) {
                int i4;
                i4 = insets.bottom;
                return i4;
            }

            @Override // androidx.compose.foundation.layout.b2
            public long f(long available) {
                return i0.g.a(0.0f, i0.f.r(available));
            }

            @Override // androidx.compose.foundation.layout.b2
            public long g(long available, float remaining) {
                return androidx.compose.ui.unit.d0.a(0.0f, androidx.compose.ui.unit.c0.n(available) + remaining);
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/foundation/layout/b2$a$b", "Landroidx/compose/foundation/layout/b2;", "Landroid/graphics/Insets;", "insets", "", "e", "(Landroid/graphics/Insets;)I", "", "x", "y", "b", "(FF)F", "oldInsets", "newValue", "c", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Li0/f;", "available", "f", "(J)J", "Landroidx/compose/ui/unit/c0;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.b2$a$b */
        public static final class b implements b2 {
            b() {
            }

            @Override // androidx.compose.foundation.layout.b2
            public float b(float x4, float y4) {
                return x4;
            }

            @Override // androidx.compose.foundation.layout.b2
            @fg.l
            public Insets c(@fg.l Insets oldInsets, int newValue) {
                int i4;
                int i5;
                int i6;
                Insets of2;
                i4 = oldInsets.top;
                i5 = oldInsets.right;
                i6 = oldInsets.bottom;
                of2 = Insets.of(newValue, i4, i5, i6);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.b2
            public int e(@fg.l Insets insets) {
                int i4;
                i4 = insets.left;
                return i4;
            }

            @Override // androidx.compose.foundation.layout.b2
            public long f(long available) {
                return i0.g.a(i0.f.p(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.b2
            public long g(long available, float remaining) {
                return androidx.compose.ui.unit.d0.a(androidx.compose.ui.unit.c0.l(available) - remaining, 0.0f);
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/foundation/layout/b2$a$c", "Landroidx/compose/foundation/layout/b2;", "Landroid/graphics/Insets;", "insets", "", "e", "(Landroid/graphics/Insets;)I", "", "x", "y", "b", "(FF)F", "oldInsets", "newValue", "c", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Li0/f;", "available", "f", "(J)J", "Landroidx/compose/ui/unit/c0;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.b2$a$c */
        public static final class c implements b2 {
            c() {
            }

            @Override // androidx.compose.foundation.layout.b2
            public float b(float x4, float y4) {
                return -x4;
            }

            @Override // androidx.compose.foundation.layout.b2
            @fg.l
            public Insets c(@fg.l Insets oldInsets, int newValue) {
                int i4;
                int i5;
                int i6;
                Insets of2;
                i4 = oldInsets.left;
                i5 = oldInsets.top;
                i6 = oldInsets.bottom;
                of2 = Insets.of(i4, i5, newValue, i6);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.b2
            public int e(@fg.l Insets insets) {
                int i4;
                i4 = insets.right;
                return i4;
            }

            @Override // androidx.compose.foundation.layout.b2
            public long f(long available) {
                return i0.g.a(i0.f.p(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.b2
            public long g(long available, float remaining) {
                return androidx.compose.ui.unit.d0.a(androidx.compose.ui.unit.c0.l(available) + remaining, 0.0f);
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/foundation/layout/b2$a$d", "Landroidx/compose/foundation/layout/b2;", "Landroid/graphics/Insets;", "insets", "", "e", "(Landroid/graphics/Insets;)I", "", "x", "y", "b", "(FF)F", "oldInsets", "newValue", "c", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Li0/f;", "available", "f", "(J)J", "Landroidx/compose/ui/unit/c0;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.b2$a$d */
        public static final class d implements b2 {
            d() {
            }

            @Override // androidx.compose.foundation.layout.b2
            public float b(float x4, float y4) {
                return y4;
            }

            @Override // androidx.compose.foundation.layout.b2
            @fg.l
            public Insets c(@fg.l Insets oldInsets, int newValue) {
                int i4;
                int i5;
                int i6;
                Insets of2;
                i4 = oldInsets.left;
                i5 = oldInsets.right;
                i6 = oldInsets.bottom;
                of2 = Insets.of(i4, newValue, i5, i6);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.b2
            public int e(@fg.l Insets insets) {
                int i4;
                i4 = insets.top;
                return i4;
            }

            @Override // androidx.compose.foundation.layout.b2
            public long f(long available) {
                return i0.g.a(0.0f, i0.f.r(available));
            }

            @Override // androidx.compose.foundation.layout.b2
            public long g(long available, float remaining) {
                return androidx.compose.ui.unit.d0.a(0.0f, androidx.compose.ui.unit.c0.n(available) - remaining);
            }
        }

        private Companion() {
        }

        @fg.l
        public final b2 a(int side, @fg.l androidx.compose.ui.unit.w layoutDirection) {
            g3.Companion companion = g3.INSTANCE;
            companion.getClass();
            if (g3.p(side, g3.f5049k)) {
                return LeftSideCalculator;
            }
            companion.getClass();
            if (g3.p(side, g3.f5047i)) {
                return TopSideCalculator;
            }
            companion.getClass();
            if (g3.p(side, g3.f5050l)) {
                return RightSideCalculator;
            }
            companion.getClass();
            if (g3.p(side, g3.f5048j)) {
                return BottomSideCalculator;
            }
            companion.getClass();
            if (g3.p(side, g3.f5045g)) {
                return layoutDirection == androidx.compose.ui.unit.w.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            companion.getClass();
            if (g3.p(side, g3.f5046h)) {
                return layoutDirection == androidx.compose.ui.unit.w.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    default float a(float x4, float y4) {
        return kotlin.ranges.s.t(b(x4, y4), 0.0f);
    }

    float b(float x4, float y4);

    @fg.l
    Insets c(@fg.l Insets oldInsets, int newValue);

    default float d(float x4, float y4) {
        return kotlin.ranges.s.A(b(x4, y4), 0.0f);
    }

    int e(@fg.l Insets insets);

    long f(long available);

    long g(long available, float remaining);
}

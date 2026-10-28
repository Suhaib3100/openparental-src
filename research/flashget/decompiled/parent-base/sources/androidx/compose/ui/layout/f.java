package androidx.compose.ui.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@x4
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/f;", "", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f18992a;

    /* compiled from: ContentScale.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0005\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\bR \u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\bR \u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\n\u0010\b¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/f;", "b", "Landroidx/compose/ui/layout/f;", "a", "()Landroidx/compose/ui/layout/f;", "Crop", "c", "i", "j", "Fit", "d", "e", "f", "FillHeight", "g", "h", "FillWidth", "k", "l", "Inside", "Landroidx/compose/ui/layout/j;", "Landroidx/compose/ui/layout/j;", "m", "()Landroidx/compose/ui/layout/j;", "n", "None", "FillBounds", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18992a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f Crop = new C0342a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f Fit = new e();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f FillHeight = new c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f FillWidth = new d();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f Inside = new C0343f();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final j None = new j(1.0f);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final f FillBounds = new b();

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$a", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$a, reason: collision with other inner class name */
        public static final class C0342a implements f {
            C0342a() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float f4;
                f4 = g.f(srcSize, dstSize);
                return o1.a(f4, f4);
            }
        }

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$b", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$b */
        public static final class b implements f {
            b() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float h4;
                float e4;
                h4 = g.h(srcSize, dstSize);
                e4 = g.e(srcSize, dstSize);
                return o1.a(h4, e4);
            }
        }

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$c", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$c */
        public static final class c implements f {
            c() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float e4;
                e4 = g.e(srcSize, dstSize);
                return o1.a(e4, e4);
            }
        }

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$d", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$d */
        public static final class d implements f {
            d() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float h4;
                h4 = g.h(srcSize, dstSize);
                return o1.a(h4, h4);
            }
        }

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$e", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$e */
        public static final class e implements f {
            e() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float g4;
                g4 = g.g(srcSize, dstSize);
                return o1.a(g4, g4);
            }
        }

        /* compiled from: ContentScale.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/f$a$f", "Landroidx/compose/ui/layout/f;", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.f$a$f, reason: collision with other inner class name */
        public static final class C0343f implements f {
            C0343f() {
            }

            @Override // androidx.compose.ui.layout.f
            public long a(long srcSize, long dstSize) {
                float g4;
                if (i0.n.t(srcSize) <= i0.n.t(dstSize) && i0.n.m(srcSize) <= i0.n.m(dstSize)) {
                    return o1.a(1.0f, 1.0f);
                }
                g4 = g.g(srcSize, dstSize);
                return o1.a(g4, g4);
            }
        }

        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        @x4
        public static /* synthetic */ void h() {
        }

        @x4
        public static /* synthetic */ void j() {
        }

        @x4
        public static /* synthetic */ void l() {
        }

        @x4
        public static /* synthetic */ void n() {
        }

        @fg.l
        public final f a() {
            return Crop;
        }

        @fg.l
        public final f c() {
            return FillBounds;
        }

        @fg.l
        public final f e() {
            return FillHeight;
        }

        @fg.l
        public final f g() {
            return FillWidth;
        }

        @fg.l
        public final f i() {
            return Fit;
        }

        @fg.l
        public final f k() {
            return Inside;
        }

        @fg.l
        public final j m() {
            return None;
        }
    }

    long a(long srcSize, long dstSize);
}

package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR5\u0010\u000f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR5\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR5\u0010\u0013\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR5\u0010\u0015\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\b\u0010\u000bR5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0014\u0010\u000bR5\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0017\u0010\u000bR5\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/w0;", "", "<init>", "()V", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/p;", "", "b", "Lld/q;", "d", "()Lld/q;", "HorizontalMinWidth", "c", "h", "VerticalMinWidth", "HorizontalMinHeight", "e", "g", "VerticalMinHeight", "f", "HorizontalMaxWidth", "VerticalMaxWidth", "a", "HorizontalMaxHeight", "i", "VerticalMaxHeight", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final w0 f5359a = new w0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> HorizontalMinWidth = d.f5377b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> VerticalMinWidth = h.f5389b;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> HorizontalMinHeight = c.f5374b;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> VerticalMinHeight = g.f5386b;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> HorizontalMaxWidth = b.f5371b;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> VerticalMaxWidth = f.f5383b;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> HorizontalMaxHeight = a.f5368b;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> VerticalMaxHeight = e.f5380b;

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableWidth", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5368b = new a(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.w0$a$a, reason: collision with other inner class name */
        static final class C0099a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0099a f5369b = new C0099a(2);

            C0099a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5370b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            p4 = r1.p(list, C0099a.f5369b, b.f5370b, i4, i5, a1.Horizontal, a1.Vertical);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableHeight", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5371b = new b(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5372b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.w0$b$b, reason: collision with other inner class name */
        static final class C0100b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0100b f5373b = new C0100b(2);

            C0100b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            a aVar = a.f5372b;
            C0100b c0100b = C0100b.f5373b;
            a1 a1Var = a1.Horizontal;
            p4 = r1.p(list, aVar, c0100b, i4, i5, a1Var, a1Var);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableWidth", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5374b = new c(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5375b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.Z(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5376b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        c() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            p4 = r1.p(list, a.f5375b, b.f5376b, i4, i5, a1.Horizontal, a1.Vertical);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableHeight", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5377b = new d(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5378b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.k0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5379b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            a aVar = a.f5378b;
            b bVar = b.f5379b;
            a1 a1Var = a1.Horizontal;
            p4 = r1.p(list, aVar, bVar, i4, i5, a1Var, a1Var);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableWidth", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5380b = new e(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5381b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5382b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            a aVar = a.f5381b;
            b bVar = b.f5382b;
            a1 a1Var = a1.Vertical;
            p4 = r1.p(list, aVar, bVar, i4, i5, a1Var, a1Var);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableHeight", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f5383b = new f(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5384b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5385b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        f() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            p4 = r1.p(list, a.f5384b, b.f5385b, i4, i5, a1.Vertical, a1.Horizontal);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableWidth", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f5386b = new g(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5387b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.Z(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5388b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.l0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        g() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            a aVar = a.f5387b;
            b bVar = b.f5388b;
            a1 a1Var = a1.Vertical;
            p4 = r1.p(list, aVar, bVar, i4, i5, a1Var, a1Var);
            return Integer.valueOf(p4);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/layout/p;", "measurables", "", "availableHeight", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f5389b = new h(3);

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "h", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5390b = new a(2);

            a() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.k0(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/p;", "", "w", "a", "(Landroidx/compose/ui/layout/p;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.p, Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f5391b = new b(2);

            b() {
                super(2);
            }

            @fg.l
            public final Integer a(@fg.l androidx.compose.ui.layout.p pVar, int i4) {
                return Integer.valueOf(pVar.t(i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.p pVar, Integer num) {
                return a(pVar, num.intValue());
            }
        }

        h() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(List<? extends androidx.compose.ui.layout.p> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }

        @fg.l
        public final Integer a(@fg.l List<? extends androidx.compose.ui.layout.p> list, int i4, int i5) {
            int p4;
            p4 = r1.p(list, a.f5390b, b.f5391b, i4, i5, a1.Vertical, a1.Horizontal);
            return Integer.valueOf(p4);
        }
    }

    private w0() {
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> a() {
        return HorizontalMaxHeight;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> b() {
        return HorizontalMaxWidth;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> c() {
        return HorizontalMinHeight;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> d() {
        return HorizontalMinWidth;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> e() {
        return VerticalMaxHeight;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> f() {
        return VerticalMaxWidth;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> g() {
        return VerticalMinHeight;
    }

    @fg.l
    public final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> h() {
        return VerticalMinWidth;
    }
}

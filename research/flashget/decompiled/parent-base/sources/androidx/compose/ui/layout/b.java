package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/a;", "", "position1", "position2", "c", "(Landroidx/compose/ui/layout/a;II)I", "Landroidx/compose/ui/layout/m;", "a", "Landroidx/compose/ui/layout/m;", "()Landroidx/compose/ui/layout/m;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final m f18916a = new m(a.f18918d, null);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final m f18917b = new m(C0341b.f18919d, null);

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.p<Integer, Integer, Integer> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f18918d = new a();

        a() {
            super(2, kotlin.math.b.class, "min", "min(II)I", 1);
        }

        @fg.l
        public final Integer Z(int i4, int i5) {
            return Integer.valueOf(Math.min(i4, i5));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Z(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0341b extends kotlin.jvm.internal.h0 implements ld.p<Integer, Integer, Integer> {

        /* renamed from: d, reason: collision with root package name */
        public static final C0341b f18919d = new C0341b();

        C0341b() {
            super(2, kotlin.math.b.class, "max", "max(II)I", 1);
        }

        @fg.l
        public final Integer Z(int i4, int i5) {
            return Integer.valueOf(Math.max(i4, i5));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Z(num.intValue(), num2.intValue());
        }
    }

    @fg.l
    public static final m a() {
        return f18916a;
    }

    @fg.l
    public static final m b() {
        return f18917b;
    }

    public static final int c(@fg.l androidx.compose.ui.layout.a aVar, int i4, int i5) {
        return aVar.a().invoke(Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
    }
}

package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* compiled from: Illuminant.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/j;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/e0;", "b", "Landroidx/compose/ui/graphics/colorspace/e0;", "a", "()Landroidx/compose/ui/graphics/colorspace/e0;", "A", "c", "B", "d", "C", "e", "D50", "f", "D55", "g", "D60", "h", "D65", "i", "D75", "j", "E", "", "k", "[F", "()[F", "D50Xyz", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j f17726a = new j();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 A = new e0(0.44757f, 0.40745f);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 B = new e0(0.34842f, 0.35161f);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 C = new e0(0.31006f, 0.31616f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 D50 = new e0(0.34567f, 0.3585f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 D55 = new e0(0.33242f, 0.34743f);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 D60 = new e0(0.32168f, 0.33767f);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 D65 = new e0(0.31271f, 0.32902f);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 D75 = new e0(0.29902f, 0.31485f);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e0 E = new e0(0.33333f, 0.33333f);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private j() {
    }

    @fg.l
    public final e0 a() {
        return A;
    }

    @fg.l
    public final e0 b() {
        return B;
    }

    @fg.l
    public final e0 c() {
        return C;
    }

    @fg.l
    public final e0 d() {
        return D50;
    }

    @fg.l
    public final float[] e() {
        return D50Xyz;
    }

    @fg.l
    public final e0 f() {
        return D55;
    }

    @fg.l
    public final e0 g() {
        return D60;
    }

    @fg.l
    public final e0 h() {
        return D65;
    }

    @fg.l
    public final e0 i() {
        return D75;
    }

    @fg.l
    public final e0 j() {
        return E;
    }
}

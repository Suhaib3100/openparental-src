package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: ImageBitmap.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJS\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "Lkotlin/k2;", "b", "([IIIIIII)V", "c", "()V", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/colorspace/c;", "e", "()Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "", "d", "()Z", "hasAlpha", "Landroidx/compose/ui/graphics/t4;", "f", "config", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s4 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f18026a;

    /* compiled from: ImageBitmap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/s4$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.s4$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18026a = new Companion();

        private Companion() {
        }
    }

    /* compiled from: ImageBitmap.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
    }

    static /* synthetic */ void a(s4 s4Var, int[] iArr, int i4, int i5, int i6, int i7, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int i13 = (i12 & 2) != 0 ? 0 : i4;
        int i14 = (i12 & 4) != 0 ? 0 : i5;
        int width = (i12 & 8) != 0 ? s4Var.getWidth() : i6;
        s4Var.b(iArr, i13, i14, width, (i12 & 16) != 0 ? s4Var.getHeight() : i7, (i12 & 32) == 0 ? i10 : 0, (i12 & 64) != 0 ? width : i11);
    }

    void b(@fg.l int[] buffer, int startX, int startY, int width, int height, int bufferOffset, int stride);

    void c();

    boolean d();

    @fg.l
    androidx.compose.ui.graphics.colorspace.c e();

    int f();

    int getHeight();

    int getWidth();
}

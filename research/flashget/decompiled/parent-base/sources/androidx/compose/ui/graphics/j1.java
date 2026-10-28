package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/j1;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/graphics/t4;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroid/graphics/Bitmap;", "b", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j1 f17865a = new j1();

    private j1() {
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    public static final androidx.compose.ui.graphics.colorspace.c a(@fg.l Bitmap bitmap) {
        ColorSpace colorSpace;
        colorSpace = bitmap.getColorSpace();
        if (colorSpace != null) {
            h4 h4Var = h4.f17843a;
            androidx.compose.ui.graphics.colorspace.c h4 = h4.h(colorSpace);
            if (h4 != null) {
                return h4;
            }
        }
        return androidx.compose.ui.graphics.colorspace.g.f17689a.x();
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    public static final Bitmap b(int width, int height, int bitmapConfig, boolean hasAlpha, @fg.l androidx.compose.ui.graphics.colorspace.c colorSpace) {
        Bitmap createBitmap;
        Bitmap.Config d5 = r0.d(bitmapConfig);
        h4 h4Var = h4.f17843a;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, d5, hasAlpha, h4.e(colorSpace));
        return createBitmap;
    }
}

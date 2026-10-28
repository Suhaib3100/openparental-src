package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/p0;", "Landroidx/compose/ui/graphics/s4;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "Lkotlin/k2;", "b", "([IIIIIII)V", "c", "()V", "Landroid/graphics/Bitmap;", "g", "()Landroid/graphics/Bitmap;", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/t4;", "f", "config", "Landroidx/compose/ui/graphics/colorspace/c;", "e", "()Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "", "d", "()Z", "hasAlpha", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 implements s4 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bitmap bitmap;

    public p0(@fg.l Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // androidx.compose.ui.graphics.s4
    public void b(@fg.l int[] buffer, int startX, int startY, int width, int height, int bufferOffset, int stride) {
        Bitmap.Config config;
        Bitmap b5 = r0.b(this);
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = b5.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                b5 = b5.copy(Bitmap.Config.ARGB_8888, false);
                z4 = true;
            }
        }
        b5.getPixels(buffer, bufferOffset, stride, startX, startY, width, height);
        if (z4) {
            b5.recycle();
        }
    }

    @Override // androidx.compose.ui.graphics.s4
    public void c() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.s4
    public boolean d() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.s4
    @fg.l
    public androidx.compose.ui.graphics.colorspace.c e() {
        if (Build.VERSION.SDK_INT < 26) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.x();
        }
        j1 j1Var = j1.f17865a;
        return j1.a(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.s4
    public int f() {
        return r0.e(this.bitmap.getConfig());
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.s4
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.s4
    public int getWidth() {
        return this.bitmap.getWidth();
    }
}

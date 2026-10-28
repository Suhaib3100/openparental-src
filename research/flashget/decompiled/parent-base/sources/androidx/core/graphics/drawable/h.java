package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: RoundedBitmapDrawable21.java */
@x0(21)
/* loaded from: classes3.dex */
class h extends i {
    protected h(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.i
    void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        Gravity.apply(i4, i5, i6, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        t();
        outline.setRoundRect(this.f26224h, c());
    }

    @Override // androidx.core.graphics.drawable.i
    public boolean h() {
        Bitmap bitmap = this.f26217a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.i
    public void o(boolean z4) {
        Bitmap bitmap = this.f26217a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z4);
            invalidateSelf();
        }
    }
}

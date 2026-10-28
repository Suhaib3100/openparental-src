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
class m extends n {
    protected m(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.n
    void f(int i5, int i6, int i7, Rect rect, Rect rect2) {
        Gravity.apply(i5, i6, i7, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        t();
        outline.setRoundRect(this.f4736h, c());
    }

    @Override // androidx.core.graphics.drawable.n
    public boolean h() {
        Bitmap bitmap = this.f4729a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.n
    public void o(boolean z5) {
        Bitmap bitmap = this.f4729a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z5);
            invalidateSelf();
        }
    }
}

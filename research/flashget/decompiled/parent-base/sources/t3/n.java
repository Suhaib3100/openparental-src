package t3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageUtils.java */
/* loaded from: classes3.dex */
public class n {
    private n() {
    }

    public static void a(ImageView imageView, Object obj) {
        if (obj == null) {
            return;
        }
        Drawable drawable = obj instanceof Drawable ? (Drawable) obj : obj instanceof Integer ? androidx.core.content.d.getDrawable(imageView.getContext(), ((Integer) obj).intValue()) : null;
        if (drawable == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }
}

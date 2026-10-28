package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* compiled from: ImageViewUtils.java */
/* loaded from: classes3.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f34432a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f34433b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f34434c;

    private l() {
    }

    static void a(@androidx.annotation.o0 ImageView imageView, @androidx.annotation.q0 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            c(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void b() {
        if (f34434c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f34433b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f34434c = true;
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.x0(21)
    private static void c(@androidx.annotation.o0 ImageView imageView, @androidx.annotation.q0 Matrix matrix) {
        if (f34432a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f34432a = false;
            }
        }
    }
}

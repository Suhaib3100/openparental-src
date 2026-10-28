package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* compiled from: ImageViewUtils.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9931a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f9932b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9933c;

    private n() {
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
        if (f9933c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f9932b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f9933c = true;
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.x0(21)
    private static void c(@androidx.annotation.o0 ImageView imageView, @androidx.annotation.q0 Matrix matrix) {
        if (f9931a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f9931a = false;
            }
        }
    }
}

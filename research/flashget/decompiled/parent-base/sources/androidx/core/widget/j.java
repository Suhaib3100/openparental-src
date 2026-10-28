package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ImageViewCompat.java */
/* loaded from: classes3.dex */
public class j {

    /* compiled from: ImageViewCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private j() {
    }

    @q0
    public static ColorStateList a(@o0 ImageView imageView) {
        return imageView.getImageTintList();
    }

    @q0
    public static PorterDuff.Mode b(@o0 ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(@o0 ImageView imageView, @q0 ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(@o0 ImageView imageView, @q0 PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}

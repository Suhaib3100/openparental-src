package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ImageViewCompat.java */
/* loaded from: classes.dex */
public class l {

    /* compiled from: ImageViewCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @androidx.annotation.u
        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @androidx.annotation.u
        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private l() {
    }

    @q0
    public static ColorStateList a(@o0 ImageView imageView) {
        return a.a(imageView);
    }

    @q0
    public static PorterDuff.Mode b(@o0 ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@o0 ImageView imageView, @q0 ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@o0 ImageView imageView, @q0 PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}

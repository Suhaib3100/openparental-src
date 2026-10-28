package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27580a = "CompoundButtonCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Field f27581b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f27582c;

    /* compiled from: CompoundButtonCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private d() {
    }

    @q0
    public static Drawable a(@o0 CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    @q0
    public static ColorStateList b(@o0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @q0
    public static PorterDuff.Mode c(@o0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void d(@o0 CompoundButton compoundButton, @q0 ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void e(@o0 CompoundButton compoundButton, @q0 PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}

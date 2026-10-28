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
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5888a = "CompoundButtonCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Field f5889b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5890c;

    /* compiled from: CompoundButtonCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @androidx.annotation.u
        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @androidx.annotation.u
        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private d() {
    }

    @q0
    public static Drawable a(@o0 CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @q0
    public static ColorStateList b(@o0 CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @q0
    public static PorterDuff.Mode c(@o0 CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@o0 CompoundButton compoundButton, @q0 ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@o0 CompoundButton compoundButton, @q0 PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}

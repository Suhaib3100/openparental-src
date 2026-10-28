package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.Field;

/* compiled from: CheckedTextViewCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5884a = "CheckedTextViewCompat";

    /* compiled from: CheckedTextViewCompat.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f5885a;

        /* renamed from: b, reason: collision with root package name */
        private static boolean f5886b;

        private a() {
        }

        @q0
        static Drawable a(@o0 CheckedTextView checkedTextView) {
            if (!f5886b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f5885a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f5886b = true;
            }
            Field field = f5885a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    f5885a = null;
                }
            }
            return null;
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    @x0(16)
    private static class b {
        private b() {
        }

        @q0
        static Drawable a(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    @x0(21)
    /* renamed from: androidx.core.widget.c$c, reason: collision with other inner class name */
    private static class C0061c {
        private C0061c() {
        }

        @q0
        static ColorStateList a(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @q0
        static PorterDuff.Mode b(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        static void c(@o0 CheckedTextView checkedTextView, @q0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void d(@o0 CheckedTextView checkedTextView, @q0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private c() {
    }

    @q0
    public static Drawable a(@o0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @q0
    public static ColorStateList b(@o0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintList();
    }

    @q0
    public static PorterDuff.Mode c(@o0 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintMode();
    }

    public static void d(@o0 CheckedTextView checkedTextView, @q0 ColorStateList colorStateList) {
        checkedTextView.setCheckMarkTintList(colorStateList);
    }

    public static void e(@o0 CheckedTextView checkedTextView, @q0 PorterDuff.Mode mode) {
        checkedTextView.setCheckMarkTintMode(mode);
    }
}

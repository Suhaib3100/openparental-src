package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.annotation.x0;

/* compiled from: CheckedTextViewCompat.java */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: CheckedTextViewCompat.java */
    @x0(21)
    private static class a {
        private a() {
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
    @w0(expression = "textView.getCheckMarkDrawable()")
    @Deprecated
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

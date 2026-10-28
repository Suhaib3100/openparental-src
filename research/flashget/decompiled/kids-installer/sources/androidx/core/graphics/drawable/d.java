package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4723a = "DrawableCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f4724b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4725c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f4726d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4727e;

    /* compiled from: DrawableCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @u
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @u
        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i5) {
            return drawableContainerState.getChild(i5);
        }

        @u
        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @u
        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @u
        static void e(Drawable drawable, boolean z5) {
            drawable.setAutoMirrored(z5);
        }
    }

    /* compiled from: DrawableCompat.java */
    @x0(21)
    static class b {
        private b() {
        }

        @u
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @u
        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @u
        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @u
        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        static void e(Drawable drawable, float f6, float f7) {
            drawable.setHotspot(f6, f7);
        }

        @u
        static void f(Drawable drawable, int i5, int i6, int i7, int i8) {
            drawable.setHotspotBounds(i5, i6, i7, i8);
        }

        @u
        static void g(Drawable drawable, int i5) {
            drawable.setTint(i5);
        }

        @u
        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @u
        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    @x0(23)
    static class c {
        private c() {
        }

        @u
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @u
        static boolean b(Drawable drawable, int i5) {
            return drawable.setLayoutDirection(i5);
        }
    }

    private d() {
    }

    public static void a(@o0 Drawable drawable, @o0 Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@o0 Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@o0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@o0 Drawable drawable) {
        return a.a(drawable);
    }

    @q0
    public static ColorFilter e(@o0 Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@o0 Drawable drawable) {
        return c.a(drawable);
    }

    public static void g(@o0 Drawable drawable, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@o0 Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@o0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@o0 Drawable drawable, boolean z5) {
        a.e(drawable, z5);
    }

    public static void k(@o0 Drawable drawable, float f6, float f7) {
        b.e(drawable, f6, f7);
    }

    public static void l(@o0 Drawable drawable, int i5, int i6, int i7, int i8) {
        b.f(drawable, i5, i6, i7, i8);
    }

    public static boolean m(@o0 Drawable drawable, int i5) {
        return c.b(drawable, i5);
    }

    public static void n(@o0 Drawable drawable, @androidx.annotation.l int i5) {
        b.g(drawable, i5);
    }

    public static void o(@o0 Drawable drawable, @q0 ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@o0 Drawable drawable, @o0 PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@o0 Drawable drawable) {
        return drawable instanceof q ? (T) ((q) drawable).b() : drawable;
    }

    @o0
    public static Drawable r(@o0 Drawable drawable) {
        return drawable;
    }
}

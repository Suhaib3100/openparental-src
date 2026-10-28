package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26211a = "DrawableCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f26212b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f26213c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f26214d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f26215e;

    /* compiled from: DrawableCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f4, float f5) {
            drawable.setHotspot(f4, f5);
        }

        static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }

        static void g(Drawable drawable, int i4) {
            drawable.setTint(i4);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i4) {
            return drawable.setLayoutDirection(i4);
        }
    }

    private d() {
    }

    public static void a(@o0 Drawable drawable, @o0 Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(@o0 Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void c(@o0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    @w0(expression = "drawable.getAlpha()")
    @Deprecated
    public static int d(@o0 Drawable drawable) {
        return drawable.getAlpha();
    }

    @q0
    public static ColorFilter e(@o0 Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int f(@o0 Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void g(@o0 Drawable drawable, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @w0(expression = "drawable.isAutoMirrored()")
    @Deprecated
    public static boolean h(@o0 Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @w0(expression = "drawable.jumpToCurrentState()")
    @Deprecated
    public static void i(@o0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @w0(expression = "drawable.setAutoMirrored(mirrored)")
    @Deprecated
    public static void j(@o0 Drawable drawable, boolean z4) {
        drawable.setAutoMirrored(z4);
    }

    public static void k(@o0 Drawable drawable, float f4, float f5) {
        drawable.setHotspot(f4, f5);
    }

    public static void l(@o0 Drawable drawable, int i4, int i5, int i6, int i7) {
        drawable.setHotspotBounds(i4, i5, i6, i7);
    }

    public static boolean m(@o0 Drawable drawable, int i4) {
        return drawable.setLayoutDirection(i4);
    }

    public static void n(@o0 Drawable drawable, @androidx.annotation.l int i4) {
        drawable.setTint(i4);
    }

    public static void o(@o0 Drawable drawable, @q0 ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void p(@o0 Drawable drawable, @q0 PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@o0 Drawable drawable) {
        return drawable instanceof l ? (T) ((l) drawable).a() : drawable;
    }

    @o0
    public static Drawable r(@o0 Drawable drawable) {
        return drawable;
    }
}

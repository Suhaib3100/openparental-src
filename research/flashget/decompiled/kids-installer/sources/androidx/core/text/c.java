package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5132a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5133b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5134c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5135d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5136e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5137f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5138g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5139h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5140i = 256;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5141j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5142k = 63;

    /* compiled from: HtmlCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Spanned a(String str, int i5) {
            return Html.fromHtml(str, i5);
        }

        @androidx.annotation.u
        static Spanned b(String str, int i5, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i5, imageGetter, tagHandler);
        }

        @androidx.annotation.u
        static String c(Spanned spanned, int i5) {
            return Html.toHtml(spanned, i5);
        }
    }

    private c() {
    }

    @o0
    public static Spanned a(@o0 String str, int i5) {
        return a.a(str, i5);
    }

    @o0
    public static Spanned b(@o0 String str, int i5, @q0 Html.ImageGetter imageGetter, @q0 Html.TagHandler tagHandler) {
        return a.b(str, i5, imageGetter, tagHandler);
    }

    @o0
    public static String c(@o0 Spanned spanned, int i5) {
        return a.c(spanned, i5);
    }
}

package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26703a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f26704b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f26705c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26706d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f26707e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f26708f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f26709g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f26710h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f26711i = 256;

    /* renamed from: j, reason: collision with root package name */
    public static final int f26712j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f26713k = 63;

    /* compiled from: HtmlCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        static Spanned a(String str, int i4) {
            return Html.fromHtml(str, i4);
        }

        static Spanned b(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i4, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i4) {
            return Html.toHtml(spanned, i4);
        }
    }

    private c() {
    }

    @o0
    public static Spanned a(@o0 String str, int i4) {
        return Html.fromHtml(str, i4);
    }

    @o0
    public static Spanned b(@o0 String str, int i4, @q0 Html.ImageGetter imageGetter, @q0 Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i4, imageGetter, tagHandler);
    }

    @o0
    public static String c(@o0 Spanned spanned, int i4) {
        return Html.toHtml(spanned, i4);
    }
}

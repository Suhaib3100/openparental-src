package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27231a = 16777216;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27232b = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final int f27240j = 2048;

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final int f27241k = 1024;

    /* renamed from: d, reason: collision with root package name */
    private static final String f27234d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e, reason: collision with root package name */
    private static final String f27235e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f, reason: collision with root package name */
    private static final String f27236f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g, reason: collision with root package name */
    private static final String f27237g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h, reason: collision with root package name */
    private static final String f27238h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final String f27239i = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f27233c = new String[0];

    /* compiled from: EditorInfoCompat.java */
    @x0(30)
    private static class a {
        private a() {
        }

        static CharSequence a(@o0 EditorInfo editorInfo, int i4) {
            return editorInfo.getInitialSelectedText(i4);
        }

        static CharSequence b(@o0 EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextAfterCursor(i4, i5);
        }

        static CharSequence c(@o0 EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextBeforeCursor(i4, i5);
        }

        static void d(@o0 EditorInfo editorInfo, CharSequence charSequence, int i4) {
            editorInfo.setInitialSurroundingSubText(charSequence, i4);
        }
    }

    /* compiled from: EditorInfoCompat.java */
    @x0(35)
    private static class b {
        private b() {
        }

        static boolean a(@o0 EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }

        static void b(@o0 EditorInfo editorInfo, boolean z4) {
            editorInfo.setStylusHandwritingEnabled(z4);
        }
    }

    @Deprecated
    public c() {
    }

    @o0
    public static String[] a(@o0 EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f27233c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f27233c;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f27233c;
    }

    @q0
    public static CharSequence b(@o0 EditorInfo editorInfo, int i4) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i4);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i5 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int i6 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int i7 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i6 - i5 != i7 || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        return (i4 & 1) != 0 ? charSequence.subSequence(i5, i6) : TextUtils.substring(charSequence, i5, i6);
    }

    @q0
    public static CharSequence c(@o0 EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int min = Math.min(i4, charSequence.length() - i6);
        return (i5 & 1) != 0 ? charSequence.subSequence(i6, min + i6) : TextUtils.substring(charSequence, i6, min + i6);
    }

    @q0
    public static CharSequence d(@o0 EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int min = Math.min(i4, i6);
        return (i5 & 1) != 0 ? charSequence.subSequence(i6 - min, i6) : TextUtils.substring(charSequence, i6 - min, i6);
    }

    static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        boolean containsKey2 = editorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        return containsKey2 ? 2 : 0;
    }

    private static boolean f(CharSequence charSequence, int i4, int i5) {
        if (i5 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i4));
        }
        if (i5 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i4));
    }

    private static boolean g(int i4) {
        int i5 = i4 & org.apache.tools.zip.d.f86736x2;
        return i5 == 129 || i5 == 225 || i5 == 18;
    }

    public static boolean h(@o0 EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle != null && bundle.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED")) {
            return editorInfo.extras.getBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED");
        }
        if (androidx.core.os.b.m()) {
            return b.a(editorInfo);
        }
        return false;
    }

    public static void i(@o0 EditorInfo editorInfo, @q0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void j(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence, int i4) {
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i4);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 - i4 : i5 - i4;
        int i10 = i5 > i6 ? i5 - i4 : i6 - i4;
        int length = charSequence.length();
        if (i4 < 0 || i7 < 0 || i10 > length) {
            m(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            m(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m(editorInfo, charSequence, i7, i10);
        } else {
            n(editorInfo, charSequence, i7, i10);
        }
    }

    public static void k(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            j(editorInfo, charSequence, 0);
        }
    }

    public static void l(@o0 EditorInfo editorInfo, boolean z4) {
        if (androidx.core.os.b.m()) {
            b.b(editorInfo, z4);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z4);
    }

    private static void m(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    private static void n(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i10 = 2048 - i7;
        int min = Math.min(charSequence.length() - i5, i10 - Math.min(i4, (int) (i10 * 0.8d)));
        int min2 = Math.min(i4, i10 - min);
        int i11 = i4 - min2;
        if (f(charSequence, i11, 0)) {
            i11++;
            min2--;
        }
        if (f(charSequence, (i5 + min) - 1, 1)) {
            min--;
        }
        m(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i11, i11 + min2), charSequence.subSequence(i5, min + i5)) : charSequence.subSequence(i11, min2 + i7 + min + i11), min2, i7 + min2);
    }
}

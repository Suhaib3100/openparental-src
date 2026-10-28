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
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5550a = 16777216;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5551b = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final int f5558i = 2048;

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final int f5559j = 1024;

    /* renamed from: d, reason: collision with root package name */
    private static final String f5553d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e, reason: collision with root package name */
    private static final String f5554e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f, reason: collision with root package name */
    private static final String f5555f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g, reason: collision with root package name */
    private static final String f5556g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h, reason: collision with root package name */
    private static final String f5557h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f5552c = new String[0];

    /* compiled from: EditorInfoCompat.java */
    @x0(30)
    private static class a {
        private a() {
        }

        static CharSequence a(@o0 EditorInfo editorInfo, int i5) {
            CharSequence initialSelectedText;
            initialSelectedText = editorInfo.getInitialSelectedText(i5);
            return initialSelectedText;
        }

        static CharSequence b(@o0 EditorInfo editorInfo, int i5, int i6) {
            CharSequence initialTextAfterCursor;
            initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(i5, i6);
            return initialTextAfterCursor;
        }

        static CharSequence c(@o0 EditorInfo editorInfo, int i5, int i6) {
            CharSequence initialTextBeforeCursor;
            initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(i5, i6);
            return initialTextBeforeCursor;
        }

        static void d(@o0 EditorInfo editorInfo, CharSequence charSequence, int i5) {
            editorInfo.setInitialSurroundingSubText(charSequence, i5);
        }
    }

    @Deprecated
    public g() {
    }

    @o0
    public static String[] a(@o0 EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f5552c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f5552c;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f5552c;
    }

    @q0
    public static CharSequence b(@o0 EditorInfo editorInfo, int i5) {
        CharSequence charSequence;
        CharSequence initialSelectedText;
        if (Build.VERSION.SDK_INT >= 30) {
            initialSelectedText = editorInfo.getInitialSelectedText(i5);
            return initialSelectedText;
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i6 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int i7 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int i8 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i7 - i6 != i8 || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        return (i5 & 1) != 0 ? charSequence.subSequence(i6, i7) : TextUtils.substring(charSequence, i6, i7);
    }

    @q0
    public static CharSequence c(@o0 EditorInfo editorInfo, int i5, int i6) {
        CharSequence charSequence;
        CharSequence initialTextAfterCursor;
        if (Build.VERSION.SDK_INT >= 30) {
            initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(i5, i6);
            return initialTextAfterCursor;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i7 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int min = Math.min(i5, charSequence.length() - i7);
        return (i6 & 1) != 0 ? charSequence.subSequence(i7, min + i7) : TextUtils.substring(charSequence, i7, min + i7);
    }

    @q0
    public static CharSequence d(@o0 EditorInfo editorInfo, int i5, int i6) {
        CharSequence charSequence;
        CharSequence initialTextBeforeCursor;
        if (Build.VERSION.SDK_INT >= 30) {
            initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(i5, i6);
            return initialTextBeforeCursor;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i7 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int min = Math.min(i5, i7);
        return (i6 & 1) != 0 ? charSequence.subSequence(i7 - min, i7) : TextUtils.substring(charSequence, i7 - min, i7);
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

    private static boolean f(CharSequence charSequence, int i5, int i6) {
        if (i6 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i5));
        }
        if (i6 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i5));
    }

    private static boolean g(int i5) {
        int i6 = i5 & 4095;
        return i6 == 129 || i6 == 225 || i6 == 18;
    }

    public static void h(@o0 EditorInfo editorInfo, @q0 String[] strArr) {
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

    public static void i(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence, int i5) {
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, i5);
            return;
        }
        int i6 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i6 > i7 ? i7 - i5 : i6 - i5;
        int i9 = i6 > i7 ? i6 - i5 : i7 - i5;
        int length = charSequence.length();
        if (i5 < 0 || i8 < 0 || i9 > length) {
            k(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            k(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            k(editorInfo, charSequence, i8, i9);
        } else {
            l(editorInfo, charSequence, i8, i9);
        }
    }

    public static void j(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    private static void k(EditorInfo editorInfo, CharSequence charSequence, int i5, int i6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i5);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i6);
    }

    private static void l(EditorInfo editorInfo, CharSequence charSequence, int i5, int i6) {
        int i7 = i6 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int min = Math.min(charSequence.length() - i6, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int min2 = Math.min(i5, i9 - min);
        int i10 = i5 - min2;
        if (f(charSequence, i10, 0)) {
            i10++;
            min2--;
        }
        if (f(charSequence, (i6 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i6, min + i6)) : charSequence.subSequence(i10, min2 + i8 + min + i10);
        int i11 = min2 + 0;
        k(editorInfo, concat, i11, i8 + i11);
    }
}

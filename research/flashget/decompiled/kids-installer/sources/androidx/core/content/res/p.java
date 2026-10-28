package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4662a = "http://schemas.android.com/apk/res/android";

    private p() {
    }

    public static int a(@o0 Context context, int i5, int i6) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i5, typedValue, true);
        return typedValue.resourceId != 0 ? i5 : i6;
    }

    public static boolean b(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6, boolean z5) {
        return typedArray.getBoolean(i5, typedArray.getBoolean(i6, z5));
    }

    @q0
    public static Drawable c(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6) {
        Drawable drawable = typedArray.getDrawable(i5);
        return drawable == null ? typedArray.getDrawable(i6) : drawable;
    }

    public static int d(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6, int i7) {
        return typedArray.getInt(i5, typedArray.getInt(i6, i7));
    }

    public static boolean e(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5, boolean z5) {
        return !r(xmlPullParser, str) ? z5 : typedArray.getBoolean(i5, z5);
    }

    @androidx.annotation.l
    public static int f(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5, @androidx.annotation.l int i6) {
        return !r(xmlPullParser, str) ? i6 : typedArray.getColor(i5, i6);
    }

    @q0
    public static ColorStateList g(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @i1 int i5) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i5, typedValue);
        int i6 = typedValue.type;
        if (i6 != 2) {
            return (i6 < 28 || i6 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i5 + ": " + typedValue);
    }

    @o0
    private static ColorStateList h(@o0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @i1 int i5, @androidx.annotation.l int i6) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i5, typedValue);
            int i7 = typedValue.type;
            if (i7 >= 28 && i7 <= 31) {
                return d.b(typedValue.data);
            }
            d g5 = d.g(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme);
            if (g5 != null) {
                return g5;
            }
        }
        return d.b(i6);
    }

    public static float j(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5, float f6) {
        return !r(xmlPullParser, str) ? f6 : typedArray.getFloat(i5, f6);
    }

    public static int k(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5, int i6) {
        return !r(xmlPullParser, str) ? i6 : typedArray.getInt(i5, i6);
    }

    @androidx.annotation.c
    public static int l(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5, @androidx.annotation.c int i6) {
        return !r(xmlPullParser, str) ? i6 : typedArray.getResourceId(i5, i6);
    }

    @q0
    public static String m(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i5) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i5);
        }
        return null;
    }

    @androidx.annotation.c
    public static int n(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6, @androidx.annotation.c int i7) {
        return typedArray.getResourceId(i5, typedArray.getResourceId(i6, i7));
    }

    @q0
    public static String o(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6) {
        String string = typedArray.getString(i5);
        return string == null ? typedArray.getString(i6) : string;
    }

    @q0
    public static CharSequence p(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6) {
        CharSequence text = typedArray.getText(i5);
        return text == null ? typedArray.getText(i6) : text;
    }

    @q0
    public static CharSequence[] q(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6) {
        CharSequence[] textArray = typedArray.getTextArray(i5);
        return textArray == null ? typedArray.getTextArray(i6) : textArray;
    }

    public static boolean r(@o0 XmlPullParser xmlPullParser, @o0 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @o0
    public static TypedArray s(@o0 Resources resources, @q0 Resources.Theme theme, @o0 AttributeSet attributeSet, @o0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @q0
    public static TypedValue t(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, int i5) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i5);
        }
        return null;
    }
}

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
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26152a = "http://schemas.android.com/apk/res/android";

    private n() {
    }

    public static int a(@o0 Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    public static boolean b(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5, boolean z4) {
        return typedArray.getBoolean(i4, typedArray.getBoolean(i5, z4));
    }

    @q0
    public static Drawable c(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5) {
        Drawable drawable = typedArray.getDrawable(i4);
        return drawable == null ? typedArray.getDrawable(i5) : drawable;
    }

    public static int d(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5, int i6) {
        return typedArray.getInt(i4, typedArray.getInt(i5, i6));
    }

    public static boolean e(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4, boolean z4) {
        return !r(xmlPullParser, str) ? z4 : typedArray.getBoolean(i4, z4);
    }

    @androidx.annotation.l
    public static int f(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4, @androidx.annotation.l int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getColor(i4, i5);
    }

    @q0
    public static ColorStateList g(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @i1 int i4) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i4, typedValue);
        int i5 = typedValue.type;
        if (i5 != 2) {
            return (i5 < 28 || i5 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme) : ColorStateList.valueOf(typedValue.data);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i4 + ": " + typedValue);
    }

    @o0
    private static ColorStateList h(@o0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @i1 int i4, @androidx.annotation.l int i5) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return d.b(typedValue.data);
            }
            d g4 = d.g(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            if (g4 != null) {
                return g4;
            }
        }
        return d.b(i5);
    }

    public static float j(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4, float f4) {
        return !r(xmlPullParser, str) ? f4 : typedArray.getFloat(i4, f4);
    }

    public static int k(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4, int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getInt(i4, i5);
    }

    @androidx.annotation.c
    public static int l(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4, @androidx.annotation.c int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getResourceId(i4, i5);
    }

    @q0
    public static String m(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @i1 int i4) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i4);
        }
        return null;
    }

    @androidx.annotation.c
    public static int n(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5, @androidx.annotation.c int i6) {
        return typedArray.getResourceId(i4, typedArray.getResourceId(i5, i6));
    }

    @q0
    public static String o(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5) {
        String string = typedArray.getString(i4);
        return string == null ? typedArray.getString(i5) : string;
    }

    @q0
    public static CharSequence p(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5) {
        CharSequence text = typedArray.getText(i4);
        return text == null ? typedArray.getText(i5) : text;
    }

    @q0
    public static CharSequence[] q(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        return textArray == null ? typedArray.getTextArray(i5) : textArray;
    }

    public static boolean r(@o0 XmlPullParser xmlPullParser, @o0 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @o0
    public static TypedArray s(@o0 Resources resources, @q0 Resources.Theme theme, @o0 AttributeSet attributeSet, @o0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @q0
    public static TypedValue t(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, int i4) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i4);
        }
        return null;
    }
}

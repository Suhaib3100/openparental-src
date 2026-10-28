package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import androidx.annotation.x;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ColorStateListInflaterCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f26106a = new ThreadLocal<>();

    private c() {
    }

    @o0
    public static ColorStateList a(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @o0
    public static ColorStateList b(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @o0
    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f26106a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @q0
    public static ColorStateList d(@o0 Resources resources, @o1 int i4, @q0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i4), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList e(@androidx.annotation.o0 android.content.res.Resources r17, @androidx.annotation.o0 org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.o0 android.util.AttributeSet r19, @androidx.annotation.q0 android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.c.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean f(@o0 Resources resources, @androidx.annotation.n int i4) {
        TypedValue c5 = c();
        resources.getValue(i4, c5, true);
        int i5 = c5.type;
        return i5 >= 28 && i5 <= 31;
    }

    @androidx.annotation.l
    private static int g(@androidx.annotation.l int i4, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 100.0d) float f5) {
        boolean z4 = f5 >= 0.0f && f5 <= 100.0f;
        if (f4 == 1.0f && !z4) {
            return i4;
        }
        int e4 = e1.a.e((int) ((Color.alpha(i4) * f4) + 0.5f), 0, 255);
        if (z4) {
            a c5 = a.c(i4);
            i4 = a.r(c5.j(), c5.i(), f5, o.f26153k);
        }
        return (i4 & 16777215) | (e4 << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

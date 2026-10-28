package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z0.a;

/* compiled from: GradientColorInflaterCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26129a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f26130b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f26131c = 2;

    private g() {
    }

    private static a a(@q0 a aVar, @androidx.annotation.l int i4, @androidx.annotation.l int i5, boolean z4, @androidx.annotation.l int i6) {
        return aVar != null ? aVar : z4 ? new a(i4, i6, i5) : new a(i4, i5);
    }

    static Shader b(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static Shader c(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray s4 = n.s(resources, theme, attributeSet, a.j.D);
        float j4 = n.j(s4, xmlPullParser, "startX", a.j.M, 0.0f);
        float j5 = n.j(s4, xmlPullParser, "startY", a.j.N, 0.0f);
        float j6 = n.j(s4, xmlPullParser, "endX", a.j.O, 0.0f);
        float j7 = n.j(s4, xmlPullParser, "endY", a.j.P, 0.0f);
        float j10 = n.j(s4, xmlPullParser, "centerX", a.j.H, 0.0f);
        float j11 = n.j(s4, xmlPullParser, "centerY", a.j.I, 0.0f);
        int k4 = n.k(s4, xmlPullParser, "type", a.j.G, 0);
        int f4 = n.f(s4, xmlPullParser, "startColor", a.j.E, 0);
        boolean r4 = n.r(xmlPullParser, "centerColor");
        int f5 = n.f(s4, xmlPullParser, "centerColor", a.j.L, 0);
        int f6 = n.f(s4, xmlPullParser, "endColor", a.j.F, 0);
        int k5 = n.k(s4, xmlPullParser, "tileMode", a.j.K, 0);
        float j12 = n.j(s4, xmlPullParser, "gradientRadius", a.j.J, 0.0f);
        s4.recycle();
        a a5 = a(d(resources, xmlPullParser, attributeSet, theme), f4, f6, r4, f5);
        if (k4 != 1) {
            return k4 != 2 ? new LinearGradient(j4, j5, j6, j7, a5.f26132a, a5.f26133b, e(k5)) : new SweepGradient(j10, j11, a5.f26132a, a5.f26133b);
        }
        if (j12 > 0.0f) {
            return new RadialGradient(j10, j11, j12, a5.f26132a, a5.f26133b, e(k5));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.g.a d(@androidx.annotation.o0 android.content.res.Resources r9, @androidx.annotation.o0 org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.o0 android.util.AttributeSet r11, @androidx.annotation.q0 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = z0.a.j.Q
            android.content.res.TypedArray r3 = androidx.core.content.res.n.s(r9, r12, r11, r3)
            int r5 = z0.a.j.R
            boolean r6 = r3.hasValue(r5)
            int r7 = z0.a.j.S
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.g$a r9 = new androidx.core.content.res.g$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.g.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.g$a");
    }

    private static Shader.TileMode e(int i4) {
        return i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f26132a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f26133b;

        a(@o0 List<Integer> list, @o0 List<Float> list2) {
            int size = list.size();
            this.f26132a = new int[size];
            this.f26133b = new float[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f26132a[i4] = list.get(i4).intValue();
                this.f26133b[i4] = list2.get(i4).floatValue();
            }
        }

        a(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
            this.f26132a = new int[]{i4, i5};
            this.f26133b = new float[]{0.0f, 1.0f};
        }

        a(@androidx.annotation.l int i4, @androidx.annotation.l int i5, @androidx.annotation.l int i6) {
            this.f26132a = new int[]{i4, i5, i6};
            this.f26133b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

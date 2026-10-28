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
import k.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4640a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f4641b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f4642c = 2;

    private g() {
    }

    private static a a(@q0 a aVar, @androidx.annotation.l int i5, @androidx.annotation.l int i6, boolean z5, @androidx.annotation.l int i7) {
        return aVar != null ? aVar : z5 ? new a(i5, i7, i6) : new a(i5, i6);
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
        TypedArray s5 = p.s(resources, theme, attributeSet, a.j.C);
        float j5 = p.j(s5, xmlPullParser, "startX", a.j.L, 0.0f);
        float j6 = p.j(s5, xmlPullParser, "startY", a.j.M, 0.0f);
        float j7 = p.j(s5, xmlPullParser, "endX", a.j.N, 0.0f);
        float j8 = p.j(s5, xmlPullParser, "endY", a.j.O, 0.0f);
        float j9 = p.j(s5, xmlPullParser, "centerX", a.j.G, 0.0f);
        float j10 = p.j(s5, xmlPullParser, "centerY", a.j.H, 0.0f);
        int k5 = p.k(s5, xmlPullParser, "type", a.j.F, 0);
        int f6 = p.f(s5, xmlPullParser, "startColor", a.j.D, 0);
        boolean r5 = p.r(xmlPullParser, "centerColor");
        int f7 = p.f(s5, xmlPullParser, "centerColor", a.j.K, 0);
        int f8 = p.f(s5, xmlPullParser, "endColor", a.j.E, 0);
        int k6 = p.k(s5, xmlPullParser, "tileMode", a.j.J, 0);
        float j11 = p.j(s5, xmlPullParser, "gradientRadius", a.j.I, 0.0f);
        s5.recycle();
        a a6 = a(d(resources, xmlPullParser, attributeSet, theme), f6, f8, r5, f7);
        if (k5 != 1) {
            return k5 != 2 ? new LinearGradient(j5, j6, j7, j8, a6.f4643a, a6.f4644b, e(k6)) : new SweepGradient(j9, j10, a6.f4643a, a6.f4644b);
        }
        if (j11 > 0.0f) {
            return new RadialGradient(j9, j10, j11, a6.f4643a, a6.f4644b, e(k6));
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
            int[] r3 = k.a.j.P
            android.content.res.TypedArray r3 = androidx.core.content.res.p.s(r9, r12, r11, r3)
            int r5 = k.a.j.Q
            boolean r6 = r3.hasValue(r5)
            int r7 = k.a.j.R
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

    private static Shader.TileMode e(int i5) {
        return i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f4643a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f4644b;

        a(@o0 List<Integer> list, @o0 List<Float> list2) {
            int size = list.size();
            this.f4643a = new int[size];
            this.f4644b = new float[size];
            for (int i5 = 0; i5 < size; i5++) {
                this.f4643a[i5] = list.get(i5).intValue();
                this.f4644b[i5] = list2.get(i5).floatValue();
            }
        }

        a(@androidx.annotation.l int i5, @androidx.annotation.l int i6) {
            this.f4643a = new int[]{i5, i6};
            this.f4644b = new float[]{0.0f, 1.0f};
        }

        a(@androidx.annotation.l int i5, @androidx.annotation.l int i6, @androidx.annotation.l int i7) {
            this.f4643a = new int[]{i5, i6, i7};
            this.f4644b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.c1;
import androidx.core.content.res.p;
import androidx.core.graphics.b2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorInflaterCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10205a = "AnimatorInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final int f10206b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f10207c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f10208d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f10209e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f10210f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f10211g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f10212h = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f10213i = false;

    /* compiled from: AnimatorInflaterCompat.java */
    private static class a implements TypeEvaluator<b2.b[]> {

        /* renamed from: a, reason: collision with root package name */
        private b2.b[] f10214a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b2.b[] evaluate(float f6, b2.b[] bVarArr, b2.b[] bVarArr2) {
            if (!b2.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!b2.b(this.f10214a, bVarArr)) {
                this.f10214a = b2.f(bVarArr);
            }
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                this.f10214a[i5].d(bVarArr[i5], bVarArr2[i5], f6);
            }
            return this.f10214a;
        }

        a(b2.b[] bVarArr) {
            this.f10214a = bVarArr;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f6) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f6) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f6) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f6) : Keyframe.ofObject(f6);
    }

    private static void d(Keyframe[] keyframeArr, float f6, int i5, int i6) {
        float f7 = f6 / ((i6 - i5) + 2);
        while (i5 <= i6) {
            keyframeArr[i5].setFraction(keyframeArr[i5 - 1].getFraction() + f7);
            i5++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        for (Object obj : objArr) {
            Keyframe keyframe = (Keyframe) obj;
            Object obj2 = "null";
            Objects.toString(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            if (keyframe.hasValue()) {
                obj2 = keyframe.getValue();
            }
            Objects.toString(obj2);
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i5, int i6, int i7, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i6);
        boolean z5 = peekValue != null;
        int i8 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i7);
        boolean z6 = peekValue2 != null;
        int i9 = z6 ? peekValue2.type : 0;
        if (i5 == 4) {
            i5 = ((z5 && i(i8)) || (z6 && i(i9))) ? 3 : 0;
        }
        boolean z7 = i5 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i5 != 2) {
            f a6 = i5 == 3 ? f.a() : null;
            if (z7) {
                if (z5) {
                    float dimension = i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f);
                    if (z6) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z5) {
                int dimension2 = i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : i(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0);
                if (z6) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : i(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z6) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : i(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
            }
            if (propertyValuesHolder == null || a6 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(a6);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i6);
        String string2 = typedArray.getString(i7);
        b2.b[] d6 = b2.d(string);
        b2.b[] d7 = b2.d(string2);
        if (d6 == null && d7 == null) {
            return null;
        }
        if (d6 == null) {
            if (d7 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d7);
            }
            return null;
        }
        a aVar = new a();
        if (d7 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d6);
        } else {
            if (!b2.b(d6, d7)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d6, d7);
        }
        return ofObject;
    }

    private static int g(TypedArray typedArray, int i5, int i6) {
        TypedValue peekValue = typedArray.peekValue(i5);
        boolean z5 = peekValue != null;
        int i7 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i6);
        boolean z6 = peekValue2 != null;
        return ((z5 && i(i7)) || (z6 && i(z6 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10147h0);
        int i5 = 0;
        TypedValue t5 = p.t(s5, xmlPullParser, "value", 0);
        if ((t5 != null) && i(t5.type)) {
            i5 = 3;
        }
        s5.recycle();
        return i5;
    }

    private static boolean i(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    public static Animator j(Context context, @androidx.annotation.b int i5) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i5);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i5) throws Resources.NotFoundException {
        return l(context, resources, theme, i5, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i5, float f6) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i5);
                    return a(context, resources, theme, xmlResourceParser, f6);
                } catch (XmlPullParserException e6) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                    notFoundException.initCause(e6);
                    throw notFoundException;
                }
            } catch (IOException e7) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                notFoundException2.initCause(e7);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f6, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.R);
        TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10157m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s5, s6, f6, xmlPullParser);
        int l5 = p.l(s5, xmlPullParser, "interpolator", 0, 0);
        if (l5 > 0) {
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, l5));
        }
        s5.recycle();
        if (s6 != null) {
            s6.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i5, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10147h0);
        float j5 = p.j(s5, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t5 = p.t(s5, xmlPullParser, "value", 0);
        boolean z5 = t5 != null;
        if (i5 == 4) {
            i5 = (z5 && i(t5.type)) ? 3 : 0;
        }
        Keyframe ofInt = z5 ? i5 != 0 ? (i5 == 1 || i5 == 3) ? Keyframe.ofInt(j5, p.k(s5, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(j5, p.j(s5, xmlPullParser, "value", 0, 0.0f)) : i5 == 0 ? Keyframe.ofFloat(j5) : Keyframe.ofInt(j5);
        int l5 = p.l(s5, xmlPullParser, "interpolator", 1, 0);
        if (l5 > 0) {
            ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, l5));
        }
        s5.recycle();
        return ofInt;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f6, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f6, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i5) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i5 == 4) {
                    i5 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe n5 = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i5, xmlPullParser);
                if (n5 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n5);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i6 = 0; i6 < size; i6++) {
                Keyframe keyframe3 = keyframeArr[i6];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i6 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i7 = size - 1;
                        if (i6 == i7) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i8 = i6;
                            for (int i9 = i6 + 1; i9 < i7 && keyframeArr[i9].getFraction() < 0.0f; i9++) {
                                i8 = i9;
                            }
                            d(keyframeArr, keyframeArr[i8 + 1].getFraction() - keyframeArr[i6 - 1].getFraction(), i6, i8);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i5 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i5;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10137c0);
                    String m5 = p.m(s5, xmlPullParser, "propertyName", 3);
                    int k5 = p.k(s5, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder p5 = p(context, resources, theme, xmlPullParser, m5, k5);
                    if (p5 == null) {
                        p5 = f(s5, k5, 0, 1, m5);
                    }
                    if (p5 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p5);
                    }
                    s5.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i5 = 0; i5 < size; i5++) {
                propertyValuesHolderArr[i5] = (PropertyValuesHolder) arrayList.get(i5);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f6, XmlPullParser xmlPullParser) {
        long k5 = p.k(typedArray, xmlPullParser, "duration", 1, 300);
        long k6 = p.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k7 = p.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (p.r(xmlPullParser, "valueFrom") && p.r(xmlPullParser, "valueTo")) {
            if (k7 == 4) {
                k7 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f7 = f(typedArray, k7, 5, 6, "");
            if (f7 != null) {
                valueAnimator.setValues(f7);
            }
        }
        valueAnimator.setDuration(k5);
        valueAnimator.setStartDelay(k6);
        valueAnimator.setRepeatCount(p.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(p.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k7, f6, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i5, float f6, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m5 = p.m(typedArray, xmlPullParser, "pathData", 1);
        if (m5 == null) {
            objectAnimator.setPropertyName(p.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m6 = p.m(typedArray, xmlPullParser, "propertyXName", 2);
        String m7 = p.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i5 != 2) {
        }
        if (m6 != null || m7 != null) {
            t(b2.e(m5), objectAnimator, f6 * 0.5f, m6, m7);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f6, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f7 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f8 = 0.0f;
        do {
            f8 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f8));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f8 / f6)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f9 = f8 / (min - 1);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f7 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
            fArr[i5] = fArr3[0];
            fArr2[i5] = fArr3[1];
            f7 += f9;
            int i7 = i6 + 1;
            if (i7 < arrayList.size() && f7 > ((Float) arrayList.get(i7)).floatValue()) {
                pathMeasure2.nextContour();
                i6 = i7;
            }
            i5++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}

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
import androidx.core.content.res.n;
import androidx.core.graphics.j0;
import androidx.fragment.app.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorInflaterCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35331a = "AnimatorInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final int f35332b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f35333c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f35334d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f35335e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f35336f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f35337g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f35338h = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f35339i = false;

    /* compiled from: AnimatorInflaterCompat.java */
    private static class a implements TypeEvaluator<j0.b[]> {

        /* renamed from: a, reason: collision with root package name */
        private j0.b[] f35340a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0.b[] evaluate(float f4, j0.b[] bVarArr, j0.b[] bVarArr2) {
            if (!j0.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!j0.b(this.f35340a, bVarArr)) {
                this.f35340a = j0.f(bVarArr);
            }
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                this.f35340a[i4].j(bVarArr[i4], bVarArr2[i4], f4);
            }
            return this.f35340a;
        }

        a(j0.b[] bVarArr) {
            this.f35340a = bVarArr;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f4) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
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

    private static Keyframe c(Keyframe keyframe, float f4) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f4) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f4) : Keyframe.ofObject(f4);
    }

    private static void d(Keyframe[] keyframeArr, float f4, int i4, int i5) {
        float f5 = f4 / ((i5 - i4) + 2);
        while (i4 <= i5) {
            keyframeArr[i4].setFraction(keyframeArr[i4 - 1].getFraction() + f5);
            i4++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        for (Object obj : objArr) {
            Keyframe keyframe = (Keyframe) obj;
            Object obj2 = "null";
            (keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction())).toString();
            if (keyframe.hasValue()) {
                obj2 = keyframe.getValue();
            }
            Objects.toString(obj2);
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i4, int i5, int i6, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i5);
        boolean z4 = peekValue != null;
        int i7 = z4 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i6);
        boolean z5 = peekValue2 != null;
        int i10 = z5 ? peekValue2.type : 0;
        if (i4 == 4) {
            i4 = ((z4 && i(i7)) || (z5 && i(i10))) ? 3 : 0;
        }
        boolean z6 = i4 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i4 == 2) {
            String string = typedArray.getString(i5);
            String string2 = typedArray.getString(i6);
            j0.b[] d5 = j0.d(string);
            j0.b[] d6 = j0.d(string2);
            if (d5 == null && d6 == null) {
                return null;
            }
            if (d5 == null) {
                if (d6 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d6);
                }
                return null;
            }
            a aVar = new a();
            if (d6 == null) {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d5);
            } else {
                if (!j0.b(d5, d6)) {
                    throw new InflateException(y.a(" Can't morph from ", string, " to ", string2));
                }
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d5, d6);
            }
            return ofObject;
        }
        f a5 = i4 == 3 ? f.a() : null;
        if (z6) {
            if (z4) {
                float dimension = i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f);
                if (z5) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i10 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i10 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z4) {
            int dimension2 = i7 == 5 ? (int) typedArray.getDimension(i5, 0.0f) : i(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
            if (z5) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i10 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : i(i10) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z5) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i10 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : i(i10) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
        }
        if (propertyValuesHolder == null || a5 == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a5);
        return propertyValuesHolder;
    }

    private static int g(TypedArray typedArray, int i4, int i5) {
        TypedValue peekValue = typedArray.peekValue(i4);
        boolean z4 = peekValue != null;
        int i6 = z4 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i5);
        boolean z5 = peekValue2 != null;
        return ((z4 && i(i6)) || (z5 && i(z5 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35273h0);
        int i4 = 0;
        TypedValue t4 = n.t(s4, xmlPullParser, "value", 0);
        if (t4 != null && i(t4.type)) {
            i4 = 3;
        }
        s4.recycle();
        return i4;
    }

    private static boolean i(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    public static Animator j(Context context, @androidx.annotation.b int i4) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i4);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i4) throws Resources.NotFoundException {
        return l(context, resources, theme, i4, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i4, float f4) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i4);
                    return a(context, resources, theme, xmlResourceParser, f4);
                } catch (IOException e4) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                    notFoundException.initCause(e4);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e5) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException2.initCause(e5);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.R);
        TypedArray s5 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35283m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s4, s5, f4, xmlPullParser);
        int l4 = n.l(s4, xmlPullParser, "interpolator", 0, 0);
        if (l4 > 0) {
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, l4));
        }
        s4.recycle();
        if (s5 != null) {
            s5.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i4, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35273h0);
        float j4 = n.j(s4, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t4 = n.t(s4, xmlPullParser, "value", 0);
        boolean z4 = t4 != null;
        if (i4 == 4) {
            i4 = (z4 && i(t4.type)) ? 3 : 0;
        }
        Keyframe ofInt = z4 ? i4 != 0 ? (i4 == 1 || i4 == 3) ? Keyframe.ofInt(j4, n.k(s4, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(j4, n.j(s4, xmlPullParser, "value", 0, 0.0f)) : i4 == 0 ? Keyframe.ofFloat(j4) : Keyframe.ofInt(j4);
        int l4 = n.l(s4, xmlPullParser, "interpolator", 1, 0);
        if (l4 > 0) {
            ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, l4));
        }
        s4.recycle();
        return ofInt;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f4, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i4) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i4 == 4) {
                    i4 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe n4 = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser);
                if (n4 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n4);
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
            for (int i5 = 0; i5 < size; i5++) {
                Keyframe keyframe3 = keyframeArr[i5];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i5 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i6 = size - 1;
                        if (i5 == i6) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i7 = i5;
                            for (int i10 = i5 + 1; i10 < i6 && keyframeArr[i10].getFraction() < 0.0f; i10++) {
                                i7 = i10;
                            }
                            d(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i4 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i4;
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
                    TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35263c0);
                    String m4 = n.m(s4, xmlPullParser, "propertyName", 3);
                    int k4 = n.k(s4, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder p4 = p(context, resources, theme, xmlPullParser, m4, k4);
                    if (p4 == null) {
                        p4 = f(s4, k4, 0, 1, m4);
                    }
                    if (p4 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p4);
                    }
                    s4.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i4 = 0; i4 < size; i4++) {
                propertyValuesHolderArr[i4] = (PropertyValuesHolder) arrayList.get(i4);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f4, XmlPullParser xmlPullParser) {
        long k4 = n.k(typedArray, xmlPullParser, "duration", 1, 300);
        long k5 = n.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k6 = n.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (n.r(xmlPullParser, "valueFrom") && n.r(xmlPullParser, "valueTo")) {
            if (k6 == 4) {
                k6 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f5 = f(typedArray, k6, 5, 6, "");
            if (f5 != null) {
                valueAnimator.setValues(f5);
            }
        }
        valueAnimator.setDuration(k4);
        valueAnimator.setStartDelay(k5);
        valueAnimator.setRepeatCount(n.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(n.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k6, f4, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i4, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m4 = n.m(typedArray, xmlPullParser, "pathData", 1);
        if (m4 == null) {
            objectAnimator.setPropertyName(n.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m5 = n.m(typedArray, xmlPullParser, "propertyXName", 2);
        String m6 = n.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i4 != 2) {
        }
        if (m5 != null || m6 != null) {
            t(j0.e(m4), objectAnimator, f4 * 0.5f, m5, m6);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f4, String str, String str2) {
        char c5 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f6 = 0.0f;
        do {
            f6 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f6));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f6 / f4)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f7 = f6 / (min - 1);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
            fArr[i4] = fArr3[c5];
            fArr2[i4] = fArr3[1];
            f5 += f7;
            int i6 = i5 + 1;
            if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                pathMeasure2.nextContour();
                i5 = i6;
            }
            i4++;
            c5 = 0;
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

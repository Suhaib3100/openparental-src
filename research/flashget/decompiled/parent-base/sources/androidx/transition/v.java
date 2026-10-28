package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: TransitionInflater.java */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f35243b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.collection.a<String, Constructor<?>> f35244c = new androidx.collection.a<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f35245a;

    private v(@androidx.annotation.o0 Context context) {
        this.f35245a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(androidx.compose.runtime.changelist.j.a(str, " tag must have a 'class' attribute"));
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f35244c;
            synchronized (aVar) {
                try {
                    Constructor<?> constructor = aVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f35245a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(f35243b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.f35245a, attributeSet);
                } finally {
                }
            }
            return newInstance;
        } catch (Exception e4) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x017a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.Transition b(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.Transition r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.v.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.x c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L51
        L12:
            r3 = 1
            if (r2 == r3) goto L51
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.x r1 = new androidx.transition.x
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.h(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown scene name: "
            r7.<init>(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.v.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.x");
    }

    @androidx.annotation.o0
    public static v d(@androidx.annotation.o0 Context context) {
        return new v(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals("target")) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray obtainStyledAttributes = this.f35245a.obtainStyledAttributes(attributeSet, u.f35205a);
                int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (l4 != 0) {
                    transition.c(l4);
                } else {
                    int l5 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (l5 != 0) {
                        transition.C(l5, true);
                    } else {
                        String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (m4 != null) {
                            transition.f(m4);
                        } else {
                            String m5 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (m5 != null) {
                                transition.F(m5, true);
                            } else {
                                String m6 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (m6 != null) {
                                    try {
                                        transition.E(Class.forName(m6), true);
                                    } catch (ClassNotFoundException e4) {
                                        obtainStyledAttributes.recycle();
                                        throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a("Could not create ", m6), e4);
                                    }
                                } else {
                                    String m7 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (m7 != null) {
                                        transition.e(Class.forName(m7));
                                    }
                                }
                            }
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, x xVar) throws Resources.NotFoundException {
        Transition f4;
        TypedArray obtainStyledAttributes = this.f35245a.obtainStyledAttributes(attributeSet, u.f35206b);
        int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int l5 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        s d5 = l5 < 0 ? null : s.d(viewGroup, l5, this.f35245a);
        int l6 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        s d6 = l6 >= 0 ? s.d(viewGroup, l6, this.f35245a) : null;
        if (l4 >= 0 && (f4 = f(l4)) != null) {
            if (d6 == null) {
                throw new RuntimeException(android.support.v4.media.a.a("No toScene for transition ID ", l4));
            }
            if (d5 == null) {
                xVar.l(d6, f4);
            } else {
                xVar.k(d5, d6, f4);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public Transition f(int i4) {
        XmlResourceParser xml = this.f35245a.getResources().getXml(i4);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e4) {
                throw new InflateException(xml.getPositionDescription() + ": " + e4.getMessage(), e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException(e5.getMessage(), e5);
            }
        } finally {
            xml.close();
        }
    }

    public x g(int i4, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f35245a.getResources().getXml(i4);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e4) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e4.getMessage());
                inflateException.initCause(e4);
                throw inflateException;
            } catch (XmlPullParserException e5) {
                InflateException inflateException2 = new InflateException(e5.getMessage());
                inflateException2.initCause(e5);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}

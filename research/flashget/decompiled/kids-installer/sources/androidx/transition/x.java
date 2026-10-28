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
/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f10115b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.collection.a<String, Constructor<?>> f10116c = new androidx.collection.a<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f10117a;

    private x(@androidx.annotation.o0 Context context) {
        this.f10117a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(androidx.concurrent.futures.b.a(str, " tag must have a 'class' attribute"));
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f10116c;
            synchronized (aVar) {
                Constructor<?> constructor = aVar.get(attributeValue);
                if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f10117a.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = asSubclass.getConstructor(f10115b);
                    constructor.setAccessible(true);
                    aVar.put(attributeValue, constructor);
                }
                newInstance = constructor.newInstance(this.f10117a, attributeSet);
            }
            return newInstance;
        } catch (Exception e6) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e6);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.x.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.z c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            androidx.transition.z r1 = new androidx.transition.z
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.x.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.z");
    }

    public static x d(Context context) {
        return new x(context);
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
                TypedArray obtainStyledAttributes = this.f10117a.obtainStyledAttributes(attributeSet, w.f10080a);
                int l5 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (l5 != 0) {
                    transition.b(l5);
                } else {
                    int l6 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (l6 != 0) {
                        transition.C(l6, true);
                    } else {
                        String m5 = androidx.core.content.res.p.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (m5 != null) {
                            transition.e(m5);
                        } else {
                            String m6 = androidx.core.content.res.p.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (m6 != null) {
                                transition.F(m6, true);
                            } else {
                                String m7 = androidx.core.content.res.p.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (m7 != null) {
                                    try {
                                        transition.E(Class.forName(m7), true);
                                    } catch (ClassNotFoundException e6) {
                                        obtainStyledAttributes.recycle();
                                        throw new RuntimeException(androidx.constraintlayout.motion.widget.g.a("Could not create ", m7), e6);
                                    }
                                } else {
                                    String m8 = androidx.core.content.res.p.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (m8 != null) {
                                        transition.d(Class.forName(m8));
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
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, z zVar) throws Resources.NotFoundException {
        Transition f6;
        TypedArray obtainStyledAttributes = this.f10117a.obtainStyledAttributes(attributeSet, w.f10081b);
        int l5 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int l6 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        u d6 = l6 < 0 ? null : u.d(viewGroup, l6, this.f10117a);
        int l7 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        u d7 = l7 >= 0 ? u.d(viewGroup, l7, this.f10117a) : null;
        if (l5 >= 0 && (f6 = f(l5)) != null) {
            if (d7 == null) {
                throw new RuntimeException(androidx.appcompat.view.menu.s.a("No toScene for transition ID ", l5));
            }
            if (d6 == null) {
                zVar.l(d7, f6);
            } else {
                zVar.k(d6, d7, f6);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public Transition f(int i5) {
        XmlResourceParser xml = this.f10117a.getResources().getXml(i5);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e6) {
                throw new InflateException(xml.getPositionDescription() + ": " + e6.getMessage(), e6);
            } catch (XmlPullParserException e7) {
                throw new InflateException(e7.getMessage(), e7);
            }
        } finally {
            xml.close();
        }
    }

    public z g(int i5, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f10117a.getResources().getXml(i5);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e6) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e6.getMessage());
                inflateException.initCause(e6);
                throw inflateException;
            } catch (XmlPullParserException e7) {
                InflateException inflateException2 = new InflateException(e7.getMessage());
                inflateException2.initCause(e7);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}

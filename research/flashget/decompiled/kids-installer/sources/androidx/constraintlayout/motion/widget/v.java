package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public class v {
    public static final int A = -1;
    public static final int B = 0;
    public static final int C = 1;
    static final int D = 0;
    static final int E = 1;
    static final int F = 2;
    static final int G = 3;
    static final int H = 4;
    static final int I = 5;

    /* renamed from: u, reason: collision with root package name */
    public static final String f2006u = "MotionScene";

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f2007v = false;

    /* renamed from: w, reason: collision with root package name */
    static final int f2008w = 0;

    /* renamed from: x, reason: collision with root package name */
    static final int f2009x = 1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f2010y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f2011z = -2;

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f2012a;

    /* renamed from: n, reason: collision with root package name */
    private MotionEvent f2025n;

    /* renamed from: q, reason: collision with root package name */
    private MotionLayout.f f2028q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2029r;

    /* renamed from: s, reason: collision with root package name */
    float f2030s;

    /* renamed from: t, reason: collision with root package name */
    float f2031t;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.g f2013b = null;

    /* renamed from: c, reason: collision with root package name */
    b f2014c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2015d = false;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<b> f2016e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private b f2017f = null;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<b> f2018g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f2019h = new SparseArray<>();

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f2020i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private SparseIntArray f2021j = new SparseIntArray();

    /* renamed from: k, reason: collision with root package name */
    private boolean f2022k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f2023l = 400;

    /* renamed from: m, reason: collision with root package name */
    private int f2024m = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2026o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2027p = false;

    /* compiled from: MotionScene.java */
    class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.motion.utils.c f2032a;

        a(androidx.constraintlayout.motion.utils.c cVar) {
            this.f2032a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            return (float) this.f2032a.a(f6);
        }
    }

    public v(MotionLayout motionLayout) {
        this.f2012a = motionLayout;
    }

    private int B(int i5) {
        int e6;
        androidx.constraintlayout.widget.g gVar = this.f2013b;
        return (gVar == null || (e6 = gVar.e(i5, -1, -1)) == -1) ? i5 : e6;
    }

    private boolean H(int i5) {
        int i6 = this.f2021j.get(i5);
        int size = this.f2021j.size();
        while (i6 > 0) {
            if (i6 == i5) {
                return true;
            }
            int i7 = size - 1;
            if (size < 0) {
                return true;
            }
            i6 = this.f2021j.get(i6);
            size = i7;
        }
        return false;
    }

    private boolean J() {
        return this.f2028q != null;
    }

    private void K(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c6 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f2022k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c6 = 5;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c6 = 6;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c6 = 3;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c6 = 4;
                                break;
                            }
                            c6 = 65535;
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    switch (c6) {
                        case 0:
                            P(context, xml);
                            break;
                        case 1:
                            ArrayList<b> arrayList = this.f2016e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f2014c == null && !bVar.f2041b) {
                                this.f2014c = bVar;
                                if (bVar.f2051l != null) {
                                    this.f2014c.f2051l.u(this.f2029r);
                                }
                            }
                            if (!bVar.f2041b) {
                                break;
                            } else {
                                if (bVar.f2042c == -1) {
                                    this.f2017f = bVar;
                                } else {
                                    this.f2018g.add(bVar);
                                }
                                this.f2016e.remove(bVar);
                                break;
                            }
                        case 2:
                            if (bVar == null) {
                                context.getResources().getResourceEntryName(i5);
                                xml.getLineNumber();
                            }
                            bVar.f2051l = new z(context, this.f2012a, xml);
                            break;
                        case 3:
                            bVar.t(context, xml);
                            break;
                        case 4:
                            this.f2013b = new androidx.constraintlayout.widget.g(context, xml);
                            break;
                        case 5:
                            O(context, xml);
                            break;
                        case 6:
                            bVar.f2050k.add(new l(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    private void O(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.J0(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            if (this.f2022k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i6 = r(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i5 = r(context, attributeValue);
                this.f2020i.put(d0(attributeValue), Integer.valueOf(i5));
            }
        }
        if (i5 != -1) {
            if (this.f2012a.f1738t0 != 0) {
                dVar.h1(true);
            }
            dVar.o0(context, xmlPullParser);
            if (i6 != -1) {
                this.f2021j.put(i5, i6);
            }
            this.f2019h.put(i5, dVar);
        }
    }

    private void P(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Lf);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == f.m.Mf) {
                this.f2023l = obtainStyledAttributes.getInt(index, this.f2023l);
            } else if (index == f.m.Nf) {
                this.f2024m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void T(int i5) {
        int i6 = this.f2021j.get(i5);
        if (i6 > 0) {
            T(this.f2021j.get(i5));
            androidx.constraintlayout.widget.d dVar = this.f2019h.get(i5);
            androidx.constraintlayout.widget.d dVar2 = this.f2019h.get(i6);
            if (dVar2 == null) {
                d.i(this.f2012a.getContext(), i6);
            } else {
                dVar.w0(dVar2);
                this.f2021j.put(i5, -1);
            }
        }
    }

    public static String d0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    private int r(Context context, String str) {
        int i5;
        if (str.contains("/")) {
            i5 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f2022k) {
                System.out.println("id getMap res = " + i5);
            }
        } else {
            i5 = -1;
        }
        return (i5 != -1 || str.length() <= 1) ? i5 : Integer.parseInt(str.substring(1));
    }

    private int s(b bVar) {
        int i5 = bVar.f2040a;
        if (i5 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i6 = 0; i6 < this.f2016e.size(); i6++) {
            if (this.f2016e.get(i6).f2040a == i5) {
                return i6;
            }
        }
        return -1;
    }

    float A(float f6, float f7) {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return 0.0f;
        }
        return this.f2014c.f2051l.k(f6, f7);
    }

    public float C() {
        b bVar = this.f2014c;
        if (bVar != null) {
            return bVar.f2048i;
        }
        return 0.0f;
    }

    int D() {
        b bVar = this.f2014c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2043d;
    }

    public b E(int i5) {
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2040a == i5) {
                return next;
            }
        }
        return null;
    }

    int F(int i5) {
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            if (it.next().f2043d == i5) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> G(int i5) {
        int B2 = B(i5);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2043d == B2 || next.f2042c == B2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    boolean I(View view, int i5) {
        b bVar = this.f2014c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f2050k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((l) it.next()).c(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f1822a == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    public int L(String str) {
        return this.f2020i.get(str).intValue();
    }

    public String M(int i5) {
        for (Map.Entry<String, Integer> entry : this.f2020i.entrySet()) {
            if (entry.getValue().intValue() == i5) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void N(boolean z5, int i5, int i6, int i7, int i8) {
    }

    void Q(float f6, float f7) {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return;
        }
        this.f2014c.f2051l.o(f6, f7);
    }

    void R(float f6, float f7) {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return;
        }
        this.f2014c.f2051l.p(f6, f7);
    }

    void S(MotionEvent motionEvent, int i5, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2028q == null) {
            this.f2028q = this.f2012a.a1();
        }
        this.f2028q.d(motionEvent);
        if (i5 != -1) {
            int action = motionEvent.getAction();
            boolean z5 = false;
            if (action == 0) {
                this.f2030s = motionEvent.getRawX();
                this.f2031t = motionEvent.getRawY();
                this.f2025n = motionEvent;
                this.f2026o = false;
                if (this.f2014c.f2051l != null) {
                    RectF f6 = this.f2014c.f2051l.f(this.f2012a, rectF);
                    if (f6 != null && !f6.contains(this.f2025n.getX(), this.f2025n.getY())) {
                        this.f2025n = null;
                        this.f2026o = true;
                        return;
                    }
                    RectF l5 = this.f2014c.f2051l.l(this.f2012a, rectF);
                    if (l5 == null || l5.contains(this.f2025n.getX(), this.f2025n.getY())) {
                        this.f2027p = false;
                    } else {
                        this.f2027p = true;
                    }
                    this.f2014c.f2051l.r(this.f2030s, this.f2031t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f2026o) {
                float rawY = motionEvent.getRawY() - this.f2031t;
                float rawX = motionEvent.getRawX() - this.f2030s;
                if ((rawX == com.google.firebase.remoteconfig.p.f18289o && rawY == com.google.firebase.remoteconfig.p.f18289o) || (motionEvent2 = this.f2025n) == null) {
                    return;
                }
                b h5 = h(i5, rawX, rawY, motionEvent2);
                if (h5 != null) {
                    motionLayout.r1(h5);
                    RectF l6 = this.f2014c.f2051l.l(this.f2012a, rectF);
                    if (l6 != null && !l6.contains(this.f2025n.getX(), this.f2025n.getY())) {
                        z5 = true;
                    }
                    this.f2027p = z5;
                    this.f2014c.f2051l.w(this.f2030s, this.f2031t);
                }
            }
        }
        if (this.f2026o) {
            return;
        }
        b bVar = this.f2014c;
        if (bVar != null && bVar.f2051l != null && !this.f2027p) {
            this.f2014c.f2051l.n(motionEvent, this.f2028q, i5, this);
        }
        this.f2030s = motionEvent.getRawX();
        this.f2031t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f2028q) == null) {
            return;
        }
        fVar.recycle();
        this.f2028q = null;
        int i6 = motionLayout.f1711b0;
        if (i6 != -1) {
            g(motionLayout, i6);
        }
    }

    void U(MotionLayout motionLayout) {
        for (int i5 = 0; i5 < this.f2019h.size(); i5++) {
            int keyAt = this.f2019h.keyAt(i5);
            if (H(keyAt)) {
                return;
            }
            T(keyAt);
        }
        for (int i6 = 0; i6 < this.f2019h.size(); i6++) {
            this.f2019h.valueAt(i6).v0(motionLayout);
        }
    }

    public void V(b bVar) {
        int s5 = s(bVar);
        if (s5 != -1) {
            this.f2016e.remove(s5);
        }
    }

    public void W(int i5, androidx.constraintlayout.widget.d dVar) {
        this.f2019h.put(i5, dVar);
    }

    public void X(int i5) {
        b bVar = this.f2014c;
        if (bVar != null) {
            bVar.L(i5);
        } else {
            this.f2023l = i5;
        }
    }

    public void Y(View view, int i5, String str, Object obj) {
        b bVar = this.f2014c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f2050k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((l) it.next()).c(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f1822a == i5) {
                    if (obj != null) {
                        ((Float) obj).floatValue();
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void Z(boolean z5) {
        this.f2029r = z5;
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return;
        }
        this.f2014c.f2051l.u(this.f2029r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.g r0 = r6.f2013b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.g r2 = r6.f2013b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.v$b> r3 = r6.f2016e
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.v$b r4 = (androidx.constraintlayout.motion.widget.v.b) r4
            int r5 = androidx.constraintlayout.motion.widget.v.b.a(r4)
            if (r5 != r2) goto L36
            int r5 = androidx.constraintlayout.motion.widget.v.b.c(r4)
            if (r5 == r0) goto L42
        L36:
            int r5 = androidx.constraintlayout.motion.widget.v.b.a(r4)
            if (r5 != r8) goto L1e
            int r5 = androidx.constraintlayout.motion.widget.v.b.c(r4)
            if (r5 != r7) goto L1e
        L42:
            r6.f2014c = r4
            if (r4 == 0) goto L57
            androidx.constraintlayout.motion.widget.z r7 = androidx.constraintlayout.motion.widget.v.b.m(r4)
            if (r7 == 0) goto L57
            androidx.constraintlayout.motion.widget.v$b r7 = r6.f2014c
            androidx.constraintlayout.motion.widget.z r7 = androidx.constraintlayout.motion.widget.v.b.m(r7)
            boolean r8 = r6.f2029r
            r7.u(r8)
        L57:
            return
        L58:
            androidx.constraintlayout.motion.widget.v$b r7 = r6.f2017f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.v$b> r3 = r6.f2018g
            java.util.Iterator r3 = r3.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.v$b r4 = (androidx.constraintlayout.motion.widget.v.b) r4
            int r5 = androidx.constraintlayout.motion.widget.v.b.a(r4)
            if (r5 != r8) goto L60
            r7 = r4
            goto L60
        L74:
            androidx.constraintlayout.motion.widget.v$b r8 = new androidx.constraintlayout.motion.widget.v$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.v.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.v.b.b(r8, r2)
            if (r0 == r1) goto L86
            java.util.ArrayList<androidx.constraintlayout.motion.widget.v$b> r7 = r6.f2016e
            r7.add(r8)
        L86:
            r6.f2014c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.v.a0(int, int):void");
    }

    public void b0(b bVar) {
        this.f2014c = bVar;
        if (bVar == null || bVar.f2051l == null) {
            return;
        }
        this.f2014c.f2051l.u(this.f2029r);
    }

    void c0() {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return;
        }
        this.f2014c.f2051l.x();
    }

    public void e(MotionLayout motionLayout, int i5) {
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2052m.size() > 0) {
                Iterator it2 = next.f2052m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.f2018g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f2052m.size() > 0) {
                Iterator it4 = next2.f2052m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.f2016e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f2052m.size() > 0) {
                Iterator it6 = next3.f2052m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i5, next3);
                }
            }
        }
        Iterator<b> it7 = this.f2018g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f2052m.size() > 0) {
                Iterator it8 = next4.f2052m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i5, next4);
                }
            }
        }
    }

    boolean e0() {
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            if (it.next().f2051l != null) {
                return true;
            }
        }
        b bVar = this.f2014c;
        return (bVar == null || bVar.f2051l == null) ? false : true;
    }

    public void f(b bVar) {
        int s5 = s(bVar);
        if (s5 == -1) {
            this.f2016e.add(bVar);
        } else {
            this.f2016e.set(s5, bVar);
        }
    }

    public boolean f0(MotionLayout motionLayout) {
        return motionLayout == this.f2012a && motionLayout.U == this;
    }

    boolean g(MotionLayout motionLayout, int i5) {
        if (J() || this.f2015d) {
            return false;
        }
        Iterator<b> it = this.f2016e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2053n != 0 && this.f2014c != next) {
                if (i5 == next.f2043d && (next.f2053n == 4 || next.f2053n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.o1(jVar);
                    motionLayout.r1(next);
                    if (next.f2053n == 4) {
                        motionLayout.x1();
                        motionLayout.o1(MotionLayout.j.SETUP);
                        motionLayout.o1(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.l1(1.0f);
                        motionLayout.y0(true);
                        motionLayout.o1(MotionLayout.j.SETUP);
                        motionLayout.o1(MotionLayout.j.MOVING);
                        motionLayout.o1(jVar);
                        motionLayout.b1();
                    }
                    return true;
                }
                if (i5 == next.f2042c && (next.f2053n == 3 || next.f2053n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.o1(jVar2);
                    motionLayout.r1(next);
                    if (next.f2053n == 3) {
                        motionLayout.y1();
                        motionLayout.o1(MotionLayout.j.SETUP);
                        motionLayout.o1(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.l1(0.0f);
                        motionLayout.y0(true);
                        motionLayout.o1(MotionLayout.j.SETUP);
                        motionLayout.o1(MotionLayout.j.MOVING);
                        motionLayout.o1(jVar2);
                        motionLayout.b1();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i5, float f6, float f7, MotionEvent motionEvent) {
        if (i5 == -1) {
            return this.f2014c;
        }
        List<b> G2 = G(i5);
        RectF rectF = new RectF();
        float f8 = 0.0f;
        b bVar = null;
        for (b bVar2 : G2) {
            if (!bVar2.f2054o && bVar2.f2051l != null) {
                bVar2.f2051l.u(this.f2029r);
                RectF l5 = bVar2.f2051l.l(this.f2012a, rectF);
                if (l5 == null || motionEvent == null || l5.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF l6 = bVar2.f2051l.l(this.f2012a, rectF);
                    if (l6 == null || motionEvent == null || l6.contains(motionEvent.getX(), motionEvent.getY())) {
                        float a6 = bVar2.f2051l.a(f6, f7) * (bVar2.f2042c == i5 ? -1.0f : 1.1f);
                        if (a6 > f8) {
                            bVar = bVar2;
                            f8 = a6;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void i(boolean z5) {
        this.f2015d = z5;
    }

    public int j() {
        b bVar = this.f2014c;
        if (bVar != null) {
            return bVar.f2055p;
        }
        return -1;
    }

    androidx.constraintlayout.widget.d k(int i5) {
        return l(i5, -1, -1);
    }

    androidx.constraintlayout.widget.d l(int i5, int i6, int i7) {
        int e6;
        if (this.f2022k) {
            System.out.println("id " + i5);
            System.out.println("size " + this.f2019h.size());
        }
        androidx.constraintlayout.widget.g gVar = this.f2013b;
        if (gVar != null && (e6 = gVar.e(i5, i6, i7)) != -1) {
            i5 = e6;
        }
        if (this.f2019h.get(i5) != null) {
            return this.f2019h.get(i5);
        }
        d.i(this.f2012a.getContext(), i5);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f2019h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public androidx.constraintlayout.widget.d m(Context context, String str) {
        if (this.f2022k) {
            System.out.println("id " + str);
            System.out.println("size " + this.f2019h.size());
        }
        for (int i5 = 0; i5 < this.f2019h.size(); i5++) {
            int keyAt = this.f2019h.keyAt(i5);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f2022k) {
                System.out.println("Id for <" + i5 + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f2019h.get(keyAt);
            }
        }
        return null;
    }

    public int[] n() {
        int size = this.f2019h.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = this.f2019h.keyAt(i5);
        }
        return iArr;
    }

    public ArrayList<b> o() {
        return this.f2016e;
    }

    public int p() {
        b bVar = this.f2014c;
        return bVar != null ? bVar.f2047h : this.f2023l;
    }

    int q() {
        b bVar = this.f2014c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2042c;
    }

    public Interpolator t() {
        int i5 = this.f2014c.f2044e;
        if (i5 == -2) {
            return AnimationUtils.loadInterpolator(this.f2012a.getContext(), this.f2014c.f2046g);
        }
        if (i5 == -1) {
            return new a(androidx.constraintlayout.motion.utils.c.c(this.f2014c.f2045f));
        }
        if (i5 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i5 == 1) {
            return new AccelerateInterpolator();
        }
        if (i5 == 2) {
            return new DecelerateInterpolator();
        }
        if (i5 == 4) {
            return new AnticipateInterpolator();
        }
        if (i5 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    f u(Context context, int i5, int i6, int i7) {
        b bVar = this.f2014c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f2050k.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            for (Integer num : lVar.d()) {
                if (i6 == num.intValue()) {
                    Iterator<f> it2 = lVar.c(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        f next = it2.next();
                        if (next.f1822a == i7 && next.f1825d == i5) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void v(s sVar) {
        b bVar = this.f2014c;
        if (bVar != null) {
            Iterator it = bVar.f2050k.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(sVar);
            }
        } else {
            b bVar2 = this.f2017f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f2050k.iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).a(sVar);
                }
            }
        }
    }

    float w() {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return 0.0f;
        }
        return this.f2014c.f2051l.h();
    }

    float x() {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return 0.0f;
        }
        return this.f2014c.f2051l.i();
    }

    boolean y() {
        b bVar = this.f2014c;
        if (bVar == null || bVar.f2051l == null) {
            return false;
        }
        return this.f2014c.f2051l.j();
    }

    public float z(View view, int i5) {
        return 0.0f;
    }

    v(Context context, MotionLayout motionLayout, int i5) {
        this.f2012a = motionLayout;
        K(context, i5);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f2019h;
        int i6 = f.g.f3489w1;
        sparseArray.put(i6, new androidx.constraintlayout.widget.d());
        this.f2020i.put("motion_base", Integer.valueOf(i6));
    }

    /* compiled from: MotionScene.java */
    public static class b {

        /* renamed from: s, reason: collision with root package name */
        public static final int f2034s = 0;

        /* renamed from: t, reason: collision with root package name */
        public static final int f2035t = 1;

        /* renamed from: u, reason: collision with root package name */
        public static final int f2036u = 2;

        /* renamed from: v, reason: collision with root package name */
        public static final int f2037v = 3;

        /* renamed from: w, reason: collision with root package name */
        public static final int f2038w = 4;

        /* renamed from: x, reason: collision with root package name */
        static final int f2039x = 1;

        /* renamed from: a, reason: collision with root package name */
        private int f2040a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2041b;

        /* renamed from: c, reason: collision with root package name */
        private int f2042c;

        /* renamed from: d, reason: collision with root package name */
        private int f2043d;

        /* renamed from: e, reason: collision with root package name */
        private int f2044e;

        /* renamed from: f, reason: collision with root package name */
        private String f2045f;

        /* renamed from: g, reason: collision with root package name */
        private int f2046g;

        /* renamed from: h, reason: collision with root package name */
        private int f2047h;

        /* renamed from: i, reason: collision with root package name */
        private float f2048i;

        /* renamed from: j, reason: collision with root package name */
        private final v f2049j;

        /* renamed from: k, reason: collision with root package name */
        private ArrayList<l> f2050k;

        /* renamed from: l, reason: collision with root package name */
        private z f2051l;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList<a> f2052m;

        /* renamed from: n, reason: collision with root package name */
        private int f2053n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f2054o;

        /* renamed from: p, reason: collision with root package name */
        private int f2055p;

        /* renamed from: q, reason: collision with root package name */
        private int f2056q;

        /* renamed from: r, reason: collision with root package name */
        private int f2057r;

        /* compiled from: MotionScene.java */
        static class a implements View.OnClickListener {

            /* renamed from: r, reason: collision with root package name */
            public static final int f2058r = 1;

            /* renamed from: s, reason: collision with root package name */
            public static final int f2059s = 17;

            /* renamed from: t, reason: collision with root package name */
            public static final int f2060t = 16;

            /* renamed from: u, reason: collision with root package name */
            public static final int f2061u = 256;

            /* renamed from: v, reason: collision with root package name */
            public static final int f2062v = 4096;

            /* renamed from: o, reason: collision with root package name */
            private final b f2063o;

            /* renamed from: p, reason: collision with root package name */
            int f2064p;

            /* renamed from: q, reason: collision with root package name */
            int f2065q;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f2064p = -1;
                this.f2065q = 17;
                this.f2063o = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Sf);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i5 = 0; i5 < indexCount; i5++) {
                    int index = obtainStyledAttributes.getIndex(i5);
                    if (index == f.m.Uf) {
                        this.f2064p = obtainStyledAttributes.getResourceId(index, this.f2064p);
                    } else if (index == f.m.Tf) {
                        this.f2065q = obtainStyledAttributes.getInt(index, this.f2065q);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
            public void a(MotionLayout motionLayout, int i5, b bVar) {
                int i6 = this.f2064p;
                MotionLayout motionLayout2 = motionLayout;
                if (i6 != -1) {
                    motionLayout2 = motionLayout.findViewById(i6);
                }
                if (motionLayout2 == null) {
                    return;
                }
                int i7 = bVar.f2043d;
                int i8 = bVar.f2042c;
                if (i7 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i9 = this.f2065q;
                boolean z5 = false;
                boolean z6 = ((i9 & 1) != 0 && i5 == i7) | ((i9 & 1) != 0 && i5 == i7) | ((i9 & 256) != 0 && i5 == i7) | ((i9 & 16) != 0 && i5 == i8);
                if ((i9 & 4096) != 0 && i5 == i8) {
                    z5 = true;
                }
                if (z6 || z5) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f2063o;
                if (bVar2 == bVar) {
                    return true;
                }
                int i5 = bVar2.f2042c;
                int i6 = this.f2063o.f2043d;
                if (i6 == -1) {
                    return motionLayout.f1711b0 != i5;
                }
                int i7 = motionLayout.f1711b0;
                return i7 == i6 || i7 == i5;
            }

            public void c(MotionLayout motionLayout) {
                View findViewById;
                int i5 = this.f2064p;
                if (i5 == -1 || (findViewById = motionLayout.findViewById(i5)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.v.b.a.onClick(android.view.View):void");
            }
        }

        b(v vVar, b bVar) {
            this.f2040a = -1;
            this.f2041b = false;
            this.f2042c = -1;
            this.f2043d = -1;
            this.f2044e = 0;
            this.f2045f = null;
            this.f2046g = -1;
            this.f2047h = 400;
            this.f2048i = 0.0f;
            this.f2050k = new ArrayList<>();
            this.f2051l = null;
            this.f2052m = new ArrayList<>();
            this.f2053n = 0;
            this.f2054o = false;
            this.f2055p = -1;
            this.f2056q = 0;
            this.f2057r = 0;
            this.f2049j = vVar;
            if (bVar != null) {
                this.f2055p = bVar.f2055p;
                this.f2044e = bVar.f2044e;
                this.f2045f = bVar.f2045f;
                this.f2046g = bVar.f2046g;
                this.f2047h = bVar.f2047h;
                this.f2050k = bVar.f2050k;
                this.f2048i = bVar.f2048i;
                this.f2056q = bVar.f2056q;
            }
        }

        private void v(v vVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                if (index == f.m.Ji) {
                    this.f2042c = typedArray.getResourceId(index, this.f2042c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2042c))) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.n0(context, this.f2042c);
                        vVar.f2019h.append(this.f2042c, dVar);
                    }
                } else if (index == f.m.Ki) {
                    this.f2043d = typedArray.getResourceId(index, this.f2043d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2043d))) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.n0(context, this.f2043d);
                        vVar.f2019h.append(this.f2043d, dVar2);
                    }
                } else if (index == f.m.Ni) {
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2046g = resourceId;
                        if (resourceId != -1) {
                            this.f2044e = -2;
                        }
                    } else if (i6 == 3) {
                        String string = typedArray.getString(index);
                        this.f2045f = string;
                        if (string.indexOf("/") > 0) {
                            this.f2046g = typedArray.getResourceId(index, -1);
                            this.f2044e = -2;
                        } else {
                            this.f2044e = -1;
                        }
                    } else {
                        this.f2044e = typedArray.getInteger(index, this.f2044e);
                    }
                } else if (index == f.m.Li) {
                    this.f2047h = typedArray.getInt(index, this.f2047h);
                } else if (index == f.m.Pi) {
                    this.f2048i = typedArray.getFloat(index, this.f2048i);
                } else if (index == f.m.Ii) {
                    this.f2053n = typedArray.getInteger(index, this.f2053n);
                } else if (index == f.m.Hi) {
                    this.f2040a = typedArray.getResourceId(index, this.f2040a);
                } else if (index == f.m.Qi) {
                    this.f2054o = typedArray.getBoolean(index, this.f2054o);
                } else if (index == f.m.Oi) {
                    this.f2055p = typedArray.getInteger(index, -1);
                } else if (index == f.m.Mi) {
                    this.f2056q = typedArray.getInteger(index, 0);
                } else if (index == f.m.Ri) {
                    this.f2057r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2043d == -1) {
                this.f2041b = true;
            }
        }

        private void w(v vVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.Gi);
            v(vVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f2040a;
        }

        public List<l> B() {
            return this.f2050k;
        }

        public int C() {
            return this.f2056q;
        }

        public List<a> D() {
            return this.f2052m;
        }

        public int E() {
            return this.f2055p;
        }

        public float F() {
            return this.f2048i;
        }

        public int G() {
            return this.f2043d;
        }

        public z H() {
            return this.f2051l;
        }

        public boolean I() {
            return !this.f2054o;
        }

        public boolean J(int i5) {
            return (i5 & this.f2057r) != 0;
        }

        public void K(int i5) {
            this.f2053n = i5;
        }

        public void L(int i5) {
            this.f2047h = i5;
        }

        public void M(boolean z5) {
            this.f2054o = !z5;
        }

        public void N(int i5) {
            this.f2055p = i5;
        }

        public void O(float f6) {
            this.f2048i = f6;
        }

        public void t(Context context, XmlPullParser xmlPullParser) {
            this.f2052m.add(new a(context, this, xmlPullParser));
        }

        public String u(Context context) {
            String resourceEntryName = this.f2043d == -1 ? "null" : context.getResources().getResourceEntryName(this.f2043d);
            if (this.f2042c == -1) {
                return androidx.concurrent.futures.b.a(resourceEntryName, " -> null");
            }
            StringBuilder a6 = c.a(resourceEntryName, " -> ");
            a6.append(context.getResources().getResourceEntryName(this.f2042c));
            return a6.toString();
        }

        public int x() {
            return this.f2053n;
        }

        public int y() {
            return this.f2047h;
        }

        public int z() {
            return this.f2042c;
        }

        public b(int i5, v vVar, int i6, int i7) {
            this.f2040a = -1;
            this.f2041b = false;
            this.f2042c = -1;
            this.f2043d = -1;
            this.f2044e = 0;
            this.f2045f = null;
            this.f2046g = -1;
            this.f2047h = 400;
            this.f2048i = 0.0f;
            this.f2050k = new ArrayList<>();
            this.f2051l = null;
            this.f2052m = new ArrayList<>();
            this.f2053n = 0;
            this.f2054o = false;
            this.f2055p = -1;
            this.f2056q = 0;
            this.f2057r = 0;
            this.f2040a = i5;
            this.f2049j = vVar;
            this.f2043d = i6;
            this.f2042c = i7;
            this.f2047h = vVar.f2023l;
            this.f2056q = vVar.f2024m;
        }

        b(v vVar, Context context, XmlPullParser xmlPullParser) {
            this.f2040a = -1;
            this.f2041b = false;
            this.f2042c = -1;
            this.f2043d = -1;
            this.f2044e = 0;
            this.f2045f = null;
            this.f2046g = -1;
            this.f2047h = 400;
            this.f2048i = 0.0f;
            this.f2050k = new ArrayList<>();
            this.f2051l = null;
            this.f2052m = new ArrayList<>();
            this.f2053n = 0;
            this.f2054o = false;
            this.f2055p = -1;
            this.f2056q = 0;
            this.f2057r = 0;
            this.f2047h = vVar.f2023l;
            this.f2056q = vVar.f2024m;
            this.f2049j = vVar;
            w(vVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}

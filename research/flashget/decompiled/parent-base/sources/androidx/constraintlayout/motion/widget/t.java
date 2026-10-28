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
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.g;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public class t {
    private static final int A = -1;
    private static final int B = -2;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    static final int Q = 0;
    static final int R = 1;
    static final int S = 2;
    static final int T = 3;
    static final int U = 4;
    static final int V = 5;
    static final int W = 6;

    /* renamed from: w, reason: collision with root package name */
    private static final boolean f23556w = false;

    /* renamed from: x, reason: collision with root package name */
    private static final int f23557x = 8;

    /* renamed from: y, reason: collision with root package name */
    static final int f23558y = 0;

    /* renamed from: z, reason: collision with root package name */
    static final int f23559z = 1;

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f23560a;

    /* renamed from: n, reason: collision with root package name */
    private MotionEvent f23573n;

    /* renamed from: q, reason: collision with root package name */
    private MotionLayout.i f23576q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23577r;

    /* renamed from: s, reason: collision with root package name */
    final b0 f23578s;

    /* renamed from: t, reason: collision with root package name */
    float f23579t;

    /* renamed from: u, reason: collision with root package name */
    float f23580u;
    private static final String P = "ViewTransition";

    /* renamed from: v, reason: collision with root package name */
    private static final String f23555v = "MotionScene";
    private static final String G = "MotionScene";
    private static final String H = "Transition";
    private static final String I = "OnSwipe";
    private static final String J = "OnClick";
    private static final String K = "StateSet";
    private static final String L = "Include";
    private static final String M = "include";
    private static final String N = "KeyFrameSet";
    private static final String O = "ConstraintSet";

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.i f23561b = null;

    /* renamed from: c, reason: collision with root package name */
    b f23562c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23563d = false;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<b> f23564e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private b f23565f = null;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<b> f23566g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f23567h = new SparseArray<>();

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f23568i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private SparseIntArray f23569j = new SparseIntArray();

    /* renamed from: k, reason: collision with root package name */
    private boolean f23570k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f23571l = 400;

    /* renamed from: m, reason: collision with root package name */
    private int f23572m = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23574o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23575p = false;

    /* compiled from: MotionScene.java */
    class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.e f23581a;

        a(final t this$0, final androidx.constraintlayout.core.motion.utils.e val$easing) {
            this.f23581a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v4) {
            return (float) this.f23581a.a(v4);
        }
    }

    public t(MotionLayout layout) {
        this.f23560a = layout;
        this.f23578s = new b0(layout);
    }

    static String A(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    private int G(int stateId) {
        int e4;
        androidx.constraintlayout.widget.i iVar = this.f23561b;
        return (iVar == null || (e4 = iVar.e(stateId, -1, -1)) == -1) ? stateId : e4;
    }

    private boolean R(int key) {
        int i4 = this.f23569j.get(key);
        int size = this.f23569j.size();
        while (i4 > 0) {
            if (i4 == key) {
                return true;
            }
            int i5 = size - 1;
            if (size < 0) {
                return true;
            }
            i4 = this.f23569j.get(i4);
            size = i5;
        }
        return false;
    }

    private boolean T() {
        return this.f23576q != null;
    }

    private void V(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c5 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f23570k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c5 = '\b';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c5 = '\t';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            c0(context, xml);
                            break;
                        case 1:
                            ArrayList<b> arrayList = this.f23564e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f23562c == null && !bVar.f23591b) {
                                this.f23562c = bVar;
                                if (bVar.f23601l != null) {
                                    this.f23562c.f23601l.D(this.f23577r);
                                }
                            }
                            if (!bVar.f23591b) {
                                break;
                            } else {
                                if (bVar.f23592c == -1) {
                                    this.f23565f = bVar;
                                } else {
                                    this.f23566g.add(bVar);
                                }
                                this.f23564e.remove(bVar);
                                break;
                            }
                        case 2:
                            if (bVar == null) {
                                context.getResources().getResourceEntryName(resourceId);
                                xml.getLineNumber();
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f23601l = new w(context, this.f23560a, xml);
                                break;
                            }
                        case 3:
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.v(context, xml);
                                break;
                            }
                        case 4:
                            this.f23561b = new androidx.constraintlayout.widget.i(context, xml);
                            break;
                        case 5:
                            Z(context, xml);
                            break;
                        case 6:
                        case 7:
                            b0(context, xml);
                            break;
                        case '\b':
                            i iVar = new i(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f23600k.add(iVar);
                                break;
                            }
                        case '\t':
                            this.f23578s.b(new a0(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int Z(Context context, XmlPullParser parser) {
        char c5;
        char c6;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.a1(false);
        int attributeCount = parser.getAttributeCount();
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeName = parser.getAttributeName(i6);
            String attributeValue = parser.getAttributeValue(i6);
            if (this.f23570k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    i5 = v(context, attributeValue);
                    break;
                case 1:
                    try {
                        dVar.f24040d = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
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
                                dVar.f24040d = 4;
                                break;
                            case 1:
                                dVar.f24040d = 2;
                                break;
                            case 2:
                                dVar.f24040d = 0;
                                break;
                            case 3:
                                dVar.f24040d = 1;
                                break;
                            case 4:
                                dVar.f24040d = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i4 = v(context, attributeValue);
                    this.f23568i.put(q0(attributeValue), Integer.valueOf(i4));
                    dVar.f24038b = c.i(context, i4);
                    break;
            }
        }
        if (i4 != -1) {
            if (this.f23560a.X2 != 0) {
                dVar.z1(true);
            }
            dVar.x0(context, parser);
            if (i5 != -1) {
                this.f23569j.put(i4, i5);
            }
            this.f23567h.put(i4, dVar);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return Z(context, xml);
                }
            }
            return -1;
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1;
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    private void b0(Context context, XmlPullParser mainParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), g.m.Fo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == g.m.Go) {
                a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void c0(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.qk);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == g.m.rk) {
                int i5 = obtainStyledAttributes.getInt(index, this.f23571l);
                this.f23571l = i5;
                if (i5 < 8) {
                    this.f23571l = 8;
                }
            } else if (index == g.m.sk) {
                this.f23572m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void g0(int key, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.d dVar = this.f23567h.get(key);
        dVar.f24039c = dVar.f24038b;
        int i4 = this.f23569j.get(key);
        if (i4 > 0) {
            g0(i4, motionLayout);
            androidx.constraintlayout.widget.d dVar2 = this.f23567h.get(i4);
            if (dVar2 == null) {
                c.i(this.f23560a.getContext(), i4);
                return;
            }
            dVar.f24039c += "/" + dVar2.f24039c;
            dVar.J0(dVar2);
        } else {
            dVar.f24039c = android.support.v4.media.c.a(new StringBuilder(), dVar.f24039c, "  layout");
            dVar.I0(motionLayout);
        }
        dVar.q(dVar);
    }

    public static String q0(String id2) {
        if (id2 == null) {
            return "";
        }
        int indexOf = id2.indexOf(47);
        return indexOf < 0 ? id2 : id2.substring(indexOf + 1);
    }

    private int v(Context context, String idString) {
        int i4;
        if (idString.contains("/")) {
            i4 = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f23570k) {
                System.out.println("id getMap res = " + i4);
            }
        } else {
            i4 = -1;
        }
        return (i4 != -1 || idString.length() <= 1) ? i4 : Integer.parseInt(idString.substring(1));
    }

    private int w(b transition) {
        int i4 = transition.f23590a;
        if (i4 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i5 = 0; i5 < this.f23564e.size(); i5++) {
            if (this.f23564e.get(i5).f23590a == i4) {
                return i5;
            }
        }
        return -1;
    }

    float B() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.i();
    }

    float C() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.j();
    }

    boolean D() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return false;
        }
        return this.f23562c.f23601l.k();
    }

    public float E(View view, int position) {
        return 0.0f;
    }

    float F(float dx, float dy) {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.l(dx, dy);
    }

    int H() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0;
        }
        return this.f23562c.f23601l.m();
    }

    float I() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.n();
    }

    float J() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.o();
    }

    float K() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.p();
    }

    float L() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0.0f;
        }
        return this.f23562c.f23601l.q();
    }

    public float M() {
        b bVar = this.f23562c;
        if (bVar != null) {
            return bVar.f23598i;
        }
        return 0.0f;
    }

    int N() {
        b bVar = this.f23562c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f23593d;
    }

    public b O(int id2) {
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f23590a == id2) {
                return next;
            }
        }
        return null;
    }

    int P(int stateId) {
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            if (it.next().f23593d == stateId) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> Q(int stateId) {
        int G2 = G(stateId);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f23593d == G2 || next.f23592c == G2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    boolean S(View view, int position) {
        b bVar = this.f23562c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f23600k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f23329a == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean U(int id2) {
        return this.f23578s.h(id2);
    }

    public int W(String id2) {
        Integer num = this.f23568i.get(id2);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String X(int id2) {
        for (Map.Entry<String, Integer> entry : this.f23568i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id2) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void Y(boolean changed, int left, int top2, int right, int bottom) {
    }

    void d0(float dx, float dy) {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return;
        }
        this.f23562c.f23601l.w(dx, dy);
    }

    void e0(float dx, float dy) {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return;
        }
        this.f23562c.f23601l.x(dx, dy);
    }

    public void f(MotionLayout motionLayout, int currentState) {
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f23602m.size() > 0) {
                Iterator it2 = next.f23602m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.f23566g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f23602m.size() > 0) {
                Iterator it4 = next2.f23602m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.f23564e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f23602m.size() > 0) {
                Iterator it6 = next3.f23602m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, currentState, next3);
                }
            }
        }
        Iterator<b> it7 = this.f23566g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f23602m.size() > 0) {
                Iterator it8 = next4.f23602m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, currentState, next4);
                }
            }
        }
    }

    void f0(MotionEvent event, int currentState, MotionLayout motionLayout) {
        MotionLayout.i iVar;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.f23576q == null) {
            this.f23576q = this.f23560a.r1();
        }
        this.f23576q.b(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z4 = false;
            if (action == 0) {
                this.f23579t = event.getRawX();
                this.f23580u = event.getRawY();
                this.f23573n = event;
                this.f23574o = false;
                if (this.f23562c.f23601l != null) {
                    RectF g4 = this.f23562c.f23601l.g(this.f23560a, rectF);
                    if (g4 != null && !g4.contains(this.f23573n.getX(), this.f23573n.getY())) {
                        this.f23573n = null;
                        this.f23574o = true;
                        return;
                    }
                    RectF r4 = this.f23562c.f23601l.r(this.f23560a, rectF);
                    if (r4 == null || r4.contains(this.f23573n.getX(), this.f23573n.getY())) {
                        this.f23575p = false;
                    } else {
                        this.f23575p = true;
                    }
                    this.f23562c.f23601l.A(this.f23579t, this.f23580u);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f23574o) {
                float rawY = event.getRawY() - this.f23580u;
                float rawX = event.getRawX() - this.f23579t;
                if ((rawX == com.google.firebase.remoteconfig.p.f60679p && rawY == com.google.firebase.remoteconfig.p.f60679p) || (motionEvent = this.f23573n) == null) {
                    return;
                }
                b j4 = j(currentState, rawX, rawY, motionEvent);
                if (j4 != null) {
                    motionLayout.M1(j4);
                    RectF r5 = this.f23562c.f23601l.r(this.f23560a, rectF);
                    if (r5 != null && !r5.contains(this.f23573n.getX(), this.f23573n.getY())) {
                        z4 = true;
                    }
                    this.f23575p = z4;
                    this.f23562c.f23601l.G(this.f23579t, this.f23580u);
                }
            }
        }
        if (this.f23574o) {
            return;
        }
        b bVar = this.f23562c;
        if (bVar != null && bVar.f23601l != null && !this.f23575p) {
            this.f23562c.f23601l.u(event, this.f23576q, currentState, this);
        }
        this.f23579t = event.getRawX();
        this.f23580u = event.getRawY();
        if (event.getAction() != 1 || (iVar = this.f23576q) == null) {
            return;
        }
        iVar.recycle();
        this.f23576q = null;
        int i4 = motionLayout.O;
        if (i4 != -1) {
            i(motionLayout, i4);
        }
    }

    public void g(b transition) {
        int w4 = w(transition);
        if (w4 == -1) {
            this.f23564e.add(transition);
        } else {
            this.f23564e.set(w4, transition);
        }
    }

    public boolean h(int viewTransitionId, o motionController) {
        return this.f23578s.e(viewTransitionId, motionController);
    }

    void h0(MotionLayout motionLayout) {
        for (int i4 = 0; i4 < this.f23567h.size(); i4++) {
            int keyAt = this.f23567h.keyAt(i4);
            if (R(keyAt)) {
                return;
            }
            g0(keyAt, motionLayout);
        }
    }

    boolean i(MotionLayout motionLayout, int currentState) {
        b bVar;
        if (T() || this.f23563d) {
            return false;
        }
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f23603n != 0 && ((bVar = this.f23562c) != next || !bVar.L(2))) {
                if (currentState == next.f23593d && (next.f23603n == 4 || next.f23603n == 2)) {
                    MotionLayout.m mVar = MotionLayout.m.FINISHED;
                    motionLayout.J1(mVar);
                    motionLayout.M1(next);
                    if (next.f23603n == 4) {
                        motionLayout.U1();
                        motionLayout.J1(MotionLayout.m.SETUP);
                        motionLayout.J1(MotionLayout.m.MOVING);
                    } else {
                        motionLayout.F1(1.0f);
                        motionLayout.J0(true);
                        motionLayout.J1(MotionLayout.m.SETUP);
                        motionLayout.J1(MotionLayout.m.MOVING);
                        motionLayout.J1(mVar);
                        motionLayout.s1();
                    }
                    return true;
                }
                if (currentState == next.f23592c && (next.f23603n == 3 || next.f23603n == 1)) {
                    MotionLayout.m mVar2 = MotionLayout.m.FINISHED;
                    motionLayout.J1(mVar2);
                    motionLayout.M1(next);
                    if (next.f23603n == 3) {
                        motionLayout.W1();
                        motionLayout.J1(MotionLayout.m.SETUP);
                        motionLayout.J1(MotionLayout.m.MOVING);
                    } else {
                        motionLayout.F1(0.0f);
                        motionLayout.J0(true);
                        motionLayout.J1(MotionLayout.m.SETUP);
                        motionLayout.J1(MotionLayout.m.MOVING);
                        motionLayout.J1(mVar2);
                        motionLayout.s1();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void i0(b transition) {
        int w4 = w(transition);
        if (w4 != -1) {
            this.f23564e.remove(w4);
        }
    }

    public b j(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState == -1) {
            return this.f23562c;
        }
        List<b> Q2 = Q(currentState);
        RectF rectF = new RectF();
        float f4 = 0.0f;
        b bVar = null;
        for (b bVar2 : Q2) {
            if (!bVar2.f23604o && bVar2.f23601l != null) {
                bVar2.f23601l.D(this.f23577r);
                RectF r4 = bVar2.f23601l.r(this.f23560a, rectF);
                if (r4 == null || lastTouchDown == null || r4.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                    RectF g4 = bVar2.f23601l.g(this.f23560a, rectF);
                    if (g4 == null || lastTouchDown == null || g4.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        float a5 = bVar2.f23601l.a(dx, dy);
                        if (bVar2.f23601l.f23657l && lastTouchDown != null) {
                            a5 = ((float) (Math.atan2(dy + r10, dx + r9) - Math.atan2(lastTouchDown.getX() - bVar2.f23601l.f23654i, lastTouchDown.getY() - bVar2.f23601l.f23655j))) * 10.0f;
                        }
                        float f5 = a5 * (bVar2.f23592c == currentState ? -1.0f : 1.1f);
                        if (f5 > f4) {
                            bVar = bVar2;
                            f4 = f5;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void j0(int id2, androidx.constraintlayout.widget.d set) {
        this.f23567h.put(id2, set);
    }

    public void k(boolean disable) {
        this.f23563d = disable;
    }

    public void k0(int duration) {
        b bVar = this.f23562c;
        if (bVar != null) {
            bVar.O(duration);
        } else {
            this.f23571l = duration;
        }
    }

    public void l(int id2, boolean enable) {
        this.f23578s.f(id2, enable);
    }

    public void l0(View view, int position, String name, Object value) {
        b bVar = this.f23562c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f23600k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f23329a == position) {
                    if (value != null) {
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public int m() {
        b bVar = this.f23562c;
        if (bVar != null) {
            return bVar.f23605p;
        }
        return -1;
    }

    public void m0(boolean rtl) {
        this.f23577r = rtl;
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return;
        }
        this.f23562c.f23601l.D(this.f23577r);
    }

    int n() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return 0;
        }
        return this.f23562c.f23601l.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void n0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.i r0 = r6.f23561b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.i r2 = r6.f23561b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.t$b r3 = r6.f23562c
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.t.b.a(r3)
            if (r3 != r8) goto L2d
            androidx.constraintlayout.motion.widget.t$b r3 = r6.f23562c
            int r3 = androidx.constraintlayout.motion.widget.t.b.c(r3)
            if (r3 != r7) goto L2d
            return
        L2d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t$b> r3 = r6.f23564e
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t$b r4 = (androidx.constraintlayout.motion.widget.t.b) r4
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r2) goto L4b
            int r5 = androidx.constraintlayout.motion.widget.t.b.c(r4)
            if (r5 == r0) goto L57
        L4b:
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r8) goto L33
            int r5 = androidx.constraintlayout.motion.widget.t.b.c(r4)
            if (r5 != r7) goto L33
        L57:
            r6.f23562c = r4
            if (r4 == 0) goto L6c
            androidx.constraintlayout.motion.widget.w r7 = androidx.constraintlayout.motion.widget.t.b.l(r4)
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.t$b r7 = r6.f23562c
            androidx.constraintlayout.motion.widget.w r7 = androidx.constraintlayout.motion.widget.t.b.l(r7)
            boolean r8 = r6.f23577r
            r7.D(r8)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.t$b r7 = r6.f23565f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t$b> r3 = r6.f23566g
            java.util.Iterator r3 = r3.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t$b r4 = (androidx.constraintlayout.motion.widget.t.b) r4
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r8) goto L75
            r7 = r4
            goto L75
        L89:
            androidx.constraintlayout.motion.widget.t$b r8 = new androidx.constraintlayout.motion.widget.t$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.t.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.t.b.b(r8, r2)
            if (r0 == r1) goto L9b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.t$b> r7 = r6.f23564e
            r7.add(r8)
        L9b:
            r6.f23562c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t.n0(int, int):void");
    }

    androidx.constraintlayout.widget.d o(int id2) {
        return p(id2, -1, -1);
    }

    public void o0(b transition) {
        this.f23562c = transition;
        if (transition == null || transition.f23601l == null) {
            return;
        }
        this.f23562c.f23601l.D(this.f23577r);
    }

    androidx.constraintlayout.widget.d p(int id2, int width, int height) {
        int e4;
        if (this.f23570k) {
            PrintStream printStream = System.out;
            printStream.println("id " + id2);
            printStream.println("size " + this.f23567h.size());
        }
        androidx.constraintlayout.widget.i iVar = this.f23561b;
        if (iVar != null && (e4 = iVar.e(id2, width, height)) != -1) {
            id2 = e4;
        }
        if (this.f23567h.get(id2) != null) {
            return this.f23567h.get(id2);
        }
        c.i(this.f23560a.getContext(), id2);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f23567h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    void p0() {
        b bVar = this.f23562c;
        if (bVar == null || bVar.f23601l == null) {
            return;
        }
        this.f23562c.f23601l.H();
    }

    public androidx.constraintlayout.widget.d q(Context context, String id2) {
        if (this.f23570k) {
            PrintStream printStream = System.out;
            printStream.println("id " + id2);
            printStream.println("size " + this.f23567h.size());
        }
        for (int i4 = 0; i4 < this.f23567h.size(); i4++) {
            int keyAt = this.f23567h.keyAt(i4);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f23570k) {
                PrintStream printStream2 = System.out;
                StringBuilder a5 = s.a("Id for <", i4, "> is <", resourceName, "> looking for <");
                a5.append(id2);
                a5.append(">");
                printStream2.println(a5.toString());
            }
            if (id2.equals(resourceName)) {
                return this.f23567h.get(keyAt);
            }
        }
        return null;
    }

    public int[] r() {
        int size = this.f23567h.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f23567h.keyAt(i4);
        }
        return iArr;
    }

    boolean r0() {
        Iterator<b> it = this.f23564e.iterator();
        while (it.hasNext()) {
            if (it.next().f23601l != null) {
                return true;
            }
        }
        b bVar = this.f23562c;
        return (bVar == null || bVar.f23601l == null) ? false : true;
    }

    public ArrayList<b> s() {
        return this.f23564e;
    }

    public boolean s0(MotionLayout layout) {
        return layout == this.f23560a && layout.J == this;
    }

    public int t() {
        b bVar = this.f23562c;
        return bVar != null ? bVar.f23597h : this.f23571l;
    }

    public void t0(int id2, View... view) {
        this.f23578s.m(id2, view);
    }

    int u() {
        b bVar = this.f23562c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f23592c;
    }

    public Interpolator x() {
        int i4 = this.f23562c.f23594e;
        if (i4 == -2) {
            return AnimationUtils.loadInterpolator(this.f23560a.getContext(), this.f23562c.f23596g);
        }
        if (i4 == -1) {
            return new a(this, androidx.constraintlayout.core.motion.utils.e.c(this.f23562c.f23595f));
        }
        if (i4 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i4 == 1) {
            return new AccelerateInterpolator();
        }
        if (i4 == 2) {
            return new DecelerateInterpolator();
        }
        if (i4 == 4) {
            return new BounceInterpolator();
        }
        if (i4 == 5) {
            return new OvershootInterpolator();
        }
        if (i4 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    f y(Context context, int type, int target, int position) {
        b bVar = this.f23562c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f23600k.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            for (Integer num : iVar.e()) {
                if (target == num.intValue()) {
                    Iterator<f> it2 = iVar.d(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        f next = it2.next();
                        if (next.f23329a == position && next.f23332d == type) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o motionController) {
        b bVar = this.f23562c;
        if (bVar != null) {
            Iterator it = bVar.f23600k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(motionController);
            }
        } else {
            b bVar2 = this.f23565f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f23600k.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).b(motionController);
                }
            }
        }
    }

    /* compiled from: MotionScene.java */
    public static class b {
        public static final int A = -2;
        public static final int B = -1;
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;

        /* renamed from: s, reason: collision with root package name */
        public static final int f23582s = 0;

        /* renamed from: t, reason: collision with root package name */
        public static final int f23583t = 1;

        /* renamed from: u, reason: collision with root package name */
        public static final int f23584u = 2;

        /* renamed from: v, reason: collision with root package name */
        public static final int f23585v = 3;

        /* renamed from: w, reason: collision with root package name */
        public static final int f23586w = 4;

        /* renamed from: x, reason: collision with root package name */
        static final int f23587x = 1;

        /* renamed from: y, reason: collision with root package name */
        static final int f23588y = 2;

        /* renamed from: z, reason: collision with root package name */
        static final int f23589z = 4;

        /* renamed from: a, reason: collision with root package name */
        private int f23590a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f23591b;

        /* renamed from: c, reason: collision with root package name */
        private int f23592c;

        /* renamed from: d, reason: collision with root package name */
        private int f23593d;

        /* renamed from: e, reason: collision with root package name */
        private int f23594e;

        /* renamed from: f, reason: collision with root package name */
        private String f23595f;

        /* renamed from: g, reason: collision with root package name */
        private int f23596g;

        /* renamed from: h, reason: collision with root package name */
        private int f23597h;

        /* renamed from: i, reason: collision with root package name */
        private float f23598i;

        /* renamed from: j, reason: collision with root package name */
        private final t f23599j;

        /* renamed from: k, reason: collision with root package name */
        private ArrayList<i> f23600k;

        /* renamed from: l, reason: collision with root package name */
        private w f23601l;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList<a> f23602m;

        /* renamed from: n, reason: collision with root package name */
        private int f23603n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f23604o;

        /* renamed from: p, reason: collision with root package name */
        private int f23605p;

        /* renamed from: q, reason: collision with root package name */
        private int f23606q;

        /* renamed from: r, reason: collision with root package name */
        private int f23607r;

        b(t motionScene, b global) {
            this.f23590a = -1;
            this.f23591b = false;
            this.f23592c = -1;
            this.f23593d = -1;
            this.f23594e = 0;
            this.f23595f = null;
            this.f23596g = -1;
            this.f23597h = 400;
            this.f23598i = 0.0f;
            this.f23600k = new ArrayList<>();
            this.f23601l = null;
            this.f23602m = new ArrayList<>();
            this.f23603n = 0;
            this.f23604o = false;
            this.f23605p = -1;
            this.f23606q = 0;
            this.f23607r = 0;
            this.f23599j = motionScene;
            this.f23597h = motionScene.f23571l;
            if (global != null) {
                this.f23605p = global.f23605p;
                this.f23594e = global.f23594e;
                this.f23595f = global.f23595f;
                this.f23596g = global.f23596g;
                this.f23597h = global.f23597h;
                this.f23600k = global.f23600k;
                this.f23598i = global.f23598i;
                this.f23606q = global.f23606q;
            }
        }

        private void x(t motionScene, Context context, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                if (index == g.m.Ln) {
                    this.f23592c = a5.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f23592c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.w0(context, this.f23592c);
                        motionScene.f23567h.append(this.f23592c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f23592c = motionScene.a0(context, this.f23592c);
                    }
                } else if (index == g.m.Mn) {
                    this.f23593d = a5.getResourceId(index, this.f23593d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f23593d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.w0(context, this.f23593d);
                        motionScene.f23567h.append(this.f23593d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f23593d = motionScene.a0(context, this.f23593d);
                    }
                } else if (index == g.m.Pn) {
                    int i5 = a5.peekValue(index).type;
                    if (i5 == 1) {
                        int resourceId = a5.getResourceId(index, -1);
                        this.f23596g = resourceId;
                        if (resourceId != -1) {
                            this.f23594e = -2;
                        }
                    } else if (i5 == 3) {
                        String string = a5.getString(index);
                        this.f23595f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f23596g = a5.getResourceId(index, -1);
                                this.f23594e = -2;
                            } else {
                                this.f23594e = -1;
                            }
                        }
                    } else {
                        this.f23594e = a5.getInteger(index, this.f23594e);
                    }
                } else if (index == g.m.Nn) {
                    int i6 = a5.getInt(index, this.f23597h);
                    this.f23597h = i6;
                    if (i6 < 8) {
                        this.f23597h = 8;
                    }
                } else if (index == g.m.Rn) {
                    this.f23598i = a5.getFloat(index, this.f23598i);
                } else if (index == g.m.Kn) {
                    this.f23603n = a5.getInteger(index, this.f23603n);
                } else if (index == g.m.Jn) {
                    this.f23590a = a5.getResourceId(index, this.f23590a);
                } else if (index == g.m.Sn) {
                    this.f23604o = a5.getBoolean(index, this.f23604o);
                } else if (index == g.m.Qn) {
                    this.f23605p = a5.getInteger(index, -1);
                } else if (index == g.m.On) {
                    this.f23606q = a5.getInteger(index, 0);
                } else if (index == g.m.Tn) {
                    this.f23607r = a5.getInteger(index, 0);
                }
            }
            if (this.f23593d == -1) {
                this.f23591b = true;
            }
        }

        private void y(t motionScene, Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.In);
            x(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f23597h;
        }

        public int B() {
            return this.f23592c;
        }

        public int C() {
            return this.f23590a;
        }

        public List<i> D() {
            return this.f23600k;
        }

        public int E() {
            return this.f23606q;
        }

        public List<a> F() {
            return this.f23602m;
        }

        public int G() {
            return this.f23605p;
        }

        public float H() {
            return this.f23598i;
        }

        public int I() {
            return this.f23593d;
        }

        public w J() {
            return this.f23601l;
        }

        public boolean K() {
            return !this.f23604o;
        }

        public boolean L(int flag) {
            return (flag & this.f23607r) != 0;
        }

        public void M(int id2) {
            a aVar;
            Iterator<a> it = this.f23602m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                } else {
                    aVar = it.next();
                    if (aVar.f23614c == id2) {
                        break;
                    }
                }
            }
            if (aVar != null) {
                this.f23602m.remove(aVar);
            }
        }

        public void N(int type) {
            this.f23603n = type;
        }

        public void O(int duration) {
            this.f23597h = Math.max(duration, 8);
        }

        public void P(boolean enable) {
            Q(enable);
        }

        public void Q(boolean enable) {
            this.f23604o = !enable;
        }

        public void R(int interpolator, String interpolatorString, int interpolatorID) {
            this.f23594e = interpolator;
            this.f23595f = interpolatorString;
            this.f23596g = interpolatorID;
        }

        public void S(int mode) {
            this.f23606q = mode;
        }

        public void T(u onSwipe) {
            this.f23601l = onSwipe == null ? null : new w(this.f23599j.f23560a, onSwipe);
        }

        public void U(int touchUpMode) {
            w J = J();
            if (J != null) {
                J.F(touchUpMode);
            }
        }

        public void V(int arcMode) {
            this.f23605p = arcMode;
        }

        public void W(float stagger) {
            this.f23598i = stagger;
        }

        public void X(int flag) {
            this.f23607r = flag;
        }

        public void t(i keyFrames) {
            this.f23600k.add(keyFrames);
        }

        public void u(int id2, int action) {
            Iterator<a> it = this.f23602m.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f23614c == id2) {
                    next.f23615d = action;
                    return;
                }
            }
            this.f23602m.add(new a(this, id2, action));
        }

        public void v(Context context, XmlPullParser parser) {
            this.f23602m.add(new a(context, this, parser));
        }

        public String w(Context context) {
            String resourceEntryName = this.f23593d == -1 ? "null" : context.getResources().getResourceEntryName(this.f23593d);
            if (this.f23592c == -1) {
                return androidx.compose.runtime.changelist.j.a(resourceEntryName, " -> null");
            }
            StringBuilder a5 = androidx.constraintlayout.core.e.a(resourceEntryName, " -> ");
            a5.append(context.getResources().getResourceEntryName(this.f23592c));
            return a5.toString();
        }

        public int z() {
            return this.f23603n;
        }

        /* compiled from: MotionScene.java */
        public static class a implements View.OnClickListener {

            /* renamed from: e, reason: collision with root package name */
            public static final int f23608e = 1;

            /* renamed from: f, reason: collision with root package name */
            public static final int f23609f = 17;

            /* renamed from: g, reason: collision with root package name */
            public static final int f23610g = 16;

            /* renamed from: h, reason: collision with root package name */
            public static final int f23611h = 256;

            /* renamed from: i, reason: collision with root package name */
            public static final int f23612i = 4096;

            /* renamed from: b, reason: collision with root package name */
            private final b f23613b;

            /* renamed from: c, reason: collision with root package name */
            int f23614c;

            /* renamed from: d, reason: collision with root package name */
            int f23615d;

            public a(Context context, b transition, XmlPullParser parser) {
                this.f23614c = -1;
                this.f23615d = 17;
                this.f23613b = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.xk);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i4 = 0; i4 < indexCount; i4++) {
                    int index = obtainStyledAttributes.getIndex(i4);
                    if (index == g.m.zk) {
                        this.f23614c = obtainStyledAttributes.getResourceId(index, this.f23614c);
                    } else if (index == g.m.yk) {
                        this.f23615d = obtainStyledAttributes.getInt(index, this.f23615d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
            public void a(MotionLayout motionLayout, int i4, b bVar) {
                int i5 = this.f23614c;
                MotionLayout motionLayout2 = motionLayout;
                if (i5 != -1) {
                    motionLayout2 = motionLayout.findViewById(i5);
                }
                if (motionLayout2 == null) {
                    return;
                }
                int i6 = bVar.f23593d;
                int i7 = bVar.f23592c;
                if (i6 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i10 = this.f23615d;
                boolean z4 = false;
                boolean z5 = ((i10 & 1) != 0 && i4 == i6) | ((i10 & 1) != 0 && i4 == i6) | ((i10 & 256) != 0 && i4 == i6) | ((i10 & 16) != 0 && i4 == i7);
                if ((i10 & 4096) != 0 && i4 == i7) {
                    z4 = true;
                }
                if (z5 || z4) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            boolean b(b current, MotionLayout tl) {
                b bVar = this.f23613b;
                if (bVar == current) {
                    return true;
                }
                int i4 = bVar.f23592c;
                int i5 = this.f23613b.f23593d;
                if (i5 == -1) {
                    return tl.O != i4;
                }
                int i6 = tl.O;
                return i6 == i5 || i6 == i4;
            }

            public void c(MotionLayout motionLayout) {
                View findViewById;
                int i4 = this.f23614c;
                if (i4 == -1 || (findViewById = motionLayout.findViewById(i4)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t.b.a.onClick(android.view.View):void");
            }

            public a(b transition, int id2, int action) {
                this.f23613b = transition;
                this.f23614c = id2;
                this.f23615d = action;
            }
        }

        public b(int id2, t motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.f23590a = -1;
            this.f23591b = false;
            this.f23592c = -1;
            this.f23593d = -1;
            this.f23594e = 0;
            this.f23595f = null;
            this.f23596g = -1;
            this.f23597h = 400;
            this.f23598i = 0.0f;
            this.f23600k = new ArrayList<>();
            this.f23601l = null;
            this.f23602m = new ArrayList<>();
            this.f23603n = 0;
            this.f23604o = false;
            this.f23605p = -1;
            this.f23606q = 0;
            this.f23607r = 0;
            this.f23590a = id2;
            this.f23599j = motionScene;
            this.f23593d = constraintSetStartId;
            this.f23592c = constraintSetEndId;
            this.f23597h = motionScene.f23571l;
            this.f23606q = motionScene.f23572m;
        }

        b(t motionScene, Context context, XmlPullParser parser) {
            this.f23590a = -1;
            this.f23591b = false;
            this.f23592c = -1;
            this.f23593d = -1;
            this.f23594e = 0;
            this.f23595f = null;
            this.f23596g = -1;
            this.f23597h = 400;
            this.f23598i = 0.0f;
            this.f23600k = new ArrayList<>();
            this.f23601l = null;
            this.f23602m = new ArrayList<>();
            this.f23603n = 0;
            this.f23604o = false;
            this.f23605p = -1;
            this.f23606q = 0;
            this.f23607r = 0;
            this.f23597h = motionScene.f23571l;
            this.f23606q = motionScene.f23572m;
            this.f23599j = motionScene;
            y(motionScene, context, Xml.asAttributeSet(parser));
        }
    }

    t(Context context, MotionLayout layout, int resourceID) {
        this.f23560a = layout;
        this.f23578s = new b0(layout);
        V(context, resourceID);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f23567h;
        int i4 = g.C0399g.V1;
        sparseArray.put(i4, new androidx.constraintlayout.widget.d());
        this.f23568i.put("motion_base", Integer.valueOf(i4));
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public class a0 {
    private static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    private static final int M = -1;
    private static final int N = -2;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final int R = 3;
    static final int S = 4;
    static final int T = 5;
    static final int U = 6;

    /* renamed from: a, reason: collision with root package name */
    androidx.constraintlayout.widget.d f23248a;

    /* renamed from: b, reason: collision with root package name */
    private int f23249b;

    /* renamed from: f, reason: collision with root package name */
    int f23253f;

    /* renamed from: g, reason: collision with root package name */
    i f23254g;

    /* renamed from: h, reason: collision with root package name */
    d.a f23255h;

    /* renamed from: k, reason: collision with root package name */
    private int f23258k;

    /* renamed from: l, reason: collision with root package name */
    private String f23259l;

    /* renamed from: p, reason: collision with root package name */
    Context f23263p;
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";

    /* renamed from: x, reason: collision with root package name */
    private static String f23245x = "ViewTransition";

    /* renamed from: y, reason: collision with root package name */
    public static final String f23246y = "ViewTransition";

    /* renamed from: z, reason: collision with root package name */
    public static final String f23247z = "KeyFrameSet";

    /* renamed from: c, reason: collision with root package name */
    private int f23250c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23251d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f23252e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f23256i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f23257j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f23260m = 0;

    /* renamed from: n, reason: collision with root package name */
    private String f23261n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f23262o = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f23264q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f23265r = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f23266s = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f23267t = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f23268u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f23269v = -1;

    /* renamed from: w, reason: collision with root package name */
    private int f23270w = -1;

    /* compiled from: ViewTransition.java */
    class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.e f23271a;

        a(final a0 this$0, final androidx.constraintlayout.core.motion.utils.e val$easing) {
            this.f23271a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v4) {
            return (float) this.f23271a.a(v4);
        }
    }

    /* compiled from: ViewTransition.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f23272a;

        /* renamed from: b, reason: collision with root package name */
        private final int f23273b;

        /* renamed from: c, reason: collision with root package name */
        long f23274c;

        /* renamed from: d, reason: collision with root package name */
        o f23275d;

        /* renamed from: e, reason: collision with root package name */
        int f23276e;

        /* renamed from: f, reason: collision with root package name */
        int f23277f;

        /* renamed from: h, reason: collision with root package name */
        b0 f23279h;

        /* renamed from: i, reason: collision with root package name */
        Interpolator f23280i;

        /* renamed from: k, reason: collision with root package name */
        float f23282k;

        /* renamed from: l, reason: collision with root package name */
        float f23283l;

        /* renamed from: m, reason: collision with root package name */
        long f23284m;

        /* renamed from: o, reason: collision with root package name */
        boolean f23286o;

        /* renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.h f23278g = new androidx.constraintlayout.core.motion.utils.h();

        /* renamed from: j, reason: collision with root package name */
        boolean f23281j = false;

        /* renamed from: n, reason: collision with root package name */
        Rect f23285n = new Rect();

        b(b0 controller, o motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.f23286o = false;
            this.f23279h = controller;
            this.f23275d = motionController;
            this.f23276e = duration;
            this.f23277f = upDuration;
            long nanoTime = System.nanoTime();
            this.f23274c = nanoTime;
            this.f23284m = nanoTime;
            this.f23279h.c(this);
            this.f23280i = interpolator;
            this.f23272a = setTag;
            this.f23273b = clearTag;
            if (mode == 3) {
                this.f23286o = true;
            }
            this.f23283l = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            a();
        }

        void a() {
            if (this.f23281j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long nanoTime = System.nanoTime();
            long j4 = nanoTime - this.f23284m;
            this.f23284m = nanoTime;
            float f4 = (((float) (j4 * 1.0E-6d)) * this.f23283l) + this.f23282k;
            this.f23282k = f4;
            if (f4 >= 1.0f) {
                this.f23282k = 1.0f;
            }
            Interpolator interpolator = this.f23280i;
            float interpolation = interpolator == null ? this.f23282k : interpolator.getInterpolation(this.f23282k);
            o oVar = this.f23275d;
            boolean L = oVar.L(oVar.f23504b, interpolation, nanoTime, this.f23278g);
            if (this.f23282k >= 1.0f) {
                if (this.f23272a != -1) {
                    this.f23275d.J().setTag(this.f23272a, Long.valueOf(System.nanoTime()));
                }
                if (this.f23273b != -1) {
                    this.f23275d.J().setTag(this.f23273b, null);
                }
                if (!this.f23286o) {
                    this.f23279h.k(this);
                }
            }
            if (this.f23282k < 1.0f || L) {
                this.f23279h.g();
            }
        }

        void c() {
            long nanoTime = System.nanoTime();
            long j4 = nanoTime - this.f23284m;
            this.f23284m = nanoTime;
            float f4 = this.f23282k - (((float) (j4 * 1.0E-6d)) * this.f23283l);
            this.f23282k = f4;
            if (f4 < 0.0f) {
                this.f23282k = 0.0f;
            }
            Interpolator interpolator = this.f23280i;
            float interpolation = interpolator == null ? this.f23282k : interpolator.getInterpolation(this.f23282k);
            o oVar = this.f23275d;
            boolean L = oVar.L(oVar.f23504b, interpolation, nanoTime, this.f23278g);
            if (this.f23282k <= 0.0f) {
                if (this.f23272a != -1) {
                    this.f23275d.J().setTag(this.f23272a, Long.valueOf(System.nanoTime()));
                }
                if (this.f23273b != -1) {
                    this.f23275d.J().setTag(this.f23273b, null);
                }
                this.f23279h.k(this);
            }
            if (this.f23282k > 0.0f || L) {
                this.f23279h.g();
            }
        }

        public void d(int action, float x4, float y4) {
            if (action == 1) {
                if (this.f23281j) {
                    return;
                }
                e(true);
            } else {
                if (action != 2) {
                    return;
                }
                this.f23275d.J().getHitRect(this.f23285n);
                if (this.f23285n.contains((int) x4, (int) y4) || this.f23281j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean dir) {
            int i4;
            this.f23281j = dir;
            if (dir && (i4 = this.f23277f) != -1) {
                this.f23283l = i4 == 0 ? Float.MAX_VALUE : 1.0f / i4;
            }
            this.f23279h.g();
            this.f23284m = System.nanoTime();
        }
    }

    a0(Context context, XmlPullParser parser) {
        char c5;
        this.f23263p = context;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 == 0) {
                        n(context, parser);
                    } else if (c5 == 1) {
                        this.f23254g = new i(context, parser);
                    } else if (c5 == 2) {
                        this.f23255h = androidx.constraintlayout.widget.d.w(context, parser);
                    } else if (c5 == 3 || c5 == 4) {
                        androidx.constraintlayout.widget.a.q(context, parser, this.f23255h.f24050g);
                    } else {
                        c.f();
                        parser.getLineNumber();
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View[] viewArr) {
        if (this.f23264q != -1) {
            for (View view : viewArr) {
                view.setTag(this.f23264q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f23265r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f23265r, null);
            }
        }
    }

    private void n(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.po);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == g.m.qo) {
                this.f23249b = obtainStyledAttributes.getResourceId(index, this.f23249b);
            } else if (index == g.m.yo) {
                if (MotionLayout.l4) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f23258k);
                    this.f23258k = resourceId;
                    if (resourceId == -1) {
                        this.f23259l = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f23259l = obtainStyledAttributes.getString(index);
                } else {
                    this.f23258k = obtainStyledAttributes.getResourceId(index, this.f23258k);
                }
            } else if (index == g.m.zo) {
                this.f23250c = obtainStyledAttributes.getInt(index, this.f23250c);
            } else if (index == g.m.Co) {
                this.f23251d = obtainStyledAttributes.getBoolean(index, this.f23251d);
            } else if (index == g.m.Ao) {
                this.f23252e = obtainStyledAttributes.getInt(index, this.f23252e);
            } else if (index == g.m.uo) {
                this.f23256i = obtainStyledAttributes.getInt(index, this.f23256i);
            } else if (index == g.m.Do) {
                this.f23257j = obtainStyledAttributes.getInt(index, this.f23257j);
            } else if (index == g.m.Eo) {
                this.f23253f = obtainStyledAttributes.getInt(index, this.f23253f);
            } else if (index == g.m.xo) {
                int i5 = obtainStyledAttributes.peekValue(index).type;
                if (i5 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f23262o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f23260m = -2;
                    }
                } else if (i5 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f23261n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f23260m = -1;
                    } else {
                        this.f23262o = obtainStyledAttributes.getResourceId(index, -1);
                        this.f23260m = -2;
                    }
                } else {
                    this.f23260m = obtainStyledAttributes.getInteger(index, this.f23260m);
                }
            } else if (index == g.m.Bo) {
                this.f23264q = obtainStyledAttributes.getResourceId(index, this.f23264q);
            } else if (index == g.m.to) {
                this.f23265r = obtainStyledAttributes.getResourceId(index, this.f23265r);
            } else if (index == g.m.wo) {
                this.f23266s = obtainStyledAttributes.getResourceId(index, this.f23266s);
            } else if (index == g.m.vo) {
                this.f23267t = obtainStyledAttributes.getResourceId(index, this.f23267t);
            } else if (index == g.m.so) {
                this.f23269v = obtainStyledAttributes.getResourceId(index, this.f23269v);
            } else if (index == g.m.ro) {
                this.f23268u = obtainStyledAttributes.getInteger(index, this.f23268u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void v(t.b transition, View view) {
        int i4 = this.f23256i;
        if (i4 != -1) {
            transition.O(i4);
        }
        transition.V(this.f23252e);
        transition.R(this.f23260m, this.f23261n, this.f23262o);
        int id2 = view.getId();
        i iVar = this.f23254g;
        if (iVar != null) {
            ArrayList<f> d5 = iVar.d(-1);
            i iVar2 = new i();
            Iterator<f> it = d5.iterator();
            while (it.hasNext()) {
                iVar2.c(it.next().clone().k(id2));
            }
            transition.t(iVar2);
        }
    }

    void b(b0 controller, MotionLayout motionLayout, View view) {
        o oVar = new o(view);
        oVar.R(view);
        this.f23254g.a(oVar);
        oVar.a0(motionLayout.getWidth(), motionLayout.getHeight(), this.f23256i, System.nanoTime());
        new b(controller, oVar, this.f23256i, this.f23257j, this.f23250c, f(motionLayout.getContext()), this.f23264q, this.f23265r);
    }

    void c(b0 controller, MotionLayout layout, int fromId, androidx.constraintlayout.widget.d current, final View... views) {
        if (this.f23251d) {
            return;
        }
        int i4 = this.f23253f;
        if (i4 == 2) {
            b(controller, layout, views[0]);
            return;
        }
        if (i4 == 1) {
            for (int i5 : layout.R0()) {
                if (i5 != fromId) {
                    androidx.constraintlayout.widget.d Q0 = layout.Q0(i5);
                    for (View view : views) {
                        d.a k02 = Q0.k0(view.getId());
                        d.a aVar = this.f23255h;
                        if (aVar != null) {
                            aVar.h(k02);
                            k02.f24050g.putAll(this.f23255h.f24050g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.I(current);
        for (View view2 : views) {
            d.a k03 = dVar.k0(view2.getId());
            d.a aVar2 = this.f23255h;
            if (aVar2 != null) {
                aVar2.h(k03);
                k03.f24050g.putAll(this.f23255h.f24050g);
            }
        }
        layout.c2(fromId, dVar);
        int i6 = g.C0399g.N3;
        layout.c2(i6, current);
        layout.R(i6, -1, -1);
        t.b bVar = new t.b(-1, layout.J, i6, fromId);
        for (View view3 : views) {
            v(bVar, view3);
        }
        layout.M1(bVar);
        layout.V1(new Runnable() { // from class: androidx.constraintlayout.motion.widget.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.l(views);
            }
        });
    }

    boolean d(View view) {
        int i4 = this.f23266s;
        boolean z4 = i4 == -1 || view.getTag(i4) != null;
        int i5 = this.f23267t;
        return z4 && (i5 == -1 || view.getTag(i5) == null);
    }

    int e() {
        return this.f23249b;
    }

    Interpolator f(Context context) {
        int i4 = this.f23260m;
        if (i4 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f23262o);
        }
        if (i4 == -1) {
            return new a(this, androidx.constraintlayout.core.motion.utils.e.c(this.f23261n));
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

    public int g() {
        return this.f23268u;
    }

    public int h() {
        return this.f23270w;
    }

    public int i() {
        return this.f23269v;
    }

    public int j() {
        return this.f23250c;
    }

    boolean k() {
        return !this.f23251d;
    }

    boolean m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f23258k == -1 && this.f23259l == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f23258k) {
            return true;
        }
        return this.f23259l != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).R2) != null && str.matches(this.f23259l);
    }

    void o(boolean enable) {
        this.f23251d = !enable;
    }

    void p(int id2) {
        this.f23249b = id2;
    }

    public void q(int sharedValue) {
        this.f23268u = sharedValue;
    }

    public void r(int sharedValueCurrent) {
        this.f23270w = sharedValueCurrent;
    }

    public void s(int sharedValueID) {
        this.f23269v = sharedValueID;
    }

    public void t(int stateTransition) {
        this.f23250c = stateTransition;
    }

    public String toString() {
        return "ViewTransition(" + c.i(this.f23263p, this.f23249b) + ")";
    }

    boolean u(int action) {
        int i4 = this.f23250c;
        return i4 == 1 ? action == 0 : i4 == 2 ? action == 1 : i4 == 3 && action == 0;
    }
}

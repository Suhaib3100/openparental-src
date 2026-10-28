package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.f;
import androidx.appcompat.widget.i0;
import androidx.collection.c3;
import androidx.collection.e1;
import androidx.core.content.res.n;
import androidx.core.graphics.drawable.k;
import androidx.vectordrawable.graphics.drawable.i;
import f.a;
import f.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.f implements k {
    private static final String A = "transition";
    private static final String B = "item";
    private static final String C = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String D = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String E = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: z, reason: collision with root package name */
    private static final String f976z = "a";

    /* renamed from: u, reason: collision with root package name */
    private c f977u;

    /* renamed from: v, reason: collision with root package name */
    private g f978v;

    /* renamed from: w, reason: collision with root package name */
    private int f979w;

    /* renamed from: x, reason: collision with root package name */
    private int f980x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f981y;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f982a;

        b(Animatable animatable) {
            this.f982a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f982a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f982a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    static class c extends f.a {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        e1<Long> K;
        c3<Integer> L;

        c(@q0 c cVar, @o0 a aVar, @q0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new e1<>();
                this.L = new c3<>();
            }
        }

        private static long H(int i4, int i5) {
            return i5 | (i4 << 32);
        }

        int F(@o0 int[] iArr, @o0 Drawable drawable, int i4) {
            int D = super.D(iArr, drawable);
            this.L.q(D, Integer.valueOf(i4));
            return D;
        }

        int G(int i4, int i5, @o0 Drawable drawable, boolean z4) {
            int a5 = a(drawable);
            long H = H(i4, i5);
            long j4 = z4 ? N : 0L;
            long j5 = a5;
            this.K.b(H, Long.valueOf(j5 | j4));
            if (z4) {
                this.K.b(H(i5, i4), Long.valueOf(M | j5 | j4));
            }
            return a5;
        }

        int I(int i4) {
            if (i4 < 0) {
                return 0;
            }
            return this.L.k(i4, 0).intValue();
        }

        int J(@o0 int[] iArr) {
            int E = super.E(iArr);
            return E >= 0 ? E : super.E(StateSet.WILD_CARD);
        }

        int K(int i4, int i5) {
            return (int) this.K.k(H(i4, i5), -1L).longValue();
        }

        boolean L(int i4, int i5) {
            return (this.K.k(H(i4, i5), -1L).longValue() & M) != 0;
        }

        boolean M(int i4, int i5) {
            return (this.K.k(H(i4, i5), -1L).longValue() & N) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.f.a, android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.f.a, androidx.appcompat.graphics.drawable.b.d
        void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.f.a, android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f983a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            this.f983a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f983a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f983a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f984a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f985b;

        e(AnimationDrawable animationDrawable, boolean z4, boolean z5) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i4 = z4 ? numberOfFrames - 1 : 0;
            int i5 = z4 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z4);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i5);
            a.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f985b = z5;
            this.f984a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f985b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f984a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f984a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f984a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f986a;

        /* renamed from: b, reason: collision with root package name */
        private int f987b;

        /* renamed from: c, reason: collision with root package name */
        private int f988c;

        f(AnimationDrawable animationDrawable, boolean z4) {
            b(animationDrawable, z4);
        }

        int a() {
            return this.f988c;
        }

        int b(AnimationDrawable animationDrawable, boolean z4) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f987b = numberOfFrames;
            int[] iArr = this.f986a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f986a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f986a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                int duration = animationDrawable.getDuration(z4 ? (numberOfFrames - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            this.f988c = i4;
            return i4;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            int i4 = (int) ((f4 * this.f988c) + 0.5f);
            int i5 = this.f987b;
            int[] iArr = this.f986a;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = iArr[i6];
                if (i4 < i7) {
                    break;
                }
                i4 -= i7;
                i6++;
            }
            return (i6 / i5) + (i6 < i5 ? i4 / this.f988c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();

        g(C0016a c0016a) {
        }
    }

    public a() {
        this(null, null);
    }

    @q0
    public static a B(@o0 Context context, @v int i4, @q0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i4);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @o0
    public static a C(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    private int E(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C1019b.f73829h);
        int resourceId = s4.getResourceId(b.C1019b.f73830i, 0);
        int resourceId2 = s4.getResourceId(b.C1019b.f73831j, -1);
        Drawable j4 = resourceId2 > 0 ? i0.h().j(context, resourceId2) : null;
        s4.recycle();
        int[] p4 = p(attributeSet);
        if (j4 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j4 = xmlPullParser.getName().equals("vector") ? i.f(resources, xmlPullParser, attributeSet, theme) : a.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j4 != null) {
            return this.f977u.F(p4, j4, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int F(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C1019b.f73832k);
        int resourceId = s4.getResourceId(b.C1019b.f73835n, -1);
        int resourceId2 = s4.getResourceId(b.C1019b.f73834m, -1);
        int resourceId3 = s4.getResourceId(b.C1019b.f73833l, -1);
        Drawable j4 = resourceId3 > 0 ? i0.h().j(context, resourceId3) : null;
        boolean z4 = s4.getBoolean(b.C1019b.f73836o, false);
        s4.recycle();
        if (j4 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j4 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.f(context, resources, xmlPullParser, attributeSet, theme) : a.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j4 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f977u.G(resourceId, resourceId2, j4, z4);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean G(int i4) {
        int d5;
        int K;
        g bVar;
        g gVar = this.f978v;
        if (gVar == null) {
            d5 = d();
        } else {
            if (i4 == this.f979w) {
                return true;
            }
            if (i4 == this.f980x && gVar.a()) {
                gVar.b();
                this.f979w = this.f980x;
                this.f980x = i4;
                return true;
            }
            d5 = this.f979w;
            gVar.d();
        }
        this.f978v = null;
        this.f980x = -1;
        this.f979w = -1;
        c cVar = this.f977u;
        int I = cVar.I(d5);
        int I2 = cVar.I(i4);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.M(I, I2);
        h(K);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), M);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f978v = bVar;
        this.f980x = d5;
        this.f979w = i4;
        return true;
    }

    private void w(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f977u;
        cVar.f1009d |= a.c.b(typedArray);
        cVar.f1014i = typedArray.getBoolean(b.C1019b.f73825d, cVar.f1014i);
        cVar.f1017l = typedArray.getBoolean(b.C1019b.f73826e, cVar.f1017l);
        cVar.A = typedArray.getInt(b.C1019b.f73827f, cVar.A);
        cVar.B = typedArray.getInt(b.C1019b.f73828g, cVar.B);
        setDither(typedArray.getBoolean(b.C1019b.f73823b, cVar.f1029x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.f977u, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f981y = false;
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b
    void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f977u = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f978v;
        if (gVar != null) {
            gVar.d();
            this.f978v = null;
            h(this.f979w);
            this.f979w = -1;
            this.f980x = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f981y && super.mutate() == this) {
            this.f977u.v();
            this.f981y = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@o0 int[] iArr) {
        int J = this.f977u.J(iArr);
        boolean z4 = J != d() && (G(J) || h(J));
        Drawable current = getCurrent();
        return current != null ? z4 | current.setState(iArr) : z4;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        g gVar = this.f978v;
        if (gVar != null && (visible || z5)) {
            if (z4) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.f
    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C1019b.f73822a);
        setVisible(s4.getBoolean(b.C1019b.f73824c, true), true);
        x(s4);
        m(resources);
        s4.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@o0 int[] iArr, @o0 Drawable drawable, int i4) {
        drawable.getClass();
        this.f977u.F(iArr, drawable, i4);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i4, int i5, @o0 T t4, boolean z4) {
        t4.getClass();
        this.f977u.G(i4, i5, t4, z4);
    }

    a(@q0 c cVar, @q0 Resources resources) {
        super(null);
        this.f979w = -1;
        this.f980x = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}

package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.f;
import androidx.collection.j;
import androidx.core.graphics.drawable.p;
import androidx.vectordrawable.graphics.drawable.i;
import e.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes3.dex */
public class a extends androidx.appcompat.graphics.drawable.f implements p {
    private c H;
    private g I;
    private int J;
    private int K;
    private boolean L;
    private static final String P = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String Q = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String R = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String M = "a";
    private static final String N = "transition";
    private static final String O = "item";

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes2.dex */
    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f467a;

        b(Animatable animatable) {
            super(null);
            this.f467a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f467a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f467a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    static class c extends f.a {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        androidx.collection.f<Long> K;
        j<Integer> L;

        c(@q0 c cVar, @o0 a aVar, @q0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new androidx.collection.f<>();
                this.L = new j<>();
            }
        }

        private static long H(int i5, int i6) {
            return i6 | (i5 << 32);
        }

        int F(@o0 int[] iArr, @o0 Drawable drawable, int i5) {
            int D = super.D(iArr, drawable);
            this.L.p(D, Integer.valueOf(i5));
            return D;
        }

        int G(int i5, int i6, @o0 Drawable drawable, boolean z5) {
            int a6 = super.a(drawable);
            long H = H(i5, i6);
            long j5 = z5 ? N : 0L;
            long j6 = a6;
            this.K.a(H, Long.valueOf(j6 | j5));
            if (z5) {
                this.K.a(H(i6, i5), Long.valueOf(M | j6 | j5));
            }
            return a6;
        }

        int I(int i5) {
            if (i5 < 0) {
                return 0;
            }
            return this.L.k(i5, 0).intValue();
        }

        int J(@o0 int[] iArr) {
            int E = super.E(iArr);
            return E >= 0 ? E : super.E(StateSet.WILD_CARD);
        }

        int K(int i5, int i6) {
            return (int) this.K.k(H(i5, i6), -1L).longValue();
        }

        boolean L(int i5, int i6) {
            return (this.K.k(H(i5, i6), -1L).longValue() & M) != 0;
        }

        boolean M(int i5, int i6) {
            return (this.K.k(H(i5, i6), -1L).longValue() & N) != 0;
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
    /* loaded from: classes2.dex */
    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f468a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super(null);
            this.f468a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f468a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f468a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes2.dex */
    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f469a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f470b;

        e(AnimationDrawable animationDrawable, boolean z5, boolean z6) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i5 = z5 ? numberOfFrames - 1 : 0;
            int i6 = z5 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z5);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i5, i6);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f470b = z6;
            this.f469a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f470b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f469a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f469a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f469a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f471a;

        /* renamed from: b, reason: collision with root package name */
        private int f472b;

        /* renamed from: c, reason: collision with root package name */
        private int f473c;

        f(AnimationDrawable animationDrawable, boolean z5) {
            b(animationDrawable, z5);
        }

        int a() {
            return this.f473c;
        }

        int b(AnimationDrawable animationDrawable, boolean z5) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f472b = numberOfFrames;
            int[] iArr = this.f471a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f471a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f471a;
            int i5 = 0;
            for (int i6 = 0; i6 < numberOfFrames; i6++) {
                int duration = animationDrawable.getDuration(z5 ? (numberOfFrames - i6) - 1 : i6);
                iArr2[i6] = duration;
                i5 += duration;
            }
            this.f473c = i5;
            return i5;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            int i5 = (int) ((f6 * this.f473c) + 0.5f);
            int i6 = this.f472b;
            int[] iArr = this.f471a;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = iArr[i7];
                if (i5 < i8) {
                    break;
                }
                i5 -= i8;
                i7++;
            }
            return (i7 / i6) + (i7 < i6 ? i5 / this.f473c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
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

        g(C0007a c0007a) {
        }
    }

    public a() {
        this(null, null);
    }

    @q0
    public static a B(@o0 Context context, @v int i5, @q0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i5);
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
        TypedArray s5 = androidx.core.content.res.p.s(resources, theme, attributeSet, a.j.f22511h);
        int resourceId = s5.getResourceId(a.j.f22513i, 0);
        int resourceId2 = s5.getResourceId(a.j.f22515j, -1);
        Drawable j5 = resourceId2 > 0 ? androidx.appcompat.widget.o0.h().j(context, resourceId2) : null;
        s5.recycle();
        int[] p5 = p(attributeSet);
        if (j5 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j5 = xmlPullParser.getName().equals("vector") ? i.e(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j5 != null) {
            return this.H.F(p5, j5, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int F(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s5 = androidx.core.content.res.p.s(resources, theme, attributeSet, a.j.f22517k);
        int resourceId = s5.getResourceId(a.j.f22523n, -1);
        int resourceId2 = s5.getResourceId(a.j.f22521m, -1);
        int resourceId3 = s5.getResourceId(a.j.f22519l, -1);
        Drawable j5 = resourceId3 > 0 ? androidx.appcompat.widget.o0.h().j(context, resourceId3) : null;
        boolean z5 = s5.getBoolean(a.j.f22524o, false);
        s5.recycle();
        if (j5 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j5 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.e(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j5 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.H.G(resourceId, resourceId2, j5, z5);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean G(int i5) {
        int d6;
        int K;
        g bVar;
        g gVar = this.I;
        if (gVar == null) {
            d6 = d();
        } else {
            if (i5 == this.J) {
                return true;
            }
            if (i5 == this.K && gVar.a()) {
                gVar.b();
                this.J = this.K;
                this.K = i5;
                return true;
            }
            d6 = this.J;
            gVar.d();
        }
        this.I = null;
        this.K = -1;
        this.J = -1;
        c cVar = this.H;
        int I = cVar.I(d6);
        int I2 = cVar.I(i5);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M2 = cVar.M(I, I2);
        h(K);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), M2);
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
        this.I = bVar;
        this.K = d6;
        this.J = i5;
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
        c cVar = this.H;
        cVar.f491d |= typedArray.getChangingConfigurations();
        cVar.B(typedArray.getBoolean(a.j.f22503d, cVar.f496i));
        cVar.x(typedArray.getBoolean(a.j.f22505e, cVar.f499l));
        cVar.y(typedArray.getInt(a.j.f22507f, cVar.A));
        cVar.z(typedArray.getInt(a.j.f22509g, cVar.B));
        setDither(typedArray.getBoolean(a.j.f22499b, cVar.f511x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.H, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @x0(21)
    public /* bridge */ /* synthetic */ void applyTheme(@o0 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.L = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @x0(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@o0 Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@o0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @x0(21)
    public /* bridge */ /* synthetic */ void getOutline(@o0 Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@o0 Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b
    void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.H = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@o0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
            h(this.J);
            this.J = -1;
            this.K = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public /* bridge */ /* synthetic */ void k(int i5) {
        super.k(i5);
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public /* bridge */ /* synthetic */ void l(int i5) {
        super.l(i5);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.L && super.mutate() == this) {
            this.H.v();
            this.L = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.f
    public /* bridge */ /* synthetic */ void n(int[] iArr, Drawable drawable) {
        super.n(iArr, drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i5) {
        return super.onLayoutDirectionChanged(i5);
    }

    @Override // androidx.appcompat.graphics.drawable.f, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int J = this.H.J(iArr);
        boolean z5 = J != d() && (G(J) || h(J));
        Drawable current = getCurrent();
        return current != null ? z5 | current.setState(iArr) : z5;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j5) {
        super.scheduleDrawable(drawable, runnable, j5);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i5) {
        super.setAlpha(i5);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z5) {
        super.setAutoMirrored(z5);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z5) {
        super.setDither(z5);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f7) {
        super.setHotspot(f6, f7);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i5, int i6, int i7, int i8) {
        super.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public /* bridge */ /* synthetic */ void setTintMode(@o0 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        g gVar = this.I;
        if (gVar != null && (visible || z6)) {
            if (z5) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // androidx.appcompat.graphics.drawable.f
    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s5 = androidx.core.content.res.p.s(resources, theme, attributeSet, a.j.f22497a);
        setVisible(s5.getBoolean(a.j.f22501c, true), true);
        x(s5);
        m(resources);
        s5.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@o0 int[] iArr, @o0 Drawable drawable, int i5) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable must not be null");
        }
        this.H.F(iArr, drawable, i5);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i5, int i6, @o0 T t5, boolean z5) {
        if (t5 == null) {
            throw new IllegalArgumentException("Transition drawable must not be null");
        }
        this.H.G(i5, i6, t5, z5);
    }

    a(@q0 c cVar, @q0 Resources resources) {
        super(null);
        this.J = -1;
        this.K = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}

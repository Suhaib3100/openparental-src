package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.core.content.res.p;
import androidx.vectordrawable.graphics.drawable.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes3.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: w, reason: collision with root package name */
    private static final String f10186w = "AnimatedVDCompat";

    /* renamed from: x, reason: collision with root package name */
    private static final String f10187x = "animated-vector";

    /* renamed from: y, reason: collision with root package name */
    private static final String f10188y = "target";

    /* renamed from: z, reason: collision with root package name */
    private static final boolean f10189z = false;

    /* renamed from: p, reason: collision with root package name */
    private C0123c f10190p;

    /* renamed from: q, reason: collision with root package name */
    private Context f10191q;

    /* renamed from: r, reason: collision with root package name */
    private ArgbEvaluator f10192r;

    /* renamed from: s, reason: collision with root package name */
    d f10193s;

    /* renamed from: t, reason: collision with root package name */
    private Animator.AnimatorListener f10194t;

    /* renamed from: u, reason: collision with root package name */
    ArrayList<b.a> f10195u;

    /* renamed from: v, reason: collision with root package name */
    final Drawable.Callback f10196v;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            c.this.scheduleSelf(runnable, j5);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f10195u);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((b.a) arrayList.get(i5)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f10195u);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((b.a) arrayList.get(i5)).c(c.this);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0123c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f10199a;

        /* renamed from: b, reason: collision with root package name */
        i f10200b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f10201c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f10202d;

        /* renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f10203e;

        public C0123c(Context context, C0123c c0123c, Drawable.Callback callback, Resources resources) {
            if (c0123c != null) {
                this.f10199a = c0123c.f10199a;
                i iVar = c0123c.f10200b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f10200b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f10200b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f10200b.mutate();
                    this.f10200b = iVar2;
                    iVar2.setCallback(callback);
                    this.f10200b.setBounds(c0123c.f10200b.getBounds());
                    this.f10200b.l(false);
                }
                ArrayList<Animator> arrayList = c0123c.f10202d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f10202d = new ArrayList<>(size);
                    this.f10203e = new androidx.collection.a<>(size);
                    for (int i5 = 0; i5 < size; i5++) {
                        Animator animator = c0123c.f10202d.get(i5);
                        Animator clone = animator.clone();
                        String str = c0123c.f10203e.get(animator);
                        clone.setTarget(this.f10200b.g(str));
                        this.f10202d.add(clone);
                        this.f10203e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f10201c == null) {
                this.f10201c = new AnimatorSet();
            }
            this.f10201c.playTogether(this.f10202d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10199a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @q0
    public static c d(@o0 Context context, @v int i5) {
        c cVar = new c(context, null, null);
        Drawable g5 = androidx.core.content.res.i.g(context.getResources(), i5, context.getTheme());
        cVar.f10221o = g5;
        g5.setCallback(cVar.f10196v);
        cVar.f10193s = new d(cVar.f10221o.getConstantState());
        return cVar;
    }

    public static c e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context, null, null);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void f(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        g((AnimatedVectorDrawable) drawable, aVar);
    }

    @x0(23)
    private static void g(@o0 AnimatedVectorDrawable animatedVectorDrawable, @o0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void h() {
        Animator.AnimatorListener animatorListener = this.f10194t;
        if (animatorListener != null) {
            this.f10190p.f10201c.removeListener(animatorListener);
            this.f10194t = null;
        }
    }

    private void i(String str, Animator animator) {
        animator.setTarget(this.f10190p.f10200b.g(str));
        C0123c c0123c = this.f10190p;
        if (c0123c.f10202d == null) {
            c0123c.f10202d = new ArrayList<>();
            this.f10190p.f10203e = new androidx.collection.a<>();
        }
        this.f10190p.f10202d.add(animator);
        this.f10190p.f10203e.put(animator, str);
    }

    private void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i5 = 0; i5 < childAnimations.size(); i5++) {
                j(childAnimations.get(i5));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f10192r == null) {
                    this.f10192r = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f10192r);
            }
        }
    }

    public static boolean k(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return l((AnimatedVectorDrawable) drawable, aVar);
    }

    @x0(23)
    private static boolean l(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.a(drawable, theme);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@o0 b.a aVar) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f10195u == null) {
            this.f10195u = new ArrayList<>();
        }
        if (this.f10195u.contains(aVar)) {
            return;
        }
        this.f10195u.add(aVar);
        if (this.f10194t == null) {
            this.f10194t = new b();
        }
        this.f10190p.f10201c.addListener(this.f10194t);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean c(@o0 b.a aVar) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.f10195u;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f10195u.size() == 0) {
            h();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<b.a> arrayList = this.f10195u;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f10190p.f10200b.draw(canvas);
        if (this.f10190p.f10201c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.d(drawable) : this.f10190p.f10200b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10190p.f10199a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.e(drawable) : this.f10190p.f10200b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f10221o != null) {
            return new d(this.f10221o.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f10190p.f10200b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f10190p.f10200b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getOpacity() : this.f10190p.f10200b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.M);
                    int resourceId = s5.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i d6 = i.d(resources, resourceId, theme);
                        d6.l(false);
                        d6.setCallback(this.f10196v);
                        i iVar = this.f10190p.f10200b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f10190p.f10200b = d6;
                    }
                    s5.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f10191q;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        i(string, AnimatorInflater.loadAnimator(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f10190p.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.h(drawable) : this.f10190p.f10200b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f10221o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f10190p.f10201c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.isStateful() : this.f10190p.f10200b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10190p.f10200b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.setLevel(i5) : this.f10190p.f10200b.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.setState(iArr) : this.f10190p.f10200b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else {
            this.f10190p.f10200b.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z5);
        } else {
            this.f10190p.f10200b.setAutoMirrored(z5);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i5) {
        super.setChangingConfigurations(i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i5, PorterDuff.Mode mode) {
        super.setColorFilter(i5, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z5) {
        super.setFilterBitmap(z5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f7) {
        super.setHotspot(f6, f7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i5, int i6, int i7, int i8) {
        super.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i5);
        } else {
            this.f10190p.f10200b.setTint(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        } else {
            this.f10190p.f10200b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
        } else {
            this.f10190p.f10200b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f10190p.f10200b.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f10190p.f10201c.isStarted()) {
                return;
            }
            this.f10190p.f10201c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10190p.f10201c.end();
        }
    }

    private c(@q0 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10190p.f10200b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    @x0(24)
    /* loaded from: classes.dex */
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f10204a;

        public d(Drawable.ConstantState constantState) {
            this.f10204a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f10204a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10204a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f10204a.newDrawable();
            cVar.f10221o = newDrawable;
            newDrawable.setCallback(cVar.f10196v);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f10204a.newDrawable(resources);
            cVar.f10221o = newDrawable;
            newDrawable.setCallback(cVar.f10196v);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f10204a.newDrawable(resources, theme);
            cVar.f10221o = newDrawable;
            newDrawable.setCallback(cVar.f10196v);
            return cVar;
        }
    }

    private c(@q0 Context context, @q0 C0123c c0123c, @q0 Resources resources) {
        this.f10192r = null;
        this.f10194t = null;
        this.f10195u = null;
        a aVar = new a();
        this.f10196v = aVar;
        this.f10191q = context;
        if (c0123c != null) {
            this.f10190p = c0123c;
        } else {
            this.f10190p = new C0123c(context, c0123c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

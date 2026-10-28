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
import androidx.core.content.res.n;
import androidx.vectordrawable.graphics.drawable.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes3.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: j, reason: collision with root package name */
    private static final String f35312j = "AnimatedVDCompat";

    /* renamed from: k, reason: collision with root package name */
    private static final String f35313k = "animated-vector";

    /* renamed from: l, reason: collision with root package name */
    private static final String f35314l = "target";

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f35315m = false;

    /* renamed from: c, reason: collision with root package name */
    private C0633c f35316c;

    /* renamed from: d, reason: collision with root package name */
    private Context f35317d;

    /* renamed from: e, reason: collision with root package name */
    private ArgbEvaluator f35318e;

    /* renamed from: f, reason: collision with root package name */
    d f35319f;

    /* renamed from: g, reason: collision with root package name */
    private Animator.AnimatorListener f35320g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<b.a> f35321h;

    /* renamed from: i, reason: collision with root package name */
    final Drawable.Callback f35322i;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            c.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f35321h);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f35321h);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).c(c.this);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0633c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f35325a;

        /* renamed from: b, reason: collision with root package name */
        i f35326b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f35327c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f35328d;

        /* renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f35329e;

        public C0633c(Context context, C0633c c0633c, Drawable.Callback callback, Resources resources) {
            if (c0633c != null) {
                this.f35325a = c0633c.f35325a;
                i iVar = c0633c.f35326b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f35326b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f35326b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f35326b.mutate();
                    this.f35326b = iVar2;
                    iVar2.setCallback(callback);
                    this.f35326b.setBounds(c0633c.f35326b.getBounds());
                    this.f35326b.m(false);
                }
                ArrayList<Animator> arrayList = c0633c.f35328d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f35328d = new ArrayList<>(size);
                    this.f35329e = new androidx.collection.a<>(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Animator animator = c0633c.f35328d.get(i4);
                        Animator clone = animator.clone();
                        String str = c0633c.f35329e.get(animator);
                        clone.setTarget(this.f35326b.h(str));
                        this.f35328d.add(clone);
                        this.f35329e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f35327c == null) {
                this.f35327c = new AnimatorSet();
            }
            this.f35327c.playTogether(this.f35328d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f35325a;
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

    private c(@q0 Context context, @q0 C0633c c0633c, @q0 Resources resources) {
        this.f35318e = null;
        this.f35320g = null;
        this.f35321h = null;
        a aVar = new a();
        this.f35322i = aVar;
        this.f35317d = context;
        if (c0633c != null) {
            this.f35316c = c0633c;
        } else {
            this.f35316c = new C0633c(context, c0633c, aVar, resources);
        }
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @q0
    public static c c(@o0 Context context, @v int i4) {
        c cVar = new c(context, null, null);
        Drawable g4 = androidx.core.content.res.i.g(context.getResources(), i4, context.getTheme());
        cVar.f35347b = g4;
        g4.setCallback(cVar.f35322i);
        cVar.f35319f = new d(cVar.f35347b.getConstantState());
        return cVar;
    }

    public static c f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context, null, null);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void g(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        h((AnimatedVectorDrawable) drawable, aVar);
    }

    @x0(23)
    private static void h(@o0 AnimatedVectorDrawable animatedVectorDrawable, @o0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void i() {
        Animator.AnimatorListener animatorListener = this.f35320g;
        if (animatorListener != null) {
            this.f35316c.f35327c.removeListener(animatorListener);
            this.f35320g = null;
        }
    }

    private void j(String str, Animator animator) {
        animator.setTarget(this.f35316c.f35326b.h(str));
        C0633c c0633c = this.f35316c;
        if (c0633c.f35328d == null) {
            c0633c.f35328d = new ArrayList<>();
            this.f35316c.f35329e = new androidx.collection.a<>();
        }
        this.f35316c.f35328d.add(animator);
        this.f35316c.f35329e.put(animator, str);
    }

    private void k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i4 = 0; i4 < childAnimations.size(); i4++) {
                k(childAnimations.get(i4));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f35318e == null) {
                    this.f35318e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f35318e);
            }
        }
    }

    public static boolean l(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return m((AnimatedVectorDrawable) drawable, aVar);
    }

    @x0(23)
    private static boolean m(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@o0 b.a aVar) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f35321h == null) {
            this.f35321h = new ArrayList<>();
        }
        if (this.f35321h.contains(aVar)) {
            return;
        }
        this.f35321h.add(aVar);
        if (this.f35320g == null) {
            this.f35320g = new b();
        }
        this.f35316c.f35327c.addListener(this.f35320g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void d() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        i();
        ArrayList<b.a> arrayList = this.f35321h;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f35316c.f35326b.draw(canvas);
        if (this.f35316c.f35327c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean e(@o0 b.a aVar) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.f35321h;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f35321h.size() == 0) {
            i();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getAlpha() : this.f35316c.f35326b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f35316c.f35325a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getColorFilter() : this.f35316c.f35326b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f35347b != null) {
            return new d(this.f35347b.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f35316c.f35326b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f35316c.f35326b.getIntrinsicWidth();
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
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getOpacity() : this.f35316c.f35326b.getOpacity();
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
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.M);
                    int resourceId = s4.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i c5 = i.c(resources, resourceId, theme);
                        c5.m(false);
                        c5.setCallback(this.f35322i);
                        i iVar = this.f35316c.f35326b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f35316c.f35326b = c5;
                    }
                    s4.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f35317d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        j(string, AnimatorInflater.loadAnimator(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f35316c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.isAutoMirrored() : this.f35316c.f35326b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f35347b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f35316c.f35327c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.isStateful() : this.f35316c.f35326b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f35316c.f35326b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.setLevel(i4) : this.f35316c.f35326b.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.setState(iArr) : this.f35316c.f35326b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f35316c.f35326b.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f35316c.f35326b.setAutoMirrored(z4);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z4) {
        super.setFilterBitmap(z4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i4);
        } else {
            this.f35316c.f35326b.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        } else {
            this.f35316c.f35326b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
        } else {
            this.f35316c.f35326b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            return drawable.setVisible(z4, z5);
        }
        this.f35316c.f35326b.setVisible(z4, z5);
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f35316c.f35327c.isStarted()) {
                return;
            }
            this.f35316c.f35327c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f35316c.f35327c.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f35316c.f35326b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    @x0(24)
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f35330a;

        public d(Drawable.ConstantState constantState) {
            this.f35330a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f35330a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f35330a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f35330a.newDrawable();
            cVar.f35347b = newDrawable;
            newDrawable.setCallback(cVar.f35322i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f35330a.newDrawable(resources);
            cVar.f35347b = newDrawable;
            newDrawable.setCallback(cVar.f35322i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f35330a.newDrawable(resources, theme);
            cVar.f35347b = newDrawable;
            newDrawable.setCallback(cVar.f35322i);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(@q0 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

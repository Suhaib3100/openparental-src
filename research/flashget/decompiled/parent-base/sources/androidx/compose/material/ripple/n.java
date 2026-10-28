package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: RippleHostView.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u0016\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u001aJ0\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u001aR\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00107R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/material/ripple/n;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "Lkotlin/k2;", "c", "(Z)V", "pressed", "f", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/compose/foundation/interaction/m$b;", "interaction", "Li0/n;", "size", "radius", "Landroidx/compose/ui/graphics/d2;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Landroidx/compose/foundation/interaction/m$b;ZJIJFLld/a;)V", "e", "h", "(JIJF)V", "d", "Landroidx/compose/material/ripple/t;", "Landroidx/compose/material/ripple/t;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lld/a;", "g", "a", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final int f9364h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final long f9365i = 5;

    /* renamed from: j, reason: collision with root package name */
    private static final long f9366j = 50;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private t ripple;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Boolean bounded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Long lastRippleStateChangeTimeMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Runnable resetRippleRunnable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<k2> onInvalidateRipple;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final int[] f9367k = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final int[] f9368l = new int[0];

    public n(@fg.l Context context) {
        super(context);
    }

    private final void c(boolean bounded) {
        t tVar = new t(bounded);
        setBackground(tVar);
        this.ripple = tVar;
    }

    private final void f(boolean pressed) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l4 = this.lastRippleStateChangeTimeMillis;
        long longValue = currentAnimationTimeMillis - (l4 != null ? l4.longValue() : 0L);
        if (pressed || longValue >= 5) {
            int[] iArr = pressed ? f9367k : f9368l;
            t tVar = this.ripple;
            if (tVar != null) {
                tVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.g(n.this);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, f9366j);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(n nVar) {
        t tVar = nVar.ripple;
        if (tVar != null) {
            tVar.setState(f9368l);
        }
        nVar.resetRippleRunnable = null;
    }

    public final void b(@fg.l m.b interaction, boolean bounded, long size, int radius, long color, float alpha, @fg.l ld.a<k2> onInvalidateRipple) {
        if (this.ripple == null || !l0.g(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        t tVar = this.ripple;
        l0.m(tVar);
        this.onInvalidateRipple = onInvalidateRipple;
        h(size, radius, color, alpha);
        if (bounded) {
            tVar.setHotspot(i0.f.p(interaction.getPressPosition()), i0.f.r(interaction.getPressPosition()));
        } else {
            tVar.setHotspot(tVar.getBounds().centerX(), tVar.getBounds().centerY());
        }
        f(true);
    }

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            l0.m(runnable2);
            runnable2.run();
        } else {
            t tVar = this.ripple;
            if (tVar != null) {
                tVar.setState(f9368l);
            }
        }
        t tVar2 = this.ripple;
        if (tVar2 == null) {
            return;
        }
        tVar2.setVisible(false, false);
        unscheduleDrawable(tVar2);
    }

    public final void e() {
        f(false);
    }

    public final void h(long size, int radius, long color, float alpha) {
        t tVar = this.ripple;
        if (tVar == null) {
            return;
        }
        tVar.c(radius);
        tVar.b(color, alpha);
        Rect rect = new Rect(0, 0, kotlin.math.b.L0(i0.n.t(size)), kotlin.math.b.L0(i0.n.m(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        tVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@fg.l Drawable who) {
        ld.a<k2> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}

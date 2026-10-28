package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import androidx.core.view.x1;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.a2;

/* compiled from: RippleHostView.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000  2\u00020\u0001:\u0002\n\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material/ripple/t;", "Landroid/graphics/drawable/RippleDrawable;", "", "bounded", "<init>", "(Z)V", "Landroidx/compose/ui/graphics/d2;", "color", "", "alpha", "a", "(JF)J", "Lkotlin/k2;", "b", "(JF)V", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "", "radius", "c", "(I)V", "Z", "Landroidx/compose/ui/graphics/d2;", "rippleColor", "d", "Ljava/lang/Integer;", "rippleRadius", "e", "projected", "f", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class t extends RippleDrawable {

    /* renamed from: g, reason: collision with root package name */
    @fg.m
    private static Method f9397g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f9398h;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d2 rippleColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer rippleRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean projected;

    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/ripple/t$b;", "", "<init>", "()V", "Landroid/graphics/drawable/RippleDrawable;", "ripple", "", "radius", "Lkotlin/k2;", "a", "(Landroid/graphics/drawable/RippleDrawable;I)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(23)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f9403a = new b();

        private b() {
        }

        @u
        public final void a(@fg.l RippleDrawable ripple, int radius) {
            ripple.setRadius(radius);
        }
    }

    public t(boolean z4) {
        super(ColorStateList.valueOf(x1.f27484y), null, z4 ? new ColorDrawable(-1) : null);
        this.bounded = z4;
    }

    private final long a(long color, float alpha) {
        if (Build.VERSION.SDK_INT < 28) {
            alpha *= 2;
        }
        return d2.w(color, kotlin.ranges.s.A(alpha, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long color, float alpha) {
        long a5 = a(color, alpha);
        d2 d2Var = this.rippleColor;
        if (d2Var == null ? false : a2.o(d2Var.M(), a5)) {
            return;
        }
        this.rippleColor = d2.n(a5);
        setColor(ColorStateList.valueOf(f2.r(a5)));
    }

    public final void c(int radius) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == radius) {
            return;
        }
        this.rippleRadius = Integer.valueOf(radius);
        b.f9403a.a(this, radius);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @fg.l
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }
}

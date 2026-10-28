package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/m2;", "Landroidx/compose/foundation/l2;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/l;", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/d;", "density", "", "initialZoom", "Landroidx/compose/foundation/m2$a;", "c", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/d;F)Landroidx/compose/foundation/m2$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(28)
/* loaded from: classes.dex */
public final class m2 implements l2 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final m2 f6601b = new m2();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6603d = 0;

    /* compiled from: PlatformMagnifier.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/m2$a;", "Landroidx/compose/foundation/k2;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Lkotlin/k2;", "e", "()V", "Li0/f;", "sourceCenter", "magnifierCenter", "", "zoom", "d", "(JJF)V", "dismiss", "a", "Landroid/widget/Magnifier;", "()Landroid/widget/Magnifier;", "Landroidx/compose/ui/unit/u;", "c", "()J", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @androidx.annotation.x0(28)
    public static class a implements k2 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6604b = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Magnifier magnifier;

        public a(@fg.l Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.k2
        public long c() {
            return androidx.compose.ui.unit.v.a(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.k2
        public void d(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(i0.f.p(sourceCenter), i0.f.r(sourceCenter));
        }

        @Override // androidx.compose.foundation.k2
        public void dismiss() {
            this.magnifier.dismiss();
        }

        @Override // androidx.compose.foundation.k2
        public void e() {
            this.magnifier.update();
        }
    }

    private m2() {
    }

    @Override // androidx.compose.foundation.l2
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.l2
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@fg.l View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @fg.l androidx.compose.ui.unit.d density, float initialZoom) {
        return new a(new Magnifier(view));
    }
}

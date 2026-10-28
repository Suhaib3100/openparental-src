package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.m2;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/n2;", "Landroidx/compose/foundation/l2;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/l;", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/d;", "density", "", "initialZoom", "Landroidx/compose/foundation/n2$a;", "c", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/d;F)Landroidx/compose/foundation/n2$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@androidx.annotation.x0(29)
@kotlin.jvm.internal.r1({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,202:1\n152#2:203\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n163#1:203\n*E\n"})
/* loaded from: classes.dex */
public final class n2 implements l2 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final n2 f6611b = new n2();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = true;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6613d = 0;

    /* compiled from: PlatformMagnifier.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/n2$a;", "Landroidx/compose/foundation/m2$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Li0/f;", "sourceCenter", "magnifierCenter", "", "zoom", "Lkotlin/k2;", "d", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @androidx.annotation.x0(29)
    public static final class a extends m2.a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f6614c = 0;

        public a(@fg.l Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.m2.a, androidx.compose.foundation.k2
        public void d(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (i0.g.d(magnifierCenter)) {
                getMagnifier().show(i0.f.p(sourceCenter), i0.f.r(sourceCenter), i0.f.p(magnifierCenter), i0.f.r(magnifierCenter));
            } else {
                getMagnifier().show(i0.f.p(sourceCenter), i0.f.r(sourceCenter));
            }
        }
    }

    private n2() {
    }

    @Override // androidx.compose.foundation.l2
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.l2
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@fg.l View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @fg.l androidx.compose.ui.unit.d density, float initialZoom) {
        if (useTextDefault) {
            return new a(new Magnifier(view));
        }
        long d02 = density.d0(size);
        float v5 = density.v5(cornerRadius);
        float v52 = density.v5(elevation);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        i0.n.INSTANCE.getClass();
        if (d02 != i0.n.f74172d) {
            builder.setSize(kotlin.math.b.L0(i0.n.t(d02)), kotlin.math.b.L0(i0.n.m(d02)));
        }
        if (!Float.isNaN(v5)) {
            builder.setCornerRadius(v5);
        }
        if (!Float.isNaN(v52)) {
            builder.setElevation(v52);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(clippingEnabled);
        return new a(builder.build());
    }
}

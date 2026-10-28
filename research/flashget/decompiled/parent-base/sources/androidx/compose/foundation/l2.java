package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@x4
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011JR\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/l2;", "", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/l;", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/d;", "density", "", "initialZoom", "Landroidx/compose/foundation/k2;", "a", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/d;F)Landroidx/compose/foundation/k2;", "b", "()Z", "canUpdateZoom", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f4784a;

    /* compiled from: PlatformMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/l2$a;", "", "<init>", "()V", "Landroidx/compose/foundation/l2;", "a", "()Landroidx/compose/foundation/l2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.l2$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4784a = new Companion();

        private Companion() {
        }

        @x4
        @fg.l
        public final l2 a() {
            if (u1.c(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? m2.f6601b : n2.f6611b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @fg.l
    k2 a(@fg.l View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @fg.l androidx.compose.ui.unit.d density, float initialZoom);

    boolean b();
}

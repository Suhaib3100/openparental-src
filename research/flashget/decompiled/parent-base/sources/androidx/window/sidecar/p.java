package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.b;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.sidecar.q;
import androidx.window.sidecar.r;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/p;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/window/core/b;", "bounds", "", "c", "(Landroid/app/Activity;Landroidx/window/core/b;)Z", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/q;", "a", "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/q;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/b0;", "b", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/b0;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final p f35820a = new p();

    private p() {
    }

    private final boolean c(Activity activity, b bounds) {
        Rect a5 = g0.f35808b.c(activity).a();
        if (bounds.h()) {
            return false;
        }
        if (bounds.f() != a5.width() && bounds.b() != a5.height()) {
            return false;
        }
        if (bounds.f() >= a5.width() || bounds.b() >= a5.height()) {
            return (bounds.f() == a5.width() && bounds.b() == a5.height()) ? false : true;
        }
        return false;
    }

    @m
    public final q a(@l Activity activity, @l FoldingFeature oemFeature) {
        r.b a5;
        q.c cVar;
        l0.p(activity, "activity");
        l0.p(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            a5 = r.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            a5 = r.b.INSTANCE.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            cVar = q.c.f35830c;
        } else {
            if (state != 2) {
                return null;
            }
            cVar = q.c.f35831d;
        }
        Rect bounds = oemFeature.getBounds();
        l0.o(bounds, "oemFeature.bounds");
        if (!c(activity, new b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        l0.o(bounds2, "oemFeature.bounds");
        return new r(new b(bounds2), a5, cVar);
    }

    @l
    public final b0 b(@l Activity activity, @l WindowLayoutInfo info) {
        q qVar;
        l0.p(activity, "activity");
        l0.p(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        l0.o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                p pVar = f35820a;
                l0.o(feature, "feature");
                qVar = pVar.a(activity, feature);
            } else {
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return new b0(arrayList);
    }
}

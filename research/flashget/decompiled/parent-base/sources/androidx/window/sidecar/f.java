package androidx.window.sidecar;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.x0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DisplayCompatHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/f;", "", "<init>", "()V", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "Lkotlin/k2;", "a", "(Landroid/view/Display;Landroid/graphics/Point;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@x0(17)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final f f35807a = new f();

    private f() {
    }

    public final void a(@l Display display, @l Point point) {
        l0.p(display, "display");
        l0.p(point, "point");
        display.getRealSize(point);
    }
}

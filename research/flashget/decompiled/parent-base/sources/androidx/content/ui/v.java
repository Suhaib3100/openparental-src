package androidx.content.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.appcompat.widget.Toolbar;
import androidx.content.f0;
import androidx.content.u;
import androidx.transition.x;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ToolbarOnDestinationChangedListener.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/navigation/ui/v;", "Landroidx/navigation/ui/a;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/d;", "configuration", "<init>", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/d;)V", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "", "title", "d", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "c", "(Landroid/graphics/drawable/Drawable;I)V", "Ljava/lang/ref/WeakReference;", "f", "Ljava/lang/ref/WeakReference;", "toolbarWeakReference", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v extends a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeakReference<Toolbar> toolbarWeakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(@fg.l androidx.appcompat.widget.Toolbar r3, @fg.l androidx.content.ui.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.l0.p(r4, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "toolbar.context"
            kotlin.jvm.internal.l0.o(r0, r1)
            r2.<init>(r0, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.toolbarWeakReference = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.ui.v.<init>(androidx.appcompat.widget.Toolbar, androidx.navigation.ui.d):void");
    }

    @Override // androidx.content.ui.a, androidx.navigation.u.c
    public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
        l0.p(controller, "controller");
        l0.p(destination, "destination");
        if (this.toolbarWeakReference.get() == null) {
            controller.H0(this);
        } else {
            super.a(controller, destination, arguments);
        }
    }

    @Override // androidx.content.ui.a
    protected void c(@m Drawable icon, @g1 int contentDescription) {
        Toolbar toolbar = this.toolbarWeakReference.get();
        if (toolbar == null) {
            return;
        }
        boolean z4 = icon == null && toolbar.N() != null;
        toolbar.L0(icon);
        toolbar.I0(contentDescription);
        if (z4) {
            x.a(toolbar);
        }
    }

    @Override // androidx.content.ui.a
    protected void d(@m CharSequence title) {
        Toolbar toolbar = this.toolbarWeakReference.get();
        if (toolbar == null) {
            return;
        }
        toolbar.W0(title);
    }
}

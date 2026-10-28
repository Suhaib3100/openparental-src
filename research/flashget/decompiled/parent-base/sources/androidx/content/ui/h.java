package androidx.content.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.appcompat.widget.Toolbar;
import androidx.content.f0;
import androidx.content.u;
import androidx.transition.x;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CollapsingToolbarOnDestinationChangedListener.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/navigation/ui/h;", "Landroidx/navigation/ui/a;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/d;", "configuration", "<init>", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/d;)V", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "", "title", "d", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "c", "(Landroid/graphics/drawable/Drawable;I)V", "Ljava/lang/ref/WeakReference;", "f", "Ljava/lang/ref/WeakReference;", "mCollapsingToolbarLayoutWeakReference", "g", "mToolbarWeakReference", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeakReference<CollapsingToolbarLayout> mCollapsingToolbarLayoutWeakReference;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeakReference<Toolbar> mToolbarWeakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@fg.l com.google.android.material.appbar.CollapsingToolbarLayout r3, @fg.l androidx.appcompat.widget.Toolbar r4, @fg.l androidx.content.ui.d r5) {
        /*
            r2 = this;
            java.lang.String r0 = "collapsingToolbarLayout"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.l0.p(r5, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "collapsingToolbarLayout.context"
            kotlin.jvm.internal.l0.o(r0, r1)
            r2.<init>(r0, r5)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.mCollapsingToolbarLayoutWeakReference = r5
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r2.mToolbarWeakReference = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.ui.h.<init>(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.ui.d):void");
    }

    @Override // androidx.content.ui.a, androidx.navigation.u.c
    public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
        l0.p(controller, "controller");
        l0.p(destination, "destination");
        CollapsingToolbarLayout collapsingToolbarLayout = this.mCollapsingToolbarLayoutWeakReference.get();
        Toolbar toolbar = this.mToolbarWeakReference.get();
        if (collapsingToolbarLayout == null || toolbar == null) {
            controller.H0(this);
        } else {
            super.a(controller, destination, arguments);
        }
    }

    @Override // androidx.content.ui.a
    protected void c(@m Drawable icon, @g1 int contentDescription) {
        Toolbar toolbar = this.mToolbarWeakReference.get();
        if (toolbar != null) {
            boolean z4 = icon == null && toolbar.N() != null;
            toolbar.L0(icon);
            toolbar.I0(contentDescription);
            if (z4) {
                x.a(toolbar);
            }
        }
    }

    @Override // androidx.content.ui.a
    protected void d(@m CharSequence title) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.mCollapsingToolbarLayoutWeakReference.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.t0(title);
        }
    }
}

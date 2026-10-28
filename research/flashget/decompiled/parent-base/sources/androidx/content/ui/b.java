package androidx.content.ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.a;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: ActionBarOnDestinationChangedListener.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/navigation/ui/b;", "Landroidx/navigation/ui/a;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/navigation/ui/d;", "configuration", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/d;)V", "", "title", "Lkotlin/k2;", "d", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "c", "(Landroid/graphics/drawable/Drawable;I)V", "f", "Landroidx/appcompat/app/AppCompatActivity;", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@fg.l androidx.appcompat.app.AppCompatActivity r3, @fg.l androidx.content.ui.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.l0.p(r4, r0)
            androidx.appcompat.app.a$b r0 = r3.getDrawerToggleDelegate()
            if (r0 == 0) goto L1f
            android.content.Context r0 = r0.d()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            kotlin.jvm.internal.l0.o(r0, r1)
            r2.<init>(r0, r4)
            r2.activity = r3
            return
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Activity "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.ui.b.<init>(androidx.appcompat.app.AppCompatActivity, androidx.navigation.ui.d):void");
    }

    @Override // androidx.content.ui.a
    protected void c(@m Drawable icon, @g1 int contentDescription) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.Y(icon != null);
        a.b drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            drawerToggleDelegate.a(icon, contentDescription);
            return;
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an DrawerToggleDelegate set").toString());
    }

    @Override // androidx.content.ui.a
    protected void d(@m CharSequence title) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0(title);
            return;
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}

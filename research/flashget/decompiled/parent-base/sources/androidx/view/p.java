package androidx.view;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.m1;
import androidx.view.k0;
import fg.l;
import fg.m;
import kd.i;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: EdgeToEdge.kt */
@i(name = "EdgeToEdge")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0012\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/k0;", "statusBarStyle", "navigationBarStyle", "Lkotlin/k2;", "c", "(Landroidx/activity/ComponentActivity;Landroidx/activity/k0;Landroidx/activity/k0;)V", "", "a", "I", "g", "()I", "h", "()V", "DefaultLightScrim", "b", "e", "f", "DefaultDarkScrim", "Landroidx/activity/x;", "Landroidx/activity/x;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f572a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    private static final int f573b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    @m
    private static x f574c;

    @j
    @i(name = "enable")
    public static final void a(@l ComponentActivity componentActivity) {
        l0.p(componentActivity, "<this>");
        d(componentActivity, null, null, 3, null);
    }

    @j
    @i(name = "enable")
    public static final void b(@l ComponentActivity componentActivity, @l k0 statusBarStyle) {
        l0.p(componentActivity, "<this>");
        l0.p(statusBarStyle, "statusBarStyle");
        d(componentActivity, statusBarStyle, null, 2, null);
    }

    @j
    @i(name = "enable")
    public static final void c(@l ComponentActivity componentActivity, @l k0 statusBarStyle, @l k0 navigationBarStyle) {
        l0.p(componentActivity, "<this>");
        l0.p(statusBarStyle, "statusBarStyle");
        l0.p(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        ld.l<Resources, Boolean> e4 = statusBarStyle.e();
        Resources resources = decorView.getResources();
        l0.o(resources, "view.resources");
        boolean booleanValue = e4.invoke(resources).booleanValue();
        ld.l<Resources, Boolean> e5 = navigationBarStyle.e();
        Resources resources2 = decorView.getResources();
        l0.o(resources2, "view.resources");
        boolean booleanValue2 = e5.invoke(resources2).booleanValue();
        x xVar = f574c;
        if (xVar == null) {
            int i4 = Build.VERSION.SDK_INT;
            xVar = i4 >= 29 ? new v() : i4 >= 26 ? new s() : new r();
        }
        x xVar2 = xVar;
        Window window = componentActivity.getWindow();
        l0.o(window, "window");
        xVar2.a(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
    }

    public static /* synthetic */ void d(ComponentActivity componentActivity, k0 k0Var, k0 k0Var2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k0Var = k0.Companion.c(k0.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i4 & 2) != 0) {
            k0Var2 = k0.Companion.c(k0.INSTANCE, f572a, f573b, null, 4, null);
        }
        c(componentActivity, k0Var, k0Var2);
    }

    public static final int e() {
        return f573b;
    }

    @m1
    public static /* synthetic */ void f() {
    }

    public static final int g() {
        return f572a;
    }

    @m1
    public static /* synthetic */ void h() {
    }
}

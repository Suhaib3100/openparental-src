package android.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.a0;
import android.view.c0;
import android.view.j1;
import android.view.t;
import androidx.annotation.h1;
import androidx.annotation.i;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p3.j;

/* compiled from: ComponentDialog.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0003\u0010$\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015J\b\u0010\u000b\u001a\u00020\u0004H\u0015J\b\u0010\f\u001a\u00020\u0004H\u0015J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Landroidx/activity/f;", "Landroid/app/Dialog;", "Landroidx/lifecycle/a0;", "Landroidx/activity/h;", "Lkotlin/m2;", "c", "Landroidx/lifecycle/t;", "getLifecycle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "g", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/c0;", "o", "Landroidx/lifecycle/c0;", "_lifecycleRegistry", "p", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "b", "()Landroidx/lifecycle/c0;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class f extends Dialog implements a0, h {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @e
    private c0 _lifecycleRegistry;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public f(@d Context context) {
        this(context, 0, 2, null);
        l0.p(context, "context");
    }

    private final c0 b() {
        c0 c0Var = this._lifecycleRegistry;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this);
        this._lifecycleRegistry = c0Var2;
        return c0Var2;
    }

    private final void c() {
        Window window = getWindow();
        l0.m(window);
        j1.b(window.getDecorView(), this);
        Window window2 = getWindow();
        l0.m(window2);
        View decorView = window2.getDecorView();
        l0.o(decorView, "window!!.decorView");
        View.b(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(f this$0) {
        l0.p(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@d View view, @e ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // android.view.h
    @d
    /* renamed from: g, reason: from getter */
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.view.a0
    @d
    public final t getLifecycle() {
        return b();
    }

    @Override // android.app.Dialog
    @i
    public void onBackPressed() {
        this.onBackPressedDispatcher.e();
    }

    @Override // android.app.Dialog
    @i
    protected void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        b().j(t.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    @i
    protected void onStart() {
        super.onStart();
        b().j(t.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    @i
    protected void onStop() {
        b().j(t.b.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        c();
        super.setContentView(i5);
    }

    public /* synthetic */ f(Context context, int i5, int i6, w wVar) {
        this(context, (i6 & 2) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public f(@d Context context, @h1 int i5) {
        super(context, i5);
        l0.p(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                f.d(f.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@d View view) {
        l0.p(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@d View view, @e ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}

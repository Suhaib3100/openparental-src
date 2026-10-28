package androidx.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.h1;
import androidx.annotation.i;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.C1459c;
import androidx.view.C1460d;
import androidx.view.C1463g;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import androidx.view.g0;
import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ComponentDialog.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010/\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0013\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/activity/o;", "Landroid/app/Dialog;", "Landroidx/lifecycle/e0;", "Landroidx/activity/f0;", "Landroidx/savedstate/e;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "h", "Landroidx/lifecycle/g0;", "b", "Landroidx/lifecycle/g0;", "_lifecycleRegistry", "Landroidx/savedstate/d;", "c", "Landroidx/savedstate/d;", "savedStateRegistryController", "Landroidx/activity/OnBackPressedDispatcher;", "d", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "g", "onBackPressedDispatcher", "f", "()Landroidx/lifecycle/g0;", "lifecycleRegistry", "Landroidx/savedstate/c;", "getSavedStateRegistry", "()Landroidx/savedstate/c;", "savedStateRegistry", "Landroidx/lifecycle/w;", "getLifecycle", "()Landroidx/lifecycle/w;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class o extends Dialog implements InterfaceC1423e0, f0, InterfaceC1461e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private g0 _lifecycleRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1460d savedStateRegistryController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public o(@l Context context) {
        this(context, 0, 2, null);
        l0.p(context, "context");
    }

    private final g0 f() {
        g0 g0Var = this._lifecycleRegistry;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this);
        this._lifecycleRegistry = g0Var2;
        return g0Var2;
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(o this$0) {
        l0.p(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@l View view, @m ViewGroup.LayoutParams params) {
        l0.p(view, "view");
        h();
        super.addContentView(view, params);
    }

    @Override // androidx.view.InterfaceC1423e0
    @l
    public AbstractC1450w getLifecycle() {
        return f();
    }

    @Override // androidx.view.f0
    @l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // androidx.view.InterfaceC1461e
    @l
    public C1459c getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @i
    public void h() {
        Window window = getWindow();
        l0.m(window);
        View decorView = window.getDecorView();
        l0.o(decorView, "window!!.decorView");
        C1442q1.b(decorView, this);
        Window window2 = getWindow();
        l0.m(window2);
        View decorView2 = window2.getDecorView();
        l0.o(decorView2, "window!!.decorView");
        C1412m0.b(decorView2, this);
        Window window3 = getWindow();
        l0.m(window3);
        View decorView3 = window3.getDecorView();
        l0.o(decorView3, "window!!.decorView");
        C1463g.b(decorView3, this);
    }

    @Override // android.app.Dialog
    @i
    public void onBackPressed() {
        this.onBackPressedDispatcher.p();
    }

    @Override // android.app.Dialog
    @i
    protected void onCreate(@m Bundle savedInstanceState) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            l0.o(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.s(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        f().l(AbstractC1450w.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @l
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        l0.o(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    @i
    protected void onStart() {
        super.onStart();
        f().l(AbstractC1450w.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    @i
    protected void onStop() {
        f().l(AbstractC1450w.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        h();
        super.setContentView(layoutResID);
    }

    public /* synthetic */ o(Context context, int i4, int i5, w wVar) {
        this(context, (i5 & 2) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public o(@l Context context, @h1 int i4) {
        super(context, i4);
        l0.p(context, "context");
        this.savedStateRegistryController = C1460d.INSTANCE.a(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.n
            @Override // java.lang.Runnable
            public final void run() {
                o.i(o.this);
            }
        }, null);
    }

    @Override // android.app.Dialog
    public void setContentView(@l View view) {
        l0.p(view, "view");
        h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@l View view, @m ViewGroup.LayoutParams params) {
        l0.p(view, "view");
        h();
        super.setContentView(view, params);
    }
}

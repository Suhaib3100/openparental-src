package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.b;
import androidx.core.view.i0;
import d.a;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class r extends androidx.view.o implements d {

    /* renamed from: e, reason: collision with root package name */
    private g f939e;

    /* renamed from: f, reason: collision with root package name */
    private final i0.a f940f;

    public r(@o0 Context context) {
        this(context, 0);
    }

    private static int l(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.Z0, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.view.o, android.app.Dialog
    public void addContentView(@o0 View view, ViewGroup.LayoutParams layoutParams) {
        j().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        j().N();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return i0.e(this.f940f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @q0
    public <T extends View> T findViewById(@androidx.annotation.d0 int i4) {
        return (T) j().s(i4);
    }

    @Override // android.app.Dialog
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        j().F();
    }

    @o0
    public g j() {
        if (this.f939e == null) {
            this.f939e = g.o(this, this);
        }
        return this.f939e;
    }

    public ActionBar k() {
        return j().C();
    }

    boolean m(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean n(int i4) {
        return j().V(i4);
    }

    @Override // androidx.view.o, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        j().E();
        super.onCreate(bundle);
        j().M(bundle);
    }

    @Override // androidx.view.o, android.app.Dialog
    protected void onStop() {
        super.onStop();
        j().S();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    @q0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.view.o, android.app.Dialog
    public void setContentView(@j0 int i4) {
        j().Z(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        j().j0(charSequence);
    }

    public r(@o0 Context context, int i4) {
        super(context, l(context, i4));
        this.f940f = new i0.a() { // from class: androidx.appcompat.app.q
            @Override // androidx.core.view.i0.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return r.this.m(keyEvent);
            }
        };
        g j4 = j();
        j4.i0(l(context, i4));
        j4.M(null);
    }

    @Override // androidx.view.o, android.app.Dialog
    public void setContentView(@o0 View view) {
        j().a0(view);
    }

    @Override // androidx.view.o, android.app.Dialog
    public void setContentView(@o0 View view, ViewGroup.LayoutParams layoutParams) {
        j().b0(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        j().j0(getContext().getString(i4));
    }

    protected r(@o0 Context context, boolean z4, @q0 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f940f = new i0.a() { // from class: androidx.appcompat.app.q
            @Override // androidx.core.view.i0.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return r.this.m(keyEvent);
            }
        };
        setCancelable(z4);
        setOnCancelListener(onCancelListener);
    }
}

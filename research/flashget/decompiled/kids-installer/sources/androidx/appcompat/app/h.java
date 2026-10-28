package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.j0;
import androidx.annotation.q0;
import androidx.appcompat.view.b;
import androidx.core.view.f0;
import d.a;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes2.dex */
public class h extends Dialog implements d {

    /* renamed from: o, reason: collision with root package name */
    private e f362o;

    /* renamed from: p, reason: collision with root package name */
    private final f0.a f363p;

    /* compiled from: AppCompatDialog.java */
    class a implements f0.a {
        a() {
        }

        @Override // androidx.core.view.f0.a
        public boolean x(KeyEvent keyEvent) {
            return h.this.d(keyEvent);
        }
    }

    public h(Context context) {
        this(context, 0);
    }

    private static int c(Context context, int i5) {
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.X0, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f362o == null) {
            this.f362o = e.j(this, this);
        }
        return this.f362o;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public ActionBar b() {
        return a().s();
    }

    boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f0.e(this.f363p, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i5) {
        return a().I(i5);
    }

    @Override // android.app.Dialog
    @q0
    public <T extends View> T findViewById(@d0 int i5) {
        return (T) a().n(i5);
    }

    @Override // androidx.appcompat.app.d
    public void i(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        a().v();
    }

    @Override // androidx.appcompat.app.d
    public void l(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().u();
        super.onCreate(bundle);
        a().z(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().F();
    }

    @Override // android.app.Dialog
    public void setContentView(@j0 int i5) {
        a().K(i5);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().S(charSequence);
    }

    @Override // androidx.appcompat.app.d
    @q0
    public androidx.appcompat.view.b v(b.a aVar) {
        return null;
    }

    public h(Context context, int i5) {
        super(context, c(context, i5));
        this.f363p = new a();
        e a6 = a();
        a6.R(c(context, i5));
        a6.z(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().L(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().M(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i5) {
        super.setTitle(i5);
        a().S(getContext().getString(i5));
    }

    protected h(Context context, boolean z5, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z5, onCancelListener);
        this.f363p = new a();
    }
}

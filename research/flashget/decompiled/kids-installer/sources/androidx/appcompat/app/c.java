package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.app.AlertController;
import d.a;

/* compiled from: AlertDialog.java */
/* loaded from: classes3.dex */
public class c extends h implements DialogInterface {

    /* renamed from: r, reason: collision with root package name */
    static final int f345r = 0;

    /* renamed from: s, reason: collision with root package name */
    static final int f346s = 1;

    /* renamed from: q, reason: collision with root package name */
    final AlertController f347q;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f348a;

        /* renamed from: b, reason: collision with root package name */
        private final int f349b;

        public a(@o0 Context context) {
            this(context, c.h(context, 0));
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f348a.f228u = onKeyListener;
            return this;
        }

        public a B(@g1 int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f216i = fVar.f208a.getText(i5);
            this.f348a.f218k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f216i = charSequence;
            fVar.f218k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f348a.f217j = drawable;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a E(boolean z5) {
            this.f348a.Q = z5;
            return this;
        }

        public a F(@androidx.annotation.e int i5, int i6, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = fVar.f208a.getResources().getTextArray(i5);
            AlertController.f fVar2 = this.f348a;
            fVar2.f231x = onClickListener;
            fVar2.I = i6;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int i5, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.K = cursor;
            fVar.f231x = onClickListener;
            fVar.I = i5;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f230w = listAdapter;
            fVar.f231x = onClickListener;
            fVar.I = i5;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = charSequenceArr;
            fVar.f231x = onClickListener;
            fVar.I = i5;
            fVar.H = true;
            return this;
        }

        public a J(@g1 int i5) {
            AlertController.f fVar = this.f348a;
            fVar.f213f = fVar.f208a.getText(i5);
            return this;
        }

        public a K(@q0 CharSequence charSequence) {
            this.f348a.f213f = charSequence;
            return this;
        }

        public a L(int i5) {
            AlertController.f fVar = this.f348a;
            fVar.f233z = null;
            fVar.f232y = i5;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f348a;
            fVar.f233z = view;
            fVar.f232y = 0;
            fVar.E = false;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int i5, int i6, int i7, int i8) {
            AlertController.f fVar = this.f348a;
            fVar.f233z = view;
            fVar.f232y = 0;
            fVar.E = true;
            fVar.A = i5;
            fVar.B = i6;
            fVar.C = i7;
            fVar.D = i8;
            return this;
        }

        public c O() {
            c a6 = a();
            a6.show();
            return a6;
        }

        @o0
        public c a() {
            c cVar = new c(this.f348a.f208a, this.f349b);
            this.f348a.a(cVar.f347q);
            cVar.setCancelable(this.f348a.f225r);
            if (this.f348a.f225r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f348a.f226s);
            cVar.setOnDismissListener(this.f348a.f227t);
            DialogInterface.OnKeyListener onKeyListener = this.f348a.f228u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        @o0
        public Context b() {
            return this.f348a.f208a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f230w = listAdapter;
            fVar.f231x = onClickListener;
            return this;
        }

        public a d(boolean z5) {
            this.f348a.f225r = z5;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f348a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f231x = onClickListener;
            return this;
        }

        public a f(@q0 View view) {
            this.f348a.f214g = view;
            return this;
        }

        public a g(@v int i5) {
            this.f348a.f210c = i5;
            return this;
        }

        public a h(@q0 Drawable drawable) {
            this.f348a.f211d = drawable;
            return this;
        }

        public a i(@androidx.annotation.f int i5) {
            TypedValue typedValue = new TypedValue();
            this.f348a.f208a.getTheme().resolveAttribute(i5, typedValue, true);
            this.f348a.f210c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z5) {
            this.f348a.N = z5;
            return this;
        }

        public a k(@androidx.annotation.e int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = fVar.f208a.getResources().getTextArray(i5);
            this.f348a.f231x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = charSequenceArr;
            fVar.f231x = onClickListener;
            return this;
        }

        public a m(@g1 int i5) {
            AlertController.f fVar = this.f348a;
            fVar.f215h = fVar.f208a.getText(i5);
            return this;
        }

        public a n(@q0 CharSequence charSequence) {
            this.f348a.f215h = charSequence;
            return this;
        }

        public a o(@androidx.annotation.e int i5, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = fVar.f208a.getResources().getTextArray(i5);
            AlertController.f fVar2 = this.f348a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f229v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@g1 int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f219l = fVar.f208a.getText(i5);
            this.f348a.f221n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f219l = charSequence;
            fVar.f221n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f348a.f220m = drawable;
            return this;
        }

        public a u(@g1 int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f222o = fVar.f208a.getText(i5);
            this.f348a.f224q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f348a;
            fVar.f222o = charSequence;
            fVar.f224q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f348a.f223p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f348a.f226s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f348a.f227t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f348a.O = onItemSelectedListener;
            return this;
        }

        public a(@o0 Context context, @h1 int i5) {
            this.f348a = new AlertController.f(new ContextThemeWrapper(context, c.h(context, i5)));
            this.f349b = i5;
        }
    }

    protected c(@o0 Context context) {
        this(context, 0);
    }

    static int h(@o0 Context context, @h1 int i5) {
        if (((i5 >>> 24) & 255) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i5) {
        return this.f347q.c(i5);
    }

    public ListView g() {
        return this.f347q.e();
    }

    public void j(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f347q.l(i5, charSequence, onClickListener, null, null);
    }

    public void k(int i5, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f347q.l(i5, charSequence, onClickListener, null, drawable);
    }

    public void m(int i5, CharSequence charSequence, Message message) {
        this.f347q.l(i5, charSequence, null, message, null);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    void n(int i5) {
        this.f347q.m(i5);
    }

    public void o(View view) {
        this.f347q.n(view);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f347q.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (this.f347q.h(i5, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (this.f347q.i(i5, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i5, keyEvent);
    }

    public void p(int i5) {
        this.f347q.o(i5);
    }

    public void q(Drawable drawable) {
        this.f347q.p(drawable);
    }

    public void r(int i5) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i5, typedValue, true);
        this.f347q.o(typedValue.resourceId);
    }

    public void s(CharSequence charSequence) {
        this.f347q.q(charSequence);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f347q.s(charSequence);
    }

    public void t(View view) {
        this.f347q.u(view);
    }

    public void u(View view, int i5, int i6, int i7, int i8) {
        this.f347q.v(view, i5, i6, i7, i8);
    }

    protected c(@o0 Context context, @h1 int i5) {
        super(context, h(context, i5));
        this.f347q = new AlertController(getContext(), this, getWindow());
    }

    protected c(@o0 Context context, boolean z5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z5);
        setOnCancelListener(onCancelListener);
    }
}

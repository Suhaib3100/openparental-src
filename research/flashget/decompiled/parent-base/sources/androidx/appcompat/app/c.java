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
import androidx.appcompat.app.AlertController;
import d.a;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class c extends r implements DialogInterface {

    /* renamed from: h, reason: collision with root package name */
    static final int f852h = 0;

    /* renamed from: i, reason: collision with root package name */
    static final int f853i = 1;

    /* renamed from: g, reason: collision with root package name */
    final AlertController f854g;

    /* compiled from: AlertDialog.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f855a;

        /* renamed from: b, reason: collision with root package name */
        private final int f856b;

        public a(@o0 Context context) {
            this(context, c.q(context, 0));
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f855a.f721u = onKeyListener;
            return this;
        }

        public a B(@g1 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f709i = fVar.f701a.getText(i4);
            this.f855a.f711k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f709i = charSequence;
            fVar.f711k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f855a.f710j = drawable;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a E(boolean z4) {
            this.f855a.Q = z4;
            return this;
        }

        public a F(@androidx.annotation.e int i4, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = fVar.f701a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f855a;
            fVar2.f724x = onClickListener;
            fVar2.I = i5;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int i4, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.K = cursor;
            fVar.f724x = onClickListener;
            fVar.I = i4;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f723w = listAdapter;
            fVar.f724x = onClickListener;
            fVar.I = i4;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = charSequenceArr;
            fVar.f724x = onClickListener;
            fVar.I = i4;
            fVar.H = true;
            return this;
        }

        public a J(@g1 int i4) {
            AlertController.f fVar = this.f855a;
            fVar.f706f = fVar.f701a.getText(i4);
            return this;
        }

        public a K(@q0 CharSequence charSequence) {
            this.f855a.f706f = charSequence;
            return this;
        }

        public a L(int i4) {
            AlertController.f fVar = this.f855a;
            fVar.f726z = null;
            fVar.f725y = i4;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f855a;
            fVar.f726z = view;
            fVar.f725y = 0;
            fVar.E = false;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int i4, int i5, int i6, int i7) {
            AlertController.f fVar = this.f855a;
            fVar.f726z = view;
            fVar.f725y = 0;
            fVar.E = true;
            fVar.A = i4;
            fVar.B = i5;
            fVar.C = i6;
            fVar.D = i7;
            return this;
        }

        public c O() {
            c a5 = a();
            a5.show();
            return a5;
        }

        @o0
        public c a() {
            c cVar = new c(this.f855a.f701a, this.f856b);
            this.f855a.a(cVar.f854g);
            cVar.setCancelable(this.f855a.f718r);
            if (this.f855a.f718r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f855a.f719s);
            cVar.setOnDismissListener(this.f855a.f720t);
            DialogInterface.OnKeyListener onKeyListener = this.f855a.f721u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        @o0
        public Context b() {
            return this.f855a.f701a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f723w = listAdapter;
            fVar.f724x = onClickListener;
            return this;
        }

        public a d(boolean z4) {
            this.f855a.f718r = z4;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f855a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f724x = onClickListener;
            return this;
        }

        public a f(@q0 View view) {
            this.f855a.f707g = view;
            return this;
        }

        public a g(@androidx.annotation.v int i4) {
            this.f855a.f703c = i4;
            return this;
        }

        public a h(@q0 Drawable drawable) {
            this.f855a.f704d = drawable;
            return this;
        }

        public a i(@androidx.annotation.f int i4) {
            TypedValue typedValue = new TypedValue();
            this.f855a.f701a.getTheme().resolveAttribute(i4, typedValue, true);
            this.f855a.f703c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z4) {
            this.f855a.N = z4;
            return this;
        }

        public a k(@androidx.annotation.e int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = fVar.f701a.getResources().getTextArray(i4);
            this.f855a.f724x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = charSequenceArr;
            fVar.f724x = onClickListener;
            return this;
        }

        public a m(@g1 int i4) {
            AlertController.f fVar = this.f855a;
            fVar.f708h = fVar.f701a.getText(i4);
            return this;
        }

        public a n(@q0 CharSequence charSequence) {
            this.f855a.f708h = charSequence;
            return this;
        }

        public a o(@androidx.annotation.e int i4, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = fVar.f701a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f855a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f722v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@g1 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f712l = fVar.f701a.getText(i4);
            this.f855a.f714n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f712l = charSequence;
            fVar.f714n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f855a.f713m = drawable;
            return this;
        }

        public a u(@g1 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f715o = fVar.f701a.getText(i4);
            this.f855a.f717q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f855a;
            fVar.f715o = charSequence;
            fVar.f717q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f855a.f716p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f855a.f719s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f855a.f720t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f855a.O = onItemSelectedListener;
            return this;
        }

        public a(@o0 Context context, @h1 int i4) {
            this.f855a = new AlertController.f(new ContextThemeWrapper(context, c.q(context, i4)));
            this.f856b = i4;
        }
    }

    protected c(@o0 Context context) {
        this(context, 0);
    }

    static int q(@o0 Context context, @h1 int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public void A(View view) {
        this.f854g.u(view);
    }

    public void B(View view, int i4, int i5, int i6, int i7) {
        this.f854g.v(view, i4, i5, i6, i7);
    }

    public Button o(int i4) {
        return this.f854g.c(i4);
    }

    @Override // androidx.appcompat.app.r, androidx.view.o, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f854g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f854g.h(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f854g.i(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    public ListView p() {
        return this.f854g.e();
    }

    public void r(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f854g.l(i4, charSequence, onClickListener, null, null);
    }

    public void s(int i4, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f854g.l(i4, charSequence, onClickListener, null, drawable);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f854g.s(charSequence);
    }

    public void t(int i4, CharSequence charSequence, Message message) {
        this.f854g.l(i4, charSequence, null, message, null);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    void u(int i4) {
        this.f854g.m(i4);
    }

    public void v(View view) {
        this.f854g.n(view);
    }

    public void w(int i4) {
        this.f854g.o(i4);
    }

    public void x(Drawable drawable) {
        this.f854g.p(drawable);
    }

    public void y(int i4) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i4, typedValue, true);
        this.f854g.o(typedValue.resourceId);
    }

    public void z(CharSequence charSequence) {
        this.f854g.q(charSequence);
    }

    protected c(@o0 Context context, @h1 int i4) {
        super(context, q(context, i4));
        this.f854g = new AlertController(getContext(), this, getWindow());
    }

    protected c(@o0 Context context, boolean z4, @q0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z4);
        setOnCancelListener(onCancelListener);
    }
}

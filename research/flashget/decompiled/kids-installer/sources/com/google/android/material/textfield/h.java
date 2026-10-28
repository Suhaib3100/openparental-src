package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.o0;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import n1.a;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes3.dex */
class h extends e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f14532d;

    /* renamed from: e, reason: collision with root package name */
    private final TextInputLayout.h f14533e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.i f14534f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class a extends m {
        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            h.this.f14500c.setChecked(!r1.g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class b implements TextInputLayout.h {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@o0 TextInputLayout textInputLayout) {
            EditText Z = textInputLayout.Z();
            textInputLayout.U1(true);
            textInputLayout.K1(true);
            h.this.f14500c.setChecked(!r4.g());
            Z.removeTextChangedListener(h.this.f14532d);
            Z.addTextChangedListener(h.this.f14532d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class c implements TextInputLayout.i {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ EditText f14538o;

            a(EditText editText) {
                this.f14538o = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14538o.removeTextChangedListener(h.this.f14532d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i5) {
            EditText Z = textInputLayout.Z();
            if (Z == null || i5 != 1) {
                return;
            }
            Z.setTransformationMethod(PasswordTransformationMethod.getInstance());
            Z.post(new a(Z));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText Z = h.this.f14498a.Z();
            if (Z == null) {
                return;
            }
            int selectionEnd = Z.getSelectionEnd();
            if (h.this.g()) {
                Z.setTransformationMethod(null);
            } else {
                Z.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                Z.setSelection(selectionEnd);
            }
            h.this.f14498a.g1();
        }
    }

    h(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f14532d = new a();
        this.f14533e = new b();
        this.f14534f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText Z = this.f14498a.Z();
        return Z != null && (Z.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f14498a.O1(androidx.appcompat.content.res.a.d(this.f14499b, a.g.J0));
        TextInputLayout textInputLayout = this.f14498a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.T0));
        this.f14498a.Q1(new d());
        this.f14498a.e(this.f14533e);
        this.f14498a.f(this.f14534f);
        EditText Z = this.f14498a.Z();
        if (h(Z)) {
            Z.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

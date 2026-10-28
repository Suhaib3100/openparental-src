package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.o0;
import com.google.android.material.textfield.TextInputLayout;
import s8.a;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes6.dex */
class h extends e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f54387d;

    /* renamed from: e, reason: collision with root package name */
    private final TextInputLayout.h f54388e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.i f54389f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class a extends com.google.android.material.internal.m {
        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            h.this.f54355c.setChecked(!r1.g());
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
            h.this.f54355c.setChecked(!r4.g());
            Z.removeTextChangedListener(h.this.f54387d);
            Z.addTextChangedListener(h.this.f54387d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class c implements TextInputLayout.i {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f54393b;

            a(EditText editText) {
                this.f54393b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54393b.removeTextChangedListener(h.this.f54387d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i4) {
            EditText Z = textInputLayout.Z();
            if (Z == null || i4 != 1) {
                return;
            }
            Z.setTransformationMethod(PasswordTransformationMethod.getInstance());
            Z.post(new a(Z));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText Z = h.this.f54353a.Z();
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
            h.this.f54353a.g1();
        }
    }

    h(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f54387d = new a();
        this.f54388e = new b();
        this.f54389f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText Z = this.f54353a.Z();
        return Z != null && (Z.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f54353a.O1(e.a.b(this.f54354b, a.g.J0));
        TextInputLayout textInputLayout = this.f54353a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.T0));
        this.f54353a.Q1(new d());
        this.f54353a.e(this.f54388e);
        this.f54353a.f(this.f54389f);
        EditText Z = this.f54353a.Z();
        if (h(Z)) {
            Z.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

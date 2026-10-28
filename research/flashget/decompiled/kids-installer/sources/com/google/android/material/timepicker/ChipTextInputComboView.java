package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import n1.a;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: o, reason: collision with root package name */
    private final Chip f14541o;

    /* renamed from: p, reason: collision with root package name */
    private final TextInputLayout f14542p;

    /* renamed from: q, reason: collision with root package name */
    private final EditText f14543q;

    /* renamed from: r, reason: collision with root package name */
    private TextWatcher f14544r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f14545s;

    /* loaded from: classes3.dex */
    private class b extends m {

        /* renamed from: p, reason: collision with root package name */
        private static final String f14546p = ProtectedSandApp.s("✳");

        private b() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f14541o.setText(ChipTextInputComboView.this.d(ProtectedSandApp.s("✲")));
            } else {
                ChipTextInputComboView.this.f14541o.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(@o0 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void j() {
        this.f14543q.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f14543q.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f14543q.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.f14542p;
    }

    public void f(androidx.core.view.a aVar) {
        y1.B1(this.f14541o, aVar);
    }

    public void g(boolean z5) {
        this.f14543q.setCursorVisible(z5);
    }

    public void h(CharSequence charSequence) {
        this.f14545s.setText(charSequence);
    }

    public void i(CharSequence charSequence) {
        this.f14541o.setText(d(charSequence));
        if (TextUtils.isEmpty(this.f14543q.getText())) {
            return;
        }
        this.f14543q.removeTextChangedListener(this.f14544r);
        this.f14543q.setText((CharSequence) null);
        this.f14543q.addTextChangedListener(this.f14544r);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f14541o.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        this.f14541o.setChecked(z5);
        this.f14543q.setVisibility(z5 ? 0 : 4);
        this.f14541o.setVisibility(z5 ? 8 : 0);
        if (isChecked()) {
            this.f14543q.requestFocus();
            if (TextUtils.isEmpty(this.f14543q.getText())) {
                return;
            }
            EditText editText = this.f14543q;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@q0 View.OnClickListener onClickListener) {
        this.f14541o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i5, Object obj) {
        this.f14541o.setTag(i5, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f14541o.toggle();
    }

    public ChipTextInputComboView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(a.k.f29881b0, (ViewGroup) this, false);
        this.f14541o = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a.k.f29884c0, (ViewGroup) this, false);
        this.f14542p = textInputLayout;
        EditText Z = textInputLayout.Z();
        this.f14543q = Z;
        Z.setVisibility(4);
        b bVar = new b();
        this.f14544r = bVar;
        Z.addTextChangedListener(bVar);
        j();
        addView(chip);
        addView(textInputLayout);
        this.f14545s = (TextView) findViewById(a.h.f29819w2);
        Z.setSaveEnabled(false);
    }
}

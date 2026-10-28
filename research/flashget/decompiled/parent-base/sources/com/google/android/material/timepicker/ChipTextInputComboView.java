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
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import s8.a;

/* loaded from: classes6.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    private final Chip f54396b;

    /* renamed from: c, reason: collision with root package name */
    private final TextInputLayout f54397c;

    /* renamed from: d, reason: collision with root package name */
    private final EditText f54398d;

    /* renamed from: e, reason: collision with root package name */
    private TextWatcher f54399e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f54400f;

    private class b extends m {

        /* renamed from: c, reason: collision with root package name */
        private static final String f54401c = ProtectedSandApp.s("\uf24d");

        private b() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f54396b.setText(ChipTextInputComboView.this.d(ProtectedSandApp.s("\uf24d")));
            } else {
                ChipTextInputComboView.this.f54396b.setText(ChipTextInputComboView.this.d(editable));
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
        this.f54398d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f54398d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f54398d.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.f54397c;
    }

    public void f(androidx.core.view.a aVar) {
        x1.H1(this.f54396b, aVar);
    }

    public void g(boolean z4) {
        this.f54398d.setCursorVisible(z4);
    }

    public void h(CharSequence charSequence) {
        this.f54400f.setText(charSequence);
    }

    public void i(CharSequence charSequence) {
        this.f54396b.setText(d(charSequence));
        if (TextUtils.isEmpty(this.f54398d.getText())) {
            return;
        }
        this.f54398d.removeTextChangedListener(this.f54399e);
        this.f54398d.setText((CharSequence) null);
        this.f54398d.addTextChangedListener(this.f54399e);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f54396b.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        this.f54396b.setChecked(z4);
        this.f54398d.setVisibility(z4 ? 0 : 4);
        this.f54396b.setVisibility(z4 ? 8 : 0);
        if (isChecked()) {
            this.f54398d.requestFocus();
            if (TextUtils.isEmpty(this.f54398d.getText())) {
                return;
            }
            EditText editText = this.f54398d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@q0 View.OnClickListener onClickListener) {
        this.f54396b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i4, Object obj) {
        this.f54396b.setTag(i4, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f54396b.toggle();
    }

    public ChipTextInputComboView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(a.k.f91153b0, (ViewGroup) this, false);
        this.f54396b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a.k.f91156c0, (ViewGroup) this, false);
        this.f54397c = textInputLayout;
        EditText Z = textInputLayout.Z();
        this.f54398d = Z;
        Z.setVisibility(4);
        b bVar = new b();
        this.f54399e = bVar;
        Z.addTextChangedListener(bVar);
        j();
        addView(chip);
        addView(textInputLayout);
        this.f54400f = (TextView) findViewById(a.h.f91095w2);
        Z.setSaveEnabled(false);
    }
}

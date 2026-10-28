package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes2.dex */
class h implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: o, reason: collision with root package name */
    private final ChipTextInputComboView f14638o;

    /* renamed from: p, reason: collision with root package name */
    private final ChipTextInputComboView f14639p;

    /* renamed from: q, reason: collision with root package name */
    private final TimeModel f14640q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f14641r = false;

    h(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f14638o = chipTextInputComboView;
        this.f14639p = chipTextInputComboView2;
        this.f14640q = timeModel;
    }

    private void b(int i5) {
        this.f14639p.setChecked(i5 == 12);
        this.f14638o.setChecked(i5 == 10);
        this.f14640q.f14590t = i5;
    }

    private boolean c(int i5, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i5 >= 7 && i5 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        b(12);
        return true;
    }

    private boolean d(int i5, KeyEvent keyEvent, EditText editText) {
        if (!(i5 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        b(10);
        return true;
    }

    public void a() {
        TextInputLayout e6 = this.f14638o.e();
        TextInputLayout e7 = this.f14639p.e();
        EditText Z = e6.Z();
        EditText Z2 = e7.Z();
        Z.setImeOptions(268435461);
        Z2.setImeOptions(268435462);
        Z.setOnEditorActionListener(this);
        Z.setOnKeyListener(this);
        Z2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
        boolean z5 = i5 == 5;
        if (z5) {
            b(12);
        }
        return z5;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (this.f14641r) {
            return false;
        }
        this.f14641r = true;
        EditText editText = (EditText) view;
        boolean d6 = this.f14640q.f14590t == 12 ? d(i5, keyEvent, editText) : c(i5, keyEvent, editText);
        this.f14641r = false;
        return d6;
    }
}

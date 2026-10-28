package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes6.dex */
class h implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    private final ChipTextInputComboView f54487b;

    /* renamed from: c, reason: collision with root package name */
    private final ChipTextInputComboView f54488c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeModel f54489d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54490e = false;

    h(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f54487b = chipTextInputComboView;
        this.f54488c = chipTextInputComboView2;
        this.f54489d = timeModel;
    }

    private void b(int i4) {
        this.f54488c.setChecked(i4 == 12);
        this.f54487b.setChecked(i4 == 10);
        this.f54489d.f54433g = i4;
    }

    private boolean c(int i4, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null || i4 < 7 || i4 > 16 || keyEvent.getAction() != 1 || editText.getSelectionStart() != 2 || text.length() != 2) {
            return false;
        }
        b(12);
        return true;
    }

    private boolean d(int i4, KeyEvent keyEvent, EditText editText) {
        if (i4 != 67 || keyEvent.getAction() != 0 || !TextUtils.isEmpty(editText.getText())) {
            return false;
        }
        b(10);
        return true;
    }

    public void a() {
        TextInputLayout e4 = this.f54487b.e();
        TextInputLayout e5 = this.f54488c.e();
        EditText Z = e4.Z();
        EditText Z2 = e5.Z();
        Z.setImeOptions(268435461);
        Z2.setImeOptions(268435462);
        Z.setOnEditorActionListener(this);
        Z.setOnKeyListener(this);
        Z2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        boolean z4 = i4 == 5;
        if (z4) {
            b(12);
        }
        return z4;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (this.f54490e) {
            return false;
        }
        this.f54490e = true;
        EditText editText = (EditText) view;
        boolean d5 = this.f54489d.f54433g == 12 ? d(i4, keyEvent, editText) : c(i4, keyEvent, editText);
        this.f54490e = false;
        return d5;
    }
}

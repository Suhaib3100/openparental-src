package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.m;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;
import s8.a;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes6.dex */
class i implements TimePickerView.g, g {

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f54491b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeModel f54492c;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f54493d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f54494e = new b();

    /* renamed from: f, reason: collision with root package name */
    private final ChipTextInputComboView f54495f;

    /* renamed from: g, reason: collision with root package name */
    private final ChipTextInputComboView f54496g;

    /* renamed from: h, reason: collision with root package name */
    private final h f54497h;

    /* renamed from: i, reason: collision with root package name */
    private final EditText f54498i;

    /* renamed from: j, reason: collision with root package name */
    private final EditText f54499j;

    /* renamed from: k, reason: collision with root package name */
    private MaterialButtonToggleGroup f54500k;

    /* compiled from: TimePickerTextInputPresenter.java */
    class a extends m {
        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.f54492c.j(0);
                } else {
                    i.this.f54492c.j(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class b extends m {
        b() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.f54492c.g(0);
                } else {
                    i.this.f54492c.g(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f(((Integer) view.getTag(a.h.w4)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class d implements MaterialButtonToggleGroup.e {
        d() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z4) {
            i.this.f54492c.k(i4 == a.h.f91075s2 ? 1 : 0);
        }
    }

    public i(LinearLayout linearLayout, TimeModel timeModel) {
        this.f54491b = linearLayout;
        this.f54492c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(a.h.f91100x2);
        this.f54495f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(a.h.f91085u2);
        this.f54496g = chipTextInputComboView2;
        int i4 = a.h.f91095w2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i4);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i4);
        textView.setText(resources.getString(a.m.f91223g0));
        textView2.setText(resources.getString(a.m.f91221f0));
        int i5 = a.h.w4;
        chipTextInputComboView.setTag(i5, 12);
        chipTextInputComboView2.setTag(i5, 10);
        if (timeModel.f54430d == 0) {
            l();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.d());
        chipTextInputComboView.c(timeModel.e());
        this.f54498i = chipTextInputComboView2.e().Z();
        this.f54499j = chipTextInputComboView.e().Z();
        this.f54497h = new h(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.f(new com.google.android.material.timepicker.a(linearLayout.getContext(), a.m.S));
        chipTextInputComboView.f(new com.google.android.material.timepicker.a(linearLayout.getContext(), a.m.U));
        c();
    }

    private void e() {
        this.f54498i.addTextChangedListener(this.f54494e);
        this.f54499j.addTextChangedListener(this.f54493d);
    }

    private void h() {
        this.f54498i.removeTextChangedListener(this.f54494e);
        this.f54499j.removeTextChangedListener(this.f54493d);
    }

    private static void j(EditText editText, @l int i4) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField(ProtectedSandApp.s("\uf274"));
            declaredField.setAccessible(true);
            int i5 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField(ProtectedSandApp.s("\uf275"));
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField(ProtectedSandApp.s("\uf276"));
            declaredField3.setAccessible(true);
            Drawable b5 = e.a.b(context, i5);
            b5.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{b5, b5});
        } catch (Throwable unused) {
        }
    }

    private void k(TimeModel timeModel) {
        h();
        Locale locale = this.f54491b.getResources().getConfiguration().locale;
        Object[] objArr = {Integer.valueOf(timeModel.f54432f)};
        String s4 = ProtectedSandApp.s("\uf277");
        String format = String.format(locale, s4, objArr);
        String format2 = String.format(locale, s4, Integer.valueOf(timeModel.c()));
        this.f54495f.i(format);
        this.f54496g.i(format2);
        e();
        m();
    }

    private void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f54491b.findViewById(a.h.f91080t2);
        this.f54500k = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new d());
        this.f54500k.setVisibility(0);
        m();
    }

    private void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f54500k;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.j(this.f54492c.f54434h == 0 ? a.h.f91070r2 : a.h.f91075s2);
    }

    @Override // com.google.android.material.timepicker.g
    public void a() {
        View focusedChild = this.f54491b.getFocusedChild();
        if (focusedChild == null) {
            this.f54491b.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.getSystemService(this.f54491b.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f54491b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.g
    public void b() {
        this.f54491b.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.g
    public void c() {
        e();
        k(this.f54492c);
        this.f54497h.a();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void f(int i4) {
        this.f54492c.f54433g = i4;
        this.f54495f.setChecked(i4 == 12);
        this.f54496g.setChecked(i4 == 10);
        m();
    }

    public void g() {
        this.f54495f.setChecked(false);
        this.f54496g.setChecked(false);
    }

    public void i() {
        this.f54495f.setChecked(this.f54492c.f54433g == 12);
        this.f54496g.setChecked(this.f54492c.f54433g == 10);
    }

    @Override // com.google.android.material.timepicker.g
    public void invalidate() {
        k(this.f54492c);
    }
}

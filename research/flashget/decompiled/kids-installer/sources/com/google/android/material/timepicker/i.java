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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.m;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;
import n1.a;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes3.dex */
class i implements TimePickerView.g, g {

    /* renamed from: o, reason: collision with root package name */
    private final LinearLayout f14642o;

    /* renamed from: p, reason: collision with root package name */
    private final TimeModel f14643p;

    /* renamed from: q, reason: collision with root package name */
    private final TextWatcher f14644q = new a();

    /* renamed from: r, reason: collision with root package name */
    private final TextWatcher f14645r = new b();

    /* renamed from: s, reason: collision with root package name */
    private final ChipTextInputComboView f14646s;

    /* renamed from: t, reason: collision with root package name */
    private final ChipTextInputComboView f14647t;

    /* renamed from: u, reason: collision with root package name */
    private final h f14648u;

    /* renamed from: v, reason: collision with root package name */
    private final EditText f14649v;

    /* renamed from: w, reason: collision with root package name */
    private final EditText f14650w;

    /* renamed from: x, reason: collision with root package name */
    private MaterialButtonToggleGroup f14651x;

    /* compiled from: TimePickerTextInputPresenter.java */
    class a extends m {
        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.f14643p.i(0);
                } else {
                    i.this.f14643p.i(Integer.parseInt(editable.toString()));
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
                    i.this.f14643p.g(0);
                } else {
                    i.this.f14643p.g(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f(((Integer) view.getTag(a.h.f29821w4)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class d implements MaterialButtonToggleGroup.e {
        d() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5) {
            i.this.f14643p.j(i5 == a.h.f29795s2 ? 1 : 0);
        }
    }

    public i(LinearLayout linearLayout, TimeModel timeModel) {
        this.f14642o = linearLayout;
        this.f14643p = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(a.h.f29825x2);
        this.f14646s = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(a.h.f29807u2);
        this.f14647t = chipTextInputComboView2;
        int i5 = a.h.f29819w2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i5);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i5);
        textView.setText(resources.getString(a.m.f29951g0));
        textView2.setText(resources.getString(a.m.f29949f0));
        int i6 = a.h.f29821w4;
        chipTextInputComboView.setTag(i6, 12);
        chipTextInputComboView2.setTag(i6, 10);
        if (timeModel.f14587q == 0) {
            l();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.d());
        chipTextInputComboView.c(timeModel.e());
        this.f14649v = chipTextInputComboView2.e().Z();
        this.f14650w = chipTextInputComboView.e().Z();
        this.f14648u = new h(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.f(new com.google.android.material.timepicker.a(linearLayout.getContext(), a.m.S));
        chipTextInputComboView.f(new com.google.android.material.timepicker.a(linearLayout.getContext(), a.m.U));
        b();
    }

    private void d() {
        this.f14649v.addTextChangedListener(this.f14645r);
        this.f14650w.addTextChangedListener(this.f14644q);
    }

    private void h() {
        this.f14649v.removeTextChangedListener(this.f14645r);
        this.f14650w.removeTextChangedListener(this.f14644q);
    }

    private static void j(EditText editText, @l int i5) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField(ProtectedSandApp.s("❝"));
            declaredField.setAccessible(true);
            int i6 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField(ProtectedSandApp.s("❞"));
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField(ProtectedSandApp.s("❟"));
            declaredField3.setAccessible(true);
            Drawable d6 = androidx.appcompat.content.res.a.d(context, i6);
            d6.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{d6, d6});
        } catch (Throwable unused) {
        }
    }

    private void k(TimeModel timeModel) {
        h();
        Locale locale = this.f14642o.getResources().getConfiguration().locale;
        Object[] objArr = {Integer.valueOf(timeModel.f14589s)};
        String s5 = ProtectedSandApp.s("❠");
        String format = String.format(locale, s5, objArr);
        String format2 = String.format(locale, s5, Integer.valueOf(timeModel.c()));
        this.f14646s.i(format);
        this.f14647t.i(format2);
        d();
        m();
    }

    private void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f14642o.findViewById(a.h.f29801t2);
        this.f14651x = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new d());
        this.f14651x.setVisibility(0);
        m();
    }

    private void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f14651x;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.j(this.f14643p.f14591u == 0 ? a.h.f29789r2 : a.h.f29795s2);
    }

    @Override // com.google.android.material.timepicker.g
    public void a() {
        this.f14642o.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.g
    public void b() {
        d();
        k(this.f14643p);
        this.f14648u.a();
    }

    public void e() {
        this.f14646s.setChecked(false);
        this.f14647t.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void f(int i5) {
        this.f14643p.f14590t = i5;
        this.f14646s.setChecked(i5 == 12);
        this.f14647t.setChecked(i5 == 10);
        m();
    }

    @Override // com.google.android.material.timepicker.g
    public void g() {
        View focusedChild = this.f14642o.getFocusedChild();
        if (focusedChild == null) {
            this.f14642o.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.o(this.f14642o.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f14642o.setVisibility(8);
    }

    public void i() {
        this.f14646s.setChecked(this.f14643p.f14590t == 12);
        this.f14647t.setChecked(this.f14643p.f14590t == 10);
    }

    @Override // com.google.android.material.timepicker.g
    public void invalidate() {
        k(this.f14643p);
    }
}

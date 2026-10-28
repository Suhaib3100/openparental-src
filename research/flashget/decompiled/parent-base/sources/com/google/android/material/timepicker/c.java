package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: MaxInputValidator.java */
/* loaded from: classes6.dex */
class c implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f54474a;

    public c(int i4) {
        this.f54474a = i4;
    }

    public int a() {
        return this.f54474a;
    }

    public void b(int i4) {
        this.f54474a = i4;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i6, i7, charSequence.subSequence(i4, i5).toString());
            if (Integer.parseInt(sb.toString()) <= this.f54474a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}

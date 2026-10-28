package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: MaxInputValidator.java */
/* loaded from: classes2.dex */
class c implements InputFilter {

    /* renamed from: o, reason: collision with root package name */
    private int f14625o;

    public c(int i5) {
        this.f14625o = i5;
    }

    public int a() {
        return this.f14625o;
    }

    public void b(int i5) {
        this.f14625o = i5;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i7, i8, charSequence.subSequence(i5, i6).toString());
            if (Integer.parseInt(sb.toString()) <= this.f14625o) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}

package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: IntPrefField.java */
/* loaded from: classes6.dex */
public final class i extends b<Integer> {
    i(SharedPreferences sharedPreferences, String str, Integer num) {
        super(sharedPreferences, str, num);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer e(Integer num) {
        try {
            return Integer.valueOf(this.f31787b.getInt(this.f31788c, num.intValue()));
        } catch (ClassCastException e6) {
            try {
                return Integer.valueOf(Integer.parseInt(this.f31787b.getString(this.f31788c, "" + num)));
            } catch (Exception unused) {
                throw e6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(Integer num) {
        m.a(b().putInt(this.f31788c, num.intValue()));
    }
}

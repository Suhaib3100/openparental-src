package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: FloatPrefField.java */
/* loaded from: classes6.dex */
public final class g extends b<Float> {
    g(SharedPreferences sharedPreferences, String str, Float f6) {
        super(sharedPreferences, str, f6);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float e(Float f6) {
        try {
            return Float.valueOf(this.f31787b.getFloat(this.f31788c, f6.floatValue()));
        } catch (ClassCastException e6) {
            try {
                return Float.valueOf(Float.parseFloat(this.f31787b.getString(this.f31788c, "" + f6)));
            } catch (Exception unused) {
                throw e6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(Float f6) {
        m.a(b().putFloat(this.f31788c, f6.floatValue()));
    }
}

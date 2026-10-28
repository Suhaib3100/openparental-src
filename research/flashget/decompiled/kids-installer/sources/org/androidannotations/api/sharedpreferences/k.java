package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: LongPrefField.java */
/* loaded from: classes6.dex */
public final class k extends b<Long> {
    k(SharedPreferences sharedPreferences, String str, Long l5) {
        super(sharedPreferences, str, l5);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long e(Long l5) {
        try {
            return Long.valueOf(this.f31787b.getLong(this.f31788c, l5.longValue()));
        } catch (ClassCastException e6) {
            try {
                return Long.valueOf(Long.parseLong(this.f31787b.getString(this.f31788c, "" + l5)));
            } catch (Exception unused) {
                throw e6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(Long l5) {
        m.a(b().putLong(this.f31788c, l5.longValue()));
    }
}

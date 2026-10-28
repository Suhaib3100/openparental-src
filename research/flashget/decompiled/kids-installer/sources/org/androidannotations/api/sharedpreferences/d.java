package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: BooleanPrefField.java */
/* loaded from: classes6.dex */
public final class d extends b<Boolean> {
    d(SharedPreferences sharedPreferences, String str, Boolean bool) {
        super(sharedPreferences, str, bool);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean e(Boolean bool) {
        return Boolean.valueOf(this.f31787b.getBoolean(this.f31788c, bool.booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(Boolean bool) {
        m.a(b().putBoolean(this.f31788c, bool.booleanValue()));
    }
}

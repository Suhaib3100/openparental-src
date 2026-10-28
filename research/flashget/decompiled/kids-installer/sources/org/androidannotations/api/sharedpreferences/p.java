package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: StringPrefField.java */
/* loaded from: classes6.dex */
public final class p extends b<String> {
    p(SharedPreferences sharedPreferences, String str, String str2) {
        super(sharedPreferences, str, str2);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String e(String str) {
        return this.f31787b.getString(this.f31788c, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(String str) {
        m.a(b().putString(this.f31788c, str));
    }
}

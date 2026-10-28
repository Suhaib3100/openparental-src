package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: StringSetPrefField.java */
/* loaded from: classes6.dex */
public final class r extends b<Set<String>> {
    r(SharedPreferences sharedPreferences, String str, Set<String> set) {
        super(sharedPreferences, str, set);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set<String> e(Set<String> set) {
        return m.c(this.f31787b, this.f31788c, set);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(Set<String> set) {
        SharedPreferences.Editor edit = this.f31787b.edit();
        m.e(edit, this.f31788c, set);
        m.a(edit);
    }
}

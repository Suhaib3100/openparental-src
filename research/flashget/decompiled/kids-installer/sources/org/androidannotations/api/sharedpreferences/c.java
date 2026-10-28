package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.e;

/* compiled from: BooleanPrefEditorField.java */
/* loaded from: classes6.dex */
public final class c<T extends e<T>> extends a<T> {
    c(T t5, String str) {
        super(t5, str);
    }

    public T b(boolean z5) {
        this.f31784a.f().putBoolean(this.f31785b, z5);
        return this.f31784a;
    }
}

package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.e;

/* compiled from: AbstractPrefEditorField.java */
/* loaded from: classes5.dex */
public abstract class a<T extends e<T>> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f31784a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f31785b;

    public a(T t5, String str) {
        this.f31784a = t5;
        this.f31785b = str;
    }

    public final T a() {
        this.f31784a.f().remove(this.f31785b);
        return this.f31784a;
    }
}

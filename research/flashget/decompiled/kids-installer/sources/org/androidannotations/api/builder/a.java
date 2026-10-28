package org.androidannotations.api.builder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.androidannotations.api.builder.a;

/* compiled from: ActivityIntentBuilder.java */
/* loaded from: classes6.dex */
public abstract class a<I extends a<I>> extends e<I> implements b {

    /* renamed from: c, reason: collision with root package name */
    protected Bundle f31757c;

    public a(Context context, Class<?> cls) {
        super(context, cls);
    }

    public b J(Bundle bundle) {
        this.f31757c = bundle;
        return this;
    }

    @Override // org.androidannotations.api.builder.b
    public abstract f a(int i5);

    @Override // org.androidannotations.api.builder.b
    public final f start() {
        a(-1);
        return new f(this.f31759a);
    }

    public a(Context context, Intent intent) {
        super(context, intent);
    }
}

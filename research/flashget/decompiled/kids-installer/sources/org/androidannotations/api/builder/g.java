package org.androidannotations.api.builder;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import org.androidannotations.api.builder.g;

/* compiled from: ServiceIntentBuilder.java */
/* loaded from: classes6.dex */
public abstract class g<I extends g<I>> extends e<I> {
    public g(Context context, Class<?> cls) {
        super(context, cls);
    }

    public ComponentName J() {
        return this.f31759a.startService(this.f31760b);
    }

    public boolean K() {
        return this.f31759a.stopService(this.f31760b);
    }

    public g(Context context, Intent intent) {
        super(context, intent);
    }
}

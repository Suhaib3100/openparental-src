package dagger.android;

import android.content.ContentProvider;

/* loaded from: classes7.dex */
public abstract class DaggerContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    @androidx.annotation.i
    public boolean onCreate() {
        a.f(this);
        return true;
    }
}

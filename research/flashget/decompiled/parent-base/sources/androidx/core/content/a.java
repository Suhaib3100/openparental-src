package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.o0;

/* compiled from: ContentProviderCompat.java */
/* loaded from: classes3.dex */
public final class a {
    private a() {
    }

    @o0
    public static Context a(@o0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}

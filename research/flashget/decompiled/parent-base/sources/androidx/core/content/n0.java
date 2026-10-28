package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.o0;

/* compiled from: UriMatcherCompat.java */
/* loaded from: classes3.dex */
public class n0 {
    private n0() {
    }

    @o0
    public static androidx.core.util.c0<Uri> b(@o0 final UriMatcher uriMatcher) {
        return new androidx.core.util.c0() { // from class: androidx.core.content.m0
            @Override // androidx.core.util.c0
            public final boolean test(Object obj) {
                boolean c5;
                c5 = n0.c(uriMatcher, (Uri) obj);
                return c5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}

package androidx.startup;

import androidx.annotation.c1;
import androidx.annotation.o0;

@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public final class StartupException extends RuntimeException {
    public StartupException(@o0 String str) {
        super(str);
    }

    public StartupException(@o0 Throwable th) {
        super(th);
    }

    public StartupException(@o0 String str, @o0 Throwable th) {
        super(str, th);
    }
}

package com.flashget.kidsdownloader;

import android.util.Base64;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class MessageGuardException extends RuntimeException {
    static String fingerprint;
    private String guard;

    public MessageGuardException(Throwable th) {
        super(th.getLocalizedMessage(), th);
        String message = th.getMessage();
        this.guard = (message == null ? "NO_MSG" : message) + " " + fingerprint;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = getClass().getName() + "_" + Base64.encodeToString(this.guard.getBytes("UTF-8"), 11).replace('-', Typography.f27127c);
        String localizedMessage = getLocalizedMessage();
        if (localizedMessage == null) {
            return str;
        }
        return str + ": " + localizedMessage;
    }
}

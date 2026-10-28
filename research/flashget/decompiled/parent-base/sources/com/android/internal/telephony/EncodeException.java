package com.android.internal.telephony;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes3.dex */
public class EncodeException extends Exception {
    public EncodeException() {
    }

    public EncodeException(String str) {
        super(str);
    }

    public EncodeException(char c5) {
        super(ProtectedSandApp.s("خ") + c5 + ProtectedSandApp.s("د"));
    }
}

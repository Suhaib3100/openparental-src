package com.tencent.liteav.videobase.egl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class d extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    public final int mErrorCode;
    private final String mErrorMessage;

    public d(int i4) {
        this(i4, "");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.mErrorMessage;
        String s4 = ProtectedSandApp.s("唐\u0001");
        String s5 = ProtectedSandApp.s("唑\u0001");
        if (str != null) {
            return s5 + this.mErrorCode + s4 + this.mErrorMessage;
        }
        return s5 + this.mErrorCode + s4 + super.getMessage();
    }

    public d(int i4, String str) {
        super(str);
        this.mErrorCode = i4;
        this.mErrorMessage = str;
    }

    public d(int i4, String str, Throwable th) {
        super(str, th);
        this.mErrorCode = i4;
        this.mErrorMessage = str;
    }
}

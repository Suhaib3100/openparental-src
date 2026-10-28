package com.airbnb.lottie.network;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FileExtension.java */
/* loaded from: classes3.dex */
public enum c {
    JSON(ProtectedSandApp.s("Ƒ")),
    ZIP(ProtectedSandApp.s("Ɠ"));

    public final String extension;

    c(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ProtectedSandApp.s("ƕ") + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}

package com.google.firebase.messaging;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class SendException extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final int f59954c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59955d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f59956e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f59957f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59958g = 4;

    /* renamed from: b, reason: collision with root package name */
    private final int f59959b;

    SendException(String str) {
        super(str);
        this.f59959b = b(str);
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        char c5 = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals(ProtectedSandApp.s("ƕ\u0001"))) {
                    c5 = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals(ProtectedSandApp.s("Ɣ\u0001"))) {
                    c5 = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals(ProtectedSandApp.s("Ɠ\u0001"))) {
                    c5 = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals(ProtectedSandApp.s("ƒ\u0001"))) {
                    c5 = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals(ProtectedSandApp.s("Ƒ\u0001"))) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
        }
        return 0;
    }

    public int a() {
        return this.f59959b;
    }
}

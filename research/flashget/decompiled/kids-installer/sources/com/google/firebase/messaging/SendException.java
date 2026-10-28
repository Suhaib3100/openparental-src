package com.google.firebase.messaging;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class SendException extends Exception {

    /* renamed from: p, reason: collision with root package name */
    public static final int f17079p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17080q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17081r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17082s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17083t = 4;

    /* renamed from: o, reason: collision with root package name */
    private final int f17084o;

    SendException(String str) {
        super(str);
        this.f17084o = b(str);
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        char c6 = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals(ProtectedSandApp.s("᜔"))) {
                    c6 = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals(ProtectedSandApp.s("ᜓ"))) {
                    c6 = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals(ProtectedSandApp.s("ᜒ"))) {
                    c6 = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals(ProtectedSandApp.s("ᜑ"))) {
                    c6 = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals(ProtectedSandApp.s("ᜐ"))) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
        }
        return 0;
    }

    public int a() {
        return this.f17084o;
    }
}

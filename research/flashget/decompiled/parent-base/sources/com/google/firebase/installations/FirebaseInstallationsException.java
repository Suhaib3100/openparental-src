package com.google.firebase.installations;

import androidx.annotation.o0;
import com.google.firebase.FirebaseException;

/* loaded from: classes6.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final a f59695b;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@o0 a aVar) {
        this.f59695b = aVar;
    }

    @o0
    public a a() {
        return this.f59695b;
    }

    public FirebaseInstallationsException(@o0 String str, @o0 a aVar) {
        super(str);
        this.f59695b = aVar;
    }

    public FirebaseInstallationsException(@o0 String str, @o0 a aVar, @o0 Throwable th) {
        super(str, th);
        this.f59695b = aVar;
    }
}

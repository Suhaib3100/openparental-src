package com.google.firebase.crashlytics.internal.common;

/* compiled from: DeliveryMechanism.java */
/* loaded from: classes6.dex */
public enum j0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id, reason: collision with root package name */
    private final int f58742id;

    j0(int i4) {
        this.f58742id = i4;
    }

    public static j0 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f58742id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f58742id);
    }
}

package com.google.firebase.crashlytics;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KeyValueBuilder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/crashlytics/k;", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "", "key", "", "value", "Lkotlin/k2;", "f", "(Ljava/lang/String;Z)V", "", "a", "(Ljava/lang/String;D)V", "", "b", "(Ljava/lang/String;F)V", "", "c", "(Ljava/lang/String;I)V", "", "d", "(Ljava/lang/String;J)V", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final FirebaseCrashlytics crashlytics;

    public k(@fg.l FirebaseCrashlytics firebaseCrashlytics) {
        l0.p(firebaseCrashlytics, ProtectedSandApp.s("￼"));
        this.crashlytics = firebaseCrashlytics;
    }

    public final void a(@fg.l String key, double value) {
        l0.p(key, ProtectedSandApp.s("�"));
        this.crashlytics.setCustomKey(key, value);
    }

    public final void b(@fg.l String key, float value) {
        l0.p(key, ProtectedSandApp.s("�"));
        this.crashlytics.setCustomKey(key, value);
    }

    public final void c(@fg.l String key, int value) {
        l0.p(key, ProtectedSandApp.s("�"));
        this.crashlytics.setCustomKey(key, value);
    }

    public final void d(@fg.l String key, long value) {
        l0.p(key, ProtectedSandApp.s("�"));
        this.crashlytics.setCustomKey(key, value);
    }

    public final void e(@fg.l String key, @fg.l String value) {
        l0.p(key, ProtectedSandApp.s("�"));
        l0.p(value, ProtectedSandApp.s("\ufffe"));
        this.crashlytics.setCustomKey(key, value);
    }

    public final void f(@fg.l String key, boolean value) {
        l0.p(key, ProtectedSandApp.s("�"));
        this.crashlytics.setCustomKey(key, value);
    }
}

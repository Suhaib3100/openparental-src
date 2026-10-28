package com.google.firebase.crashlytics;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KeyValueBuilder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/crashlytics/k;", "", "", "key", "", "value", "Lkotlin/m2;", "f", "", "a", "", "b", "", "c", "", "d", "e", "Lcom/google/firebase/crashlytics/i;", "Lcom/google/firebase/crashlytics/i;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/i;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i crashlytics;

    public k(@d5.d i iVar) {
        l0.p(iVar, ProtectedSandApp.s("ᗵ"));
        this.crashlytics = iVar;
    }

    public final void a(@d5.d String str, double d6) {
        l0.p(str, ProtectedSandApp.s("ᗶ"));
        this.crashlytics.k(str, d6);
    }

    public final void b(@d5.d String str, float f6) {
        l0.p(str, ProtectedSandApp.s("ᗷ"));
        this.crashlytics.l(str, f6);
    }

    public final void c(@d5.d String str, int i5) {
        l0.p(str, ProtectedSandApp.s("ᗸ"));
        this.crashlytics.m(str, i5);
    }

    public final void d(@d5.d String str, long j5) {
        l0.p(str, ProtectedSandApp.s("ᗹ"));
        this.crashlytics.n(str, j5);
    }

    public final void e(@d5.d String str, @d5.d String str2) {
        l0.p(str, ProtectedSandApp.s("ᗺ"));
        l0.p(str2, ProtectedSandApp.s("ᗻ"));
        this.crashlytics.o(str, str2);
    }

    public final void f(@d5.d String str, boolean z5) {
        l0.p(str, ProtectedSandApp.s("ᗼ"));
        this.crashlytics.p(str, z5);
    }
}

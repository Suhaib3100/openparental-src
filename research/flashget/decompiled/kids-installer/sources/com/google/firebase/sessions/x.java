package com.google.firebase.sessions;

import android.util.Base64;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionDataStoreConfigs.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0005\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/x;", "", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "PROCESS_NAME", "c", "a", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", "d", "SETTINGS_CONFIG_NAME", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final x f18897a = new x();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String PROCESS_NAME;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final String SESSIONS_CONFIG_NAME;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final String SETTINGS_CONFIG_NAME;

    static {
        byte[] F1;
        F1 = kotlin.text.e0.F1(v.f18743a.e());
        String encodeToString = Base64.encodeToString(F1, 10);
        PROCESS_NAME = encodeToString;
        String s5 = ProtectedSandApp.s("\u1af0");
        SESSIONS_CONFIG_NAME = androidx.constraintlayout.solver.widgets.analyzer.e.a(s5, encodeToString, ProtectedSandApp.s("\u1af1"));
        SETTINGS_CONFIG_NAME = androidx.constraintlayout.solver.widgets.analyzer.e.a(s5, encodeToString, ProtectedSandApp.s("\u1af2"));
    }

    private x() {
    }

    @d5.d
    public final String a() {
        return SESSIONS_CONFIG_NAME;
    }

    @d5.d
    public final String b() {
        return SETTINGS_CONFIG_NAME;
    }
}

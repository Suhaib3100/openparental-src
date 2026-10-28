package com.google.firebase.sessions;

import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionDataStoreConfigs.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/y;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "PROCESS_NAME", "c", "a", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", "d", "SETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final y f61031a = new y();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String PROCESS_NAME;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String SESSIONS_CONFIG_NAME;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String SETTINGS_CONFIG_NAME;

    static {
        String encodeToString = Base64.encodeToString(kotlin.text.v.F1(w.f61030a.e()), 10);
        PROCESS_NAME = encodeToString;
        String s4 = ProtectedSandApp.s("շ\u0001");
        SESSIONS_CONFIG_NAME = android.support.v4.media.d.a(s4, encodeToString, ProtectedSandApp.s("ո\u0001"));
        SETTINGS_CONFIG_NAME = android.support.v4.media.d.a(s4, encodeToString, ProtectedSandApp.s("չ\u0001"));
    }

    private y() {
    }

    @fg.l
    public final String a() {
        return SESSIONS_CONFIG_NAME;
    }

    @fg.l
    public final String b() {
        return SETTINGS_CONFIG_NAME;
    }
}

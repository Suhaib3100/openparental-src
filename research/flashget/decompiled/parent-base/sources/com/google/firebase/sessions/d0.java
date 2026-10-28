package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.sessions.api.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;

/* compiled from: SessionEvents.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/d0;", "", "<init>", "()V", "Lcom/google/firebase/sessions/api/b;", "subscriber", "Lcom/google/firebase/sessions/e;", "e", "(Lcom/google/firebase/sessions/api/b;)Lcom/google/firebase/sessions/e;", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/sessions/b0;", "sessionDetails", "Lcom/google/firebase/sessions/settings/f;", "sessionsSettings", "", "Lcom/google/firebase/sessions/api/b$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Lcom/google/firebase/sessions/c0;", "a", "(Lcom/google/firebase/g;Lcom/google/firebase/sessions/b0;Lcom/google/firebase/sessions/settings/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/c0;", "Lcom/google/firebase/sessions/b;", "c", "(Lcom/google/firebase/g;)Lcom/google/firebase/sessions/b;", "Lcom/google/firebase/encoders/a;", "b", "Lcom/google/firebase/encoders/a;", "d", "()Lcom/google/firebase/encoders/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d0 f60857a = new d0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final com.google.firebase.encoders.a SESSION_EVENT_ENCODER;

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        c.f60814b.a(eVar);
        com.google.firebase.encoders.a j4 = eVar.l(true).j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("ҷ\u0001"));
        SESSION_EVENT_ENCODER = j4;
    }

    private d0() {
    }

    public static /* synthetic */ c0 b(d0 d0Var, com.google.firebase.g gVar, b0 b0Var, com.google.firebase.sessions.settings.f fVar, Map map, String str, String str2, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            map = z0.z();
        }
        return d0Var.a(gVar, b0Var, fVar, map, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? "" : str2);
    }

    private final e e(com.google.firebase.sessions.api.b subscriber) {
        return subscriber == null ? e.COLLECTION_SDK_NOT_INSTALLED : subscriber.a() ? e.COLLECTION_ENABLED : e.COLLECTION_DISABLED;
    }

    @fg.l
    public final c0 a(@fg.l com.google.firebase.g firebaseApp, @fg.l b0 sessionDetails, @fg.l com.google.firebase.sessions.settings.f sessionsSettings, @fg.l Map<b.a, ? extends com.google.firebase.sessions.api.b> subscribers, @fg.l String firebaseInstallationId, @fg.l String firebaseAuthenticationToken) {
        kotlin.jvm.internal.l0.p(firebaseApp, ProtectedSandApp.s("Ҹ\u0001"));
        kotlin.jvm.internal.l0.p(sessionDetails, ProtectedSandApp.s("ҹ\u0001"));
        kotlin.jvm.internal.l0.p(sessionsSettings, ProtectedSandApp.s("Һ\u0001"));
        kotlin.jvm.internal.l0.p(subscribers, ProtectedSandApp.s("һ\u0001"));
        kotlin.jvm.internal.l0.p(firebaseInstallationId, ProtectedSandApp.s("Ҽ\u0001"));
        kotlin.jvm.internal.l0.p(firebaseAuthenticationToken, ProtectedSandApp.s("ҽ\u0001"));
        return new c0(j.SESSION_START, new h0(sessionDetails.h(), sessionDetails.g(), sessionDetails.i(), sessionDetails.j(), new f(e(subscribers.get(b.a.PERFORMANCE)), e(subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId, firebaseAuthenticationToken), c(firebaseApp));
    }

    @fg.l
    public final b c(@fg.l com.google.firebase.g firebaseApp) {
        String valueOf;
        long longVersionCode;
        kotlin.jvm.internal.l0.p(firebaseApp, ProtectedSandApp.s("Ҹ\u0001"));
        Context n4 = firebaseApp.n();
        String s4 = ProtectedSandApp.s("Ҿ\u0001");
        kotlin.jvm.internal.l0.o(n4, s4);
        String packageName = n4.getPackageName();
        PackageInfo packageInfo = n4.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String j4 = firebaseApp.s().j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("ҿ\u0001"));
        String str2 = Build.MODEL;
        kotlin.jvm.internal.l0.o(str2, ProtectedSandApp.s("Ӏ\u0001"));
        String str3 = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l0.o(str3, ProtectedSandApp.s("Ӂ\u0001"));
        u uVar = u.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.l0.o(packageName, ProtectedSandApp.s("ӂ\u0001"));
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? str : str4;
        String str6 = Build.MANUFACTURER;
        kotlin.jvm.internal.l0.o(str6, ProtectedSandApp.s("Ӄ\u0001"));
        w wVar = w.f61030a;
        Context n5 = firebaseApp.n();
        kotlin.jvm.internal.l0.o(n5, s4);
        v d5 = wVar.d(n5);
        Context n6 = firebaseApp.n();
        kotlin.jvm.internal.l0.o(n6, s4);
        return new b(j4, str2, ProtectedSandApp.s("ӄ\u0001"), str3, uVar, new a(packageName, str5, str, str6, d5, wVar.c(n6)));
    }

    @fg.l
    public final com.google.firebase.encoders.a d() {
        return SESSION_EVENT_ENCODER;
    }
}

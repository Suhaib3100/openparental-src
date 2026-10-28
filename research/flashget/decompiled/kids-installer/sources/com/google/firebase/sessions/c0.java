package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.sessions.api.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.f1;

/* compiled from: SessionEvents.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002JT\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/c0;", "", "Lcom/google/firebase/sessions/api/b;", "subscriber", "Lcom/google/firebase/sessions/e;", "e", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/sessions/a0;", "sessionDetails", "Lcom/google/firebase/sessions/settings/f;", "sessionsSettings", "Lcom/google/firebase/sessions/u;", "currentProcessDetails", "", "appProcessDetails", "", "Lcom/google/firebase/sessions/api/b$a;", "subscribers", "", "firebaseInstallationId", "Lcom/google/firebase/sessions/b0;", "a", "Lcom/google/firebase/sessions/b;", "c", "Lcom/google/firebase/encoders/a;", "b", "Lcom/google/firebase/encoders/a;", "d", "()Lcom/google/firebase/encoders/a;", "SESSION_EVENT_ENCODER", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c0 f18578a = new c0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final com.google.firebase.encoders.a SESSION_EVENT_ENCODER;

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        c.f18543b.a(eVar);
        com.google.firebase.encoders.a j5 = eVar.l(true).j();
        kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("᪄"));
        SESSION_EVENT_ENCODER = j5;
    }

    private c0() {
    }

    public static /* synthetic */ b0 b(c0 c0Var, com.google.firebase.g gVar, a0 a0Var, com.google.firebase.sessions.settings.f fVar, u uVar, List list, Map map, String str, int i5, Object obj) {
        Map map2;
        Map z5;
        if ((i5 & 32) != 0) {
            z5 = f1.z();
            map2 = z5;
        } else {
            map2 = map;
        }
        return c0Var.a(gVar, a0Var, fVar, uVar, list, map2, (i5 & 64) != 0 ? "" : str);
    }

    private final e e(com.google.firebase.sessions.api.b subscriber) {
        return subscriber == null ? e.COLLECTION_SDK_NOT_INSTALLED : subscriber.a() ? e.COLLECTION_ENABLED : e.COLLECTION_DISABLED;
    }

    @d5.d
    public final b0 a(@d5.d com.google.firebase.g firebaseApp, @d5.d a0 sessionDetails, @d5.d com.google.firebase.sessions.settings.f sessionsSettings, @d5.d u currentProcessDetails, @d5.d List<u> appProcessDetails, @d5.d Map<b.a, ? extends com.google.firebase.sessions.api.b> subscribers, @d5.d String firebaseInstallationId) {
        kotlin.jvm.internal.l0.p(firebaseApp, ProtectedSandApp.s("᪅"));
        kotlin.jvm.internal.l0.p(sessionDetails, ProtectedSandApp.s("᪆"));
        kotlin.jvm.internal.l0.p(sessionsSettings, ProtectedSandApp.s("᪇"));
        kotlin.jvm.internal.l0.p(currentProcessDetails, ProtectedSandApp.s("᪈"));
        kotlin.jvm.internal.l0.p(appProcessDetails, ProtectedSandApp.s("᪉"));
        kotlin.jvm.internal.l0.p(subscribers, ProtectedSandApp.s("\u1a8a"));
        kotlin.jvm.internal.l0.p(firebaseInstallationId, ProtectedSandApp.s("\u1a8b"));
        return new b0(j.SESSION_START, new g0(sessionDetails.h(), sessionDetails.g(), sessionDetails.i(), sessionDetails.j(), new f(e(subscribers.get(b.a.PERFORMANCE)), e(subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId), c(firebaseApp));
    }

    @d5.d
    public final b c(@d5.d com.google.firebase.g firebaseApp) {
        String valueOf;
        long longVersionCode;
        kotlin.jvm.internal.l0.p(firebaseApp, ProtectedSandApp.s("\u1a8c"));
        Context n5 = firebaseApp.n();
        String s5 = ProtectedSandApp.s("\u1a8d");
        kotlin.jvm.internal.l0.o(n5, s5);
        String packageName = n5.getPackageName();
        PackageInfo packageInfo = n5.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String j5 = firebaseApp.s().j();
        kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("\u1a8e"));
        String str2 = Build.MODEL;
        kotlin.jvm.internal.l0.o(str2, ProtectedSandApp.s("\u1a8f"));
        String s6 = ProtectedSandApp.s("᪐");
        String str3 = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l0.o(str3, ProtectedSandApp.s("᪑"));
        t tVar = t.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.l0.o(packageName, ProtectedSandApp.s("᪒"));
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? str : str4;
        String str6 = Build.MANUFACTURER;
        kotlin.jvm.internal.l0.o(str6, ProtectedSandApp.s("᪓"));
        v vVar = v.f18743a;
        Context n6 = firebaseApp.n();
        kotlin.jvm.internal.l0.o(n6, s5);
        u d6 = vVar.d(n6);
        Context n7 = firebaseApp.n();
        kotlin.jvm.internal.l0.o(n7, s5);
        return new b(j5, str2, s6, str3, tVar, new a(packageName, str5, str, str6, d6, vVar.c(n7)));
    }

    @d5.d
    public final com.google.firebase.encoders.a d() {
        return SESSION_EVENT_ENCODER;
    }
}

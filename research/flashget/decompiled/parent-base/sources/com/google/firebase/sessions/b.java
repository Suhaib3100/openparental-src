package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b$\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "", "appId", "deviceModel", "sessionSdkVersion", "osVersion", "Lcom/google/firebase/sessions/u;", "logEnvironment", "Lcom/google/firebase/sessions/a;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/u;Lcom/google/firebase/sessions/a;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "()Lcom/google/firebase/sessions/u;", "f", "()Lcom/google/firebase/sessions/a;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/u;Lcom/google/firebase/sessions/a;)Lcom/google/firebase/sessions/b;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "k", "n", "m", "Lcom/google/firebase/sessions/u;", "l", "Lcom/google/firebase/sessions/a;", "i", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String appId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String deviceModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String sessionSdkVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u logEnvironment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a androidAppInfo;

    public b(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4, @fg.l u uVar, @fg.l a aVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("҈\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("҉\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("Ҋ\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("ҋ\u0001"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("Ҍ\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("ҍ\u0001"));
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = uVar;
        this.androidAppInfo = aVar;
    }

    public static /* synthetic */ b h(b bVar, String str, String str2, String str3, String str4, u uVar, a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bVar.appId;
        }
        if ((i4 & 2) != 0) {
            str2 = bVar.deviceModel;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = bVar.sessionSdkVersion;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            str4 = bVar.osVersion;
        }
        String str7 = str4;
        if ((i4 & 16) != 0) {
            uVar = bVar.logEnvironment;
        }
        u uVar2 = uVar;
        if ((i4 & 32) != 0) {
            aVar = bVar.androidAppInfo;
        }
        return bVar.g(str, str5, str6, str7, uVar2, aVar);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final u getLogEnvironment() {
        return this.logEnvironment;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.l0.g(this.appId, bVar.appId) && kotlin.jvm.internal.l0.g(this.deviceModel, bVar.deviceModel) && kotlin.jvm.internal.l0.g(this.sessionSdkVersion, bVar.sessionSdkVersion) && kotlin.jvm.internal.l0.g(this.osVersion, bVar.osVersion) && this.logEnvironment == bVar.logEnvironment && kotlin.jvm.internal.l0.g(this.androidAppInfo, bVar.androidAppInfo);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final a getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @fg.l
    public final b g(@fg.l String appId, @fg.l String deviceModel, @fg.l String sessionSdkVersion, @fg.l String osVersion, @fg.l u logEnvironment, @fg.l a androidAppInfo) {
        kotlin.jvm.internal.l0.p(appId, ProtectedSandApp.s("҈\u0001"));
        kotlin.jvm.internal.l0.p(deviceModel, ProtectedSandApp.s("҉\u0001"));
        kotlin.jvm.internal.l0.p(sessionSdkVersion, ProtectedSandApp.s("Ҋ\u0001"));
        kotlin.jvm.internal.l0.p(osVersion, ProtectedSandApp.s("ҋ\u0001"));
        kotlin.jvm.internal.l0.p(logEnvironment, ProtectedSandApp.s("Ҍ\u0001"));
        kotlin.jvm.internal.l0.p(androidAppInfo, ProtectedSandApp.s("ҍ\u0001"));
        return new b(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public int hashCode() {
        return this.androidAppInfo.hashCode() + ((this.logEnvironment.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.osVersion, androidx.compose.foundation.text.modifiers.n.a(this.sessionSdkVersion, androidx.compose.foundation.text.modifiers.n.a(this.deviceModel, this.appId.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @fg.l
    public final a i() {
        return this.androidAppInfo;
    }

    @fg.l
    public final String j() {
        return this.appId;
    }

    @fg.l
    public final String k() {
        return this.deviceModel;
    }

    @fg.l
    public final u l() {
        return this.logEnvironment;
    }

    @fg.l
    public final String m() {
        return this.osVersion;
    }

    @fg.l
    public final String n() {
        return this.sessionSdkVersion;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("Ҏ\u0001") + this.appId + ProtectedSandApp.s("ҏ\u0001") + this.deviceModel + ProtectedSandApp.s("Ґ\u0001") + this.sessionSdkVersion + ProtectedSandApp.s("ґ\u0001") + this.osVersion + ProtectedSandApp.s("Ғ\u0001") + this.logEnvironment + ProtectedSandApp.s("ғ\u0001") + this.androidAppInfo + ')';
    }
}

package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "", "a", "b", "c", "d", "Lcom/google/firebase/sessions/t;", "e", "Lcom/google/firebase/sessions/a;", "f", "appId", "deviceModel", "sessionSdkVersion", "osVersion", "logEnvironment", "androidAppInfo", "g", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "k", "n", "m", "Lcom/google/firebase/sessions/t;", "l", "()Lcom/google/firebase/sessions/t;", "Lcom/google/firebase/sessions/a;", "i", "()Lcom/google/firebase/sessions/a;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/t;Lcom/google/firebase/sessions/a;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String appId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String deviceModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String sessionSdkVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final t logEnvironment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a androidAppInfo;

    public b(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4, @d5.d t tVar, @d5.d a aVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("ᩲ"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("ᩳ"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("ᩴ"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("᩵"));
        kotlin.jvm.internal.l0.p(tVar, ProtectedSandApp.s("᩶"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("᩷"));
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = tVar;
        this.androidAppInfo = aVar;
    }

    public static /* synthetic */ b h(b bVar, String str, String str2, String str3, String str4, t tVar, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = bVar.appId;
        }
        if ((i5 & 2) != 0) {
            str2 = bVar.deviceModel;
        }
        String str5 = str2;
        if ((i5 & 4) != 0) {
            str3 = bVar.sessionSdkVersion;
        }
        String str6 = str3;
        if ((i5 & 8) != 0) {
            str4 = bVar.osVersion;
        }
        String str7 = str4;
        if ((i5 & 16) != 0) {
            tVar = bVar.logEnvironment;
        }
        t tVar2 = tVar;
        if ((i5 & 32) != 0) {
            aVar = bVar.androidAppInfo;
        }
        return bVar.g(str, str5, str6, str7, tVar2, aVar);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @d5.d
    /* renamed from: e, reason: from getter */
    public final t getLogEnvironment() {
        return this.logEnvironment;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.l0.g(this.appId, bVar.appId) && kotlin.jvm.internal.l0.g(this.deviceModel, bVar.deviceModel) && kotlin.jvm.internal.l0.g(this.sessionSdkVersion, bVar.sessionSdkVersion) && kotlin.jvm.internal.l0.g(this.osVersion, bVar.osVersion) && this.logEnvironment == bVar.logEnvironment && kotlin.jvm.internal.l0.g(this.androidAppInfo, bVar.androidAppInfo);
    }

    @d5.d
    /* renamed from: f, reason: from getter */
    public final a getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @d5.d
    public final b g(@d5.d String appId, @d5.d String deviceModel, @d5.d String sessionSdkVersion, @d5.d String osVersion, @d5.d t logEnvironment, @d5.d a androidAppInfo) {
        kotlin.jvm.internal.l0.p(appId, ProtectedSandApp.s("᩸"));
        kotlin.jvm.internal.l0.p(deviceModel, ProtectedSandApp.s("᩹"));
        kotlin.jvm.internal.l0.p(sessionSdkVersion, ProtectedSandApp.s("᩺"));
        kotlin.jvm.internal.l0.p(osVersion, ProtectedSandApp.s("᩻"));
        kotlin.jvm.internal.l0.p(logEnvironment, ProtectedSandApp.s("᩼"));
        kotlin.jvm.internal.l0.p(androidAppInfo, ProtectedSandApp.s("\u1a7d"));
        return new b(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public int hashCode() {
        return this.androidAppInfo.hashCode() + ((this.logEnvironment.hashCode() + ((this.osVersion.hashCode() + ((this.sessionSdkVersion.hashCode() + ((this.deviceModel.hashCode() + (this.appId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @d5.d
    public final a i() {
        return this.androidAppInfo;
    }

    @d5.d
    public final String j() {
        return this.appId;
    }

    @d5.d
    public final String k() {
        return this.deviceModel;
    }

    @d5.d
    public final t l() {
        return this.logEnvironment;
    }

    @d5.d
    public final String m() {
        return this.osVersion;
    }

    @d5.d
    public final String n() {
        return this.sessionSdkVersion;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("\u1a7e") + this.appId + ProtectedSandApp.s("᩿") + this.deviceModel + ProtectedSandApp.s("᪀") + this.sessionSdkVersion + ProtectedSandApp.s("᪁") + this.osVersion + ProtectedSandApp.s("᪂") + this.logEnvironment + ProtectedSandApp.s("᪃") + this.androidAppInfo + ')';
    }
}

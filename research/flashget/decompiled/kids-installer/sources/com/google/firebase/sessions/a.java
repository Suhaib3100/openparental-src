package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/a;", "", "", "a", "b", "c", "d", "Lcom/google/firebase/sessions/u;", "e", "", "f", "packageName", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "appProcessDetails", "g", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "n", "i", "l", "Lcom/google/firebase/sessions/u;", "k", "()Lcom/google/firebase/sessions/u;", "Ljava/util/List;", "j", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/u;Ljava/util/List;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String packageName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String versionName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String appBuildVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String deviceManufacturer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final u currentProcessDetails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<u> appProcessDetails;

    public a(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4, @d5.d u uVar, @d5.d List<u> list) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("ᨿ"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("ᩀ"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("ᩁ"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("ᩂ"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("ᩃ"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("ᩄ"));
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = uVar;
        this.appProcessDetails = list;
    }

    public static /* synthetic */ a h(a aVar, String str, String str2, String str3, String str4, u uVar, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = aVar.packageName;
        }
        if ((i5 & 2) != 0) {
            str2 = aVar.versionName;
        }
        String str5 = str2;
        if ((i5 & 4) != 0) {
            str3 = aVar.appBuildVersion;
        }
        String str6 = str3;
        if ((i5 & 8) != 0) {
            str4 = aVar.deviceManufacturer;
        }
        String str7 = str4;
        if ((i5 & 16) != 0) {
            uVar = aVar.currentProcessDetails;
        }
        u uVar2 = uVar;
        if ((i5 & 32) != 0) {
            list = aVar.appProcessDetails;
        }
        return aVar.g(str, str5, str6, str7, uVar2, list);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @d5.d
    /* renamed from: e, reason: from getter */
    public final u getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return kotlin.jvm.internal.l0.g(this.packageName, aVar.packageName) && kotlin.jvm.internal.l0.g(this.versionName, aVar.versionName) && kotlin.jvm.internal.l0.g(this.appBuildVersion, aVar.appBuildVersion) && kotlin.jvm.internal.l0.g(this.deviceManufacturer, aVar.deviceManufacturer) && kotlin.jvm.internal.l0.g(this.currentProcessDetails, aVar.currentProcessDetails) && kotlin.jvm.internal.l0.g(this.appProcessDetails, aVar.appProcessDetails);
    }

    @d5.d
    public final List<u> f() {
        return this.appProcessDetails;
    }

    @d5.d
    public final a g(@d5.d String packageName, @d5.d String versionName, @d5.d String appBuildVersion, @d5.d String deviceManufacturer, @d5.d u currentProcessDetails, @d5.d List<u> appProcessDetails) {
        kotlin.jvm.internal.l0.p(packageName, ProtectedSandApp.s("ᩅ"));
        kotlin.jvm.internal.l0.p(versionName, ProtectedSandApp.s("ᩆ"));
        kotlin.jvm.internal.l0.p(appBuildVersion, ProtectedSandApp.s("ᩇ"));
        kotlin.jvm.internal.l0.p(deviceManufacturer, ProtectedSandApp.s("ᩈ"));
        kotlin.jvm.internal.l0.p(currentProcessDetails, ProtectedSandApp.s("ᩉ"));
        kotlin.jvm.internal.l0.p(appProcessDetails, ProtectedSandApp.s("ᩊ"));
        return new a(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + ((this.deviceManufacturer.hashCode() + ((this.appBuildVersion.hashCode() + ((this.versionName.hashCode() + (this.packageName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @d5.d
    public final String i() {
        return this.appBuildVersion;
    }

    @d5.d
    public final List<u> j() {
        return this.appProcessDetails;
    }

    @d5.d
    public final u k() {
        return this.currentProcessDetails;
    }

    @d5.d
    public final String l() {
        return this.deviceManufacturer;
    }

    @d5.d
    public final String m() {
        return this.packageName;
    }

    @d5.d
    public final String n() {
        return this.versionName;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("ᩋ") + this.packageName + ProtectedSandApp.s("ᩌ") + this.versionName + ProtectedSandApp.s("ᩍ") + this.appBuildVersion + ProtectedSandApp.s("ᩎ") + this.deviceManufacturer + ProtectedSandApp.s("ᩏ") + this.currentProcessDetails + ProtectedSandApp.s("ᩐ") + this.appProcessDetails + ')';
    }
}

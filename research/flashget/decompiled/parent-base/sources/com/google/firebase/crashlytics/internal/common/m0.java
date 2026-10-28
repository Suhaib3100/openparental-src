package com.google.firebase.crashlytics.internal.common;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: FirebaseInstallationId.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/crashlytics/internal/common/m0;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/crashlytics/internal/common/m0;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String fid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String authToken;

    public m0(@fg.m String str, @fg.m String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public static m0 d(m0 m0Var, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = m0Var.fid;
        }
        if ((i4 & 2) != 0) {
            str2 = m0Var.authToken;
        }
        m0Var.getClass();
        return new m0(str, str2);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @fg.l
    public final m0 c(@fg.m String fid, @fg.m String authToken) {
        return new m0(fid, authToken);
    }

    @fg.m
    public final String e() {
        return this.authToken;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) other;
        return kotlin.jvm.internal.l0.g(this.fid, m0Var.fid) && kotlin.jvm.internal.l0.g(this.authToken, m0Var.authToken);
    }

    @fg.m
    public final String f() {
        return this.fid;
    }

    public int hashCode() {
        String str = this.fid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﱞ"));
        sb.append(this.fid);
        sb.append(ProtectedSandApp.s("ﱟ"));
        return f3.a(sb, this.authToken, ')');
    }
}

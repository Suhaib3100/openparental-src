package com.google.firebase.sessions;

import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/v;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "<init>", "(Ljava/lang/String;IIZ)V", "a", "()Ljava/lang/String;", "b", "()I", "c", "d", "()Z", "e", "(Ljava/lang/String;IIZ)Lcom/google/firebase/sessions/v;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "I", "h", "g", "Z", "j", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String processName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int importance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultProcess;

    public v(@fg.l String str, int i4, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("ծ\u0001"));
        this.processName = str;
        this.pid = i4;
        this.importance = i5;
        this.isDefaultProcess = z4;
    }

    public static /* synthetic */ v f(v vVar, String str, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = vVar.processName;
        }
        if ((i6 & 2) != 0) {
            i4 = vVar.pid;
        }
        if ((i6 & 4) != 0) {
            i5 = vVar.importance;
        }
        if ((i6 & 8) != 0) {
            z4 = vVar.isDefaultProcess;
        }
        return vVar.e(str, i4, i5, z4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* renamed from: b, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* renamed from: c, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    @fg.l
    public final v e(@fg.l String processName, int pid, int importance, boolean isDefaultProcess) {
        kotlin.jvm.internal.l0.p(processName, ProtectedSandApp.s("ծ\u0001"));
        return new v(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return kotlin.jvm.internal.l0.g(this.processName, vVar.processName) && this.pid == vVar.pid && this.importance == vVar.importance && this.isDefaultProcess == vVar.isDefaultProcess;
    }

    public final int g() {
        return this.importance;
    }

    public final int h() {
        return this.pid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a5 = w1.a(this.importance, w1.a(this.pid, this.processName.hashCode() * 31, 31), 31);
        boolean z4 = this.isDefaultProcess;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return a5 + i4;
    }

    @fg.l
    public final String i() {
        return this.processName;
    }

    public final boolean j() {
        return this.isDefaultProcess;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("կ\u0001"));
        sb.append(this.processName);
        sb.append(ProtectedSandApp.s("հ\u0001"));
        sb.append(this.pid);
        sb.append(ProtectedSandApp.s("ձ\u0001"));
        sb.append(this.importance);
        sb.append(ProtectedSandApp.s("ղ\u0001"));
        return androidx.compose.animation.l.a(sb, this.isDefaultProcess, ')');
    }
}

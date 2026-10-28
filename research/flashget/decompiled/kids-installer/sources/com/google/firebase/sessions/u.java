package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/u;", "", "", "a", "", "b", "c", "", "d", "processName", "pid", "importance", "isDefaultProcess", "e", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "I", "h", "()I", "g", "Z", "j", "()Z", "<init>", "(Ljava/lang/String;IIZ)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String processName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int importance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultProcess;

    public u(@d5.d String str, int i5, int i6, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u1ae5"));
        this.processName = str;
        this.pid = i5;
        this.importance = i6;
        this.isDefaultProcess = z5;
    }

    public static /* synthetic */ u f(u uVar, String str, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uVar.processName;
        }
        if ((i7 & 2) != 0) {
            i5 = uVar.pid;
        }
        if ((i7 & 4) != 0) {
            i6 = uVar.importance;
        }
        if ((i7 & 8) != 0) {
            z5 = uVar.isDefaultProcess;
        }
        return uVar.e(str, i5, i6, z5);
    }

    @d5.d
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

    @d5.d
    public final u e(@d5.d String processName, int pid, int importance, boolean isDefaultProcess) {
        kotlin.jvm.internal.l0.p(processName, ProtectedSandApp.s("\u1ae6"));
        return new u(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return kotlin.jvm.internal.l0.g(this.processName, uVar.processName) && this.pid == uVar.pid && this.importance == uVar.importance && this.isDefaultProcess == uVar.isDefaultProcess;
    }

    public final int g() {
        return this.importance;
    }

    public final int h() {
        return this.pid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (Integer.hashCode(this.importance) + ((Integer.hashCode(this.pid) + (this.processName.hashCode() * 31)) * 31)) * 31;
        boolean z5 = this.isDefaultProcess;
        int i5 = z5;
        if (z5 != 0) {
            i5 = 1;
        }
        return hashCode + i5;
    }

    @d5.d
    public final String i() {
        return this.processName;
    }

    public final boolean j() {
        return this.isDefaultProcess;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("\u1ae7") + this.processName + ProtectedSandApp.s("\u1ae8") + this.pid + ProtectedSandApp.s("\u1ae9") + this.importance + ProtectedSandApp.s("\u1aea") + this.isDefaultProcess + ')';
    }
}

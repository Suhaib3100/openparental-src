package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/sessions/v;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "Lcom/google/firebase/sessions/u;", "a", "Landroid/content/Context;", "context", "", "c", "d", "e", "()Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final v f18743a = new v();

    private v() {
    }

    private final u a(String processName, int pid, int importance, boolean isDefaultProcess) {
        return new u(processName, pid, importance, isDefaultProcess);
    }

    static u b(v vVar, String str, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        vVar.getClass();
        return new u(str, i5, i6, z5);
    }

    @d5.d
    public final List<u> c(@d5.d Context context) {
        List s22;
        int b02;
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("\u1aeb"));
        int i5 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(ProtectedSandApp.s("\u1aec"));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.f23167o;
        }
        s22 = kotlin.collections.j0.s2(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : s22) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i5) {
                arrayList.add(obj);
            }
        }
        b02 = kotlin.collections.b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.l0.o(str2, ProtectedSandApp.s("\u1aed"));
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.l0.g(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @d5.d
    public final u d(@d5.d Context context) {
        Object obj;
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("\u1aee"));
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).h() == myPid) {
                break;
            }
        }
        u uVar = (u) obj;
        return uVar == null ? b(this, e(), myPid, 0, false, 12, null) : uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L14
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "\u1aef"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        L14:
            r1 = 28
            if (r0 < r1) goto L1f
            java.lang.String r0 = com.google.firebase.crashlytics.internal.i.a()
            if (r0 == 0) goto L1f
            return r0
        L1f:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.v.e():java.lang.String");
    }
}

package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/w;", "", "<init>", "()V", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "Lcom/google/firebase/sessions/v;", "a", "(Ljava/lang/String;IIZ)Lcom/google/firebase/sessions/v;", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Ljava/util/List;", "d", "(Landroid/content/Context;)Lcom/google/firebase/sessions/v;", "e", "()Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n766#2:97\n857#2,2:98\n1549#2:100\n1620#2,3:101\n1#3:104\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n*L\n41#1:97\n41#1:98,2\n45#1:100\n45#1:101,3\n*E\n"})
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final w f61030a = new w();

    private w() {
    }

    private final v a(String processName, int pid, int importance, boolean isDefaultProcess) {
        return new v(processName, pid, importance, isDefaultProcess);
    }

    static v b(w wVar, String str, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        if ((i6 & 8) != 0) {
            z4 = false;
        }
        wVar.getClass();
        return new v(str, i4, i5, z4);
    }

    @fg.l
    public final List<v> c(@fg.l Context context) {
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("ճ\u0001"));
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(ProtectedSandApp.s("մ\u0001"));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = kotlin.collections.j0.f74919b;
        }
        List s22 = kotlin.collections.w.s2(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : s22) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.l0.o(str2, ProtectedSandApp.s("յ\u0001"));
            arrayList2.add(new v(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.l0.g(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @fg.l
    public final v d(@fg.l Context context) {
        Object obj;
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("ճ\u0001"));
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v) obj).h() == myPid) {
                break;
            }
        }
        v vVar = (v) obj;
        return vVar == null ? b(this, e(), myPid, 0, false, 12, null) : vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    @fg.l
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
            java.lang.String r0 = com.google.firebase.crashlytics.internal.i.a()
            java.lang.String r1 = "ն\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        L14:
            r1 = 28
            if (r0 < r1) goto L1f
            java.lang.String r0 = androidx.work.impl.utils.j.a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.w.e():java.lang.String");
    }
}

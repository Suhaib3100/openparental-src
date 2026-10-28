package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/crashlytics/internal/j;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "Lcom/google/firebase/crashlytics/internal/model/g0$f$d$a$c;", "f", "(Landroid/content/Context;)Ljava/util/List;", "g", "(Landroid/content/Context;)Lcom/google/firebase/crashlytics/internal/model/g0$f$d$a$c;", "processName", "", "pid", "importance", "", "isDefaultProcess", "d", "(Ljava/lang/String;IIZ)Lcom/google/firebase/crashlytics/internal/model/g0$f$d$a$c;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n766#2:93\n857#2,2:94\n1549#2:96\n1620#2,3:97\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n*L\n41#1:93\n41#1:94,2\n45#1:96\n45#1:97,3\n*E\n"})
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j f58890a = new j();

    private j() {
    }

    public static /* synthetic */ g0.f.d.a.c e(j jVar, String str, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        if ((i6 & 8) != 0) {
            z4 = false;
        }
        return jVar.d(str, i4, i5, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String h() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L14
            java.lang.String r0 = com.google.firebase.crashlytics.internal.i.a()
            java.lang.String r1 = "ﳦ"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            goto L21
        L14:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L20
            java.lang.String r0 = androidx.work.impl.utils.j.a()
            if (r0 != 0) goto L21
        L20:
            r0 = r2
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.j.h():java.lang.String");
    }

    @fg.l
    @kd.j
    public final g0.f.d.a.c a(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("ﳧ"));
        return e(this, str, 0, 0, false, 14, null);
    }

    @fg.l
    @kd.j
    public final g0.f.d.a.c b(@fg.l String str, int i4) {
        l0.p(str, ProtectedSandApp.s("ﳧ"));
        return e(this, str, i4, 0, false, 12, null);
    }

    @fg.l
    @kd.j
    public final g0.f.d.a.c c(@fg.l String str, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ﳧ"));
        return e(this, str, i4, i5, false, 8, null);
    }

    @fg.l
    @kd.j
    public final g0.f.d.a.c d(@fg.l String processName, int pid, int importance, boolean isDefaultProcess) {
        l0.p(processName, ProtectedSandApp.s("ﳧ"));
        g0.f.d.a.c a5 = g0.f.d.a.c.a().e(processName).d(pid).c(importance).b(isDefaultProcess).a();
        l0.o(a5, ProtectedSandApp.s("ﳨ"));
        return a5;
    }

    @fg.l
    public final List<g0.f.d.a.c> f(@fg.l Context context) {
        l0.p(context, ProtectedSandApp.s("ﳩ"));
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(ProtectedSandApp.s("ﳪ"));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = j0.f74919b;
        }
        List s22 = w.s2(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : s22) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.b0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(g0.f.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(l0.g(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    @fg.l
    public final g0.f.d.a.c g(@fg.l Context context) {
        Object obj;
        l0.p(context, ProtectedSandApp.s("ﳩ"));
        int myPid = Process.myPid();
        Iterator<T> it = f(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g0.f.d.a.c) obj).c() == myPid) {
                break;
            }
        }
        g0.f.d.a.c cVar = (g0.f.d.a.c) obj;
        return cVar == null ? e(this, h(), myPid, 0, false, 12, null) : cVar;
    }
}

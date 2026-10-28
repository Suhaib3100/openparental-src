package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J.\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/crashlytics/internal/j;", "", "", "h", "Landroid/content/Context;", "context", "", "Lcom/google/firebase/crashlytics/internal/model/f0$f$d$a$c;", "f", "g", "processName", "", "pid", "importance", "", "isDefaultProcess", "d", "<init>", "()V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final j f15788a = new j();

    private j() {
    }

    public static /* synthetic */ f0.f.d.a.c e(j jVar, String str, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        return jVar.d(str, i5, i6, z5);
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
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "ᓀ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            goto L21
        L14:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L20
            java.lang.String r0 = com.google.firebase.crashlytics.internal.i.a()
            if (r0 != 0) goto L21
        L20:
            r0 = r2
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.j.h():java.lang.String");
    }

    @d5.d
    @p3.j
    public final f0.f.d.a.c a(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("ᓁ"));
        return e(this, str, 0, 0, false, 14, null);
    }

    @d5.d
    @p3.j
    public final f0.f.d.a.c b(@d5.d String str, int i5) {
        l0.p(str, ProtectedSandApp.s("ᓂ"));
        return e(this, str, i5, 0, false, 12, null);
    }

    @d5.d
    @p3.j
    public final f0.f.d.a.c c(@d5.d String str, int i5, int i6) {
        l0.p(str, ProtectedSandApp.s("ᓃ"));
        return e(this, str, i5, i6, false, 8, null);
    }

    @d5.d
    @p3.j
    public final f0.f.d.a.c d(@d5.d String processName, int pid, int importance, boolean isDefaultProcess) {
        l0.p(processName, ProtectedSandApp.s("ᓄ"));
        f0.f.d.a.c a6 = f0.f.d.a.c.a().e(processName).d(pid).c(importance).b(isDefaultProcess).a();
        l0.o(a6, ProtectedSandApp.s("ᓅ"));
        return a6;
    }

    @d5.d
    public final List<f0.f.d.a.c> f(@d5.d Context context) {
        List s22;
        int b02;
        l0.p(context, ProtectedSandApp.s("ᓆ"));
        int i5 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(ProtectedSandApp.s("ᓇ"));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.f23167o;
        }
        s22 = j0.s2(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : s22) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i5) {
                arrayList.add(obj);
            }
        }
        b02 = b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(f0.f.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(l0.g(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    @d5.d
    public final f0.f.d.a.c g(@d5.d Context context) {
        Object obj;
        l0.p(context, ProtectedSandApp.s("ᓈ"));
        int myPid = Process.myPid();
        Iterator<T> it = f(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((f0.f.d.a.c) obj).c() == myPid) {
                break;
            }
        }
        f0.f.d.a.c cVar = (f0.f.d.a.c) obj;
        return cVar == null ? e(this, h(), myPid, 0, false, 12, null) : cVar;
    }
}

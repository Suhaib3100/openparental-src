package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EventReportCallback.java */
/* loaded from: classes6.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f71530a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f71531b;

    f(g gVar, long j4) {
        this.f71531b = gVar;
        this.f71530a = j4;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        com.tencent.beacon.event.a.a aVar;
        String str;
        String str2;
        h hVar;
        Set<Long> set2;
        h hVar2;
        StringBuilder sb = new StringBuilder();
        set = this.f71531b.f71532a;
        Iterator it = set.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String s4 = ProtectedSandApp.s("㌗\u0001");
            if (!hasNext) {
                String substring = sb.substring(0, sb.lastIndexOf(s4));
                aVar = this.f71531b.f71538g;
                str = this.f71531b.f71537f;
                boolean a5 = aVar.a(str, substring);
                str2 = this.f71531b.f71533b;
                com.tencent.beacon.base.util.c.a(str2, 4, ProtectedSandApp.s("㌘\u0001"), Boolean.valueOf(a5));
                hVar = this.f71531b.f71536e;
                set2 = this.f71531b.f71532a;
                hVar.a(set2);
                hVar2 = this.f71531b.f71536e;
                hVar2.a(this.f71530a);
                return;
            }
            sb.append((Long) it.next());
            sb.append(s4);
        }
    }
}

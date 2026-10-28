package com.tencent.beacon.event.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LogIDGenerator.java */
/* loaded from: classes6.dex */
class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f71490a = 0;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f71491b = 0;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f71492c = 0;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f71493d;

    e(g gVar) {
        this.f71493d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        AtomicLong atomicLong3;
        Context context;
        SharedPreferences a5;
        String str;
        long j4;
        long j5;
        long j6;
        long j7;
        long j10;
        long j11;
        long j12;
        long j13;
        String s4 = ProtectedSandApp.s("㋕\u0001");
        synchronized (this.f71493d) {
            try {
                atomicLong = this.f71493d.f71512r;
                long j14 = atomicLong.get();
                atomicLong2 = this.f71493d.f71511q;
                long j15 = atomicLong2.get();
                atomicLong3 = this.f71493d.f71513s;
                long j16 = atomicLong3.get();
                if (this.f71490a == j14 && this.f71491b == j15 && this.f71492c == j16) {
                    return;
                }
                this.f71490a = j14;
                this.f71491b = j15;
                this.f71492c = j16;
                g gVar = this.f71493d;
                context = gVar.f71507m;
                a5 = gVar.a(context);
                SharedPreferences.Editor edit = a5.edit();
                if (com.tencent.beacon.base.util.b.a(edit)) {
                    String s5 = ProtectedSandApp.s("㋖\u0001");
                    j5 = this.f71493d.f71510p;
                    SharedPreferences.Editor putLong = edit.putLong(s5, j5).putLong(ProtectedSandApp.s("㋗\u0001"), this.f71490a).putLong(ProtectedSandApp.s("㋘\u0001"), this.f71491b).putLong(ProtectedSandApp.s("㋙\u0001"), this.f71492c);
                    String s6 = ProtectedSandApp.s("㋚\u0001");
                    j6 = this.f71493d.f71514t;
                    SharedPreferences.Editor putLong2 = putLong.putLong(s6, j6);
                    String s7 = ProtectedSandApp.s("㋛\u0001");
                    j7 = this.f71493d.f71515u;
                    SharedPreferences.Editor putLong3 = putLong2.putLong(s7, j7);
                    String s10 = ProtectedSandApp.s("㋜\u0001");
                    j10 = this.f71493d.f71516v;
                    SharedPreferences.Editor putLong4 = putLong3.putLong(s10, j10);
                    String s11 = ProtectedSandApp.s("㋝\u0001");
                    j11 = this.f71493d.f71517w;
                    SharedPreferences.Editor putLong5 = putLong4.putLong(s11, j11);
                    String s12 = ProtectedSandApp.s("㋞\u0001");
                    j12 = this.f71493d.f71518x;
                    SharedPreferences.Editor putLong6 = putLong5.putLong(s12, j12);
                    String s13 = ProtectedSandApp.s("㋟\u0001");
                    j13 = this.f71493d.f71519y;
                    putLong6.putLong(s13, j13).apply();
                }
                StringBuilder sb = new StringBuilder(s4);
                str = this.f71493d.f71508n;
                sb.append(str);
                sb.append(ProtectedSandApp.s("㋠\u0001"));
                String sb2 = sb.toString();
                String s14 = ProtectedSandApp.s("㋡\u0001");
                j4 = this.f71493d.f71510p;
                com.tencent.beacon.base.util.c.a(sb2, s14, Long.valueOf(j4), Long.valueOf(this.f71490a), Long.valueOf(this.f71491b), Long.valueOf(this.f71492c));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

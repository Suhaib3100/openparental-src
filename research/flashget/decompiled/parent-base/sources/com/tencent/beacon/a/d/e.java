package com.tencent.beacon.a.d;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import java.nio.MappedByteBuffer;
import org.json.JSONObject;

/* compiled from: PropertiesFile.java */
/* loaded from: classes6.dex */
class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f71126a;

    e(g gVar) {
        this.f71126a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        JSONObject jSONObject;
        long j4;
        MappedByteBuffer mappedByteBuffer;
        MappedByteBuffer mappedByteBuffer2;
        MappedByteBuffer mappedByteBuffer3;
        MappedByteBuffer mappedByteBuffer4;
        long j5;
        try {
            obj = this.f71126a.f71129a;
            synchronized (obj) {
                try {
                    jSONObject = this.f71126a.f71131c;
                    byte[] a5 = g.a(jSONObject.toString().getBytes(ProtectedSandApp.s("\u3097\u0001")));
                    if (a5 == null) {
                        return;
                    }
                    long length = a5.length + 10;
                    j4 = this.f71126a.f71133e;
                    if (length > j4) {
                        this.f71126a.f71133e = a5.length + 10;
                        g gVar = this.f71126a;
                        j5 = gVar.f71133e;
                        gVar.a(j5);
                    }
                    mappedByteBuffer = this.f71126a.f71132d;
                    mappedByteBuffer.putInt(0, a5.length);
                    mappedByteBuffer2 = this.f71126a.f71132d;
                    mappedByteBuffer2.position(10);
                    mappedByteBuffer3 = this.f71126a.f71132d;
                    mappedByteBuffer3.put(a5);
                    mappedByteBuffer4 = this.f71126a.f71132d;
                    mappedByteBuffer4.force();
                } finally {
                }
            }
        } catch (Exception e4) {
            j.e().a(ProtectedSandApp.s("\u3098\u0001"), ProtectedSandApp.s("゙\u0001"), e4);
        }
    }
}

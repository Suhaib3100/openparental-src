package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36522a = androidx.work.s.f("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<PowerManager.WakeLock, String> f36523b = new WeakHashMap<>();

    private s() {
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f36523b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.s.c().h(f36522a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(@o0 Context context, @o0 String tag) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String a5 = androidx.constraintlayout.core.motion.key.c.a("WorkManager: ", tag);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, a5);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f36523b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, a5);
        }
        return newWakeLock;
    }
}

package com.tencent.beacon.a.d;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.util.h;
import com.tencent.beacon.base.util.i;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PropertiesFile.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private FileChannel f71130b;

    /* renamed from: d, reason: collision with root package name */
    private MappedByteBuffer f71132d;

    /* renamed from: e, reason: collision with root package name */
    private long f71133e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f71134f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f71135g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f71136h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f71129a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f71131c = new JSONObject();

    private g(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ゞ\u0001"));
        this.f71130b = randomAccessFile.getChannel();
        this.f71133e = randomAccessFile.length();
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("゠\u0001"), ProtectedSandApp.s("ゟ\u0001") + this.f71133e, new Object[0]);
        e();
    }

    private Object c(@o0 String str) {
        Object obj = null;
        try {
            synchronized (this.f71129a) {
                obj = this.f71131c.get(str);
            }
        } catch (Exception unused) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("゠\u0001"), androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("カ\u0001"), str), new Object[0]);
        }
        return obj;
    }

    private Runnable d() {
        if (this.f71134f == null) {
            this.f71134f = new e(this);
        }
        return this.f71134f;
    }

    private void e() throws IOException {
        String s4 = ProtectedSandApp.s("゠\u0001");
        if (this.f71133e <= 10) {
            this.f71136h = true;
            this.f71133e = 4L;
        }
        MappedByteBuffer map = this.f71130b.map(FileChannel.MapMode.READ_WRITE, 0L, this.f71133e);
        this.f71132d = map;
        map.rewind();
        if (this.f71136h) {
            this.f71132d.putInt(0, 1);
            a(d());
            return;
        }
        byte[] a5 = a(this.f71132d);
        if (a5 == null) {
            return;
        }
        try {
            this.f71131c = new JSONObject(new String(b(a5), ProtectedSandApp.s("キ\u0001")));
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("ギ\u0001") + e4.getMessage(), new Object[0]);
            j.e().a(ProtectedSandApp.s("ケ\u0001"), ProtectedSandApp.s("ク\u0001") + e4.getMessage() + ProtectedSandApp.s("グ\u0001") + this.f71133e, e4);
        }
        com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("ゲ\u0001") + this.f71131c.toString(), new Object[0]);
    }

    public static g a(Context context, String str) throws IOException {
        File file = new File(context.getFilesDir(), ProtectedSandApp.s("ァ\u0001"));
        if (!(!file.exists() ? file.mkdirs() : true)) {
            h.a(ProtectedSandApp.s("ア\u0001") + file.getName() + ProtectedSandApp.s("ィ\u0001"));
        }
        return new g(new File(file, androidx.compose.runtime.changelist.j.a(str, ProtectedSandApp.s("イ\u0001"))));
    }

    public static byte[] b(byte[] bArr) {
        byte[] a5 = a(bArr, ProtectedSandApp.s("ウ\u0001"));
        if (a5 != null) {
            return a5;
        }
        j.e().a(ProtectedSandApp.s("ォ\u0001"), ProtectedSandApp.s("オ\u0001"));
        byte[] a6 = a(bArr, com.tencent.beacon.a.c.g.e().a());
        return a6 != null ? a6 : a(bArr, "");
    }

    public synchronized void b(@o0 String str, @o0 Object obj) {
        Object c5;
        if (c()) {
            return;
        }
        try {
            c5 = c(str);
        } catch (Exception e4) {
            j.e().a(ProtectedSandApp.s("ケ\u0001"), ProtectedSandApp.s("ザ\u0001"), e4);
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ザ\u0001") + e4.getMessage(), new Object[0]);
        }
        if (c5 == null || !c5.equals(obj)) {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                if (!i.a((String) obj)) {
                    com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("サ\u0001"), new Object[0]);
                    return;
                }
            }
            synchronized (this.f71129a) {
                this.f71131c.put(str, obj);
            }
            a(d());
        }
    }

    private boolean c() {
        if (!this.f71135g) {
            return false;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("゠\u0001"), ProtectedSandApp.s("ガ\u0001"), new Object[0]);
        return true;
    }

    private static byte[] a(byte[] bArr, String str) {
        try {
            return com.tencent.beacon.base.net.b.c.a(3, str, bArr);
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            j.e().a(ProtectedSandApp.s("エ\u0001"), ProtectedSandApp.s("ェ\u0001") + str, th);
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws Exception {
        return com.tencent.beacon.base.net.b.c.b(3, ProtectedSandApp.s("ウ\u0001"), bArr);
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt(0);
        if (i4 <= 1 || i4 > 2097152 || byteBuffer.capacity() <= 10) {
            return null;
        }
        byteBuffer.position(10);
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr, 0, i4);
        return bArr;
    }

    public synchronized <T> void b(@o0 String str, @o0 Set<T> set) {
        try {
            if (c()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                Iterator<T> it = set.iterator();
                for (int i4 = 0; i4 < set.size(); i4++) {
                    if (it.hasNext()) {
                        jSONObject.put(String.valueOf(i4), it.next());
                    }
                }
                b(str, jSONObject);
            } catch (JSONException e4) {
                com.tencent.beacon.base.util.c.a(e4);
                j.e().a(ProtectedSandApp.s("ケ\u0001"), ProtectedSandApp.s("シ\u0001"), e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T> T a(@o0 String str, @o0 T t4) {
        if (c()) {
            return t4;
        }
        Object c5 = c(str);
        if (c5 != null) {
            t4 = (T) c5;
        }
        return t4;
    }

    public synchronized <T> Set<T> a(@o0 String str, @q0 Set<T> set) {
        JSONObject jSONObject;
        try {
            if (c()) {
                return set;
            }
            try {
                HashSet hashSet = new HashSet();
                synchronized (this.f71129a) {
                    jSONObject = this.f71131c.getJSONObject(str);
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        hashSet.add(jSONObject.get(keys.next()));
                    }
                }
                if (!hashSet.isEmpty()) {
                    set = hashSet;
                }
            } catch (JSONException e4) {
                j.e().a(ProtectedSandApp.s("ケ\u0001"), ProtectedSandApp.s("コ\u0001"), e4);
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ゴ\u0001") + e4.getMessage(), new Object[0]);
            }
            return set;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(String str) {
        synchronized (this.f71129a) {
            this.f71131c.remove(str);
        }
        a(d());
    }

    public Map<String, ?> b() {
        synchronized (this.f71129a) {
            JSONObject jSONObject = this.f71131c;
            if (jSONObject == null) {
                return null;
            }
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    hashMap.put(next, this.f71131c.get(next));
                } catch (JSONException e4) {
                    com.tencent.beacon.base.util.c.a(e4);
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j4) throws IOException {
        if (j4 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            this.f71132d.rewind();
            this.f71132d = this.f71130b.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ゥ\u0001"));
    }

    private void a(Runnable runnable) {
        com.tencent.beacon.a.b.b.a().a(new f(this, runnable));
    }

    public synchronized void a() {
        this.f71131c = new JSONObject();
        a(d());
    }

    public boolean a(String str) {
        synchronized (this.f71129a) {
            try {
                Iterator<String> keys = this.f71131c.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        if (str.equals(keys.next())) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

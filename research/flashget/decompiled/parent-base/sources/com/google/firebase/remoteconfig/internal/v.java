package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigStorageClient.java */
@androidx.annotation.d
/* loaded from: classes6.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f60603a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60604b;

    /* renamed from: d, reason: collision with root package name */
    private static final String f60602d = ProtectedSandApp.s("μ\u0001");

    /* renamed from: c, reason: collision with root package name */
    @b0("ConfigStorageClient.class")
    private static final Map<String, v> f60601c = new HashMap();

    private v(Context context, String str) {
        this.f60603a = context;
        this.f60604b = str;
    }

    @m1
    public static synchronized void b() {
        synchronized (v.class) {
            f60601c.clear();
        }
    }

    public static synchronized v d(Context context, String str) {
        v vVar;
        synchronized (v.class) {
            try {
                Map<String, v> map = f60601c;
                if (!map.containsKey(str)) {
                    map.put(str, new v(context, str));
                }
                vVar = map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public synchronized Void a() {
        this.f60603a.deleteFile(this.f60604b);
        return null;
    }

    String c() {
        return this.f60604b;
    }

    @zc.h
    public synchronized h e() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f60603a.openFileInput(this.f60604b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            h b5 = h.b(new JSONObject(new String(bArr, ProtectedSandApp.s("μ\u0001"))));
            fileInputStream.close();
            return b5;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void f(h hVar) throws IOException {
        FileOutputStream openFileOutput = this.f60603a.openFileOutput(this.f60604b, 0);
        try {
            openFileOutput.write(hVar.toString().getBytes(ProtectedSandApp.s("μ\u0001")));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}

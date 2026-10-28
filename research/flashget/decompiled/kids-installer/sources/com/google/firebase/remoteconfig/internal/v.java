package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigStorageClient.java */
@androidx.annotation.d
/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18057a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18058b;

    /* renamed from: d, reason: collision with root package name */
    private static final String f18056d = ProtectedSandApp.s("ᧃ");

    /* renamed from: c, reason: collision with root package name */
    @b0("ConfigStorageClient.class")
    private static final Map<String, v> f18055c = new HashMap();

    private v(Context context, String str) {
        this.f18057a = context;
        this.f18058b = str;
    }

    @m1
    public static synchronized void b() {
        synchronized (v.class) {
            f18055c.clear();
        }
    }

    public static synchronized v d(Context context, String str) {
        v vVar;
        synchronized (v.class) {
            Map<String, v> map = f18055c;
            if (!map.containsKey(str)) {
                map.put(str, new v(context, str));
            }
            vVar = map.get(str);
        }
        return vVar;
    }

    public synchronized Void a() {
        this.f18057a.deleteFile(this.f18058b);
        return null;
    }

    String c() {
        return this.f18058b;
    }

    @Nullable
    public synchronized h e() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f18057a.openFileInput(this.f18058b);
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
            h b6 = h.b(new JSONObject(new String(bArr, ProtectedSandApp.s("ᧄ"))));
            fileInputStream.close();
            return b6;
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
        FileOutputStream openFileOutput = this.f18057a.openFileOutput(this.f18058b, 0);
        try {
            openFileOutput.write(hVar.toString().getBytes(ProtectedSandApp.s("ᧅ")));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}

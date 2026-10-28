package com.github.gzuliyujiang.oaid;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.impl.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: DeviceID.java */
/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private Application f12195a;

    /* renamed from: b, reason: collision with root package name */
    private String f12196b;

    /* renamed from: c, reason: collision with root package name */
    private String f12197c;

    /* compiled from: DeviceID.java */
    /* loaded from: classes2.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final c f12198a = new c(null);

        private b() {
        }
    }

    private c() {
    }

    public static String c(String str, String algorithm) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(algorithm).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b6 : digest) {
                sb.append(String.format(ProtectedSandApp.s("Ọ"), Byte.valueOf(b6)));
            }
            return sb.toString();
        } catch (Exception e6) {
            g.b(e6);
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String d(Context context) {
        String string;
        return (context == null || (string = Settings.Secure.getString(context.getContentResolver(), ProtectedSandApp.s("ọ"))) == null || ProtectedSandApp.s("Ỏ").equals(string)) ? "" : string;
    }

    public static String e() {
        String str = b.f12198a.f12196b;
        return str == null ? "" : str;
    }

    public static String f() {
        return c(e(), ProtectedSandApp.s("ỏ"));
    }

    public static String g() {
        return c(e(), ProtectedSandApp.s("Ố"));
    }

    public static String h(Context context) {
        String q5 = q(context);
        if (TextUtils.isEmpty(q5)) {
            q5 = o(context);
        }
        if (TextUtils.isEmpty(q5)) {
            q5 = p(context);
        }
        if (!TextUtils.isEmpty(q5)) {
            return q5;
        }
        String uuid = UUID.randomUUID().toString();
        g.b(ProtectedSandApp.s("ố") + uuid);
        u(context, uuid);
        v(context, uuid);
        t(context, uuid);
        return uuid;
    }

    private static File i(Context context) {
        boolean z5 = false;
        if (Build.VERSION.SDK_INT < 30 && context != null && context.checkSelfPermission(ProtectedSandApp.s("Ồ")) == 0) {
            z5 = true;
        }
        if (z5 && ProtectedSandApp.s("ồ").equals(Environment.getExternalStorageState())) {
            return new File(Environment.getExternalStorageDirectory(), ProtectedSandApp.s("Ổ"));
        }
        return null;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static String j(Context context) {
        String imei;
        String meid;
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(ProtectedSandApp.s("ổ"));
            imei = telephonyManager.getImei();
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            meid = telephonyManager.getMeid();
            return meid;
        } catch (Error e6) {
            g.b(e6);
            return "";
        } catch (Exception e7) {
            g.b(e7);
            return "";
        }
    }

    public static String k() {
        String str = b.f12198a.f12197c;
        return str == null ? "" : str;
    }

    public static void l(Context context, e getter) {
        l.a(context).b(getter);
    }

    public static String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BOARD.length() % 10);
        sb.append(Arrays.deepToString(Build.SUPPORTED_ABIS).length() % 10);
        sb.append(Build.DEVICE.length() % 10);
        sb.append(Build.DISPLAY.length() % 10);
        sb.append(Build.HOST.length() % 10);
        sb.append(Build.ID.length() % 10);
        sb.append(Build.MANUFACTURER.length() % 10);
        sb.append(Build.BRAND.length() % 10);
        sb.append(Build.MODEL.length() % 10);
        sb.append(Build.PRODUCT.length() % 10);
        sb.append(Build.BOOTLOADER.length() % 10);
        sb.append(Build.HARDWARE.length() % 10);
        sb.append(Build.TAGS.length() % 10);
        sb.append(Build.TYPE.length() % 10);
        sb.append(Build.USER.length() % 10);
        return sb.toString();
    }

    public static String n(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            g.b(ProtectedSandApp.s("Ỗ"));
            return "";
        }
        if (context == null) {
            return "";
        }
        if (context.checkSelfPermission(ProtectedSandApp.s("ỗ")) == 0) {
            return j(context);
        }
        g.b(ProtectedSandApp.s("Ộ"));
        return "";
    }

    private static String o(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        File i5 = i(context);
        if (i5 != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(i5));
                try {
                    str = bufferedReader.readLine();
                    bufferedReader.close();
                } finally {
                }
            } catch (Exception e6) {
                g.b(e6);
            }
        }
        g.b(ProtectedSandApp.s("ộ") + str);
        return str;
    }

    private static String p(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getSharedPreferences(ProtectedSandApp.s("Ớ"), 0).getString(ProtectedSandApp.s("ớ"), "");
        g.b(ProtectedSandApp.s("Ờ") + string);
        return string;
    }

    private static String q(Context context) {
        if (context == null) {
            return "";
        }
        String string = Settings.System.getString(context.getContentResolver(), ProtectedSandApp.s("ờ"));
        g.b(ProtectedSandApp.s("Ở") + string);
        return string;
    }

    public static String r() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray(ProtectedSandApp.s("ở"));
            if (propertyByteArray == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (byte b6 : propertyByteArray) {
                sb.append(String.format(ProtectedSandApp.s("Ỡ"), Byte.valueOf(b6)));
            }
            return sb.toString();
        } catch (Error e6) {
            g.b(e6);
            return "";
        } catch (Exception e7) {
            g.b(e7);
            return "";
        }
    }

    public static void s(Application application) {
        if (application == null) {
            return;
        }
        c cVar = b.f12198a;
        cVar.f12195a = application;
        String n5 = n(application);
        if (TextUtils.isEmpty(n5)) {
            l(application, cVar);
            return;
        }
        cVar.f12196b = n5;
        g.b(ProtectedSandApp.s("ỡ") + cVar.f12196b);
    }

    private static void t(Context context, String uuid) {
        String s5 = ProtectedSandApp.s("Ợ");
        if (context == null) {
            return;
        }
        File i5 = i(context);
        if (i5 == null) {
            g.b(ProtectedSandApp.s("ợ"));
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(i5));
            try {
                if (!i5.exists()) {
                    i5.createNewFile();
                }
                bufferedWriter.write(uuid);
                bufferedWriter.flush();
                g.b(s5 + uuid);
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e6) {
            g.b(e6);
        }
    }

    private static void u(Context context, String uuid) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences(ProtectedSandApp.s("Ụ"), 0).edit().putString(ProtectedSandApp.s("ụ"), uuid).apply();
        g.b(ProtectedSandApp.s("Ủ") + uuid);
    }

    private static void v(Context context, String uuid) {
        String s5 = ProtectedSandApp.s("ủ");
        if (context == null) {
            return;
        }
        if (!Settings.System.canWrite(context)) {
            g.b(ProtectedSandApp.s("ứ"));
            return;
        }
        try {
            Settings.System.putString(context.getContentResolver(), ProtectedSandApp.s("Ứ"), uuid);
            g.b(s5 + uuid);
        } catch (Exception e6) {
            g.b(e6);
        }
    }

    public static boolean w(Context context) {
        return l.a(context).a();
    }

    @Override // com.github.gzuliyujiang.oaid.e
    public void a(String result) {
        if (TextUtils.isEmpty(result)) {
            b(new OAIDException(ProtectedSandApp.s("Ừ")));
            return;
        }
        this.f12196b = result;
        this.f12197c = result;
        g.b(ProtectedSandApp.s("ừ") + this.f12196b);
    }

    @Override // com.github.gzuliyujiang.oaid.e
    public void b(Exception error) {
        String r5 = r();
        if (!TextUtils.isEmpty(r5)) {
            this.f12196b = r5;
            g.b(ProtectedSandApp.s("Ử") + this.f12196b);
            return;
        }
        String d6 = d(this.f12195a);
        if (TextUtils.isEmpty(d6)) {
            this.f12196b = h(this.f12195a);
            g.b(ProtectedSandApp.s("Ữ") + this.f12196b);
            return;
        }
        this.f12196b = d6;
        g.b(ProtectedSandApp.s("ử") + this.f12196b);
    }

    c(a aVar) {
    }
}

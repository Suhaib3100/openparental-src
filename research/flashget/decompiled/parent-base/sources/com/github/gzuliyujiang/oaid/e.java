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
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private Application f50121a;

    /* renamed from: b, reason: collision with root package name */
    private String f50122b;

    /* renamed from: c, reason: collision with root package name */
    private String f50123c;

    /* compiled from: DeviceID.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final e f50124a = new e();

        private b() {
        }
    }

    private e() {
    }

    public static String c(String str, String algorithm) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(algorithm).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                sb.append(String.format(ProtectedSandApp.s("썐"), Byte.valueOf(b5)));
            }
            return sb.toString();
        } catch (Exception e4) {
            i.b(e4);
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String d(Context context) {
        String string;
        return (context == null || (string = Settings.Secure.getString(context.getContentResolver(), ProtectedSandApp.s("썑"))) == null || ProtectedSandApp.s("썒").equals(string)) ? "" : string;
    }

    public static String e() {
        String str = b.f50124a.f50122b;
        return str == null ? "" : str;
    }

    public static String f() {
        return c(e(), ProtectedSandApp.s("썓"));
    }

    public static String g() {
        return c(e(), ProtectedSandApp.s("썔"));
    }

    public static String h(Context context) {
        String q4 = q(context);
        if (TextUtils.isEmpty(q4)) {
            q4 = o(context);
        }
        if (TextUtils.isEmpty(q4)) {
            q4 = p(context);
        }
        if (!TextUtils.isEmpty(q4)) {
            return q4;
        }
        String uuid = UUID.randomUUID().toString();
        i.b(ProtectedSandApp.s("썕") + uuid);
        u(context, uuid);
        v(context, uuid);
        t(context, uuid);
        return uuid;
    }

    private static File i(Context context) {
        if (Build.VERSION.SDK_INT < 30 && context != null && context.checkSelfPermission(ProtectedSandApp.s("썖")) == 0 && ProtectedSandApp.s("썗").equals(Environment.getExternalStorageState())) {
            return new File(Environment.getExternalStorageDirectory(), ProtectedSandApp.s("썘"));
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
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(ProtectedSandApp.s("썙"));
            imei = telephonyManager.getImei();
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            meid = telephonyManager.getMeid();
            return meid;
        } catch (Error e4) {
            i.b(e4);
            return "";
        } catch (Exception e5) {
            i.b(e5);
            return "";
        }
    }

    public static String k() {
        String str = b.f50124a.f50123c;
        return str == null ? "" : str;
    }

    public static void l(Context context, g getter) {
        l.a(context).b(getter);
    }

    public static String m() {
        StringBuilder sb = new StringBuilder();
        d.a(Build.BOARD, 10, sb);
        d.a(Arrays.deepToString(Build.SUPPORTED_ABIS), 10, sb);
        d.a(Build.DEVICE, 10, sb);
        d.a(Build.DISPLAY, 10, sb);
        d.a(Build.HOST, 10, sb);
        d.a(Build.ID, 10, sb);
        d.a(Build.MANUFACTURER, 10, sb);
        d.a(Build.BRAND, 10, sb);
        d.a(Build.MODEL, 10, sb);
        d.a(Build.PRODUCT, 10, sb);
        d.a(Build.BOOTLOADER, 10, sb);
        d.a(Build.HARDWARE, 10, sb);
        d.a(Build.TAGS, 10, sb);
        d.a(Build.TYPE, 10, sb);
        sb.append(Build.USER.length() % 10);
        return sb.toString();
    }

    public static String n(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(ProtectedSandApp.s("썚"));
            return "";
        }
        if (context == null) {
            return "";
        }
        if (context.checkSelfPermission(ProtectedSandApp.s("썛")) == 0) {
            return j(context);
        }
        i.b(ProtectedSandApp.s("썜"));
        return "";
    }

    private static String o(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        File i4 = i(context);
        if (i4 != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(i4));
                try {
                    str = bufferedReader.readLine();
                    bufferedReader.close();
                } finally {
                }
            } catch (Exception e4) {
                i.b(e4);
            }
        }
        i.b(ProtectedSandApp.s("썝") + str);
        return str;
    }

    private static String p(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getSharedPreferences(ProtectedSandApp.s("썞"), 0).getString(ProtectedSandApp.s("썟"), "");
        i.b(ProtectedSandApp.s("썠") + string);
        return string;
    }

    private static String q(Context context) {
        if (context == null) {
            return "";
        }
        String string = Settings.System.getString(context.getContentResolver(), ProtectedSandApp.s("썡"));
        i.b(ProtectedSandApp.s("썢") + string);
        return string;
    }

    public static String r() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray(ProtectedSandApp.s("썣"));
            if (propertyByteArray == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (byte b5 : propertyByteArray) {
                sb.append(String.format(ProtectedSandApp.s("썐"), Byte.valueOf(b5)));
            }
            return sb.toString();
        } catch (Error e4) {
            i.b(e4);
            return "";
        } catch (Exception e5) {
            i.b(e5);
            return "";
        }
    }

    public static void s(Application application) {
        if (application == null) {
            return;
        }
        e eVar = b.f50124a;
        eVar.f50121a = application;
        String n4 = n(application);
        if (TextUtils.isEmpty(n4)) {
            l(application, eVar);
            return;
        }
        eVar.f50122b = n4;
        i.b(ProtectedSandApp.s("썤") + eVar.f50122b);
    }

    private static void t(Context context, String uuid) {
        String s4 = ProtectedSandApp.s("썥");
        if (context == null) {
            return;
        }
        File i4 = i(context);
        if (i4 == null) {
            i.b(ProtectedSandApp.s("썦"));
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(i4));
            try {
                if (!i4.exists()) {
                    i4.createNewFile();
                }
                bufferedWriter.write(uuid);
                bufferedWriter.flush();
                i.b(s4 + uuid);
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e4) {
            i.b(e4);
        }
    }

    private static void u(Context context, String uuid) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences(ProtectedSandApp.s("썞"), 0).edit().putString(ProtectedSandApp.s("썟"), uuid).apply();
        i.b(ProtectedSandApp.s("썧") + uuid);
    }

    private static void v(Context context, String uuid) {
        String s4 = ProtectedSandApp.s("써");
        if (context == null) {
            return;
        }
        if (!Settings.System.canWrite(context)) {
            i.b(ProtectedSandApp.s("썩"));
            return;
        }
        try {
            Settings.System.putString(context.getContentResolver(), ProtectedSandApp.s("썡"), uuid);
            i.b(s4 + uuid);
        } catch (Exception e4) {
            i.b(e4);
        }
    }

    public static boolean w(Context context) {
        return l.a(context).a();
    }

    @Override // com.github.gzuliyujiang.oaid.g
    public void a(String result) {
        if (TextUtils.isEmpty(result)) {
            b(new OAIDException(ProtectedSandApp.s("썪")));
            return;
        }
        this.f50122b = result;
        this.f50123c = result;
        i.b(ProtectedSandApp.s("썫") + this.f50122b);
    }

    @Override // com.github.gzuliyujiang.oaid.g
    public void b(Exception error) {
        String r4 = r();
        if (!TextUtils.isEmpty(r4)) {
            this.f50122b = r4;
            i.b(ProtectedSandApp.s("썬") + this.f50122b);
            return;
        }
        String d5 = d(this.f50121a);
        if (TextUtils.isEmpty(d5)) {
            this.f50122b = h(this.f50121a);
            i.b(ProtectedSandApp.s("썮") + this.f50122b);
            return;
        }
        this.f50122b = d5;
        i.b(ProtectedSandApp.s("썭") + this.f50122b);
    }

    e(a aVar) {
    }
}

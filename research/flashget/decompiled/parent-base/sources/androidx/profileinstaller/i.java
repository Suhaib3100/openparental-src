package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.profileinstaller.i;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* compiled from: ProfileInstaller.java */
/* loaded from: classes3.dex */
public class i {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;

    /* renamed from: a, reason: collision with root package name */
    private static final String f32762a = "ProfileInstaller";

    /* renamed from: b, reason: collision with root package name */
    private static final String f32763b = "/data/misc/profiles/cur/0";

    /* renamed from: c, reason: collision with root package name */
    private static final String f32764c = "primary.prof";

    /* renamed from: d, reason: collision with root package name */
    private static final String f32765d = "dexopt/baseline.prof";

    /* renamed from: e, reason: collision with root package name */
    private static final String f32766e = "dexopt/baseline.profm";

    /* renamed from: f, reason: collision with root package name */
    private static final String f32767f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: g, reason: collision with root package name */
    private static final d f32768g = new a();

    /* renamed from: h, reason: collision with root package name */
    @o0
    static final d f32769h = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final int f32770i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f32771j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f32772k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f32773l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f32774m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f32775n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f32776o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f32777p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f32778q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f32779r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f32780s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f32781t = 7;

    /* renamed from: u, reason: collision with root package name */
    public static final int f32782u = 8;

    /* renamed from: v, reason: collision with root package name */
    public static final int f32783v = 9;

    /* renamed from: w, reason: collision with root package name */
    public static final int f32784w = 10;

    /* renamed from: x, reason: collision with root package name */
    public static final int f32785x = 11;

    /* renamed from: y, reason: collision with root package name */
    public static final int f32786y = 12;

    /* renamed from: z, reason: collision with root package name */
    public static final int f32787z = 13;

    /* compiled from: ProfileInstaller.java */
    class a implements d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i4, @q0 Object obj) {
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i4, @q0 Object obj) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        static final String f32788a = "ProfileInstaller";

        b() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i4, @q0 Object obj) {
            if (i4 == 6 || i4 == 7 || i4 == 8) {
            }
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i4, @q0 Object obj) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: ProfileInstaller.java */
    public interface d {
        void a(int i4, @q0 Object obj);

        void b(int i4, @q0 Object obj);
    }

    /* compiled from: ProfileInstaller.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    private i() {
    }

    @c1({c1.a.LIBRARY})
    static boolean c(@o0 File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    @n1
    static void d(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        c(context.getFilesDir());
        j(executor, dVar, 11, null);
    }

    static void e(@o0 Executor executor, @o0 final d dVar, final int i4, @q0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                i.d.this.b(i4, obj);
            }
        });
    }

    @n1
    @c1({c1.a.LIBRARY})
    static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z4 = readLong == packageInfo.lastUpdateTime;
                if (z4) {
                    dVar.a(2, null);
                }
                return z4;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @c1({c1.a.LIBRARY})
    static void i(@o0 PackageInfo packageInfo, @o0 File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    static void j(@o0 Executor executor, @o0 final d dVar, final int i4, @q0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.g
            @Override // java.lang.Runnable
            public final void run() {
                i.d.this.a(i4, obj);
            }
        });
    }

    private static boolean k(@o0 AssetManager assetManager, @o0 String str, @o0 PackageInfo packageInfo, @o0 File file, @o0 String str2, @o0 Executor executor, @o0 d dVar) {
        androidx.profileinstaller.c cVar = new androidx.profileinstaller.c(assetManager, executor, dVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!cVar.e()) {
            return false;
        }
        boolean n4 = cVar.i().m().n();
        if (n4) {
            i(packageInfo, file);
        }
        return n4;
    }

    @n1
    public static void l(@o0 Context context) {
        n(context, new androidx.credentials.k(), f32768g, false);
    }

    @n1
    public static void m(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        n(context, executor, dVar, false);
    }

    @n1
    static void n(@o0 Context context, @o0 Executor executor, @o0 d dVar, boolean z4) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z5 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4 && f(packageInfo, filesDir, dVar)) {
                context.getPackageName();
                o.e(context, false);
                return;
            }
            context.getPackageName();
            if (k(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z4) {
                z5 = true;
            }
            o.e(context, z5);
        } catch (PackageManager.NameNotFoundException e4) {
            dVar.a(7, e4);
            o.e(context, false);
        }
    }

    @n1
    static void o(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        try {
            i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            j(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e4) {
            j(executor, dVar, 7, e4);
        }
    }
}

package com.androidquery.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: AQUtility.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f41198a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Object f41199b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f41200c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, Long> f41201d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static Handler f41202e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final int f41203f = 4096;

    /* renamed from: g, reason: collision with root package name */
    private static ScheduledExecutorService f41204g;

    /* renamed from: h, reason: collision with root package name */
    private static File f41205h;

    /* renamed from: i, reason: collision with root package name */
    private static File f41206i;

    /* renamed from: j, reason: collision with root package name */
    private static Context f41207j;

    /* compiled from: AQUtility.java */
    /* renamed from: com.androidquery.util.a$a, reason: collision with other inner class name */
    static class RunnableC0682a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f41208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class[] f41210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f41211e;

        RunnableC0682a(Object obj, String str, Class[] clsArr, Object[] objArr) {
            this.f41208b = obj;
            this.f41209c = str;
            this.f41210d = clsArr;
            this.f41211e = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.C(this.f41208b, this.f41209c, false, true, this.f41210d, this.f41211e);
        }
    }

    /* compiled from: AQUtility.java */
    static class b extends AsyncTask<Void, Void, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f41212a;

        b(Runnable runnable) {
            this.f41212a = runnable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            try {
                this.f41212a.run();
                return null;
            } catch (Exception e4) {
                a.R(e4);
                return null;
            }
        }
    }

    /* compiled from: AQUtility.java */
    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f41213b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41214c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class[] f41215d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f41216e;

        c(Object obj, String str, Class[] clsArr, Object[] objArr) {
            this.f41213b = obj;
            this.f41214c = str;
            this.f41215d = clsArr;
            this.f41216e = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.C(this.f41213b, this.f41214c, false, true, this.f41215d, this.f41216e);
        }
    }

    public static File A() {
        File file = new File(Environment.getExternalStorageDirectory(), ProtectedSandApp.s("ޥ"));
        file.mkdirs();
        if (file.exists() && file.canWrite()) {
            return file;
        }
        return null;
    }

    public static Object B(Object obj, String str, boolean z4, boolean z5, Class<?>[] clsArr, Class<?>[] clsArr2, Object... objArr) {
        try {
            return D(obj, str, z4, clsArr, clsArr2, objArr);
        } catch (Exception e4) {
            if (z5) {
                R(e4);
                return null;
            }
            k(e4);
            return null;
        }
    }

    public static Object C(Object obj, String str, boolean z4, boolean z5, Class<?>[] clsArr, Object... objArr) {
        return B(obj, str, z4, z5, clsArr, null, objArr);
    }

    private static Object D(Object obj, String str, boolean z4, Class<?>[] clsArr, Class<?>[] clsArr2, Object... objArr) throws Exception {
        if (obj != null && str != null) {
            if (clsArr == null) {
                try {
                    clsArr = new Class[0];
                } catch (NoSuchMethodException unused) {
                    if (z4) {
                        try {
                            return clsArr2 == null ? obj.getClass().getMethod(str, null).invoke(obj, null) : obj.getClass().getMethod(str, clsArr2).invoke(obj, objArr);
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                }
            }
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        }
        return null;
    }

    public static boolean E() {
        return f41198a;
    }

    public static boolean F() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    private static void G(File file) {
        file.setLastModified(System.currentTimeMillis());
    }

    private static File H(File file, String str) {
        return new File(file, str);
    }

    public static float I(Context context, float f4) {
        return f4 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static void J(Object obj, String str) {
        K(obj, str, new Class[0], new Object[0]);
    }

    public static void K(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        L(new RunnableC0682a(obj, str, clsArr, objArr));
    }

    public static void L(Runnable runnable) {
        x().post(runnable);
    }

    public static void M(Object obj, String str) {
        N(obj, str, new Class[0], new Object[0]);
    }

    public static void N(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        O(new c(obj, str, clsArr, objArr));
    }

    public static void O(Runnable runnable) {
        new b(runnable).execute(new Void[0]);
    }

    public static void P(Runnable runnable, long j4) {
        x().postDelayed(runnable, j4);
    }

    public static void Q(Runnable runnable) {
        x().removeCallbacks(runnable);
    }

    public static void R(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            e0(ProtectedSandApp.s("ަ"), Log.getStackTraceString(th));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f41200c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private static void S(View view, float f4) {
        if (f4 == 1.0f) {
            view.clearAnimation();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f4);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void T(File file) {
        f41205h = file;
        if (file != null) {
            file.mkdirs();
        }
    }

    public static void U(Application application) {
        f41207j = application.getApplicationContext();
    }

    public static void V(boolean z4) {
        f41198a = z4;
    }

    public static void W(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        f41200c = uncaughtExceptionHandler;
    }

    public static void X(File file, byte[] bArr) {
        if (file != null) {
            try {
                f0(file, bArr);
            } catch (Exception e4) {
                R(e4);
            }
        }
    }

    public static void Y(File file, byte[] bArr, long j4) {
        w().schedule(new com.androidquery.util.c().t(1, file, bArr), j4, TimeUnit.MILLISECONDS);
    }

    private static boolean Z(File[] fileArr, long j4) {
        long j5 = 0;
        for (File file : fileArr) {
            j5 += file.length();
            if (j5 > j4) {
                return true;
            }
        }
        return false;
    }

    public static void a(SharedPreferences.Editor editor) {
        if (d.N >= 9) {
            B(editor, ProtectedSandApp.s("ާ"), false, true, null, null, null);
        } else {
            editor.commit();
        }
    }

    public static void a0(String str) {
        f41201d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static void b(File file, long j4, long j5) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            Arrays.sort(listFiles, new com.androidquery.util.c());
            if (Z(listFiles, j4)) {
                c(listFiles, j5);
            }
            File A = A();
            if (A == null || !A.exists()) {
                return;
            }
            c(A.listFiles(), 0L);
        } catch (Exception e4) {
            R(e4);
        }
    }

    public static long b0(String str, long j4) {
        Long l4 = f41201d.get(str);
        if (l4 == null) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
        if (j4 == 0 || currentTimeMillis > j4) {
            j(str, Long.valueOf(currentTimeMillis));
        }
        return currentTimeMillis;
    }

    private static void c(File[] fileArr, long j4) {
        long j5 = 0;
        int i4 = 0;
        for (File file : fileArr) {
            if (file.isFile()) {
                long length = file.length() + j5;
                if (length >= j4) {
                    file.delete();
                    i4++;
                }
                j5 = length;
            }
        }
        j(ProtectedSandApp.s("ި"), Integer.valueOf(i4));
    }

    public static byte[] c0(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(inputStream, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            R(e4);
            bArr = null;
        }
        f(inputStream);
        return bArr;
    }

    public static void d(Context context) {
        e(context, 3000000L, 2000000L);
    }

    public static void d0(View view, boolean z4) {
        S(view, z4 ? 0.5f : 1.0f);
    }

    public static void e(Context context, long j4, long j5) {
        try {
            w().schedule(new com.androidquery.util.c().t(2, p(context), Long.valueOf(j4), Long.valueOf(j5)), 0L, TimeUnit.MILLISECONDS);
        } catch (Exception e4) {
            R(e4);
        }
    }

    public static void e0(Object obj, Object obj2) {
        Objects.toString(obj);
        Objects.toString(obj2);
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void f0(File file, byte[] bArr) {
        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e4) {
                    j(ProtectedSandApp.s("ީ"), file);
                    R(e4);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception e5) {
            R(e5);
        }
    }

    public static void g(InputStream inputStream, OutputStream outputStream) throws IOException {
        h(inputStream, outputStream, 0, null);
    }

    public static void h(InputStream inputStream, OutputStream outputStream, int i4, f fVar) throws IOException {
        if (fVar != null) {
            fVar.e();
            fVar.f(i4);
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            if (fVar != null) {
                fVar.d(read);
            }
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public static void i(Object obj) {
        if (f41198a) {
            Objects.toString(obj);
        }
    }

    public static void j(Object obj, Object obj2) {
        if (f41198a) {
            Objects.toString(obj);
            Objects.toString(obj2);
        }
    }

    public static void k(Throwable th) {
        if (f41198a) {
            Log.getStackTraceString(th);
        }
    }

    public static void l() {
        Object obj;
        if (!f41198a || (obj = f41199b) == null) {
            return;
        }
        synchronized (obj) {
            f41199b.notifyAll();
        }
    }

    public static void m(long j4) {
        if (f41198a) {
            if (f41199b == null) {
                f41199b = new Object();
            }
            synchronized (f41199b) {
                try {
                    f41199b.wait(j4);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static int n(Context context, float f4) {
        return (int) TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics());
    }

    public static void o() {
        if (F()) {
            return;
        }
        R(new IllegalStateException(ProtectedSandApp.s("ު")));
    }

    public static File p(Context context) {
        if (f41205h == null) {
            File file = new File(context.getCacheDir(), ProtectedSandApp.s("ޫ"));
            f41205h = file;
            file.mkdirs();
        }
        return f41205h;
    }

    public static File q(Context context, int i4) {
        if (i4 != 1) {
            return p(context);
        }
        File file = f41206i;
        if (file != null) {
            return file;
        }
        File file2 = new File(p(context), ProtectedSandApp.s("ެ"));
        f41206i = file2;
        file2.mkdirs();
        return f41206i;
    }

    public static File r(File file, String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith(File.separator) ? new File(str) : new File(file, z(str));
    }

    private static String s(String str) {
        return z(str);
    }

    public static Context t() {
        if (f41207j == null) {
            e0(ProtectedSandApp.s("ޭ"), ProtectedSandApp.s("ޮ"));
            k(new IllegalStateException());
        }
        return f41207j;
    }

    public static File u(File file, String str) {
        File r4 = r(file, str);
        if (r4 == null || !r4.exists()) {
            return null;
        }
        return r4;
    }

    public static File v(File file, String str) {
        File u4 = u(file, str);
        if (u4 != null) {
            G(u4);
        }
        return u4;
    }

    private static ScheduledExecutorService w() {
        if (f41204g == null) {
            f41204g = Executors.newSingleThreadScheduledExecutor();
        }
        return f41204g;
    }

    public static Handler x() {
        if (f41202e == null) {
            f41202e = new Handler(Looper.getMainLooper());
        }
        return f41202e;
    }

    private static byte[] y(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("ޯ"));
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e4) {
            R(e4);
            return null;
        }
    }

    private static String z(String str) {
        return new BigInteger(y(str.getBytes())).abs().toString(36);
    }
}

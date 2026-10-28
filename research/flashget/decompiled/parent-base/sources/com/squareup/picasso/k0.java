package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* compiled from: Utils.java */
/* loaded from: classes6.dex */
final class k0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f70919d = 50;

    /* renamed from: e, reason: collision with root package name */
    private static final int f70920e = 5242880;

    /* renamed from: f, reason: collision with root package name */
    private static final int f70921f = 52428800;

    /* renamed from: g, reason: collision with root package name */
    static final int f70922g = 1000;

    /* renamed from: h, reason: collision with root package name */
    static final char f70923h = '\n';
    static final String A = "completed";

    /* renamed from: a, reason: collision with root package name */
    static final String f70916a = "Picasso-";
    static final String B = "errored";

    /* renamed from: b, reason: collision with root package name */
    static final String f70917b = "Picasso-Idle";
    static final String C = "paused";

    /* renamed from: c, reason: collision with root package name */
    private static final String f70918c = "picasso-cache";
    static final String D = "resumed";

    /* renamed from: j, reason: collision with root package name */
    static final String f70925j = "Main";

    /* renamed from: k, reason: collision with root package name */
    static final String f70926k = "Dispatcher";

    /* renamed from: l, reason: collision with root package name */
    static final String f70927l = "Hunter";

    /* renamed from: m, reason: collision with root package name */
    static final String f70928m = "created";

    /* renamed from: n, reason: collision with root package name */
    static final String f70929n = "changed";

    /* renamed from: o, reason: collision with root package name */
    static final String f70930o = "ignored";

    /* renamed from: p, reason: collision with root package name */
    static final String f70931p = "enqueued";

    /* renamed from: q, reason: collision with root package name */
    static final String f70932q = "canceled";

    /* renamed from: r, reason: collision with root package name */
    static final String f70933r = "batched";

    /* renamed from: s, reason: collision with root package name */
    static final String f70934s = "retrying";

    /* renamed from: t, reason: collision with root package name */
    static final String f70935t = "executing";

    /* renamed from: u, reason: collision with root package name */
    static final String f70936u = "decoded";

    /* renamed from: v, reason: collision with root package name */
    static final String f70937v = "transformed";

    /* renamed from: w, reason: collision with root package name */
    static final String f70938w = "joined";

    /* renamed from: x, reason: collision with root package name */
    static final String f70939x = "removed";

    /* renamed from: y, reason: collision with root package name */
    static final String f70940y = "delivered";

    /* renamed from: z, reason: collision with root package name */
    static final String f70941z = "replaying";

    /* renamed from: i, reason: collision with root package name */
    static final StringBuilder f70924i = new StringBuilder();
    private static final okio.p E = okio.p.k("RIFF");
    private static final okio.p F = okio.p.INSTANCE.l("WEBP");

    /* compiled from: Utils.java */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: Utils.java */
    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    static class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    private k0() {
    }

    @TargetApi(18)
    static long a(File file) {
        long j4;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j4 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j4 = 5242880;
        }
        return Math.max(Math.min(j4, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    static void c() {
        if (!r()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void d() {
        if (r()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static <T> T e(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String g(b0 b0Var) {
        StringBuilder sb = f70924i;
        String h4 = h(b0Var, sb);
        sb.setLength(0);
        return h4;
    }

    static String h(b0 b0Var, StringBuilder sb) {
        String str = b0Var.f70752f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(b0Var.f70752f);
        } else {
            Uri uri = b0Var.f70750d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(b0Var.f70751e);
            }
        }
        sb.append('\n');
        if (b0Var.f70760n != 0.0f) {
            sb.append("rotation:");
            sb.append(b0Var.f70760n);
            if (b0Var.f70763q) {
                sb.append('@');
                sb.append(b0Var.f70761o);
                sb.append('x');
                sb.append(b0Var.f70762p);
            }
            sb.append('\n');
        }
        if (b0Var.d()) {
            sb.append("resize:");
            sb.append(b0Var.f70754h);
            sb.append('x');
            sb.append(b0Var.f70755i);
            sb.append('\n');
        }
        if (b0Var.f70756j) {
            sb.append("centerCrop:");
            sb.append(b0Var.f70757k);
            sb.append('\n');
        } else if (b0Var.f70758l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<j0> list = b0Var.f70753g;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append(b0Var.f70753g.get(i4).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String k(com.squareup.picasso.c cVar) {
        return l(cVar, "");
    }

    static String l(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.a h4 = cVar.h();
        if (h4 != null) {
            sb.append(h4.f70719b.e());
        }
        List<com.squareup.picasso.a> i4 = cVar.i();
        if (i4 != null) {
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 > 0 || h4 != null) {
                    sb.append(", ");
                }
                sb.append(i4.get(i5).f70719b.e());
            }
        }
        return sb.toString();
    }

    static int m(Resources resources, b0 b0Var) throws FileNotFoundException {
        Uri uri;
        int i4 = b0Var.f70751e;
        if (i4 != 0 || (uri = b0Var.f70750d) == null) {
            return i4;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + b0Var.f70750d);
        }
        List<String> pathSegments = b0Var.f70750d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + b0Var.f70750d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + b0Var.f70750d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + b0Var.f70750d);
    }

    static Resources n(Context context, b0 b0Var) throws FileNotFoundException {
        Uri uri;
        if (b0Var.f70751e != 0 || (uri = b0Var.f70750d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + b0Var.f70750d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + b0Var.f70750d);
        }
    }

    static <T> T o(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    static boolean p(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean q(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean s(okio.o oVar) throws IOException {
        return oVar.T0(0L, E) && oVar.T0(8L, F);
    }

    static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    static void u(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4);
    }
}

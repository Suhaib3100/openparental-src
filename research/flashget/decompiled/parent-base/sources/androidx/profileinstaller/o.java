package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f32801a = "/data/misc/profiles/ref/";

    /* renamed from: b, reason: collision with root package name */
    private static final String f32802b = "/data/misc/profiles/cur/0/";

    /* renamed from: c, reason: collision with root package name */
    private static final String f32803c = "primary.prof";

    /* renamed from: d, reason: collision with root package name */
    private static final String f32804d = "profileInstalled";

    /* renamed from: g, reason: collision with root package name */
    private static final String f32807g = "ProfileVerifier";

    /* renamed from: e, reason: collision with root package name */
    private static final androidx.concurrent.futures.f<c> f32805e = androidx.concurrent.futures.f.u();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f32806f = new Object();

    /* renamed from: h, reason: collision with root package name */
    @q0
    private static c f32808h = null;

    /* compiled from: ProfileVerifier.java */
    @x0(33)
    private static class a {
        private a() {
        }

        @u
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    @c1({c1.a.LIBRARY})
    static class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f32809e = 1;

        /* renamed from: a, reason: collision with root package name */
        final int f32810a;

        /* renamed from: b, reason: collision with root package name */
        final int f32811b;

        /* renamed from: c, reason: collision with root package name */
        final long f32812c;

        /* renamed from: d, reason: collision with root package name */
        final long f32813d;

        b(int i4, int i5, long j4, long j5) {
            this.f32810a = i4;
            this.f32811b = i5;
            this.f32812c = j4;
            this.f32813d = j5;
        }

        static b a(@o0 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(@o0 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f32810a);
                dataOutputStream.writeInt(this.f32811b);
                dataOutputStream.writeLong(this.f32812c);
                dataOutputStream.writeLong(this.f32813d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f32811b == bVar.f32811b && this.f32812c == bVar.f32812c && this.f32810a == bVar.f32810a && this.f32813d == bVar.f32813d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f32811b), Long.valueOf(this.f32812c), Integer.valueOf(this.f32810a), Long.valueOf(this.f32813d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f32814d = 16;

        /* renamed from: e, reason: collision with root package name */
        public static final int f32815e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f32816f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f32817g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f32818h = 3;

        /* renamed from: i, reason: collision with root package name */
        public static final int f32819i = 65536;

        /* renamed from: j, reason: collision with root package name */
        public static final int f32820j = 131072;

        /* renamed from: k, reason: collision with root package name */
        public static final int f32821k = 196608;

        /* renamed from: l, reason: collision with root package name */
        public static final int f32822l = 262144;

        /* renamed from: a, reason: collision with root package name */
        final int f32823a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f32824b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32825c;

        /* compiled from: ProfileVerifier.java */
        @c1({c1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        c(int i4, boolean z4, boolean z5) {
            this.f32823a = i4;
            this.f32825c = z5;
            this.f32824b = z4;
        }

        public int a() {
            return this.f32823a;
        }

        public boolean b() {
            return this.f32825c;
        }

        public boolean c() {
            return this.f32824b;
        }
    }

    private o() {
    }

    @o0
    public static ListenableFuture<c> a() {
        return f32805e;
    }

    private static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c c(int i4, boolean z4, boolean z5) {
        c cVar = new c(i4, z4, z5);
        f32808h = cVar;
        f32805e.p(cVar);
        return f32808h;
    }

    @n1
    @o0
    public static c d(@o0 Context context) {
        return e(context, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = androidx.profileinstaller.o.c.f32821k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    @androidx.annotation.n1
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY})
    @androidx.annotation.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static androidx.profileinstaller.o.c e(@androidx.annotation.o0 android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.o.e(android.content.Context, boolean):androidx.profileinstaller.o$c");
    }
}

package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.content.res.i;
import androidx.core.graphics.k3;
import androidx.core.graphics.l2;
import androidx.core.provider.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f5035a = "font_results";

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f5036b = -1;

    /* renamed from: c, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f5037c = -2;

    /* compiled from: FontsContractCompat.java */
    public static final class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5038a = "file_id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5039b = "font_ttc_index";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5040c = "font_variation_settings";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5041d = "font_weight";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5042e = "font_italic";

        /* renamed from: f, reason: collision with root package name */
        public static final String f5043f = "result_code";

        /* renamed from: g, reason: collision with root package name */
        public static final int f5044g = 0;

        /* renamed from: h, reason: collision with root package name */
        public static final int f5045h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f5046i = 2;

        /* renamed from: j, reason: collision with root package name */
        public static final int f5047j = 3;
    }

    /* compiled from: FontsContractCompat.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5048c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5049d = 1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f5050e = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f5051a;

        /* renamed from: b, reason: collision with root package name */
        private final c[] f5052b;

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i5, @q0 c[] cVarArr) {
            this.f5051a = i5;
            this.f5052b = cVarArr;
        }

        static b a(int i5, @q0 c[] cVarArr) {
            return new b(i5, cVarArr);
        }

        public c[] b() {
            return this.f5052b;
        }

        public int c() {
            return this.f5051a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f5053a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5054b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5055c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5056d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5057e;

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@o0 Uri uri, @g0(from = 0) int i5, @g0(from = 1, to = 1000) int i6, boolean z5, int i7) {
            uri.getClass();
            this.f5053a = uri;
            this.f5054b = i5;
            this.f5055c = i6;
            this.f5056d = z5;
            this.f5057e = i7;
        }

        static c a(@o0 Uri uri, @g0(from = 0) int i5, @g0(from = 1, to = 1000) int i6, boolean z5, int i7) {
            return new c(uri, i5, i6, z5, i7);
        }

        public int b() {
            return this.f5057e;
        }

        @g0(from = 0)
        public int c() {
            return this.f5054b;
        }

        @o0
        public Uri d() {
            return this.f5053a;
        }

        @g0(from = 1, to = 1000)
        public int e() {
            return this.f5055c;
        }

        public boolean f() {
            return this.f5056d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f5058a = 0;

        /* renamed from: b, reason: collision with root package name */
        static final int f5059b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f5060c = -1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5061d = -2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f5062e = -3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f5063f = -4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f5064g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f5065h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f5066i = 3;

        /* compiled from: FontsContractCompat.java */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(int i5) {
        }

        public void b(Typeface typeface) {
        }
    }

    private h() {
    }

    @q0
    public static Typeface a(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 c[] cVarArr) {
        return l2.c(context, cancellationSignal, cVarArr, 0);
    }

    @o0
    public static b b(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 f fVar) throws PackageManager.NameNotFoundException {
        return e.e(context, fVar, cancellationSignal);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, f fVar, @q0 i.g gVar, @q0 Handler handler, boolean z5, int i5, int i6) {
        return f(context, fVar, i6, z5, i5, i.g.e(handler), new l2.a(gVar));
    }

    @m1
    @Deprecated
    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo d(@o0 PackageManager packageManager, @o0 f fVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        return e.f(packageManager, fVar, resources);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(19)
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return k3.h(context, cVarArr, cancellationSignal);
    }

    @q0
    @c1({c1.a.LIBRARY})
    public static Typeface f(@o0 Context context, @o0 f fVar, int i5, boolean z5, @g0(from = 0) int i6, @o0 Handler handler, @o0 d dVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, handler);
        return z5 ? g.e(context, fVar, aVar, i5, i6) : g.d(context, fVar, i5, null, aVar);
    }

    public static void g(@o0 Context context, @o0 f fVar, @o0 d dVar, @o0 Handler handler) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar);
        g.d(context.getApplicationContext(), fVar, 0, new i.b(handler), aVar);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        g.f();
    }

    @c1({c1.a.TESTS})
    @m1
    public static void i() {
        g.f();
    }
}

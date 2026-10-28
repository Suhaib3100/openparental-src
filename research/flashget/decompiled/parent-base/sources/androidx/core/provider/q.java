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
import androidx.core.content.res.i;
import androidx.core.graphics.u0;
import androidx.core.graphics.v0;
import androidx.core.provider.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f26598a = "font_results";

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f26599b = -1;

    /* renamed from: c, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f26600c = -2;

    /* compiled from: FontsContractCompat.java */
    public static final class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f26601a = "file_id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f26602b = "font_ttc_index";

        /* renamed from: c, reason: collision with root package name */
        public static final String f26603c = "font_variation_settings";

        /* renamed from: d, reason: collision with root package name */
        public static final String f26604d = "font_weight";

        /* renamed from: e, reason: collision with root package name */
        public static final String f26605e = "font_italic";

        /* renamed from: f, reason: collision with root package name */
        public static final String f26606f = "result_code";

        /* renamed from: g, reason: collision with root package name */
        public static final int f26607g = 0;

        /* renamed from: h, reason: collision with root package name */
        public static final int f26608h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f26609i = 2;

        /* renamed from: j, reason: collision with root package name */
        public static final int f26610j = 3;
    }

    /* compiled from: FontsContractCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f26616a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26617b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26618c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26619d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26620e;

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@o0 Uri uri, @g0(from = 0) int i4, @g0(from = 1, to = 1000) int i5, boolean z4, int i6) {
            uri.getClass();
            this.f26616a = uri;
            this.f26617b = i4;
            this.f26618c = i5;
            this.f26619d = z4;
            this.f26620e = i6;
        }

        static c a(@o0 Uri uri, @g0(from = 0) int i4, @g0(from = 1, to = 1000) int i5, boolean z4, int i6) {
            return new c(uri, i4, i5, z4, i6);
        }

        public int b() {
            return this.f26620e;
        }

        @g0(from = 0)
        public int c() {
            return this.f26617b;
        }

        @o0
        public Uri d() {
            return this.f26616a;
        }

        @g0(from = 1, to = 1000)
        public int e() {
            return this.f26618c;
        }

        public boolean f() {
            return this.f26619d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f26621a = 0;

        /* renamed from: b, reason: collision with root package name */
        static final int f26622b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26623c = -1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f26624d = -2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f26625e = -3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f26626f = -4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f26627g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f26628h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f26629i = 3;

        /* compiled from: FontsContractCompat.java */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(int i4) {
        }

        public void b(Typeface typeface) {
        }
    }

    private q() {
    }

    @q0
    public static Typeface a(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 c[] cVarArr) {
        return v0.d(context, cancellationSignal, cVarArr, 0);
    }

    @o0
    public static b b(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 g gVar) throws PackageManager.NameNotFoundException {
        List a5;
        a5 = u0.a(new Object[]{gVar});
        return e.f(context, a5, cancellationSignal);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, g gVar, @q0 i.f fVar, @q0 Handler handler, boolean z4, int i4, int i5) {
        List a5;
        v0.a aVar = new v0.a(fVar);
        Handler e4 = i.f.e(handler);
        a5 = u0.a(new Object[]{gVar});
        return g(context, a5, i5, z4, i4, e4, aVar);
    }

    @m1
    @Deprecated
    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo d(@o0 PackageManager packageManager, @o0 g gVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        return e.g(packageManager, gVar, resources);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return androidx.core.graphics.c1.h(context, cVarArr, cancellationSignal);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Typeface f(@o0 Context context, @o0 g gVar, int i4, boolean z4, @g0(from = 0) int i5, @o0 Handler handler, @o0 d dVar) {
        List a5;
        a5 = u0.a(new Object[]{gVar});
        return g(context, a5, i4, z4, i5, handler, dVar);
    }

    @q0
    @c1({c1.a.LIBRARY})
    public static Typeface g(@o0 Context context, @o0 List<g> list, int i4, boolean z4, @g0(from = 0) int i5, @o0 Handler handler, @o0 d dVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, new r.b(handler));
        if (!z4) {
            return k.d(context, list, i4, null, aVar);
        }
        if (list.size() <= 1) {
            return k.e(context, list.get(0), aVar, i4, i5);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static void h(@o0 Context context, @o0 g gVar, int i4, @q0 Executor executor, @o0 Executor executor2, @o0 d dVar) {
        List a5;
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, executor2);
        Context applicationContext = context.getApplicationContext();
        a5 = u0.a(new Object[]{gVar});
        k.d(applicationContext, a5, i4, executor, aVar);
    }

    @Deprecated
    public static void i(@o0 Context context, @o0 g gVar, @o0 d dVar, @o0 Handler handler) {
        List a5;
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar);
        r.b bVar = new r.b(handler);
        Context applicationContext = context.getApplicationContext();
        a5 = u0.a(new Object[]{gVar});
        k.d(applicationContext, a5, 0, bVar, aVar);
    }

    public static void j(@o0 Context context, @o0 List<g> list, int i4, @q0 Executor executor, @o0 Executor executor2, @o0 d dVar) {
        k.d(context.getApplicationContext(), list, i4, executor, new androidx.core.provider.a(dVar, executor2));
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void k() {
        k.f();
    }

    @c1({c1.a.LIBRARY})
    @m1
    public static void l() {
        k.f();
    }

    /* compiled from: FontsContractCompat.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f26611c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f26612d = 1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f26613e = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f26614a;

        /* renamed from: b, reason: collision with root package name */
        private final List<c[]> f26615b;

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i4, @q0 c[] cVarArr) {
            this.f26614a = i4;
            this.f26615b = Collections.singletonList(cVarArr);
        }

        static b a(int i4, @q0 List<c[]> list) {
            return new b(i4, list);
        }

        static b b(int i4, @q0 c[] cVarArr) {
            return new b(i4, cVarArr);
        }

        public c[] c() {
            return this.f26615b.get(0);
        }

        @o0
        public List<c[]> d() {
            return this.f26615b;
        }

        public int e() {
            return this.f26614a;
        }

        boolean f() {
            return this.f26615b.size() > 1;
        }

        b(int i4, @o0 List<c[]> list) {
            this.f26614a = i4;
            this.f26615b = list;
        }
    }
}

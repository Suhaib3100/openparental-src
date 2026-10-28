package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.cct.internal.m;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.k;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.w0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes3.dex */
final class d implements n {

    /* renamed from: i, reason: collision with root package name */
    private static final int f12264i = 30000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f12265j = 130000;

    /* renamed from: k, reason: collision with root package name */
    private static final int f12266k = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.encoders.a f12282a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f12283b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f12284c;

    /* renamed from: d, reason: collision with root package name */
    final URL f12285d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12286e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12287f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12288g;
    private static final String A = ProtectedSandApp.s("ᾣ");
    private static final String B = ProtectedSandApp.s("ᾤ");
    private static final String C = ProtectedSandApp.s("ᾥ");
    private static final String D = ProtectedSandApp.s("ᾦ");
    private static final String E = ProtectedSandApp.s("ᾧ");
    private static final String F = ProtectedSandApp.s("ᾨ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f12263h = ProtectedSandApp.s("ᾩ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f12267l = ProtectedSandApp.s("ᾪ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f12268m = ProtectedSandApp.s("ᾫ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f12269n = ProtectedSandApp.s("ᾬ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f12270o = ProtectedSandApp.s("ᾭ");

    /* renamed from: p, reason: collision with root package name */
    static final String f12271p = ProtectedSandApp.s("ᾮ");

    /* renamed from: q, reason: collision with root package name */
    private static final String f12272q = ProtectedSandApp.s("ᾯ");

    /* renamed from: r, reason: collision with root package name */
    @m1
    static final String f12273r = ProtectedSandApp.s("ᾰ");

    /* renamed from: s, reason: collision with root package name */
    @m1
    static final String f12274s = ProtectedSandApp.s("ᾱ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f12275t = ProtectedSandApp.s("ᾲ");

    /* renamed from: u, reason: collision with root package name */
    private static final String f12276u = ProtectedSandApp.s("ᾳ");

    /* renamed from: v, reason: collision with root package name */
    private static final String f12277v = ProtectedSandApp.s("ᾴ");

    /* renamed from: w, reason: collision with root package name */
    private static final String f12278w = ProtectedSandApp.s("\u1fb5");

    /* renamed from: x, reason: collision with root package name */
    private static final String f12279x = ProtectedSandApp.s("ᾶ");

    /* renamed from: y, reason: collision with root package name */
    private static final String f12280y = ProtectedSandApp.s("ᾷ");

    /* renamed from: z, reason: collision with root package name */
    private static final String f12281z = ProtectedSandApp.s("Ᾰ");

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f12289a;

        /* renamed from: b, reason: collision with root package name */
        final j f12290b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        final String f12291c;

        a(URL url, j jVar, @q0 String str) {
            this.f12289a = url;
            this.f12290b = jVar;
            this.f12291c = str;
        }

        a a(URL url) {
            return new a(url, this.f12290b, this.f12291c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f12292a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        final URL f12293b;

        /* renamed from: c, reason: collision with root package name */
        final long f12294c;

        b(int i5, @q0 URL url, long j5) {
            this.f12292a = i5;
            this.f12293b = url;
            this.f12294c = j5;
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, int i5) {
        this.f12282a = j.b();
        this.f12284c = context;
        this.f12283b = (ConnectivityManager) context.getSystemService(ProtectedSandApp.s("ὤ"));
        this.f12285d = n(com.google.android.datatransport.cct.a.f12252d);
        this.f12286e = aVar2;
        this.f12287f = aVar;
        this.f12288g = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        URL url = aVar.f12289a;
        String s5 = ProtectedSandApp.s("ὥ");
        j1.a.h(s5, ProtectedSandApp.s("ὦ"), url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f12289a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f12288g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("ὧ"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Ὢ"), String.format(ProtectedSandApp.s("Ὡ"), ProtectedSandApp.s("Ὠ")));
        String s6 = ProtectedSandApp.s("Ὣ");
        String s7 = ProtectedSandApp.s("Ὤ");
        httpURLConnection.setRequestProperty(s6, s7);
        String s8 = ProtectedSandApp.s("Ὥ");
        String s9 = ProtectedSandApp.s("Ὦ");
        httpURLConnection.setRequestProperty(s9, s8);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Ὧ"), s7);
        String str = aVar.f12291c;
        if (str != null) {
            httpURLConnection.setRequestProperty(ProtectedSandApp.s("ὰ"), str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f12282a.b(aVar.f12290b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    j1.a.h(s5, ProtectedSandApp.s("ά"), Integer.valueOf(responseCode));
                    j1.a.c(s5, ProtectedSandApp.s("ὲ"), httpURLConnection.getHeaderField(s9));
                    j1.a.c(s5, ProtectedSandApp.s("έ"), httpURLConnection.getHeaderField(s6));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(ProtectedSandApp.s("ὴ"))), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m5 = m(inputStream, httpURLConnection.getHeaderField(s6));
                        try {
                            b bVar = new b(responseCode, null, com.google.android.datatransport.cct.internal.n.b(new BufferedReader(new InputStreamReader(m5))).c());
                            if (m5 != null) {
                                m5.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e6) {
            e = e6;
            j1.a.f(s5, ProtectedSandApp.s("ή"), e);
            return new b(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            j1.a.f(s5, ProtectedSandApp.s("ὶ"), e);
            return new b(w0.f17634f, null, 0L);
        } catch (UnknownHostException e8) {
            e = e8;
            j1.a.f(s5, ProtectedSandApp.s("ὶ"), e);
            return new b(w0.f17634f, null, 0L);
        } catch (IOException e9) {
            e = e9;
            j1.a.f(s5, ProtectedSandApp.s("ή"), e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.getValue();
        }
        if (o.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.getValue() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            j1.a.f(ProtectedSandApp.s("ί"), ProtectedSandApp.s("ὸ"), e6);
            return -1;
        }
    }

    private j i(g gVar) {
        l.a j5;
        HashMap hashMap = new HashMap();
        for (k kVar : gVar.c()) {
            String l5 = kVar.l();
            if (hashMap.containsKey(l5)) {
                ((List) hashMap.get(l5)).add(kVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(kVar);
                hashMap.put(l5, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            k kVar2 = (k) ((List) entry.getValue()).get(0);
            m.a b6 = m.a().f(p.DEFAULT).g(this.f12287f.a()).h(this.f12286e.a()).b(com.google.android.datatransport.cct.internal.k.a().c(k.b.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.internal.a.a().m(Integer.valueOf(kVar2.g(ProtectedSandApp.s("ό")))).j(kVar2.b(ProtectedSandApp.s("ὺ"))).f(kVar2.b(ProtectedSandApp.s("ύ"))).d(kVar2.b(ProtectedSandApp.s("ὼ"))).l(kVar2.b(ProtectedSandApp.s("ώ"))).k(kVar2.b(ProtectedSandApp.s("\u1f7e"))).h(kVar2.b(ProtectedSandApp.s("\u1f7f"))).e(kVar2.b(ProtectedSandApp.s("ᾀ"))).c(kVar2.b(ProtectedSandApp.s("ᾁ"))).g(kVar2.b(ProtectedSandApp.s("ᾂ"))).i(kVar2.b(ProtectedSandApp.s("ᾃ"))).b(kVar2.b(ProtectedSandApp.s("ᾄ"))).a()).a());
            try {
                b6.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b6.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (com.google.android.datatransport.runtime.k kVar3 : (List) entry.getValue()) {
                com.google.android.datatransport.runtime.j e6 = kVar3.e();
                com.google.android.datatransport.c b7 = e6.b();
                if (b7.equals(com.google.android.datatransport.c.b(ProtectedSandApp.s("ᾅ")))) {
                    j5 = l.j(e6.a());
                } else if (b7.equals(com.google.android.datatransport.c.b(ProtectedSandApp.s("ᾆ")))) {
                    j5 = l.i(new String(e6.a(), Charset.forName(ProtectedSandApp.s("ᾇ"))));
                } else {
                    j1.a.i(ProtectedSandApp.s("ᾋ"), ProtectedSandApp.s("ᾌ"), b7);
                }
                j5.c(kVar3.f()).d(kVar3.m()).h(kVar3.h(ProtectedSandApp.s("ᾈ"))).e(o.a().c(o.c.forNumber(kVar3.g(ProtectedSandApp.s("ᾉ")))).b(o.b.forNumber(kVar3.g(ProtectedSandApp.s("ᾊ")))).a());
                if (kVar3.d() != null) {
                    j5.b(kVar3.d());
                }
                arrayList3.add(j5.a());
            }
            b6.c(arrayList3);
            arrayList2.add(b6.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService(ProtectedSandApp.s("ᾍ"));
    }

    @m1
    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f12293b;
        if (url == null) {
            return null;
        }
        j1.a.c(ProtectedSandApp.s("ᾎ"), ProtectedSandApp.s("ᾏ"), url);
        return aVar.a(bVar.f12293b);
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return ProtectedSandApp.s("ᾐ").equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("ᾑ"), str), e6);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public h a(g gVar) {
        j i5 = i(gVar);
        URL url = this.f12285d;
        if (gVar.d() != null) {
            try {
                com.google.android.datatransport.cct.a e6 = com.google.android.datatransport.cct.a.e(gVar.d());
                r3 = e6.f() != null ? e6.f() : null;
                if (e6.g() != null) {
                    url = n(e6.g());
                }
            } catch (IllegalArgumentException unused) {
                return h.a();
            }
        }
        try {
            b bVar = (b) k1.b.a(5, new a(url, i5, r3), new k1.a() { // from class: com.google.android.datatransport.cct.b
                @Override // k1.a
                public final Object apply(Object obj) {
                    d.b e7;
                    e7 = d.this.e((d.a) obj);
                    return e7;
                }
            }, new k1.c() { // from class: com.google.android.datatransport.cct.c
                @Override // k1.c
                public final Object a(Object obj, Object obj2) {
                    d.a l5;
                    l5 = d.l((d.a) obj, (d.b) obj2);
                    return l5;
                }
            });
            int i6 = bVar.f12292a;
            if (i6 == 200) {
                return h.e(bVar.f12294c);
            }
            if (i6 < 500 && i6 != 404) {
                return i6 == 400 ? h.d() : h.a();
            }
            return h.f();
        } catch (IOException e7) {
            j1.a.f(ProtectedSandApp.s("ᾒ"), ProtectedSandApp.s("ᾓ"), e7);
            return h.f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public com.google.android.datatransport.runtime.k b(com.google.android.datatransport.runtime.k kVar) {
        NetworkInfo activeNetworkInfo = this.f12283b.getActiveNetworkInfo();
        return kVar.n().a(ProtectedSandApp.s("ᾔ"), Build.VERSION.SDK_INT).c(ProtectedSandApp.s("ᾕ"), Build.MODEL).c(ProtectedSandApp.s("ᾖ"), Build.HARDWARE).c(ProtectedSandApp.s("ᾗ"), Build.DEVICE).c(ProtectedSandApp.s("ᾘ"), Build.PRODUCT).c(ProtectedSandApp.s("ᾙ"), Build.ID).c(ProtectedSandApp.s("ᾚ"), Build.MANUFACTURER).c(ProtectedSandApp.s("ᾛ"), Build.FINGERPRINT).b(ProtectedSandApp.s("ᾜ"), k()).a(ProtectedSandApp.s("ᾝ"), g(activeNetworkInfo)).a(ProtectedSandApp.s("ᾞ"), f(activeNetworkInfo)).c(ProtectedSandApp.s("ᾟ"), Locale.getDefault().getCountry()).c(ProtectedSandApp.s("ᾠ"), Locale.getDefault().getLanguage()).c(ProtectedSandApp.s("ᾡ"), j(this.f12284c).getSimOperator()).c(ProtectedSandApp.s("ᾢ"), Integer.toString(h(this.f12284c))).d();
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this(context, aVar, aVar2, f12265j);
    }
}

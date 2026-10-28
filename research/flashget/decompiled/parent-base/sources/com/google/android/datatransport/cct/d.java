package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.cct.internal.q;
import com.google.android.datatransport.cct.internal.r;
import com.google.android.datatransport.cct.internal.s;
import com.google.android.datatransport.cct.internal.t;
import com.google.android.datatransport.cct.internal.u;
import com.google.android.datatransport.cct.internal.v;
import com.google.android.datatransport.cct.internal.w;
import com.google.android.datatransport.cct.internal.x;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.k;
import com.google.firebase.encoders.EncodingException;
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
/* loaded from: classes5.dex */
final class d implements n {

    /* renamed from: i, reason: collision with root package name */
    private static final int f51771i = 30000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f51772j = 130000;

    /* renamed from: k, reason: collision with root package name */
    private static final int f51773k = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.encoders.a f51789a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f51790b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f51791c;

    /* renamed from: d, reason: collision with root package name */
    final URL f51792d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51793e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51794f;

    /* renamed from: g, reason: collision with root package name */
    private final int f51795g;
    private static final String A = ProtectedSandApp.s("쓜");
    private static final String B = ProtectedSandApp.s("쓞");
    private static final String C = ProtectedSandApp.s("쓝");
    private static final String D = ProtectedSandApp.s("쓟");
    private static final String E = ProtectedSandApp.s("쓤");
    private static final String F = ProtectedSandApp.s("쓠");

    /* renamed from: h, reason: collision with root package name */
    private static final String f51770h = ProtectedSandApp.s("쓂");

    /* renamed from: l, reason: collision with root package name */
    private static final String f51774l = ProtectedSandApp.s("쓌");

    /* renamed from: m, reason: collision with root package name */
    private static final String f51775m = ProtectedSandApp.s("쓈");

    /* renamed from: n, reason: collision with root package name */
    private static final String f51776n = ProtectedSandApp.s("쓉");

    /* renamed from: o, reason: collision with root package name */
    private static final String f51777o = ProtectedSandApp.s("쓋");

    /* renamed from: p, reason: collision with root package name */
    static final String f51778p = ProtectedSandApp.s("쓍");

    /* renamed from: q, reason: collision with root package name */
    private static final String f51779q = ProtectedSandApp.s("쓊");

    /* renamed from: r, reason: collision with root package name */
    @m1
    static final String f51780r = ProtectedSandApp.s("쓥");

    /* renamed from: s, reason: collision with root package name */
    @m1
    static final String f51781s = ProtectedSandApp.s("쓦");

    /* renamed from: t, reason: collision with root package name */
    private static final String f51782t = ProtectedSandApp.s("쓕");

    /* renamed from: u, reason: collision with root package name */
    private static final String f51783u = ProtectedSandApp.s("쓖");

    /* renamed from: v, reason: collision with root package name */
    private static final String f51784v = ProtectedSandApp.s("쓗");

    /* renamed from: w, reason: collision with root package name */
    private static final String f51785w = ProtectedSandApp.s("쓘");

    /* renamed from: x, reason: collision with root package name */
    private static final String f51786x = ProtectedSandApp.s("쓙");

    /* renamed from: y, reason: collision with root package name */
    private static final String f51787y = ProtectedSandApp.s("쓚");

    /* renamed from: z, reason: collision with root package name */
    private static final String f51788z = ProtectedSandApp.s("쓛");

    /* compiled from: CctTransportBackend.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f51796a;

        /* renamed from: b, reason: collision with root package name */
        final com.google.android.datatransport.cct.internal.n f51797b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        final String f51798c;

        a(URL url, com.google.android.datatransport.cct.internal.n nVar, @q0 String str) {
            this.f51796a = url;
            this.f51797b = nVar;
            this.f51798c = str;
        }

        a a(URL url) {
            return new a(url, this.f51797b, this.f51798c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f51799a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        final URL f51800b;

        /* renamed from: c, reason: collision with root package name */
        final long f51801c;

        b(int i4, @q0 URL url, long j4) {
            this.f51799a = i4;
            this.f51800b = url;
            this.f51801c = j4;
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, int i4) {
        this.f51789a = com.google.android.datatransport.cct.internal.n.b();
        this.f51791c = context;
        this.f51790b = (ConnectivityManager) context.getSystemService(ProtectedSandApp.s("쓁"));
        this.f51792d = o(com.google.android.datatransport.cct.a.f51759d);
        this.f51793e = aVar2;
        this.f51794f = aVar;
        this.f51795g = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        URL url = aVar.f51796a;
        String s4 = ProtectedSandApp.s("쓂");
        n8.a.h(s4, ProtectedSandApp.s("쓃"), url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f51796a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f51795g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("쓄"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("쓇"), String.format(ProtectedSandApp.s("쓆"), ProtectedSandApp.s("쓅")));
        String s5 = ProtectedSandApp.s("쓈");
        String s6 = ProtectedSandApp.s("쓉");
        httpURLConnection.setRequestProperty(s5, s6);
        String s7 = ProtectedSandApp.s("쓊");
        String s10 = ProtectedSandApp.s("쓋");
        httpURLConnection.setRequestProperty(s10, s7);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("쓌"), s6);
        String str = aVar.f51798c;
        if (str != null) {
            httpURLConnection.setRequestProperty(ProtectedSandApp.s("쓍"), str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f51789a.b(aVar.f51797b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    n8.a.h(s4, ProtectedSandApp.s("쓎"), Integer.valueOf(responseCode));
                    n8.a.c(s4, ProtectedSandApp.s("쓏"), httpURLConnection.getHeaderField(s10));
                    n8.a.c(s4, ProtectedSandApp.s("쓐"), httpURLConnection.getHeaderField(s5));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(ProtectedSandApp.s("쓑"))), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream n4 = n(inputStream, httpURLConnection.getHeaderField(s5));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(n4))).c());
                            if (n4 != null) {
                                n4.close();
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
        } catch (EncodingException e4) {
            e = e4;
            n8.a.f(s4, ProtectedSandApp.s("쓒"), e);
            return new b(400, null, 0L);
        } catch (ConnectException e5) {
            e = e5;
            n8.a.f(s4, ProtectedSandApp.s("쓓"), e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            n8.a.f(s4, ProtectedSandApp.s("쓓"), e);
            return new b(500, null, 0L);
        } catch (IOException e7) {
            e = e7;
            n8.a.f(s4, ProtectedSandApp.s("쓒"), e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.getValue();
        }
        if (w.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.getValue() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            n8.a.f(ProtectedSandApp.s("쓂"), ProtectedSandApp.s("쓔"), e4);
            return -1;
        }
    }

    private com.google.android.datatransport.cct.internal.n j(g gVar) {
        t.a l4;
        HashMap hashMap = new HashMap();
        for (k kVar : gVar.c()) {
            String p4 = kVar.p();
            if (hashMap.containsKey(p4)) {
                ((List) hashMap.get(p4)).add(kVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(kVar);
                hashMap.put(p4, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            k kVar2 = (k) ((List) entry.getValue()).get(0);
            u.a b5 = u.a().f(x.DEFAULT).g(this.f51794f.a()).h(this.f51793e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.internal.a.a().m(Integer.valueOf(kVar2.i(ProtectedSandApp.s("쓕")))).j(kVar2.b(ProtectedSandApp.s("쓖"))).f(kVar2.b(ProtectedSandApp.s("쓗"))).d(kVar2.b(ProtectedSandApp.s("쓘"))).l(kVar2.b(ProtectedSandApp.s("쓙"))).k(kVar2.b(ProtectedSandApp.s("쓚"))).h(kVar2.b(ProtectedSandApp.s("쓛"))).e(kVar2.b(ProtectedSandApp.s("쓜"))).c(kVar2.b(ProtectedSandApp.s("쓝"))).g(kVar2.b(ProtectedSandApp.s("쓞"))).i(kVar2.b(ProtectedSandApp.s("쓟"))).b(kVar2.b(ProtectedSandApp.s("쓠"))).a()).a());
            try {
                b5.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b5.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (k kVar3 : (List) entry.getValue()) {
                j e4 = kVar3.e();
                com.google.android.datatransport.e b6 = e4.b();
                if (b6.equals(com.google.android.datatransport.e.b(ProtectedSandApp.s("쓡")))) {
                    l4 = t.l(e4.a());
                } else if (b6.equals(com.google.android.datatransport.e.b(ProtectedSandApp.s("쓢")))) {
                    l4 = t.k(new String(e4.a(), Charset.forName(ProtectedSandApp.s("쓣"))));
                } else {
                    n8.a.i(ProtectedSandApp.s("쓂"), ProtectedSandApp.s("쓧"), b6);
                }
                l4.d(kVar3.f()).e(kVar3.q()).j(kVar3.j(ProtectedSandApp.s("쓤"))).g(w.a().c(w.c.forNumber(kVar3.i(ProtectedSandApp.s("쓥")))).b(w.b.forNumber(kVar3.i(ProtectedSandApp.s("쓦")))).a());
                if (kVar3.d() != null) {
                    l4.c(kVar3.d());
                }
                if (kVar3.n() != null) {
                    l4.b(p.a().b(s.a().b(r.a().b(kVar3.n()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (kVar3.g() != null || kVar3.h() != null) {
                    q.a a5 = q.a();
                    if (kVar3.g() != null) {
                        a5.b(kVar3.g());
                    }
                    if (kVar3.h() != null) {
                        a5.c(kVar3.h());
                    }
                    l4.f(a5.a());
                }
                arrayList3.add(l4.a());
            }
            b5.c(arrayList3);
            arrayList2.add(b5.a());
        }
        return com.google.android.datatransport.cct.internal.n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService(ProtectedSandApp.s("쓨"));
    }

    @m1
    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f51800b;
        if (url == null) {
            return null;
        }
        n8.a.c(ProtectedSandApp.s("쓂"), ProtectedSandApp.s("쓩"), url);
        return aVar.a(bVar.f51800b);
    }

    private static InputStream n(InputStream inputStream, String str) throws IOException {
        return ProtectedSandApp.s("쓉").equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("쓪"), str), e4);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public k a(k kVar) {
        NetworkInfo activeNetworkInfo = this.f51790b.getActiveNetworkInfo();
        return kVar.r().a(ProtectedSandApp.s("쓕"), Build.VERSION.SDK_INT).c(ProtectedSandApp.s("쓖"), Build.MODEL).c(ProtectedSandApp.s("쓗"), Build.HARDWARE).c(ProtectedSandApp.s("쓘"), Build.DEVICE).c(ProtectedSandApp.s("쓙"), Build.PRODUCT).c(ProtectedSandApp.s("쓚"), Build.ID).c(ProtectedSandApp.s("쓛"), Build.MANUFACTURER).c(ProtectedSandApp.s("쓜"), Build.FINGERPRINT).b(ProtectedSandApp.s("쓤"), l()).a(ProtectedSandApp.s("쓥"), h(activeNetworkInfo)).a(ProtectedSandApp.s("쓦"), g(activeNetworkInfo)).c(ProtectedSandApp.s("쓝"), Locale.getDefault().getCountry()).c(ProtectedSandApp.s("쓞"), Locale.getDefault().getLanguage()).c(ProtectedSandApp.s("쓟"), f(this.f51791c)).c(ProtectedSandApp.s("쓠"), Integer.toString(i(this.f51791c))).d();
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public h b(g gVar) {
        com.google.android.datatransport.cct.internal.n j4 = j(gVar);
        URL url = this.f51792d;
        if (gVar.d() != null) {
            try {
                com.google.android.datatransport.cct.a e4 = com.google.android.datatransport.cct.a.e(gVar.d());
                r3 = e4.f() != null ? e4.f() : null;
                if (e4.g() != null) {
                    url = o(e4.g());
                }
            } catch (IllegalArgumentException unused) {
                return h.a();
            }
        }
        try {
            b bVar = (b) o8.b.a(5, new a(url, j4, r3), new o8.a() { // from class: com.google.android.datatransport.cct.b
                @Override // o8.a
                public final Object apply(Object obj) {
                    d.b e5;
                    e5 = d.this.e((d.a) obj);
                    return e5;
                }
            }, new c());
            int i4 = bVar.f51799a;
            if (i4 == 200) {
                return h.e(bVar.f51801c);
            }
            if (i4 < 500 && i4 != 404) {
                return i4 == 400 ? h.d() : h.a();
            }
            return h.f();
        } catch (IOException e5) {
            n8.a.f(ProtectedSandApp.s("쓂"), ProtectedSandApp.s("쓫"), e5);
            return h.f();
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this(context, aVar, aVar2, f51772j);
    }
}

package com.androidquery.callback;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: AjaxStatus.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: s, reason: collision with root package name */
    public static final int f41131s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f41132t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f41133u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f41134v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f41135w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f41136x = -101;

    /* renamed from: y, reason: collision with root package name */
    public static final int f41137y = -102;

    /* renamed from: z, reason: collision with root package name */
    public static final int f41138z = -103;

    /* renamed from: a, reason: collision with root package name */
    private int f41139a;

    /* renamed from: b, reason: collision with root package name */
    private String f41140b;

    /* renamed from: c, reason: collision with root package name */
    private String f41141c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f41142d;

    /* renamed from: e, reason: collision with root package name */
    private File f41143e;

    /* renamed from: f, reason: collision with root package name */
    private Date f41144f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41145g;

    /* renamed from: h, reason: collision with root package name */
    private DefaultHttpClient f41146h;

    /* renamed from: i, reason: collision with root package name */
    private long f41147i;

    /* renamed from: j, reason: collision with root package name */
    private int f41148j;

    /* renamed from: k, reason: collision with root package name */
    private long f41149k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41150l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41151m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41152n;

    /* renamed from: o, reason: collision with root package name */
    private String f41153o;

    /* renamed from: p, reason: collision with root package name */
    private HttpContext f41154p;

    /* renamed from: q, reason: collision with root package name */
    private Header[] f41155q;

    /* renamed from: r, reason: collision with root package name */
    private Closeable f41156r;

    public c() {
        this.f41139a = 200;
        this.f41140b = ProtectedSandApp.s("ݱ");
        this.f41144f = new Date();
        this.f41148j = 1;
        this.f41149k = System.currentTimeMillis();
    }

    public Date A() {
        return this.f41144f;
    }

    protected c B(Header[] headerArr) {
        this.f41155q = headerArr;
        return this;
    }

    public c C() {
        this.f41151m = true;
        return this;
    }

    public c D(String str) {
        this.f41140b = str;
        return this;
    }

    protected c E(boolean z4) {
        this.f41152n = z4;
        return this;
    }

    protected c F(String str) {
        this.f41141c = str;
        return this;
    }

    protected c G(boolean z4) {
        this.f41145g = z4;
        return this;
    }

    protected c H() {
        this.f41147i = System.currentTimeMillis() - this.f41149k;
        this.f41150l = false;
        b();
        return this;
    }

    protected c I(int i4) {
        this.f41148j = i4;
        return this;
    }

    protected c J(Date date) {
        this.f41144f = date;
        return this;
    }

    protected c a(DefaultHttpClient defaultHttpClient) {
        this.f41146h = defaultHttpClient;
        return this;
    }

    public void b() {
        com.androidquery.util.a.f(this.f41156r);
        this.f41156r = null;
    }

    protected void c(Closeable closeable) {
        this.f41156r = closeable;
    }

    public c d(int i4) {
        this.f41139a = i4;
        return this;
    }

    protected c e(HttpContext httpContext) {
        this.f41154p = httpContext;
        return this;
    }

    protected c f(byte[] bArr) {
        this.f41142d = bArr;
        return this;
    }

    public c g() {
        this.f41147i = System.currentTimeMillis() - this.f41149k;
        this.f41150l = true;
        this.f41152n = false;
        return this;
    }

    protected c h(String str) {
        this.f41153o = str;
        return this;
    }

    public boolean i(long j4) {
        return System.currentTimeMillis() - this.f41144f.getTime() > j4 && z() != 1;
    }

    protected c j(File file) {
        this.f41143e = file;
        return this;
    }

    public DefaultHttpClient k() {
        return this.f41146h;
    }

    public int l() {
        return this.f41139a;
    }

    public List<Cookie> m() {
        HttpContext httpContext = this.f41154p;
        if (httpContext == null) {
            return Collections.emptyList();
        }
        CookieStore cookieStore = (CookieStore) httpContext.getAttribute(ProtectedSandApp.s("ݲ"));
        return cookieStore == null ? Collections.emptyList() : cookieStore.getCookies();
    }

    protected byte[] n() {
        return this.f41142d;
    }

    protected boolean o() {
        return this.f41150l;
    }

    public long p() {
        return this.f41147i;
    }

    public String q() {
        return this.f41153o;
    }

    protected File r() {
        return this.f41143e;
    }

    public String s(String str) {
        if (this.f41155q == null) {
            return null;
        }
        int i4 = 0;
        while (true) {
            Header[] headerArr = this.f41155q;
            if (i4 >= headerArr.length) {
                return null;
            }
            if (str.equalsIgnoreCase(headerArr[i4].getName())) {
                return this.f41155q[i4].getValue();
            }
            i4++;
        }
    }

    public List<Header> t() {
        Header[] headerArr = this.f41155q;
        return headerArr == null ? Collections.emptyList() : Arrays.asList(headerArr);
    }

    protected boolean u() {
        return this.f41151m;
    }

    public String v() {
        return this.f41140b;
    }

    protected boolean w() {
        return this.f41152n;
    }

    public String x() {
        return this.f41141c;
    }

    public boolean y() {
        return this.f41145g;
    }

    public int z() {
        return this.f41148j;
    }

    public c(int i4, String str) {
        this.f41139a = 200;
        this.f41140b = ProtectedSandApp.s("ݱ");
        this.f41144f = new Date();
        this.f41148j = 1;
        this.f41149k = System.currentTimeMillis();
        this.f41139a = i4;
        this.f41140b = str;
    }
}

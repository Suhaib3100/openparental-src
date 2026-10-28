package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.q0;
import com.android.volley.e;
import com.android.volley.q;
import com.android.volley.t;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: Request.java */
/* loaded from: classes3.dex */
public abstract class n<T> implements Comparable<n<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = ProtectedSandApp.s("ڜ");

    @q0
    private e.a mCacheEntry;

    @b0("mLock")
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;

    @q0
    @b0("mLock")
    private q.a mErrorListener;
    private final t.a mEventLog;
    private final Object mLock;
    private final int mMethod;

    @b0("mLock")
    private c mRequestCompleteListener;
    private o mRequestQueue;

    @b0("mLock")
    private boolean mResponseDelivered;
    private s mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    /* compiled from: Request.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f40906c;

        a(String str, long j4) {
            this.f40905b = str;
            this.f40906c = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.mEventLog.a(this.f40905b, this.f40906c);
            n.this.mEventLog.b(n.this.toString());
        }
    }

    /* compiled from: Request.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f40908a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f40909b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f40910c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f40911d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f40912e = 3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f40913f = 4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f40914g = 5;

        /* renamed from: h, reason: collision with root package name */
        public static final int f40915h = 6;

        /* renamed from: i, reason: collision with root package name */
        public static final int f40916i = 7;
    }

    /* compiled from: Request.java */
    interface c {
        void a(n<?> nVar, q<?> qVar);

        void b(n<?> nVar);
    }

    /* compiled from: Request.java */
    public enum d {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public n(String str, q.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ڙ"), entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append(m0.amp);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ښ"), str), e4);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (t.a.f40945c) {
            this.mEventLog.a(str, Thread.currentThread().getId());
        }
    }

    @androidx.annotation.i
    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(VolleyError volleyError) {
        q.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    protected abstract void deliverResponse(T t4);

    void finish(String str) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            oVar.g(this);
        }
        if (t.a.f40945c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.mEventLog.a(str, id2);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return ProtectedSandApp.s("ڛ") + getParamsEncoding();
    }

    @q0
    public e.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    @q0
    public q.a getErrorListener() {
        q.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    @q0
    protected Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    protected String getParamsEncoding() {
        return ProtectedSandApp.s("ڜ");
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @q0
    @Deprecated
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public d getPriority() {
        return d.NORMAL;
    }

    public s getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(ProtectedSandApp.s("ڝ"));
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z4;
        synchronized (this.mLock) {
            z4 = this.mResponseDelivered;
        }
        return z4;
    }

    public boolean isCanceled() {
        boolean z4;
        synchronized (this.mLock) {
            z4 = this.mCanceled;
        }
        return z4;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    void notifyListenerResponseNotUsable() {
        c cVar;
        synchronized (this.mLock) {
            cVar = this.mRequestCompleteListener;
        }
        if (cVar != null) {
            cVar.b(this);
        }
    }

    void notifyListenerResponseReceived(q<?> qVar) {
        c cVar;
        synchronized (this.mLock) {
            cVar = this.mRequestCompleteListener;
        }
        if (cVar != null) {
            cVar.a(this, qVar);
        }
    }

    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    protected abstract q<T> parseNetworkResponse(l lVar);

    void sendEvent(int i4) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            oVar.m(this, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> setCacheEntry(e.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    void setNetworkRequestCompleteListener(c cVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = cVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> setRequestQueue(o oVar) {
        this.mRequestQueue = oVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> setRetryPolicy(s sVar) {
        this.mRetryPolicy = sVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> setSequence(int i4) {
        this.mSequence = Integer.valueOf(i4);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> setShouldCache(boolean z4) {
        this.mShouldCache = z4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> setShouldRetryConnectionErrors(boolean z4) {
        this.mShouldRetryConnectionErrors = z4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> setShouldRetryServerErrors(boolean z4) {
        this.mShouldRetryServerErrors = z4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = ProtectedSandApp.s("ڞ") + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? ProtectedSandApp.s("ڟ") : ProtectedSandApp.s("ڠ"));
        sb.append(getUrl());
        String s4 = ProtectedSandApp.s("ڡ");
        sb.append(s4);
        sb.append(str);
        sb.append(s4);
        sb.append(getPriority());
        sb.append(s4);
        sb.append(this.mSequence);
        return sb.toString();
    }

    public n(int i4, String str, @q0 q.a aVar) {
        this.mEventLog = t.a.f40945c ? new t.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i4;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new g());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(n<T> nVar) {
        d priority = getPriority();
        d priority2 = nVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - nVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}

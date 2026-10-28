package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f44298c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f44299d;

    /* compiled from: LazyHeaders.java */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f44300d = ProtectedSandApp.s("०");

        /* renamed from: e, reason: collision with root package name */
        private static final String f44301e;

        /* renamed from: f, reason: collision with root package name */
        private static final Map<String, List<j>> f44302f;

        /* renamed from: a, reason: collision with root package name */
        private boolean f44303a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f44304b = f44302f;

        /* renamed from: c, reason: collision with root package name */
        private boolean f44305c = true;

        static {
            String g4 = g();
            f44301e = g4;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g4)) {
                hashMap.put(ProtectedSandApp.s("०"), Collections.singletonList(new b(g4)));
            }
            f44302f = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<j>> d() {
            HashMap hashMap = new HashMap(this.f44304b.size());
            for (Map.Entry<String, List<j>> entry : this.f44304b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f44303a) {
                this.f44303a = false;
                this.f44304b = d();
            }
        }

        private List<j> f(String str) {
            List<j> list = this.f44304b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f44304b.put(str, arrayList);
            return arrayList;
        }

        @m1
        static String g() {
            String property = System.getProperty(ProtectedSandApp.s("१"));
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = property.charAt(i4);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(@o0 String str, @o0 j jVar) {
            if (this.f44305c && ProtectedSandApp.s("०").equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(@o0 String str, @o0 String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f44303a = true;
            return new k(this.f44304b);
        }

        public a h(@o0 String str, @q0 j jVar) {
            e();
            if (jVar == null) {
                this.f44304b.remove(str);
            } else {
                List<j> f4 = f(str);
                f4.clear();
                f4.add(jVar);
            }
            if (this.f44305c && ProtectedSandApp.s("०").equalsIgnoreCase(str)) {
                this.f44305c = false;
            }
            return this;
        }

        public a i(@o0 String str, @q0 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    /* compiled from: LazyHeaders.java */
    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final String f44306a;

        b(@o0 String str) {
            this.f44306a = str;
        }

        @Override // com.bumptech.glide.load.model.j
        public String a() {
            return this.f44306a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f44306a.equals(((b) obj).f44306a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44306a.hashCode();
        }

        public String toString() {
            return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("२")), this.f44306a, ProtectedSandApp.s("३"));
        }
    }

    k(Map<String, List<j>> map) {
        this.f44298c = Collections.unmodifiableMap(map);
    }

    @o0
    private String b(@o0 List<j> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String a5 = list.get(i4).a();
            if (!TextUtils.isEmpty(a5)) {
                sb.append(a5);
                if (i4 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f44298c.entrySet()) {
            String b5 = b(entry.getValue());
            if (!TextUtils.isEmpty(b5)) {
                hashMap.put(entry.getKey(), b5);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.model.i
    public Map<String, String> a() {
        if (this.f44299d == null) {
            synchronized (this) {
                try {
                    if (this.f44299d == null) {
                        this.f44299d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f44299d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f44298c.equals(((k) obj).f44298c);
        }
        return false;
    }

    public int hashCode() {
        return this.f44298c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("४") + this.f44298c + '}';
    }
}

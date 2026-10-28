package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<i>> f11548c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f11549d;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f11550d = ProtectedSandApp.s("ŧ");

        /* renamed from: e, reason: collision with root package name */
        private static final String f11551e;

        /* renamed from: f, reason: collision with root package name */
        private static final Map<String, List<i>> f11552f;

        /* renamed from: a, reason: collision with root package name */
        private boolean f11553a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<i>> f11554b = f11552f;

        /* renamed from: c, reason: collision with root package name */
        private boolean f11555c = true;

        static {
            String g5 = g();
            f11551e = g5;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g5)) {
                hashMap.put(ProtectedSandApp.s("Ũ"), Collections.singletonList(new b(g5)));
            }
            f11552f = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<i>> d() {
            HashMap hashMap = new HashMap(this.f11554b.size());
            for (Map.Entry<String, List<i>> entry : this.f11554b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f11553a) {
                this.f11553a = false;
                this.f11554b = d();
            }
        }

        private List<i> f(String str) {
            List<i> list = this.f11554b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f11554b.put(str, arrayList);
            return arrayList;
        }

        @m1
        static String g() {
            String property = System.getProperty(ProtectedSandApp.s("ũ"));
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = property.charAt(i5);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(@o0 String str, @o0 i iVar) {
            if (this.f11555c && ProtectedSandApp.s("Ū").equalsIgnoreCase(str)) {
                return h(str, iVar);
            }
            e();
            f(str).add(iVar);
            return this;
        }

        public a b(@o0 String str, @o0 String str2) {
            return a(str, new b(str2));
        }

        public j c() {
            this.f11553a = true;
            return new j(this.f11554b);
        }

        public a h(@o0 String str, @q0 i iVar) {
            e();
            if (iVar == null) {
                this.f11554b.remove(str);
            } else {
                List<i> f6 = f(str);
                f6.clear();
                f6.add(iVar);
            }
            if (this.f11555c && ProtectedSandApp.s("ū").equalsIgnoreCase(str)) {
                this.f11555c = false;
            }
            return this;
        }

        public a i(@o0 String str, @q0 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    /* compiled from: LazyHeaders.java */
    static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final String f11556a;

        b(@o0 String str) {
            this.f11556a = str;
        }

        @Override // com.bumptech.glide.load.model.i
        public String a() {
            return this.f11556a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f11556a.equals(((b) obj).f11556a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11556a.hashCode();
        }

        public String toString() {
            return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("ᴯ")), this.f11556a, ProtectedSandApp.s("ᴰ"));
        }
    }

    j(Map<String, List<i>> map) {
        this.f11548c = Collections.unmodifiableMap(map);
    }

    @o0
    private String b(@o0 List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            String a6 = list.get(i5).a();
            if (!TextUtils.isEmpty(a6)) {
                sb.append(a6);
                if (i5 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f11548c.entrySet()) {
            String b6 = b(entry.getValue());
            if (!TextUtils.isEmpty(b6)) {
                hashMap.put(entry.getKey(), b6);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.model.h
    public Map<String, String> a() {
        if (this.f11549d == null) {
            synchronized (this) {
                if (this.f11549d == null) {
                    this.f11549d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f11549d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f11548c.equals(((j) obj).f11548c);
        }
        return false;
    }

    public int hashCode() {
        return this.f11548c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ᴱ") + this.f11548c + '}';
    }
}

package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.a;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes5.dex */
final class c extends com.google.android.datatransport.cct.internal.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f51853a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51854b;

    /* renamed from: c, reason: collision with root package name */
    private final String f51855c;

    /* renamed from: d, reason: collision with root package name */
    private final String f51856d;

    /* renamed from: e, reason: collision with root package name */
    private final String f51857e;

    /* renamed from: f, reason: collision with root package name */
    private final String f51858f;

    /* renamed from: g, reason: collision with root package name */
    private final String f51859g;

    /* renamed from: h, reason: collision with root package name */
    private final String f51860h;

    /* renamed from: i, reason: collision with root package name */
    private final String f51861i;

    /* renamed from: j, reason: collision with root package name */
    private final String f51862j;

    /* renamed from: k, reason: collision with root package name */
    private final String f51863k;

    /* renamed from: l, reason: collision with root package name */
    private final String f51864l;

    /* compiled from: AutoValue_AndroidClientInfo.java */
    static final class b extends a.AbstractC0785a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f51865a;

        /* renamed from: b, reason: collision with root package name */
        private String f51866b;

        /* renamed from: c, reason: collision with root package name */
        private String f51867c;

        /* renamed from: d, reason: collision with root package name */
        private String f51868d;

        /* renamed from: e, reason: collision with root package name */
        private String f51869e;

        /* renamed from: f, reason: collision with root package name */
        private String f51870f;

        /* renamed from: g, reason: collision with root package name */
        private String f51871g;

        /* renamed from: h, reason: collision with root package name */
        private String f51872h;

        /* renamed from: i, reason: collision with root package name */
        private String f51873i;

        /* renamed from: j, reason: collision with root package name */
        private String f51874j;

        /* renamed from: k, reason: collision with root package name */
        private String f51875k;

        /* renamed from: l, reason: collision with root package name */
        private String f51876l;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public com.google.android.datatransport.cct.internal.a a() {
            return new c(this.f51865a, this.f51866b, this.f51867c, this.f51868d, this.f51869e, this.f51870f, this.f51871g, this.f51872h, this.f51873i, this.f51874j, this.f51875k, this.f51876l);
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a b(@q0 String str) {
            this.f51876l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a c(@q0 String str) {
            this.f51874j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a d(@q0 String str) {
            this.f51868d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a e(@q0 String str) {
            this.f51872h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a f(@q0 String str) {
            this.f51867c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a g(@q0 String str) {
            this.f51873i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a h(@q0 String str) {
            this.f51871g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a i(@q0 String str) {
            this.f51875k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a j(@q0 String str) {
            this.f51866b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a k(@q0 String str) {
            this.f51870f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a l(@q0 String str) {
            this.f51869e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0785a
        public a.AbstractC0785a m(@q0 Integer num) {
            this.f51865a = num;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String b() {
        return this.f51864l;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String c() {
        return this.f51862j;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String d() {
        return this.f51856d;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String e() {
        return this.f51860h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.a)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.a aVar = (com.google.android.datatransport.cct.internal.a) obj;
        Integer num = this.f51853a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f51854b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f51855c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f51856d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f51857e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f51858f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f51859g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f51860h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f51861i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f51862j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f51863k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f51864l;
                                                    if (str11 == null) {
                                                        if (aVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String f() {
        return this.f51855c;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String g() {
        return this.f51861i;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String h() {
        return this.f51859g;
    }

    public int hashCode() {
        Integer num = this.f51853a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f51854b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f51855c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f51856d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f51857e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f51858f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f51859g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f51860h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f51861i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f51862j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f51863k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f51864l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String i() {
        return this.f51863k;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String j() {
        return this.f51854b;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String k() {
        return this.f51858f;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public String l() {
        return this.f51857e;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @q0
    public Integer m() {
        return this.f51853a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("씔"));
        sb.append(this.f51853a);
        sb.append(ProtectedSandApp.s("씕"));
        sb.append(this.f51854b);
        sb.append(ProtectedSandApp.s("씖"));
        sb.append(this.f51855c);
        sb.append(ProtectedSandApp.s("씗"));
        sb.append(this.f51856d);
        sb.append(ProtectedSandApp.s("씘"));
        sb.append(this.f51857e);
        sb.append(ProtectedSandApp.s("씙"));
        sb.append(this.f51858f);
        sb.append(ProtectedSandApp.s("씚"));
        sb.append(this.f51859g);
        sb.append(ProtectedSandApp.s("씛"));
        sb.append(this.f51860h);
        sb.append(ProtectedSandApp.s("씜"));
        sb.append(this.f51861i);
        sb.append(ProtectedSandApp.s("씝"));
        sb.append(this.f51862j);
        sb.append(ProtectedSandApp.s("씞"));
        sb.append(this.f51863k);
        sb.append(ProtectedSandApp.s("씟"));
        return android.support.v4.media.c.a(sb, this.f51864l, ProtectedSandApp.s("씠"));
    }

    private c(@q0 Integer num, @q0 String str, @q0 String str2, @q0 String str3, @q0 String str4, @q0 String str5, @q0 String str6, @q0 String str7, @q0 String str8, @q0 String str9, @q0 String str10, @q0 String str11) {
        this.f51853a = num;
        this.f51854b = str;
        this.f51855c = str2;
        this.f51856d = str3;
        this.f51857e = str4;
        this.f51858f = str5;
        this.f51859g = str6;
        this.f51860h = str7;
        this.f51861i = str8;
        this.f51862j = str9;
        this.f51863k = str10;
        this.f51864l = str11;
    }
}

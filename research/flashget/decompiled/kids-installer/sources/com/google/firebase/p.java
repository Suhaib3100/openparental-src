package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    private static final String f17673h = ProtectedSandApp.s("\u18ff");

    /* renamed from: i, reason: collision with root package name */
    private static final String f17674i = ProtectedSandApp.s("ᤀ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f17675j = ProtectedSandApp.s("ᤁ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f17676k = ProtectedSandApp.s("ᤂ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f17677l = ProtectedSandApp.s("ᤃ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f17678m = ProtectedSandApp.s("ᤄ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f17679n = ProtectedSandApp.s("ᤅ");

    /* renamed from: a, reason: collision with root package name */
    private final String f17680a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17681b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17682c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17683d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17684e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17685f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17686g;

    /* compiled from: FirebaseOptions.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f17687a;

        /* renamed from: b, reason: collision with root package name */
        private String f17688b;

        /* renamed from: c, reason: collision with root package name */
        private String f17689c;

        /* renamed from: d, reason: collision with root package name */
        private String f17690d;

        /* renamed from: e, reason: collision with root package name */
        private String f17691e;

        /* renamed from: f, reason: collision with root package name */
        private String f17692f;

        /* renamed from: g, reason: collision with root package name */
        private String f17693g;

        public b() {
        }

        @o0
        public p a() {
            return new p(this.f17688b, this.f17687a, this.f17689c, this.f17690d, this.f17691e, this.f17692f, this.f17693g);
        }

        @o0
        public b b(@o0 String str) {
            this.f17687a = Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ᣯ"));
            return this;
        }

        @o0
        public b c(@o0 String str) {
            this.f17688b = Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ᣰ"));
            return this;
        }

        @o0
        public b d(@q0 String str) {
            this.f17689c = str;
            return this;
        }

        @o0
        @KeepForSdk
        public b e(@q0 String str) {
            this.f17690d = str;
            return this;
        }

        @o0
        public b f(@q0 String str) {
            this.f17691e = str;
            return this;
        }

        @o0
        public b g(@q0 String str) {
            this.f17693g = str;
            return this;
        }

        @o0
        public b h(@q0 String str) {
            this.f17692f = str;
            return this;
        }

        public b(@o0 p pVar) {
            this.f17688b = pVar.f17681b;
            this.f17687a = pVar.f17680a;
            this.f17689c = pVar.f17682c;
            this.f17690d = pVar.f17683d;
            this.f17691e = pVar.f17684e;
            this.f17692f = pVar.f17685f;
            this.f17693g = pVar.f17686g;
        }
    }

    @q0
    public static p h(@o0 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(ProtectedSandApp.s("ᣲ"));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new p(string, stringResourceValueReader.getString(ProtectedSandApp.s("ᣳ")), stringResourceValueReader.getString(ProtectedSandApp.s("ᣴ")), stringResourceValueReader.getString(ProtectedSandApp.s("ᣵ")), stringResourceValueReader.getString(ProtectedSandApp.s("\u18f6")), stringResourceValueReader.getString(ProtectedSandApp.s("\u18f7")), stringResourceValueReader.getString(ProtectedSandApp.s("\u18f8")));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equal(this.f17681b, pVar.f17681b) && Objects.equal(this.f17680a, pVar.f17680a) && Objects.equal(this.f17682c, pVar.f17682c) && Objects.equal(this.f17683d, pVar.f17683d) && Objects.equal(this.f17684e, pVar.f17684e) && Objects.equal(this.f17685f, pVar.f17685f) && Objects.equal(this.f17686g, pVar.f17686g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f17681b, this.f17680a, this.f17682c, this.f17683d, this.f17684e, this.f17685f, this.f17686g);
    }

    @o0
    public String i() {
        return this.f17680a;
    }

    @o0
    public String j() {
        return this.f17681b;
    }

    @q0
    public String k() {
        return this.f17682c;
    }

    @q0
    @KeepForSdk
    public String l() {
        return this.f17683d;
    }

    @q0
    public String m() {
        return this.f17684e;
    }

    @q0
    public String n() {
        return this.f17686g;
    }

    @q0
    public String o() {
        return this.f17685f;
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\u18f9"), this.f17681b).add(ProtectedSandApp.s("\u18fa"), this.f17680a).add(ProtectedSandApp.s("\u18fb"), this.f17682c).add(ProtectedSandApp.s("\u18fc"), this.f17684e).add(ProtectedSandApp.s("\u18fd"), this.f17685f).add(ProtectedSandApp.s("\u18fe"), this.f17686g).toString();
    }

    private p(@o0 String str, @o0 String str2, @q0 String str3, @q0 String str4, @q0 String str5, @q0 String str6, @q0 String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), ProtectedSandApp.s("ᣱ"));
        this.f17681b = str;
        this.f17680a = str2;
        this.f17682c = str3;
        this.f17683d = str4;
        this.f17684e = str5;
        this.f17685f = str6;
        this.f17686g = str7;
    }
}

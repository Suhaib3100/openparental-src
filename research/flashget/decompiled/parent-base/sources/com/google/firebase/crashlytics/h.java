package com.google.firebase.crashlytics;

import androidx.annotation.o0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CustomKeysAndValues.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, String> f58597a;

    /* compiled from: CustomKeysAndValues.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, String> f58598a = new HashMap();

        @o0
        public h b() {
            return new h(this);
        }

        @o0
        public a c(@o0 String str, boolean z4) {
            this.f58598a.put(str, Boolean.toString(z4));
            return this;
        }

        @o0
        public a d(@o0 String str, double d5) {
            this.f58598a.put(str, Double.toString(d5));
            return this;
        }

        @o0
        public a e(@o0 String str, float f4) {
            this.f58598a.put(str, Float.toString(f4));
            return this;
        }

        @o0
        public a f(@o0 String str, int i4) {
            this.f58598a.put(str, Integer.toString(i4));
            return this;
        }

        @o0
        public a g(@o0 String str, long j4) {
            this.f58598a.put(str, Long.toString(j4));
            return this;
        }

        @o0
        public a h(@o0 String str, @o0 String str2) {
            this.f58598a.put(str, str2);
            return this;
        }
    }

    h(@o0 a aVar) {
        this.f58597a = aVar.f58598a;
    }
}

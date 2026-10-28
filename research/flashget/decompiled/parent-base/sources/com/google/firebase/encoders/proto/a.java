package com.google.firebase.encoders.proto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.encoders.proto.d;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f59630a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f59631b = d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    private static final class C0919a implements d {
        private final int A3;
        private final d.a B3;

        C0919a(int i4, d.a aVar) {
            this.A3 = i4;
            this.B3 = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.A3 == dVar.tag() && this.B3.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.A3) + (this.B3.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.d
        public d.a intEncoding() {
            return this.B3;
        }

        @Override // com.google.firebase.encoders.proto.d
        public int tag() {
            return this.A3;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return ProtectedSandApp.s("O\u0001") + this.A3 + ProtectedSandApp.s("P\u0001") + this.B3 + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0919a(this.f59630a, this.f59631b);
    }

    public a c(d.a aVar) {
        this.f59631b = aVar;
        return this;
    }

    public a d(int i4) {
        this.f59630a = i4;
        return this;
    }
}

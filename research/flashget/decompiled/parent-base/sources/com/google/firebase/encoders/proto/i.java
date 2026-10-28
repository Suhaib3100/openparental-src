package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes6.dex */
class i implements com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f59650a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59651b = false;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.c f59652c;

    /* renamed from: d, reason: collision with root package name */
    private final f f59653d;

    i(f fVar) {
        this.f59653d = fVar;
    }

    private void b() {
        if (this.f59650a) {
            throw new EncodingException(ProtectedSandApp.s("[\u0001"));
        }
        this.f59650a = true;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g a(long j4) throws IOException {
        b();
        this.f59653d.v(this.f59652c, j4, this.f59651b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g add(int i4) throws IOException {
        b();
        this.f59653d.t(this.f59652c, i4, this.f59651b);
        return this;
    }

    void c(com.google.firebase.encoders.c cVar, boolean z4) {
        this.f59650a = false;
        this.f59652c = cVar;
        this.f59651b = z4;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g l(@q0 String str) throws IOException {
        b();
        this.f59653d.q(this.f59652c, str, this.f59651b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g o(boolean z4) throws IOException {
        b();
        this.f59653d.t(this.f59652c, z4 ? 1 : 0, this.f59651b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g q(double d5) throws IOException {
        b();
        this.f59653d.l(this.f59652c, d5, this.f59651b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g r(float f4) throws IOException {
        b();
        this.f59653d.o(this.f59652c, f4, this.f59651b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g u(@o0 byte[] bArr) throws IOException {
        b();
        this.f59653d.q(this.f59652c, bArr, this.f59651b);
        return this;
    }
}

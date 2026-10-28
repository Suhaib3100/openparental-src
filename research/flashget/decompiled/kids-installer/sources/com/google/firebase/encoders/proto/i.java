package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes3.dex */
class i implements com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16629a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16630b = false;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.c f16631c;

    /* renamed from: d, reason: collision with root package name */
    private final f f16632d;

    i(f fVar) {
        this.f16632d = fVar;
    }

    private void a() {
        if (this.f16629a) {
            throw new EncodingException(ProtectedSandApp.s("⪀"));
        }
        this.f16629a = true;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g add(double d6) throws IOException {
        a();
        this.f16632d.m(this.f16631c, d6, this.f16630b);
        return this;
    }

    void b(com.google.firebase.encoders.c cVar, boolean z5) {
        this.f16629a = false;
        this.f16631c = cVar;
        this.f16630b = z5;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g d(@o0 byte[] bArr) throws IOException {
        a();
        this.f16632d.p(this.f16631c, bArr, this.f16630b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g m(@q0 String str) throws IOException {
        a();
        this.f16632d.p(this.f16631c, str, this.f16630b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g n(boolean z5) throws IOException {
        a();
        this.f16632d.t(this.f16631c, z5 ? 1 : 0, this.f16630b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g p(float f6) throws IOException {
        a();
        this.f16632d.n(this.f16631c, f6, this.f16630b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g add(int i5) throws IOException {
        a();
        this.f16632d.t(this.f16631c, i5, this.f16630b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    public com.google.firebase.encoders.g add(long j5) throws IOException {
        a();
        this.f16632d.v(this.f16631c, j5, this.f16630b);
        return this;
    }
}

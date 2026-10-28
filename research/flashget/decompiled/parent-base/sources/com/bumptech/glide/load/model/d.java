package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes3.dex */
public class d implements o<File, ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44262a = ProtectedSandApp.s("ग़");

    /* compiled from: ByteBufferFileLoader.java */
    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: b, reason: collision with root package name */
        private final File f44263b;

        a(File file) {
            this.f44263b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.bumptech.glide.util.a.a(this.f44263b));
            } catch (IOException e4) {
                Log.isLoggable(ProtectedSandApp.s("ख़"), 3);
                aVar.c(e4);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements p<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<File, ByteBuffer> e(@o0 s sVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> b(@o0 File file, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(file), new a(file));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 File file) {
        return true;
    }
}

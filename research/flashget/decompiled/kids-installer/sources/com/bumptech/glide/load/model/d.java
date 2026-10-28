package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes3.dex */
public class d implements n<File, ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11522a = ProtectedSandApp.s("ᴢ");

    /* compiled from: ByteBufferFileLoader.java */
    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: o, reason: collision with root package name */
        private final File f11523o;

        a(File file) {
            this.f11523o = file;
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
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.bumptech.glide.util.a.a(this.f11523o));
            } catch (IOException e6) {
                Log.isLoggable(ProtectedSandApp.s("ᴡ"), 3);
                aVar.c(e6);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<File, ByteBuffer> c(@o0 r rVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<ByteBuffer> b(@o0 File file, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(file), new a(file));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 File file) {
        return true;
    }
}

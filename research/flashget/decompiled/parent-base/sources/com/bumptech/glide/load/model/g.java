package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: FileLoader.java */
/* loaded from: classes3.dex */
public class g<Data> implements o<File, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44282b = ProtectedSandApp.s("ॣ");

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f44283a;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f44284a;

        public a(d<Data> dVar) {
            this.f44284a = dVar;
        }

        @Override // com.bumptech.glide.load.model.p
        public final void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public final o<File, Data> e(@o0 s sVar) {
            return new g(this.f44284a);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, ClientDefaults.MAX_MSG_SIZE);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        private final File f44285b;

        /* renamed from: c, reason: collision with root package name */
        private final d<Data> f44286c;

        /* renamed from: d, reason: collision with root package name */
        private Data f44287d;

        c(File file, d<Data> dVar) {
            this.f44285b = file;
            this.f44286c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f44286c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f44287d;
            if (data != null) {
                try {
                    this.f44286c.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super Data> aVar) {
            try {
                Data c5 = this.f44286c.c(this.f44285b);
                this.f44287d = c5;
                aVar.f(c5);
            } catch (FileNotFoundException e4) {
                Log.isLoggable(ProtectedSandApp.s("ॢ"), 3);
                aVar.c(e4);
            }
        }
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f44283a = dVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 File file, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(file), new c(file, this.f44283a));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 File file) {
        return true;
    }
}

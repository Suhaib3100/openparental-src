package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes3.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f11634b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProtectedSandApp.s("ᵇ"), ProtectedSandApp.s("ᵅ"), ProtectedSandApp.s("ᵆ"))));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f11635a;

    /* compiled from: UriLoader.java */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f11636a;

        public a(ContentResolver contentResolver) {
            this.f11636a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f11636a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f11637a;

        public b(ContentResolver contentResolver) {
            this.f11637a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f11637a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f11638a;

        public d(ContentResolver contentResolver) {
            this.f11638a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f11638a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, InputStream> c(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f11635a = cVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), this.f11635a.b(uri));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return f11634b.contains(uri.getScheme());
    }
}

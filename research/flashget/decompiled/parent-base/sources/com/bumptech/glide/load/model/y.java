package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes3.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f44390b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProtectedSandApp.s("ং"), ProtectedSandApp.s("ঀ"), ProtectedSandApp.s("ঁ"))));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f44391a;

    /* compiled from: UriLoader.java */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f44392a;

        public a(ContentResolver contentResolver) {
            this.f44392a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f44392a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<Uri, AssetFileDescriptor> e(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f44393a;

        public b(ContentResolver contentResolver) {
            this.f44393a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f44393a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, ParcelFileDescriptor> e(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f44394a;

        public d(ContentResolver contentResolver) {
            this.f44394a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f44394a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f44391a = cVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), this.f44391a.a(uri));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return f44390b.contains(uri.getScheme());
    }
}

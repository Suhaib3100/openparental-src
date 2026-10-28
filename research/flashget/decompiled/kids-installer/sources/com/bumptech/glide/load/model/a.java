package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes3.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11509c = ProtectedSandApp.s("ᴛ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f11510d = ProtectedSandApp.s("ᴜ");

    /* renamed from: e, reason: collision with root package name */
    private static final int f11511e = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f11512a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0146a<Data> f11513b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0146a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0146a<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f11514a;

        public b(AssetManager assetManager) {
            this.f11514a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0146a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new a(this.f11514a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements o<Uri, InputStream>, InterfaceC0146a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f11515a;

        public c(AssetManager assetManager) {
            this.f11515a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0146a
        public com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, InputStream> c(r rVar) {
            return new a(this.f11515a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0146a<Data> interfaceC0146a) {
        this.f11512a = assetManager;
        this.f11513b = interfaceC0146a;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), this.f11513b.b(this.f11512a, uri.toString().substring(f11511e)));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        if (!ProtectedSandApp.s("ᴝ").equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return ProtectedSandApp.s("ᴞ").equals(uri.getPathSegments().get(0));
    }
}

package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes3.dex */
public class a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44249c = ProtectedSandApp.s("ॕ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f44250d = ProtectedSandApp.s("ॖ");

    /* renamed from: e, reason: collision with root package name */
    private static final int f44251e = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f44252a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0745a<Data> f44253b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC0745a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0745a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f44254a;

        public b(AssetManager assetManager) {
            this.f44254a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0745a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, AssetFileDescriptor> e(s sVar) {
            return new a(this.f44254a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements p<Uri, InputStream>, InterfaceC0745a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f44255a;

        public c(AssetManager assetManager) {
            this.f44255a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0745a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(s sVar) {
            return new a(this.f44255a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0745a<Data> interfaceC0745a) {
        this.f44252a = assetManager;
        this.f44253b = interfaceC0745a;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), this.f44253b.a(this.f44252a, uri.toString().substring(f44251e)));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        if (!ProtectedSandApp.s("ॗ").equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return ProtectedSandApp.s("ॕ").equals(uri.getPathSegments().get(0));
    }
}

package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes3.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44371c = ProtectedSandApp.s("ॼ");

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f44372a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f44373b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f44374a;

        public a(Resources resources) {
            this.f44374a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<Integer, AssetFileDescriptor> e(s sVar) {
            return new t(this.f44374a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    @Deprecated
    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f44375a;

        public b(Resources resources) {
            this.f44375a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, ParcelFileDescriptor> e(s sVar) {
            return new t(this.f44375a, sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f44376a;

        public c(Resources resources) {
            this.f44376a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, InputStream> e(s sVar) {
            return new t(this.f44376a, sVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class d implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f44377a;

        public d(Resources resources) {
            this.f44377a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, Uri> e(s sVar) {
            return new t(this.f44377a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f44373b = resources;
        this.f44372a = oVar;
    }

    @q0
    private Uri d(Integer num) {
        try {
            return Uri.parse(ProtectedSandApp.s("ॻ") + this.f44373b.getResourcePackageName(num.intValue()) + '/' + this.f44373b.getResourceTypeName(num.intValue()) + '/' + this.f44373b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("ॼ"), 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 Integer num, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        Uri d5 = d(num);
        if (d5 == null) {
            return null;
        }
        return this.f44372a.b(d5, i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Integer num) {
        return true;
    }
}

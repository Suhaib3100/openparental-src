package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes3.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11594c = ProtectedSandApp.s("ᴹ");

    /* renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f11595a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f11596b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f11597a;

        public a(Resources resources) {
            this.f11597a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<Integer, AssetFileDescriptor> c(r rVar) {
            return new s(this.f11597a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f11598a;

        public b(Resources resources) {
            this.f11598a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Integer, ParcelFileDescriptor> c(r rVar) {
            return new s(this.f11598a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f11599a;

        public c(Resources resources) {
            this.f11599a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Integer, InputStream> c(r rVar) {
            return new s(this.f11599a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f11600a;

        public d(Resources resources) {
            this.f11600a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Integer, Uri> c(r rVar) {
            return new s(this.f11600a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f11596b = resources;
        this.f11595a = nVar;
    }

    @q0
    private Uri d(Integer num) {
        try {
            return Uri.parse(ProtectedSandApp.s("ᴷ") + this.f11596b.getResourcePackageName(num.intValue()) + org.apache.commons.io.n.f32060b + this.f11596b.getResourceTypeName(num.intValue()) + org.apache.commons.io.n.f32060b + this.f11596b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᴸ"), 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@o0 Integer num, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        Uri d6 = d(num);
        if (d6 == null) {
            return null;
        }
        return this.f11595a.b(d6, i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Integer num) {
        return true;
    }
}

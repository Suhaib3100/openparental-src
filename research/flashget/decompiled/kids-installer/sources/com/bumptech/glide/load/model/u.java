package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes3.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f11630a;

    /* compiled from: StringLoader.java */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<String, AssetFileDescriptor> c(@o0 r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<String, ParcelFileDescriptor> c(@o0 r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements o<String, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<String, InputStream> c(@o0 r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f11630a = nVar;
    }

    @q0
    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@o0 String str, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        Uri e6 = e(str);
        if (e6 == null || !this.f11630a.a(e6)) {
            return null;
        }
        return this.f11630a.b(e6, i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 String str) {
        return true;
    }
}

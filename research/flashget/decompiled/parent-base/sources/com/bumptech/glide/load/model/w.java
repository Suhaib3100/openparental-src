package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.o;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes3.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f44386a;

    /* compiled from: StringLoader.java */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<String, AssetFileDescriptor> e(@o0 s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<String, ParcelFileDescriptor> e(@o0 s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements p<String, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<String, InputStream> e(@o0 s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f44386a = oVar;
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

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 String str, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        Uri e4 = e(str);
        if (e4 == null || !this.f44386a.a(e4)) {
            return null;
        }
        return this.f44386a.b(e4, i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 String str) {
        return true;
    }
}

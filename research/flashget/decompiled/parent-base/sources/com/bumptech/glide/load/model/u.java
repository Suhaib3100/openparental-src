package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: ResourceUriLoader.java */
/* loaded from: classes3.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f44378c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f44379d = ProtectedSandApp.s("ॽ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f44380a;

    /* renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f44381b;

    /* compiled from: ResourceUriLoader.java */
    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44382a;

        a(Context context) {
            this.f44382a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, AssetFileDescriptor> e(@o0 s sVar) {
            return new u(this.f44382a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    private static final class b implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44383a;

        b(Context context) {
            this.f44383a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(@o0 s sVar) {
            return new u(this.f44383a, sVar.d(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f44380a = context.getApplicationContext();
        this.f44381b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @q0
    private o.a<DataT> g(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        String s4 = ProtectedSandApp.s("ॽ");
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f44381b.b(Integer.valueOf(parseInt), i4, i5, iVar);
            }
            if (Log.isLoggable(s4, 5)) {
                uri.toString();
            }
            return null;
        } catch (NumberFormatException unused) {
            if (Log.isLoggable(s4, 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    @q0
    private o.a<DataT> h(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        int identifier = this.f44380a.getResources().getIdentifier(pathSegments.get(1), str, this.f44380a.getPackageName());
        if (identifier != 0) {
            return this.f44381b.b(Integer.valueOf(identifier), i4, i5, iVar);
        }
        if (!Log.isLoggable(ProtectedSandApp.s("ॽ"), 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i4, i5, iVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i4, i5, iVar);
        }
        if (!Log.isLoggable(ProtectedSandApp.s("ॽ"), 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return ProtectedSandApp.s("ॾ").equals(uri.getScheme()) && this.f44380a.getPackageName().equals(uri.getAuthority());
    }
}

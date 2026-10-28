package com.nostra13.universalimageloader.core.decode;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import com.nostra13.universalimageloader.core.assist.d;
import com.nostra13.universalimageloader.core.assist.e;
import com.nostra13.universalimageloader.core.assist.h;

/* compiled from: ImageDecodingInfo.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f70358a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70359b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70360c;

    /* renamed from: d, reason: collision with root package name */
    private final e f70361d;

    /* renamed from: e, reason: collision with root package name */
    private final d f70362e;

    /* renamed from: f, reason: collision with root package name */
    private final h f70363f;

    /* renamed from: g, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.download.b f70364g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f70365h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f70366i;

    /* renamed from: j, reason: collision with root package name */
    private final BitmapFactory.Options f70367j;

    public c(String str, String str2, String str3, e eVar, h hVar, com.nostra13.universalimageloader.core.download.b bVar, com.nostra13.universalimageloader.core.c cVar) {
        this.f70358a = str;
        this.f70359b = str2;
        this.f70360c = str3;
        this.f70361d = eVar;
        this.f70362e = cVar.C();
        this.f70363f = hVar;
        this.f70364g = bVar;
        this.f70365h = cVar.x();
        this.f70366i = cVar.H();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.f70367j = options;
        a(cVar.u(), options);
    }

    private void a(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
        c(options, options2);
    }

    @TargetApi(10)
    private void b(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    private void c(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    public BitmapFactory.Options d() {
        return this.f70367j;
    }

    public com.nostra13.universalimageloader.core.download.b e() {
        return this.f70364g;
    }

    public Object f() {
        return this.f70365h;
    }

    public String g() {
        return this.f70358a;
    }

    public d h() {
        return this.f70362e;
    }

    public String i() {
        return this.f70359b;
    }

    public String j() {
        return this.f70360c;
    }

    public e k() {
        return this.f70361d;
    }

    public h l() {
        return this.f70363f;
    }

    public boolean m() {
        return this.f70366i;
    }
}

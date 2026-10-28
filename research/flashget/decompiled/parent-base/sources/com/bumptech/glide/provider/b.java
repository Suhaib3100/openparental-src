package com.bumptech.glide.provider;

import androidx.annotation.o0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f44761a = new ArrayList();

    public synchronized void a(@o0 ImageHeaderParser imageHeaderParser) {
        this.f44761a.add(imageHeaderParser);
    }

    @o0
    public synchronized List<ImageHeaderParser> b() {
        return this.f44761a;
    }
}

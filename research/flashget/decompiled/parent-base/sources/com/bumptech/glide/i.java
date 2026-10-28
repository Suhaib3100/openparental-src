package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.v0;
import java.io.File;
import java.net.URL;

/* compiled from: ModelTypes.java */
/* loaded from: classes3.dex */
interface i<T> {
    @androidx.annotation.j
    @Deprecated
    T b(@q0 URL url);

    @androidx.annotation.j
    @o0
    T c(@q0 Uri uri);

    @androidx.annotation.j
    @o0
    T d(@q0 byte[] bArr);

    @androidx.annotation.j
    @o0
    T e(@q0 File file);

    @androidx.annotation.j
    @o0
    T f(@q0 Drawable drawable);

    @androidx.annotation.j
    @o0
    T k(@q0 Bitmap bitmap);

    @androidx.annotation.j
    @o0
    T load(@q0 String str);

    @androidx.annotation.j
    @o0
    T n(@q0 Object obj);

    @androidx.annotation.j
    @o0
    T o(@q0 @v0 @v Integer num);
}

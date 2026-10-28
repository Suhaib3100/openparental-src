package com.google.firebase.encoders.proto;

/* compiled from: Protobuf.java */
@t9.b
/* loaded from: classes6.dex */
public @interface d {

    /* compiled from: Protobuf.java */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}

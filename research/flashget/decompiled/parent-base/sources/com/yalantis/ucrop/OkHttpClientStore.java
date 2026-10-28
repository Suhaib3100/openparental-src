package com.yalantis.ucrop;

import androidx.annotation.o0;
import okhttp3.b0;

/* loaded from: classes7.dex */
public class OkHttpClientStore {
    public static final OkHttpClientStore INSTANCE = new OkHttpClientStore();
    private b0 client;

    private OkHttpClientStore() {
    }

    @o0
    public b0 getClient() {
        if (this.client == null) {
            this.client = new b0();
        }
        return this.client;
    }

    void setClient(@o0 b0 b0Var) {
        this.client = b0Var;
    }
}

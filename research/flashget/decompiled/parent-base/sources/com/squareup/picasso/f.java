package com.squareup.picasso;

/* compiled from: Callback.java */
/* loaded from: classes6.dex */
public interface f {

    /* compiled from: Callback.java */
    public static class a implements f {
        @Override // com.squareup.picasso.f
        public void onError(Exception exc) {
        }

        @Override // com.squareup.picasso.f
        public void onSuccess() {
        }
    }

    void onError(Exception exc);

    void onSuccess();
}

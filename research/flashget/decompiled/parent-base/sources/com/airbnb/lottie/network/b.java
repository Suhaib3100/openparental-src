package com.airbnb.lottie.network;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* loaded from: classes3.dex */
public class b implements f {
    @Override // com.airbnb.lottie.network.f
    @o0
    public d a(@o0 String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("Ɛ"));
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}

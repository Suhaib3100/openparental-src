package com.airbnb.lottie.network;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final HttpURLConnection f39185b;

    public a(@o0 HttpURLConnection httpURLConnection) {
        this.f39185b = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // com.airbnb.lottie.network.d
    @q0
    public String P0() {
        return this.f39185b.getContentType();
    }

    @Override // com.airbnb.lottie.network.d
    @q0
    public String Q2() {
        String s4 = ProtectedSandApp.s("ƌ");
        try {
            if (r1()) {
                return null;
            }
            return s4 + this.f39185b.getURL() + ProtectedSandApp.s("ƍ") + this.f39185b.getResponseCode() + ProtectedSandApp.s("Ǝ") + a(this.f39185b);
        } catch (IOException e4) {
            com.airbnb.lottie.utils.f.f(ProtectedSandApp.s("Ə"), e4);
            return e4.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.d
    @o0
    public InputStream Z0() throws IOException {
        return this.f39185b.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39185b.disconnect();
    }

    @Override // com.airbnb.lottie.network.d
    public boolean r1() {
        try {
            return this.f39185b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}

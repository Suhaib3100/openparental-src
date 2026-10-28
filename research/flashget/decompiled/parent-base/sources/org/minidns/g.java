package org.minidns;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MiniDnsInitialization.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f87349a;

    /* renamed from: b, reason: collision with root package name */
    static final String f87350b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Class, java.lang.Class<org.minidns.g>] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8 */
    static {
        BufferedReader bufferedReader;
        ?? r12 = g.class;
        f87349a = Logger.getLogger(r12.getName());
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(ProtectedSandApp.a(r12.getClassLoader(), "org.minidns/version"), StandardCharsets.UTF_8));
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            f87349a.log(Level.WARNING, "IOException closing stream", (Throwable) e5);
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            r12 = readLine;
        } catch (Exception e6) {
            e = e6;
            bufferedReader2 = bufferedReader;
            f87349a.log(Level.SEVERE, "Could not determine MiniDNS version", (Throwable) e);
            r12 = "unkown";
            if (bufferedReader2 != null) {
                bufferedReader2.close();
                r12 = r12;
            }
            f87350b = r12;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e7) {
                    f87349a.log(Level.WARNING, "IOException closing stream", (Throwable) e7);
                }
            }
            throw th;
        }
        f87350b = r12;
    }
}

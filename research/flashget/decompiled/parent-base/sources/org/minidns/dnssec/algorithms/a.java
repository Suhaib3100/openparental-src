package org.minidns.dnssec.algorithms;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.constants.b;
import org.minidns.dnssec.DnssecValidatorInitializationException;
import org.minidns.dnssec.algorithms.c;
import org.minidns.record.m;

/* compiled from: AlgorithmMap.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f87254e = new a();

    /* renamed from: a, reason: collision with root package name */
    private Logger f87255a = Logger.getLogger(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Map<b.a, org.minidns.dnssec.a> f87256b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<b.EnumC1350b, org.minidns.dnssec.e> f87257c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<m.a, org.minidns.dnssec.a> f87258d;

    private a() {
        HashMap hashMap = new HashMap();
        this.f87256b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f87257c = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.f87258d = hashMap3;
        try {
            hashMap.put(b.a.SHA1, new e("SHA-1"));
            hashMap3.put(m.a.SHA1, new e("SHA-1"));
            try {
                hashMap.put(b.a.SHA256, new e("SHA-256"));
                try {
                    hashMap2.put(b.EnumC1350b.RSAMD5, new g("MD5withRSA"));
                } catch (NoSuchAlgorithmException e4) {
                    this.f87255a.log(Level.FINER, "Platform does not support RSA/MD5", (Throwable) e4);
                }
                try {
                    b bVar = new b("SHA1withDSA");
                    this.f87257c.put(b.EnumC1350b.DSA, bVar);
                    this.f87257c.put(b.EnumC1350b.DSA_NSEC3_SHA1, bVar);
                } catch (NoSuchAlgorithmException e5) {
                    this.f87255a.log(Level.FINE, "Platform does not support DSA/SHA-1", (Throwable) e5);
                }
                try {
                    g gVar = new g("SHA1withRSA");
                    this.f87257c.put(b.EnumC1350b.RSASHA1, gVar);
                    this.f87257c.put(b.EnumC1350b.RSASHA1_NSEC3_SHA1, gVar);
                    try {
                        this.f87257c.put(b.EnumC1350b.RSASHA256, new g("SHA256withRSA"));
                    } catch (NoSuchAlgorithmException e6) {
                        this.f87255a.log(Level.INFO, "Platform does not support RSA/SHA-256", (Throwable) e6);
                    }
                    try {
                        this.f87257c.put(b.EnumC1350b.RSASHA512, new g("SHA512withRSA"));
                    } catch (NoSuchAlgorithmException e7) {
                        this.f87255a.log(Level.INFO, "Platform does not support RSA/SHA-512", (Throwable) e7);
                    }
                    try {
                        this.f87257c.put(b.EnumC1350b.ECC_GOST, new d());
                    } catch (NoSuchAlgorithmException e10) {
                        this.f87255a.log(Level.FINE, "Platform does not support GOST R 34.10-2001", (Throwable) e10);
                    }
                    try {
                        this.f87257c.put(b.EnumC1350b.ECDSAP256SHA256, new c.a());
                    } catch (NoSuchAlgorithmException e11) {
                        this.f87255a.log(Level.INFO, "Platform does not support ECDSA/SHA-256", (Throwable) e11);
                    }
                    try {
                        this.f87257c.put(b.EnumC1350b.ECDSAP384SHA384, new c.b());
                    } catch (NoSuchAlgorithmException e12) {
                        this.f87255a.log(Level.INFO, "Platform does not support ECDSA/SHA-384", (Throwable) e12);
                    }
                } catch (NoSuchAlgorithmException e13) {
                    throw new DnssecValidatorInitializationException("Platform does not support RSA/SHA-1", e13);
                }
            } catch (NoSuchAlgorithmException e14) {
                throw new DnssecValidatorInitializationException("SHA-256 is mandatory", e14);
            }
        } catch (NoSuchAlgorithmException e15) {
            throw new DnssecValidatorInitializationException("SHA-1 is mandatory", e15);
        }
    }

    public org.minidns.dnssec.a a(b.a aVar) {
        return this.f87256b.get(aVar);
    }

    public org.minidns.dnssec.a b(m.a aVar) {
        return this.f87258d.get(aVar);
    }

    public org.minidns.dnssec.e c(b.EnumC1350b enumC1350b) {
        return this.f87257c.get(enumC1350b);
    }
}
